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

package org.apache.wink.json4j.formatter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FormatOptionsBuilderTest {

    @Test
    public void testBuild() throws Exception {
        FormatOptionsBuilder builder = new FormatOptionsBuilderImpl();
        FormatOptions formatOptions = builder
                .setFormat(FormatOptions.Format.Verbose)
                .setEmptyArrayOnSameLine(true)
                .setEscapeForwardSlashes(false)
                .setIndentString("  ")
                .setNewlineString("\t")
                .build();

        assertTrue(formatOptions.isVerbose());
        assertTrue(formatOptions.emptyObjectsAndArrayClosuresOnSameLine());
        assertFalse(formatOptions.escapeForwardSlashes());
        assertEquals("  ", formatOptions.indentString());
        assertEquals("\t", formatOptions.newline());
    }
}