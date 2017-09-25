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

import org.apache.wink.json4j.JSONObject;
import org.apache.wink.json4j.JSONStringer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the basic Java JSONStringer
 * JSONStringer extends JSONWriter, so only test
 * supplementary methods
 */
public class JSONStringerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * Test the constructor.
     */
    @Test
    public void test_new() {
        new JSONStringer();
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_WriteEmptyObject() throws Exception {

        JSONStringer jStringer = new JSONStringer();
        jStringer.object();
        jStringer.endObject();
        String str = jStringer.toString();
        // Verify it parses.
        new JSONObject(str);
        assertEquals("{}", str);
    }

    /**
     * Test the String empty object constructor.
     */
    @Test
    public void test_WriteEmptyObjectClose() throws Exception {

        JSONStringer jStringer = new JSONStringer();
        jStringer.object();
        jStringer.close();
        String str = jStringer.toString();
        // Verify it parses.
        new JSONObject(str);
        assertEquals("{}", str);
    }

    /**
     * Test that trying operations after the stringer was returned that they fail.
     */
    @Test
    public void test_OptsAfterToStringFail() throws Exception {
        thrown.expect(IllegalStateException.class);

            JSONStringer jStringer = new JSONStringer();
            jStringer.array();
            jStringer.toString();

            // This should die.
            jStringer.endArray();
    }

    /**
     * Test that trying operations after the stringer was returned that they fail.
     */
    @Test
    public void test_OptsAfterToCloseOk() throws Exception {
        JSONStringer jStringer = new JSONStringer();
        jStringer.array();
        jStringer.close();
        jStringer.endArray();
    }
}
