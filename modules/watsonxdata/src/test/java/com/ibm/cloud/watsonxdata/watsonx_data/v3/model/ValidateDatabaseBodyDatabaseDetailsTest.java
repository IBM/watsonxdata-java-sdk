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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ValidateDatabaseBodyDatabaseDetails model.
 */
public class ValidateDatabaseBodyDatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testValidateDatabaseBodyDatabaseDetails() throws Throwable {
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

    String json = TestUtilities.serialize(validateDatabaseBodyDatabaseDetailsModel);

    ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModelNew = TestUtilities.deserialize(json, ValidateDatabaseBodyDatabaseDetails.class);
    assertTrue(validateDatabaseBodyDatabaseDetailsModelNew instanceof ValidateDatabaseBodyDatabaseDetails);
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.authenticationType(), "LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.authenticationValue(), "sampleapikey");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.authenticationValueKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.brokerAuthenticationType(), "PASSWORD");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.brokerAuthenticationUser(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.brokerHost(), "db2@hostname.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.brokerPort(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.connectionMode(), "service_name");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.connectionModeValue(), "orclpdb");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.connectionType(), "JDBC, Arrow flight");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.controllerAuthenticationType(), "PASSWORD");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.controllerAuthenticationUser(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.coordinatorHost(), "samplehost");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.domainName(), "conops-mssql.conops.local");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.driverUris(), "/v2/connections/files/abcd.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...,/v2/connections/files/efgh.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.hostname(), "db2@hostname.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.hostnameInCertificate(), "samplehostname");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.informixServer(), "ol_informix1410");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.locationName(), "ABCD");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.name(), "sampledatabase");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.password(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.passwordKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.port(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.privateKey(), "privatekey");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.privateKeyPassphrase(), "passphrase");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.projectId(), "sampleprojectId");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.sasl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.saslMechanism(), "plain");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.serviceApiKey(), "sampleapikey");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.servicePort(), Long.valueOf("443"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.serviceSsl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.serviceTokenUrl(), "sampletokenurl");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.sslcertificateKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.tables(), "kafka_table_name");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.username(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.usernameKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.vaultEnabled(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.verifyHostName(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.warehouseName(), "samplewarehouse");
  }
}