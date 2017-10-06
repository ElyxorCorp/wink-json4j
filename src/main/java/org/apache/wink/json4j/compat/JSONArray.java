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

package org.apache.wink.json4j.compat;

import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/**
 *
 */
public interface JSONArray {

    // ------- data accessor methods -------
    Object get(int index) throws JSONException;

    boolean getBoolean(int index) throws JSONException;

    double getDouble(int index) throws JSONException;

    int getInt(int index) throws JSONException;

    long getLong(int index) throws JSONException;

    short getShort(int index) throws JSONException;

    String getString(int index) throws JSONException;

    JSONArray getJSONArray(int index) throws JSONException;

    JSONObject getJSONObject(int index) throws JSONException;

    // ------- modifier methods -------

    String join(String separator);

    JSONArray put(boolean value);

    JSONArray put(Collection value) throws JSONException;

    JSONArray put(double value);

    JSONArray put(int value);

    JSONArray put(int index, boolean value) throws JSONException;

    JSONArray put(int index, Collection value) throws JSONException;

    JSONArray put(int index, double value) throws JSONException;

    JSONArray put(int index, int value) throws JSONException;

    JSONArray put(int index, long value) throws JSONException;

    JSONArray put(int index, short value) throws JSONException;

    JSONArray put(int index, Map value) throws JSONException;

    JSONArray put(int index, Object value) throws JSONException;

    JSONArray put(long value);

    JSONArray put(short value);

    JSONArray put(Map value) throws JSONException;

    JSONArray put(Object value) throws JSONException;

    Object remove(int index);

    // ------- utility methods -------

    boolean isNull(int index);

    int length();

    // ------- output methods -------

    String toString();

    String toString(int indent);

    Writer write(Writer w) throws JSONException;
}
