/*
 * (C) Copyright IBM Corp. 2025.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseDetails model.
 */
public class DatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseDetails() throws Throwable {
    DatabaseDetails databaseDetailsModel = new DatabaseDetails.Builder()
      .authenticationType("LDAP")
      .authenticationValue("LDAP")
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .brokerHost("samplehost")
      .brokerPort(Long.valueOf("4553"))
      .certificate("exampleCertificate")
      .certificateExtension("pem")
      .connectionMethod("basic, apikey")
      .connectionMode("service_name")
      .connectionModeValue("orclpdb")
      .connectionType("JDBC, Arrow flight")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .coordinatorHost("samplehost")
      .coordinatorPort(Long.valueOf("4553"))
      .cpdHostname("samplecpdhostname")
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .databaseName("new_database")
      .hostname("http://db2@localhost:9900.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .projectId("conops-bigquery")
      .sasl(true)
      .saslMechanism("plain")
      .schemaName("sampleSchema")
      .schemas("redis__name")
      .serviceApiKey("sampleapikey")
      .serviceHostname("api.dataplatform.dev.cloud.ibm.com")
      .servicePassword("samplepassword")
      .servicePort(Long.valueOf("443"))
      .serviceSsl(true)
      .serviceTokenUrl("sampletoakenurl")
      .serviceUsername("sampleusername")
      .ssl(true)
      .tables("kafka_table_name, redis_table_name")
      .username("sampleuser")
      .validateServerCertificate(true)
      .verifyHostName(true)
      .warehouseName("samplewrehouse")
      .build();
    assertEquals(databaseDetailsModel.authenticationType(), "LDAP");
    assertEquals(databaseDetailsModel.authenticationValue(), "LDAP");
    assertEquals(databaseDetailsModel.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsModel.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsModel.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsModel.brokerHost(), "samplehost");
    assertEquals(databaseDetailsModel.brokerPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.certificate(), "exampleCertificate");
    assertEquals(databaseDetailsModel.certificateExtension(), "pem");
    assertEquals(databaseDetailsModel.connectionMethod(), "basic, apikey");
    assertEquals(databaseDetailsModel.connectionMode(), "service_name");
    assertEquals(databaseDetailsModel.connectionModeValue(), "orclpdb");
    assertEquals(databaseDetailsModel.connectionType(), "JDBC, Arrow flight");
    assertEquals(databaseDetailsModel.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsModel.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsModel.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsModel.coordinatorHost(), "samplehost");
    assertEquals(databaseDetailsModel.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.cpdHostname(), "samplecpdhostname");
    assertEquals(databaseDetailsModel.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseDetailsModel.databaseName(), "new_database");
    assertEquals(databaseDetailsModel.hostname(), "http://db2@localhost:9900.com");
    assertEquals(databaseDetailsModel.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsModel.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsModel.informixServer(), "ol_informix1410");
    assertEquals(databaseDetailsModel.password(), "samplepassword");
    assertEquals(databaseDetailsModel.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.projectId(), "conops-bigquery");
    assertEquals(databaseDetailsModel.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.saslMechanism(), "plain");
    assertEquals(databaseDetailsModel.schemaName(), "sampleSchema");
    assertEquals(databaseDetailsModel.schemas(), "redis__name");
    assertEquals(databaseDetailsModel.serviceApiKey(), "sampleapikey");
    assertEquals(databaseDetailsModel.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(databaseDetailsModel.servicePassword(), "samplepassword");
    assertEquals(databaseDetailsModel.servicePort(), Long.valueOf("443"));
    assertEquals(databaseDetailsModel.serviceSsl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.serviceTokenUrl(), "sampletoakenurl");
    assertEquals(databaseDetailsModel.serviceUsername(), "sampleusername");
    assertEquals(databaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.tables(), "kafka_table_name, redis_table_name");
    assertEquals(databaseDetailsModel.username(), "sampleuser");
    assertEquals(databaseDetailsModel.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.verifyHostName(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.warehouseName(), "samplewrehouse");

    String json = TestUtilities.serialize(databaseDetailsModel);

    DatabaseDetails databaseDetailsModelNew = TestUtilities.deserialize(json, DatabaseDetails.class);
    assertTrue(databaseDetailsModelNew instanceof DatabaseDetails);
    assertEquals(databaseDetailsModelNew.authenticationType(), "LDAP");
    assertEquals(databaseDetailsModelNew.authenticationValue(), "LDAP");
    assertEquals(databaseDetailsModelNew.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsModelNew.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsModelNew.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsModelNew.brokerHost(), "samplehost");
    assertEquals(databaseDetailsModelNew.brokerPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModelNew.certificate(), "exampleCertificate");
    assertEquals(databaseDetailsModelNew.certificateExtension(), "pem");
    assertEquals(databaseDetailsModelNew.connectionMethod(), "basic, apikey");
    assertEquals(databaseDetailsModelNew.connectionMode(), "service_name");
    assertEquals(databaseDetailsModelNew.connectionModeValue(), "orclpdb");
    assertEquals(databaseDetailsModelNew.connectionType(), "JDBC, Arrow flight");
    assertEquals(databaseDetailsModelNew.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsModelNew.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsModelNew.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsModelNew.coordinatorHost(), "samplehost");
    assertEquals(databaseDetailsModelNew.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModelNew.cpdHostname(), "samplecpdhostname");
    assertEquals(databaseDetailsModelNew.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseDetailsModelNew.databaseName(), "new_database");
    assertEquals(databaseDetailsModelNew.hostname(), "http://db2@localhost:9900.com");
    assertEquals(databaseDetailsModelNew.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsModelNew.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsModelNew.informixServer(), "ol_informix1410");
    assertEquals(databaseDetailsModelNew.password(), "samplepassword");
    assertEquals(databaseDetailsModelNew.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModelNew.projectId(), "conops-bigquery");
    assertEquals(databaseDetailsModelNew.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.saslMechanism(), "plain");
    assertEquals(databaseDetailsModelNew.schemaName(), "sampleSchema");
    assertEquals(databaseDetailsModelNew.schemas(), "redis__name");
    assertEquals(databaseDetailsModelNew.serviceApiKey(), "sampleapikey");
    assertEquals(databaseDetailsModelNew.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(databaseDetailsModelNew.servicePassword(), "samplepassword");
    assertEquals(databaseDetailsModelNew.servicePort(), Long.valueOf("443"));
    assertEquals(databaseDetailsModelNew.serviceSsl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.serviceTokenUrl(), "sampletoakenurl");
    assertEquals(databaseDetailsModelNew.serviceUsername(), "sampleusername");
    assertEquals(databaseDetailsModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.tables(), "kafka_table_name, redis_table_name");
    assertEquals(databaseDetailsModelNew.username(), "sampleuser");
    assertEquals(databaseDetailsModelNew.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.verifyHostName(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.warehouseName(), "samplewrehouse");
  }
}