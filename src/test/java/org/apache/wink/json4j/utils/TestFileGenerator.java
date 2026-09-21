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

        File outputFile;
        int numberOfRecords;
        switch (format) {
            case "json": {
                int linesPerRecord = engine == Engine.JACKSON ? JACKSON_JSON_LINES_PER_RECORD : NATIVE_JSON_LINES_PER_RECORD;
                int fixedOverheadLines = engine == Engine.JACKSON ? JACKSON_JSON_FIXED_OVERHEAD_LINES : NATIVE_JSON_FIXED_OVERHEAD_LINES;
                numberOfRecords = recordsForTargetLines(targetLines, linesPerRecord, fixedOverheadLines);
                List<Map<String, Object>> records = createRecords(numberOfRecords);
                outputFile = engine == Engine.JACKSON ? generateJsonWithJackson(records) : generateJsonWithNative(records);
                break;
            }
            case "xml": {
                numberOfRecords = recordsForTargetLines(targetLines, XML_LINES_PER_RECORD, XML_FIXED_OVERHEAD_LINES);
                List<Map<String, Object>> records = createRecords(numberOfRecords);
                outputFile = engine == Engine.JACKSON ? generateXmlWithJackson(records) : generateXmlWithNative(records);
                break;
            }
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
     * Solves for the whole number of records that gets a pretty-printed file as close as
     * possible to the requested line count, given that format's fixed overhead and
     * per-record line cost. Always returns at least 1.
     */
    private static int recordsForTargetLines(int targetLines, int linesPerRecord, int fixedOverheadLines) {
        int records = Math.round((targetLines - fixedOverheadLines) / (float) linesPerRecord);
        return Math.max(records, 1);
    }

    private static long countLines(File file) throws IOException {
        try (Stream<String> lines = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
            return lines.count();
        }
    }

    /**
     * Writes the records out as a pretty-printed JSON array to test_data.json using Jackson.
     */
    private static File generateJsonWithJackson(List<Map<String, Object>> records) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Enables "pretty printing" formatting (indentation and newlines)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        File outputFile = new File("test_data.json");
        mapper.writeValue(outputFile, records);
        return outputFile;
    }

    /**
     * Writes the records out as a pretty-printed JSON array to test_data.json using this
     * project's own JSONArray, with no third-party JSON library involved.
     */
    private static File generateJsonWithNative(List<Map<String, Object>> records) throws JSONException, IOException {
        JSONArray array = toJsonArray(records);

        File outputFile = new File("test_data.json");
        try (OutputStream os = new FileOutputStream(outputFile)) {
            array.write(os, true);
        }
        return outputFile;
    }

    /**
     * Writes the records out as XML to test_data.xml, using Jackson to build the intermediate
     * JSON that this project's own JSON-to-XML conversion (org.apache.wink.json4j.utils.XML)
     * then converts.
     */
    private static File generateXmlWithJackson(List<Map<String, Object>> records) throws IOException {
        // XML.toXml expects a top-level JSON object, so the record array is wrapped under a
        // single "record" key - this also gives each record its own <record> element in the XML.
        Map<String, Object> wrapper = new LinkedHashMap<>();
        wrapper.put("record", records);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(wrapper);
        return writeJsonAsXml(json);
    }

    /**
     * Writes the records out as XML to test_data.xml, using this project's own JSONArray/
     * OrderedJSONObject to build the intermediate JSON and XML.toXml() to convert it - no
     * third-party JSON library involved at all.
     */
    private static File generateXmlWithNative(List<Map<String, Object>> records) throws JSONException, IOException {
        OrderedJSONObject wrapper = new OrderedJSONObject();
        wrapper.put("record", toJsonArray(records));

        String json = wrapper.write(false);
        return writeJsonAsXml(json);
    }

    private static File writeJsonAsXml(String json) throws IOException {
        File outputFile = new File("test_data.xml");
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
            OrderedJSONObject obj = new OrderedJSONObject();
            for (Map.Entry<String, Object> entry : record.entrySet()) {
                obj.put(entry.getKey(), entry.getValue());
            }
            array.add(obj);
        }
        return array;
    }

    /**
     * Returns a list of records with the passed number of records. A record is a map of
     * name/value (String, Object) pairs.
     * @param numberOfRecords how many records should be in the returned list
     * @return List of Map<String, Object> records
     */
    private static List<Map<String, Object>> createRecords(int numberOfRecords) {
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
}
