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

/**
 * Basic junit imports.
 */

import org.apache.wink.json4j.JSON;
import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONArtifact;
import org.apache.wink.json4j.JSONObject;
import org.apache.wink.json4j.tests.utils.VerifyUtils;
import org.apache.wink.json4j.utils.XML;
import org.junit.Test;

import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.Assert.*;

/**
 * Tests for the basic Java JSON model parser
 */
public class JSONParserTests {

    /**
     * Test a basic transform of an XML file to a JSON string, reparse with generic parser to validate generic parser,
     * then with compact emit for checking.
     *
     * @see XML
     */
    @SuppressWarnings("EmptyFinallyBlock")
    @Test
    public void testJSONGenericObjectParse() throws Exception {
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream("simple.xml")) {
            final String json = XML.toJson(is);
            final JSONArtifact jsonA = JSON.parse(json);

            assertTrue(jsonA instanceof JSONObject);
            VerifyUtils.verifyJsonObjectMatchesSimpleDotXml((JSONObject) jsonA);
        } finally {
            /* */
        }
    }

    /**
     * Test a basic parse of a JSONArray in text form
     * then with compact emit for checking.
     */
    @Test
    public void testJSONGenericArrayParse() throws Exception {

        final String json = "[ \"foo\", true, 311, null ]";
        final JSONArtifact jsonA = JSON.parse(json);
        assertNotNull(jsonA);
        assertTrue(jsonA instanceof JSONArray);

        final JSONArray jArray = (JSONArray) jsonA;
        assertEquals(4, jArray.length());
        assertEquals("foo", jArray.get(0));
        assertEquals(Boolean.TRUE, jArray.get(1));
        assertEquals(311, jArray.get(2));
        assertNull(jArray.get(3));
    }

    /**
     * Test a basic parse of a JSONArray that had starting whitespace in text form
     * then with compact emit for checking.
     */
    @Test
    public void testJSONGenericObjectParse_startingWhitespace() throws Exception {
        final String json = "\t\t\t    \b\n\f\r   \t\t  { \"foo\": true, \"bar\": 311, \"noVal\": null }";
        final JSONArtifact jsonA = JSON.parse(json);
        assertNotNull(jsonA);
        assertTrue(jsonA instanceof JSONObject);

        final JSONObject jObj = (JSONObject) jsonA;
        assertEquals(3, jObj.length());
        assertEquals(Boolean.TRUE, jObj.get("foo"));
        assertEquals(311, jObj.get("bar"));
        assertNull(jObj.get("noVal"));
    }

    /**
     * Test a basic parse of a JSONArray that had starting whitespace in text form
     * then with compact emit for checking.
     */
    @Test
    public void testJSONGenericArrayParse_startingWhitespace() throws Exception {
            final String json = "\t\t\t    \b\n\f\r   \t\t  [ \"foo\", true, 311, null ]";
            final JSONArtifact jsonA = JSON.parse(json);
            assertNotNull(jsonA);
            assertTrue(jsonA instanceof JSONArray);

            final JSONArray jArray = (JSONArray) jsonA;
            assertEquals(4, jArray.length());
            assertEquals("foo", jArray.get(0));
            assertEquals(Boolean.TRUE, jArray.get(1));
            assertEquals(311, jArray.get(2));
            assertNull(jArray.get(3));
    }
}
