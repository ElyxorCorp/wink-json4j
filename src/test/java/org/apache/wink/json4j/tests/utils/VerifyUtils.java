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

package org.apache.wink.json4j.tests.utils;

import org.apache.wink.json4j.JSONArray;
import org.apache.wink.json4j.JSONException;
import org.apache.wink.json4j.JSONObject;

import java.util.Iterator;
import java.util.Objects;

import static org.junit.Assert.*;

public class VerifyUtils {
    private VerifyUtils() {
    }

    public static void verifyKeys(Iterator keys, String[] sKeys) {
        Objects.requireNonNull(keys);
        Objects.requireNonNull(sKeys);

        int i = 0;
        while (keys.hasNext()) {
            String key = (String) keys.next();
            String sKey = sKeys[i];
            i++;
            assertTrue(key.equals(sKey));
        }
    }

    /**
     * Verifies the rules described in the Javadoc for <code>XML</code>
     * @param obj The object to verify
     * @throws JSONException
     * @see org.apache.wink.json4j.utils.XML
     */
    public static void verifyJsonObjectMatchesSimpleDotXml(JSONObject obj) throws JSONException {
        assertNotNull(obj);
        assertTrue(obj.has("getValuesReturn"));
        final JSONObject getValueReturn = obj.getJSONObject("getValuesReturn");

        assertTrue(getValueReturn.has("return"));
        assertEquals("true", getValueReturn.getString("return"));

        assertTrue(getValueReturn.has("attribute"));
        assertEquals("value", getValueReturn.getJSONObject("attribute").getString("attrValue"));

        assertTrue(getValueReturn.has("String"));
        assertTrue(getValueReturn.get("String") instanceof JSONArray);
        assertEquals("First item", getValueReturn.getJSONArray("String").get(0));
        assertEquals("Second item", getValueReturn.getJSONArray("String").get(1));
        assertEquals("Third item", getValueReturn.getJSONArray("String").get(2));

        assertTrue(getValueReturn.has("TextTag"));
        assertEquals("Text!", getValueReturn.getString("TextTag"));

        assertTrue(getValueReturn.has("EmptyTag"));
        assertEquals(Boolean.TRUE, getValueReturn.get("EmptyTag"));

        assertTrue(getValueReturn.has("TagWithAttrs"));
        final JSONObject tagWithAttrs = getValueReturn.getJSONObject("TagWithAttrs");
        assertNotNull(tagWithAttrs);
        assertEquals(3, tagWithAttrs.length());
        assertEquals("value1", tagWithAttrs.getString("attr1"));
        assertEquals("value2", tagWithAttrs.getString("attr2"));
        assertEquals("value3", tagWithAttrs.getString("attr3"));

        assertTrue(getValueReturn.has("TagWithAttrsAndText"));
        final JSONObject tagWithAttrsAndText = getValueReturn.getJSONObject("TagWithAttrsAndText");
        assertNotNull(tagWithAttrs);
        assertEquals(4, tagWithAttrsAndText.length());
        assertEquals("Text!", tagWithAttrsAndText.getString("content"));
        assertEquals("value1", tagWithAttrsAndText.getString("attr1"));
        assertEquals("value2", tagWithAttrsAndText.getString("attr2"));
        assertEquals("value3", tagWithAttrsAndText.getString("attr3"));
    }
}
