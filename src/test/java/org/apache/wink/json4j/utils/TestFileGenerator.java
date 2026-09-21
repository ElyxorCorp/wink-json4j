package org.apache.wink.json4j.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.OrderedJSONObject;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestFileGenerator {

    private enum Engine { JACKSON, NATIVE }

    // Empirically measured against this class's own countLines() (which, like most editors and
    // unlike `wc -l`, counts a final line even without a trailing newline): each record
    // contributes exactly this many lines when pretty-printed, on top of a fixed number of
    // wrapper/root-element lines, so the record count can be solved for a target line count.
    // JSON's ratio depends on which library renders it; XML always goes through this project's
    // own XML.toXml() regardless of which library built the intermediate JSON, so one XML
    // calibration covers both engines.
    private static final int JACKSON_JSON_LINES_PER_RECORD = 8;
    private static final int JACKSON_JSON_FIXED_OVERHEAD_LINES = 1;
    private static final int NATIVE_JSON_LINES_PER_RECORD = 9;
    private static final int NATIVE_JSON_FIXED_OVERHEAD_LINES = 2;
    private static final int XML_LINES_PER_RECORD = 3;
    private static final int XML_FIXED_OVERHEAD_LINES = 3;

    // Calibration for the 4-level-deep nested record shape (see createNestedRecords) - measured
    // the same way as the flat-record constants above, since nesting changes how many lines
    // each record contributes.
    private static final int JACKSON_NESTED_JSON_LINES_PER_RECORD = 15;
    private static final int JACKSON_NESTED_JSON_FIXED_OVERHEAD_LINES = 1;
    private static final int NATIVE_NESTED_JSON_LINES_PER_RECORD = 16;
    private static final int NATIVE_NESTED_JSON_FIXED_OVERHEAD_LINES = 2;
    private static final int NESTED_XML_LINES_PER_RECORD = 9;
    private static final int NESTED_XML_FIXED_OVERHEAD_LINES = 3;

    /**
     * Generates a test data file of synthetic records, in either JSON or XML format, sized to
     * be as close as possible to a requested number of lines.
     * <p>
     * Usage: {@code TestFileGenerator <json|xml> <targetNumberOfLines> [jackson|native]}
     * <ul>
     *     <li>{@code json} - writes a pretty-printed JSON array to {@code test_data.json}</li>
     *     <li>{@code xml} - writes XML to {@code test_data.xml}, with one {@code <record>}
     *     element per row</li>
     * </ul>
     * The optional third argument selects which library builds the output, defaulting to
     * {@code jackson} if omitted:
     * <ul>
     *     <li>{@code jackson} - uses com.fasterxml.jackson (ObjectMapper) to render JSON; for
     *     XML, Jackson still builds the intermediate JSON that gets handed to this project's
     *     own {@link XML#toXml(InputStream, OutputStream, boolean)}</li>
     *     <li>{@code native} - uses this project's own {@link JSONArray}/{@link OrderedJSONObject}
     *     classes to render JSON, and the same classes plus {@link XML#toXml} for XML - no
     *     third-party JSON library involved at all</li>
     * </ul>
     * The number of records is derived from the requested line count and the selected
     * format/engine's known lines-per-record ratio, then rounded to the nearest whole record -
     * so the resulting file will typically be off by at most a few lines from what was
     * requested. The actual line count written is printed after generation.
     * <p>
     * Example: {@code TestFileGenerator xml 20000 native} generates {@code test_data.xml} sized
     * as close to 20,000 lines as a whole number of records allows, built without Jackson.
     *
     * @param args command-line arguments: {@code args[0]} is the output format
     *             ({@code "json"} or {@code "xml"}), {@code args[1]} is the target number of
     *             lines the generated file should have, and the optional {@code args[2]}
     *             selects the rendering engine ({@code "jackson"} or {@code "native"};
     *             defaults to {@code "jackson"}).
     * @throws IOException if an error occurs while writing the output file.
     * @throws JSONException if an error occurs building the JSON structure (native engine only).
     */
    public static void main(String[] args) throws IOException, JSONException {
        if (args.length < 2) {
            System.err.println("Usage: TestFileGenerator <json|xml> <targetNumberOfLines> [jackson|native]");
            System.exit(1);
            return;
        }

        String format = args[0].trim().toLowerCase();
        int targetLines;
        try {
            targetLines = Integer.parseInt(args[1].trim());
        } catch (NumberFormatException nfe) {
            System.err.println("targetNumberOfLines must be an integer, got: '" + args[1] + "'");
            System.exit(1);
            return;
        }

        String engineArg = args.length >= 3 ? args[2].trim().toLowerCase() : "jackson";
        Engine engine;
        switch (engineArg) {
            case "jackson":
                engine = Engine.JACKSON;
                break;
            case "native":
                engine = Engine.NATIVE;
                break;
            default:
                System.err.println("Unknown engine '" + engineArg + "'. Expected 'jackson' or 'native'.");
                System.exit(1);
                return;
        }

        File outputFile = format.equals("json") ? new File("test_data.json") : new File("test_data.xml");
        int numberOfRecords;
        switch (format) {
            case "json":
                numberOfRecords = numberOfRecordsFor("json", engine, targetLines);
                if (engine == Engine.JACKSON) {
                    generateJsonWithJackson(createRecords(numberOfRecords), outputFile);
                } else {
                    generateJsonWithNative(createRecords(numberOfRecords), outputFile);
                }
                break;
            case "xml":
                numberOfRecords = numberOfRecordsFor("xml", engine, targetLines);
                if (engine == Engine.JACKSON) {
                    generateXmlWithJackson(createRecords(numberOfRecords), outputFile);
                } else {
                    generateXmlWithNative(createRecords(numberOfRecords), outputFile);
                }
                break;
            default:
                System.err.println("Unknown format '" + format + "'. Expected 'json' or 'xml'.");
                System.exit(1);
                return;
        }

        long actualLines = countLines(outputFile);
        System.out.println("Successfully generated '" + outputFile.getName() + "' with " + numberOfRecords
                + " records using " + engineArg + " (requested ~" + targetLines + " lines, actual " + actualLines + " lines).");
    }

    /**
     * Solves for the whole number of records that gets a pretty-printed file of the given
     * format/engine as close as possible to the requested line count. Always returns at least 1.
     */
    private static int numberOfRecordsFor(String format, Engine engine, int targetLines) {
        if (format.equals("xml")) {
            return recordsForTargetLines(targetLines, XML_LINES_PER_RECORD, XML_FIXED_OVERHEAD_LINES);
        }
        return engine == Engine.JACKSON
                ? recordsForTargetLines(targetLines, JACKSON_JSON_LINES_PER_RECORD, JACKSON_JSON_FIXED_OVERHEAD_LINES)
                : recordsForTargetLines(targetLines, NATIVE_JSON_LINES_PER_RECORD, NATIVE_JSON_FIXED_OVERHEAD_LINES);
    }

    private static int recordsForTargetLines(int targetLines, int linesPerRecord, int fixedOverheadLines) {
        int records = Math.round((targetLines - fixedOverheadLines) / (float) linesPerRecord);
        return Math.max(records, 1);
    }

    /**
     * Counts the lines in the given file the same way most text editors would - unlike
     * {@code wc -l}, a final line with no trailing newline still counts.
     */
    public static long countLines(File file) throws IOException {
        try (Stream<String> lines = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            return lines.count();
        }
    }

    /**
     * Writes {@code numberOfRecords} records, sized as close as possible to {@code targetLines},
     * as a pretty-printed JSON array to {@code outputFile} using Jackson.
     */
    public static File generateJsonWithJackson(int targetLines, File outputFile) throws IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, JACKSON_JSON_LINES_PER_RECORD, JACKSON_JSON_FIXED_OVERHEAD_LINES);
        return generateJsonWithJackson(createRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes the given records out as a pretty-printed JSON array to outputFile using Jackson.
     */
    public static File generateJsonWithJackson(List<Map<String, Object>> records, File outputFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Enables "pretty printing" formatting (indentation and newlines)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(outputFile, records);
        return outputFile;
    }

    /**
     * Writes {@code numberOfRecords} records, sized as close as possible to {@code targetLines},
     * as a pretty-printed JSON array to {@code outputFile} using this project's own JSONArray,
     * with no third-party JSON library involved.
     */
    public static File generateJsonWithNative(int targetLines, File outputFile) throws JSONException, IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, NATIVE_JSON_LINES_PER_RECORD, NATIVE_JSON_FIXED_OVERHEAD_LINES);
        return generateJsonWithNative(createRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes the given records out as a pretty-printed JSON array to outputFile using this
     * project's own JSONArray, with no third-party JSON library involved.
     */
    public static File generateJsonWithNative(List<Map<String, Object>> records, File outputFile) throws JSONException, IOException {
        JSONArray array = toJsonArray(records);
        try (OutputStream os = new FileOutputStream(outputFile)) {
            array.write(os, true);
        }
        return outputFile;
    }

    /**
     * Writes {@code numberOfRecords} records, sized as close as possible to {@code targetLines},
     * as XML to {@code outputFile}, using Jackson to build the intermediate JSON that this
     * project's own JSON-to-XML conversion (org.apache.wink.json4j.utils.XML) then converts.
     */
    public static File generateXmlWithJackson(int targetLines, File outputFile) throws IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, XML_LINES_PER_RECORD, XML_FIXED_OVERHEAD_LINES);
        return generateXmlWithJackson(createRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes the given records out as XML to outputFile, using Jackson to build the intermediate
     * JSON that this project's own JSON-to-XML conversion (org.apache.wink.json4j.utils.XML)
     * then converts.
     */
    public static File generateXmlWithJackson(List<Map<String, Object>> records, File outputFile) throws IOException {
        // XML.toXml expects a top-level JSON object, so the record array is wrapped under a
        // single "record" key - this also gives each record its own <record> element in the XML.
        Map<String, Object> wrapper = new LinkedHashMap<>();
        wrapper.put("record", records);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(wrapper);
        return writeJsonAsXml(json, outputFile);
    }

    /**
     * Writes {@code numberOfRecords} records, sized as close as possible to {@code targetLines},
     * as XML to {@code outputFile}, using this project's own JSONArray/OrderedJSONObject to
     * build the intermediate JSON and XML.toXml() to convert it - no third-party JSON library
     * involved at all.
     */
    public static File generateXmlWithNative(int targetLines, File outputFile) throws JSONException, IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, XML_LINES_PER_RECORD, XML_FIXED_OVERHEAD_LINES);
        return generateXmlWithNative(createRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes the given records out as XML to outputFile, using this project's own JSONArray/
     * OrderedJSONObject to build the intermediate JSON and XML.toXml() to convert it - no
     * third-party JSON library involved at all.
     */
    public static File generateXmlWithNative(List<Map<String, Object>> records, File outputFile) throws JSONException, IOException {
        OrderedJSONObject wrapper = new OrderedJSONObject();
        wrapper.put("record", toJsonArray(records));

        String json = wrapper.write(false);
        return writeJsonAsXml(json, outputFile);
    }

    private static File writeJsonAsXml(String json, File outputFile) throws IOException {
        try (InputStream jsonStream = new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
             OutputStream xmlStream = new FileOutputStream(outputFile)) {
            XML.toXml(jsonStream, xmlStream, true);
        }
        return outputFile;
    }

    /**
     * Converts the records into this project's own JSONArray of OrderedJSONObjects, preserving
     * each record's field insertion order.
     */
    private static JSONArray toJsonArray(List<Map<String, Object>> records) throws JSONException {
        JSONArray array = new JSONArray();
        for (Map<String, Object> record : records) {
            array.add(toJsonValue(record));
        }
        return array;
    }

    /**
     * Recursively converts a value built from Maps/Lists/scalars into the equivalent
     * OrderedJSONObject/JSONArray/scalar - JSONObject.put() only accepts null, String, Boolean,
     * Number, JSONObject and JSONArray, not raw Map or List, so nested Maps/Lists (as used by
     * createNestedRecords) must be converted at every level, not just the top one.
     */
    private static Object toJsonValue(Object value) throws JSONException {
        if (value instanceof Map) {
            OrderedJSONObject obj = new OrderedJSONObject();
            for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                obj.put(String.valueOf(entry.getKey()), toJsonValue(entry.getValue()));
            }
            return obj;
        } else if (value instanceof List) {
            JSONArray array = new JSONArray();
            for (Object element : (List<?>) value) {
                array.add(toJsonValue(element));
            }
            return array;
        }
        return value;
    }

    /**
     * Writes {@code numberOfRecords} 4-level-deep nested records, sized as close as possible to
     * {@code targetLines}, as a pretty-printed JSON array to {@code outputFile} using Jackson.
     */
    public static File generateNestedJsonWithJackson(int targetLines, File outputFile) throws IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, JACKSON_NESTED_JSON_LINES_PER_RECORD, JACKSON_NESTED_JSON_FIXED_OVERHEAD_LINES);
        return generateJsonWithJackson(createNestedRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes {@code numberOfRecords} 4-level-deep nested records, sized as close as possible to
     * {@code targetLines}, as a pretty-printed JSON array to {@code outputFile} using this
     * project's own JSONArray, with no third-party JSON library involved.
     */
    public static File generateNestedJsonWithNative(int targetLines, File outputFile) throws JSONException, IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, NATIVE_NESTED_JSON_LINES_PER_RECORD, NATIVE_NESTED_JSON_FIXED_OVERHEAD_LINES);
        return generateJsonWithNative(createNestedRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes {@code numberOfRecords} 4-level-deep nested records, sized as close as possible to
     * {@code targetLines}, as XML to {@code outputFile}, using Jackson to build the intermediate
     * JSON that this project's own JSON-to-XML conversion then converts.
     */
    public static File generateNestedXmlWithJackson(int targetLines, File outputFile) throws IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, NESTED_XML_LINES_PER_RECORD, NESTED_XML_FIXED_OVERHEAD_LINES);
        return generateXmlWithJackson(createNestedRecords(numberOfRecords), outputFile);
    }

    /**
     * Writes {@code numberOfRecords} 4-level-deep nested records, sized as close as possible to
     * {@code targetLines}, as XML to {@code outputFile}, using this project's own JSONArray/
     * OrderedJSONObject to build the intermediate JSON and XML.toXml() to convert it - no
     * third-party JSON library involved at all.
     */
    public static File generateNestedXmlWithNative(int targetLines, File outputFile) throws JSONException, IOException {
        int numberOfRecords = recordsForTargetLines(targetLines, NESTED_XML_LINES_PER_RECORD, NESTED_XML_FIXED_OVERHEAD_LINES);
        return generateXmlWithNative(createNestedRecords(numberOfRecords), outputFile);
    }

    /**
     * Returns a list of records with the passed number of records. A record is a map of
     * name/value (String, Object) pairs.
     * @param numberOfRecords how many records should be in the returned list
     * @return List of Map<String, Object> records
     */
    public static List<Map<String, Object>> createRecords(int numberOfRecords) {
        List<Map<String, Object>> records = new ArrayList<>();

        for (int i = 1; i <= numberOfRecords; i++) {
            Map<String, Object> record = new LinkedHashMap<>();
            record.put("id", i);
            record.put("uid", "user-id-" + i);
            record.put("name", "Test Subject " + i);
            record.put("email", "subject_" + i + "@testing.org");
            record.put("isActive", i % 2 == 0);
            record.put("score", 90.5);
            record.put("category", "performance");

            records.add(record);
        }
        return records;
    }

    /**
     * Returns a list of 4-level-deep nested records: the record itself (level 1) contains a
     * "profile" object (level 2), which contains a "stats" object (level 3), which contains a
     * "details" object (level 4, the leaf) - for exercising parsing/generation performance
     * against nested data rather than the flat records createRecords() produces.
     * @param numberOfRecords how many records should be in the returned list
     * @return List of Map<String, Object> records
     */
    public static List<Map<String, Object>> createNestedRecords(int numberOfRecords) {
        List<Map<String, Object>> records = new ArrayList<>();

        for (int i = 1; i <= numberOfRecords; i++) {
            Map<String, Object> profile = createRecord(i);

            Map<String, Object> record = new LinkedHashMap<>();
            record.put("id", i);
            record.put("uid", "user-id-" + i);
            record.put("profile", profile);

            records.add(record);
        }
        return records;
    }

    private static Map<String, Object> createRecord(int i) {
        Map<String, Object> details = new LinkedHashMap<>();
        details.put("category", "performance");
        details.put("nestedId", i);

        Map<String, Object> stats = new LinkedHashMap<>();
        stats.put("isActive", i % 2 == 0);
        stats.put("score", 90.5);
        stats.put("details", details);

        Map<String, Object> profile = new LinkedHashMap<>();
        profile.put("name", "Test Subject " + i);
        profile.put("email", "subject_" + i + "@testing.org");
        profile.put("stats", stats);
        return profile;
    }
}
