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

public class ComplexXMLConstants {

    public final static String strVerboseComplexJSON = "{\n" +
            "\n" +
            "   \"Server\" : {\n" +
            "      \"name\" : \"server1\",\n" +
            "      \"xmi_ns-sep_version\" : \"2.0\",\n" +
            "      \"xmi_ns-sep_id\" : \"Server_1144082873421\",\n" +
            "      \"banana\" : [\n" +
            "         {\n" +
            "            \"foo\" : \"This \\\"sucks\\\"\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"foo\" : \"\\\"sucks\\\" this does.\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"foo\" : \"\\\"sucks\\\"\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"foo\" : \"   \\\"sucks\\\"  \"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"BananaMan!\",\n" +
            "         {\n" +
            "            \"content\" : \"BananaMan!\",\n" +
            "            \"foo\" : \"Bad guy\"\n" +
            "         }\n" +
            "         ,\n" +
            "         true\n" +
            "      ],\n" +
            "      \"statisticsProvider\" : {\n" +
            "         \"specification\" : \"com.ibm.orb=enabled\",\n" +
            "         \"xmi_ns-sep_id\" : \"StatisticsProvider_1144082873437\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"outputStreamRedirect\" : {\n" +
            "         \"formatWrites\" : \"true\",\n" +
            "         \"maxNumberOfBackupFiles\" : \"1\",\n" +
            "         \"suppressStackTrace\" : \"false\",\n" +
            "         \"rolloverType\" : \"SIZE\",\n" +
            "         \"suppressWrites\" : \"false\",\n" +
            "         \"baseHour\" : \"24\",\n" +
            "         \"fileName\" : \"${SERVER_LOG_ROOT}\\/SystemOut.log\",\n" +
            "         \"messageFormatKind\" : \"BASIC\",\n" +
            "         \"rolloverSize\" : \"1\",\n" +
            "         \"xmi_ns-sep_id\" : \"StreamRedirect_1144082873438\",\n" +
            "         \"rolloverPeriod\" : \"24\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"services\" : [\n" +
            "         {\n" +
            "            \"synchronizedUpdate\" : \"false\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"pmiservice:PMIService\",\n" +
            "            \"statisticSet\" : \"basic\",\n" +
            "            \"initialSpecLevel\" : \"\",\n" +
            "            \"xmi_ns-sep_id\" : \"PMIService_1144082873437\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"preferredConnector\" : \"SOAPConnector_1144082873437\",\n" +
            "            \"standalone\" : \"true\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"adminservice:AdminService\",\n" +
            "            \"xmi_ns-sep_id\" : \"AdminService_1144082873437\",\n" +
            "            \"connectors\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"adminservice:SOAPConnector\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SOAPConnector_1144082873437\",\n" +
            "                  \"properties\" : [\n" +
            "                     {\n" +
            "                        \"name\" : \"sslConfig\",\n" +
            "                        \"value\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                        \"xmi_ns-sep_id\" : \"Property_1144082873437\"\n" +
            "                     }\n" +
            "                     ,\n" +
            "                     {\n" +
            "                        \"name\" : \"requestTimeout\",\n" +
            "                        \"value\" : \"600\",\n" +
            "                        \"xmi_ns-sep_id\" : \"Property_1144082873438\"\n" +
            "                     }\n" +
            "\n" +
            "                  ]\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"adminservice:RMIConnector\",\n" +
            "                  \"xmi_ns-sep_id\" : \"RMIConnector_1144082873437\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"pluginConfigService\" : {\n" +
            "               \"enable\" : \"true\",\n" +
            "               \"xmi_ns-sep_id\" : \"PluginConfigService_1144082873437\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"configRepository\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"RepositoryService_1144082873437\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"startupTraceSpecification\" : \"*=info\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"memoryBufferSize\" : \"8\",\n" +
            "            \"xmi_ns-sep_type\" : \"traceservice:TraceService\",\n" +
            "            \"traceFormat\" : \"BASIC\",\n" +
            "            \"traceOutputType\" : \"SPECIFIED_FILE\",\n" +
            "            \"xmi_ns-sep_id\" : \"TraceService_1144082873437\",\n" +
            "            \"traceLog\" : {\n" +
            "               \"maxNumberOfBackupFiles\" : \"1\",\n" +
            "               \"rolloverSize\" : \"20\",\n" +
            "               \"xmi_ns-sep_id\" : \"TraceLog_1144082873437\",\n" +
            "               \"fileName\" : \"${SERVER_LOG_ROOT}\\/trace.log\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"loggingservice.ras:RASLoggingService\",\n" +
            "            \"messageFilterLevel\" : \"NONE\",\n" +
            "            \"enableCorrelationId\" : \"true\",\n" +
            "            \"xmi_ns-sep_id\" : \"RASLoggingService_1144082873437\",\n" +
            "            \"serviceLog\" : {\n" +
            "               \"name\" : \"${LOG_ROOT}\\/activity.log\",\n" +
            "               \"enabled\" : \"true\",\n" +
            "               \"size\" : \"2\",\n" +
            "               \"xmi_ns-sep_id\" : \"ServiceLog_1144082873437\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"coregroupbridgeservice:CoreGroupBridgeService\",\n" +
            "            \"xmi_ns-sep_id\" : \"CoreGroupBridgeService_1144082873437\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"tperfviewer:TPVService\",\n" +
            "            \"xmi_ns-sep_id\" : \"TPVService_1144082873437\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"requestTimeout\" : \"180\",\n" +
            "            \"forceTunnel\" : \"never\",\n" +
            "            \"connectionCacheMaximum\" : \"240\",\n" +
            "            \"requestRetriesDelay\" : \"0\",\n" +
            "            \"xmi_ns-sep_type\" : \"orb:ObjectRequestBroker\",\n" +
            "            \"requestRetriesCount\" : \"1\",\n" +
            "            \"connectionCacheMinimum\" : \"100\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"commTraceEnabled\" : \"false\",\n" +
            "            \"xmi_ns-sep_id\" : \"ObjectRequestBroker_1144082873437\",\n" +
            "            \"locateRequestTimeout\" : \"180\",\n" +
            "            \"noLocalCopies\" : \"false\",\n" +
            "            \"plugins\" : [\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.orbimpl.transport.WSTransport\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ISecurityUtilityImpl.SecurityPropertyManager\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.orbimpl.WSORBPropertyManager\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.wlm.client.WLMClient\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.pmi.server.modules.OrbPerfModule\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.csi.CORBAORBMethodAccessControl\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873442\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"threadPool\" : {\n" +
            "               \"maximumSize\" : \"50\",\n" +
            "               \"name\" : \"ORB.thread.pool\",\n" +
            "               \"minimumSize\" : \"10\",\n" +
            "               \"inactivityTimeout\" : \"3500\",\n" +
            "               \"isGrowable\" : \"false\",\n" +
            "               \"xmi_ns-sep_id\" : \"ThreadPool_1144082873437\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"properties\" : [\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.CORBA.enableLocateRequest\",\n" +
            "                  \"value\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.CORBA.WSSSLServerSocketFactoryName\",\n" +
            "                  \"value\" : \"com.ibm.ws.security.orbssl.WSSSLServerSocketFactoryImpl\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.CORBA.WSSSLClientSocketFactoryName\",\n" +
            "                  \"value\" : \"com.ibm.ws.security.orbssl.WSSSLClientSocketFactoryImpl\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.CORBA.ConnectionInterceptorName\",\n" +
            "                  \"value\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityConnectionInterceptor\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873442\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.CORBA.RasManager\",\n" +
            "                  \"value\" : \"com.ibm.websphere.ras.WsOrbRasManager\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873443\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.orb.transport.useMultiHome\",\n" +
            "                  \"value\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873444\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"interceptors\" : [\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ejs.ras.RasContextSupport\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.runtime.workloadcontroller.OrbWorkloadRequestInterceptor\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.Transaction.JTS.TxInterceptorInitializer\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityComponentFactory\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.ServerRIWrapper\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.ClientRIWrapper\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873442\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIClientRI\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873443\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIServerRI\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873444\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.wlm.client.WLMClientInitializer\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873445\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.wlm.server.WLMServerInitializer\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873446\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.ws.activity.ActivityServiceServerInterceptor\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873447\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.debug.DebugPortableInterceptor\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873448\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"com.ibm.debug.olt.ivbtrjrt.OLT_RI\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873449\"\n" +
            "               }\n" +
            "\n" +
            "            ]\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"channelservice:TransportChannelService\",\n" +
            "            \"xmi_ns-sep_id\" : \"TransportChannelService_1144082873437\",\n" +
            "            \"transportChannels\" : [\n" +
            "               {\n" +
            "                  \"endPointName\" : \"WC_adminhost\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\",\n" +
            "                  \"name\" : \"TCP_1\",\n" +
            "                  \"maxOpenConnections\" : \"100\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"WC_defaulthost\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\",\n" +
            "                  \"name\" : \"TCP_2\",\n" +
            "                  \"maxOpenConnections\" : \"20000\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"WC_adminhost_secure\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\",\n" +
            "                  \"name\" : \"TCP_3\",\n" +
            "                  \"maxOpenConnections\" : \"100\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"WC_defaulthost_secure\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\",\n" +
            "                  \"name\" : \"TCP_4\",\n" +
            "                  \"maxOpenConnections\" : \"20000\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"DCS_UNICAST_ADDRESS\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873439\",\n" +
            "                  \"name\" : \"TCP_5\",\n" +
            "                  \"maxOpenConnections\" : \"20000\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SSL_1\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SSL_2\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SSL_3\",\n" +
            "                  \"discriminationWeight\" : \"2\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"enableLogging\" : \"false\",\n" +
            "                  \"name\" : \"HTTP_1\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873437\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"writeTimeout\" : \"60\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"enableLogging\" : \"false\",\n" +
            "                  \"name\" : \"HTTP_2\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873438\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"writeTimeout\" : \"60\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"enableLogging\" : \"false\",\n" +
            "                  \"name\" : \"HTTP_3\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873439\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"writeTimeout\" : \"60\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"enableLogging\" : \"false\",\n" +
            "                  \"name\" : \"HTTP_4\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873440\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"writeTimeout\" : \"60\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"writeBufferSize\" : \"32768\",\n" +
            "                  \"name\" : \"WCC_1\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"writeBufferSize\" : \"32768\",\n" +
            "                  \"name\" : \"WCC_2\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"writeBufferSize\" : \"32768\",\n" +
            "                  \"name\" : \"WCC_3\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"writeBufferSize\" : \"32768\",\n" +
            "                  \"name\" : \"WCC_4\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"DCS_1\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:DCSInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"DCSInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"DCS_2\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:DCSInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"DCSInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"SIB_ENDPOINT_ADDRESS\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873442\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"SIB_ENDPOINT_SECURE_ADDRESS\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_SSL\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873443\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"SIB_MQ_ENDPOINT_ADDRESS\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873444\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"endPointName\" : \"SIB_MQ_ENDPOINT_SECURE_ADDRESS\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP_SSL\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873445\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_SSL_JFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_SSL_MQFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_JFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_JFAP_SSL\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_MQFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_MQFAP_SSL\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_TUN_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873442\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_SSL_MQFAP_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLOutboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_SSL_JFAP_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLOutboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_SSL_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLOutboundChannel\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLOutboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_HTTP_JFAP_TUN_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_HTTP_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_HTC_JFAP_TUN_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPTunnelOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPTunnelOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_HTC_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPTunnelOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPTunnelOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_TUN_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_MQFAP_MQFAP_SSL_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"name\" : \"SIB_MQFAP_MQFAP_OUT\",\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"chains\" : [\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873437 HTTPInboundChannel_1144082873437 WebContainerInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"WCInboundAdmin\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873438 HTTPInboundChannel_1144082873438 WebContainerInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"WCInboundDefault\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873439 SSLInboundChannel_1144082873437 HTTPInboundChannel_1144082873439 WebContainerInboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"WCInboundAdminSecure\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873440 SSLInboundChannel_1144082873438 HTTPInboundChannel_1144082873440 WebContainerInboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"WCInboundDefaultSecure\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873441 DCSInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"DCS\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873441 SSLInboundChannel_1144082873439 DCSInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"DCS-Secure\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873442\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873442 JFAPInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"InboundBasicMessaging\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873443\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873443 SSLInboundChannel_1144082873440 JFAPInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"InboundSecureMessaging\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873444\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873444 MQFAPInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"InboundBasicMQLink\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873445\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873445 SSLInboundChannel_1144082873441 MQFAPInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"InboundSecureMQLink\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873446\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"BootstrapBasicMessaging\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873447\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873438 TCPOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"BootstrapSecureMessaging\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873448\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873439 HTTPTunnelOutboundChannel_1144082873437 HTTPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"BootstrapTunneledMessaging\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873449\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873440 HTTPTunnelOutboundChannel_1144082873438 HTTPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873439 TCPOutboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"BootstrapTunneledSecureMessaging\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873450\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"MQFAPOutboundChannel_1144082873438 TCPOutboundChannel_1144082873441\",\n" +
            "                  \"name\" : \"OutboundBasicMQLink\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873451\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"transportChannels\" : \"MQFAPOutboundChannel_1144082873437 SSLOutboundChannel_1144082873437 TCPOutboundChannel_1144082873442\",\n" +
            "                  \"name\" : \"OutboundSecureMQLink\",\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873452\"\n" +
            "               }\n" +
            "\n" +
            "            ]\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"xmi_ns-sep_type\" : \"threadpoolmanager:ThreadPoolManager\",\n" +
            "            \"xmi_ns-sep_id\" : \"ThreadPoolManager_1144082873437\",\n" +
            "            \"threadPools\" : [\n" +
            "               {\n" +
            "                  \"maximumSize\" : \"10\",\n" +
            "                  \"name\" : \"server.startup\",\n" +
            "                  \"minimumSize\" : \"0\",\n" +
            "                  \"inactivityTimeout\" : \"30000\",\n" +
            "                  \"description\" : \"This pool is used by WebSphere during server startup.\",\n" +
            "                  \"isGrowable\" : \"false\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"maximumSize\" : \"20\",\n" +
            "                  \"name\" : \"Default\",\n" +
            "                  \"minimumSize\" : \"5\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"maximumSize\" : \"50\",\n" +
            "                  \"name\" : \"WebContainer\",\n" +
            "                  \"minimumSize\" : \"10\",\n" +
            "                  \"inactivityTimeout\" : \"3500\",\n" +
            "                  \"isGrowable\" : \"false\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"maximumSize\" : \"50\",\n" +
            "                  \"name\" : \"SIBFAPThreadPool\",\n" +
            "                  \"minimumSize\" : \"4\",\n" +
            "                  \"description\" : \"Service integration bus FAP outbound channel thread pool\",\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "\n" +
            "            ]\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"enable\" : \"false\",\n" +
            "            \"xmi_ns-sep_type\" : \"loggingservice.http:HTTPAccessLoggingService\",\n" +
            "            \"enableErrorLogging\" : \"true\",\n" +
            "            \"enableAccessLogging\" : \"true\",\n" +
            "            \"xmi_ns-sep_id\" : \"HTTPAccessLoggingService_1144082873437\",\n" +
            "            \"errorLog\" : {\n" +
            "               \"maximumSize\" : \"500\",\n" +
            "               \"filePath\" : \"${SERVER_LOG_ROOT}\\/http_error.log\",\n" +
            "               \"xmi_ns-sep_id\" : \"LogFile_1144082873437\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"accessLog\" : {\n" +
            "               \"maximumSize\" : \"500\",\n" +
            "               \"filePath\" : \"${SERVER_LOG_ROOT}\\/http_access.log\",\n" +
            "               \"xmi_ns-sep_id\" : \"LogFile_1144082873438\"\n" +
            "            }\n" +
            "         }\n" +
            "\n" +
            "      ],\n" +
            "      \"stateManagement\" : {\n" +
            "         \"initialState\" : \"START\",\n" +
            "         \"xmi_ns-sep_id\" : \"StateManageable_1144082873437\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"processDefinitions\" : {\n" +
            "         \"executableTarget\" : \"com.ibm.ws.runtime.WsServer\",\n" +
            "         \"xmi_ns-sep_type\" : \"processexec:JavaProcessDef\",\n" +
            "         \"workingDirectory\" : \"${USER_INSTALL_ROOT}\",\n" +
            "         \"executableTargetKind\" : \"JAVA_CLASS\",\n" +
            "         \"xmi_ns-sep_id\" : \"JavaProcessDef_1144082873453\",\n" +
            "         \"monitoringPolicy\" : {\n" +
            "            \"maximumStartupAttempts\" : \"3\",\n" +
            "            \"pingTimeout\" : \"300\",\n" +
            "            \"pingInterval\" : \"60\",\n" +
            "            \"xmi_ns-sep_id\" : \"MonitoringPolicy_1144082873453\",\n" +
            "            \"autoRestart\" : \"true\",\n" +
            "            \"nodeRestartState\" : \"STOPPED\"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"jvmEntries\" : {\n" +
            "            \"debugArgs\" : \"-Djava.compiler=NONE -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=7777\",\n" +
            "            \"runHProf\" : \"false\",\n" +
            "            \"genericJvmArguments\" : \"\",\n" +
            "            \"hprofArguments\" : \"\",\n" +
            "            \"xmi_ns-sep_id\" : \"JavaVirtualMachine_1144082873453\",\n" +
            "            \"verboseModeJNI\" : \"false\",\n" +
            "            \"verboseModeGarbageCollection\" : \"false\",\n" +
            "            \"verboseModeClass\" : \"false\",\n" +
            "            \"debugMode\" : \"false\"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"execution\" : {\n" +
            "            \"runAsUser\" : \"\",\n" +
            "            \"runAsGroup\" : \"\",\n" +
            "            \"xmi_ns-sep_id\" : \"ProcessExecution_1144082873453\",\n" +
            "            \"processPriority\" : \"20\"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"ioRedirect\" : {\n" +
            "            \"stderrFilename\" : \"${SERVER_LOG_ROOT}\\/native_stderr.log\",\n" +
            "            \"stdoutFilename\" : \"${SERVER_LOG_ROOT}\\/native_stdout.log\",\n" +
            "            \"xmi_ns-sep_id\" : \"OutputRedirect_1144082873453\"\n" +
            "         }\n" +
            "      }\n" +
            "      ,\n" +
            "      \"components\" : [\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"namingserver:NameServer\",\n" +
            "            \"xmi_ns-sep_id\" : \"NameServer_1144082873437\",\n" +
            "            \"stateManagement\" : {\n" +
            "               \"initialState\" : \"START\",\n" +
            "               \"xmi_ns-sep_id\" : \"StateManageable_1144082873438\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"applicationClassLoaderPolicy\" : \"MULTIPLE\",\n" +
            "            \"xmi_ns-sep_type\" : \"applicationserver:ApplicationServer\",\n" +
            "            \"xmi_ns-sep_id\" : \"ApplicationServer_1144082873453\",\n" +
            "            \"services\" : [\n" +
            "               {\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"clientInactivityTimeout\" : \"60\",\n" +
            "                  \"totalTranLifetimeTimeout\" : \"120\",\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver:TransactionService\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TransactionService_1144082873453\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver:DynamicCache\",\n" +
            "                  \"xmi_ns-sep_id\" : \"DynamicCache_1144082873453\",\n" +
            "                  \"cacheGroups\" : {\n" +
            "                     \"name\" : \"EsiInvalidator\",\n" +
            "                     \"xmi_ns-sep_id\" : \"ExternalCacheGroup_1144082873453\",\n" +
            "                     \"members\" : {\n" +
            "                        \"address\" : \"localhost\",\n" +
            "                        \"adapterBeanName\" : \"com.ibm.websphere.servlet.cache.ESIInvalidatorServlet\",\n" +
            "                        \"xmi_ns-sep_id\" : \"ExternalCacheGroupMember_1144082873453\"\n" +
            "                     }\n" +
            "                  }\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"stateManagement\" : {\n" +
            "               \"initialState\" : \"START\",\n" +
            "               \"xmi_ns-sep_id\" : \"StateManageable_1144082873453\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"components\" : [\n" +
            "               {\n" +
            "                  \"enableServletCaching\" : \"false\",\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver.webcontainer:WebContainer\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainer_1144082873453\",\n" +
            "                  \"services\" : {\n" +
            "                     \"enableSecurityIntegration\" : \"false\",\n" +
            "                     \"maxWaitTime\" : \"5\",\n" +
            "                     \"allowSerializedSessionAccess\" : \"false\",\n" +
            "                     \"enableProtocolSwitchRewriting\" : \"false\",\n" +
            "                     \"xmi_ns-sep_type\" : \"applicationserver.webcontainer:SessionManager\",\n" +
            "                     \"enableUrlRewriting\" : \"false\",\n" +
            "                     \"enable\" : \"true\",\n" +
            "                     \"accessSessionOnTimeout\" : \"true\",\n" +
            "                     \"enableSSLTracking\" : \"false\",\n" +
            "                     \"sessionPersistenceMode\" : \"NONE\",\n" +
            "                     \"xmi_ns-sep_id\" : \"SessionManager_1144082873453\",\n" +
            "                     \"enableCookies\" : \"true\",\n" +
            "                     \"sessionDatabasePersistence\" : {\n" +
            "                        \"password\" : \"{xor}Oz1tPjsyNjE=\",\n" +
            "                        \"userId\" : \"db2admin\",\n" +
            "                        \"tableSpaceName\" : \"\",\n" +
            "                        \"datasourceJNDIName\" : \"jdbc\\/Sessions\",\n" +
            "                        \"db2RowSize\" : \"ROW_SIZE_4KB\",\n" +
            "                        \"xmi_ns-sep_id\" : \"SessionDatabasePersistence_1144082873453\"\n" +
            "                     }\n" +
            "                     ,\n" +
            "                     \"tuningParams\" : {\n" +
            "                        \"usingMultiRowSchema\" : \"false\",\n" +
            "                        \"invalidationTimeout\" : \"30\",\n" +
            "                        \"allowOverflow\" : \"true\",\n" +
            "                        \"writeInterval\" : \"10\",\n" +
            "                        \"writeFrequency\" : \"TIME_BASED_WRITE\",\n" +
            "                        \"writeContents\" : \"ONLY_UPDATED_ATTRIBUTES\",\n" +
            "                        \"xmi_ns-sep_id\" : \"TuningParams_1144082873453\",\n" +
            "                        \"scheduleInvalidation\" : \"false\",\n" +
            "                        \"maxInMemorySessionCount\" : \"1000\",\n" +
            "                        \"invalidationSchedule\" : {\n" +
            "                           \"secondHour\" : \"2\",\n" +
            "                           \"firstHour\" : \"14\",\n" +
            "                           \"xmi_ns-sep_id\" : \"InvalidationSchedule_1144082873453\"\n" +
            "                        }\n" +
            "                     }\n" +
            "                     ,\n" +
            "                     \"defaultCookieSettings\" : {\n" +
            "                        \"maximumAge\" : \"-1\",\n" +
            "                        \"domain\" : \"\",\n" +
            "                        \"secure\" : \"false\",\n" +
            "                        \"xmi_ns-sep_id\" : \"Cookie_1144082873453\"\n" +
            "                     }\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"stateManagement\" : {\n" +
            "                     \"initialState\" : \"START\",\n" +
            "                     \"xmi_ns-sep_id\" : \"StateManageable_1144082873454\"\n" +
            "                  }\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"inactivePoolCleanupInterval\" : \"30000\",\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver.ejbcontainer:EJBContainer\",\n" +
            "                  \"passivationDirectory\" : \"${USER_INSTALL_ROOT}\\/temp\",\n" +
            "                  \"xmi_ns-sep_id\" : \"EJBContainer_1144082873453\",\n" +
            "                  \"timerSettings\" : {\n" +
            "                     \"tablePrefix\" : \"EJBTIMER_\",\n" +
            "                     \"pollInterval\" : \"300\",\n" +
            "                     \"numAlarmThreads\" : \"1\",\n" +
            "                     \"datasourceJNDIName\" : \"jdbc\\/DefaultEJBTimerDataSource\",\n" +
            "                     \"xmi_ns-sep_id\" : \"EJBTimer_1144082873453\"\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"services\" : {\n" +
            "                     \"xmi_ns-sep_type\" : \"applicationserver.ejbcontainer.messagelistener:MessageListenerService\",\n" +
            "                     \"xmi_ns-sep_id\" : \"MessageListenerService_1144082873453\",\n" +
            "                     \"threadPool\" : {\n" +
            "                        \"maximumSize\" : \"50\",\n" +
            "                        \"name\" : \"Message.Listener.Pool\",\n" +
            "                        \"minimumSize\" : \"10\",\n" +
            "                        \"inactivityTimeout\" : \"3500\",\n" +
            "                        \"isGrowable\" : \"false\",\n" +
            "                        \"xmi_ns-sep_id\" : \"ThreadPool_1144082873453\"\n" +
            "                     }\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"stateManagement\" : {\n" +
            "                     \"initialState\" : \"START\",\n" +
            "                     \"xmi_ns-sep_id\" : \"StateManageable_1144082873455\"\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"cacheSettings\" : {\n" +
            "                     \"cleanupInterval\" : \"3000\",\n" +
            "                     \"cacheSize\" : \"2053\",\n" +
            "                     \"xmi_ns-sep_id\" : \"EJBCache_1144082873453\"\n" +
            "                  }\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"webserverPluginSettings\" : {\n" +
            "               \"ExtendedHandshake\" : \"false\",\n" +
            "               \"ConnectTimeout\" : \"0\",\n" +
            "               \"WaitForContinue\" : \"false\",\n" +
            "               \"MaxConnections\" : \"-1\",\n" +
            "               \"xmi_ns-sep_id\" : \"WebserverPluginSettings_1144082873453\"\n" +
            "            }\n" +
            "         }\n" +
            "\n" +
            "      ],\n" +
            "      \"errorStreamRedirect\" : {\n" +
            "         \"formatWrites\" : \"true\",\n" +
            "         \"maxNumberOfBackupFiles\" : \"1\",\n" +
            "         \"suppressStackTrace\" : \"false\",\n" +
            "         \"rolloverType\" : \"SIZE\",\n" +
            "         \"suppressWrites\" : \"false\",\n" +
            "         \"baseHour\" : \"24\",\n" +
            "         \"fileName\" : \"${SERVER_LOG_ROOT}\\/SystemErr.log\",\n" +
            "         \"messageFormatKind\" : \"BASIC\",\n" +
            "         \"rolloverSize\" : \"1\",\n" +
            "         \"xmi_ns-sep_id\" : \"StreamRedirect_1144082873437\",\n" +
            "         \"rolloverPeriod\" : \"24\"\n" +
            "      }\n" +
            "   }\n" +
            "}\n";

