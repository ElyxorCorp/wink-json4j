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
import org.apache.wink.json4j.JSONObject;
import org.apache.wink.json4j.JSONWriter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the basic Java JSONWriter
 */
public class JSONWriterTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Test the constructor.
     */
    @Test
    public void test_new() {
        StringWriter w = new StringWriter();
        new JSONWriter(w);
    }

    @Test
    public void test_new_withNullWriter_throwsException() {
        thrown.expect(NullPointerException.class);
        new JSONWriter(null);
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_WriteEmptyObject() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.endObject();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{}"));
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_WriteEmptyObjectClose() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{}"));
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_WriteEmptyArray() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.array();
        jWriter.endArray();
        String str = w.toString();
        // Verify it parses.
        new JSONArray(str);
        assertTrue(str.equals("[]"));
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_WriteEmptyArrayClose() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.array();
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONArray(str);
        assertTrue(str.equals("[]"));
    }

    /**
     * Test a simple object with a key + value of string
     */
    @Test
    public void test_WriteObjectAttrString() throws Exception {
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value("bar");
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{\"foo\":\"bar\"}"));
    }

    /**
     * Test a simple object with a key + value of int
     */
    @Test
    public void test_WriteObjectAttrInt() throws Exception {
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value(1);
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{\"foo\":1}"));
    }

    /**
     * Test a simple object with a key + value of long
     */
    @Test
    public void test_WriteObjectAttrLong() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value((long) 1);
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{\"foo\":1}"));
    }

    /**
     * Test a simple object with a key + value of short
     */
    @Test
    public void test_WriteObjectAttrShort() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value((short) 1);
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{\"foo\":1}"));
    }

    /**
     * Test a simple object with a key + value of Double
     */
    @Test
    public void test_WriteObjectAttrDouble() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value(100.959);
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{\"foo\":100.959}"));
    }

    /**
     * Test a simple object with a key + value of boolean
     */
    @Test
    public void test_WriteObjectAttrBoolean() throws Exception {

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value(true);
        jWriter.close();
        String str = w.toString();
        // Verify it parses.
        new JSONObject(str);
        assertTrue(str.equals("{\"foo\":true}"));
    }

    /**
     * Test a simple object with a key + value of Object
     */
    @Test
    public void test_WriteObjectAttrObject() throws Exception {

        final String expectedResult = "{\"foo\":{\"foo\":true}}";

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.object();
        jWriter.key("foo");
        jWriter.value(true);
        jWriter.endObject();
        jWriter.endObject();
        jWriter.close();

        // verify
        String str = w.toString();
        new JSONObject(str);
        assertEquals(expectedResult, str);
    }

    /**
     * Test a simple object with a key + value of Object
     */
    @Test
    public void test_WriteObjectAttrArray() throws Exception {

        final String expectedResult = "{\"foo\":[true]}";

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.array();
        jWriter.value(true);
        jWriter.endArray();
        jWriter.endObject();
        jWriter.close();

        // verify
        String str = w.toString();
        new JSONObject(str);
        assertEquals(expectedResult, str);
    }

    /**
     * Test a simple object with a key + value of Object
     */
    @Test
    public void test_WriteObjectAttrJSONObject() throws Exception {

        final String expectedResult = "{\"foo\":{\"foo\":true}}";

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");

        // Verify we can put a JSONObject into the stream!
        JSONObject jObj = new JSONObject();
        jObj.put("foo", true);
        jWriter.value(jObj);

        jWriter.endObject();
        jWriter.close();

        // verify
        String str = w.toString();
        new JSONObject(str);
        assertEquals(expectedResult, str);
    }

    /**
     * Test a simple object with a key + value of array
     */
    @Test
    public void test_WriteObjectAttrJSONArray() throws Exception {

        final String expectedResult = "{\"foo\":[true]}";

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");

        // Verify we can put a JSONObject into the stream!
        JSONArray jArray = new JSONArray();
        jArray.put(true);
        jWriter.value(jArray);

        jWriter.endObject();
        jWriter.close();

        // verify
        String str = w.toString();
        new JSONObject(str);
        assertEquals(expectedResult, str);
    }


    /**
     * Test a simple object with multiple keys of varying types
     */
    @Test
    public void test_WriteObjectComplex() throws Exception {

        final String expectedResult = "{\"string\":\"String1\",\"bool\":false,\"number\":1,\"object\":{\"string\":\"String2\"},\"array\":[1,2.0,3]}";

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);

        jWriter.object();
        jWriter.key("string");
        jWriter.value("String1");
        jWriter.key("bool");
        jWriter.value(false);
        jWriter.key("number");
        jWriter.value(1);

        // Place an object
        jWriter.key("object");
        jWriter.object();
        jWriter.key("string");
        jWriter.value("String2");
        jWriter.endObject();

        // Place an array
        jWriter.key("array");
        jWriter.array();
        jWriter.value(1);
        jWriter.value((double) 2);
        jWriter.value((short) 3);
        jWriter.endArray();

        //Close top object.
        jWriter.endObject();
        jWriter.close();

        // verify
        String str = w.toString();
        new JSONObject(str);
        assertEquals(expectedResult, str);
    }

    /**
     * Test a simple object with multiple keys of varying types
     */
    @Test
    public void test_WriteArrayComplex() throws Exception {

        final String expectedResult = "{\"complex_array\":[\"String1\",false,1,{\"string\":\"String2\"},[1,2.0,3]]}";

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);

        jWriter.object();
        jWriter.key("complex_array");
        jWriter.array();
        jWriter.value("String1");
        jWriter.value(false);
        jWriter.value(1);

        // Place an object
        jWriter.object();
        jWriter.key("string");
        jWriter.value("String2");
        jWriter.endObject();

        // Place an array
        jWriter.array();
        jWriter.value(1);
        jWriter.value((double) 2);
        jWriter.value((short) 3);
        jWriter.endArray();

        //Close top array.
        jWriter.endArray();
        jWriter.endObject();
        jWriter.close();

        // verify
        String str = w.toString();
        new JSONObject(str);
        assertTrue(str.equals(expectedResult));
    }

    /* ***************************** */
    /* All the error condition tests */
    /* ***************************** */

    /**
     * Test that setting a value in an object without defining its key fails.
     */
    @Test
    public void test_ObjectNoKeyValueFail() throws Exception {

        thrown.expect(IllegalStateException.class);
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.value(true);
        jWriter.endObject();
    }


    /**
     * Test that setting a value without a key (after another key/value was set), fails
     */
    @Test
    public void test_ObjectKeyValueNoKeyValueFail() throws Exception {

        thrown.expect(IllegalStateException.class);
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.object();
        jWriter.key("foo");
        jWriter.value(true);

        // This should die with IllegalStateException...
        jWriter.value(false);
        jWriter.endObject();
    }

    /**
     * Test that setting a key while not in an object fails
     */
    @Test
    public void test_NoObjectKeyFail() throws Exception {

        thrown.expect(IllegalStateException.class);

        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);

        // This should die.
        jWriter.key("foo");
    }

    /**
     * Test that setting a value while not in an array or object fails
     */
    @Test
    public void test_NoObjectValueFail() throws Exception {

        thrown.expect(IllegalStateException.class);
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);

        // This should die.
        jWriter.value("foo");
    }

    /**
     * Test that trying to set keys while in an array fails.
     */
    @Test
    public void test_ArrayKeyFail() throws Exception {

        thrown.expect(IllegalStateException.class);
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.array();

        // This should die.
        jWriter.key("foo");
    }

    /**
     * Test that trying operations after the writer has been closed fails.
     */
    @Test
    public void test_OptsAfterCloseFail() throws Exception {

        thrown.expect(IllegalStateException.class);
        StringWriter w = new StringWriter();
        JSONWriter jWriter = new JSONWriter(w);
        jWriter.array();
        jWriter.close();

        // This should die.
        jWriter.endArray();
    }
}
