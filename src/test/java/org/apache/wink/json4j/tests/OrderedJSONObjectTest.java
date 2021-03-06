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
import org.hamcrest.core.Is;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Tests for the basic Java OrderedJSONObject model
 */
@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class OrderedJSONObjectTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_OrderedJson() throws Exception {
        final String expectedJSON = "{\"attribute\":\"foo\",\"number\":100.959,\"boolean\":true}";

        final OrderedJSONObject obj = new OrderedJSONObject(expectedJSON);
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

        Iterator<String> order = obj.orderedKeys();

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

        final OrderedJSONObject obj = new OrderedJSONObject();

        obj.put("Entry1", "Value1");
        obj.put("Entry2", "Value2");
        obj.put("Entry3", "Value3");
        obj.put("Entry2", "ReplacedValue2");

        final Iterator<String> order = obj.orderedKeys();
        String key = order.next();
        assertEquals("Entry1", key);
        assertEquals("Value1", obj.getString(key));
        key = order.next();
        assertEquals("Entry2", key);
        assertEquals("ReplacedValue2", obj.getString(key));
        key = order.next();
        assertEquals("Entry3", key);
        assertEquals("Value3", obj.getString(key));
    }

    @Test
    public void test_putNullKey_throwsException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("key must not be null");
        new OrderedJSONObject().put(null, 311);
    }

    @Test
    public void test_OrderedPutKeyIsNotAString_throwsException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("key must be a String");
        new OrderedJSONObject().put(Integer.valueOf(311), 311);
    }

    /**
     * Test of clone
     */
    @Test
    public void test_OrderedClone() throws Exception {

        final OrderedJSONObject obj = new OrderedJSONObject();

        obj.put("Entry1", "Value1");
        obj.put("Entry2", "Value2");
        obj.put("Entry3", "Value3");
        obj.put("Entry2", "ReplacedValue2");

        final OrderedJSONObject clone = (OrderedJSONObject) obj.clone();

        final Iterator<String> order = clone.orderedKeys();
        verifyNextAttribute(order, clone, "Entry1", "Value1");
        verifyNextAttribute(order, clone, "Entry2", "ReplacedValue2");
        verifyNextAttribute(order, clone, "Entry3", "Value3");

        obj.put("3", "foo");
        assertTrue(obj.has("3"));
        assertFalse(clone.has("3"));
        clone.orderedKeys().forEachRemaining(key->assertNotEquals("3", key));
    }

    /**
     * Test of ensuring an object loaded via an Ordered parse remains in the proper order.
     */
    @SuppressWarnings("EmptyFinallyBlock")
    @Test
    public void test_OrderedJsonRead() throws Exception {

        try (InputStream is  = this.getClass().getClassLoader().getResourceAsStream("utf8_ordered.json")) {

            final OrderedJSONObject obj = new OrderedJSONObject(is);
            assertEquals(3, obj.length());

            final Iterator<String> orderIter = obj.orderedKeys();
            verifyNextAttribute(orderIter, obj, "First_Entry", "Entry One");
            final Object entryValue2 = obj.get("Second_Entry");
            verifyNextAttribute(orderIter, obj, "Second_Entry", entryValue2);
            verifyNextAttribute(orderIter, obj, "Third_Entry", 3);

            //Validate the nested JSONObject was also constructed in an ordered manner.
            final OrderedJSONObject subObj = (OrderedJSONObject) entryValue2;
            final Iterator<String> subOrderIter = subObj.orderedKeys();
            verifyNextAttribute(subOrderIter, subObj, "name", "Demo Object");
            final Object demosArray = subObj.get("demos");
            verifyNextAttribute(subOrderIter, subObj, "demos", demosArray);

        } finally {
            /* */
        }
    }

    @Test
    public void test_toString_isSymmetrical() throws Exception {

            final JSONObject obj = new JSONObject();
            obj.put("attribute", "foo");
            obj.put("number", new Double(100.959));
            final String jsonStr = obj.write();
            final String jsonStr2 = obj.toString();
            assertEquals(jsonStr, jsonStr2);
    }

    private void verifyNextAttribute(Iterator<String> iter, JSONObject obj, String expectedKey, Object expectedValue) throws JSONException {
        Objects.requireNonNull(iter);
        final String key = iter.next();
        assertEquals(expectedKey, key);
        assertEquals(expectedValue, obj.get(key));
    }
}
