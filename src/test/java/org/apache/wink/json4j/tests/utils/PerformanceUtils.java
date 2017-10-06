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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public class PerformanceUtils {

    private static final int DEFAULT_NUM_LOOPS = 10000;

    private PerformanceUtils() {
    }

    @SuppressWarnings("EmptyFinallyBlock")
    public static void executeAndTimeInputStreamProcessing(String str, String description, Consumer<InputStream> c) throws Exception {
        executeAndTimeInputStreamProcessing(str, description, DEFAULT_NUM_LOOPS, c);
    }

    public static void executeAndTimeInputStreamProcessing(String str, String description, int numLoops, Consumer<InputStream> c) throws Exception {
        int timesToExecute = (numLoops > 0) ? numLoops : DEFAULT_NUM_LOOPS;

        long endTime;
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < timesToExecute; i++) {

            try (InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8.name()))) {
                c.accept(is);
            } finally {
            }
        }
        endTime = System.currentTimeMillis();
        final double totalTime = endTime - startTime;
        System.out.println(
                String.format("%s timing.  Total time for 10000 executions: [%.0fms].  Time per execution: [%.4fms]",
                        description,
                        totalTime,
                        totalTime / timesToExecute));
    }
}
