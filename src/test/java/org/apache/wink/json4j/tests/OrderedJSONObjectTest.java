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

import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;
import org.apache.wink.json4j.OrderedJSONObject;
import org.junit.Test;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the basic Java OrderedJSONObject model
 */
public class OrderedJSONObjectTest {

    @Test
    public void test_OrderedJson() throws Exception {
        final String expectedJSON = "{\"attribute\":\"foo\",\"number\":100.959,\"boolean\":true}";

        OrderedJSONObject obj = new OrderedJSONObject(expectedJSON);
        assertEquals(expectedJSON, obj.write(false));
    }

    /**
     * Rest of removing the first and then adding it back in to see if it shifts to the end.
     */
    @Test
    public void test_OrderedJsonMove() throws Exception {
        final String expectedJSON = "{\"attribute\":\"foo\",\"number\":100.959,\"boolean\":true}";
        final String expectedReorderedJSON = "{\"number\":100.959,\"boolean\":true,\"attribute\":\"foo\"}";

        OrderedJSONObject obj = new OrderedJSONObject(expectedJSON);
        String attribute = (String) obj.remove("attribute");
        obj.put("attribute", attribute);

        Iterator order = obj.getOrder();

        String[] expectedOrder = new String[]{"number", "boolean", "attribute"};
        for (int i = 0; i < expectedOrder.length; i++) {
            assertTrue(order.hasNext());
            assertEquals(expectedOrder[i], order.next());
        }
        assertEquals(expectedReorderedJSON, obj.write(false));
    }

    /**
     * Test of removing two entries and ensuring the order is as expected in output
     */
    @Test
    public void test_OrderedJsonRemove() throws Exception {
        final String JSON = "{\"attribute\":\"foo\", \"number\":100.959, \"boolean\":true, \"banana\":\"sherbert\"}";
        final String expectedJSON = "{\"number\":100.959,\"banana\":\"sherbert\"}";

        OrderedJSONObject obj = new OrderedJSONObject(JSON);
        obj.remove("attribute");
        obj.remove("boolean");
        assertEquals(expectedJSON, obj.write(false));
    }

    /**
     * Test of removing two entries and ensuring the order is as expected in output
     */
    @Test
    public void test_OrderedJsonRemoveMove() throws Exception {
        final String JSON = "{\"attribute\":\"foo\", \"number\":100.959, \"boolean\":true, \"banana\":\"sherbert\"}";
        final String expectedJSON = "{\"number\":100.959,\"banana\":\"sherbert\",\"boolean\":true}";
        OrderedJSONObject obj = new OrderedJSONObject(JSON);
        obj.remove("attribute");
        Boolean b = (Boolean) obj.remove("boolean");
        obj.put("boolean", b);
        assertEquals(expectedJSON, obj.write(false));
    }

    /**
     * Test of multiple puts not affecting ordering.
     */
    @Test
    public void test_OrderedJsonMultiPut() throws Exception {

        OrderedJSONObject obj = new OrderedJSONObject();

        obj.put("Entry1", "Value1");
        obj.put("Entry2", "Value2");
        obj.put("Entry3", "Value3");
        obj.put("Entry2", "ReplacedValue2");

        Iterator order = obj.getOrder();
        String key = order.next().toString();
        assertEquals("Entry1", key);
        assertEquals("Value1", obj.getString(key));
        key = order.next().toString();
        assertEquals("Entry2", key);
        assertEquals("ReplacedValue2", obj.getString(key));
        key = order.next().toString();
        assertEquals("Entry3", key);
        assertEquals("Value3", obj.getString(key));
    }

    /**
     * Test of clone
     */
    @Test
    public void test_OrderedClone() throws Exception {

        OrderedJSONObject obj = new OrderedJSONObject();

        obj.put("Entry1", "Value1");
        obj.put("Entry2", "Value2");
        obj.put("Entry3", "Value3");
        obj.put("Entry2", "ReplacedValue2");

        OrderedJSONObject clone = (OrderedJSONObject) obj.clone();
        obj = null;

        Iterator order = clone.getOrder();
        verifyNextAttribute(order, clone, "Entry1", "Value1");
        verifyNextAttribute(order, clone, "Entry2", "ReplacedValue2");
        verifyNextAttribute(order, clone, "Entry3", "Value3");
    }

    /**
     * Test of ensuring an object loaded via an Ordered parse remains in the proper order.
     */
    @Test
    public void test_OrderedJsonRead() throws Exception {

        try (InputStream is  = this.getClass().getClassLoader().getResourceAsStream("utf8_ordered.json")) {

            final OrderedJSONObject obj = new OrderedJSONObject(is);

            Iterator order = obj.getOrder();
            assertEquals(3, obj.length());

            verifyNextAttribute(order, obj, "First_Entry", "Entry One");
            Object entryValue2 = obj.get("Second_Entry");
            verifyNextAttribute(order, obj, "Second_Entry", entryValue2);
            verifyNextAttribute(order, obj, "Third_Entry", 3);

            //Validate the nested JSONObject was also constructed in an ordered manner.
            final OrderedJSONObject subObj = (OrderedJSONObject) entryValue2;
            order = subObj.getOrder();
            verifyNextAttribute(order, subObj, "name", "Demo Object");
            Object demosArray = subObj.get("demos");
            verifyNextAttribute(order, subObj, "demos", demosArray);

        } finally {
            /* */
        }

    }

    public void test_toString() {
        try {
            JSONObject obj = new JSONObject();
            obj.put("attribute", "foo");
            obj.put("number", new Double(100.959));
            String jsonStr = obj.write();
            String jsonStr2 = obj.toString();
            assertTrue(jsonStr.equals(jsonStr2));
        } catch (Exception ex) {
            ex.printStackTrace();
            assertTrue(false);
        }
    }

    private void verifyNextAttribute(Iterator iter, JSONObject obj, String expectedKey, Object expectedValue) throws JSONException {
        Objects.requireNonNull(iter);
        final String key = iter.next().toString();
        assertEquals(expectedKey, key);
        assertEquals(expectedValue, obj.get(key));
    }
}