    public final static String strCompactComplexJSON = "{\"Server\":{\"name\":\"server1\",\"xmi_ns-sep_version\":\"2.0\",\"xmi_ns-sep_id\":\"Server_1144082873421\",\"banana\":[{\"foo\":\"This \\\"sucks\\\"\"},{\"foo\":\"\\\"sucks\\\" this does.\"},{\"foo\":\"\\\"sucks\\\"\"},{\"foo\":\"   \\\"sucks\\\"  \"},\"BananaMan!\",{\"content\":\"BananaMan!\",\"foo\":\"Bad guy\"},true],\"statisticsProvider\":{\"specification\":\"com.ibm.orb=enabled\",\"xmi_ns-sep_id\":\"StatisticsProvider_1144082873437\"},\"outputStreamRedirect\":{\"formatWrites\":\"true\",\"maxNumberOfBackupFiles\":\"1\",\"suppressStackTrace\":\"false\",\"rolloverType\":\"SIZE\",\"suppressWrites\":\"false\",\"baseHour\":\"24\",\"fileName\":\"${SERVER_LOG_ROOT}\\/SystemOut.log\",\"messageFormatKind\":\"BASIC\",\"rolloverSize\":\"1\",\"xmi_ns-sep_id\":\"StreamRedirect_1144082873438\",\"rolloverPeriod\":\"24\"},\"services\":[{\"synchronizedUpdate\":\"false\",\"enable\":\"true\",\"xmi_ns-sep_type\":\"pmiservice:PMIService\",\"statisticSet\":\"basic\",\"initialSpecLevel\":\"\",\"xmi_ns-sep_id\":\"PMIService_1144082873437\"},{\"preferredConnector\":\"SOAPConnector_1144082873437\",\"standalone\":\"true\",\"enable\":\"true\",\"xmi_ns-sep_type\":\"adminservice:AdminService\",\"xmi_ns-sep_id\":\"AdminService_1144082873437\",\"connectors\":[{\"xmi_ns-sep_type\":\"adminservice:SOAPConnector\",\"xmi_ns-sep_id\":\"SOAPConnector_1144082873437\",\"properties\":[{\"name\":\"sslConfig\",\"value\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"Property_1144082873437\"},{\"name\":\"requestTimeout\",\"value\":\"600\",\"xmi_ns-sep_id\":\"Property_1144082873438\"}]},{\"xmi_ns-sep_type\":\"adminservice:RMIConnector\",\"xmi_ns-sep_id\":\"RMIConnector_1144082873437\"}],\"pluginConfigService\":{\"enable\":\"true\",\"xmi_ns-sep_id\":\"PluginConfigService_1144082873437\"},\"configRepository\":{\"xmi_ns-sep_id\":\"RepositoryService_1144082873437\"}},{\"startupTraceSpecification\":\"*=info\",\"enable\":\"true\",\"memoryBufferSize\":\"8\",\"xmi_ns-sep_type\":\"traceservice:TraceService\",\"traceFormat\":\"BASIC\",\"traceOutputType\":\"SPECIFIED_FILE\",\"xmi_ns-sep_id\":\"TraceService_1144082873437\",\"traceLog\":{\"maxNumberOfBackupFiles\":\"1\",\"rolloverSize\":\"20\",\"xmi_ns-sep_id\":\"TraceLog_1144082873437\",\"fileName\":\"${SERVER_LOG_ROOT}\\/trace.log\"}},{\"enable\":\"true\",\"xmi_ns-sep_type\":\"loggingservice.ras:RASLoggingService\",\"messageFilterLevel\":\"NONE\",\"enableCorrelationId\":\"true\",\"xmi_ns-sep_id\":\"RASLoggingService_1144082873437\",\"serviceLog\":{\"name\":\"${LOG_ROOT}\\/activity.log\",\"enabled\":\"true\",\"size\":\"2\",\"xmi_ns-sep_id\":\"ServiceLog_1144082873437\"}},{\"enable\":\"true\",\"xmi_ns-sep_type\":\"coregroupbridgeservice:CoreGroupBridgeService\",\"xmi_ns-sep_id\":\"CoreGroupBridgeService_1144082873437\"},{\"enable\":\"true\",\"xmi_ns-sep_type\":\"tperfviewer:TPVService\",\"xmi_ns-sep_id\":\"TPVService_1144082873437\"},{\"requestTimeout\":\"180\",\"forceTunnel\":\"never\",\"connectionCacheMaximum\":\"240\",\"requestRetriesDelay\":\"0\",\"xmi_ns-sep_type\":\"orb:ObjectRequestBroker\",\"requestRetriesCount\":\"1\",\"connectionCacheMinimum\":\"100\",\"enable\":\"true\",\"commTraceEnabled\":\"false\",\"xmi_ns-sep_id\":\"ObjectRequestBroker_1144082873437\",\"locateRequestTimeout\":\"180\",\"noLocalCopies\":\"false\",\"plugins\":[{\"name\":\"com.ibm.ws.orbimpl.transport.WSTransport\",\"xmi_ns-sep_id\":\"ORBPlugin_1144082873437\"},{\"name\":\"com.ibm.ISecurityUtilityImpl.SecurityPropertyManager\",\"xmi_ns-sep_id\":\"ORBPlugin_1144082873438\"},{\"name\":\"com.ibm.ws.orbimpl.WSORBPropertyManager\",\"xmi_ns-sep_id\":\"ORBPlugin_1144082873439\"},{\"name\":\"com.ibm.ws.wlm.client.WLMClient\",\"xmi_ns-sep_id\":\"ORBPlugin_1144082873440\"},{\"name\":\"com.ibm.ws.pmi.server.modules.OrbPerfModule\",\"xmi_ns-sep_id\":\"ORBPlugin_1144082873441\"},{\"name\":\"com.ibm.ws.csi.CORBAORBMethodAccessControl\",\"xmi_ns-sep_id\":\"ORBPlugin_1144082873442\"}],\"threadPool\":{\"maximumSize\":\"50\",\"name\":\"ORB.thread.pool\",\"minimumSize\":\"10\",\"inactivityTimeout\":\"3500\",\"isGrowable\":\"false\",\"xmi_ns-sep_id\":\"ThreadPool_1144082873437\"},\"properties\":[{\"name\":\"com.ibm.CORBA.enableLocateRequest\",\"value\":\"true\",\"xmi_ns-sep_id\":\"Property_1144082873439\"},{\"name\":\"com.ibm.CORBA.WSSSLServerSocketFactoryName\",\"value\":\"com.ibm.ws.security.orbssl.WSSSLServerSocketFactoryImpl\",\"xmi_ns-sep_id\":\"Property_1144082873440\"},{\"name\":\"com.ibm.CORBA.WSSSLClientSocketFactoryName\",\"value\":\"com.ibm.ws.security.orbssl.WSSSLClientSocketFactoryImpl\",\"xmi_ns-sep_id\":\"Property_1144082873441\"},{\"name\":\"com.ibm.CORBA.ConnectionInterceptorName\",\"value\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityConnectionInterceptor\",\"xmi_ns-sep_id\":\"Property_1144082873442\"},{\"name\":\"com.ibm.CORBA.RasManager\",\"value\":\"com.ibm.websphere.ras.WsOrbRasManager\",\"xmi_ns-sep_id\":\"Property_1144082873443\"},{\"name\":\"com.ibm.ws.orb.transport.useMultiHome\",\"value\":\"true\",\"xmi_ns-sep_id\":\"Property_1144082873444\"}],\"interceptors\":[{\"name\":\"com.ibm.ejs.ras.RasContextSupport\",\"xmi_ns-sep_id\":\"Interceptor_1144082873437\"},{\"name\":\"com.ibm.ws.runtime.workloadcontroller.OrbWorkloadRequestInterceptor\",\"xmi_ns-sep_id\":\"Interceptor_1144082873438\"},{\"name\":\"com.ibm.ws.Transaction.JTS.TxInterceptorInitializer\",\"xmi_ns-sep_id\":\"Interceptor_1144082873439\"},{\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityComponentFactory\",\"xmi_ns-sep_id\":\"Interceptor_1144082873440\"},{\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.ServerRIWrapper\",\"xmi_ns-sep_id\":\"Interceptor_1144082873441\"},{\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.ClientRIWrapper\",\"xmi_ns-sep_id\":\"Interceptor_1144082873442\"},{\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIClientRI\",\"xmi_ns-sep_id\":\"Interceptor_1144082873443\"},{\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIServerRI\",\"xmi_ns-sep_id\":\"Interceptor_1144082873444\"},{\"name\":\"com.ibm.ws.wlm.client.WLMClientInitializer\",\"xmi_ns-sep_id\":\"Interceptor_1144082873445\"},{\"name\":\"com.ibm.ws.wlm.server.WLMServerInitializer\",\"xmi_ns-sep_id\":\"Interceptor_1144082873446\"},{\"name\":\"com.ibm.ws.activity.ActivityServiceServerInterceptor\",\"xmi_ns-sep_id\":\"Interceptor_1144082873447\"},{\"name\":\"com.ibm.debug.DebugPortableInterceptor\",\"xmi_ns-sep_id\":\"Interceptor_1144082873448\"},{\"name\":\"com.ibm.debug.olt.ivbtrjrt.OLT_RI\",\"xmi_ns-sep_id\":\"Interceptor_1144082873449\"}]},{\"enable\":\"true\",\"xmi_ns-sep_type\":\"channelservice:TransportChannelService\",\"xmi_ns-sep_id\":\"TransportChannelService_1144082873437\",\"transportChannels\":[{\"endPointName\":\"WC_adminhost\",\"threadPool\":\"ThreadPool_1144082873438\",\"name\":\"TCP_1\",\"maxOpenConnections\":\"100\",\"inactivityTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873437\"},{\"endPointName\":\"WC_defaulthost\",\"threadPool\":\"ThreadPool_1144082873438\",\"name\":\"TCP_2\",\"maxOpenConnections\":\"20000\",\"inactivityTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873438\"},{\"endPointName\":\"WC_adminhost_secure\",\"threadPool\":\"ThreadPool_1144082873438\",\"name\":\"TCP_3\",\"maxOpenConnections\":\"100\",\"inactivityTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873439\"},{\"endPointName\":\"WC_defaulthost_secure\",\"threadPool\":\"ThreadPool_1144082873438\",\"name\":\"TCP_4\",\"maxOpenConnections\":\"20000\",\"inactivityTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873440\"},{\"endPointName\":\"DCS_UNICAST_ADDRESS\",\"threadPool\":\"ThreadPool_1144082873439\",\"name\":\"TCP_5\",\"maxOpenConnections\":\"20000\",\"inactivityTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873441\"},{\"name\":\"SSL_1\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873437\"},{\"name\":\"SSL_2\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873438\"},{\"name\":\"SSL_3\",\"discriminationWeight\":\"2\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873439\"},{\"enableLogging\":\"false\",\"name\":\"HTTP_1\",\"readTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"maximumPersistentRequests\":\"100\",\"discriminationWeight\":\"10\",\"persistentTimeout\":\"30\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873437\",\"keepAlive\":\"true\",\"writeTimeout\":\"60\"},{\"enableLogging\":\"false\",\"name\":\"HTTP_2\",\"readTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"maximumPersistentRequests\":\"100\",\"discriminationWeight\":\"10\",\"persistentTimeout\":\"30\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873438\",\"keepAlive\":\"true\",\"writeTimeout\":\"60\"},{\"enableLogging\":\"false\",\"name\":\"HTTP_3\",\"readTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"maximumPersistentRequests\":\"100\",\"discriminationWeight\":\"10\",\"persistentTimeout\":\"30\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873439\",\"keepAlive\":\"true\",\"writeTimeout\":\"60\"},{\"enableLogging\":\"false\",\"name\":\"HTTP_4\",\"readTimeout\":\"60\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"maximumPersistentRequests\":\"100\",\"discriminationWeight\":\"10\",\"persistentTimeout\":\"30\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873440\",\"keepAlive\":\"true\",\"writeTimeout\":\"60\"},{\"writeBufferSize\":\"32768\",\"name\":\"WCC_1\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873437\"},{\"writeBufferSize\":\"32768\",\"name\":\"WCC_2\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873438\"},{\"writeBufferSize\":\"32768\",\"name\":\"WCC_3\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873439\"},{\"writeBufferSize\":\"32768\",\"name\":\"WCC_4\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873440\"},{\"name\":\"DCS_1\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:DCSInboundChannel\",\"xmi_ns-sep_id\":\"DCSInboundChannel_1144082873437\"},{\"name\":\"DCS_2\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:DCSInboundChannel\",\"xmi_ns-sep_id\":\"DCSInboundChannel_1144082873438\"},{\"endPointName\":\"SIB_ENDPOINT_ADDRESS\",\"name\":\"SIB_TCP_JFAP\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873442\"},{\"endPointName\":\"SIB_ENDPOINT_SECURE_ADDRESS\",\"name\":\"SIB_TCP_JFAP_SSL\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873443\"},{\"endPointName\":\"SIB_MQ_ENDPOINT_ADDRESS\",\"name\":\"SIB_TCP_MQFAP\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873444\"},{\"endPointName\":\"SIB_MQ_ENDPOINT_SECURE_ADDRESS\",\"name\":\"SIB_TCP_MQFAP_SSL\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873445\"},{\"name\":\"SIB_SSL_JFAP\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873440\"},{\"name\":\"SIB_SSL_MQFAP\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873441\"},{\"name\":\"SIB_JFAP\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:JFAPInboundChannel\",\"xmi_ns-sep_id\":\"JFAPInboundChannel_1144082873437\"},{\"name\":\"SIB_JFAP_SSL\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:JFAPInboundChannel\",\"xmi_ns-sep_id\":\"JFAPInboundChannel_1144082873438\"},{\"name\":\"SIB_MQFAP\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPInboundChannel\",\"xmi_ns-sep_id\":\"MQFAPInboundChannel_1144082873437\"},{\"name\":\"SIB_MQFAP_SSL\",\"discriminationWeight\":\"1\",\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPInboundChannel\",\"xmi_ns-sep_id\":\"MQFAPInboundChannel_1144082873438\"},{\"threadPool\":\"ThreadPool_1144082873440\",\"name\":\"SIB_TCP_JFAP_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873437\"},{\"threadPool\":\"ThreadPool_1144082873440\",\"name\":\"SIB_TCP_JFAP_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873438\"},{\"threadPool\":\"ThreadPool_1144082873440\",\"name\":\"SIB_TCP_JFAP_TUN_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873439\"},{\"threadPool\":\"ThreadPool_1144082873440\",\"name\":\"SIB_TCP_JFAP_TUN_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873440\"},{\"threadPool\":\"ThreadPool_1144082873440\",\"name\":\"SIB_TCP_MQFAP_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873441\"},{\"threadPool\":\"ThreadPool_1144082873440\",\"name\":\"SIB_TCP_MQFAP_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873442\"},{\"name\":\"SIB_SSL_MQFAP_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLOutboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLOutboundChannel_1144082873437\"},{\"name\":\"SIB_SSL_JFAP_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLOutboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLOutboundChannel_1144082873438\"},{\"name\":\"SIB_SSL_JFAP_TUN_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:SSLOutboundChannel\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\",\"xmi_ns-sep_id\":\"SSLOutboundChannel_1144082873439\"},{\"name\":\"SIB_HTTP_JFAP_TUN_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPOutboundChannel_1144082873437\"},{\"name\":\"SIB_HTTP_JFAP_TUN_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPOutboundChannel_1144082873438\"},{\"name\":\"SIB_HTC_JFAP_TUN_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPTunnelOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPTunnelOutboundChannel_1144082873437\"},{\"name\":\"SIB_HTC_JFAP_TUN_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:HTTPTunnelOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPTunnelOutboundChannel_1144082873438\"},{\"name\":\"SIB_JFAP_JFAP_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873437\"},{\"name\":\"SIB_JFAP_JFAP_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873438\"},{\"name\":\"SIB_JFAP_JFAP_TUN_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873439\"},{\"name\":\"SIB_JFAP_JFAP_TUN_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873440\"},{\"name\":\"SIB_MQFAP_MQFAP_SSL_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPOutboundChannel\",\"xmi_ns-sep_id\":\"MQFAPOutboundChannel_1144082873437\"},{\"name\":\"SIB_MQFAP_MQFAP_OUT\",\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPOutboundChannel\",\"xmi_ns-sep_id\":\"MQFAPOutboundChannel_1144082873438\"}],\"chains\":[{\"transportChannels\":\"TCPInboundChannel_1144082873437 HTTPInboundChannel_1144082873437 WebContainerInboundChannel_1144082873437\",\"name\":\"WCInboundAdmin\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873437\"},{\"transportChannels\":\"TCPInboundChannel_1144082873438 HTTPInboundChannel_1144082873438 WebContainerInboundChannel_1144082873438\",\"name\":\"WCInboundDefault\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873438\"},{\"transportChannels\":\"TCPInboundChannel_1144082873439 SSLInboundChannel_1144082873437 HTTPInboundChannel_1144082873439 WebContainerInboundChannel_1144082873439\",\"name\":\"WCInboundAdminSecure\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873439\"},{\"transportChannels\":\"TCPInboundChannel_1144082873440 SSLInboundChannel_1144082873438 HTTPInboundChannel_1144082873440 WebContainerInboundChannel_1144082873440\",\"name\":\"WCInboundDefaultSecure\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873440\"},{\"transportChannels\":\"TCPInboundChannel_1144082873441 DCSInboundChannel_1144082873437\",\"name\":\"DCS\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873441\"},{\"transportChannels\":\"TCPInboundChannel_1144082873441 SSLInboundChannel_1144082873439 DCSInboundChannel_1144082873438\",\"name\":\"DCS-Secure\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873442\"},{\"transportChannels\":\"TCPInboundChannel_1144082873442 JFAPInboundChannel_1144082873437\",\"name\":\"InboundBasicMessaging\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873443\"},{\"transportChannels\":\"TCPInboundChannel_1144082873443 SSLInboundChannel_1144082873440 JFAPInboundChannel_1144082873438\",\"name\":\"InboundSecureMessaging\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873444\"},{\"transportChannels\":\"TCPInboundChannel_1144082873444 MQFAPInboundChannel_1144082873437\",\"name\":\"InboundBasicMQLink\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873445\"},{\"transportChannels\":\"TCPInboundChannel_1144082873445 SSLInboundChannel_1144082873441 MQFAPInboundChannel_1144082873438\",\"name\":\"InboundSecureMQLink\",\"enable\":\"true\",\"xmi_ns-sep_id\":\"Chain_1144082873446\"},{\"transportChannels\":\"JFAPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873437\",\"name\":\"BootstrapBasicMessaging\",\"xmi_ns-sep_id\":\"Chain_1144082873447\"},{\"transportChannels\":\"JFAPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873438 TCPOutboundChannel_1144082873438\",\"name\":\"BootstrapSecureMessaging\",\"xmi_ns-sep_id\":\"Chain_1144082873448\"},{\"transportChannels\":\"JFAPOutboundChannel_1144082873439 HTTPTunnelOutboundChannel_1144082873437 HTTPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873439\",\"name\":\"BootstrapTunneledMessaging\",\"xmi_ns-sep_id\":\"Chain_1144082873449\"},{\"transportChannels\":\"JFAPOutboundChannel_1144082873440 HTTPTunnelOutboundChannel_1144082873438 HTTPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873439 TCPOutboundChannel_1144082873440\",\"name\":\"BootstrapTunneledSecureMessaging\",\"xmi_ns-sep_id\":\"Chain_1144082873450\"},{\"transportChannels\":\"MQFAPOutboundChannel_1144082873438 TCPOutboundChannel_1144082873441\",\"name\":\"OutboundBasicMQLink\",\"xmi_ns-sep_id\":\"Chain_1144082873451\"},{\"transportChannels\":\"MQFAPOutboundChannel_1144082873437 SSLOutboundChannel_1144082873437 TCPOutboundChannel_1144082873442\",\"name\":\"OutboundSecureMQLink\",\"xmi_ns-sep_id\":\"Chain_1144082873452\"}]},{\"enable\":\"true\",\"xmi_ns-sep_type\":\"threadpoolmanager:ThreadPoolManager\",\"xmi_ns-sep_id\":\"ThreadPoolManager_1144082873437\",\"threadPools\":[{\"maximumSize\":\"10\",\"name\":\"server.startup\",\"minimumSize\":\"0\",\"inactivityTimeout\":\"30000\",\"description\":\"This pool is used by WebSphere during server startup.\",\"isGrowable\":\"false\",\"xmi_ns-sep_id\":\"ThreadPool_1144082873441\"},{\"maximumSize\":\"20\",\"name\":\"Default\",\"minimumSize\":\"5\",\"xmi_ns-sep_id\":\"ThreadPool_1144082873439\"},{\"maximumSize\":\"50\",\"name\":\"WebContainer\",\"minimumSize\":\"10\",\"inactivityTimeout\":\"3500\",\"isGrowable\":\"false\",\"xmi_ns-sep_id\":\"ThreadPool_1144082873438\"},{\"maximumSize\":\"50\",\"name\":\"SIBFAPThreadPool\",\"minimumSize\":\"4\",\"description\":\"Service integration bus FAP outbound channel thread pool\",\"xmi_ns-sep_id\":\"ThreadPool_1144082873440\"}]},{\"enable\":\"false\",\"xmi_ns-sep_type\":\"loggingservice.http:HTTPAccessLoggingService\",\"enableErrorLogging\":\"true\",\"enableAccessLogging\":\"true\",\"xmi_ns-sep_id\":\"HTTPAccessLoggingService_1144082873437\",\"errorLog\":{\"maximumSize\":\"500\",\"filePath\":\"${SERVER_LOG_ROOT}\\/http_error.log\",\"xmi_ns-sep_id\":\"LogFile_1144082873437\"},\"accessLog\":{\"maximumSize\":\"500\",\"filePath\":\"${SERVER_LOG_ROOT}\\/http_access.log\",\"xmi_ns-sep_id\":\"LogFile_1144082873438\"}}],\"stateManagement\":{\"initialState\":\"START\",\"xmi_ns-sep_id\":\"StateManageable_1144082873437\"},\"processDefinitions\":{\"executableTarget\":\"com.ibm.ws.runtime.WsServer\",\"xmi_ns-sep_type\":\"processexec:JavaProcessDef\",\"workingDirectory\":\"${USER_INSTALL_ROOT}\",\"executableTargetKind\":\"JAVA_CLASS\",\"xmi_ns-sep_id\":\"JavaProcessDef_1144082873453\",\"monitoringPolicy\":{\"maximumStartupAttempts\":\"3\",\"pingTimeout\":\"300\",\"pingInterval\":\"60\",\"xmi_ns-sep_id\":\"MonitoringPolicy_1144082873453\",\"autoRestart\":\"true\",\"nodeRestartState\":\"STOPPED\"},\"jvmEntries\":{\"debugArgs\":\"-Djava.compiler=NONE -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=7777\",\"runHProf\":\"false\",\"genericJvmArguments\":\"\",\"hprofArguments\":\"\",\"xmi_ns-sep_id\":\"JavaVirtualMachine_1144082873453\",\"verboseModeJNI\":\"false\",\"verboseModeGarbageCollection\":\"false\",\"verboseModeClass\":\"false\",\"debugMode\":\"false\"},\"execution\":{\"runAsUser\":\"\",\"runAsGroup\":\"\",\"xmi_ns-sep_id\":\"ProcessExecution_1144082873453\",\"processPriority\":\"20\"},\"ioRedirect\":{\"stderrFilename\":\"${SERVER_LOG_ROOT}\\/native_stderr.log\",\"stdoutFilename\":\"${SERVER_LOG_ROOT}\\/native_stdout.log\",\"xmi_ns-sep_id\":\"OutputRedirect_1144082873453\"}},\"components\":[{\"xmi_ns-sep_type\":\"namingserver:NameServer\",\"xmi_ns-sep_id\":\"NameServer_1144082873437\",\"stateManagement\":{\"initialState\":\"START\",\"xmi_ns-sep_id\":\"StateManageable_1144082873438\"}},{\"applicationClassLoaderPolicy\":\"MULTIPLE\",\"xmi_ns-sep_type\":\"applicationserver:ApplicationServer\",\"xmi_ns-sep_id\":\"ApplicationServer_1144082873453\",\"services\":[{\"enable\":\"true\",\"clientInactivityTimeout\":\"60\",\"totalTranLifetimeTimeout\":\"120\",\"xmi_ns-sep_type\":\"applicationserver:TransactionService\",\"xmi_ns-sep_id\":\"TransactionService_1144082873453\"},{\"enable\":\"true\",\"xmi_ns-sep_type\":\"applicationserver:DynamicCache\",\"xmi_ns-sep_id\":\"DynamicCache_1144082873453\",\"cacheGroups\":{\"name\":\"EsiInvalidator\",\"xmi_ns-sep_id\":\"ExternalCacheGroup_1144082873453\",\"members\":{\"address\":\"localhost\",\"adapterBeanName\":\"com.ibm.websphere.servlet.cache.ESIInvalidatorServlet\",\"xmi_ns-sep_id\":\"ExternalCacheGroupMember_1144082873453\"}}}],\"stateManagement\":{\"initialState\":\"START\",\"xmi_ns-sep_id\":\"StateManageable_1144082873453\"},\"components\":[{\"enableServletCaching\":\"false\",\"xmi_ns-sep_type\":\"applicationserver.webcontainer:WebContainer\",\"xmi_ns-sep_id\":\"WebContainer_1144082873453\",\"services\":{\"enableSecurityIntegration\":\"false\",\"maxWaitTime\":\"5\",\"allowSerializedSessionAccess\":\"false\",\"enableProtocolSwitchRewriting\":\"false\",\"xmi_ns-sep_type\":\"applicationserver.webcontainer:SessionManager\",\"enableUrlRewriting\":\"false\",\"enable\":\"true\",\"accessSessionOnTimeout\":\"true\",\"enableSSLTracking\":\"false\",\"sessionPersistenceMode\":\"NONE\",\"xmi_ns-sep_id\":\"SessionManager_1144082873453\",\"enableCookies\":\"true\",\"sessionDatabasePersistence\":{\"password\":\"{xor}Oz1tPjsyNjE=\",\"userId\":\"db2admin\",\"tableSpaceName\":\"\",\"datasourceJNDIName\":\"jdbc\\/Sessions\",\"db2RowSize\":\"ROW_SIZE_4KB\",\"xmi_ns-sep_id\":\"SessionDatabasePersistence_1144082873453\"},\"tuningParams\":{\"usingMultiRowSchema\":\"false\",\"invalidationTimeout\":\"30\",\"allowOverflow\":\"true\",\"writeInterval\":\"10\",\"writeFrequency\":\"TIME_BASED_WRITE\",\"writeContents\":\"ONLY_UPDATED_ATTRIBUTES\",\"xmi_ns-sep_id\":\"TuningParams_1144082873453\",\"scheduleInvalidation\":\"false\",\"maxInMemorySessionCount\":\"1000\",\"invalidationSchedule\":{\"secondHour\":\"2\",\"firstHour\":\"14\",\"xmi_ns-sep_id\":\"InvalidationSchedule_1144082873453\"}},\"defaultCookieSettings\":{\"maximumAge\":\"-1\",\"domain\":\"\",\"secure\":\"false\",\"xmi_ns-sep_id\":\"Cookie_1144082873453\"}},\"stateManagement\":{\"initialState\":\"START\",\"xmi_ns-sep_id\":\"StateManageable_1144082873454\"}},{\"inactivePoolCleanupInterval\":\"30000\",\"xmi_ns-sep_type\":\"applicationserver.ejbcontainer:EJBContainer\",\"passivationDirectory\":\"${USER_INSTALL_ROOT}\\/temp\",\"xmi_ns-sep_id\":\"EJBContainer_1144082873453\",\"timerSettings\":{\"tablePrefix\":\"EJBTIMER_\",\"pollInterval\":\"300\",\"numAlarmThreads\":\"1\",\"datasourceJNDIName\":\"jdbc\\/DefaultEJBTimerDataSource\",\"xmi_ns-sep_id\":\"EJBTimer_1144082873453\"},\"services\":{\"xmi_ns-sep_type\":\"applicationserver.ejbcontainer.messagelistener:MessageListenerService\",\"xmi_ns-sep_id\":\"MessageListenerService_1144082873453\",\"threadPool\":{\"maximumSize\":\"50\",\"name\":\"Message.Listener.Pool\",\"minimumSize\":\"10\",\"inactivityTimeout\":\"3500\",\"isGrowable\":\"false\",\"xmi_ns-sep_id\":\"ThreadPool_1144082873453\"}},\"stateManagement\":{\"initialState\":\"START\",\"xmi_ns-sep_id\":\"StateManageable_1144082873455\"},\"cacheSettings\":{\"cleanupInterval\":\"3000\",\"cacheSize\":\"2053\",\"xmi_ns-sep_id\":\"EJBCache_1144082873453\"}}],\"webserverPluginSettings\":{\"ExtendedHandshake\":\"false\",\"ConnectTimeout\":\"0\",\"WaitForContinue\":\"false\",\"MaxConnections\":\"-1\",\"xmi_ns-sep_id\":\"WebserverPluginSettings_1144082873453\"}}],\"errorStreamRedirect\":{\"formatWrites\":\"true\",\"maxNumberOfBackupFiles\":\"1\",\"suppressStackTrace\":\"false\",\"rolloverType\":\"SIZE\",\"suppressWrites\":\"false\",\"baseHour\":\"24\",\"fileName\":\"${SERVER_LOG_ROOT}\\/SystemErr.log\",\"messageFormatKind\":\"BASIC\",\"rolloverSize\":\"1\",\"xmi_ns-sep_id\":\"StreamRedirect_1144082873437\",\"rolloverPeriod\":\"24\"}}}";

    private  ComplexXMLConstants() {}
}
