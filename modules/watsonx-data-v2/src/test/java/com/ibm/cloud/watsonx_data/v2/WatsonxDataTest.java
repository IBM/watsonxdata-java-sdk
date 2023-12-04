/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.WatsonxData;
import com.ibm.cloud.watsonx_data.v2.model.BucketDetails;
import com.ibm.cloud.watsonx_data.v2.model.BucketRegistration;
import com.ibm.cloud.watsonx_data.v2.model.BucketStatusResponse;
import com.ibm.cloud.watsonx_data.v2.model.Catalog;
import com.ibm.cloud.watsonx_data.v2.model.CatalogDetail;
import com.ibm.cloud.watsonx_data.v2.model.Column;
import com.ibm.cloud.watsonx_data.v2.model.CreateActivateBucketCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateActivateBucketOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateBucketRegistrationCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateDatabaseRegistrationCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateDb2EngineCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateDb2EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateDriverDatabaseCatalogCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateDriverDatabaseCatalogCreatedBodyDatabase;
import com.ibm.cloud.watsonx_data.v2.model.CreateDriverDatabaseCatalogOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateEnginePauseCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateEnginePauseOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineRestartCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineRestartOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineResumeCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineResumeOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineScaleCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateEngineScaleOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateNetezzaEngineCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateNetezzaEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateOtherEngineCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateSchemaCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateSchemaOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateSparkEngineApplicationCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonx_data.v2.model.CreateSparkEngineCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.DatabaseRegistration;
import com.ibm.cloud.watsonx_data.v2.model.DatabaseRegistrationDatabaseDetails;
import com.ibm.cloud.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonx_data.v2.model.Db2EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.DeleteBucketRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteDb2EngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteDeactivateBucketOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteNetezzaEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteOtherEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteSparkEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeleteTableOptions;
import com.ibm.cloud.watsonx_data.v2.model.Deployment;
import com.ibm.cloud.watsonx_data.v2.model.DeploymentPlatformOptions;
import com.ibm.cloud.watsonx_data.v2.model.DeploymentsResponse;
import com.ibm.cloud.watsonx_data.v2.model.Endpoints;
import com.ibm.cloud.watsonx_data.v2.model.Engine;
import com.ibm.cloud.watsonx_data.v2.model.EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.EngineDetailsBody;
import com.ibm.cloud.watsonx_data.v2.model.GetBucketRegistrationOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetBucketRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetCatalogOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetCatalogOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetDatabaseOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetDatabaseOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetDeploymentsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetDeploymentsOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetPrestoEngineCatalogOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetPrestoEngineCatalogOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetPrestoEngineOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetSparkEngineApplicationStatusOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetSparkEngineApplicationStatusOptions;
import com.ibm.cloud.watsonx_data.v2.model.GetTableOKBody;
import com.ibm.cloud.watsonx_data.v2.model.GetTableOptions;
import com.ibm.cloud.watsonx_data.v2.model.JsonPatchOperation;
import com.ibm.cloud.watsonx_data.v2.model.ListBucketObjectsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListBucketObjectsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListBucketRegistrationsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListBucketRegistrationsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListCatalogsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListCatalogsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListDatabaseRegistrationsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListDb2EnginesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListDb2EnginesOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListEnginesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListEnginesOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListNetezzaEnginesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListNetezzaEnginesOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListOtherEnginesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListOtherEnginesOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListPrestoEngineCatalogsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListPrestoEnginesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListSchemasOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListSchemasOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListSparkEngineApplication;
import com.ibm.cloud.watsonx_data.v2.model.ListSparkEngineApplicationRuntime;
import com.ibm.cloud.watsonx_data.v2.model.ListSparkEngineApplicationsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListSparkEnginesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListSparkEnginesOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListTableSnapshotsOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListTableSnapshotsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ListTablesOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ListTablesOptions;
import com.ibm.cloud.watsonx_data.v2.model.MilvusService;
import com.ibm.cloud.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonx_data.v2.model.NetezzaEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.NodeDescription;
import com.ibm.cloud.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonx_data.v2.model.OtherEngine;
import com.ibm.cloud.watsonx_data.v2.model.OtherEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonx_data.v2.model.RegisterDatabaseCatalogBodyDatabaseDetails;
import com.ibm.cloud.watsonx_data.v2.model.RegisterDatabaseCatalogBodyDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.v2.model.ReplacePrestoEngineCatalogsCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.ReplacePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonx_data.v2.model.ReplaceSnapshotCreatedBody;
import com.ibm.cloud.watsonx_data.v2.model.ReplaceSnapshotOptions;
import com.ibm.cloud.watsonx_data.v2.model.RunExplainAnalyzeStatementOKBody;
import com.ibm.cloud.watsonx_data.v2.model.RunExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonx_data.v2.model.RunExplainStatementOKBody;
import com.ibm.cloud.watsonx_data.v2.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngine;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineApplication;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineApplicationStatus;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineApplicationStatusApplicationDetails;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineApplicationStatusApplicationDetailsConf;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineApplicationStatusStateDetailsItems;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineDetailsEndpoints;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineDetailsPrototype;
import com.ibm.cloud.watsonx_data.v2.model.SuccessResponse;
import com.ibm.cloud.watsonx_data.v2.model.TableSnapshot;
import com.ibm.cloud.watsonx_data.v2.model.TestBucketConnectionOKBody;
import com.ibm.cloud.watsonx_data.v2.model.TestBucketConnectionOptions;
import com.ibm.cloud.watsonx_data.v2.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateBucketRegistrationOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateBucketRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateDatabaseOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateDb2EngineOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateEngineOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateNetezzaEngineOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateSparkEngineOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateSyncCatalogOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonx_data.v2.model.UpdateTableOKBody;
import com.ibm.cloud.watsonx_data.v2.model.UpdateTableOptions;
import com.ibm.cloud.watsonx_data.v2.model.ValidateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonx_data.v2.model.ValidateDatabaseConnectionOKBody;
import com.ibm.cloud.watsonx_data.v2.model.ValidateDatabaseConnectionOKBodyConnectionResponse;
import com.ibm.cloud.watsonx_data.v2.model.ValidateDatabaseConnectionOptions;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
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

  // Test the listBucketRegistrations operation with a valid options model parameter
  @Test
  public void testListBucketRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_registrations\": [{\"access_key\": \"<access_key>\", \"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"bucket_display_name\": \"sample-bucket-displayname\", \"bucket_id\": \"samplebucket123\", \"bucket_name\": \"sample-bucket\", \"bucket_type\": \"ibm_cos\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1686120645\", \"description\": \"COS bucket for customer data\", \"endpoint\": \"https://s3.<region>.cloud-object-storage.appdomain.cloud/\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"secret_key\": \"secret_key\", \"state\": \"active\", \"tags\": [\"tags\"]}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listBucketRegistrationsPath = "/bucket_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListBucketRegistrationsOptions model
    ListBucketRegistrationsOptions listBucketRegistrationsOptionsModel = new ListBucketRegistrationsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listBucketRegistrations() with a valid options model and verify the result
    Response<ListBucketRegistrationsOKBody> response = watsonxDataService.listBucketRegistrations(listBucketRegistrationsOptionsModel).execute();
    assertNotNull(response);
    ListBucketRegistrationsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listBucketRegistrationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listBucketRegistrations operation with and without retries enabled
  @Test
  public void testListBucketRegistrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListBucketRegistrationsWOptions();

    watsonxDataService.disableRetries();
    testListBucketRegistrationsWOptions();
  }

  // Test the createBucketRegistration operation with a valid options model parameter
  @Test
  public void testCreateBucketRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_registration\": {\"access_key\": \"<access_key>\", \"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"bucket_display_name\": \"sample-bucket-displayname\", \"bucket_id\": \"samplebucket123\", \"bucket_name\": \"sample-bucket\", \"bucket_type\": \"ibm_cos\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1686120645\", \"description\": \"COS bucket for customer data\", \"endpoint\": \"https://s3.<region>.cloud-object-storage.appdomain.cloud/\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"secret_key\": \"secret_key\", \"state\": \"active\", \"tags\": [\"tags\"]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createBucketRegistrationPath = "/bucket_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the BucketDetails model
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .secretKey("secret_key")
      .build();

    // Construct an instance of the CreateBucketRegistrationOptions model
    CreateBucketRegistrationOptions createBucketRegistrationOptionsModel = new CreateBucketRegistrationOptions.Builder()
      .bucketDetails(bucketDetailsModel)
      .bucketType("ibm_cos")
      .catalogName("sampleCatalog")
      .description("COS bucket for customer data")
      .managedBy("ibm")
      .tableType("iceberg")
      .bucketDisplayName("sample-bucket-displayname")
      .bucketTags(java.util.Arrays.asList("read customer data", "write customer data'"))
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .region("us-south")
      .state("active")
      .authInstanceId("testString")
      .build();

    // Invoke createBucketRegistration() with a valid options model and verify the result
    Response<CreateBucketRegistrationCreatedBody> response = watsonxDataService.createBucketRegistration(createBucketRegistrationOptionsModel).execute();
    assertNotNull(response);
    CreateBucketRegistrationCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createBucketRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createBucketRegistration operation with and without retries enabled
  @Test
  public void testCreateBucketRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateBucketRegistrationWOptions();

    watsonxDataService.disableRetries();
    testCreateBucketRegistrationWOptions();
  }

  // Test the createBucketRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBucketRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createBucketRegistration(null).execute();
  }

  // Test the getBucketRegistration operation with a valid options model parameter
  @Test
  public void testGetBucketRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_registration\": {\"access_key\": \"<access_key>\", \"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"bucket_display_name\": \"sample-bucket-displayname\", \"bucket_id\": \"samplebucket123\", \"bucket_name\": \"sample-bucket\", \"bucket_type\": \"ibm_cos\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1686120645\", \"description\": \"COS bucket for customer data\", \"endpoint\": \"https://s3.<region>.cloud-object-storage.appdomain.cloud/\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"secret_key\": \"secret_key\", \"state\": \"active\", \"tags\": [\"tags\"]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getBucketRegistrationPath = "/bucket_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBucketRegistrationOptions model
    GetBucketRegistrationOptions getBucketRegistrationOptionsModel = new GetBucketRegistrationOptions.Builder()
      .bucketId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getBucketRegistration() with a valid options model and verify the result
    Response<GetBucketRegistrationOKBody> response = watsonxDataService.getBucketRegistration(getBucketRegistrationOptionsModel).execute();
    assertNotNull(response);
    GetBucketRegistrationOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBucketRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBucketRegistration operation with and without retries enabled
  @Test
  public void testGetBucketRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetBucketRegistrationWOptions();

    watsonxDataService.disableRetries();
    testGetBucketRegistrationWOptions();
  }

  // Test the getBucketRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBucketRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getBucketRegistration(null).execute();
  }

  // Test the deleteBucketRegistration operation with a valid options model parameter
  @Test
  public void testDeleteBucketRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteBucketRegistrationPath = "/bucket_registrations/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteBucketRegistrationOptions model
    DeleteBucketRegistrationOptions deleteBucketRegistrationOptionsModel = new DeleteBucketRegistrationOptions.Builder()
      .bucketId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteBucketRegistration() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteBucketRegistration(deleteBucketRegistrationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteBucketRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteBucketRegistration operation with and without retries enabled
  @Test
  public void testDeleteBucketRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteBucketRegistrationWOptions();

    watsonxDataService.disableRetries();
    testDeleteBucketRegistrationWOptions();
  }

  // Test the deleteBucketRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteBucketRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteBucketRegistration(null).execute();
  }

  // Test the updateBucketRegistration operation with a valid options model parameter
  @Test
  public void testUpdateBucketRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_registration\": {\"access_key\": \"<access_key>\", \"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"bucket_display_name\": \"sample-bucket-displayname\", \"bucket_id\": \"samplebucket123\", \"bucket_name\": \"sample-bucket\", \"bucket_type\": \"ibm_cos\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1686120645\", \"description\": \"COS bucket for customer data\", \"endpoint\": \"https://s3.<region>.cloud-object-storage.appdomain.cloud/\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"secret_key\": \"secret_key\", \"state\": \"active\", \"tags\": [\"tags\"]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateBucketRegistrationPath = "/bucket_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateBucketRegistrationOptions model
    UpdateBucketRegistrationOptions updateBucketRegistrationOptionsModel = new UpdateBucketRegistrationOptions.Builder()
      .bucketId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateBucketRegistration() with a valid options model and verify the result
    Response<UpdateBucketRegistrationOKBody> response = watsonxDataService.updateBucketRegistration(updateBucketRegistrationOptionsModel).execute();
    assertNotNull(response);
    UpdateBucketRegistrationOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBucketRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBucketRegistration operation with and without retries enabled
  @Test
  public void testUpdateBucketRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateBucketRegistrationWOptions();

    watsonxDataService.disableRetries();
    testUpdateBucketRegistrationWOptions();
  }

  // Test the updateBucketRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateBucketRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateBucketRegistration(null).execute();
  }

  // Test the createActivateBucket operation with a valid options model parameter
  @Test
  public void testCreateActivateBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createActivateBucketPath = "/bucket_registrations/testString/activate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateActivateBucketOptions model
    CreateActivateBucketOptions createActivateBucketOptionsModel = new CreateActivateBucketOptions.Builder()
      .bucketId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createActivateBucket() with a valid options model and verify the result
    Response<CreateActivateBucketCreatedBody> response = watsonxDataService.createActivateBucket(createActivateBucketOptionsModel).execute();
    assertNotNull(response);
    CreateActivateBucketCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActivateBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createActivateBucket operation with and without retries enabled
  @Test
  public void testCreateActivateBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateActivateBucketWOptions();

    watsonxDataService.disableRetries();
    testCreateActivateBucketWOptions();
  }

  // Test the createActivateBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateActivateBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createActivateBucket(null).execute();
  }

  // Test the deleteDeactivateBucket operation with a valid options model parameter
  @Test
  public void testDeleteDeactivateBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDeactivateBucketPath = "/bucket_registrations/testString/deactivate";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDeactivateBucketOptions model
    DeleteDeactivateBucketOptions deleteDeactivateBucketOptionsModel = new DeleteDeactivateBucketOptions.Builder()
      .bucketId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDeactivateBucket() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDeactivateBucket(deleteDeactivateBucketOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDeactivateBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDeactivateBucket operation with and without retries enabled
  @Test
  public void testDeleteDeactivateBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDeactivateBucketWOptions();

    watsonxDataService.disableRetries();
    testDeleteDeactivateBucketWOptions();
  }

  // Test the deleteDeactivateBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDeactivateBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDeactivateBucket(null).execute();
  }

  // Test the listBucketObjects operation with a valid options model parameter
  @Test
  public void testListBucketObjectsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"objects\": [\"object_1\"], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listBucketObjectsPath = "/bucket_registrations/testString/objects";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListBucketObjectsOptions model
    ListBucketObjectsOptions listBucketObjectsOptionsModel = new ListBucketObjectsOptions.Builder()
      .bucketId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listBucketObjects() with a valid options model and verify the result
    Response<ListBucketObjectsOKBody> response = watsonxDataService.listBucketObjects(listBucketObjectsOptionsModel).execute();
    assertNotNull(response);
    ListBucketObjectsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listBucketObjectsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listBucketObjects operation with and without retries enabled
  @Test
  public void testListBucketObjectsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListBucketObjectsWOptions();

    watsonxDataService.disableRetries();
    testListBucketObjectsWOptions();
  }

  // Test the listBucketObjects operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListBucketObjectsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listBucketObjects(null).execute();
  }

  // Test the testBucketConnection operation with a valid options model parameter
  @Test
  public void testTestBucketConnectionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_status\": {\"state\": true, \"state_message\": \"bucket does not exist or the credentials provided are not valid.\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String testBucketConnectionPath = "/test_bucket_connection";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TestBucketConnectionOptions model
    TestBucketConnectionOptions testBucketConnectionOptionsModel = new TestBucketConnectionOptions.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .bucketType("ibm_cos")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .region("us-south")
      .secretKey("secret_key")
      .authInstanceId("testString")
      .build();

    // Invoke testBucketConnection() with a valid options model and verify the result
    Response<TestBucketConnectionOKBody> response = watsonxDataService.testBucketConnection(testBucketConnectionOptionsModel).execute();
    assertNotNull(response);
    TestBucketConnectionOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, testBucketConnectionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the testBucketConnection operation with and without retries enabled
  @Test
  public void testTestBucketConnectionWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testTestBucketConnectionWOptions();

    watsonxDataService.disableRetries();
    testTestBucketConnectionWOptions();
  }

  // Test the testBucketConnection operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTestBucketConnectionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.testBucketConnection(null).execute();
  }

  // Test the createDriverDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testCreateDriverDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database\": {\"database_display_name\": \"databaseDisplayName\", \"database_id\": \"databaseId\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createDriverDatabaseCatalogPath = "/database_driver_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDriverDatabaseCatalogOptions model
    CreateDriverDatabaseCatalogOptions createDriverDatabaseCatalogOptionsModel = new CreateDriverDatabaseCatalogOptions.Builder()
      .databaseDisplayName("testString")
      .databaseType("testString")
      .catalogName("testString")
      .hostname("testString")
      .port("testString")
      .driver(TestUtilities.createMockStream("This is a mock file."))
      .driverContentType("testString")
      .driverFileName("testString")
      .certificate("testString")
      .certificateExtension("testString")
      .ssl("testString")
      .username("testString")
      .password("testString")
      .databaseName("testString")
      .description("testString")
      .createdOn("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createDriverDatabaseCatalog() with a valid options model and verify the result
    Response<CreateDriverDatabaseCatalogCreatedBody> response = watsonxDataService.createDriverDatabaseCatalog(createDriverDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    CreateDriverDatabaseCatalogCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDriverDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDriverDatabaseCatalog operation with and without retries enabled
  @Test
  public void testCreateDriverDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDriverDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testCreateDriverDatabaseCatalogWOptions();
  }

  // Test the createDriverDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDriverDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDriverDatabaseCatalog(null).execute();
  }

  // Test the listDatabaseRegistrations operation with a valid options model parameter
  @Test
  public void testListDatabaseRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database_registrations\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"created_by\": \"user1@bim.com\", \"created_on\": \"1686792721\", \"database_details\": {\"database_name\": \"new_database\", \"hostname\": \"netezza://ps.fyre.com\", \"password\": \"samplepassword\", \"port\": 4543, \"sasl\": true, \"ssl\": true, \"tables\": \"kafka_table_name\", \"username\": \"sampleuser\"}, \"database_display_name\": \"new_database\", \"database_id\": \"new_database_id\", \"database_properties\": [\"databaseProperties\"], \"database_type\": \"netezza\", \"description\": \"Description of the external Database\", \"tags\": [\"tags\"]}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
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
    Response<ListDatabaseRegistrationsOKBody> response = watsonxDataService.listDatabaseRegistrations(listDatabaseRegistrationsOptionsModel).execute();
    assertNotNull(response);
    ListDatabaseRegistrationsOKBody responseObj = response.getResult();
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
    String mockResponseBody = "{\"database_registration\": {\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"created_by\": \"user1@bim.com\", \"created_on\": \"1686792721\", \"database_details\": {\"database_name\": \"new_database\", \"hostname\": \"netezza://ps.fyre.com\", \"password\": \"samplepassword\", \"port\": 4543, \"sasl\": true, \"ssl\": true, \"tables\": \"kafka_table_name\", \"username\": \"sampleuser\"}, \"database_display_name\": \"new_database\", \"database_id\": \"new_database_id\", \"database_properties\": [\"databaseProperties\"], \"database_type\": \"netezza\", \"description\": \"Description of the external Database\", \"tags\": [\"tags\"]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createDatabaseRegistrationPath = "/database_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RegisterDatabaseCatalogBodyDatabaseDetails model
    RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModel = new RegisterDatabaseCatalogBodyDatabaseDetails.Builder()
      .certificate("contents of a pem/crt file")
      .certificateExtension("pem/crt")
      .databaseName("new_database")
      .hostname("db2@<hostname>.com")
      .hosts("abc.com:1234,xyz.com:4321")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .sasl(true)
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .build();

    // Construct an instance of the RegisterDatabaseCatalogBodyDatabasePropertiesItems model
    RegisterDatabaseCatalogBodyDatabasePropertiesItems registerDatabaseCatalogBodyDatabasePropertiesItemsModel = new RegisterDatabaseCatalogBodyDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();

    // Construct an instance of the CreateDatabaseRegistrationOptions model
    CreateDatabaseRegistrationOptions createDatabaseRegistrationOptionsModel = new CreateDatabaseRegistrationOptions.Builder()
      .catalogName("sampleCatalog")
      .databaseDisplayName("new_database")
      .databaseType("db2")
      .createdOn(Long.valueOf("26"))
      .databaseDetails(registerDatabaseCatalogBodyDatabaseDetailsModel)
      .databaseProperties(java.util.Arrays.asList(registerDatabaseCatalogBodyDatabasePropertiesItemsModel))
      .description("db2 extenal database description")
      .tags(java.util.Arrays.asList("tag_1", "tag_2"))
      .authInstanceId("testString")
      .build();

    // Invoke createDatabaseRegistration() with a valid options model and verify the result
    Response<CreateDatabaseRegistrationCreatedBody> response = watsonxDataService.createDatabaseRegistration(createDatabaseRegistrationOptionsModel).execute();
    assertNotNull(response);
    CreateDatabaseRegistrationCreatedBody responseObj = response.getResult();
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

  // Test the getDatabase operation with a valid options model parameter
  @Test
  public void testGetDatabaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"database\": {\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"created_by\": \"user1@bim.com\", \"created_on\": \"1686792721\", \"database_details\": {\"database_name\": \"new_database\", \"hostname\": \"netezza://ps.fyre.com\", \"password\": \"samplepassword\", \"port\": 4543, \"sasl\": true, \"ssl\": true, \"tables\": \"kafka_table_name\", \"username\": \"sampleuser\"}, \"database_display_name\": \"new_database\", \"database_id\": \"new_database_id\", \"database_properties\": [\"databaseProperties\"], \"database_type\": \"netezza\", \"description\": \"Description of the external Database\", \"tags\": [\"tags\"]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getDatabasePath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDatabaseOptions model
    GetDatabaseOptions getDatabaseOptionsModel = new GetDatabaseOptions.Builder()
      .databaseId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDatabase() with a valid options model and verify the result
    Response<GetDatabaseOKBody> response = watsonxDataService.getDatabase(getDatabaseOptionsModel).execute();
    assertNotNull(response);
    GetDatabaseOKBody responseObj = response.getResult();
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
      .databaseId("testString")
      .authInstanceId("testString")
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
    String mockResponseBody = "{\"database\": {\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"created_by\": \"user1@bim.com\", \"created_on\": \"1686792721\", \"database_details\": {\"database_name\": \"new_database\", \"hostname\": \"netezza://ps.fyre.com\", \"password\": \"samplepassword\", \"port\": 4543, \"sasl\": true, \"ssl\": true, \"tables\": \"kafka_table_name\", \"username\": \"sampleuser\"}, \"database_display_name\": \"new_database\", \"database_id\": \"new_database_id\", \"database_properties\": [\"databaseProperties\"], \"database_type\": \"netezza\", \"description\": \"Description of the external Database\", \"tags\": [\"tags\"]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateDatabasePath = "/database_registrations/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateDatabaseOptions model
    UpdateDatabaseOptions updateDatabaseOptionsModel = new UpdateDatabaseOptions.Builder()
      .databaseId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateDatabase() with a valid options model and verify the result
    Response<UpdateDatabaseOKBody> response = watsonxDataService.updateDatabase(updateDatabaseOptionsModel).execute();
    assertNotNull(response);
    UpdateDatabaseOKBody responseObj = response.getResult();
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
    String mockResponseBody = "{\"connection_response\": {\"state\": false, \"state_message\": \"stateMessage\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String validateDatabaseConnectionPath = "/test_database_connection";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ValidateDatabaseBodyDatabaseDetails model
    ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModel = new ValidateDatabaseBodyDatabaseDetails.Builder()
      .databaseName("sampledatabase")
      .hostname("db2@hostname.com")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .sasl(true)
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .build();

    // Construct an instance of the ValidateDatabaseConnectionOptions model
    ValidateDatabaseConnectionOptions validateDatabaseConnectionOptionsModel = new ValidateDatabaseConnectionOptions.Builder()
      .databaseDetails(validateDatabaseBodyDatabaseDetailsModel)
      .databaseType("netezza")
      .certificate("contents of a pem/crt file")
      .authInstanceId("testString")
      .build();

    // Invoke validateDatabaseConnection() with a valid options model and verify the result
    Response<ValidateDatabaseConnectionOKBody> response = watsonxDataService.validateDatabaseConnection(validateDatabaseConnectionOptionsModel).execute();
    assertNotNull(response);
    ValidateDatabaseConnectionOKBody responseObj = response.getResult();
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

  // Test the listDb2Engines operation with a valid options model parameter
  @Test
  public void testListDb2EnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"db2_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"db2 engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-db2-01-db2-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listDb2EnginesPath = "/db2_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDb2EnginesOptions model
    ListDb2EnginesOptions listDb2EnginesOptionsModel = new ListDb2EnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listDb2Engines() with a valid options model and verify the result
    Response<ListDb2EnginesOKBody> response = watsonxDataService.listDb2Engines(listDb2EnginesOptionsModel).execute();
    assertNotNull(response);
    ListDb2EnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDb2EnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listDb2Engines operation with and without retries enabled
  @Test
  public void testListDb2EnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListDb2EnginesWOptions();

    watsonxDataService.disableRetries();
    testListDb2EnginesWOptions();
  }

  // Test the createDb2Engine operation with a valid options model parameter
  @Test
  public void testCreateDb2EngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"db2 engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-db2-01-db2-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createDb2EnginePath = "/db2_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDb2EngineDetails model
    CreateDb2EngineDetails createDb2EngineDetailsModel = new CreateDb2EngineDetails.Builder()
      .connectionString("1.2.3.4")
      .build();

    // Construct an instance of the CreateDb2EngineOptions model
    CreateDb2EngineOptions createDb2EngineOptionsModel = new CreateDb2EngineOptions.Builder()
      .origin("external")
      .type("db2")
      .description("db2 engine description")
      .engineDetails(createDb2EngineDetailsModel)
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createDb2Engine() with a valid options model and verify the result
    Response<CreateDb2EngineCreatedBody> response = watsonxDataService.createDb2Engine(createDb2EngineOptionsModel).execute();
    assertNotNull(response);
    CreateDb2EngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDb2EnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDb2Engine operation with and without retries enabled
  @Test
  public void testCreateDb2EngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDb2EngineWOptions();

    watsonxDataService.disableRetries();
    testCreateDb2EngineWOptions();
  }

  // Test the createDb2Engine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDb2EngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDb2Engine(null).execute();
  }

  // Test the deleteDb2Engine operation with a valid options model parameter
  @Test
  public void testDeleteDb2EngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDb2EnginePath = "/db2_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDb2EngineOptions model
    DeleteDb2EngineOptions deleteDb2EngineOptionsModel = new DeleteDb2EngineOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDb2Engine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDb2Engine(deleteDb2EngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDb2EnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDb2Engine operation with and without retries enabled
  @Test
  public void testDeleteDb2EngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDb2EngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteDb2EngineWOptions();
  }

  // Test the deleteDb2Engine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDb2EngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDb2Engine(null).execute();
  }

  // Test the updateDb2Engine operation with a valid options model parameter
  @Test
  public void testUpdateDb2EngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"db2_engine\": {\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"db2 engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-db2-01-db2-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateDb2EnginePath = "/db2_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateDb2EngineOptions model
    UpdateDb2EngineOptions updateDb2EngineOptionsModel = new UpdateDb2EngineOptions.Builder()
      .engineId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateDb2Engine() with a valid options model and verify the result
    Response<UpdateDb2EngineOKBody> response = watsonxDataService.updateDb2Engine(updateDb2EngineOptionsModel).execute();
    assertNotNull(response);
    UpdateDb2EngineOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDb2EnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDb2Engine operation with and without retries enabled
  @Test
  public void testUpdateDb2EngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDb2EngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateDb2EngineWOptions();
  }

  // Test the updateDb2Engine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDb2EngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDb2Engine(null).execute();
  }

  // Test the listEngines operation with a valid options model parameter
  @Test
  public void testListEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engines\": {\"db2_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"db2 engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-db2-01-db2-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"db2\"}], \"milvus_services\": [{\"actions\": [\"actions\"], \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"milvus service for running sql queries\", \"grpc_port\": 8, \"host_name\": \"sampleMilvus\", \"https_port\": 9, \"origin\": \"native\", \"service_display_name\": \"sampleService\", \"service_id\": \"sampleService123\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"milvus\"}], \"netezza_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"netezza engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}], \"prestissimo_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"prestissimo engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}, \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"external_host_name\": \"ibm-lh-lakehouse-prestissimo-01-prestissimo-svc-cpd-instance.apps.wkclhconnectortest.cp.fyre.ibm.com\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-prestissimo-01-prestissimo-svc\", \"origin\": \"ibm\", \"port\": 4, \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}}], \"presto_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"presto engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}, \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"origin\": \"ibm\", \"port\": 4, \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}}], \"spark_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"spark engine for running sql queries\", \"engine_details\": {\"connection_string\": \"https://xyz.<region>.ae.cloud.123.com/v3/analytics_engines/<spark_iae_id>\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"origin\": \"ibm\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}]}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listEnginesPath = "/engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListEnginesOptions model
    ListEnginesOptions listEnginesOptionsModel = new ListEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listEngines() with a valid options model and verify the result
    Response<ListEnginesOKBody> response = watsonxDataService.listEngines(listEnginesOptionsModel).execute();
    assertNotNull(response);
    ListEnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listEngines operation with and without retries enabled
  @Test
  public void testListEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListEnginesWOptions();

    watsonxDataService.disableRetries();
    testListEnginesWOptions();
  }

  // Test the getDeployments operation with a valid options model parameter
  @Test
  public void testGetDeploymentsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"deploymentresponse\": {\"deployment\": {\"cloud_type\": \"awq\", \"enable_private_endpoints\": true, \"enable_public_endpoints\": true, \"first_time_use\": false, \"formation_id\": \"new_form_id\", \"id\": \"dep_id\", \"plan_id\": \"new_plan_id\", \"platform_options\": {\"backup_encryption_key_crn\": \"<backup_encryption_key_crn>\", \"disk_encryption_key_crn\": \"<disk_encryption_key_crn>\", \"key_protect_key_id\": \"<key_protect_key_id>\"}, \"region\": \"us-south\", \"resource_group_crn\": \"crn:v1:staging:public:resource-controller::a/hddrtnjjj27dh38xbw::resource-group:c02a6a94f16e4ca\", \"type\": \"deployment_type\", \"version\": \"1.0.2\"}}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getDeploymentsPath = "/instance";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDeploymentsOptions model
    GetDeploymentsOptions getDeploymentsOptionsModel = new GetDeploymentsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getDeployments() with a valid options model and verify the result
    Response<GetDeploymentsOKBody> response = watsonxDataService.getDeployments(getDeploymentsOptionsModel).execute();
    assertNotNull(response);
    GetDeploymentsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDeploymentsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDeployments operation with and without retries enabled
  @Test
  public void testGetDeploymentsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDeploymentsWOptions();

    watsonxDataService.disableRetries();
    testGetDeploymentsWOptions();
  }

  // Test the listNetezzaEngines operation with a valid options model parameter
  @Test
  public void testListNetezzaEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"netezza_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"netezza engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listNetezzaEnginesPath = "/netezza_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListNetezzaEnginesOptions model
    ListNetezzaEnginesOptions listNetezzaEnginesOptionsModel = new ListNetezzaEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listNetezzaEngines() with a valid options model and verify the result
    Response<ListNetezzaEnginesOKBody> response = watsonxDataService.listNetezzaEngines(listNetezzaEnginesOptionsModel).execute();
    assertNotNull(response);
    ListNetezzaEnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listNetezzaEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listNetezzaEngines operation with and without retries enabled
  @Test
  public void testListNetezzaEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListNetezzaEnginesWOptions();

    watsonxDataService.disableRetries();
    testListNetezzaEnginesWOptions();
  }

  // Test the createNetezzaEngine operation with a valid options model parameter
  @Test
  public void testCreateNetezzaEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"netezza engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createNetezzaEnginePath = "/netezza_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateNetezzaEngineDetails model
    CreateNetezzaEngineDetails createNetezzaEngineDetailsModel = new CreateNetezzaEngineDetails.Builder()
      .connectionString("1.2.3.4")
      .build();

    // Construct an instance of the CreateNetezzaEngineOptions model
    CreateNetezzaEngineOptions createNetezzaEngineOptionsModel = new CreateNetezzaEngineOptions.Builder()
      .origin("external")
      .type("netezza")
      .description("netezza engine description")
      .engineDetails(createNetezzaEngineDetailsModel)
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createNetezzaEngine() with a valid options model and verify the result
    Response<CreateNetezzaEngineCreatedBody> response = watsonxDataService.createNetezzaEngine(createNetezzaEngineOptionsModel).execute();
    assertNotNull(response);
    CreateNetezzaEngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createNetezzaEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createNetezzaEngine operation with and without retries enabled
  @Test
  public void testCreateNetezzaEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateNetezzaEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateNetezzaEngineWOptions();
  }

  // Test the createNetezzaEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateNetezzaEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createNetezzaEngine(null).execute();
  }

  // Test the deleteNetezzaEngine operation with a valid options model parameter
  @Test
  public void testDeleteNetezzaEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteNetezzaEnginePath = "/netezza_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteNetezzaEngineOptions model
    DeleteNetezzaEngineOptions deleteNetezzaEngineOptionsModel = new DeleteNetezzaEngineOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteNetezzaEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteNetezzaEngine(deleteNetezzaEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteNetezzaEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteNetezzaEngine operation with and without retries enabled
  @Test
  public void testDeleteNetezzaEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteNetezzaEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteNetezzaEngineWOptions();
  }

  // Test the deleteNetezzaEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteNetezzaEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteNetezzaEngine(null).execute();
  }

  // Test the updateNetezzaEngine operation with a valid options model parameter
  @Test
  public void testUpdateNetezzaEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"netezza_engine\": {\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"netezza engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"host_name\": \"xyz-netezza-01-netezza-svc\", \"origin\": \"ibm\", \"port\": 4, \"status\": \"REGISTERED\", \"tags\": [\"tags\"], \"type\": \"netezza\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateNetezzaEnginePath = "/netezza_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateNetezzaEngineOptions model
    UpdateNetezzaEngineOptions updateNetezzaEngineOptionsModel = new UpdateNetezzaEngineOptions.Builder()
      .engineId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateNetezzaEngine() with a valid options model and verify the result
    Response<UpdateNetezzaEngineOKBody> response = watsonxDataService.updateNetezzaEngine(updateNetezzaEngineOptionsModel).execute();
    assertNotNull(response);
    UpdateNetezzaEngineOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateNetezzaEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateNetezzaEngine operation with and without retries enabled
  @Test
  public void testUpdateNetezzaEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateNetezzaEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateNetezzaEngineWOptions();
  }

  // Test the updateNetezzaEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateNetezzaEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateNetezzaEngine(null).execute();
  }

  // Test the listOtherEngines operation with a valid options model parameter
  @Test
  public void testListOtherEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"other_engines\": [{\"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"engine_type\": \"netezza\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"origin\": \"ibm\", \"status\": \"registered\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"external\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listOtherEnginesPath = "/other_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListOtherEnginesOptions model
    ListOtherEnginesOptions listOtherEnginesOptionsModel = new ListOtherEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listOtherEngines() with a valid options model and verify the result
    Response<ListOtherEnginesOKBody> response = watsonxDataService.listOtherEngines(listOtherEnginesOptionsModel).execute();
    assertNotNull(response);
    ListOtherEnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listOtherEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listOtherEngines operation with and without retries enabled
  @Test
  public void testListOtherEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListOtherEnginesWOptions();

    watsonxDataService.disableRetries();
    testListOtherEnginesWOptions();
  }

  // Test the createOtherEngine operation with a valid options model parameter
  @Test
  public void testCreateOtherEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"engine_type\": \"netezza\", \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"origin\": \"ibm\", \"status\": \"registered\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"external\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createOtherEnginePath = "/other_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the OtherEngineDetails model
    OtherEngineDetails otherEngineDetailsModel = new OtherEngineDetails.Builder()
      .connectionString("1.2.3.4")
      .engineType("netezza")
      .metastoreHost("1.2.3.4")
      .build();

    // Construct an instance of the CreateOtherEngineOptions model
    CreateOtherEngineOptions createOtherEngineOptionsModel = new CreateOtherEngineOptions.Builder()
      .description("external engine description")
      .engineDetails(otherEngineDetailsModel)
      .engineDisplayName("sampleEngine01")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createOtherEngine() with a valid options model and verify the result
    Response<CreateOtherEngineCreatedBody> response = watsonxDataService.createOtherEngine(createOtherEngineOptionsModel).execute();
    assertNotNull(response);
    CreateOtherEngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createOtherEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createOtherEngine operation with and without retries enabled
  @Test
  public void testCreateOtherEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateOtherEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateOtherEngineWOptions();
  }

  // Test the deleteOtherEngine operation with a valid options model parameter
  @Test
  public void testDeleteOtherEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteOtherEnginePath = "/other_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteOtherEngineOptions model
    DeleteOtherEngineOptions deleteOtherEngineOptionsModel = new DeleteOtherEngineOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteOtherEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteOtherEngine(deleteOtherEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteOtherEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteOtherEngine operation with and without retries enabled
  @Test
  public void testDeleteOtherEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteOtherEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteOtherEngineWOptions();
  }

  // Test the deleteOtherEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteOtherEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteOtherEngine(null).execute();
  }

  // Test the listPrestoEngines operation with a valid options model parameter
  @Test
  public void testListPrestoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"presto_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"presto engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}, \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"origin\": \"ibm\", \"port\": 4, \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listPrestoEnginesPath = "/presto_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestoEnginesOptions model
    ListPrestoEnginesOptions listPrestoEnginesOptionsModel = new ListPrestoEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listPrestoEngines() with a valid options model and verify the result
    Response<ListPrestoEnginesOKBody> response = watsonxDataService.listPrestoEngines(listPrestoEnginesOptionsModel).execute();
    assertNotNull(response);
    ListPrestoEnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestoEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestoEngines operation with and without retries enabled
  @Test
  public void testListPrestoEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestoEnginesWOptions();

    watsonxDataService.disableRetries();
    testListPrestoEnginesWOptions();
  }

  // Test the createEngine operation with a valid options model parameter
  @Test
  public void testCreateEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"presto engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}, \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"origin\": \"ibm\", \"port\": 4, \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createEnginePath = "/presto_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescriptionBody model
    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    // Construct an instance of the EngineDetailsBody model
    EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
      .apiKey("<api_key>")
      .connectionString("1.2.3.4")
      .coordinator(nodeDescriptionBodyModel)
      .instanceId("instance_id")
      .managedBy("fully/self")
      .sizeConfig("starter")
      .worker(nodeDescriptionBodyModel)
      .build();

    // Construct an instance of the CreateEngineOptions model
    CreateEngineOptions createEngineOptionsModel = new CreateEngineOptions.Builder()
      .origin("native")
      .type("presto")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("presto engine description")
      .engineDetails(engineDetailsBodyModel)
      .engineDisplayName("sampleEngine")
      .firstTimeUse(true)
      .region("us-south")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .version("1.2.3")
      .authInstanceId("testString")
      .build();

    // Invoke createEngine() with a valid options model and verify the result
    Response<CreateEngineCreatedBody> response = watsonxDataService.createEngine(createEngineOptionsModel).execute();
    assertNotNull(response);
    CreateEngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEngine operation with and without retries enabled
  @Test
  public void testCreateEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateEngineWOptions();
  }

  // Test the createEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEngine(null).execute();
  }

  // Test the getPrestoEngine operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"presto engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}, \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"origin\": \"ibm\", \"port\": 4, \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getPrestoEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestoEngineOptions model
    GetPrestoEngineOptions getPrestoEngineOptionsModel = new GetPrestoEngineOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestoEngine() with a valid options model and verify the result
    Response<GetPrestoEngineOKBody> response = watsonxDataService.getPrestoEngine(getPrestoEngineOptionsModel).execute();
    assertNotNull(response);
    GetPrestoEngineOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestoEngine operation with and without retries enabled
  @Test
  public void testGetPrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testGetPrestoEngineWOptions();
  }

  // Test the getPrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestoEngine(null).execute();
  }

  // Test the deleteEngine operation with a valid options model parameter
  @Test
  public void testDeleteEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteEngineOptions model
    DeleteEngineOptions deleteEngineOptionsModel = new DeleteEngineOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteEngine(deleteEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteEngine operation with and without retries enabled
  @Test
  public void testDeleteEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteEngineWOptions();
  }

  // Test the deleteEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteEngine(null).execute();
  }

  // Test the updateEngine operation with a valid options model parameter
  @Test
  public void testUpdateEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"presto engine for running sql queries\", \"engine_details\": {\"connection_string\": \"1.2.3.4\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}, \"metastore_host\": \"1.2.3.4\"}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"origin\": \"ibm\", \"port\": 4, \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 10, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateEngineOptions model
    UpdateEngineOptions updateEngineOptionsModel = new UpdateEngineOptions.Builder()
      .engineId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateEngine() with a valid options model and verify the result
    Response<UpdateEngineOKBody> response = watsonxDataService.updateEngine(updateEngineOptionsModel).execute();
    assertNotNull(response);
    UpdateEngineOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateEngine operation with and without retries enabled
  @Test
  public void testUpdateEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateEngineWOptions();
  }

  // Test the updateEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateEngine(null).execute();
  }

  // Test the listPrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListPrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"catalog_name\": \"sampleCatalog\", \"creation_date\": \"16073847388\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listPrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestoEngineCatalogsOptions model
    ListPrestoEngineCatalogsOptions listPrestoEngineCatalogsOptionsModel = new ListPrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listPrestoEngineCatalogs() with a valid options model and verify the result
    Response<ListPrestoEngineCatalogsOKBody> response = watsonxDataService.listPrestoEngineCatalogs(listPrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    ListPrestoEngineCatalogsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testListPrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListPrestoEngineCatalogsWOptions();
  }

  // Test the listPrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listPrestoEngineCatalogs(null).execute();
  }

  // Test the replacePrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testReplacePrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"catalog_name\": \"sampleCatalog\", \"creation_date\": \"16073847388\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String replacePrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplacePrestoEngineCatalogsOptions model
    ReplacePrestoEngineCatalogsOptions replacePrestoEngineCatalogsOptionsModel = new ReplacePrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();

    // Invoke replacePrestoEngineCatalogs() with a valid options model and verify the result
    Response<ReplacePrestoEngineCatalogsCreatedBody> response = watsonxDataService.replacePrestoEngineCatalogs(replacePrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    ReplacePrestoEngineCatalogsCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replacePrestoEngineCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_names"), "testString");
  }

  // Test the replacePrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testReplacePrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplacePrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testReplacePrestoEngineCatalogsWOptions();
  }

  // Test the replacePrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplacePrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replacePrestoEngineCatalogs(null).execute();
  }

  // Test the deletePrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testDeletePrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePrestoEngineCatalogsOptions model
    DeletePrestoEngineCatalogsOptions deletePrestoEngineCatalogsOptionsModel = new DeletePrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deletePrestoEngineCatalogs() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deletePrestoEngineCatalogs(deletePrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrestoEngineCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_names"), "testString");
  }

  // Test the deletePrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testDeletePrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeletePrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testDeletePrestoEngineCatalogsWOptions();
  }

  // Test the deletePrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deletePrestoEngineCatalogs(null).execute();
  }

  // Test the getPrestoEngineCatalog operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog\": {\"actions\": [\"actions\"], \"associated_buckets\": [\"associatedBuckets\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"catalog_name\": \"sampleCatalog\", \"catalog_type\": \"iceberg\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1602839833\", \"description\": \"Iceberg catalog description\", \"hostname\": \"s3a://samplehost.com\", \"last_sync_at\": \"1602839833\", \"managed_by\": \"ibm\", \"metastore\": \"glue\", \"port\": \"3232\", \"status\": \"running\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\", \"tags\": [\"tags\"], \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getPrestoEngineCatalogPath = "/presto_engines/testString/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestoEngineCatalogOptions model
    GetPrestoEngineCatalogOptions getPrestoEngineCatalogOptionsModel = new GetPrestoEngineCatalogOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestoEngineCatalog() with a valid options model and verify the result
    Response<GetPrestoEngineCatalogOKBody> response = watsonxDataService.getPrestoEngineCatalog(getPrestoEngineCatalogOptionsModel).execute();
    assertNotNull(response);
    GetPrestoEngineCatalogOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestoEngineCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestoEngineCatalog operation with and without retries enabled
  @Test
  public void testGetPrestoEngineCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestoEngineCatalogWOptions();

    watsonxDataService.disableRetries();
    testGetPrestoEngineCatalogWOptions();
  }

  // Test the getPrestoEngineCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestoEngineCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestoEngineCatalog(null).execute();
  }

  // Test the createEnginePause operation with a valid options model parameter
  @Test
  public void testCreateEnginePauseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createEnginePausePath = "/presto_engines/testString/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateEnginePauseOptions model
    CreateEnginePauseOptions createEnginePauseOptionsModel = new CreateEnginePauseOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createEnginePause() with a valid options model and verify the result
    Response<CreateEnginePauseCreatedBody> response = watsonxDataService.createEnginePause(createEnginePauseOptionsModel).execute();
    assertNotNull(response);
    CreateEnginePauseCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEnginePausePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEnginePause operation with and without retries enabled
  @Test
  public void testCreateEnginePauseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEnginePauseWOptions();

    watsonxDataService.disableRetries();
    testCreateEnginePauseWOptions();
  }

  // Test the createEnginePause operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEnginePauseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEnginePause(null).execute();
  }

  // Test the runExplainStatement operation with a valid options model parameter
  @Test
  public void testRunExplainStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"result\": \"result\"}";
    String runExplainStatementPath = "/presto_engines/testString/query_explain";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RunExplainStatementOptions model
    RunExplainStatementOptions runExplainStatementOptionsModel = new RunExplainStatementOptions.Builder()
      .engineId("testString")
      .statement("show schemas in catalog_name")
      .format("json")
      .type("io")
      .authInstanceId("testString")
      .build();

    // Invoke runExplainStatement() with a valid options model and verify the result
    Response<RunExplainStatementOKBody> response = watsonxDataService.runExplainStatement(runExplainStatementOptionsModel).execute();
    assertNotNull(response);
    RunExplainStatementOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runExplainStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runExplainStatement operation with and without retries enabled
  @Test
  public void testRunExplainStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRunExplainStatementWOptions();

    watsonxDataService.disableRetries();
    testRunExplainStatementWOptions();
  }

  // Test the runExplainStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunExplainStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.runExplainStatement(null).execute();
  }

  // Test the runExplainAnalyzeStatement operation with a valid options model parameter
  @Test
  public void testRunExplainAnalyzeStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"result\": \"result\"}";
    String runExplainAnalyzeStatementPath = "/presto_engines/testString/query_explain_analyze";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RunExplainAnalyzeStatementOptions model
    RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptionsModel = new RunExplainAnalyzeStatementOptions.Builder()
      .engineId("testString")
      .statement("show schemas in catalog_name")
      .verbose(true)
      .authInstanceId("testString")
      .build();

    // Invoke runExplainAnalyzeStatement() with a valid options model and verify the result
    Response<RunExplainAnalyzeStatementOKBody> response = watsonxDataService.runExplainAnalyzeStatement(runExplainAnalyzeStatementOptionsModel).execute();
    assertNotNull(response);
    RunExplainAnalyzeStatementOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runExplainAnalyzeStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the runExplainAnalyzeStatement operation with and without retries enabled
  @Test
  public void testRunExplainAnalyzeStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRunExplainAnalyzeStatementWOptions();

    watsonxDataService.disableRetries();
    testRunExplainAnalyzeStatementWOptions();
  }

  // Test the runExplainAnalyzeStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunExplainAnalyzeStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.runExplainAnalyzeStatement(null).execute();
  }

  // Test the createEngineRestart operation with a valid options model parameter
  @Test
  public void testCreateEngineRestartWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createEngineRestartPath = "/presto_engines/testString/restart";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateEngineRestartOptions model
    CreateEngineRestartOptions createEngineRestartOptionsModel = new CreateEngineRestartOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createEngineRestart() with a valid options model and verify the result
    Response<CreateEngineRestartCreatedBody> response = watsonxDataService.createEngineRestart(createEngineRestartOptionsModel).execute();
    assertNotNull(response);
    CreateEngineRestartCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEngineRestartPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEngineRestart operation with and without retries enabled
  @Test
  public void testCreateEngineRestartWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEngineRestartWOptions();

    watsonxDataService.disableRetries();
    testCreateEngineRestartWOptions();
  }

  // Test the createEngineRestart operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineRestartNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEngineRestart(null).execute();
  }

  // Test the createEngineResume operation with a valid options model parameter
  @Test
  public void testCreateEngineResumeWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createEngineResumePath = "/presto_engines/testString/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateEngineResumeOptions model
    CreateEngineResumeOptions createEngineResumeOptionsModel = new CreateEngineResumeOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createEngineResume() with a valid options model and verify the result
    Response<CreateEngineResumeCreatedBody> response = watsonxDataService.createEngineResume(createEngineResumeOptionsModel).execute();
    assertNotNull(response);
    CreateEngineResumeCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEngineResumePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEngineResume operation with and without retries enabled
  @Test
  public void testCreateEngineResumeWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEngineResumeWOptions();

    watsonxDataService.disableRetries();
    testCreateEngineResumeWOptions();
  }

  // Test the createEngineResume operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineResumeNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEngineResume(null).execute();
  }

  // Test the createEngineScale operation with a valid options model parameter
  @Test
  public void testCreateEngineScaleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createEngineScalePath = "/presto_engines/testString/scale";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescription model
    NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    // Construct an instance of the CreateEngineScaleOptions model
    CreateEngineScaleOptions createEngineScaleOptionsModel = new CreateEngineScaleOptions.Builder()
      .engineId("testString")
      .coordinator(nodeDescriptionModel)
      .worker(nodeDescriptionModel)
      .authInstanceId("testString")
      .build();

    // Invoke createEngineScale() with a valid options model and verify the result
    Response<CreateEngineScaleCreatedBody> response = watsonxDataService.createEngineScale(createEngineScaleOptionsModel).execute();
    assertNotNull(response);
    CreateEngineScaleCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEngineScalePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEngineScale operation with and without retries enabled
  @Test
  public void testCreateEngineScaleWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEngineScaleWOptions();

    watsonxDataService.disableRetries();
    testCreateEngineScaleWOptions();
  }

  // Test the createEngineScale operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineScaleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEngineScale(null).execute();
  }

  // Test the listSparkEngines operation with a valid options model parameter
  @Test
  public void testListSparkEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"spark_engines\": [{\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"spark engine for running sql queries\", \"engine_details\": {\"connection_string\": \"https://xyz.<region>.ae.cloud.123.com/v3/analytics_engines/<spark_iae_id>\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"origin\": \"ibm\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}]}";
    String listSparkEnginesPath = "/spark_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSparkEnginesOptions model
    ListSparkEnginesOptions listSparkEnginesOptionsModel = new ListSparkEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listSparkEngines() with a valid options model and verify the result
    Response<ListSparkEnginesOKBody> response = watsonxDataService.listSparkEngines(listSparkEnginesOptionsModel).execute();
    assertNotNull(response);
    ListSparkEnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSparkEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSparkEngines operation with and without retries enabled
  @Test
  public void testListSparkEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSparkEnginesWOptions();

    watsonxDataService.disableRetries();
    testListSparkEnginesWOptions();
  }

  // Test the createSparkEngine operation with a valid options model parameter
  @Test
  public void testCreateSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"spark engine for running sql queries\", \"engine_details\": {\"connection_string\": \"https://xyz.<region>.ae.cloud.123.com/v3/analytics_engines/<spark_iae_id>\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"origin\": \"ibm\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createSparkEnginePath = "/spark_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkEngineDetailsPrototype model
    SparkEngineDetailsPrototype sparkEngineDetailsPrototypeModel = new SparkEngineDetailsPrototype.Builder()
      .apiKey("apikey")
      .connectionString("1.2.3.4")
      .instanceId("spark-id")
      .managedBy("fully/self")
      .build();

    // Construct an instance of the CreateSparkEngineOptions model
    CreateSparkEngineOptions createSparkEngineOptionsModel = new CreateSparkEngineOptions.Builder()
      .origin("native")
      .type("spark")
      .description("spark engine description")
      .engineDetails(sparkEngineDetailsPrototypeModel)
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createSparkEngine() with a valid options model and verify the result
    Response<CreateSparkEngineCreatedBody> response = watsonxDataService.createSparkEngine(createSparkEngineOptionsModel).execute();
    assertNotNull(response);
    CreateSparkEngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSparkEngine operation with and without retries enabled
  @Test
  public void testCreateSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateSparkEngineWOptions();
  }

  // Test the createSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSparkEngine(null).execute();
  }

  // Test the deleteSparkEngine operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEnginePath = "/spark_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineOptions model
    DeleteSparkEngineOptions deleteSparkEngineOptionsModel = new DeleteSparkEngineOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngine(deleteSparkEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSparkEngine operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineWOptions();
  }

  // Test the deleteSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngine(null).execute();
  }

  // Test the updateSparkEngine operation with a valid options model parameter
  @Test
  public void testUpdateSparkEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine\": {\"actions\": [\"actions\"], \"build_version\": \"1.0.3.0.0\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": 9, \"description\": \"spark engine for running sql queries\", \"engine_details\": {\"connection_string\": \"https://xyz.<region>.ae.cloud.123.com/v3/analytics_engines/<spark_iae_id>\", \"endpoints\": {\"applications_api\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>\", \"history_server_endpoint\": \"$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server\", \"spark_access_endpoint\": \"$HOST/analytics-engine/details/spark-<instance_id>\", \"spark_jobs_v4_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications\", \"spark_kernel_endpoint\": \"$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels\", \"view_history_server\": \"viewHistoryServer\", \"wxd_application_endpoint\": \"$HOST/v1/1698311655308796/engines/spark817/applications\"}}, \"engine_display_name\": \"sampleEngine\", \"engine_id\": \"sampleEngine123\", \"origin\": \"ibm\", \"status\": \"Registered\", \"tags\": [\"tags\"], \"type\": \"spark\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateSparkEnginePath = "/spark_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateSparkEngineOptions model
    UpdateSparkEngineOptions updateSparkEngineOptionsModel = new UpdateSparkEngineOptions.Builder()
      .engineId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateSparkEngine() with a valid options model and verify the result
    Response<UpdateSparkEngineOKBody> response = watsonxDataService.updateSparkEngine(updateSparkEngineOptionsModel).execute();
    assertNotNull(response);
    UpdateSparkEngineOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSparkEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSparkEngine operation with and without retries enabled
  @Test
  public void testUpdateSparkEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateSparkEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateSparkEngineWOptions();
  }

  // Test the updateSparkEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSparkEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateSparkEngine(null).execute();
  }

  // Test the listSparkEngineApplications operation with a valid options model parameter
  @Test
  public void testListSparkEngineApplicationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applications\": [{\"application_id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"2020-12-08T10:00:00.000Z\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"2020-12-08T10:00:00.000Z\", \"finish_time\": \"2020-12-08T10:00:00.000Z\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"runtime\": {\"spark_version\": \"3.3\"}, \"spark_application_id\": \"application_16073847388_0001\", \"spark_application_name\": \"sparkApplicationName\", \"start_time\": \"2020-12-08T10:00:00.000Z\", \"state\": \"RUNNING\", \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listSparkEngineApplicationsPath = "/spark_engines/testString/applications";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSparkEngineApplicationsOptions model
    ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptionsModel = new ListSparkEngineApplicationsOptions.Builder()
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSparkEngineApplications() with a valid options model and verify the result
    Response<ListSparkEngineApplicationsOKBody> response = watsonxDataService.listSparkEngineApplications(listSparkEngineApplicationsOptionsModel).execute();
    assertNotNull(response);
    ListSparkEngineApplicationsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSparkEngineApplicationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listSparkEngineApplications operation with and without retries enabled
  @Test
  public void testListSparkEngineApplicationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSparkEngineApplicationsWOptions();

    watsonxDataService.disableRetries();
    testListSparkEngineApplicationsWOptions();
  }

  // Test the listSparkEngineApplications operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSparkEngineApplicationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSparkEngineApplications(null).execute();
  }

  // Test the createSparkEngineApplication operation with a valid options model parameter
  @Test
  public void testCreateSparkEngineApplicationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"spark_engine_application\": {\"application_id\": \"23c99c14-3af8-467d-9703-cc8163c60d35\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"state\": \"ACCEPTED\"}}";
    String createSparkEngineApplicationPath = "/spark_engines/testString/applications";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SparkApplicationDetails model
    SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
      .application("s3://mybucket/wordcount.py")
      .arguments(java.util.Arrays.asList("people.txt"))
      .conf(java.util.Collections.singletonMap("key1", "key:value"))
      .env(java.util.Collections.singletonMap("key1", "key:value"))
      .name("SparkApplicaton1")
      .build();

    // Construct an instance of the CreateSparkEngineApplicationOptions model
    CreateSparkEngineApplicationOptions createSparkEngineApplicationOptionsModel = new CreateSparkEngineApplicationOptions.Builder()
      .engineId("testString")
      .applicationDetails(sparkApplicationDetailsModel)
      .jobEndpoint("<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications")
      .serviceInstanceId("testString")
      .type("iae")
      .authInstanceId("testString")
      .build();

    // Invoke createSparkEngineApplication() with a valid options model and verify the result
    Response<CreateSparkEngineApplicationCreatedBody> response = watsonxDataService.createSparkEngineApplication(createSparkEngineApplicationOptionsModel).execute();
    assertNotNull(response);
    CreateSparkEngineApplicationCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSparkEngineApplicationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSparkEngineApplication operation with and without retries enabled
  @Test
  public void testCreateSparkEngineApplicationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSparkEngineApplicationWOptions();

    watsonxDataService.disableRetries();
    testCreateSparkEngineApplicationWOptions();
  }

  // Test the createSparkEngineApplication operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineApplicationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSparkEngineApplication(null).execute();
  }

  // Test the deleteSparkEngineApplications operation with a valid options model parameter
  @Test
  public void testDeleteSparkEngineApplicationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSparkEngineApplicationsPath = "/spark_engines/testString/applications";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSparkEngineApplicationsOptions model
    DeleteSparkEngineApplicationsOptions deleteSparkEngineApplicationsOptionsModel = new DeleteSparkEngineApplicationsOptions.Builder()
      .engineId("testString")
      .applicationId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSparkEngineApplications() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSparkEngineApplications(deleteSparkEngineApplicationsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSparkEngineApplicationsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("application_id"), "testString");
  }

  // Test the deleteSparkEngineApplications operation with and without retries enabled
  @Test
  public void testDeleteSparkEngineApplicationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSparkEngineApplicationsWOptions();

    watsonxDataService.disableRetries();
    testDeleteSparkEngineApplicationsWOptions();
  }

  // Test the deleteSparkEngineApplications operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineApplicationsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSparkEngineApplications(null).execute();
  }

  // Test the getSparkEngineApplicationStatus operation with a valid options model parameter
  @Test
  public void testGetSparkEngineApplicationStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"application\": {\"application_details\": {\"application\": \"/opt/ibm/spark/examples/src/main/python/wordcount.py\", \"arguments\": [\"arguments\"], \"conf\": {\"spark_app_name\": \"MyJob\", \"spark_hive_metastore_client_auth_mode\": \"PLAIN\", \"spark_hive_metastore_client_plain_password\": \"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9...\", \"spark_hive_metastore_client_plain_username\": \"ibm_lh_token_admin\", \"spark_hive_metastore_truststore_password\": \"changeit\", \"spark_hive_metastore_truststore_path\": \"file:///opt/ibm/jdk/lib/security/cacerts\", \"spark_hive_metastore_truststore_type\": \"JKS\", \"spark_hive_metastore_use_ssl\": \"true\", \"spark_sql_catalog_implementation\": \"hive\", \"spark_sql_catalog_lakehouse\": \"org.apache.iceberg.spark.SparkCatalog\", \"spark_sql_catalog_lakehouse_type\": \"hive\", \"spark_sql_catalog_lakehouse_uri\": \"sparkSqlCatalogLakehouseUri\", \"spark_sql_extensions\": \"org.apache.iceberg.spark.extensions.IcebergSparkSessionExtensions\", \"spark_sql_iceberg_vectorization_enabled\": \"false\"}, \"env\": {\"anyKey\": \"anyValue\"}, \"name\": \"SparkApplication1\"}, \"application_id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"auto_termination_time\": \"2020-12-08T10:00:00.000Z\", \"creation_time\": \"Saturday 28 October 2023 07:17:06.856+0000\", \"deploy_mode\": \"stand-alone\", \"end_time\": \"2020-12-08T10:00:00.000Z\", \"failed_time\": \"failedTime\", \"finish_time\": \"Saturday 28 October 2023 07:17:38.966+0000\", \"id\": \"cd7cbf1f-8893-4c51-aa3d-d92729f05e99\", \"return_code\": \"0\", \"spark_application_id\": \"app-20231028071726-0000\", \"spark_application_name\": \"PythonWordCount\", \"start_time\": \"Saturday 28 October 2023 07:17:26.649+0000\", \"state\": \"FINISHED\", \"state_details\": [{\"code\": \"code\", \"message\": \"message\", \"type\": \"type\"}], \"submission_time\": \"2023-11-01T11:18:49.758Z\", \"template_id\": \"spark-3.3-jaas-v2-cp4d-template\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getSparkEngineApplicationStatusPath = "/spark_engines/testString/applications/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSparkEngineApplicationStatusOptions model
    GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptionsModel = new GetSparkEngineApplicationStatusOptions.Builder()
      .engineId("testString")
      .applicationId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSparkEngineApplicationStatus() with a valid options model and verify the result
    Response<GetSparkEngineApplicationStatusOKBody> response = watsonxDataService.getSparkEngineApplicationStatus(getSparkEngineApplicationStatusOptionsModel).execute();
    assertNotNull(response);
    GetSparkEngineApplicationStatusOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSparkEngineApplicationStatusPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getSparkEngineApplicationStatus operation with and without retries enabled
  @Test
  public void testGetSparkEngineApplicationStatusWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSparkEngineApplicationStatusWOptions();

    watsonxDataService.disableRetries();
    testGetSparkEngineApplicationStatusWOptions();
  }

  // Test the getSparkEngineApplicationStatus operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSparkEngineApplicationStatusNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSparkEngineApplicationStatus(null).execute();
  }

  // Test the testLHConsole operation with a valid options model parameter
  @Test
  public void testTestLhConsoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}";
    String testLHConsolePath = "/ready";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TestLHConsoleOptions model
    TestLHConsoleOptions testLhConsoleOptionsModel = new TestLHConsoleOptions();

    // Invoke testLHConsole() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.testLHConsole(testLhConsoleOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, testLHConsolePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the testLHConsole operation with and without retries enabled
  @Test
  public void testTestLhConsoleWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testTestLhConsoleWOptions();

    watsonxDataService.disableRetries();
    testTestLhConsoleWOptions();
  }

  // Test the listCatalogs operation with a valid options model parameter
  @Test
  public void testListCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"actions\"], \"associated_buckets\": [\"associatedBuckets\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"catalog_name\": \"sampleCatalog\", \"catalog_type\": \"iceberg\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1602839833\", \"description\": \"Iceberg catalog description\", \"hostname\": \"s3a://samplehost.com\", \"last_sync_at\": \"1602839833\", \"managed_by\": \"ibm\", \"metastore\": \"glue\", \"port\": \"3232\", \"status\": \"running\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\", \"tags\": [\"tags\"], \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String listCatalogsPath = "/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListCatalogsOptions model
    ListCatalogsOptions listCatalogsOptionsModel = new ListCatalogsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listCatalogs() with a valid options model and verify the result
    Response<ListCatalogsOKBody> response = watsonxDataService.listCatalogs(listCatalogsOptionsModel).execute();
    assertNotNull(response);
    ListCatalogsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listCatalogs operation with and without retries enabled
  @Test
  public void testListCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListCatalogsWOptions();
  }

  // Test the getCatalog operation with a valid options model parameter
  @Test
  public void testGetCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog\": {\"actions\": [\"actions\"], \"associated_buckets\": [\"associatedBuckets\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"catalog_name\": \"sampleCatalog\", \"catalog_type\": \"iceberg\", \"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1602839833\", \"description\": \"Iceberg catalog description\", \"hostname\": \"s3a://samplehost.com\", \"last_sync_at\": \"1602839833\", \"managed_by\": \"ibm\", \"metastore\": \"glue\", \"port\": \"3232\", \"status\": \"running\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\", \"tags\": [\"tags\"], \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getCatalogPath = "/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogOptions model
    GetCatalogOptions getCatalogOptionsModel = new GetCatalogOptions.Builder()
      .catalogId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getCatalog() with a valid options model and verify the result
    Response<GetCatalogOKBody> response = watsonxDataService.getCatalog(getCatalogOptionsModel).execute();
    assertNotNull(response);
    GetCatalogOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCatalog operation with and without retries enabled
  @Test
  public void testGetCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetCatalogWOptions();

    watsonxDataService.disableRetries();
    testGetCatalogWOptions();
  }

  // Test the getCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getCatalog(null).execute();
  }

  // Test the listSchemas operation with a valid options model parameter
  @Test
  public void testListSchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"schemas\": [\"schemas\"]}";
    String listSchemasPath = "/catalogs/testString/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSchemasOptions model
    ListSchemasOptions listSchemasOptionsModel = new ListSchemasOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSchemas() with a valid options model and verify the result
    Response<ListSchemasOKBody> response = watsonxDataService.listSchemas(listSchemasOptionsModel).execute();
    assertNotNull(response);
    ListSchemasOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSchemasPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listSchemas operation with and without retries enabled
  @Test
  public void testListSchemasWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListSchemasWOptions();

    watsonxDataService.disableRetries();
    testListSchemasWOptions();
  }

  // Test the listSchemas operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSchemasNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listSchemas(null).execute();
  }

  // Test the createSchema operation with a valid options model parameter
  @Test
  public void testCreateSchemaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String createSchemaPath = "/catalogs/testString/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSchemaOptions model
    CreateSchemaOptions createSchemaOptionsModel = new CreateSchemaOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .customPath("sample-path")
      .schemaName("SampleSchema1")
      .bucketName("sample-bucket")
      .authInstanceId("testString")
      .build();

    // Invoke createSchema() with a valid options model and verify the result
    Response<CreateSchemaCreatedBody> response = watsonxDataService.createSchema(createSchemaOptionsModel).execute();
    assertNotNull(response);
    CreateSchemaCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSchemaPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the createSchema operation with and without retries enabled
  @Test
  public void testCreateSchemaWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSchemaWOptions();

    watsonxDataService.disableRetries();
    testCreateSchemaWOptions();
  }

  // Test the createSchema operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSchemaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSchema(null).execute();
  }

  // Test the deleteSchema operation with a valid options model parameter
  @Test
  public void testDeleteSchemaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSchemaPath = "/catalogs/testString/schemas/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSchemaOptions model
    DeleteSchemaOptions deleteSchemaOptionsModel = new DeleteSchemaOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .schemaId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSchema() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSchema(deleteSchemaOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSchemaPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the deleteSchema operation with and without retries enabled
  @Test
  public void testDeleteSchemaWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSchemaWOptions();

    watsonxDataService.disableRetries();
    testDeleteSchemaWOptions();
  }

  // Test the deleteSchema operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSchemaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSchema(null).execute();
  }

  // Test the listTables operation with a valid options model parameter
  @Test
  public void testListTablesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"tables\": [\"tables\"]}";
    String listTablesPath = "/catalogs/testString/schemas/testString/tables";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTablesOptions model
    ListTablesOptions listTablesOptionsModel = new ListTablesOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listTables() with a valid options model and verify the result
    Response<ListTablesOKBody> response = watsonxDataService.listTables(listTablesOptionsModel).execute();
    assertNotNull(response);
    ListTablesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTablesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listTables operation with and without retries enabled
  @Test
  public void testListTablesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListTablesWOptions();

    watsonxDataService.disableRetries();
    testListTablesWOptions();
  }

  // Test the listTables operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTablesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listTables(null).execute();
  }

  // Test the getTable operation with a valid options model parameter
  @Test
  public void testGetTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"column_name\": \"expenses\", \"comment\": \"expenses column\", \"extra\": \"varchar\", \"type\": \"varchar\"}], \"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String getTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTableOptions model
    GetTableOptions getTableOptionsModel = new GetTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTable() with a valid options model and verify the result
    Response<GetTableOKBody> response = watsonxDataService.getTable(getTableOptionsModel).execute();
    assertNotNull(response);
    GetTableOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the getTable operation with and without retries enabled
  @Test
  public void testGetTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetTableWOptions();

    watsonxDataService.disableRetries();
    testGetTableWOptions();
  }

  // Test the getTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getTable(null).execute();
  }

  // Test the deleteTable operation with a valid options model parameter
  @Test
  public void testDeleteTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTableOptions model
    DeleteTableOptions deleteTableOptionsModel = new DeleteTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteTable() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteTable(deleteTableOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the deleteTable operation with and without retries enabled
  @Test
  public void testDeleteTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteTableWOptions();

    watsonxDataService.disableRetries();
    testDeleteTableWOptions();
  }

  // Test the deleteTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteTable(null).execute();
  }

  // Test the updateTable operation with a valid options model parameter
  @Test
  public void testUpdateTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateTableOptions model
    UpdateTableOptions updateTableOptionsModel = new UpdateTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .engineId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateTable() with a valid options model and verify the result
    Response<UpdateTableOKBody> response = watsonxDataService.updateTable(updateTableOptionsModel).execute();
    assertNotNull(response);
    UpdateTableOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the updateTable operation with and without retries enabled
  @Test
  public void testUpdateTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateTableWOptions();

    watsonxDataService.disableRetries();
    testUpdateTableWOptions();
  }

  // Test the updateTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateTable(null).execute();
  }

  // Test the listTableSnapshots operation with a valid options model parameter
  @Test
  public void testListTableSnapshotsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}, \"snapshots\": [{\"committed_at\": \"1609379392\", \"operation\": \"alter\", \"snapshot_id\": \"2332342122211222\", \"summary\": {\"anyKey\": \"anyValue\"}}]}";
    String listTableSnapshotsPath = "/catalogs/testString/schemas/testString/tables/testString/snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTableSnapshotsOptions model
    ListTableSnapshotsOptions listTableSnapshotsOptionsModel = new ListTableSnapshotsOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listTableSnapshots() with a valid options model and verify the result
    Response<ListTableSnapshotsOKBody> response = watsonxDataService.listTableSnapshots(listTableSnapshotsOptionsModel).execute();
    assertNotNull(response);
    ListTableSnapshotsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTableSnapshotsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the listTableSnapshots operation with and without retries enabled
  @Test
  public void testListTableSnapshotsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListTableSnapshotsWOptions();

    watsonxDataService.disableRetries();
    testListTableSnapshotsWOptions();
  }

  // Test the listTableSnapshots operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTableSnapshotsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listTableSnapshots(null).execute();
  }

  // Test the replaceSnapshot operation with a valid options model parameter
  @Test
  public void testReplaceSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String replaceSnapshotPath = "/catalogs/testString/schemas/testString/tables/testString/snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceSnapshotOptions model
    ReplaceSnapshotOptions replaceSnapshotOptionsModel = new ReplaceSnapshotOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .snapshotId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke replaceSnapshot() with a valid options model and verify the result
    Response<ReplaceSnapshotCreatedBody> response = watsonxDataService.replaceSnapshot(replaceSnapshotOptionsModel).execute();
    assertNotNull(response);
    ReplaceSnapshotCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
  }

  // Test the replaceSnapshot operation with and without retries enabled
  @Test
  public void testReplaceSnapshotWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplaceSnapshotWOptions();

    watsonxDataService.disableRetries();
    testReplaceSnapshotWOptions();
  }

  // Test the replaceSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replaceSnapshot(null).execute();
  }

  // Test the updateSyncCatalog operation with a valid options model parameter
  @Test
  public void testUpdateSyncCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"Successful message\", \"message_code\": \"successfulCode\"}}";
    String updateSyncCatalogPath = "/catalogs/testString/sync";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the JsonPatchOperation model
    JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
      .op("add")
      .path("testString")
      .from("testString")
      .value("testString")
      .build();

    // Construct an instance of the UpdateSyncCatalogOptions model
    UpdateSyncCatalogOptions updateSyncCatalogOptionsModel = new UpdateSyncCatalogOptions.Builder()
      .catalogId("testString")
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .authInstanceId("testString")
      .build();

    // Invoke updateSyncCatalog() with a valid options model and verify the result
    Response<UpdateSyncCatalogOKBody> response = watsonxDataService.updateSyncCatalog(updateSyncCatalogOptionsModel).execute();
    assertNotNull(response);
    UpdateSyncCatalogOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSyncCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateSyncCatalog operation with and without retries enabled
  @Test
  public void testUpdateSyncCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateSyncCatalogWOptions();

    watsonxDataService.disableRetries();
    testUpdateSyncCatalogWOptions();
  }

  // Test the updateSyncCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSyncCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateSyncCatalog(null).execute();
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