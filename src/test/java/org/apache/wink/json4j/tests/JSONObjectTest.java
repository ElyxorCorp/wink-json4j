/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.wink.json4j.tests;

import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Tests for the basic Java JSONObject model
 */
public class JSONObjectTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Date date;

    @Before
    public void setUp() throws Exception {
        date = new SimpleDateFormat("MMM dd, yyyy HH:mm").parse("Oct 26, 1985 01:21");
    }

    /**
     * Test the no-args constructor.
     */
    @Test
    public void test_new() {
        final JSONObject jObject = new JSONObject();
        assertNotNull(jObject);
        assertEquals(0, jObject.length());
    }

    /**
     * Test the String empty object constructor "{}"
     */
    @Test
    public void test_newFromEmptyObjectString() throws JSONException {
        final JSONObject jObject = new JSONObject("{}");
        assertNotNull(jObject);
        assertEquals(0, jObject.length());
    }

    /**
     * Test the String empty: ""
     */
    @Test
    public void test_newFromEmptyString_throwsException() throws JSONException {
        thrown.expect(JSONException.class);
        new JSONObject("");
    }

    /**
     * Test the String non-empty object constructor.
     */
    @Test
    public void test_newFromString() throws Exception {
        final JSONObject jObject = new JSONObject("{\"foo\":\"bar\",\"bool\":true}");
        assertNotNull(jObject);
        assertEquals(2, jObject.length());
        assertEquals("bar", jObject.getString("foo"));
        assertTrue(jObject.getBoolean("bool"));
    }

    /**
     * Test the construction from a reader.
     */
    @Test
    public void test_newFromReader() throws Exception {
        try (Reader rdr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("utf8_basic.json"), "UTF-8")) {
            final JSONObject jObject = new JSONObject(rdr);
            assertNotNull(jObject);
            assertEquals(12, jObject.length());
        } finally {
            /* */
        }
    }

    /**
     * Test the construction from a stream.
     */
    @Test
    public void test_newFromStream() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("utf8_basic.json")) {
            final JSONObject jObject = new JSONObject(is);
            assertNotNull(jObject);
            assertEquals(12, jObject.length());
        } finally {
            /* */
        }
    }

    /**
     * Test the construction from a simple map.
     */
    @Test
    public void test_newFromMap() throws Exception {
        int anInt = 1;
        final HashMap<String, Object> map = new HashMap();
        map.put("string", "This is a string");
        map.put("null", null);
        map.put("integer", anInt);
        map.put("bool", true);
        map.put("strArr", new String[]{"first", "second", "third"});

        final JSONObject jObject = new JSONObject(map);
        assertTrue(jObject.has("strArr"));
        final JSONArray jArr = jObject.getJSONArray("strArr");

        assertNotNull(jObject);
        assertEquals(5, jObject.length());
        assertTrue(jObject.has("string"));
        assertTrue(jObject.has("null"));
        assertTrue(jObject.has("integer"));
        assertTrue(jObject.has("bool"));
        assertEquals("first", jArr.get(0));
        assertEquals("second", jArr.get(1));
        assertEquals("third", jArr.get(2));
    }

    @Test
    public void test_newFromBean_usingDate() throws Exception {

        final JSONObject j = new JSONObject(date);
        assertEquals("java.util.Date", j.get("class"));
        assertEquals("85 and not 1985 because getYear() on Date is deprecated for good reason", 85, j.get("year"));
        assertEquals(9, j.get("month"));  // zero-based month in Java
        assertEquals(1, j.get("hours"));
        assertEquals(21, j.get("minutes"));
    }

    @Test
    public void test_newFromBeanWithSuper_usingDate() throws Exception {
        final JSONObject j = new JSONObject(date, true);
        assertEquals("java.util.Date", j.get("class"));
        assertEquals("85 and not 1985 because getYear() on Date is deprecated for good reason", 85, j.get("year"));
        assertEquals(9, j.get("month"));  // zero-based month in Java
        assertEquals(1, j.get("hours"));
        assertEquals(21, j.get("minutes"));
    }

    @Test
    public void test_newFromBeanWithoutSuper_usingDate() throws Exception {
        final JSONObject j = new JSONObject(date, false);
        assertNull(j.opt("class"));
        assertEquals("85 and not 1985 because getYear() on Date is deprecated for good reason", 85, j.get("year"));
        assertEquals(9, j.get("month"));  // zero-based month in Java
        assertEquals(1, j.get("hours"));
        assertEquals(21, j.get("minutes"));
    }

    @Test
    public void test_newFromCompactJsonString() throws Exception {
        final JSONObject jObject = new JSONObject("{\"foo\":\"bar\",\"bool\":true}");
        assertTrue(jObject.getBoolean("bool"));
    }

    @Test
    public void test_parseFailure() throws Exception {

        thrown.expect(JSONException.class);
        thrown.expectMessage("expecting either ',' or '}' on line 1, column 26");
        new JSONObject("{\"foo\":\"bar\", \"bool\": true");
    }

    @Test
    public void test_noQuotesParseFailure() throws Exception {
        thrown.expect(JSONException.class);
//        thrown.expectMessage("expecting either ',' or '}' on line 1, column 26");
        new JSONObject("{foo:\"bar\", bool: true}", true);
    }

    /**
     * Test toString(). Because JSONObject is non-ordered, we could have
     * two possible outcomes for a 2 attribute json object.
     * TODO: This needs to move to an output formatter
     */
    @Test
    public void test_toStringVerbose() throws Exception {

        final JSONObject jObject = new JSONObject("{\"foo\":\"bar\",\"bool\":true}");
        final String actualStr = jObject.toString(true);
        final String possibleStr1 = "{" + System.lineSeparator() +
                "\t\"foo\": \"bar\"," + System.lineSeparator() +
                "\t\"bool\": true" + System.lineSeparator() +
                "}";
        final String possibleStr2 = "{" + System.lineSeparator() +
                "\t\"bool\": true," + System.lineSeparator() +
                "\t\"foo\": \"bar\"" + System.lineSeparator() +
                "}";

        assertTrue(possibleStr1.equals(actualStr) || possibleStr2.equals(actualStr));
    }

    /**
     * Test toString(). Because JSONObject is non-ordered, we could have
     * two possible outcomes for a 2 attribute json object.
     * TODO: This needs to move to an output formatter
     */
    @Test
    public void test_toStringVerboseWithDepthTo3Spaces() throws Exception {
        final JSONObject jObject = new JSONObject("{\"foo\":\"bar\",\"bool\":true}");
        final String actualStr = jObject.toString(3);
        final String possibleStr1 = "{" + System.lineSeparator() +
                "   \"foo\": \"bar\"," + System.lineSeparator() +
                "   \"bool\": true" + System.lineSeparator() +
                "}";
        final String possibleStr2 = "{" + System.lineSeparator() +
                "   \"bool\": true," + System.lineSeparator() +
                "   \"foo\": \"bar\"" + System.lineSeparator() +
                "}";

        assertTrue(possibleStr1.equals(actualStr) || possibleStr2.equals(actualStr));
    }

    /**
     * Test the key check method.
     */
    @Test
    public void test_has() throws Exception {

        final JSONObject jObject = new JSONObject("{\"foo\":\"bar\", \"bool\": false, \"null\": null}");
        assertTrue(jObject.has("foo"));
        assertTrue(jObject.has("bool"));
        assertTrue(jObject.has("null"));
        assertFalse(jObject.has("noKey"));
    }

    @Test
    public void test_putLong() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("long", 311L);
        final Object x = jObject.get("long");
        assertNotNull(x);
        assertTrue(x instanceof java.lang.Long);
        assertEquals(311L, jObject.getLong("long"));
    }

    @Test
    public void test_putInt() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("integer", 311);
        final Object x = jObject.get("integer");
        assertNotNull(x);
        assertTrue(x instanceof java.lang.Integer);
        assertEquals(311, jObject.getInt("integer"));
    }

    @Test
    public void test_putShort() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("short", (short) 311);
        final Object x = jObject.get("short");
        assertNotNull(x);
        assertTrue(x instanceof java.lang.Short);
        assertEquals(311, jObject.getShort("short"));
    }

    @Test
    public void test_putDouble() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("double", 3.11);
        final Object x = jObject.get("double");
        assertNotNull(x);
        assertTrue(x instanceof java.lang.Double);
        assertEquals(3.11, jObject.getDouble("double"), Double.POSITIVE_INFINITY);
    }

    @Test
    public void test_putBoolean() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("bool", new Boolean(true));
        final Object x = jObject.get("bool");
        assertNotNull(x);
        assertTrue(x instanceof java.lang.Boolean);
        assertTrue(jObject.getBoolean("bool"));
    }

    @Test
    public void test_putString() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("string", "a bolt of lightning");
        final Object x = jObject.get("string");
        assertNotNull(x);
        assertTrue(x instanceof java.lang.String);
        assertEquals("a bolt of lightning", jObject.getString("string"));
    }

    @Test
    public void test_putJSONObject() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("sub_object", new JSONObject("{\"key\":\"val\"}"));
        final Object obj = jObject.get("sub_object");
        assertNotNull(obj);
        assertTrue(obj instanceof JSONObject);
        assertEquals("val", jObject.getJSONObject("sub_object").getString("key"));
    }

    @Test
    public void test_putJSONArray() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("array", new JSONArray());
        final Object obj = jObject.get("array");
        assertTrue(obj != null);
        assertTrue(obj instanceof JSONArray);
        assertEquals(0, jObject.getJSONArray("array").size());
    }

    @Test
    public void test_appendWithNoExistingKey_createsArray() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.append("not_really_a_string", "a bolt of lightning");
        final Object obj = jObject.get("not_really_a_string");
        assertNotNull(obj);
        assertTrue(obj instanceof JSONArray);
        assertEquals("a bolt of lightning", jObject.getJSONArray("not_really_a_string").getString(0));
    }

    @Test
    public void test_appendToExistingKey_withStringValue_createsArrayWithBothStrings() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("foo", "its just too darn loud");
        jObject.append("foo", "1.21 gigawatts");
        final Object obj = jObject.get("foo");
        assertNotNull(obj);
        assertTrue(obj instanceof JSONArray);
        final JSONArray array = jObject.getJSONArray("foo");
        assertEquals(2, array.size());
        assertEquals("its just too darn loud", array.getString(0));
        assertEquals("1.21 gigawatts", array.getString(1));
    }

    @Test
    public void test_appendToExistingKey_withNullValue() throws Exception {
        final JSONObject jObject = new JSONObject();
        jObject.put("null", (Object) null);
        final String s = (String) jObject.get("null");
        assertNull(s);
        assertTrue(jObject.has("null"));
        jObject.append("null", "watch me for the changes and try to keep up");
        final Object obj = jObject.get("null");
        assertNotNull(obj);
        assertTrue(obj instanceof JSONArray);
        final JSONArray array = jObject.getJSONArray("null");
        assertTrue(array.size() == 2);
        assertNull(array.get(0));
        assertEquals("watch me for the changes and try to keep up", array.getString(1));
    }

    @Test
    public void test_appendToExistingKey_withArray_appendsNewValue() throws Exception {

        final JSONObject jObject = new JSONObject();
        final JSONArray array = new JSONArray();
        array.add("Einstein");
        jObject.put("array", array);
        jObject.append("array", "Doc Brown");
        final JSONArray j = jObject.getJSONArray("array");
        assertEquals(2, j.size());
        assertEquals("Einstein", j.getString(0));
        assertEquals("Doc Brown", j.getString(1));
    }

    @Test
    public void test_appendToExistingKey_withObject_createsArrayWithObjectAndNewNullValue() throws Exception {

        final JSONObject jObject = new JSONObject();
        final JSONObject subObj = new JSONObject("{\"key\":\"value\"}");
        jObject.put("sub_object", subObj);
        jObject.append("sub_object", null);
        final Object obj = jObject.get("sub_object");
        assertNotNull(obj);
        assertTrue(obj instanceof JSONArray);
        final JSONArray array = jObject.getJSONArray("sub_object");
        final JSONObject j = array.getJSONObject(0);
        assertEquals("value", j.getString("key"));
        assertNull(j.get(1));
    }

    /**
     * Test <code>getLong</code> with Long.MAX_VALUE
     */
    @Test
    public void test_getMaxLongPositive() throws JSONException {
        assertEquals(Long.MAX_VALUE, new JSONObject("{\"num\":" + Long.MAX_VALUE + "}").getLong("num"));
    }

    /**
     * Test <code>getLong</code> with Long.MIN_VALUE
     */
    @Test
    public void test_getMaxLongNegative() throws JSONException {
        assertEquals(Long.MIN_VALUE, new JSONObject("{\"num\":" + Long.MIN_VALUE + "}").getLong("num"));
    }



    /**
     * Test <code>getInt</code> with <code>Integer.MAX_VALUE</code>
     */
    @Test
    public void test_getMaxIntegerPositive() throws JSONException {
        assertEquals(Integer.MAX_VALUE, new JSONObject("{\"num\":" + Integer.MAX_VALUE + "}").getInt("num"));
    }

    /**
     * Test <code>getInt</code> with <code>Integer.MIN_VALUE</code>
     */
    @Test
    public void test_getMaxIntegerNegative() throws JSONException {
        assertEquals(Integer.MIN_VALUE, new JSONObject("{\"num\":" + Integer.MIN_VALUE + "}").getInt("num"));
    }

    /**
     * Test <code>getDouble</code> with <code>Double.MAX_VALUE</code>
     */
    @Test
    public void test_getMaxDoublePositive() throws JSONException {
        assertEquals(Double.MAX_VALUE, new JSONObject("{\"num\":" + Double.MAX_VALUE + "}").getDouble("num"), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with <code>Double.MIN_VALUE</code>
     */
    @Test
    public void test_getMaxDoubleNegative() throws JSONException {
        assertEquals(Double.MIN_VALUE, new JSONObject("{\"num\":" + Double.MIN_VALUE + "}").getDouble("num"), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with double decimal
     */
    @Test
    public void test_getPositiveDoubleWithDecimal() throws JSONException {
        assertEquals(311.617, new JSONObject("{\"num\":311.617}").getDouble("num"), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with negative double decimal
     */
    @Test
    public void test_getNegativeDoubleWithDecimal() throws JSONException {
        assertEquals(-311.617, new JSONObject("{\"num\":-311.617}").getDouble("num"), Double.NEGATIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with double decimal with an exponent (eg. e-3)
     */
    @Test
    public void test_getPositiveDoubleWithExponential() throws JSONException {
        assertEquals(311.617, new JSONObject("{\"num\":311617e-3}").getDouble("num"), Double.POSITIVE_INFINITY);
        assertEquals(311.617, new JSONObject("{\"num\":311617E-3}").getDouble("num"), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with negative double decimal with an exponent (eg. e-3)
     */
    @Test
    public void test_getNegativeDoubleWithExponential() throws JSONException {
        assertEquals(-311.617, new JSONObject("{\"num\":-311617e-3}").getDouble("num"), Double.NEGATIVE_INFINITY);
        assertEquals(-311.617, new JSONObject("{\"num\":-311617E-3}").getDouble("num"), Double.NEGATIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with double decimal with an exponent (eg. e+3)
     */
    @Test
    public void test_getPositiveDoubleWithPlusExponential() throws JSONException {
        assertEquals(311617000, new JSONObject("{\"num\":311617e+3}").getDouble("num"), Double.POSITIVE_INFINITY);
        assertEquals(311617000, new JSONObject("{\"num\":311617E+3}").getDouble("num"), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with negative double decimal with an exponent (eg. e+3)
     */
    @Test
    public void test_getNegativeDoubleWithPlusExponential() throws JSONException {
        assertEquals(-311617000, new JSONObject("{\"num\":-311617e+3}").getDouble("num"), Double.NEGATIVE_INFINITY);
        assertEquals(-311617000, new JSONObject("{\"num\":-311617E+3}").getDouble("num"), Double.NEGATIVE_INFINITY);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function
     */
    public void test_getString() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"string\":\"some string\"}");
            assertTrue(jObject.getString("string").equals("some string"));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function
     */
    public void test_getBoolean() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"bool\":true}");
            assertTrue(jObject.getBoolean("bool"));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function
     */
    public void test_getBoolean_StringValue() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"bool\":\"true\"}");
            assertTrue(jObject.getBoolean("bool"));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optLong() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"long\":1}");
            assertTrue(jObject.optLong("long") == 1);
            assertTrue(jObject.optLong("long2", 2) == 2);
            assertTrue(jObject.optLong("long2") == 0);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optLongNgative() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"long\":-1}");
            assertTrue(jObject.optLong("long") == -1);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optInt() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"int\":1}");
            assertTrue(jObject.optInt("int") == 1);
            assertTrue(jObject.optInt("int2", 2) == 2);
            assertTrue(jObject.optInt("int2") == 0);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optIntNegative() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"int\":-1}");
            assertTrue(jObject.optInt("int") == -1);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optDouble() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":1}");
            assertTrue(jObject.optDouble("double") == 1);
            assertTrue(jObject.optDouble("double2", 2) == 2);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optDoubleNegative() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":-1}");
            assertTrue(jObject.optDouble("double") == -1);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optDoubleWithDecimal() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":100.959}");
            assertTrue(jObject.optDouble("double") == 100.959);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optDoubleNegativeWithDecimal() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":-100.959}");
            assertTrue(jObject.optDouble("double") == -100.959);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optDoubleWithExponential() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":100959e-3}");
            assertTrue(jObject.optDouble("double") == 100.959);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optDoubleNegativeWithExponential() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":-100959e-3}");
            assertTrue(jObject.optDouble("double") == -100.959);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optString() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"string\":\"some string\"}");
            assertTrue(jObject.optString("string").equals("some string"));
            assertTrue(jObject.optString("string2", "string!").equals("string!"));
            assertTrue(jObject.optString("string2") == null);
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optBoolean() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"bool\":true}");
            assertTrue(jObject.optBoolean("bool"));
            assertTrue(jObject.optBoolean("bool2") == false);
            assertTrue(jObject.optBoolean("bool2", true) == true);

        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test a basic JSON Object construction and helper 'opt' function
     */
    public void test_optBoolean_StringValue() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"bool\":\"true\"}");
            assertTrue(jObject.optBoolean("bool"));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test returning of Integer object if within Integer range.
     */
    public void test_opt_ReturnsIntegerClass() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"int\" : " + Integer.MAX_VALUE + "}");
            JSONObject jObject2 = new JSONObject("{\"int\" : " + Integer.MIN_VALUE + "}");
            JSONObject jObject3 = new JSONObject("{\"int\" : 4500}");
            JSONObject jObject4 = new JSONObject("{\"int\" : 0}");
            JSONObject jObject5 = new JSONObject("{\"int\" : 0X7fffffff}");
            JSONObject jObject6 = new JSONObject("{\"int\" : 017777777777}");
            assertEquals(jObject.opt("int").getClass(), Integer.class);
            assertEquals(jObject2.opt("int").getClass(), Integer.class);
            assertEquals(jObject3.opt("int").getClass(), Integer.class);
            assertEquals(jObject4.opt("int").getClass(), Integer.class);
            assertEquals(jObject5.opt("int").getClass(), Integer.class);
            assertEquals(jObject6.opt("int").getClass(), Integer.class);

        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Test returning of Long object if value out of Integer range.
     */
    public void test_opt_ReturnsLongClass() {
        Exception ex = null;

        try {
            Long val1 = Long.valueOf(Integer.MAX_VALUE) + 1;
            Long val2 = Long.valueOf(Integer.MIN_VALUE) - 1;
            JSONObject jObject = new JSONObject("{\"int\" : " + val1 + "}");
            JSONObject jObject2 = new JSONObject("{\"int\" : " + val2 + "}");
            JSONObject jObject3 = new JSONObject("{\"int\" : 0X" + Long.toHexString(val1.longValue()) + "}");
            JSONObject jObject4 = new JSONObject("{\"int\" : 020000000000}");
            assertEquals(jObject.opt("int").getClass(), Long.class);
            assertEquals(jObject2.opt("int").getClass(), Long.class);
            assertEquals(jObject3.opt("int").getClass(), Long.class);
            assertEquals(jObject4.opt("int").getClass(), Long.class);

        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    public void test_optWithHex() {
        Exception ex = null;

        try {
            JSONObject jObject3 = new JSONObject("{\"int\" : 0X7f}");
            assertEquals(jObject3.opt("int"), 127);
            jObject3 = new JSONObject("{\"int\" : 0x7f}");
            assertEquals(jObject3.opt("int"), 127);
            jObject3 = new JSONObject("{\"int\" : -0x99e}");
            assertEquals(jObject3.opt("int"), -2462);
            jObject3 = new JSONObject("{\"int\" : -0X99e}");
            assertEquals(jObject3.opt("int"), -2462);

        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);

        try {
            JSONObject jObject3 = new JSONObject("{\"int\" : 343g}");
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex instanceof JSONException);
        try {
            JSONObject jObject3 = new JSONObject("{\"int\" : 343a}");
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex instanceof JSONException);

    }

    public void test_optNumberReturnsSameException() {
        Exception ex = null;
        // Test to make sure same exception is thrown when hex char is included in
        // normal identifier.
        try {
            JSONObject jObject3 = new JSONObject("{\"int\" : 343h}");
            assertEquals(jObject3.opt("int"), 127);


        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
        Throwable cause = ex.getCause();
        assertTrue(cause == null);

        try {
            JSONObject jObject3 = new JSONObject("{\"int\" : 343a}");
            assertEquals(jObject3.opt("int"), 127);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
        cause = ex.getCause();
        assertTrue(cause == null);

    }

    public void test_ArrayRetrievalFromJavaArrayInsertion() throws Exception {
        JSONObject json = new JSONObject();
        String[] someArray = {"Hello", "World!"};
        json.put("somearray", someArray);
        JSONArray array = json.getJSONArray("somearray");
        assertEquals(array.get(0), "Hello");
        assertEquals(array.get(1), "World!");
    }

    /**************************************************************************/
    /* The following tests all test failure scenarios due to type mismatching.*/
    /**************************************************************************/

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getLong_typeMisMatch() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"long\":\"1\"}");
            assertTrue(jObject.getLong("long") == 1);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getDouble_typeMisMatch() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":\"1\"}");
            assertTrue(jObject.getDouble("double") == 1);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getInt_typeMisMatch() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"int\":\"1\"}");
            assertTrue(jObject.getLong("int") == 1);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getString_typeMisMatch() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"string\":null}");
            assertTrue(jObject.getString("string") == "1");
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getBoolean_typeMisMatch() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"bool\":1}");
            assertTrue(jObject.getBoolean("bool") == true);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getLong_typeMisMatchNull() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"long\":null}");
            assertTrue(jObject.getLong("long") == 1);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getInt_typeMisMatchNull() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"int\":null}");
            assertTrue(jObject.getLong("int") == 1);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getDouble_typeMisMatchNull() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"double\":null}");
            assertTrue(jObject.getDouble("double") == 1);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getString_typeMisMatchNull() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"string\":null}");
            assertTrue(jObject.getString("string") == "1");
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test a basic JSON Object construction and helper 'get' function failure due to type mismatch
     */
    public void test_getBoolean_typeMisMatchNull() {
        Exception ex = null;

        try {
            JSONObject jObject = new JSONObject("{\"bool\":null}");
            assertTrue(jObject.getBoolean("bool") == true);
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex instanceof JSONException);
    }

    /**
     * Test the iterator of the keys.
     */
    public void test_keys() {
        Exception ex = null;
        HashMap map = new HashMap();
        try {
            JSONObject jObject = new JSONObject("{\"foo\": \"bar\", \"number\": 1, \"bool\":null}");
            Iterator keys = jObject.keys();
            while (keys.hasNext()) {
                String key = (String) keys.next();
                map.put(key, key);
            }
        } catch (Exception ex1) {
            ex = ex1;
        }
        assertTrue(ex == null);
        assertTrue(map.size() == 3);
        assertTrue(map.get("foo") != null);
        assertTrue(map.get("number") != null);
        assertTrue(map.get("bool") != null);
    }

    /**
     * Test the iterator of the sorted keys.
     */
    public void test_sortedKeys() {
        HashMap map = new HashMap();
        JSONObject jObject = null;
        try {
            jObject = new JSONObject("{\"foo\": \"bar\", \"number\": 1, \"bool\":null}");
        } catch (Exception ex) {
            assertTrue(false);
        }
        Iterator keys = jObject.sortedKeys();
        String[] sKeys = new String[]{"bool", "foo", "number"};
        int i = 0;
        while (keys.hasNext()) {
            String key = (String) keys.next();
            String sKey = sKeys[i];
            i++;
            assertTrue(key.equals(sKey));
        }
    }

    /**
     * Test the toString of JSONObject.
     * Use the value to construct a new object and verify contents match.
     */
    public void test_toString() {
        HashMap map = new HashMap();
        JSONObject jObject = null;
        JSONObject jObject2 = null;
        try {
            jObject = new JSONObject("{\"foo\": \"bar\", \"number\": 1, \"bool\":true}");
            jObject2 = new JSONObject(jObject.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
        try {
            assertTrue(jObject != jObject2);
            assertTrue(jObject.length() == jObject2.length());
            assertTrue(jObject.getString("foo").equals(jObject2.getString("foo")));
            assertTrue(jObject.getBoolean("bool") == jObject2.getBoolean("bool"));
            assertTrue(jObject.getInt("number") == jObject2.getInt("number"));
        } catch (JSONException jex) {
            jex.printStackTrace();
            assertTrue(false);
        }
    }

    /**
     * Test JSONObject creation does not throw exception if key is missing and
     * does not add missing value.
     */
    public void test_MissingKeyIsIgnored() {
        JSONObject obj = new JSONObject();
        try {
            obj.put("key1", "key1");
            obj.put("key2", "key2");
            obj.put("key3", "key3");
            String[] keys = {"key1", "key3"};
            JSONObject testObj = new JSONObject(obj, keys);
            assertTrue(testObj.size() == 2);
            assertTrue(testObj.opt("key2") == null);
            assertTrue(testObj.opt("key3").equals("key3"));
            assertTrue(testObj.opt("key1").equals("key1"));
        } catch (JSONException jex) {
            jex.printStackTrace();
            assertTrue(false);
        }
    }

    /***********************************************************/
    /* The following tests checks UTF-8 encoded DBCS characters*/
    /***********************************************************/

    /**
     * Verify a standard UTF-8 file with high character codes (Korean), can be read via a reader and parsed.
     */
    public void test_utf8_korean() {
        Exception ex = null;
        try {
            Reader reader = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("utf8_helloworld_ko.json"), "UTF-8");
            JSONObject jObject = new JSONObject(reader);
            reader.close();
            assertTrue(jObject.getString("greet").equals("\uc548\ub155 \uc138\uc0c1\uc544"));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

    /**
     * Verify a UTF 8 file with character codes in the lower part will parse and
     * serialize correctly in escaped unicode format (which is valid JSON and easier
     * to debug)
     */
    public void test_utf8_lowerchar() {
        Exception ex = null;
        try {
            Reader reader = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("utf8_lowerchar.json"), "UTF-8");
            JSONObject jObject = new JSONObject(reader);
            reader.close();
            assertTrue(jObject.getString("message").equals("\u00c5\u00c5\u00c5\u00c5"));
            assertTrue(jObject.toString().equals("{\"message\":\"\\u00c5\\u00c5\\u00c5\\u00c5\"}"));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }


    /*****************************************************************************************/
    /* These tests check for specific 'behaviors' so that the parser is compatible to others */
    /* and allows comments, etc.                                                             */

    /*****************************************************************************************/

    public void test_CStyleComment() throws Exception {
        try {
            JSONObject jObj = new JSONObject("/* comment */ { 'test' : 'value' }");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("value"));
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    public void test_CPPComment() throws Exception {
        try {
            JSONObject jObj = new JSONObject("// test comment\n{'test':'value'}");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("value"));
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    public void test_CStyleCommentWithACommentCharInMiddle() throws Exception {
        try {
            JSONObject jObj = new JSONObject("/* * */ { 'test' : 'value' }");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("value"));

            JSONObject jObj2 = new JSONObject("/* / */ { 'test' : 'value' }");
            assertTrue(jObj2.has("test"));
            assertTrue(jObj2.getString("test").equals("value"));
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    public void test_UnquotedObjectKey() throws Exception {
        try {
            JSONObject jObj = new JSONObject("{test:'value'}");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("value"));
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    /**
     * Test special characters in unquoted string key.
     */
    public void test_UnquotedObjectKeyWithSpecialChars() throws Exception {
        try {
            JSONObject jObj = new JSONObject("{test-key:'value'}");
            assertTrue(jObj.has("test-key"));
            assertTrue(jObj.getString("test-key").equals("value"));

            jObj = new JSONObject("{test0:'value'}");
            assertTrue(jObj.has("test0"));
            assertTrue(jObj.getString("test0").equals("value"));

            jObj = new JSONObject("{test$:'value'}");
            assertTrue(jObj.has("test$"));
            assertTrue(jObj.getString("test$").equals("value"));

            jObj = new JSONObject("{test_key:'value'}");
            assertTrue(jObj.has("test_key"));
            assertTrue(jObj.getString("test_key").equals("value"));

        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    /**
     * Test special characters in unquoted string value.
     */
    public void test_UnquotedObjectValueWithSpecialChars() throws Exception {
        try {
            JSONObject jObj = new JSONObject("{test:@value}");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("@value"));

            jObj = new JSONObject("{test:$100}");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("$100"));

            jObj = new JSONObject("{test:$value}");
            assertTrue(jObj.has("test"));
            assertTrue(jObj.getString("test").equals("$value"));

        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    public void test_CStyleCommentFailsStrict() throws Exception {
        Exception ex1 = null;
        try {
            JSONObject jObj = new JSONObject("/* comment */ { 'test' : 'value' }", true);
        } catch (Exception ex) {
            ex1 = ex;
        }
        assertTrue(ex1 != null);
    }

    public void test_CPPCommentFailsStrict() throws Exception {
        Exception ex1 = null;
        try {
            JSONObject jObj = new JSONObject("// test comment\n{'test':'value'}", true);
        } catch (Exception ex) {
            ex1 = ex;
        }

        assertTrue(ex1 != null);
    }

    public void test_UnquotedObjectKeyFailsStrict() throws Exception {
        Exception ex1 = null;
        try {
            JSONObject jObj = new JSONObject("{test:'value'}", true);
        } catch (Exception ex) {
            ex1 = ex;
        }
        assertTrue(ex1 != null);
    }


    public void testIsNull() {
        Map jsonMap = new LinkedHashMap(1);
        jsonMap.put("key1", null);
        jsonMap.put("key2", JSONObject.NULL);
        jsonMap.put("key3", "NOT NULL");


        JSONObject json = new JSONObject(jsonMap);

        assertTrue(json.isNull("key1"));
        assertTrue(json.isNull("key2"));
        assertFalse(json.isNull("key3"));
    }


    /*****************************************************************/
    /* The following tests checks basic 'java beans' convert to JSON */
    /*****************************************************************/

    /**
     * Test that a new Java Date serializes 'bean style' when encountered.
     */
    public void test_Date() {
        Exception ex = null;
        try {
            Date date = new Date();
            JSONObject ja = new JSONObject();
            ja.put("date", date);
            JSONObject jsonDate = ja.getJSONObject("date");
            assertTrue(jsonDate instanceof JSONObject);
            assertTrue(jsonDate.get("class").equals("java.util.Date"));
            System.out.println(ja.write(3));
        } catch (Exception ex1) {
            ex = ex1;
            ex.printStackTrace();
        }
        assertTrue(ex == null);
    }

}
