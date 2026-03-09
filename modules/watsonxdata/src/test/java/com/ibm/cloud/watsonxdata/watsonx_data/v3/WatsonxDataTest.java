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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.WatsonxData;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WatsonxData service.
 */
public class WatsonxDataTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected WatsonxData watsonxDataService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new WatsonxData(serviceName, null);
  }

  // Test the getDatabaseProperties operation with a valid options model parameter
  @Test
  public void testGetDatabasePropertiesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database_properties\": [{\"authentication_value\": \"sampleapikey\", \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"database_id\": \"database1234\", \"database_type\": \"netezza\", \"hostname\": \"db2@hostname.com\", \"is_ssl\": true, \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"schema_name\": \"sampleSchema\", \"username\": \"sampleuser\", \"warehouse_name\": \"samplewarehouse\"}]}";
    String getDatabasePropertiesPath = "/database_properties";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDatabasePropertiesOptions model
    GetDatabasePropertiesOptions getDatabasePropertiesOptionsModel = new GetDatabasePropertiesOptions.Builder()
      .secret("testString")
      .databaseIds("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDatabaseProperties() with a valid options model and verify the result
    Response<DatabasePropertiesCollection> response = watsonxDataService.getDatabaseProperties(getDatabasePropertiesOptionsModel).execute();
    assertNotNull(response);
    DatabasePropertiesCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatabasePropertiesPath);
    // Verify header parameters
    assertEquals(request.getHeader("Secret"), "testString");
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("database_ids"), "testString");
  }

  // Test the getDatabaseProperties operation with and without retries enabled
  @Test
  public void testGetDatabasePropertiesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDatabasePropertiesWOptions();

    watsonxDataService.disableRetries();
    testGetDatabasePropertiesWOptions();
  }

  // Test the getDatabaseProperties operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatabasePropertiesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDatabaseProperties(null).execute();
  }

  // Test the listDatabaseRegistrations operation with a valid options model parameter
  @Test
  public void testListDatabaseRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database_registrations\": [{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}]}";
    String listDatabaseRegistrationsPath = "/database_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDatabaseRegistrationsOptions model
    ListDatabaseRegistrationsOptions listDatabaseRegistrationsOptionsModel = new ListDatabaseRegistrationsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listDatabaseRegistrations() with a valid options model and verify the result
    Response<DatabaseRegistrationCollection> response = watsonxDataService.listDatabaseRegistrations(listDatabaseRegistrationsOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistrationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDatabaseRegistrationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listDatabaseRegistrations operation with and without retries enabled
  @Test
  public void testListDatabaseRegistrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListDatabaseRegistrationsWOptions();

    watsonxDataService.disableRetries();
    testListDatabaseRegistrationsWOptions();
  }

  // Test the createDatabaseRegistration operation with a valid options model parameter
  @Test
  public void testCreateDatabaseRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String createDatabaseRegistrationPath = "/database_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DatabaseCatalogPrototype model
    DatabaseCatalogPrototype databaseCatalogPrototypeModel = new DatabaseCatalogPrototype.Builder()
      .catalogName("sampleCatalog")
      .catalogType("iceberg")
      .isGfs(false)
      .build();

    // Construct an instance of the SecretDetails model
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the DatabaseDetailsPrototype model
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

    // Construct an instance of the DatabaseRegistrationPrototypeDatabasePropertiesItems model
    DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();

    // Construct an instance of the CreateDatabaseRegistrationOptions model
    CreateDatabaseRegistrationOptions createDatabaseRegistrationOptionsModel = new CreateDatabaseRegistrationOptions.Builder()
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

    // Invoke createDatabaseRegistration() with a valid options model and verify the result
    Response<DatabaseRegistration> response = watsonxDataService.createDatabaseRegistration(createDatabaseRegistrationOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDatabaseRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDatabaseRegistration operation with and without retries enabled
  @Test
  public void testCreateDatabaseRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDatabaseRegistrationWOptions();

    watsonxDataService.disableRetries();
    testCreateDatabaseRegistrationWOptions();
  }

  // Test the createDatabaseRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatabaseRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDatabaseRegistration(null).execute();
  }

  // Test the addDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testAddDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"message_code\": \"messageCode\"}";
    String addDatabaseCatalogPath = "/database_registrations/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddDatabaseCatalogOptions model
    AddDatabaseCatalogOptions addDatabaseCatalogOptionsModel = new AddDatabaseCatalogOptions.Builder()
      .databaseId("testString")
      .catalogName("sampleCatalog")
      .authInstanceId("testString")
      .build();

    // Invoke addDatabaseCatalog() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.addDatabaseCatalog(addDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the addDatabaseCatalog operation with and without retries enabled
  @Test
  public void testAddDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testAddDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testAddDatabaseCatalogWOptions();
  }

  // Test the addDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.addDatabaseCatalog(null).execute();
  }

  // Test the getDatabase operation with a valid options model parameter
  @Test
  public void testGetDatabaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String getDatabasePath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDatabaseOptions model
    GetDatabaseOptions getDatabaseOptionsModel = new GetDatabaseOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDatabase() with a valid options model and verify the result
    Response<DatabaseRegistration> response = watsonxDataService.getDatabase(getDatabaseOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatabasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDatabase operation with and without retries enabled
  @Test
  public void testGetDatabaseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDatabaseWOptions();

    watsonxDataService.disableRetries();
    testGetDatabaseWOptions();
  }

  // Test the getDatabase operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatabaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDatabase(null).execute();
  }

  // Test the deleteDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testDeleteDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDatabaseCatalogPath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDatabaseCatalogOptions model
    DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptionsModel = new DeleteDatabaseCatalogOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .secret("testString")
      .build();

    // Invoke deleteDatabaseCatalog() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDatabaseCatalog(deleteDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDatabaseCatalog operation with and without retries enabled
  @Test
  public void testDeleteDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testDeleteDatabaseCatalogWOptions();
  }

  // Test the deleteDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDatabaseCatalog(null).execute();
  }

  // Test the updateDatabase operation with a valid options model parameter
  @Test
  public void testUpdateDatabaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalog\": {\"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}, \"catalog_name\": \"sampleCatalog\", \"connection\": {\"authentication_type\": \"LDAP, NTLM, ActiveDirectoryServicePrincipal, ActiveDirectoryPassword\", \"authentication_value\": \"LDAP\", \"broker_authentication_password\": \"samplepassword\", \"broker_authentication_type\": \"PASSWORD\", \"broker_authentication_user\": \"sampleuser\", \"broker_host\": \"samplehost\", \"broker_port\": 4553, \"certificate\": \"exampleCertificate\", \"certificate_extension\": \"pem\", \"connection_method\": \"basic, apikey\", \"connection_mode\": \"service_name\", \"connection_mode_value\": \"orclpdb\", \"connection_type\": \"JDBC, Arrow flight\", \"controller_authentication_password\": \"samplepassword\", \"controller_authentication_type\": \"PASSWORD\", \"controller_authentication_user\": \"sampleuser\", \"coordinator_host\": \"samplehost\", \"coordinator_port\": 4553, \"cpd_hostname\": \"samplecpdhostname\", \"credentials_key\": \"eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......\", \"domain_name\": \"conops-mssql.conops.local\", \"hostname\": \"http://db2@localhost:9900.com\", \"hostname_in_certificate\": \"samplehostname\", \"hosts\": \"abc.com:1234,xyz.com:4321\", \"informix_server\": \"ol_informix1410\", \"name\": \"new_database\", \"password\": \"samplepassword\", \"port\": 4553, \"project_id\": \"conops-bigquery\", \"sasl\": true, \"sasl_mechanism\": \"plain\", \"schema_name\": \"sampleSchema\", \"schemas\": \"redis__name\", \"service_api_key\": \"sampleapikey\", \"service_hostname\": \"api.dataplatform.dev.cloud.ibm.com\", \"service_password\": \"samplepassword\", \"service_port\": 443, \"service_ssl\": true, \"service_token_url\": \"sampletoakenurl\", \"service_username\": \"sampleusername\", \"ssl\": true, \"tables\": \"kafka_table_name, redis_table_name\", \"username\": \"sampleuser\", \"validate_server_certificate\": true, \"verify_host_name\": true, \"warehouse_name\": \"samplewrehouse\"}, \"created_at\": \"1686792721\", \"created_by\": \"user1@ibm.com\", \"description\": \"Description of the external database\", \"display_name\": \"new_database\", \"id\": \"mysql123\", \"properties\": [{\"encrypt\": true, \"key\": \"hive.metastore\", \"value\": \"glue\"}], \"tables\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"test.json\", \"schema_name\": \"customer\", \"table_name\": \"customer\"}], \"tags\": [\"tags\"], \"topics\": [{\"created_at\": \"1686792721\", \"file_contents\": \"sample file content\", \"file_name\": \"employee.json\", \"topic_name\": \"customer\"}], \"type\": \"netezza\", \"vault_enabled\": true}";
    String updateDatabasePath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems model
    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();

    // Construct an instance of the DatabaseRegistrationPatchDatabaseDetails model
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

    // Construct an instance of the DatabaseRegistrationPatchTablesItems model
    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file content")
      .fileName("test.json")
      .schemaName("customer")
      .tableName("customer")
      .build();

    // Construct an instance of the DatabaseRegistrationPatchTopicsItems model
    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file contents")
      .fileName("test.json")
      .topicName("customer")
      .build();

    // Construct an instance of the DatabaseRegistrationPatch model
    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .connection(databaseRegistrationPatchDatabaseDetailsModel)
      .description("External database description")
      .displayName("new_database")
      .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();
    Map<String, Object> databaseRegistrationPatchModelAsPatch = databaseRegistrationPatchModel.asPatch();

    // Construct an instance of the UpdateDatabaseOptions model
    UpdateDatabaseOptions updateDatabaseOptionsModel = new UpdateDatabaseOptions.Builder()
      .id("testString")
      .body(databaseRegistrationPatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updateDatabase() with a valid options model and verify the result
    Response<DatabaseRegistration> response = watsonxDataService.updateDatabase(updateDatabaseOptionsModel).execute();
    assertNotNull(response);
    DatabaseRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDatabasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDatabase operation with and without retries enabled
  @Test
  public void testUpdateDatabaseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDatabaseWOptions();

    watsonxDataService.disableRetries();
    testUpdateDatabaseWOptions();
  }

  // Test the updateDatabase operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDatabaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDatabase(null).execute();
  }

  // Test the validateDatabaseConnection operation with a valid options model parameter
  @Test
  public void testValidateDatabaseConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"connection_response\": {\"state\": false, \"state_message\": \"stateMessage\"}}";
    String validateDatabaseConnectionPath = "/test_database_connection";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SecretDetails model
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the ValidateDatabaseBodyDatabaseDetails model
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

    // Construct an instance of the ValidateDatabaseConnectionOptions model
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

    // Invoke validateDatabaseConnection() with a valid options model and verify the result
    Response<TestDatabaseConnectionResponse> response = watsonxDataService.validateDatabaseConnection(validateDatabaseConnectionOptionsModel).execute();
    assertNotNull(response);
    TestDatabaseConnectionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, validateDatabaseConnectionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the validateDatabaseConnection operation with and without retries enabled
  @Test
  public void testValidateDatabaseConnectionWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testValidateDatabaseConnectionWOptions();

    watsonxDataService.disableRetries();
    testValidateDatabaseConnectionWOptions();
  }

  // Test the validateDatabaseConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateDatabaseConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.validateDatabaseConnection(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    watsonxDataService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    watsonxDataService = WatsonxData.newInstance(serviceName);
    String url = server.url("/").toString();
    watsonxDataService.setServiceUrl(url);
  }
}