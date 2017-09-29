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

public class SimpleXMLConstants {

    /**
     * This is a single line to use for verification, its broken out to make it easier to read.
     */
    public final static String strCompactSimpleJSON = "{" +
            "\"getValuesReturn\":{" +
                "\"return\":\"true\"," +
                "\"TextTag\":\"Text!\"," +
                "\"String\":[\"First item\",\"Second item\",\"Third item\"]," +
                "\"TagWithAttrsAndText\":{" +
                    "\"content\":\"Text!\"," +
                    "\"attr3\":\"value3\"," +
                    "\"attr2\":\"value2\"," +
                    "\"attr1\":\"value1\"" +
                "}," +
                "\"EmptyTag\":true," +
                "\"attribute\":{" +
                    "\"attrValue\":\"value\"" +
                "}," +
                "\"TagWithAttrs\":{" +
                    "\"attr3\":\"value3\"," +
                    "\"attr2\":\"value2\"," + "" +
                    "\"attr1\":\"value1\"" +
            "}}}";

    public final static String strVerboseSimpleJSON = "{\n" +
            "\n" +
            "   \"getValuesReturn\" : {\n" +
            "      \"return\" : \"true\",\n" +
            "      \"TextTag\" : \"Text!\",\n" +
            "      \"String\" : [\n" +
            "         \"First item\",\n" +
            "         \"Second item\",\n" +
            "         \"Third item\"\n" +
            "      ],\n" +
            "      \"TagWithAttrsAndText\" : {\n" +
            "         \"content\" : \"Text!\",\n" +
            "         \"attr3\" : \"value3\",\n" +
            "         \"attr2\" : \"value2\",\n" +
            "         \"attr1\" : \"value1\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"EmptyTag\" : true,\n" +
            "      \"attribute\" : {\n" +
            "         \"attrValue\" : \"value\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"TagWithAttrs\" : {\n" +
            "         \"attr3\" : \"value3\",\n" +
            "         \"attr2\" : \"value2\",\n" +
            "         \"attr1\" : \"value1\"\n" +
            "      }\n" +
            "   }\n" +
            "}\n";

    private SimpleXMLConstants() {
    }
}
