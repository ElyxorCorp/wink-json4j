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
            "      \"xmi_ns-sep_version\" : \"2.0\",\n" +
            "      \"xmi_ns-sep_id\" : \"Server_1144082873421\",\n" +
            "      \"name\" : \"server1\",\n" +
            "      \"stateManagement\" : {\n" +
            "         \"xmi_ns-sep_id\" : \"StateManageable_1144082873437\",\n" +
            "         \"initialState\" : \"START\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"statisticsProvider\" : {\n" +
            "         \"xmi_ns-sep_id\" : \"StatisticsProvider_1144082873437\",\n" +
            "         \"specification\" : \"com.ibm.orb=enabled\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"services\" : [\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"pmiservice:PMIService\",\n" +
            "            \"xmi_ns-sep_id\" : \"PMIService_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"initialSpecLevel\" : \"\",\n" +
            "            \"statisticSet\" : \"basic\",\n" +
            "            \"synchronizedUpdate\" : \"false\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"adminservice:AdminService\",\n" +
            "            \"xmi_ns-sep_id\" : \"AdminService_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"standalone\" : \"true\",\n" +
            "            \"preferredConnector\" : \"SOAPConnector_1144082873437\",\n" +
            "            \"connectors\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"adminservice:SOAPConnector\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SOAPConnector_1144082873437\",\n" +
            "                  \"properties\" : [\n" +
            "                     {\n" +
            "                        \"xmi_ns-sep_id\" : \"Property_1144082873437\",\n" +
            "                        \"name\" : \"sslConfig\",\n" +
            "                        \"value\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "                     }\n" +
            "                     ,\n" +
            "                     {\n" +
            "                        \"xmi_ns-sep_id\" : \"Property_1144082873438\",\n" +
            "                        \"name\" : \"requestTimeout\",\n" +
            "                        \"value\" : \"600\"\n" +
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
            "            \"configRepository\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"RepositoryService_1144082873437\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"pluginConfigService\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"PluginConfigService_1144082873437\",\n" +
            "               \"enable\" : \"true\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"traceservice:TraceService\",\n" +
            "            \"xmi_ns-sep_id\" : \"TraceService_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"startupTraceSpecification\" : \"*=info\",\n" +
            "            \"traceOutputType\" : \"SPECIFIED_FILE\",\n" +
            "            \"traceFormat\" : \"BASIC\",\n" +
            "            \"memoryBufferSize\" : \"8\",\n" +
            "            \"traceLog\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"TraceLog_1144082873437\",\n" +
            "               \"fileName\" : \"${SERVER_LOG_ROOT}\\/trace.log\",\n" +
            "               \"rolloverSize\" : \"20\",\n" +
            "               \"maxNumberOfBackupFiles\" : \"1\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"loggingservice.ras:RASLoggingService\",\n" +
            "            \"xmi_ns-sep_id\" : \"RASLoggingService_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"messageFilterLevel\" : \"NONE\",\n" +
            "            \"enableCorrelationId\" : \"true\",\n" +
            "            \"serviceLog\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"ServiceLog_1144082873437\",\n" +
            "               \"name\" : \"${LOG_ROOT}\\/activity.log\",\n" +
            "               \"size\" : \"2\",\n" +
            "               \"enabled\" : \"true\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"coregroupbridgeservice:CoreGroupBridgeService\",\n" +
            "            \"xmi_ns-sep_id\" : \"CoreGroupBridgeService_1144082873437\",\n" +
            "            \"enable\" : \"true\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"tperfviewer:TPVService\",\n" +
            "            \"xmi_ns-sep_id\" : \"TPVService_1144082873437\",\n" +
            "            \"enable\" : \"true\"\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"orb:ObjectRequestBroker\",\n" +
            "            \"xmi_ns-sep_id\" : \"ObjectRequestBroker_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"requestTimeout\" : \"180\",\n" +
            "            \"requestRetriesCount\" : \"1\",\n" +
            "            \"requestRetriesDelay\" : \"0\",\n" +
            "            \"connectionCacheMaximum\" : \"240\",\n" +
            "            \"connectionCacheMinimum\" : \"100\",\n" +
            "            \"commTraceEnabled\" : \"false\",\n" +
            "            \"locateRequestTimeout\" : \"180\",\n" +
            "            \"forceTunnel\" : \"never\",\n" +
            "            \"noLocalCopies\" : \"false\",\n" +
            "            \"properties\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873439\",\n" +
            "                  \"name\" : \"com.ibm.CORBA.enableLocateRequest\",\n" +
            "                  \"value\" : \"true\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873440\",\n" +
            "                  \"name\" : \"com.ibm.CORBA.WSSSLServerSocketFactoryName\",\n" +
            "                  \"value\" : \"com.ibm.ws.security.orbssl.WSSSLServerSocketFactoryImpl\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873441\",\n" +
            "                  \"name\" : \"com.ibm.CORBA.WSSSLClientSocketFactoryName\",\n" +
            "                  \"value\" : \"com.ibm.ws.security.orbssl.WSSSLClientSocketFactoryImpl\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873442\",\n" +
            "                  \"name\" : \"com.ibm.CORBA.ConnectionInterceptorName\",\n" +
            "                  \"value\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityConnectionInterceptor\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873443\",\n" +
            "                  \"name\" : \"com.ibm.CORBA.RasManager\",\n" +
            "                  \"value\" : \"com.ibm.websphere.ras.WsOrbRasManager\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Property_1144082873444\",\n" +
            "                  \"name\" : \"com.ibm.ws.orb.transport.useMultiHome\",\n" +
            "                  \"value\" : \"true\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"interceptors\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873437\",\n" +
            "                  \"name\" : \"com.ibm.ejs.ras.RasContextSupport\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873438\",\n" +
            "                  \"name\" : \"com.ibm.ws.runtime.workloadcontroller.OrbWorkloadRequestInterceptor\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873439\",\n" +
            "                  \"name\" : \"com.ibm.ws.Transaction.JTS.TxInterceptorInitializer\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873440\",\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityComponentFactory\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873441\",\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.ServerRIWrapper\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873442\",\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.ClientRIWrapper\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873443\",\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIClientRI\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873444\",\n" +
            "                  \"name\" : \"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIServerRI\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873445\",\n" +
            "                  \"name\" : \"com.ibm.ws.wlm.client.WLMClientInitializer\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873446\",\n" +
            "                  \"name\" : \"com.ibm.ws.wlm.server.WLMServerInitializer\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873447\",\n" +
            "                  \"name\" : \"com.ibm.ws.activity.ActivityServiceServerInterceptor\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873448\",\n" +
            "                  \"name\" : \"com.ibm.debug.DebugPortableInterceptor\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Interceptor_1144082873449\",\n" +
            "                  \"name\" : \"com.ibm.debug.olt.ivbtrjrt.OLT_RI\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"plugins\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873437\",\n" +
            "                  \"name\" : \"com.ibm.ws.orbimpl.transport.WSTransport\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873438\",\n" +
            "                  \"name\" : \"com.ibm.ISecurityUtilityImpl.SecurityPropertyManager\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873439\",\n" +
            "                  \"name\" : \"com.ibm.ws.orbimpl.WSORBPropertyManager\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873440\",\n" +
            "                  \"name\" : \"com.ibm.ws.wlm.client.WLMClient\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873441\",\n" +
            "                  \"name\" : \"com.ibm.ws.pmi.server.modules.OrbPerfModule\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ORBPlugin_1144082873442\",\n" +
            "                  \"name\" : \"com.ibm.ws.csi.CORBAORBMethodAccessControl\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"threadPool\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"ThreadPool_1144082873437\",\n" +
            "               \"minimumSize\" : \"10\",\n" +
            "               \"maximumSize\" : \"50\",\n" +
            "               \"inactivityTimeout\" : \"3500\",\n" +
            "               \"isGrowable\" : \"false\",\n" +
            "               \"name\" : \"ORB.thread.pool\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"channelservice:TransportChannelService\",\n" +
            "            \"xmi_ns-sep_id\" : \"TransportChannelService_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"transportChannels\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"TCP_1\",\n" +
            "                  \"endPointName\" : \"WC_adminhost\",\n" +
            "                  \"maxOpenConnections\" : \"100\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"TCP_2\",\n" +
            "                  \"endPointName\" : \"WC_defaulthost\",\n" +
            "                  \"maxOpenConnections\" : \"20000\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"TCP_3\",\n" +
            "                  \"endPointName\" : \"WC_adminhost_secure\",\n" +
            "                  \"maxOpenConnections\" : \"100\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"TCP_4\",\n" +
            "                  \"endPointName\" : \"WC_defaulthost_secure\",\n" +
            "                  \"maxOpenConnections\" : \"20000\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873441\",\n" +
            "                  \"name\" : \"TCP_5\",\n" +
            "                  \"endPointName\" : \"DCS_UNICAST_ADDRESS\",\n" +
            "                  \"maxOpenConnections\" : \"20000\",\n" +
            "                  \"inactivityTimeout\" : \"60\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SSL_1\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SSL_2\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"SSL_3\",\n" +
            "                  \"discriminationWeight\" : \"2\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"HTTP_1\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"writeTimeout\" : \"60\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"enableLogging\" : \"false\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"HTTP_2\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"writeTimeout\" : \"60\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"enableLogging\" : \"false\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"HTTP_3\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"writeTimeout\" : \"60\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"enableLogging\" : \"false\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPInboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"HTTP_4\",\n" +
            "                  \"discriminationWeight\" : \"10\",\n" +
            "                  \"maximumPersistentRequests\" : \"100\",\n" +
            "                  \"keepAlive\" : \"true\",\n" +
            "                  \"readTimeout\" : \"60\",\n" +
            "                  \"writeTimeout\" : \"60\",\n" +
            "                  \"persistentTimeout\" : \"30\",\n" +
            "                  \"enableLogging\" : \"false\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"WCC_1\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"writeBufferSize\" : \"32768\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"WCC_2\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"writeBufferSize\" : \"32768\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"WCC_3\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"writeBufferSize\" : \"32768\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:WebContainerInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainerInboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"WCC_4\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"writeBufferSize\" : \"32768\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:DCSInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"DCSInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"DCS_1\",\n" +
            "                  \"discriminationWeight\" : \"1\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:DCSInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"DCSInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"DCS_2\",\n" +
            "                  \"discriminationWeight\" : \"1\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873442\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP\",\n" +
            "                  \"endPointName\" : \"SIB_ENDPOINT_ADDRESS\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873443\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_SSL\",\n" +
            "                  \"endPointName\" : \"SIB_ENDPOINT_SECURE_ADDRESS\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873444\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP\",\n" +
            "                  \"endPointName\" : \"SIB_MQ_ENDPOINT_ADDRESS\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPInboundChannel_1144082873445\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP_SSL\",\n" +
            "                  \"endPointName\" : \"SIB_MQ_ENDPOINT_SECURE_ADDRESS\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"SIB_SSL_JFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLInboundChannel_1144082873441\",\n" +
            "                  \"name\" : \"SIB_SSL_MQFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_JFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_JFAP_SSL\",\n" +
            "                  \"discriminationWeight\" : \"1\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPInboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_MQFAP\",\n" +
            "                  \"discriminationWeight\" : \"1\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPInboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPInboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_MQFAP_SSL\",\n" +
            "                  \"discriminationWeight\" : \"1\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_OUT\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_SSL_OUT\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_TUN_OUT\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"SIB_TCP_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873441\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP_OUT\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:TCPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TCPOutboundChannel_1144082873442\",\n" +
            "                  \"name\" : \"SIB_TCP_MQFAP_SSL_OUT\",\n" +
            "                  \"threadPool\" : \"ThreadPool_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_SSL_MQFAP_SSL_OUT\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_SSL_JFAP_SSL_OUT\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:SSLOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"SSLOutboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"SIB_SSL_JFAP_TUN_SSL_OUT\",\n" +
            "                  \"sslConfigAlias\" : \"shadowfaxNode04\\/DefaultSSLSettings\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_HTTP_JFAP_TUN_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_HTTP_JFAP_TUN_SSL_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPTunnelOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPTunnelOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_HTC_JFAP_TUN_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:HTTPTunnelOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"HTTPTunnelOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_HTC_JFAP_TUN_SSL_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_SSL_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873439\",\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_TUN_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:JFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"JFAPOutboundChannel_1144082873440\",\n" +
            "                  \"name\" : \"SIB_JFAP_JFAP_TUN_SSL_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPOutboundChannel_1144082873437\",\n" +
            "                  \"name\" : \"SIB_MQFAP_MQFAP_SSL_OUT\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"channelservice.channels:MQFAPOutboundChannel\",\n" +
            "                  \"xmi_ns-sep_id\" : \"MQFAPOutboundChannel_1144082873438\",\n" +
            "                  \"name\" : \"SIB_MQFAP_MQFAP_OUT\"\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"chains\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873437\",\n" +
            "                  \"name\" : \"WCInboundAdmin\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873437 HTTPInboundChannel_1144082873437 WebContainerInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873438\",\n" +
            "                  \"name\" : \"WCInboundDefault\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873438 HTTPInboundChannel_1144082873438 WebContainerInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873439\",\n" +
            "                  \"name\" : \"WCInboundAdminSecure\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873439 SSLInboundChannel_1144082873437 HTTPInboundChannel_1144082873439 WebContainerInboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873440\",\n" +
            "                  \"name\" : \"WCInboundDefaultSecure\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873440 SSLInboundChannel_1144082873438 HTTPInboundChannel_1144082873440 WebContainerInboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873441\",\n" +
            "                  \"name\" : \"DCS\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873441 DCSInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873442\",\n" +
            "                  \"name\" : \"DCS-Secure\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873441 SSLInboundChannel_1144082873439 DCSInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873443\",\n" +
            "                  \"name\" : \"InboundBasicMessaging\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873442 JFAPInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873444\",\n" +
            "                  \"name\" : \"InboundSecureMessaging\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873443 SSLInboundChannel_1144082873440 JFAPInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873445\",\n" +
            "                  \"name\" : \"InboundBasicMQLink\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873444 MQFAPInboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873446\",\n" +
            "                  \"name\" : \"InboundSecureMQLink\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"transportChannels\" : \"TCPInboundChannel_1144082873445 SSLInboundChannel_1144082873441 MQFAPInboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873447\",\n" +
            "                  \"name\" : \"BootstrapBasicMessaging\",\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873437\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873448\",\n" +
            "                  \"name\" : \"BootstrapSecureMessaging\",\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873438 TCPOutboundChannel_1144082873438\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873449\",\n" +
            "                  \"name\" : \"BootstrapTunneledMessaging\",\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873439 HTTPTunnelOutboundChannel_1144082873437 HTTPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873439\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873450\",\n" +
            "                  \"name\" : \"BootstrapTunneledSecureMessaging\",\n" +
            "                  \"transportChannels\" : \"JFAPOutboundChannel_1144082873440 HTTPTunnelOutboundChannel_1144082873438 HTTPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873439 TCPOutboundChannel_1144082873440\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873451\",\n" +
            "                  \"name\" : \"OutboundBasicMQLink\",\n" +
            "                  \"transportChannels\" : \"MQFAPOutboundChannel_1144082873438 TCPOutboundChannel_1144082873441\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"Chain_1144082873452\",\n" +
            "                  \"name\" : \"OutboundSecureMQLink\",\n" +
            "                  \"transportChannels\" : \"MQFAPOutboundChannel_1144082873437 SSLOutboundChannel_1144082873437 TCPOutboundChannel_1144082873442\"\n" +
            "               }\n" +
            "\n" +
            "            ]\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"threadpoolmanager:ThreadPoolManager\",\n" +
            "            \"xmi_ns-sep_id\" : \"ThreadPoolManager_1144082873437\",\n" +
            "            \"enable\" : \"true\",\n" +
            "            \"threadPools\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873441\",\n" +
            "                  \"minimumSize\" : \"0\",\n" +
            "                  \"maximumSize\" : \"10\",\n" +
            "                  \"inactivityTimeout\" : \"30000\",\n" +
            "                  \"isGrowable\" : \"false\",\n" +
            "                  \"name\" : \"server.startup\",\n" +
            "                  \"description\" : \"This pool is used by WebSphere during server startup.\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873439\",\n" +
            "                  \"minimumSize\" : \"5\",\n" +
            "                  \"maximumSize\" : \"20\",\n" +
            "                  \"name\" : \"Default\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873438\",\n" +
            "                  \"minimumSize\" : \"10\",\n" +
            "                  \"maximumSize\" : \"50\",\n" +
            "                  \"inactivityTimeout\" : \"3500\",\n" +
            "                  \"isGrowable\" : \"false\",\n" +
            "                  \"name\" : \"WebContainer\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_id\" : \"ThreadPool_1144082873440\",\n" +
            "                  \"minimumSize\" : \"4\",\n" +
            "                  \"maximumSize\" : \"50\",\n" +
            "                  \"name\" : \"SIBFAPThreadPool\",\n" +
            "                  \"description\" : \"Service integration bus FAP outbound channel thread pool\"\n" +
            "               }\n" +
            "\n" +
            "            ]\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"loggingservice.http:HTTPAccessLoggingService\",\n" +
            "            \"xmi_ns-sep_id\" : \"HTTPAccessLoggingService_1144082873437\",\n" +
            "            \"enable\" : \"false\",\n" +
            "            \"enableErrorLogging\" : \"true\",\n" +
            "            \"enableAccessLogging\" : \"true\",\n" +
            "            \"errorLog\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"LogFile_1144082873437\",\n" +
            "               \"filePath\" : \"${SERVER_LOG_ROOT}\\/http_error.log\",\n" +
            "               \"maximumSize\" : \"500\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"accessLog\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"LogFile_1144082873438\",\n" +
            "               \"filePath\" : \"${SERVER_LOG_ROOT}\\/http_access.log\",\n" +
            "               \"maximumSize\" : \"500\"\n" +
            "            }\n" +
            "         }\n" +
            "\n" +
            "      ],\n" +
            "      \"errorStreamRedirect\" : {\n" +
            "         \"xmi_ns-sep_id\" : \"StreamRedirect_1144082873437\",\n" +
            "         \"fileName\" : \"${SERVER_LOG_ROOT}\\/SystemErr.log\",\n" +
            "         \"rolloverType\" : \"SIZE\",\n" +
            "         \"maxNumberOfBackupFiles\" : \"1\",\n" +
            "         \"rolloverSize\" : \"1\",\n" +
            "         \"baseHour\" : \"24\",\n" +
            "         \"rolloverPeriod\" : \"24\",\n" +
            "         \"formatWrites\" : \"true\",\n" +
            "         \"messageFormatKind\" : \"BASIC\",\n" +
            "         \"suppressWrites\" : \"false\",\n" +
            "         \"suppressStackTrace\" : \"false\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"outputStreamRedirect\" : {\n" +
            "         \"xmi_ns-sep_id\" : \"StreamRedirect_1144082873438\",\n" +
            "         \"fileName\" : \"${SERVER_LOG_ROOT}\\/SystemOut.log\",\n" +
            "         \"rolloverType\" : \"SIZE\",\n" +
            "         \"maxNumberOfBackupFiles\" : \"1\",\n" +
            "         \"rolloverSize\" : \"1\",\n" +
            "         \"baseHour\" : \"24\",\n" +
            "         \"rolloverPeriod\" : \"24\",\n" +
            "         \"formatWrites\" : \"true\",\n" +
            "         \"messageFormatKind\" : \"BASIC\",\n" +
            "         \"suppressWrites\" : \"false\",\n" +
            "         \"suppressStackTrace\" : \"false\"\n" +
            "      }\n" +
            "      ,\n" +
            "      \"components\" : [\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"namingserver:NameServer\",\n" +
            "            \"xmi_ns-sep_id\" : \"NameServer_1144082873437\",\n" +
            "            \"stateManagement\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"StateManageable_1144082873438\",\n" +
            "               \"initialState\" : \"START\"\n" +
            "            }\n" +
            "         }\n" +
            "         ,\n" +
            "         {\n" +
            "            \"xmi_ns-sep_type\" : \"applicationserver:ApplicationServer\",\n" +
            "            \"xmi_ns-sep_id\" : \"ApplicationServer_1144082873453\",\n" +
            "            \"applicationClassLoaderPolicy\" : \"MULTIPLE\",\n" +
            "            \"stateManagement\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"StateManageable_1144082873453\",\n" +
            "               \"initialState\" : \"START\"\n" +
            "            }\n" +
            "            ,\n" +
            "            \"services\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver:TransactionService\",\n" +
            "                  \"xmi_ns-sep_id\" : \"TransactionService_1144082873453\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"totalTranLifetimeTimeout\" : \"120\",\n" +
            "                  \"clientInactivityTimeout\" : \"60\"\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver:DynamicCache\",\n" +
            "                  \"xmi_ns-sep_id\" : \"DynamicCache_1144082873453\",\n" +
            "                  \"enable\" : \"true\",\n" +
            "                  \"cacheGroups\" : {\n" +
            "                     \"xmi_ns-sep_id\" : \"ExternalCacheGroup_1144082873453\",\n" +
            "                     \"name\" : \"EsiInvalidator\",\n" +
            "                     \"members\" : {\n" +
            "                        \"xmi_ns-sep_id\" : \"ExternalCacheGroupMember_1144082873453\",\n" +
            "                        \"address\" : \"localhost\",\n" +
            "                        \"adapterBeanName\" : \"com.ibm.websphere.servlet.cache.ESIInvalidatorServlet\"\n" +
            "                     }\n" +
            "                  }\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"components\" : [\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver.webcontainer:WebContainer\",\n" +
            "                  \"xmi_ns-sep_id\" : \"WebContainer_1144082873453\",\n" +
            "                  \"enableServletCaching\" : \"false\",\n" +
            "                  \"stateManagement\" : {\n" +
            "                     \"xmi_ns-sep_id\" : \"StateManageable_1144082873454\",\n" +
            "                     \"initialState\" : \"START\"\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"services\" : {\n" +
            "                     \"xmi_ns-sep_type\" : \"applicationserver.webcontainer:SessionManager\",\n" +
            "                     \"xmi_ns-sep_id\" : \"SessionManager_1144082873453\",\n" +
            "                     \"enable\" : \"true\",\n" +
            "                     \"enableUrlRewriting\" : \"false\",\n" +
            "                     \"enableCookies\" : \"true\",\n" +
            "                     \"enableSSLTracking\" : \"false\",\n" +
            "                     \"enableProtocolSwitchRewriting\" : \"false\",\n" +
            "                     \"sessionPersistenceMode\" : \"NONE\",\n" +
            "                     \"enableSecurityIntegration\" : \"false\",\n" +
            "                     \"allowSerializedSessionAccess\" : \"false\",\n" +
            "                     \"maxWaitTime\" : \"5\",\n" +
            "                     \"accessSessionOnTimeout\" : \"true\",\n" +
            "                     \"defaultCookieSettings\" : {\n" +
            "                        \"xmi_ns-sep_id\" : \"Cookie_1144082873453\",\n" +
            "                        \"domain\" : \"\",\n" +
            "                        \"maximumAge\" : \"-1\",\n" +
            "                        \"secure\" : \"false\"\n" +
            "                     }\n" +
            "                     ,\n" +
            "                     \"sessionDatabasePersistence\" : {\n" +
            "                        \"xmi_ns-sep_id\" : \"SessionDatabasePersistence_1144082873453\",\n" +
            "                        \"datasourceJNDIName\" : \"jdbc\\/Sessions\",\n" +
            "                        \"userId\" : \"db2admin\",\n" +
            "                        \"password\" : \"{xor}Oz1tPjsyNjE=\",\n" +
            "                        \"db2RowSize\" : \"ROW_SIZE_4KB\",\n" +
            "                        \"tableSpaceName\" : \"\"\n" +
            "                     }\n" +
            "                     ,\n" +
            "                     \"tuningParams\" : {\n" +
            "                        \"xmi_ns-sep_id\" : \"TuningParams_1144082873453\",\n" +
            "                        \"usingMultiRowSchema\" : \"false\",\n" +
            "                        \"maxInMemorySessionCount\" : \"1000\",\n" +
            "                        \"allowOverflow\" : \"true\",\n" +
            "                        \"scheduleInvalidation\" : \"false\",\n" +
            "                        \"writeFrequency\" : \"TIME_BASED_WRITE\",\n" +
            "                        \"writeInterval\" : \"10\",\n" +
            "                        \"writeContents\" : \"ONLY_UPDATED_ATTRIBUTES\",\n" +
            "                        \"invalidationTimeout\" : \"30\",\n" +
            "                        \"invalidationSchedule\" : {\n" +
            "                           \"xmi_ns-sep_id\" : \"InvalidationSchedule_1144082873453\",\n" +
            "                           \"firstHour\" : \"14\",\n" +
            "                           \"secondHour\" : \"2\"\n" +
            "                        }\n" +
            "                     }\n" +
            "                  }\n" +
            "               }\n" +
            "               ,\n" +
            "               {\n" +
            "                  \"xmi_ns-sep_type\" : \"applicationserver.ejbcontainer:EJBContainer\",\n" +
            "                  \"xmi_ns-sep_id\" : \"EJBContainer_1144082873453\",\n" +
            "                  \"passivationDirectory\" : \"${USER_INSTALL_ROOT}\\/temp\",\n" +
            "                  \"inactivePoolCleanupInterval\" : \"30000\",\n" +
            "                  \"stateManagement\" : {\n" +
            "                     \"xmi_ns-sep_id\" : \"StateManageable_1144082873455\",\n" +
            "                     \"initialState\" : \"START\"\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"services\" : {\n" +
            "                     \"xmi_ns-sep_type\" : \"applicationserver.ejbcontainer.messagelistener:MessageListenerService\",\n" +
            "                     \"xmi_ns-sep_id\" : \"MessageListenerService_1144082873453\",\n" +
            "                     \"threadPool\" : {\n" +
            "                        \"xmi_ns-sep_id\" : \"ThreadPool_1144082873453\",\n" +
            "                        \"minimumSize\" : \"10\",\n" +
            "                        \"maximumSize\" : \"50\",\n" +
            "                        \"inactivityTimeout\" : \"3500\",\n" +
            "                        \"isGrowable\" : \"false\",\n" +
            "                        \"name\" : \"Message.Listener.Pool\"\n" +
            "                     }\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"cacheSettings\" : {\n" +
            "                     \"xmi_ns-sep_id\" : \"EJBCache_1144082873453\",\n" +
            "                     \"cleanupInterval\" : \"3000\",\n" +
            "                     \"cacheSize\" : \"2053\"\n" +
            "                  }\n" +
            "                  ,\n" +
            "                  \"timerSettings\" : {\n" +
            "                     \"xmi_ns-sep_id\" : \"EJBTimer_1144082873453\",\n" +
            "                     \"datasourceJNDIName\" : \"jdbc\\/DefaultEJBTimerDataSource\",\n" +
            "                     \"tablePrefix\" : \"EJBTIMER_\",\n" +
            "                     \"pollInterval\" : \"300\",\n" +
            "                     \"numAlarmThreads\" : \"1\"\n" +
            "                  }\n" +
            "               }\n" +
            "\n" +
            "            ],\n" +
            "            \"webserverPluginSettings\" : {\n" +
            "               \"xmi_ns-sep_id\" : \"WebserverPluginSettings_1144082873453\",\n" +
            "               \"WaitForContinue\" : \"false\",\n" +
            "               \"ConnectTimeout\" : \"0\",\n" +
            "               \"MaxConnections\" : \"-1\",\n" +
            "               \"ExtendedHandshake\" : \"false\"\n" +
            "            }\n" +
            "         }\n" +
            "\n" +
            "      ],\n" +
            "      \"processDefinitions\" : {\n" +
            "         \"xmi_ns-sep_type\" : \"processexec:JavaProcessDef\",\n" +
            "         \"xmi_ns-sep_id\" : \"JavaProcessDef_1144082873453\",\n" +
            "         \"workingDirectory\" : \"${USER_INSTALL_ROOT}\",\n" +
            "         \"executableTargetKind\" : \"JAVA_CLASS\",\n" +
            "         \"executableTarget\" : \"com.ibm.ws.runtime.WsServer\",\n" +
            "         \"execution\" : {\n" +
            "            \"xmi_ns-sep_id\" : \"ProcessExecution_1144082873453\",\n" +
            "            \"processPriority\" : \"20\",\n" +
            "            \"runAsUser\" : \"\",\n" +
            "            \"runAsGroup\" : \"\"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"ioRedirect\" : {\n" +
            "            \"xmi_ns-sep_id\" : \"OutputRedirect_1144082873453\",\n" +
            "            \"stdoutFilename\" : \"${SERVER_LOG_ROOT}\\/native_stdout.log\",\n" +
            "            \"stderrFilename\" : \"${SERVER_LOG_ROOT}\\/native_stderr.log\"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"monitoringPolicy\" : {\n" +
            "            \"xmi_ns-sep_id\" : \"MonitoringPolicy_1144082873453\",\n" +
            "            \"maximumStartupAttempts\" : \"3\",\n" +
            "            \"pingInterval\" : \"60\",\n" +
            "            \"pingTimeout\" : \"300\",\n" +
            "            \"autoRestart\" : \"true\",\n" +
            "            \"nodeRestartState\" : \"STOPPED\"\n" +
            "         }\n" +
            "         ,\n" +
            "         \"jvmEntries\" : {\n" +
            "            \"xmi_ns-sep_id\" : \"JavaVirtualMachine_1144082873453\",\n" +
            "            \"verboseModeClass\" : \"false\",\n" +
            "            \"verboseModeGarbageCollection\" : \"false\",\n" +
            "            \"verboseModeJNI\" : \"false\",\n" +
            "            \"runHProf\" : \"false\",\n" +
            "            \"hprofArguments\" : \"\",\n" +
            "            \"debugMode\" : \"false\",\n" +
            "            \"debugArgs\" : \"-Djava.compiler=NONE -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=7777\",\n" +
            "            \"genericJvmArguments\" : \"\"\n" +
            "         }\n" +
            "      }\n" +
            "      ,\n" +
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
            "      ]\n" +
            "   }\n" +
            "}\n";

    public final static String strCompactComplexJSON = "{\"Server\":{\"xmi_ns-sep_version\":\"2.0\",\"xmi_ns-sep_id\":\"Server_1144082873421\",\"name\":\"server1\",\"stateManagement\":{\"xmi_ns-sep_id\":\"StateManageable_1144082873437\",\"initialState\":\"START\"},\"statisticsProvider\":{\"xmi_ns-sep_id\":\"StatisticsProvider_1144082873437\",\"specification\":\"com.ibm.orb=enabled\"},\"services\":[{\"xmi_ns-sep_type\":\"pmiservice:PMIService\",\"xmi_ns-sep_id\":\"PMIService_1144082873437\",\"enable\":\"true\",\"initialSpecLevel\":\"\",\"statisticSet\":\"basic\",\"synchronizedUpdate\":\"false\"},{\"xmi_ns-sep_type\":\"adminservice:AdminService\",\"xmi_ns-sep_id\":\"AdminService_1144082873437\",\"enable\":\"true\",\"standalone\":\"true\",\"preferredConnector\":\"SOAPConnector_1144082873437\",\"connectors\":[{\"xmi_ns-sep_type\":\"adminservice:SOAPConnector\",\"xmi_ns-sep_id\":\"SOAPConnector_1144082873437\",\"properties\":[{\"xmi_ns-sep_id\":\"Property_1144082873437\",\"name\":\"sslConfig\",\"value\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_id\":\"Property_1144082873438\",\"name\":\"requestTimeout\",\"value\":\"600\"}]},{\"xmi_ns-sep_type\":\"adminservice:RMIConnector\",\"xmi_ns-sep_id\":\"RMIConnector_1144082873437\"}],\"configRepository\":{\"xmi_ns-sep_id\":\"RepositoryService_1144082873437\"},\"pluginConfigService\":{\"xmi_ns-sep_id\":\"PluginConfigService_1144082873437\",\"enable\":\"true\"}},{\"xmi_ns-sep_type\":\"traceservice:TraceService\",\"xmi_ns-sep_id\":\"TraceService_1144082873437\",\"enable\":\"true\",\"startupTraceSpecification\":\"*=info\",\"traceOutputType\":\"SPECIFIED_FILE\",\"traceFormat\":\"BASIC\",\"memoryBufferSize\":\"8\",\"traceLog\":{\"xmi_ns-sep_id\":\"TraceLog_1144082873437\",\"fileName\":\"${SERVER_LOG_ROOT}\\/trace.log\",\"rolloverSize\":\"20\",\"maxNumberOfBackupFiles\":\"1\"}},{\"xmi_ns-sep_type\":\"loggingservice.ras:RASLoggingService\",\"xmi_ns-sep_id\":\"RASLoggingService_1144082873437\",\"enable\":\"true\",\"messageFilterLevel\":\"NONE\",\"enableCorrelationId\":\"true\",\"serviceLog\":{\"xmi_ns-sep_id\":\"ServiceLog_1144082873437\",\"name\":\"${LOG_ROOT}\\/activity.log\",\"size\":\"2\",\"enabled\":\"true\"}},{\"xmi_ns-sep_type\":\"coregroupbridgeservice:CoreGroupBridgeService\",\"xmi_ns-sep_id\":\"CoreGroupBridgeService_1144082873437\",\"enable\":\"true\"},{\"xmi_ns-sep_type\":\"tperfviewer:TPVService\",\"xmi_ns-sep_id\":\"TPVService_1144082873437\",\"enable\":\"true\"},{\"xmi_ns-sep_type\":\"orb:ObjectRequestBroker\",\"xmi_ns-sep_id\":\"ObjectRequestBroker_1144082873437\",\"enable\":\"true\",\"requestTimeout\":\"180\",\"requestRetriesCount\":\"1\",\"requestRetriesDelay\":\"0\",\"connectionCacheMaximum\":\"240\",\"connectionCacheMinimum\":\"100\",\"commTraceEnabled\":\"false\",\"locateRequestTimeout\":\"180\",\"forceTunnel\":\"never\",\"noLocalCopies\":\"false\",\"properties\":[{\"xmi_ns-sep_id\":\"Property_1144082873439\",\"name\":\"com.ibm.CORBA.enableLocateRequest\",\"value\":\"true\"},{\"xmi_ns-sep_id\":\"Property_1144082873440\",\"name\":\"com.ibm.CORBA.WSSSLServerSocketFactoryName\",\"value\":\"com.ibm.ws.security.orbssl.WSSSLServerSocketFactoryImpl\"},{\"xmi_ns-sep_id\":\"Property_1144082873441\",\"name\":\"com.ibm.CORBA.WSSSLClientSocketFactoryName\",\"value\":\"com.ibm.ws.security.orbssl.WSSSLClientSocketFactoryImpl\"},{\"xmi_ns-sep_id\":\"Property_1144082873442\",\"name\":\"com.ibm.CORBA.ConnectionInterceptorName\",\"value\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityConnectionInterceptor\"},{\"xmi_ns-sep_id\":\"Property_1144082873443\",\"name\":\"com.ibm.CORBA.RasManager\",\"value\":\"com.ibm.websphere.ras.WsOrbRasManager\"},{\"xmi_ns-sep_id\":\"Property_1144082873444\",\"name\":\"com.ibm.ws.orb.transport.useMultiHome\",\"value\":\"true\"}],\"interceptors\":[{\"xmi_ns-sep_id\":\"Interceptor_1144082873437\",\"name\":\"com.ibm.ejs.ras.RasContextSupport\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873438\",\"name\":\"com.ibm.ws.runtime.workloadcontroller.OrbWorkloadRequestInterceptor\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873439\",\"name\":\"com.ibm.ws.Transaction.JTS.TxInterceptorInitializer\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873440\",\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.SecurityComponentFactory\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873441\",\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.ServerRIWrapper\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873442\",\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.ClientRIWrapper\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873443\",\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIClientRI\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873444\",\"name\":\"com.ibm.ISecurityLocalObjectBaseL13Impl.CSIServerRI\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873445\",\"name\":\"com.ibm.ws.wlm.client.WLMClientInitializer\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873446\",\"name\":\"com.ibm.ws.wlm.server.WLMServerInitializer\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873447\",\"name\":\"com.ibm.ws.activity.ActivityServiceServerInterceptor\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873448\",\"name\":\"com.ibm.debug.DebugPortableInterceptor\"},{\"xmi_ns-sep_id\":\"Interceptor_1144082873449\",\"name\":\"com.ibm.debug.olt.ivbtrjrt.OLT_RI\"}],\"plugins\":[{\"xmi_ns-sep_id\":\"ORBPlugin_1144082873437\",\"name\":\"com.ibm.ws.orbimpl.transport.WSTransport\"},{\"xmi_ns-sep_id\":\"ORBPlugin_1144082873438\",\"name\":\"com.ibm.ISecurityUtilityImpl.SecurityPropertyManager\"},{\"xmi_ns-sep_id\":\"ORBPlugin_1144082873439\",\"name\":\"com.ibm.ws.orbimpl.WSORBPropertyManager\"},{\"xmi_ns-sep_id\":\"ORBPlugin_1144082873440\",\"name\":\"com.ibm.ws.wlm.client.WLMClient\"},{\"xmi_ns-sep_id\":\"ORBPlugin_1144082873441\",\"name\":\"com.ibm.ws.pmi.server.modules.OrbPerfModule\"},{\"xmi_ns-sep_id\":\"ORBPlugin_1144082873442\",\"name\":\"com.ibm.ws.csi.CORBAORBMethodAccessControl\"}],\"threadPool\":{\"xmi_ns-sep_id\":\"ThreadPool_1144082873437\",\"minimumSize\":\"10\",\"maximumSize\":\"50\",\"inactivityTimeout\":\"3500\",\"isGrowable\":\"false\",\"name\":\"ORB.thread.pool\"}},{\"xmi_ns-sep_type\":\"channelservice:TransportChannelService\",\"xmi_ns-sep_id\":\"TransportChannelService_1144082873437\",\"enable\":\"true\",\"transportChannels\":[{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873437\",\"name\":\"TCP_1\",\"endPointName\":\"WC_adminhost\",\"maxOpenConnections\":\"100\",\"inactivityTimeout\":\"60\",\"threadPool\":\"ThreadPool_1144082873438\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873438\",\"name\":\"TCP_2\",\"endPointName\":\"WC_defaulthost\",\"maxOpenConnections\":\"20000\",\"inactivityTimeout\":\"60\",\"threadPool\":\"ThreadPool_1144082873438\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873439\",\"name\":\"TCP_3\",\"endPointName\":\"WC_adminhost_secure\",\"maxOpenConnections\":\"100\",\"inactivityTimeout\":\"60\",\"threadPool\":\"ThreadPool_1144082873438\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873440\",\"name\":\"TCP_4\",\"endPointName\":\"WC_defaulthost_secure\",\"maxOpenConnections\":\"20000\",\"inactivityTimeout\":\"60\",\"threadPool\":\"ThreadPool_1144082873438\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873441\",\"name\":\"TCP_5\",\"endPointName\":\"DCS_UNICAST_ADDRESS\",\"maxOpenConnections\":\"20000\",\"inactivityTimeout\":\"60\",\"threadPool\":\"ThreadPool_1144082873439\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873437\",\"name\":\"SSL_1\",\"discriminationWeight\":\"1\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873438\",\"name\":\"SSL_2\",\"discriminationWeight\":\"1\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873439\",\"name\":\"SSL_3\",\"discriminationWeight\":\"2\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873437\",\"name\":\"HTTP_1\",\"discriminationWeight\":\"10\",\"maximumPersistentRequests\":\"100\",\"keepAlive\":\"true\",\"readTimeout\":\"60\",\"writeTimeout\":\"60\",\"persistentTimeout\":\"30\",\"enableLogging\":\"false\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873438\",\"name\":\"HTTP_2\",\"discriminationWeight\":\"10\",\"maximumPersistentRequests\":\"100\",\"keepAlive\":\"true\",\"readTimeout\":\"60\",\"writeTimeout\":\"60\",\"persistentTimeout\":\"30\",\"enableLogging\":\"false\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873439\",\"name\":\"HTTP_3\",\"discriminationWeight\":\"10\",\"maximumPersistentRequests\":\"100\",\"keepAlive\":\"true\",\"readTimeout\":\"60\",\"writeTimeout\":\"60\",\"persistentTimeout\":\"30\",\"enableLogging\":\"false\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPInboundChannel\",\"xmi_ns-sep_id\":\"HTTPInboundChannel_1144082873440\",\"name\":\"HTTP_4\",\"discriminationWeight\":\"10\",\"maximumPersistentRequests\":\"100\",\"keepAlive\":\"true\",\"readTimeout\":\"60\",\"writeTimeout\":\"60\",\"persistentTimeout\":\"30\",\"enableLogging\":\"false\"},{\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873437\",\"name\":\"WCC_1\",\"discriminationWeight\":\"1\",\"writeBufferSize\":\"32768\"},{\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873438\",\"name\":\"WCC_2\",\"discriminationWeight\":\"1\",\"writeBufferSize\":\"32768\"},{\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873439\",\"name\":\"WCC_3\",\"discriminationWeight\":\"1\",\"writeBufferSize\":\"32768\"},{\"xmi_ns-sep_type\":\"channelservice.channels:WebContainerInboundChannel\",\"xmi_ns-sep_id\":\"WebContainerInboundChannel_1144082873440\",\"name\":\"WCC_4\",\"discriminationWeight\":\"1\",\"writeBufferSize\":\"32768\"},{\"xmi_ns-sep_type\":\"channelservice.channels:DCSInboundChannel\",\"xmi_ns-sep_id\":\"DCSInboundChannel_1144082873437\",\"name\":\"DCS_1\",\"discriminationWeight\":\"1\"},{\"xmi_ns-sep_type\":\"channelservice.channels:DCSInboundChannel\",\"xmi_ns-sep_id\":\"DCSInboundChannel_1144082873438\",\"name\":\"DCS_2\",\"discriminationWeight\":\"1\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873442\",\"name\":\"SIB_TCP_JFAP\",\"endPointName\":\"SIB_ENDPOINT_ADDRESS\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873443\",\"name\":\"SIB_TCP_JFAP_SSL\",\"endPointName\":\"SIB_ENDPOINT_SECURE_ADDRESS\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873444\",\"name\":\"SIB_TCP_MQFAP\",\"endPointName\":\"SIB_MQ_ENDPOINT_ADDRESS\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPInboundChannel\",\"xmi_ns-sep_id\":\"TCPInboundChannel_1144082873445\",\"name\":\"SIB_TCP_MQFAP_SSL\",\"endPointName\":\"SIB_MQ_ENDPOINT_SECURE_ADDRESS\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873440\",\"name\":\"SIB_SSL_JFAP\",\"discriminationWeight\":\"1\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLInboundChannel\",\"xmi_ns-sep_id\":\"SSLInboundChannel_1144082873441\",\"name\":\"SIB_SSL_MQFAP\",\"discriminationWeight\":\"1\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:JFAPInboundChannel\",\"xmi_ns-sep_id\":\"JFAPInboundChannel_1144082873437\",\"name\":\"SIB_JFAP\",\"discriminationWeight\":\"1\"},{\"xmi_ns-sep_type\":\"channelservice.channels:JFAPInboundChannel\",\"xmi_ns-sep_id\":\"JFAPInboundChannel_1144082873438\",\"name\":\"SIB_JFAP_SSL\",\"discriminationWeight\":\"1\"},{\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPInboundChannel\",\"xmi_ns-sep_id\":\"MQFAPInboundChannel_1144082873437\",\"name\":\"SIB_MQFAP\",\"discriminationWeight\":\"1\"},{\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPInboundChannel\",\"xmi_ns-sep_id\":\"MQFAPInboundChannel_1144082873438\",\"name\":\"SIB_MQFAP_SSL\",\"discriminationWeight\":\"1\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873437\",\"name\":\"SIB_TCP_JFAP_OUT\",\"threadPool\":\"ThreadPool_1144082873440\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873438\",\"name\":\"SIB_TCP_JFAP_SSL_OUT\",\"threadPool\":\"ThreadPool_1144082873440\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873439\",\"name\":\"SIB_TCP_JFAP_TUN_OUT\",\"threadPool\":\"ThreadPool_1144082873440\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873440\",\"name\":\"SIB_TCP_JFAP_TUN_SSL_OUT\",\"threadPool\":\"ThreadPool_1144082873440\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873441\",\"name\":\"SIB_TCP_MQFAP_OUT\",\"threadPool\":\"ThreadPool_1144082873440\"},{\"xmi_ns-sep_type\":\"channelservice.channels:TCPOutboundChannel\",\"xmi_ns-sep_id\":\"TCPOutboundChannel_1144082873442\",\"name\":\"SIB_TCP_MQFAP_SSL_OUT\",\"threadPool\":\"ThreadPool_1144082873440\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLOutboundChannel\",\"xmi_ns-sep_id\":\"SSLOutboundChannel_1144082873437\",\"name\":\"SIB_SSL_MQFAP_SSL_OUT\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLOutboundChannel\",\"xmi_ns-sep_id\":\"SSLOutboundChannel_1144082873438\",\"name\":\"SIB_SSL_JFAP_SSL_OUT\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:SSLOutboundChannel\",\"xmi_ns-sep_id\":\"SSLOutboundChannel_1144082873439\",\"name\":\"SIB_SSL_JFAP_TUN_SSL_OUT\",\"sslConfigAlias\":\"shadowfaxNode04\\/DefaultSSLSettings\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPOutboundChannel_1144082873437\",\"name\":\"SIB_HTTP_JFAP_TUN_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPOutboundChannel_1144082873438\",\"name\":\"SIB_HTTP_JFAP_TUN_SSL_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPTunnelOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPTunnelOutboundChannel_1144082873437\",\"name\":\"SIB_HTC_JFAP_TUN_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:HTTPTunnelOutboundChannel\",\"xmi_ns-sep_id\":\"HTTPTunnelOutboundChannel_1144082873438\",\"name\":\"SIB_HTC_JFAP_TUN_SSL_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873437\",\"name\":\"SIB_JFAP_JFAP_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873438\",\"name\":\"SIB_JFAP_JFAP_SSL_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873439\",\"name\":\"SIB_JFAP_JFAP_TUN_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:JFAPOutboundChannel\",\"xmi_ns-sep_id\":\"JFAPOutboundChannel_1144082873440\",\"name\":\"SIB_JFAP_JFAP_TUN_SSL_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPOutboundChannel\",\"xmi_ns-sep_id\":\"MQFAPOutboundChannel_1144082873437\",\"name\":\"SIB_MQFAP_MQFAP_SSL_OUT\"},{\"xmi_ns-sep_type\":\"channelservice.channels:MQFAPOutboundChannel\",\"xmi_ns-sep_id\":\"MQFAPOutboundChannel_1144082873438\",\"name\":\"SIB_MQFAP_MQFAP_OUT\"}],\"chains\":[{\"xmi_ns-sep_id\":\"Chain_1144082873437\",\"name\":\"WCInboundAdmin\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873437 HTTPInboundChannel_1144082873437 WebContainerInboundChannel_1144082873437\"},{\"xmi_ns-sep_id\":\"Chain_1144082873438\",\"name\":\"WCInboundDefault\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873438 HTTPInboundChannel_1144082873438 WebContainerInboundChannel_1144082873438\"},{\"xmi_ns-sep_id\":\"Chain_1144082873439\",\"name\":\"WCInboundAdminSecure\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873439 SSLInboundChannel_1144082873437 HTTPInboundChannel_1144082873439 WebContainerInboundChannel_1144082873439\"},{\"xmi_ns-sep_id\":\"Chain_1144082873440\",\"name\":\"WCInboundDefaultSecure\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873440 SSLInboundChannel_1144082873438 HTTPInboundChannel_1144082873440 WebContainerInboundChannel_1144082873440\"},{\"xmi_ns-sep_id\":\"Chain_1144082873441\",\"name\":\"DCS\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873441 DCSInboundChannel_1144082873437\"},{\"xmi_ns-sep_id\":\"Chain_1144082873442\",\"name\":\"DCS-Secure\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873441 SSLInboundChannel_1144082873439 DCSInboundChannel_1144082873438\"},{\"xmi_ns-sep_id\":\"Chain_1144082873443\",\"name\":\"InboundBasicMessaging\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873442 JFAPInboundChannel_1144082873437\"},{\"xmi_ns-sep_id\":\"Chain_1144082873444\",\"name\":\"InboundSecureMessaging\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873443 SSLInboundChannel_1144082873440 JFAPInboundChannel_1144082873438\"},{\"xmi_ns-sep_id\":\"Chain_1144082873445\",\"name\":\"InboundBasicMQLink\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873444 MQFAPInboundChannel_1144082873437\"},{\"xmi_ns-sep_id\":\"Chain_1144082873446\",\"name\":\"InboundSecureMQLink\",\"enable\":\"true\",\"transportChannels\":\"TCPInboundChannel_1144082873445 SSLInboundChannel_1144082873441 MQFAPInboundChannel_1144082873438\"},{\"xmi_ns-sep_id\":\"Chain_1144082873447\",\"name\":\"BootstrapBasicMessaging\",\"transportChannels\":\"JFAPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873437\"},{\"xmi_ns-sep_id\":\"Chain_1144082873448\",\"name\":\"BootstrapSecureMessaging\",\"transportChannels\":\"JFAPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873438 TCPOutboundChannel_1144082873438\"},{\"xmi_ns-sep_id\":\"Chain_1144082873449\",\"name\":\"BootstrapTunneledMessaging\",\"transportChannels\":\"JFAPOutboundChannel_1144082873439 HTTPTunnelOutboundChannel_1144082873437 HTTPOutboundChannel_1144082873437 TCPOutboundChannel_1144082873439\"},{\"xmi_ns-sep_id\":\"Chain_1144082873450\",\"name\":\"BootstrapTunneledSecureMessaging\",\"transportChannels\":\"JFAPOutboundChannel_1144082873440 HTTPTunnelOutboundChannel_1144082873438 HTTPOutboundChannel_1144082873438 SSLOutboundChannel_1144082873439 TCPOutboundChannel_1144082873440\"},{\"xmi_ns-sep_id\":\"Chain_1144082873451\",\"name\":\"OutboundBasicMQLink\",\"transportChannels\":\"MQFAPOutboundChannel_1144082873438 TCPOutboundChannel_1144082873441\"},{\"xmi_ns-sep_id\":\"Chain_1144082873452\",\"name\":\"OutboundSecureMQLink\",\"transportChannels\":\"MQFAPOutboundChannel_1144082873437 SSLOutboundChannel_1144082873437 TCPOutboundChannel_1144082873442\"}]},{\"xmi_ns-sep_type\":\"threadpoolmanager:ThreadPoolManager\",\"xmi_ns-sep_id\":\"ThreadPoolManager_1144082873437\",\"enable\":\"true\",\"threadPools\":[{\"xmi_ns-sep_id\":\"ThreadPool_1144082873441\",\"minimumSize\":\"0\",\"maximumSize\":\"10\",\"inactivityTimeout\":\"30000\",\"isGrowable\":\"false\",\"name\":\"server.startup\",\"description\":\"This pool is used by WebSphere during server startup.\"},{\"xmi_ns-sep_id\":\"ThreadPool_1144082873439\",\"minimumSize\":\"5\",\"maximumSize\":\"20\",\"name\":\"Default\"},{\"xmi_ns-sep_id\":\"ThreadPool_1144082873438\",\"minimumSize\":\"10\",\"maximumSize\":\"50\",\"inactivityTimeout\":\"3500\",\"isGrowable\":\"false\",\"name\":\"WebContainer\"},{\"xmi_ns-sep_id\":\"ThreadPool_1144082873440\",\"minimumSize\":\"4\",\"maximumSize\":\"50\",\"name\":\"SIBFAPThreadPool\",\"description\":\"Service integration bus FAP outbound channel thread pool\"}]},{\"xmi_ns-sep_type\":\"loggingservice.http:HTTPAccessLoggingService\",\"xmi_ns-sep_id\":\"HTTPAccessLoggingService_1144082873437\",\"enable\":\"false\",\"enableErrorLogging\":\"true\",\"enableAccessLogging\":\"true\",\"errorLog\":{\"xmi_ns-sep_id\":\"LogFile_1144082873437\",\"filePath\":\"${SERVER_LOG_ROOT}\\/http_error.log\",\"maximumSize\":\"500\"},\"accessLog\":{\"xmi_ns-sep_id\":\"LogFile_1144082873438\",\"filePath\":\"${SERVER_LOG_ROOT}\\/http_access.log\",\"maximumSize\":\"500\"}}],\"errorStreamRedirect\":{\"xmi_ns-sep_id\":\"StreamRedirect_1144082873437\",\"fileName\":\"${SERVER_LOG_ROOT}\\/SystemErr.log\",\"rolloverType\":\"SIZE\",\"maxNumberOfBackupFiles\":\"1\",\"rolloverSize\":\"1\",\"baseHour\":\"24\",\"rolloverPeriod\":\"24\",\"formatWrites\":\"true\",\"messageFormatKind\":\"BASIC\",\"suppressWrites\":\"false\",\"suppressStackTrace\":\"false\"},\"outputStreamRedirect\":{\"xmi_ns-sep_id\":\"StreamRedirect_1144082873438\",\"fileName\":\"${SERVER_LOG_ROOT}\\/SystemOut.log\",\"rolloverType\":\"SIZE\",\"maxNumberOfBackupFiles\":\"1\",\"rolloverSize\":\"1\",\"baseHour\":\"24\",\"rolloverPeriod\":\"24\",\"formatWrites\":\"true\",\"messageFormatKind\":\"BASIC\",\"suppressWrites\":\"false\",\"suppressStackTrace\":\"false\"},\"components\":[{\"xmi_ns-sep_type\":\"namingserver:NameServer\",\"xmi_ns-sep_id\":\"NameServer_1144082873437\",\"stateManagement\":{\"xmi_ns-sep_id\":\"StateManageable_1144082873438\",\"initialState\":\"START\"}},{\"xmi_ns-sep_type\":\"applicationserver:ApplicationServer\",\"xmi_ns-sep_id\":\"ApplicationServer_1144082873453\",\"applicationClassLoaderPolicy\":\"MULTIPLE\",\"stateManagement\":{\"xmi_ns-sep_id\":\"StateManageable_1144082873453\",\"initialState\":\"START\"},\"services\":[{\"xmi_ns-sep_type\":\"applicationserver:TransactionService\",\"xmi_ns-sep_id\":\"TransactionService_1144082873453\",\"enable\":\"true\",\"totalTranLifetimeTimeout\":\"120\",\"clientInactivityTimeout\":\"60\"},{\"xmi_ns-sep_type\":\"applicationserver:DynamicCache\",\"xmi_ns-sep_id\":\"DynamicCache_1144082873453\",\"enable\":\"true\",\"cacheGroups\":{\"xmi_ns-sep_id\":\"ExternalCacheGroup_1144082873453\",\"name\":\"EsiInvalidator\",\"members\":{\"xmi_ns-sep_id\":\"ExternalCacheGroupMember_1144082873453\",\"address\":\"localhost\",\"adapterBeanName\":\"com.ibm.websphere.servlet.cache.ESIInvalidatorServlet\"}}}],\"components\":[{\"xmi_ns-sep_type\":\"applicationserver.webcontainer:WebContainer\",\"xmi_ns-sep_id\":\"WebContainer_1144082873453\",\"enableServletCaching\":\"false\",\"stateManagement\":{\"xmi_ns-sep_id\":\"StateManageable_1144082873454\",\"initialState\":\"START\"},\"services\":{\"xmi_ns-sep_type\":\"applicationserver.webcontainer:SessionManager\",\"xmi_ns-sep_id\":\"SessionManager_1144082873453\",\"enable\":\"true\",\"enableUrlRewriting\":\"false\",\"enableCookies\":\"true\",\"enableSSLTracking\":\"false\",\"enableProtocolSwitchRewriting\":\"false\",\"sessionPersistenceMode\":\"NONE\",\"enableSecurityIntegration\":\"false\",\"allowSerializedSessionAccess\":\"false\",\"maxWaitTime\":\"5\",\"accessSessionOnTimeout\":\"true\",\"defaultCookieSettings\":{\"xmi_ns-sep_id\":\"Cookie_1144082873453\",\"domain\":\"\",\"maximumAge\":\"-1\",\"secure\":\"false\"},\"sessionDatabasePersistence\":{\"xmi_ns-sep_id\":\"SessionDatabasePersistence_1144082873453\",\"datasourceJNDIName\":\"jdbc\\/Sessions\",\"userId\":\"db2admin\",\"password\":\"{xor}Oz1tPjsyNjE=\",\"db2RowSize\":\"ROW_SIZE_4KB\",\"tableSpaceName\":\"\"},\"tuningParams\":{\"xmi_ns-sep_id\":\"TuningParams_1144082873453\",\"usingMultiRowSchema\":\"false\",\"maxInMemorySessionCount\":\"1000\",\"allowOverflow\":\"true\",\"scheduleInvalidation\":\"false\",\"writeFrequency\":\"TIME_BASED_WRITE\",\"writeInterval\":\"10\",\"writeContents\":\"ONLY_UPDATED_ATTRIBUTES\",\"invalidationTimeout\":\"30\",\"invalidationSchedule\":{\"xmi_ns-sep_id\":\"InvalidationSchedule_1144082873453\",\"firstHour\":\"14\",\"secondHour\":\"2\"}}}},{\"xmi_ns-sep_type\":\"applicationserver.ejbcontainer:EJBContainer\",\"xmi_ns-sep_id\":\"EJBContainer_1144082873453\",\"passivationDirectory\":\"${USER_INSTALL_ROOT}\\/temp\",\"inactivePoolCleanupInterval\":\"30000\",\"stateManagement\":{\"xmi_ns-sep_id\":\"StateManageable_1144082873455\",\"initialState\":\"START\"},\"services\":{\"xmi_ns-sep_type\":\"applicationserver.ejbcontainer.messagelistener:MessageListenerService\",\"xmi_ns-sep_id\":\"MessageListenerService_1144082873453\",\"threadPool\":{\"xmi_ns-sep_id\":\"ThreadPool_1144082873453\",\"minimumSize\":\"10\",\"maximumSize\":\"50\",\"inactivityTimeout\":\"3500\",\"isGrowable\":\"false\",\"name\":\"Message.Listener.Pool\"}},\"cacheSettings\":{\"xmi_ns-sep_id\":\"EJBCache_1144082873453\",\"cleanupInterval\":\"3000\",\"cacheSize\":\"2053\"},\"timerSettings\":{\"xmi_ns-sep_id\":\"EJBTimer_1144082873453\",\"datasourceJNDIName\":\"jdbc\\/DefaultEJBTimerDataSource\",\"tablePrefix\":\"EJBTIMER_\",\"pollInterval\":\"300\",\"numAlarmThreads\":\"1\"}}],\"webserverPluginSettings\":{\"xmi_ns-sep_id\":\"WebserverPluginSettings_1144082873453\",\"WaitForContinue\":\"false\",\"ConnectTimeout\":\"0\",\"MaxConnections\":\"-1\",\"ExtendedHandshake\":\"false\"}}],\"processDefinitions\":{\"xmi_ns-sep_type\":\"processexec:JavaProcessDef\",\"xmi_ns-sep_id\":\"JavaProcessDef_1144082873453\",\"workingDirectory\":\"${USER_INSTALL_ROOT}\",\"executableTargetKind\":\"JAVA_CLASS\",\"executableTarget\":\"com.ibm.ws.runtime.WsServer\",\"execution\":{\"xmi_ns-sep_id\":\"ProcessExecution_1144082873453\",\"processPriority\":\"20\",\"runAsUser\":\"\",\"runAsGroup\":\"\"},\"ioRedirect\":{\"xmi_ns-sep_id\":\"OutputRedirect_1144082873453\",\"stdoutFilename\":\"${SERVER_LOG_ROOT}\\/native_stdout.log\",\"stderrFilename\":\"${SERVER_LOG_ROOT}\\/native_stderr.log\"},\"monitoringPolicy\":{\"xmi_ns-sep_id\":\"MonitoringPolicy_1144082873453\",\"maximumStartupAttempts\":\"3\",\"pingInterval\":\"60\",\"pingTimeout\":\"300\",\"autoRestart\":\"true\",\"nodeRestartState\":\"STOPPED\"},\"jvmEntries\":{\"xmi_ns-sep_id\":\"JavaVirtualMachine_1144082873453\",\"verboseModeClass\":\"false\",\"verboseModeGarbageCollection\":\"false\",\"verboseModeJNI\":\"false\",\"runHProf\":\"false\",\"hprofArguments\":\"\",\"debugMode\":\"false\",\"debugArgs\":\"-Djava.compiler=NONE -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=7777\",\"genericJvmArguments\":\"\"}},\"banana\":[{\"foo\":\"This \\\"sucks\\\"\"},{\"foo\":\"\\\"sucks\\\" this does.\"},{\"foo\":\"\\\"sucks\\\"\"},{\"foo\":\"   \\\"sucks\\\"  \"},\"BananaMan!\",{\"content\":\"BananaMan!\",\"foo\":\"Bad guy\"},true]}}";

    private  ComplexXMLConstants() {}
}
