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

package org.apache.wink.json4j.internal;

import org.apache.wink.json4j.formatter.FormatOptions;
import org.apache.wink.json4j.formatter.FormatOptionsBuilderImpl;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Internal class for handling the serialization of JSON objects in a verbose
 * format, meaning newlines and indention.
 */
public class SerializerVerbose extends Serializer {

    /**
     * Internal tracker keeping indent position.
     */
    private int indent = 0;

    private SerializerVerbose() {
        super(null);
    }

    /**
     * Constructor
     *
     * @param writer The writer to serialize JSON to.
     */
    public SerializerVerbose(Writer writer) {
        super(writer, new FormatOptionsBuilderImpl().setFormat(FormatOptions.Format.Verbose).build());
    }

    /**
     * Constructor
     *
     * @param writer        The writer to serialize JSON to.
     * @param formatOptions format options to use.
     */
    public SerializerVerbose(Writer writer, FormatOptions formatOptions) {
        super(writer, formatOptions);
    }

    /**
     * Constructor.
     *
     * @param writer       The writer to serialize JSON to.
     * @param indentSpaces How many spaces to indent by.
     *                     The default indent is the TAB (<tt>\t</tt>) character.
     */
    public SerializerVerbose(Writer writer, int indentSpaces) {
        super(writer);
        if (indentSpaces < 0) {
            throw new IllegalArgumentException();
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < indentSpaces; i++) {
            sb.append(" ");
        }

        setFormatOptions(new FormatOptionsBuilderImpl()
                .setFormat(FormatOptions.Format.Verbose)
                .setIndentString(sb.toString())
                .build());
    }

    /**
     * Method to write a space to the output writer.
     *
     * @throws IOException Thrown if an error occurs during write.
     */
    @Override
    public void space() throws IOException {
        writeRawString(" ");
    }

    /**
     * Method to write a newline to the output writer.
     *
     * @throws IOException Thrown if an error occurs during write.
     */
    @Override
    public void newLine() throws IOException {
        writeRawString(formatOptions().newline());
    }

    /**
     * Method to write an indent to the output writer.
     *
     * @throws IOException Thrown if an error occurs during write.
     */
    @Override
    public void indent() throws IOException {
        for (int i = 0; i < indent; i++) {
            writeRawString(formatOptions().indentString());
        }
    }

    /**
     * Method to increase the indent depth of the output writer.
     */
    @Override
    public void indentPush() {
        indent++;
    }

    /**
     * Method to reduce the indent depth of the output writer.
     *
     * @throws IllegalStateException if the ident tries to pop below 0
     */
    @Override
    public void indentPop() {
        indent--;
        if (indent < 0) {
            throw new IllegalStateException();
        }
    }
}
