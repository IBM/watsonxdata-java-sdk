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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateDatabaseConnectionOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ValidateDatabaseConnectionOptions model.
 */
public class ValidateDatabaseConnectionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testValidateDatabaseConnectionOptions() throws Throwable {
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();
    assertEquals(secretDetailsModel.key(), "secret key");
    assertEquals(secretDetailsModel.secretName(), "secret name");
    assertEquals(secretDetailsModel.secretUrn(), "secret urn");

    ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModel = new ValidateDatabaseBodyDatabaseDetails.Builder()
      .authenticationType("LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword")
      .authenticationValue("sampleapikey")
      .authenticationValueKeyVault(secretDetailsModel)
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .brokerHost("db2@hostname.com")
      .brokerPort(Long.valueOf("4553"))
      .connectionMode("service_name")
      .connectionModeValue("orclpdb")
      .connectionType("JDBC, Arrow flight")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .coordinatorHost("samplehost")
      .coordinatorPort(Long.valueOf("4553"))
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .domainName("conops-mssql.conops.local")
      .driverUris("/v2/connections/files/abcd.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...,/v2/connections/files/efgh.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...")
      .hostname("db2@hostname.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .locationName("ABCD")
      .name("sampledatabase")
      .password("samplepassword")
      .passwordKeyVault(secretDetailsModel)
      .port(Long.valueOf("4553"))
      .privateKey("privatekey")
      .privateKeyPassphrase("passphrase")
      .projectId("sampleprojectId")
      .sasl(true)
      .saslMechanism("plain")
      .serviceApiKey("sampleapikey")
      .serviceHostname("api.dataplatform.dev.cloud.ibm.com")
      .servicePort(Long.valueOf("443"))
      .serviceSsl(true)
      .serviceTokenUrl("sampletokenurl")
      .ssl(true)
      .sslcertificateKeyVault(secretDetailsModel)
      .tables("kafka_table_name")
      .username("sampleuser")
      .usernameKeyVault(secretDetailsModel)
      .validateServerCertificate(true)
      .vaultEnabled(true)
      .verifyHostName(true)
      .warehouseName("samplewarehouse")
      .build();
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.authenticationType(), "LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.authenticationValue(), "sampleapikey");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.authenticationValueKeyVault(), secretDetailsModel);
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.brokerAuthenticationType(), "PASSWORD");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.brokerAuthenticationUser(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.brokerHost(), "db2@hostname.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.brokerPort(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.connectionMode(), "service_name");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.connectionModeValue(), "orclpdb");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.connectionType(), "JDBC, Arrow flight");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.controllerAuthenticationType(), "PASSWORD");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.controllerAuthenticationUser(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.coordinatorHost(), "samplehost");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.domainName(), "conops-mssql.conops.local");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.driverUris(), "/v2/connections/files/abcd.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...,/v2/connections/files/efgh.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.hostname(), "db2@hostname.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.hostnameInCertificate(), "samplehostname");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.informixServer(), "ol_informix1410");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.locationName(), "ABCD");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.name(), "sampledatabase");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.passwordKeyVault(), secretDetailsModel);
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.port(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.privateKey(), "privatekey");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.privateKeyPassphrase(), "passphrase");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.projectId(), "sampleprojectId");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.sasl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.saslMechanism(), "plain");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.serviceApiKey(), "sampleapikey");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.servicePort(), Long.valueOf("443"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.serviceSsl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.serviceTokenUrl(), "sampletokenurl");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.sslcertificateKeyVault(), secretDetailsModel);
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.tables(), "kafka_table_name");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.username(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.usernameKeyVault(), secretDetailsModel);
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.vaultEnabled(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.verifyHostName(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.warehouseName(), "samplewarehouse");

    ValidateDatabaseConnectionOptions validateDatabaseConnectionOptionsModel = new ValidateDatabaseConnectionOptions.Builder()
      .type("netezza")
      .certificate("exampleCertificate")
      .certificateExtension("pem")
      .connection(validateDatabaseBodyDatabaseDetailsModel)
      .id("sampledatabaseID")
      .sourceAssetId("cc85d899-9ec3-496a-be36-99cabc62f123")
      .sourceCatalogId("cc85d899-9ec3-496a-be36-99cff962f000")
      .sourceProjectId("cc85d899-9ec3-496a-be36-99cff9000116")
      .targetCatalogId("cc85d899-9ec3-496a-be36-99cff9000116")
      .authInstanceId("testString")
      .build();
    assertEquals(validateDatabaseConnectionOptionsModel.type(), "netezza");
    assertEquals(validateDatabaseConnectionOptionsModel.certificate(), "exampleCertificate");
    assertEquals(validateDatabaseConnectionOptionsModel.certificateExtension(), "pem");
    assertEquals(validateDatabaseConnectionOptionsModel.connection(), validateDatabaseBodyDatabaseDetailsModel);
    assertEquals(validateDatabaseConnectionOptionsModel.id(), "sampledatabaseID");
    assertEquals(validateDatabaseConnectionOptionsModel.sourceAssetId(), "cc85d899-9ec3-496a-be36-99cabc62f123");
    assertEquals(validateDatabaseConnectionOptionsModel.sourceCatalogId(), "cc85d899-9ec3-496a-be36-99cff962f000");
    assertEquals(validateDatabaseConnectionOptionsModel.sourceProjectId(), "cc85d899-9ec3-496a-be36-99cff9000116");
    assertEquals(validateDatabaseConnectionOptionsModel.targetCatalogId(), "cc85d899-9ec3-496a-be36-99cff9000116");
    assertEquals(validateDatabaseConnectionOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateDatabaseConnectionOptionsError() throws Throwable {
    new ValidateDatabaseConnectionOptions.Builder().build();
  }

}