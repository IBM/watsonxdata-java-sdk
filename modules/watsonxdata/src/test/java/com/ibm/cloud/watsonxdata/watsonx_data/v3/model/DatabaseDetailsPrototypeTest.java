/*
 * (C) Copyright IBM Corp. 2026.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseDetailsPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseDetailsPrototype model.
 */
public class DatabaseDetailsPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseDetailsPrototype() throws Throwable {
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();
    assertEquals(secretDetailsModel.key(), "secret key");
    assertEquals(secretDetailsModel.secretName(), "secret name");
    assertEquals(secretDetailsModel.secretUrn(), "secret urn");

    DatabaseDetailsPrototype databaseDetailsPrototypeModel = new DatabaseDetailsPrototype.Builder()
      .authenticationType("LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword")
      .authenticationValue("LDAP")
      .authenticationValueKeyVault(secretDetailsModel)
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
      .domainName("conops-mssql.conops.local")
      .hostname("http://db2@localhost:9900.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .name("new_database")
      .password("samplepassword")
      .passwordKeyVault(secretDetailsModel)
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
      .sslcertificateKeyVault(secretDetailsModel)
      .tables("kafka_table_name, redis_table_name")
      .username("sampleuser")
      .usernameKeyVault(secretDetailsModel)
      .validateServerCertificate(true)
      .vaultEnabled(true)
      .verifyHostName(true)
      .warehouseName("samplewrehouse")
      .build();
    assertEquals(databaseDetailsPrototypeModel.authenticationType(), "LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword");
    assertEquals(databaseDetailsPrototypeModel.authenticationValue(), "LDAP");
    assertEquals(databaseDetailsPrototypeModel.authenticationValueKeyVault(), secretDetailsModel);
    assertEquals(databaseDetailsPrototypeModel.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModel.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsPrototypeModel.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsPrototypeModel.brokerHost(), "samplehost");
    assertEquals(databaseDetailsPrototypeModel.brokerPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsPrototypeModel.certificate(), "exampleCertificate");
    assertEquals(databaseDetailsPrototypeModel.certificateExtension(), "pem");
    assertEquals(databaseDetailsPrototypeModel.connectionMethod(), "basic, apikey");
    assertEquals(databaseDetailsPrototypeModel.connectionMode(), "service_name");
    assertEquals(databaseDetailsPrototypeModel.connectionModeValue(), "orclpdb");
    assertEquals(databaseDetailsPrototypeModel.connectionType(), "JDBC, Arrow flight");
    assertEquals(databaseDetailsPrototypeModel.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModel.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsPrototypeModel.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsPrototypeModel.coordinatorHost(), "samplehost");
    assertEquals(databaseDetailsPrototypeModel.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsPrototypeModel.cpdHostname(), "samplecpdhostname");
    assertEquals(databaseDetailsPrototypeModel.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseDetailsPrototypeModel.domainName(), "conops-mssql.conops.local");
    assertEquals(databaseDetailsPrototypeModel.hostname(), "http://db2@localhost:9900.com");
    assertEquals(databaseDetailsPrototypeModel.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsPrototypeModel.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsPrototypeModel.informixServer(), "ol_informix1410");
    assertEquals(databaseDetailsPrototypeModel.name(), "new_database");
    assertEquals(databaseDetailsPrototypeModel.password(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModel.passwordKeyVault(), secretDetailsModel);
    assertEquals(databaseDetailsPrototypeModel.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsPrototypeModel.projectId(), "conops-bigquery");
    assertEquals(databaseDetailsPrototypeModel.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModel.saslMechanism(), "plain");
    assertEquals(databaseDetailsPrototypeModel.schemaName(), "sampleSchema");
    assertEquals(databaseDetailsPrototypeModel.schemas(), "redis__name");
    assertEquals(databaseDetailsPrototypeModel.serviceApiKey(), "sampleapikey");
    assertEquals(databaseDetailsPrototypeModel.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(databaseDetailsPrototypeModel.servicePassword(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModel.servicePort(), Long.valueOf("443"));
    assertEquals(databaseDetailsPrototypeModel.serviceSsl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModel.serviceTokenUrl(), "sampletoakenurl");
    assertEquals(databaseDetailsPrototypeModel.serviceUsername(), "sampleusername");
    assertEquals(databaseDetailsPrototypeModel.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModel.sslcertificateKeyVault(), secretDetailsModel);
    assertEquals(databaseDetailsPrototypeModel.tables(), "kafka_table_name, redis_table_name");
    assertEquals(databaseDetailsPrototypeModel.username(), "sampleuser");
    assertEquals(databaseDetailsPrototypeModel.usernameKeyVault(), secretDetailsModel);
    assertEquals(databaseDetailsPrototypeModel.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModel.vaultEnabled(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModel.verifyHostName(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModel.warehouseName(), "samplewrehouse");

    String json = TestUtilities.serialize(databaseDetailsPrototypeModel);

    DatabaseDetailsPrototype databaseDetailsPrototypeModelNew = TestUtilities.deserialize(json, DatabaseDetailsPrototype.class);
    assertTrue(databaseDetailsPrototypeModelNew instanceof DatabaseDetailsPrototype);
    assertEquals(databaseDetailsPrototypeModelNew.authenticationType(), "LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword");
    assertEquals(databaseDetailsPrototypeModelNew.authenticationValue(), "LDAP");
    assertEquals(databaseDetailsPrototypeModelNew.authenticationValueKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(databaseDetailsPrototypeModelNew.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModelNew.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsPrototypeModelNew.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsPrototypeModelNew.brokerHost(), "samplehost");
    assertEquals(databaseDetailsPrototypeModelNew.brokerPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsPrototypeModelNew.certificate(), "exampleCertificate");
    assertEquals(databaseDetailsPrototypeModelNew.certificateExtension(), "pem");
    assertEquals(databaseDetailsPrototypeModelNew.connectionMethod(), "basic, apikey");
    assertEquals(databaseDetailsPrototypeModelNew.connectionMode(), "service_name");
    assertEquals(databaseDetailsPrototypeModelNew.connectionModeValue(), "orclpdb");
    assertEquals(databaseDetailsPrototypeModelNew.connectionType(), "JDBC, Arrow flight");
    assertEquals(databaseDetailsPrototypeModelNew.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModelNew.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsPrototypeModelNew.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsPrototypeModelNew.coordinatorHost(), "samplehost");
    assertEquals(databaseDetailsPrototypeModelNew.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsPrototypeModelNew.cpdHostname(), "samplecpdhostname");
    assertEquals(databaseDetailsPrototypeModelNew.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseDetailsPrototypeModelNew.domainName(), "conops-mssql.conops.local");
    assertEquals(databaseDetailsPrototypeModelNew.hostname(), "http://db2@localhost:9900.com");
    assertEquals(databaseDetailsPrototypeModelNew.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsPrototypeModelNew.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsPrototypeModelNew.informixServer(), "ol_informix1410");
    assertEquals(databaseDetailsPrototypeModelNew.name(), "new_database");
    assertEquals(databaseDetailsPrototypeModelNew.password(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModelNew.passwordKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(databaseDetailsPrototypeModelNew.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsPrototypeModelNew.projectId(), "conops-bigquery");
    assertEquals(databaseDetailsPrototypeModelNew.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModelNew.saslMechanism(), "plain");
    assertEquals(databaseDetailsPrototypeModelNew.schemaName(), "sampleSchema");
    assertEquals(databaseDetailsPrototypeModelNew.schemas(), "redis__name");
    assertEquals(databaseDetailsPrototypeModelNew.serviceApiKey(), "sampleapikey");
    assertEquals(databaseDetailsPrototypeModelNew.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(databaseDetailsPrototypeModelNew.servicePassword(), "samplepassword");
    assertEquals(databaseDetailsPrototypeModelNew.servicePort(), Long.valueOf("443"));
    assertEquals(databaseDetailsPrototypeModelNew.serviceSsl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModelNew.serviceTokenUrl(), "sampletoakenurl");
    assertEquals(databaseDetailsPrototypeModelNew.serviceUsername(), "sampleusername");
    assertEquals(databaseDetailsPrototypeModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModelNew.sslcertificateKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(databaseDetailsPrototypeModelNew.tables(), "kafka_table_name, redis_table_name");
    assertEquals(databaseDetailsPrototypeModelNew.username(), "sampleuser");
    assertEquals(databaseDetailsPrototypeModelNew.usernameKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(databaseDetailsPrototypeModelNew.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModelNew.vaultEnabled(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModelNew.verifyHostName(), Boolean.valueOf(true));
    assertEquals(databaseDetailsPrototypeModelNew.warehouseName(), "samplewrehouse");
  }
}