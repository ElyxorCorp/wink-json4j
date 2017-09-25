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
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import static org.junit.Assert.*;

/**
 * Tests for the basic Java JSONArray model
 */
public class JSONArrayTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Test the no-args constructor.
     */
    @Test
    public void test_new() {
        JSONArray jObject = new JSONArray();
        assertNotNull(jObject);
        assertEquals(0, jObject.length());
    }

    /**
     * Test the creation of a JSONArray from a string array
     */
    @Test
    public void test_newFromStringArray() throws Exception {
        String[] strArray = new String[]{"hello", "world", null, "after null"};

        JSONArray jArray = new JSONArray(strArray);
        assertEquals(4, jArray.length());
        assertEquals("hello", jArray.getString(0));
        assertNull(jArray.optString(2));
        assertEquals("after null", jArray.getString(3));
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_newFromEmptyObjectString() throws Exception {
        JSONArray jObject = new JSONArray("[]");
        assertNotNull(jObject);
        assertEquals(0, jObject.length());
    }

    /**
     * Test the String non-empty object constructor.
     */
    @Test
    public void test_newFromString() throws Exception {
        JSONArray jObject = new JSONArray("[\"foo\", \"bar\", \"bool\", true]");
        assertNotNull(jObject);
        assertEquals(4, jObject.length());
        assertEquals("foo", jObject.get(0));
        assertEquals("bar", jObject.get(1));
        assertEquals("bool", jObject.get(2));
        assertEquals(true, jObject.get(3));
    }

    /**
     * Test the construction from a reader.
     */
    @Test
    public void test_newFromReader() throws Exception {

        // read in a basic JSON file of a top-level array that has all the various types in it.
        try (Reader rdr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("utf8_basic_array.json"), "UTF-8")) {
            testUtf8BasicArray(new JSONArray(rdr));
        } finally {
            /* */
        }
    }

    /**
     * Test the construction from a stream.
     */
    @Test
    public void test_newFromStream() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("utf8_basic_array.json")) {
            testUtf8BasicArray(new JSONArray(is));
        } finally {
            /* */
        }
    }

    /**
     * Test the String non-empty object constructor parse failure.
     */
    @Test
    public void test_newFromStringFailure() throws JSONException {

        thrown.expect(JSONException.class);
        new JSONArray("[\"foo\", bar, \"bool\", true]", true);
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putLong() throws JSONException {
        JSONArray jArray = new JSONArray();
        jArray.put(5L);
        Object l = jArray.get(0);
        assertNotNull(l);
        assertTrue(l instanceof java.lang.Long);
        assertEquals(5L, jArray.getLong(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putInt() throws JSONException {
        JSONArray jArray = new JSONArray();
        jArray.put(311);
        Object i = jArray.get(0);
        assertNotNull(i);
        assertTrue(i instanceof java.lang.Integer);
        assertEquals(311, jArray.getInt(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putShort() throws JSONException {
        JSONArray jArray = new JSONArray();
        jArray.put((short) 2);
        Object s = jArray.get(0);
        assertNotNull(s);
        assertTrue(s instanceof java.lang.Short);
        assertEquals((short) 2, jArray.getShort(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putDouble() throws JSONException {
        JSONArray jArray = new JSONArray();
        jArray.put(3.11);
        Object d = jArray.get(0);
        assertNotNull(d);
        assertTrue(d instanceof java.lang.Double);
        assertEquals(3.11, jArray.getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putBoolean() throws JSONException {
        JSONArray jArray = new JSONArray();
        jArray.put(new Boolean(false));
        Object b = jArray.get(0);
        assertNotNull(b);
        assertTrue(b instanceof java.lang.Boolean);
        assertEquals(false, jArray.getBoolean(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_put_boolean() throws JSONException {
        JSONArray jArray = new JSONArray();
        jArray.put(true);
        Object b = jArray.get(0);
        assertNotNull(b);
        assertTrue(b instanceof java.lang.Boolean);
        assertEquals(true, jArray.getBoolean(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putString() throws Exception {
        JSONArray jArray = new JSONArray();
        final String str = "1.21 Gigawatts of electricity; a bolt of lightning!";
        jArray.put(str);
        Object s = jArray.get(0);
        assertNotNull(s);
        assertTrue(s instanceof java.lang.String);
        assertEquals(str, jArray.getString(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putNull() throws JSONException {
        JSONArray jArray = new JSONArray();
        final Object nullObj = null;
        jArray.put(nullObj);
        assertNull(jArray.get(0));
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putJSONObject() throws JSONException {
        JSONArray jArray = new JSONArray();
        final String jsonStr = "{\"foo\":\"bar\"}";
        jArray.put(new JSONObject(jsonStr));
        JSONObject obj = (JSONObject) jArray.get(0);
        assertNotNull(obj);
        assertTrue(obj instanceof JSONObject);
        assertEquals(jsonStr, jArray.get(0).toString());
    }

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putJSONArray() throws JSONException {
        JSONArray jArray = new JSONArray();
        final String jsonStr = "[\"foo\",\"bar\"]";
        jArray.put(new JSONArray(jsonStr));
        JSONArray obj = (JSONArray) jArray.get(0);
        assertNotNull(obj);
        assertTrue(obj instanceof JSONArray);
        assertEquals(jsonStr, jArray.get(0).toString());
    }

    /**
     * Test <code>getLong</code> with Long.MAX_VALUE
     */
    @Test
    public void test_getMaxLongPositive() throws JSONException {
        assertEquals(Long.MAX_VALUE, new JSONArray("[" + Long.MAX_VALUE + "]").getLong(0));
    }

    /**
     * Test <code>getLong</code> with Long.MIN_VALUE
     */
    @Test
    public void test_getMaxLongNegative() throws JSONException {
        assertEquals(Long.MIN_VALUE, new JSONArray("[" + Long.MIN_VALUE + "]").getLong(0));
    }

    /**
     * Test <code>getLong</code> with double bigger than max long
     */
    @Test
    public void test_getLongMaxLongOverflow() throws JSONException {
        double doubleBiggerThanLongMaxValue = Long.MAX_VALUE + 311.0;
        JSONArray jArray = new JSONArray("[" + doubleBiggerThanLongMaxValue + "]");
        assertEquals(Long.MAX_VALUE, jArray.getLong(0));
        assertEquals(doubleBiggerThanLongMaxValue, jArray.getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getInt</code> with Integer.MAX_VALUE
     */
    @Test
    public void test_getMaxIntPositive() throws JSONException {
        assertEquals(Integer.MAX_VALUE, new JSONArray("[" + Integer.MAX_VALUE + "]").getInt(0));
    }

    /**
     * Test <code>getInt</code> with Integer.MIN_VALUE
     */
    @Test
    public void test_getMaxIntNegative() throws JSONException {
        assertEquals(Integer.MIN_VALUE, new JSONArray("[" + Integer.MIN_VALUE + "]").getInt(0));
    }

    /**
     * Test <code>getInt</code> with double bigger than max long
     */
    @Test
    public void test_getIntMaxIntegerOverflow() throws JSONException {
        long longBiggerThanIntegerMaxValue = Integer.MAX_VALUE + 311L;
        JSONArray jArray = new JSONArray("[" + longBiggerThanIntegerMaxValue + "]");
        assertEquals((int) longBiggerThanIntegerMaxValue, jArray.getInt(0));
        assertEquals(longBiggerThanIntegerMaxValue, jArray.getLong(0));
    }

    /**
     * Test <code>getDouble</code> with double decimal
     */
    @Test
    public void test_getPositiveDoubleWithDecimal() throws JSONException {
        assertEquals(311.617, new JSONArray("[311.617]").getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with negative double decimal
     */
    @Test
    public void test_getNegativeDoubleWithDecimal() throws JSONException {
        assertEquals(-311.617, new JSONArray("[-311.617]").getDouble(0), Double.NEGATIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with double decimal with an exponent (eg. e-3)
     */
    @Test
    public void test_getPositiveDoubleWithExponential() throws JSONException {
        assertEquals(311.617, new JSONArray("[311617e-3]").getDouble(0), Double.POSITIVE_INFINITY);
        assertEquals(311.617, new JSONArray("[311617E-3]").getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with negative double decimal with an exponent (eg. e-3)
     */
    @Test
    public void test_getNegativeDoubleWithExponential() throws JSONException {
        assertEquals(-311.617, new JSONArray("[-311617e-3]").getDouble(0), Double.POSITIVE_INFINITY);
        assertEquals(-311.617, new JSONArray("[-311617E-3]").getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with double decimal with an exponent (eg. e+3)
     */
    @Test
    public void test_getPositiveDoubleWithPlusExponential() throws JSONException {
        assertEquals(311617000, new JSONArray("[311617e+3]").getDouble(0), Double.POSITIVE_INFINITY);
        assertEquals(311617000, new JSONArray("[311617E+3]").getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getDouble</code> with negative double decimal with an exponent (eg. e+3)
     */
    @Test
    public void test_getNegativeDoubleWithPlusExponential() throws JSONException {
        assertEquals(-311617000, new JSONArray("[-311e+3]").getDouble(0), Double.POSITIVE_INFINITY);
        assertEquals(-311617000, new JSONArray("[-311E+3]").getDouble(0), Double.POSITIVE_INFINITY);
    }

    /**
     * Test <code>getBoolean</code>
     *
     * @throws Exception shouldn't be thrown
     */
    @Test
    public void test_getBoolean() throws JSONException {
        assertTrue(new JSONArray("[true]").getBoolean(0));
        assertFalse(new JSONArray("[false]").getBoolean(0));
    }

    /**
     * Test <code>getBoolean</code> with strings <code>"true"</code> and  <code>"false"</code>
     *
     * @throws Exception shouldn't be thrown
     */
    @Test
    public void test_getBoolean_StringValue() throws JSONException {
        assertTrue(new JSONArray("[\"true\"]").getBoolean(0));
        assertFalse(new JSONArray("[\"false\"]").getBoolean(0));
    }

    /**
     * Test <code>getBoolean</code> with string <code>"True"</code> throws exception
     *
     * @throws Exception shouldn't be thrown
     */
    @Test
    public void test_getBoolean_IllegalStringValue_True_throwsJSONException() throws Exception {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a boolean or string value of 'true' or 'false'.");
        assertTrue(new JSONArray("[\"True\"]").getBoolean(0));
    }

    /**
     * Test <code>getBoolean</code> with string <code>"False"</code> throws exception
     *
     * @throws Exception shouldn't be thrown
     */
    @Test
    public void test_getBoolean_IllegalStringValue_False_throwsJSONException() throws Exception {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a boolean or string value of 'true' or 'false'.");
        assertTrue(new JSONArray("[\"False\"]").getBoolean(0));
    }

    /**
     * Test <code>getBoolean</code> with string <code>"False"</code> throws exception
     *
     * @throws Exception shouldn't be thrown
     */
    @Test
    public void test_getBoolean_IllegalStringValue_Null_throwsJSONException() throws Exception {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        assertTrue(new JSONArray("[ null ]").getBoolean(0));
    }

    /**
     * Test <code>get</code> with a null member
     */
    @Test
    public void test_getNull() throws JSONException {
        JSONArray jArray = new JSONArray("[null]");
        assertEquals(1, jArray.size());
        assertNull(jArray.get(0));
    }

    /***********************************************************************************/
    /* The following tests array expansion when using indexes > than the current array */
    /***********************************************************************************/

    /**
     * Test a basic JSON Array construction and helper 'put' function
     */
    @Test
    public void test_putIntPosition() throws JSONException {

        JSONArray jArray = new JSONArray();
        // Put the int at the noted position (1)
        jArray.put(5, 311);

        assertEquals(6, jArray.size());
        for (int i = 0; i < jArray.size() - 2; i++) {
            assertNull(jArray.get(i));
        }

        Object objInt = jArray.get(5);
        assertNotNull(objInt);
        assertTrue(objInt instanceof java.lang.Integer);
        assertEquals(311, jArray.getInt(5));
    }


    /**************************************************************************/
    /* The following tests all test failure scenarios due to type mismatching.*/
    /**************************************************************************/

    /**
     * Test <code>getLong</code> function failure due to type mismatch
     */
    @Test
    public void test_getLong_typeMisMatchString_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a number");
        new JSONArray("[\"1\"]").getLong(0);
    }

    /**
     * Test <code>getDouble</code> function failure due to type mismatch
     */
    @Test
    public void test_getDouble_typeMisMatchString_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a number");
        new JSONArray("[\"1\"]").getDouble(0);
    }

    /**
     * Test <code>getInt</code> function failure due to type mismatch
     */
    @Test
    public void test_getInt_typeMisMatchString_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a number");
        new JSONArray("[\"1\"]").getInt(0);
    }

    /**
     * Test <code>getShort</code> function failure due to type mismatch
     */
    @Test
    public void test_getShort_typeMisMatchString_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a number");
        new JSONArray("[\"1\"]").getShort(0);
    }

    /**
     * Test <code>getShort</code> function failure due to type mismatch
     */
    @Test
    public void test_getString_typeMisMatchNull_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        new JSONArray("[null]").getString(0);
    }

    /**
     * Test <code>getString</code> function returns string representation of number
     */
    @Test
    public void test_getString_returnsIntegerToString() throws JSONException {
        assertEquals("311", new JSONArray("[311]").getString(0));
    }

    /**
     * Test <code>getBoolean</code> function failure due to type mismatch
     */
    @Test
    public void test_getBoolean_typeMisMatchNumber_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was not a boolean or string value of 'true' or 'false'");
        new JSONArray("[311]").getBoolean(0);
    }

    /**
     * Test <code>getLong</code> function failure due to value null
     */
    @Test
    public void test_getLong_typeMisMatchNull_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        new JSONArray("[null]").getLong(0);
    }

    /**
     * Test <code>getInt</code> function failure due to value null
     */
    @Test
    public void test_getInt_typeMisMatchNull_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        new JSONArray("[null]").getInt(0);
    }

    /**
     * Test <code>getDouble</code> function failure due to value null
     */
    @Test
    public void test_getDouble_typeMisMatchNull_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        new JSONArray("[null]").getLong(0);
    }

    /**
     * Test <code>getShort</code> function failure due to value null
     */
    @Test
    public void test_getShort_typeMisMatchNull_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        new JSONArray("[null]").getShort(0);
    }

    /**
     * Test <code>getBoolean</code> function failure due to value null
     */
    @Test
    public void test_getBoolean_typeMisMatchNull_throwsJSONException() throws JSONException {
        thrown.expect(JSONException.class);
        thrown.expectMessage("Value at index: [0] was null");
        new JSONArray("[null]").getBoolean(0);
    }

    /**
     * Test a 'join' of a JSONArray
     */
    @Test
    public void test_JoinNoDelimiter() throws JSONException {
        assertEquals("1truefalsenullMy String[1,2,3]{\"foo\":\"bar\"}",
                new JSONArray("[1, true, false, null, \"My String\", [1,2,3], {\"foo\":\"bar\"}]").join(""));
    }

    /**
     * Test a 'join' of a JSONArray using a '|'
     */
    @Test
    public void test_JoinDelimiter() throws JSONException {
        assertEquals("1|true|false|null|My String|[1,2,3]|{\"foo\":\"bar\"}",
                new JSONArray("[1, true, false, null, \"My String\", [1,2,3], {\"foo\":\"bar\"}]").join("|"));
    }

    private void testUtf8BasicArray(JSONArray jArray) throws Exception {
        assertNotNull(jArray);
        assertEquals(7, jArray.length());
        assertEquals(1, jArray.get(0));
        assertEquals(2, jArray.get(1));
        assertNull(jArray.get(2));
        assertEquals(true, jArray.get(3));
        assertEquals("string", jArray.get(4));
        assertTrue(jArray.get(5) instanceof JSONObject);
        assertTrue(jArray.get(6) instanceof JSONArray);
        assertEquals(3, jArray.getJSONArray(6).length());
    }
}
