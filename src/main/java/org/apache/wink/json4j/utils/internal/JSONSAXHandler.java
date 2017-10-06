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

package org.apache.wink.json4j.utils.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


/**
 * This class is a SAX extension to do conversion of XML to JSON.
 */
public class JSONSAXHandler extends DefaultHandler {
    /**
     * Logger code
     */
    private static final String CLASS_NAME = "org.apache.commons.json.utils.xml.transform.impl.JSONSAXHandler";
    private static final Logger logger                  = Logger.getLogger(CLASS_NAME,null);

    /**
     * The writer to stream the JSON text out to.
     */
    private final OutputStreamWriter osWriter;

    /**
     * The current JSON object being constructed from the current TAG being parsed.
     */
    private JSONObject current                    = null;

    /** 
     * The stack of the current JSON object position.
     */
    private Stack previousObjects                 = new Stack();

    /**
     * The toplevel containing JSON object.
     */
    private JSONObject head                       = null;

    /**
     * Whether or not to render the JSON text is a compact or indented format.
     */
    private boolean compact                       = false;

    /**
     * Constructor.
     * @param os The outputStream to write the resulting JSON to.  Same as JSONSAXHander(os,false);
     */
    public JSONSAXHandler(OutputStream os)  {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "JSONSAXHandler(OutputStream) <constructor>");

        this.osWriter = new OutputStreamWriter(os, StandardCharsets.UTF_8);
        this.compact  = true;

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "JSONSAXHandler(OutputStream) <constructor>");
    }

    /**
     * Constructor.
     * @param os The outputStream to write the resulting JSON to
     * @param verbose Whether or not to render the stream in a verbose (formatted), or compact form.
     */
    public JSONSAXHandler(OutputStream os, boolean verbose) {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "JSONSAXHandler(OutputStream, boolean) <constructor>");

        this.osWriter = new OutputStreamWriter(os,StandardCharsets.UTF_8);
        this.compact  = !verbose;

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "JSONSAXHandler(OutputStream, boolean) <constructor>");
    }


    /**
     * This function parses an iFix top level element and all its children.
     *
     * @param namespaceURI namespace
     * @param localName local name
     * @param qName q name
     * @param attrs attributes
     * @throws SAXException
     */
    public void startElement(String namespaceURI, String localName, String qName, Attributes attrs) throws SAXException {
        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "startElement(String,String,String,org.xml.sax.Attributes)");

        Properties props = new Properties();
        int attrLength = attrs.getLength();
        for (int i = 0; i < attrLength; i++) {
            props.put(attrs.getQName(i), attrs.getValue(i));
        }

        JSONObject obj = new JSONObject(localName, props);
        if (this.head == null) {
            this.head    = obj;
            this.current = head;
        } else {
            if (current != null) {
                this.previousObjects.push(current);
                this.current.addJSONObject(obj);
            }
            this.current  = obj;
        }

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "startElement(String,String,String,org.xml.sax.Attributes)");
    }

    /**
     * Function ends a tag in this iFix parser.
     */
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "endElement(String,String,String)");

        if (!previousObjects.isEmpty()) {
            this.current = (JSONObject)this.previousObjects.pop();
        } else {
            this.current = null;
        }

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "endElement(String,String,String)");
    }

    public void characters(char[] ch,
                           int start,
                           int length)
    throws SAXException {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "characters(char[], int, int)");

        String str = new String(ch,start,length);
        if (this.current.getTagText() != null) {
            str = this.current.getTagText() + str;
        }
        this.current.setTagText(str);

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "characters(char[], int, int)");
    }

    public void startDocument() throws SAXException {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "startDocument()");

        startJSON();

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "startDocument()");
    }

    public void endDocument() throws SAXException {
        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "endDocument()");

        endJSON();

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "endDocument()");
    }

    /**
     * Method to flush out anything remaining in the buffers.
     * @throws IOException Thrown if there is an error while flushing buffer
     */
    public void flushBuffer() throws IOException {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "flushBuffer()");

        if (this.osWriter != null) {
            this.osWriter.flush();
        }

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "flushBuffer()");
    }

    /**
     * Close all buffers
     * @throws IOException
     */
    public void close() throws IOException {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "close()");

        if (this.osWriter != null) {
            this.osWriter.close();
        }

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "close()");
    }

    /**
     * Internal method to start JSON generation.
     */
    private void startJSON() {
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "startJSON()");

        this.head    = new JSONObject("",null);
        this.current = head;

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "startJSON()");
    }

    /**
     * Internal method to end the JSON generation and to write out the resultant JSON text 
     * and reset the internal state of the hander.
     */
    private void endJSON() throws SAXException {   
        if (logger.isLoggable(Level.FINER)) logger.entering(CLASS_NAME, "endJSON()");

        try {
            this.head.writeObject(this.osWriter, 0, true, this.compact);
            this.head    = null;
            this.current = null;
            this.previousObjects.clear();
        } catch (Exception ex) {
            SAXException saxEx = new SAXException(ex);
            saxEx.initCause(ex);
            throw saxEx;
        }

        if (logger.isLoggable(Level.FINER)) logger.exiting(CLASS_NAME, "endJSON()");
    }

}


