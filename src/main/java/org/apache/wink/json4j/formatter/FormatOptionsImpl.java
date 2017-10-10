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

class FormatOptionsImpl implements FormatOptions {

    private Format format = Format.Compact;
    private boolean emptyObjectsAndArrayClosuresOnSameLine = false;
    private boolean escapeForwardSlashes = true;
    private boolean spaceBetweenKeyAndColon = false;
    private String newlineStr = System.lineSeparator();
    private String indentStr = "\t";

    @Override
    public boolean emptyObjectsAndArrayClosuresOnSameLine() {
        return emptyObjectsAndArrayClosuresOnSameLine;
    }

    public FormatOptionsImpl setEmptyObjectsAndArrayClosuresOnSameLine(boolean flag) {
        emptyObjectsAndArrayClosuresOnSameLine = flag;
        return this;
    }

    @Override
    public boolean escapeForwardSlashes() {
        return escapeForwardSlashes;
    }

    public FormatOptionsImpl setEscapeForwardSlashes(boolean flag) {
        escapeForwardSlashes = flag;
        return this;
    }

    @Override
    public boolean spaceBetweenKeyAndColon() {
        return spaceBetweenKeyAndColon;
    }

    public FormatOptionsImpl setSpaceBetweenKeyAndColon(boolean flag) {
        spaceBetweenKeyAndColon = flag;
        return this;
    }

    @Override
    public String indentString() {
        return indentStr;
    }

    public FormatOptionsImpl setIndentString(String str) {
        if (null == str) {
            throw new IllegalArgumentException("indent string cannot be null");
        }
        indentStr = str;
        return this;
    }

    @Override
    public boolean isCompact() {
        return Format.Compact == format;
    }

    @Override
    public boolean isVerbose() {
        return Format.Verbose == format;
    }

    @Override
    public String newline() {
        return newlineStr;
    }

    public FormatOptionsImpl setNewline(String newline) {
        if (null == newline) {
            throw new IllegalArgumentException("newline string cannot be null");
        }
        newlineStr = newline;
        return this;
    }

    public FormatOptionsImpl setFormat(Format newFormat) {
        format = newFormat;
        return this;
    }
}
