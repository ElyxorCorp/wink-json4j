package org.apache.wink.json4j.tests;

import org.apache.wink.json4j.JSON;
import org.apache.wink.json4j.JSONObject;
import org.apache.wink.json4j.tests.utils.PerformanceUtils;
import org.apache.wink.json4j.tests.utils.StringUtils;
import org.apache.wink.json4j.utils.XML;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.*;

import static org.junit.Assert.assertFalse;

public class PerformanceTests {

    private static HashMap<String, Method> mapTests;

    /**
     * Load up all the tests and make them executable in the main class.
     * This would be really helpful to make more generic and pull annotations
     * that indicate Performance tests, and then be a be able to execute all or
     * some of the perf tests across the whole test suite, this way perf tests
     * can be written in the test of the class itself.
     */
    static {
        mapTests = new HashMap<>();
            Arrays.asList(PerformanceTests.class.getMethods())
            .stream().forEach(method-> {
                if (method.getName().startsWith("test_")) {
                    final String key = method.getName().replace("test_","");
                    mapTests.put(key, method);
                }
            });
    }

    public PerformanceTests() {
    }

    @Ignore("Performance Tests Ignored - parsing Highly nested JSON")
    @Test
    public void test_parseNestedJsonGenericParser() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("examples-highly-nested.json")) {
            PerformanceUtils.executeAndTimeInputStreamProcessing(
                    StringUtils.stringFromInputStream(is),
                    "Parse highly nested JSON",
                    inputStream -> {
                        try {
                            JSON.parse(inputStream);
                        } catch (Exception e) {
                            assertFalse("Test Failed: " + e.getMessage(), true);
                        }
                    });
        }
    }

    @Ignore("Performance Tests Ignored - parsing Highly nested JSON")
    @Test
    public void test_parseNestedJsonTypedParser() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("examples-highly-nested.json")) {
            PerformanceUtils.executeAndTimeInputStreamProcessing(
                    StringUtils.stringFromInputStream(is),
                    "Parse highly nested JSON",
                    inputStream -> {
                        try {
                            new JSONObject(inputStream);
                        } catch (Exception e) {
                            assertFalse("Test Failed: " + e.getMessage(), true);
                        }
                    });
        }
    }

    @Ignore("Performance Tests Ignored - writing Highly nested JSON verbose")
    @Test
    public void test_toStringVerboseNestedObject() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("examples-highly-nested.json")) {
            JSONObject obj = new JSONObject(is);
            PerformanceUtils.executeAndTimeJSONObjectProcessing(
                    obj,
                    "writing highly nested JSON (verbose)",
                    jsonObj -> jsonObj.toString(true));
        }
    }

    @Ignore("Performance Tests Ignored - writing Highly nested JSON compact")
    @Test
    public void test_toStringCompactNestedObject() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("examples-highly-nested.json")) {
            JSONObject obj = new JSONObject(is);
            PerformanceUtils.executeAndTimeJSONObjectProcessing(
                    obj,
                    "writing highly nested JSON (compact)",
                    jsonObj -> jsonObj.toString(false));
        }
    }

    @Ignore("Performance Tests Ignored - simple.xml to JSON")
    @Test
    public void test_parseXmlSimple() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("simple.xml")) {
            PerformanceUtils.executeAndTimeInputStreamProcessing(
                    StringUtils.stringFromInputStream(is),
                    "Parse simple.xml into JSON Object",
                    inputStream -> {
                        try {
                            XML.toJson(inputStream);
                        } catch (Exception e) {
                            assertFalse("Test Failed: " + e.getMessage(), true);
                        }
                    });
        }
    }

    @Ignore("Performance Tests Ignored - complex.xml to JSON")
    @Test
    public void test_parseXmlComplex() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("complex.xml")) {
            PerformanceUtils.executeAndTimeInputStreamProcessing(
                    StringUtils.stringFromInputStream(is),
                    "Parse complex.xml into JSON Object",
                    1000,
                    inputStream -> {
                        try {
                            XML.toJson(inputStream);
                        } catch (Exception e) {
                            assertFalse("Test Failed: " + e.getMessage(), true);
                        }
                    });
        }
    }

    public static void main(String[] args) {

        try {
            if (null != args) {
                if ("all".equals(args[0])) {
                    List<String> allTests = new ArrayList<>(mapTests.keySet());
                    allTests.sort(Comparator.naturalOrder());
                    doTests(allTests);
                } else {
                    doTests(Arrays.asList(args));
                }
            } else {
                usage();
            }
        } catch (NoSuchMethodException e) {
            System.err.println("Failed to execute tests. Cause: " + e.getMessage());
            e.printStackTrace(System.err);
            usage();
        }
    }

    private static void usage() {
        System.err.println();
        System.err.println(String.format("%s <test1> [<test2>] ...", PerformanceTests.class.getName()));
        System.err.println("\tAvailable Tests: ");
        System.err.println("\t\tall");
        mapTests.keySet().stream().sorted().forEach(testName -> System.err.println("\t\t" + testName));
    }

    private static void doTests(List<String> testsToRun) throws NoSuchMethodException {

        final PerformanceTests tests = new PerformanceTests();
        testsToRun.forEach(testName -> executeTest(tests, mapTests.get(testName)));
    }

    private static void executeTest(final PerformanceTests tests, final Method method) {
        try {
            System.out.println("Executing: " + method.getName());
            method.invoke(tests);
        } catch (Exception e) {
            System.err.println("Failed: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
