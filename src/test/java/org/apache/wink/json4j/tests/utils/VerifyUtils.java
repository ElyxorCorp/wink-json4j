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

import java.util.Iterator;
import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class VerifyUtils {
    private VerifyUtils() {}

    public static void verifyKeys(Iterator keys, String[] sKeys) {
        Objects.requireNonNull(keys);
        Objects.requireNonNull(sKeys);

        int i = 0;
        while (keys.hasNext()) {
            String key = (String) keys.next();
            String sKey = sKeys[i];
            i++;
            assertTrue(key.equals(sKey));
        }
    }

}
