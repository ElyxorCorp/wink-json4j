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

import org.apache.wink.json4j.JSONArtifact;
import org.apache.wink.json4j.JSONObject;
import org.apache.wink.json4j.internal.BeanSerializer;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Tests for the basic Java Bean serializer
 * <p>
 * Note: Using the java Date class is a bad example because the <tt>BeanSerializer</tt>
 * looks at the getXXXX methods, then stick the value in a map with a key of XXXX.
 * <tt>java.util.Date</tt> has deprecated get methods making this difficult
 * and confusing to test with this object.
 */
public class BeanSerializerTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Date date;

    @Before
    public void setUp() throws Exception {
        date = new SimpleDateFormat("MMM dd, yyyy HH:mm").parse("Oct 26, 1985 01:21");
    }

    /**
     * Test the no-arg constructor.
     */
    @Test
    public void test_Date_WithSuper() throws Exception {

        JSONArtifact ja = BeanSerializer.toJson(date, true);
        assertTrue(ja instanceof JSONObject);
        JSONObject j = (JSONObject) ja;
        assertEquals("java.util.Date", j.get("class"));
        assertEquals("85 and not 1985 because getYear() on Date is deprecated for good reason", 85, j.get("year"));
        assertEquals(9, j.get("month"));  // zero-based month in Java
        assertEquals(1, j.get("hours"));
        assertEquals(21, j.get("minutes"));
    }

    /**
     * Test the no-arg constructor.
     */
    @Test
    public void test_Date_WithOutSuper() throws Exception {

        JSONArtifact ja = BeanSerializer.toJson(date, false);
        assertTrue(ja instanceof JSONObject);
        JSONObject j = (JSONObject) ja;
        assertNull(j.opt("class"));
        assertEquals("85 and not 1985 because getYear() on Date is deprecated for good reason", 85, j.get("year"));
        assertEquals(9, j.get("month"));  // zero-based month in Java
        assertEquals(1, j.get("hours"));
        assertEquals(21, j.get("minutes"));
    }

    @Test
    public void test_Date_RebuildWithOutSuper() throws Exception {

        JSONArtifact ja = BeanSerializer.toJson(date, false);
        assertTrue(ja instanceof JSONObject);
        JSONObject j = (JSONObject) ja;
        assertNull(j.opt("class"));

        Date date2 = (Date) BeanSerializer.fromJson(j);
        assertEquals("85 and not 1985 because getYear() on Date is deprecated for good reason", 85, j.get("year"));
        assertEquals(9, date2.getMonth());  // zero-based month in Java
        assertEquals(1, date2.getHours());
        assertEquals(21, date2.getMinutes());
    }

}
