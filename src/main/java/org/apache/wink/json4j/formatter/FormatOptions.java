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

/**
 * This class allows configurability on the output formatting when the JSON
 * is written out to a string.
 *
 * If <tt>Format.Compact</tt> is set, the only option used is <tt>#escapeForwardSlashes</tt>.
 * Otherwise, the serializer will use all the settings when determining how to format the
 * <tt>JSONObject</tt> or <tt>JSONArray</tt> to a string.
 *
 * The default value for newline is <tt>System.lineseparator()</tt><br/>
 * The default value for the indent is <tt>\t</tt><br/>
 * The default value for empty array on same line is false, which will put the
 *   open/close brackets on different lines even if there are no values in the array
 * The default is to escape the forward slash character.  The JSON spec says this
 *   escaping is optional
 *
 *   @see org.apache.wink.json4j.internal.Serializer
 *   @see org.apache.wink.json4j.internal.SerializerVerbose
 */
public interface FormatOptions {

    enum Format {
        Verbose,
        Compact
    }

    boolean emptyObjectsAndArrayClosuresOnSameLine();
    boolean escapeForwardSlashes();
    String indentString();
    boolean isCompact();
    boolean isVerbose();
    String newline();
 }