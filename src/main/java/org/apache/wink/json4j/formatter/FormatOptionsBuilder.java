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
 * Builder class for <tt>FormatOptions</tt> instances
 */
public interface FormatOptionsBuilder {
    FormatOptions build();

    FormatOptionsBuilder setFormat(FormatOptions.Format format);
    FormatOptionsBuilder setEscapeForwardSlashes(boolean flag);
    FormatOptionsBuilder setEmptyArrayOnSameLine(boolean flag);
    FormatOptionsBuilder setNewlineString(String newline);
    FormatOptionsBuilder setIndentString(String indent);

    /**
     * Returns a new instance of a <tt>FormatOptions</tt> object
     * which uses all the defaults
     * @return new instance with default formatting options
     * @see FormatOptions
     */
    static FormatOptions basic() {
        return new FormatOptionsBuilderImpl().build();
    }
}
