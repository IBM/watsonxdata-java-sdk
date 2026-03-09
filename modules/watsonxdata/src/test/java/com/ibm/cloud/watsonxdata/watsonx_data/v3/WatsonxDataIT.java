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

package com.ibm.cloud.watsonxdata.watsonx_data.v3;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.watsonxdata.test.SdkIntegrationTestBase;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AddDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ConnectionResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseCatalogPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseDetailsPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabasePropertiesCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPrototypeDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDatabasePropertiesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TestDatabaseConnectionResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateDatabaseConnectionOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the WatsonxData service.
 */
public class WatsonxDataIT extends SdkIntegrationTestBase {
  public WatsonxData service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../watsonx_data_v3.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = WatsonxData.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(WatsonxData.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetDatabaseProperties() throws Exception {
    try {
      GetDatabasePropertiesOptions getDatabasePropertiesOptions = new GetDatabasePropertiesOptions.Builder()
        .secret("testString")
        .databaseIds("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabasePropertiesCollection> response = service.getDatabaseProperties(getDatabasePropertiesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabasePropertiesCollection databasePropertiesCollectionResult = response.getResult();
      assertNotNull(databasePropertiesCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDatabaseProperties" })
  public void testListDatabaseRegistrations() throws Exception {
    try {
      ListDatabaseRegistrationsOptions listDatabaseRegistrationsOptions = new ListDatabaseRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistrationCollection> response = service.listDatabaseRegistrations(listDatabaseRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseRegistrationCollection databaseRegistrationCollectionResult = response.getResult();
      assertNotNull(databaseRegistrationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDatabaseRegistrations" })
  public void testCreateDatabaseRegistration() throws Exception {
    try {
      DatabaseCatalogPrototype databaseCatalogPrototypeModel = new DatabaseCatalogPrototype.Builder()
        .catalogName("sampleCatalog")
        .catalogType("iceberg")
        .isGfs(false)
        .build();

      SecretDetails secretDetailsModel = new SecretDetails.Builder()
        .key("secret key")
        .secretName("secret name")
        .secretUrn("secret urn")
        .build();

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
        .driverUris("/v2/connections/files/abcd.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...,/v2/connections/files/efgh.jar?hash=e3dkcGFlczI1Nn1p...&digest=462EbqJ9VhHjELNHwAhV6p5...")
        .hostname("http://db2@localhost:9900.com")
        .hostnameInCertificate("samplehostname")
        .hosts("abc.com:1234,xyz.com:4321")
        .informixServer("ol_informix1410")
        .locationName("ABCD")
        .name("new_database")
        .password("samplepassword")
        .passwordKeyVault(secretDetailsModel)
        .port(Long.valueOf("4553"))
        .privateKey("privatekey")
        .privateKeyPassphrase("passphrase")
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

      DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions = new CreateDatabaseRegistrationOptions.Builder()
        .displayName("new_database")
        .type("db2")
        .associatedCatalog(databaseCatalogPrototypeModel)
        .connection(databaseDetailsPrototypeModel)
        .createdAt("1686792721")
        .description("db2 extenal database description")
        .xProperties(java.util.Arrays.asList(databaseRegistrationPrototypeDatabasePropertiesItemsModel))
        .sourceAssetId("cc85d899-9ec3-496a-be36-99cabc62f123")
        .sourceCatalogId("cc85d899-9ec3-496a-be36-99cff962f000")
        .sourceProjectId("cc85d899-9ec3-496a-be36-99cff9000116")
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
        .targetCatalogId("cc85d899-9ec3-496a-be36-99cff9000116")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.createDatabaseRegistration(createDatabaseRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DatabaseRegistration databaseRegistrationResult = response.getResult();
      assertNotNull(databaseRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDatabaseRegistration" })
  public void testAddDatabaseCatalog() throws Exception {
    try {
      AddDatabaseCatalogOptions addDatabaseCatalogOptions = new AddDatabaseCatalogOptions.Builder()
        .databaseId("testString")
        .catalogName("sampleCatalog")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.addDatabaseCatalog(addDatabaseCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();
      assertNotNull(successResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddDatabaseCatalog" })
  public void testGetDatabase() throws Exception {
    try {
      GetDatabaseOptions getDatabaseOptions = new GetDatabaseOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.getDatabase(getDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseRegistration databaseRegistrationResult = response.getResult();
      assertNotNull(databaseRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDatabase" })
  public void testUpdateDatabase() throws Exception {
    try {
      DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
        .authenticationValue("LDAP")
        .brokerAuthenticationPassword("samplepassword")
        .brokerAuthenticationType("PASSWORD")
        .brokerAuthenticationUser("sampleuser")
        .controllerAuthenticationPassword("samplepassword")
        .controllerAuthenticationType("PASSWORD")
        .controllerAuthenticationUser("sampleuser")
        .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
        .password("samplepassword")
        .xProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
        .username("sampleuser")
        .build();

      DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
        .createdAt("1686792721")
        .fileContents("sample file content")
        .fileName("test.json")
        .schemaName("customer")
        .tableName("customer")
        .build();

      DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
        .createdAt("1686792721")
        .fileContents("sample file contents")
        .fileName("test.json")
        .topicName("customer")
        .build();

      DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
        .connection(databaseRegistrationPatchDatabaseDetailsModel)
        .description("External database description")
        .displayName("new_database")
        .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
        .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
        .build();
      Map<String, Object> databaseRegistrationPatchModelAsPatch = databaseRegistrationPatchModel.asPatch();

      UpdateDatabaseOptions updateDatabaseOptions = new UpdateDatabaseOptions.Builder()
        .id("testString")
        .body(databaseRegistrationPatchModelAsPatch)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.updateDatabase(updateDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DatabaseRegistration databaseRegistrationResult = response.getResult();
      assertNotNull(databaseRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDatabase" })
  public void testValidateDatabaseConnection() throws Exception {
    try {
      SecretDetails secretDetailsModel = new SecretDetails.Builder()
        .key("secret key")
        .secretName("secret name")
        .secretUrn("secret urn")
        .build();

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

      ValidateDatabaseConnectionOptions validateDatabaseConnectionOptions = new ValidateDatabaseConnectionOptions.Builder()
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

      // Invoke operation
      Response<TestDatabaseConnectionResponse> response = service.validateDatabaseConnection(validateDatabaseConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TestDatabaseConnectionResponse testDatabaseConnectionResponseResult = response.getResult();
      assertNotNull(testDatabaseConnectionResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testValidateDatabaseConnection" })
  public void testDeleteDatabaseCatalog() throws Exception {
    try {
      DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions = new DeleteDatabaseCatalogOptions.Builder()
        .id("testString")
        .authInstanceId("testString")
        .secret("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDatabaseCatalog(deleteDatabaseCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
