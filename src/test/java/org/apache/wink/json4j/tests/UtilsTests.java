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

import org.apache.wink.json4j.*;
import org.apache.wink.json4j.tests.utils.ComplexXMLConstants;
import org.apache.wink.json4j.tests.utils.LongTextXMLConstants;
import org.apache.wink.json4j.tests.utils.SimpleXMLConstants;
import org.apache.wink.json4j.utils.XML;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests that insure our test data is consistent
 */
public class UtilsTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * The compact and verbose forms of the long-text fixture are just different renderings
     * of the same data, so parsing them back should produce equal JSONObjects regardless of
     * whitespace or key order.
     */
    @Test
    public void testLongTextConstants_CompactAndVerboseParseToEqualObjects() throws JSONException {
        JSONObject compact = new JSONObject(LongTextXMLConstants.strCompactLongTextJSON);
        JSONObject verbose = new JSONObject(LongTextXMLConstants.strVerboseLongTextJSON);

        assertEquals(compact, verbose);
    }

}