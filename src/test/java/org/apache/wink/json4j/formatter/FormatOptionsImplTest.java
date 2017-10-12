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

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FormatOptionsImplTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private FormatOptionsImpl target;

    @Before
    public void setUp() {
        target = new FormatOptionsImpl();
    }

    @Test
    public void testFormatOptionDefaults() throws Exception {
        assertFalse(target.emptyObjectsAndArrayClosuresOnSameLine());
        assertTrue(target.escapeForwardSlashes());
        assertFalse(target.spaceBetweenKeyAndColon());
        assertTrue(target.isCompact());
        assertFalse(target.isVerbose());
        assertEquals("\t", target.indentString());
        assertEquals(System.lineSeparator(), target.newline());
    }

    @Test
    public void setEmptyArrayOnSameLine_returnsObject() throws Exception {
        assertEquals(target, target.setEmptyObjectsAndArrayClosuresOnSameLine(true));
        assertTrue(target.emptyObjectsAndArrayClosuresOnSameLine());
    }

    @Test
    public void setEscapeForwardSlashes_returnsObject() throws Exception {
        assertEquals(target, target.setEscapeForwardSlashes(false));
        assertFalse(target.escapeForwardSlashes());
    }

    @Test
    public void setSpaceBetweenKeyAndColon_returnsObject() throws Exception {
        assertEquals(target, target.setSpaceBetweenKeyAndColon(false));
        assertFalse(target.spaceBetweenKeyAndColon());
    }

    @Test
    public void setIndentString_returnsObject() throws Exception {
        assertEquals(target, target.setIndentString("  "));
        assertEquals("  ", target.indentString());
    }

    @Test
    public void setIndentString_withNull_throwsException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("indent string cannot be null");
        target.setIndentString(null);
    }

    @Test
    public void setFormat_returnsObject() throws Exception {
        assertEquals(target, target.setFormat(FormatOptions.Format.Compact));
    }

    @Test
    public void isCompact() throws Exception {
        target.setFormat(FormatOptions.Format.Compact);
        assertTrue(target.isCompact());
    }

    @Test
    public void isVerbose() throws Exception {
        target.setFormat(FormatOptions.Format.Verbose);
        assertTrue(target.isVerbose());
    }

    @Test
    public void setNewline_returnsObject() throws Exception {
        assertEquals(target, target.setNewline("\n"));
        assertEquals("\n", target.newline());
    }

    @Test
    public void setNewline_withNull_throwsException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("newline string cannot be null");
        target.setNewline(null);
    }

}