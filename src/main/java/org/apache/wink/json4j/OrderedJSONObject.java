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

package org.apache.wink.json4j;

import org.apache.wink.json4j.internal.Parser;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Extension of the basic JSONObject.  This class allows control of the serialization order of attributes.
 * The order in which items are put into the instance controls the order in which they are serialized out.  For example, the
 * last item put is the last item serialized.
 * <BR><BR>
 * JSON-able values are: null, and instances of String, Boolean, Number, JSONObject and JSONArray.
 * <BR><BR>
 * Instances of this class are not thread-safe.
 */
public class OrderedJSONObject extends JSONObject {

    private static final long serialVersionUID = -3269263069889337299L;
    private final ArrayList<String> order;

    /**
     * Create a new instance of this class.
     */
    public OrderedJSONObject() {
        super();
        this.order = new ArrayList<>();
    }

    /**
     * Create a new instance of this class from the provided JSON object string.
     * Note:  This is the same as calling new OrderedJSONObject(str, false).
     *
     * @param str The String of JSON to parse
     * @throws JSONException Thrown when the string passed is null, or malformed JSON..
     */
    public OrderedJSONObject(String str) throws JSONException {
        this(str, false);
    }

    /**
     * Create a new instance of this class from the provided JSON object string.
     *
     * @param str    The String of JSON to parse
     * @param strict Boolean flag indicating if strict mode should be used.  Strict mode means comments and unquoted strings are not allowed.
     * @throws JSONException Thrown when the string passed is null, or malformed JSON..
     */
    @SuppressWarnings("EmptyFinallyBlock")
    public OrderedJSONObject(String str, boolean strict) throws JSONException {
        super();
        this.order = new ArrayList<>();
        try (StringReader reader = new StringReader(str)) {
            (new Parser(reader, strict)).parse(true, this);
        } finally {
            /* */
        }
    }

    /**
     * Create a new instance of this class from the data provided from the reader.  The reader content must be a JSON object string.
     * Note:  The reader will not be closed, that is left to the caller.
     * Note:  This is the same as calling new OrderedJSONObject(rdr, false).
     *
     * @param rdr The reader from which to read the JSON to parse
     * @throws JSONException Thrown when the string passed is null, or malformed JSON..
     */
    public OrderedJSONObject(Reader rdr) throws JSONException {
        this(rdr, false);
    }

    /**
     * Create a new instance of this class from the data provided from the reader.  The reader content must be a JSON object string.
     * Note:  The reader will not be closed, that is left to the caller.
     *
     * @param rdr    The reader from which to read the JSON to parse
     * @param strict Boolean flag indicating if strict mode should be used.  Strict mode means comments and unquoted strings are not allowed.
     * @throws JSONException Thrown when the string passed is null, or malformed JSON..
     */
    public OrderedJSONObject(Reader rdr, boolean strict) throws JSONException {
        super();
        this.order = new ArrayList<>();
        (new Parser(rdr, strict)).parse(true, this);
    }

    /**
     * Create a new instance of this class from the data provided from the input stream.  The stream content must be a JSON object string.
     * Note:  The input stream content is assumed to be UTF-8 encoded.
     * Note:  The InputStream will not be closed, that is left to the caller.
     * Note:  This is the same as calling new OrderedJSONObject(is, false).
     *
     * @param is The InputStream from which to read the JSON to parse
     * @throws JSONException Thrown when the string passed is null, or malformed JSON..
     */
    public OrderedJSONObject(InputStream is) throws JSONException {
        this(is, false);
    }

    /**
     * Create a new instance of this class from the data provided from the input stream.  The stream content must be a JSON object string.
     * Note:  The input stream content is assumed to be UTF-8 encoded.
     * Note:  The InputStream will not be closed, that is left to the caller.
     *
     * @param is     The InputStream from which to read the JSON to parse
     * @param strict Boolean flag indicating if strict mode should be used.  Strict mode means comments and unquoted strings are not allowed.
     * @throws JSONException Thrown when the string passed is null, or malformed JSON..
     */
    public OrderedJSONObject(InputStream is, boolean strict) throws JSONException {
        super();
        if (null == is) {
            throw new JSONException("InputStream cannot be null");
        }
        this.order = new ArrayList<>();
        try (InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8)) {
            (new Parser(isr, strict)).parse(true, this);
        } catch (IOException ioe) {
            final JSONException jEx = new JSONException("Failed to parse inputstram");
            jEx.initCause(ioe);
            throw jEx;
        }
    }

    /**
     * Create a new instance of this class using the contents of the provided map.
     * The contents of the map should be values considered JSONable.
     *
     * @param map The map of key/value pairs to insert into this JSON object
     * @throws JSONException        Thrown when contents in the map cannot be made JSONable.
     * @throws NullPointerException Thrown if the map is null, or a key in the map is null..
     */
    public OrderedJSONObject(Map map) throws JSONException {
        super();
        this.order = new ArrayList<>();
        Set set = map.keySet();
        if (set != null) {
            Iterator itr = set.iterator();
            if (itr != null) {
                while (itr.hasNext()) {
                    Object key = itr.next();
                    String sKey = key.toString();
                    this.put(sKey, map.get(key));
                }
            }
        }
    }

    /**
     * Method to put a JSON'able object into the instance.  Note that the order of initial puts controls the order of serialization.
     * Meaning that the first time an item is put into the object determines is position of serialization.  Subsequent puts with the same
     * key replace the existing entry value and leave serialization position alone.  For moving the position, the object must be removed,
     * then re-put.
     *
     * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
     */
    @Override
    public Object put(Object key, Object value) {
        Object val = super.put(key, value);
        if (!this.order.contains(key)) {
            this.order.add((String)key);
        }
        return val;
    }

    /**
     * Returns the ordered set of keys for this object
     * @return - ordered set of keys
     */
    @Override
    public Iterator<String> keys() {
        return orderedKeys();
    }

    /**
     * Returns the ordered set of keys for this object
     * @return - ordered set of keys
     */
    @Override
    public Iterator<String> orderedKeys() {
        return this.order.iterator();
    }

    /**
     * Method to remove an entry from the OrderedJSONObject instance.  The
     * key cannot be <tt>null</tt>
     *
     * @param key key of the object to be removed
     * @return - object that was removed
     * @see java.util.HashMap#remove(java.lang.Object)
     */
    @Override
    public Object remove(Object key) {
        Object retVal = super.remove(key);
        this.order.removeIf(key::equals);
        return retVal;
    }

    /**
     * (non-Javadoc)
     *
     * @see java.util.HashMap#clear()
     */
    @Override
    public void clear() {
        super.clear();
        this.order.clear();
    }

    /**
     * Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.
     */
    @Override
    public Object clone() {
        try {
            final OrderedJSONObject clone = new OrderedJSONObject(this);
            final Iterator<String> thisOrder = this.keys();
            clone.order.clear();
            while (thisOrder.hasNext()) {
                clone.order.add(thisOrder.next());
            }
            return clone;
        } catch (JSONException jEx) {
            throw new RuntimeException(jEx);
        }
    }
}
