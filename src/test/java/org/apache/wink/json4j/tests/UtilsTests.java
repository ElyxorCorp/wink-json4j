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

import org.apache.wink.json4j.*;
import org.apache.wink.json4j.tests.utils.ComplexXMLConstants;
import org.apache.wink.json4j.tests.utils.LongTextXMLConstants;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests that insure our test data is consistent
 */
public class UtilsTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * The compact and verbose forms of the long-text fixture are just different renderings
     * of the same data, so parsing them back should produce equal JSONObjects, and the two
     * should also preserve the identical attribute/child ordering as each other.
     */
    @Test
    public void testLongTextConstants_CompactAndVerboseParseToEqualObjects() throws JSONException {
        OrderedJSONObject compact = new OrderedJSONObject(LongTextXMLConstants.strCompactLongTextJSON);
        OrderedJSONObject verbose = new OrderedJSONObject(LongTextXMLConstants.strVerboseLongTextJSON);

        assertEquals(compact, verbose);
        assertSameOrder(compact, verbose);
    }

    /**
     * The compact and verbose forms of the complex fixture are just different renderings
     * of the same data, so parsing them back should produce equal JSONObjects, and the two
     * should also preserve the identical attribute/child ordering as each other.
     */
    @Test
    public void testComplexConstants_CompactAndVerboseParseToEqualObjects() throws JSONException {
        OrderedJSONObject compact = new OrderedJSONObject(ComplexXMLConstants.strCompactComplexJSON);
        OrderedJSONObject verbose = new OrderedJSONObject(ComplexXMLConstants.strVerboseComplexJSON);

        assertEquals(compact, verbose);
        assertSameOrder(compact, verbose);
    }

    /**
     * Recursively verifies that two parsed JSON values contain the same data in the same
     * key/element order at every level, not just the same data (which HashMap-based equals()
     * would already confirm regardless of order).
     */
    private static void assertSameOrder(Object expected, Object actual) throws JSONException {
        assertEquals(expected.getClass(), actual.getClass());

        if (expected instanceof OrderedJSONObject) {
            Iterator<String> expectedKeys = ((OrderedJSONObject) expected).keys();
            Iterator<String> actualKeys = ((OrderedJSONObject) actual).keys();

            while (expectedKeys.hasNext()) {
                assertTrue("actual object has fewer keys than expected", actualKeys.hasNext());
                String key = expectedKeys.next();
                assertEquals("key order differs", key, actualKeys.next());
                assertSameOrder(((OrderedJSONObject) expected).get(key), ((OrderedJSONObject) actual).get(key));
            }
            assertFalse("actual object has more keys than expected", actualKeys.hasNext());
        } else if (expected instanceof JSONArray) {
            JSONArray expectedArr = (JSONArray) expected;
            JSONArray actualArr = (JSONArray) actual;
            assertEquals("array size differs", expectedArr.size(), actualArr.size());

            for (int i = 0; i < expectedArr.size(); i++) {
                assertSameOrder(expectedArr.get(i), actualArr.get(i));
            }
        } else {
            assertEquals(expected, actual);
        }
    }

}