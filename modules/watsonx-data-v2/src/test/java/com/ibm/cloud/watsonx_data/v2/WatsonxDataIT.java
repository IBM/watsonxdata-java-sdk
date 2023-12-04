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
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.watsonx_data.test.SdkIntegrationTestBase;
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
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.RecordedRequest;
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
    return "../../watsonx_data_v2.env";
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
  public void testListBucketRegistrations() throws Exception {
    try {
      ListBucketRegistrationsOptions listBucketRegistrationsOptions = new ListBucketRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListBucketRegistrationsOKBody> response = service.listBucketRegistrations(listBucketRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListBucketRegistrationsOKBody listBucketRegistrationsOkBodyResult = response.getResult();

      assertNotNull(listBucketRegistrationsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBucketRegistrations" })
  public void testCreateBucketRegistration() throws Exception {
    try {
      BucketDetails bucketDetailsModel = new BucketDetails.Builder()
        .accessKey("<access_key>")
        .bucketName("sample-bucket")
        .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
        .secretKey("secret_key")
        .build();

      CreateBucketRegistrationOptions createBucketRegistrationOptions = new CreateBucketRegistrationOptions.Builder()
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

      // Invoke operation
      Response<CreateBucketRegistrationCreatedBody> response = service.createBucketRegistration(createBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateBucketRegistrationCreatedBody createBucketRegistrationCreatedBodyResult = response.getResult();

      assertNotNull(createBucketRegistrationCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBucketRegistration" })
  public void testGetBucketRegistration() throws Exception {
    try {
      GetBucketRegistrationOptions getBucketRegistrationOptions = new GetBucketRegistrationOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetBucketRegistrationOKBody> response = service.getBucketRegistration(getBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetBucketRegistrationOKBody getBucketRegistrationOkBodyResult = response.getResult();

      assertNotNull(getBucketRegistrationOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBucketRegistration" })
  public void testUpdateBucketRegistration() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateBucketRegistrationOptions updateBucketRegistrationOptions = new UpdateBucketRegistrationOptions.Builder()
        .bucketId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateBucketRegistrationOKBody> response = service.updateBucketRegistration(updateBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateBucketRegistrationOKBody updateBucketRegistrationOkBodyResult = response.getResult();

      assertNotNull(updateBucketRegistrationOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBucketRegistration" })
  public void testCreateActivateBucket() throws Exception {
    try {
      CreateActivateBucketOptions createActivateBucketOptions = new CreateActivateBucketOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateActivateBucketCreatedBody> response = service.createActivateBucket(createActivateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateActivateBucketCreatedBody createActivateBucketCreatedBodyResult = response.getResult();

      assertNotNull(createActivateBucketCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateActivateBucket" })
  public void testListBucketObjects() throws Exception {
    try {
      ListBucketObjectsOptions listBucketObjectsOptions = new ListBucketObjectsOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListBucketObjectsOKBody> response = service.listBucketObjects(listBucketObjectsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListBucketObjectsOKBody listBucketObjectsOkBodyResult = response.getResult();

      assertNotNull(listBucketObjectsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListBucketObjects" })
  public void testTestBucketConnection() throws Exception {
    try {
      TestBucketConnectionOptions testBucketConnectionOptions = new TestBucketConnectionOptions.Builder()
        .accessKey("<access_key>")
        .bucketName("sample-bucket")
        .bucketType("ibm_cos")
        .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
        .region("us-south")
        .secretKey("secret_key")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TestBucketConnectionOKBody> response = service.testBucketConnection(testBucketConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TestBucketConnectionOKBody testBucketConnectionOkBodyResult = response.getResult();

      assertNotNull(testBucketConnectionOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testTestBucketConnection" })
  public void testCreateDriverDatabaseCatalog() throws Exception {
    try {
      CreateDriverDatabaseCatalogOptions createDriverDatabaseCatalogOptions = new CreateDriverDatabaseCatalogOptions.Builder()
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

      // Invoke operation
      Response<CreateDriverDatabaseCatalogCreatedBody> response = service.createDriverDatabaseCatalog(createDriverDatabaseCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateDriverDatabaseCatalogCreatedBody createDriverDatabaseCatalogCreatedBodyResult = response.getResult();

      assertNotNull(createDriverDatabaseCatalogCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDriverDatabaseCatalog" })
  public void testListDatabaseRegistrations() throws Exception {
    try {
      ListDatabaseRegistrationsOptions listDatabaseRegistrationsOptions = new ListDatabaseRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListDatabaseRegistrationsOKBody> response = service.listDatabaseRegistrations(listDatabaseRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListDatabaseRegistrationsOKBody listDatabaseRegistrationsOkBodyResult = response.getResult();

      assertNotNull(listDatabaseRegistrationsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDatabaseRegistrations" })
  public void testCreateDatabaseRegistration() throws Exception {
    try {
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

      RegisterDatabaseCatalogBodyDatabasePropertiesItems registerDatabaseCatalogBodyDatabasePropertiesItemsModel = new RegisterDatabaseCatalogBodyDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions = new CreateDatabaseRegistrationOptions.Builder()
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

      // Invoke operation
      Response<CreateDatabaseRegistrationCreatedBody> response = service.createDatabaseRegistration(createDatabaseRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateDatabaseRegistrationCreatedBody createDatabaseRegistrationCreatedBodyResult = response.getResult();

      assertNotNull(createDatabaseRegistrationCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDatabaseRegistration" })
  public void testGetDatabase() throws Exception {
    try {
      GetDatabaseOptions getDatabaseOptions = new GetDatabaseOptions.Builder()
        .databaseId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetDatabaseOKBody> response = service.getDatabase(getDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetDatabaseOKBody getDatabaseOkBodyResult = response.getResult();

      assertNotNull(getDatabaseOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDatabase" })
  public void testUpdateDatabase() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateDatabaseOptions updateDatabaseOptions = new UpdateDatabaseOptions.Builder()
        .databaseId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateDatabaseOKBody> response = service.updateDatabase(updateDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateDatabaseOKBody updateDatabaseOkBodyResult = response.getResult();

      assertNotNull(updateDatabaseOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDatabase" })
  public void testValidateDatabaseConnection() throws Exception {
    try {
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

      ValidateDatabaseConnectionOptions validateDatabaseConnectionOptions = new ValidateDatabaseConnectionOptions.Builder()
        .databaseDetails(validateDatabaseBodyDatabaseDetailsModel)
        .databaseType("netezza")
        .certificate("contents of a pem/crt file")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ValidateDatabaseConnectionOKBody> response = service.validateDatabaseConnection(validateDatabaseConnectionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ValidateDatabaseConnectionOKBody validateDatabaseConnectionOkBodyResult = response.getResult();

      assertNotNull(validateDatabaseConnectionOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testValidateDatabaseConnection" })
  public void testListDb2Engines() throws Exception {
    try {
      ListDb2EnginesOptions listDb2EnginesOptions = new ListDb2EnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListDb2EnginesOKBody> response = service.listDb2Engines(listDb2EnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListDb2EnginesOKBody listDb2EnginesOkBodyResult = response.getResult();

      assertNotNull(listDb2EnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDb2Engines" })
  public void testCreateDb2Engine() throws Exception {
    try {
      CreateDb2EngineDetails createDb2EngineDetailsModel = new CreateDb2EngineDetails.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateDb2EngineOptions createDb2EngineOptions = new CreateDb2EngineOptions.Builder()
        .origin("external")
        .type("db2")
        .description("db2 engine description")
        .engineDetails(createDb2EngineDetailsModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateDb2EngineCreatedBody> response = service.createDb2Engine(createDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateDb2EngineCreatedBody createDb2EngineCreatedBodyResult = response.getResult();

      assertNotNull(createDb2EngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDb2Engine" })
  public void testUpdateDb2Engine() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateDb2EngineOptions updateDb2EngineOptions = new UpdateDb2EngineOptions.Builder()
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateDb2EngineOKBody> response = service.updateDb2Engine(updateDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateDb2EngineOKBody updateDb2EngineOkBodyResult = response.getResult();

      assertNotNull(updateDb2EngineOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDb2Engine" })
  public void testListEngines() throws Exception {
    try {
      ListEnginesOptions listEnginesOptions = new ListEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListEnginesOKBody> response = service.listEngines(listEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListEnginesOKBody listEnginesOkBodyResult = response.getResult();

      assertNotNull(listEnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListEngines" })
  public void testGetDeployments() throws Exception {
    try {
      GetDeploymentsOptions getDeploymentsOptions = new GetDeploymentsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetDeploymentsOKBody> response = service.getDeployments(getDeploymentsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetDeploymentsOKBody getDeploymentsOkBodyResult = response.getResult();

      assertNotNull(getDeploymentsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDeployments" })
  public void testListNetezzaEngines() throws Exception {
    try {
      ListNetezzaEnginesOptions listNetezzaEnginesOptions = new ListNetezzaEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListNetezzaEnginesOKBody> response = service.listNetezzaEngines(listNetezzaEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListNetezzaEnginesOKBody listNetezzaEnginesOkBodyResult = response.getResult();

      assertNotNull(listNetezzaEnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetezzaEngines" })
  public void testCreateNetezzaEngine() throws Exception {
    try {
      CreateNetezzaEngineDetails createNetezzaEngineDetailsModel = new CreateNetezzaEngineDetails.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateNetezzaEngineOptions createNetezzaEngineOptions = new CreateNetezzaEngineOptions.Builder()
        .origin("external")
        .type("netezza")
        .description("netezza engine description")
        .engineDetails(createNetezzaEngineDetailsModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateNetezzaEngineCreatedBody> response = service.createNetezzaEngine(createNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateNetezzaEngineCreatedBody createNetezzaEngineCreatedBodyResult = response.getResult();

      assertNotNull(createNetezzaEngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateNetezzaEngine" })
  public void testUpdateNetezzaEngine() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateNetezzaEngineOptions updateNetezzaEngineOptions = new UpdateNetezzaEngineOptions.Builder()
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateNetezzaEngineOKBody> response = service.updateNetezzaEngine(updateNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateNetezzaEngineOKBody updateNetezzaEngineOkBodyResult = response.getResult();

      assertNotNull(updateNetezzaEngineOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateNetezzaEngine" })
  public void testListOtherEngines() throws Exception {
    try {
      ListOtherEnginesOptions listOtherEnginesOptions = new ListOtherEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListOtherEnginesOKBody> response = service.listOtherEngines(listOtherEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListOtherEnginesOKBody listOtherEnginesOkBodyResult = response.getResult();

      assertNotNull(listOtherEnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListOtherEngines" })
  public void testCreateOtherEngine() throws Exception {
    try {
      OtherEngineDetails otherEngineDetailsModel = new OtherEngineDetails.Builder()
        .connectionString("1.2.3.4")
        .engineType("netezza")
        .metastoreHost("1.2.3.4")
        .build();

      CreateOtherEngineOptions createOtherEngineOptions = new CreateOtherEngineOptions.Builder()
        .description("external engine description")
        .engineDetails(otherEngineDetailsModel)
        .engineDisplayName("sampleEngine01")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateOtherEngineCreatedBody> response = service.createOtherEngine(createOtherEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateOtherEngineCreatedBody createOtherEngineCreatedBodyResult = response.getResult();

      assertNotNull(createOtherEngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateOtherEngine" })
  public void testListPrestoEngines() throws Exception {
    try {
      ListPrestoEnginesOptions listPrestoEnginesOptions = new ListPrestoEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListPrestoEnginesOKBody> response = service.listPrestoEngines(listPrestoEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPrestoEnginesOKBody listPrestoEnginesOkBodyResult = response.getResult();

      assertNotNull(listPrestoEnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestoEngines" })
  public void testCreateEngine() throws Exception {
    try {
      NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
        .apiKey("<api_key>")
        .connectionString("1.2.3.4")
        .coordinator(nodeDescriptionBodyModel)
        .instanceId("instance_id")
        .managedBy("fully/self")
        .sizeConfig("starter")
        .worker(nodeDescriptionBodyModel)
        .build();

      CreateEngineOptions createEngineOptions = new CreateEngineOptions.Builder()
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

      // Invoke operation
      Response<CreateEngineCreatedBody> response = service.createEngine(createEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateEngineCreatedBody createEngineCreatedBodyResult = response.getResult();

      assertNotNull(createEngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEngine" })
  public void testGetPrestoEngine() throws Exception {
    try {
      GetPrestoEngineOptions getPrestoEngineOptions = new GetPrestoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetPrestoEngineOKBody> response = service.getPrestoEngine(getPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetPrestoEngineOKBody getPrestoEngineOkBodyResult = response.getResult();

      assertNotNull(getPrestoEngineOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestoEngine" })
  public void testUpdateEngine() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateEngineOptions updateEngineOptions = new UpdateEngineOptions.Builder()
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateEngineOKBody> response = service.updateEngine(updateEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateEngineOKBody updateEngineOkBodyResult = response.getResult();

      assertNotNull(updateEngineOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateEngine" })
  public void testListPrestoEngineCatalogs() throws Exception {
    try {
      ListPrestoEngineCatalogsOptions listPrestoEngineCatalogsOptions = new ListPrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListPrestoEngineCatalogsOKBody> response = service.listPrestoEngineCatalogs(listPrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListPrestoEngineCatalogsOKBody listPrestoEngineCatalogsOkBodyResult = response.getResult();

      assertNotNull(listPrestoEngineCatalogsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestoEngineCatalogs" })
  public void testReplacePrestoEngineCatalogs() throws Exception {
    try {
      ReplacePrestoEngineCatalogsOptions replacePrestoEngineCatalogsOptions = new ReplacePrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ReplacePrestoEngineCatalogsCreatedBody> response = service.replacePrestoEngineCatalogs(replacePrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ReplacePrestoEngineCatalogsCreatedBody replacePrestoEngineCatalogsCreatedBodyResult = response.getResult();

      assertNotNull(replacePrestoEngineCatalogsCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplacePrestoEngineCatalogs" })
  public void testGetPrestoEngineCatalog() throws Exception {
    try {
      GetPrestoEngineCatalogOptions getPrestoEngineCatalogOptions = new GetPrestoEngineCatalogOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetPrestoEngineCatalogOKBody> response = service.getPrestoEngineCatalog(getPrestoEngineCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetPrestoEngineCatalogOKBody getPrestoEngineCatalogOkBodyResult = response.getResult();

      assertNotNull(getPrestoEngineCatalogOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestoEngineCatalog" })
  public void testCreateEnginePause() throws Exception {
    try {
      CreateEnginePauseOptions createEnginePauseOptions = new CreateEnginePauseOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEnginePauseCreatedBody> response = service.createEnginePause(createEnginePauseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateEnginePauseCreatedBody createEnginePauseCreatedBodyResult = response.getResult();

      assertNotNull(createEnginePauseCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEnginePause" })
  public void testRunExplainStatement() throws Exception {
    try {
      RunExplainStatementOptions runExplainStatementOptions = new RunExplainStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .format("json")
        .type("io")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RunExplainStatementOKBody> response = service.runExplainStatement(runExplainStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RunExplainStatementOKBody runExplainStatementOkBodyResult = response.getResult();

      assertNotNull(runExplainStatementOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunExplainStatement" })
  public void testRunExplainAnalyzeStatement() throws Exception {
    try {
      RunExplainAnalyzeStatementOptions runExplainAnalyzeStatementOptions = new RunExplainAnalyzeStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .verbose(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RunExplainAnalyzeStatementOKBody> response = service.runExplainAnalyzeStatement(runExplainAnalyzeStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RunExplainAnalyzeStatementOKBody runExplainAnalyzeStatementOkBodyResult = response.getResult();

      assertNotNull(runExplainAnalyzeStatementOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunExplainAnalyzeStatement" })
  public void testCreateEngineRestart() throws Exception {
    try {
      CreateEngineRestartOptions createEngineRestartOptions = new CreateEngineRestartOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEngineRestartCreatedBody> response = service.createEngineRestart(createEngineRestartOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateEngineRestartCreatedBody createEngineRestartCreatedBodyResult = response.getResult();

      assertNotNull(createEngineRestartCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEngineRestart" })
  public void testCreateEngineResume() throws Exception {
    try {
      CreateEngineResumeOptions createEngineResumeOptions = new CreateEngineResumeOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEngineResumeCreatedBody> response = service.createEngineResume(createEngineResumeOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateEngineResumeCreatedBody createEngineResumeCreatedBodyResult = response.getResult();

      assertNotNull(createEngineResumeCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEngineResume" })
  public void testCreateEngineScale() throws Exception {
    try {
      NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      CreateEngineScaleOptions createEngineScaleOptions = new CreateEngineScaleOptions.Builder()
        .engineId("testString")
        .coordinator(nodeDescriptionModel)
        .worker(nodeDescriptionModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateEngineScaleCreatedBody> response = service.createEngineScale(createEngineScaleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateEngineScaleCreatedBody createEngineScaleCreatedBodyResult = response.getResult();

      assertNotNull(createEngineScaleCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEngineScale" })
  public void testListSparkEngines() throws Exception {
    try {
      ListSparkEnginesOptions listSparkEnginesOptions = new ListSparkEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListSparkEnginesOKBody> response = service.listSparkEngines(listSparkEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSparkEnginesOKBody listSparkEnginesOkBodyResult = response.getResult();

      assertNotNull(listSparkEnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngines" })
  public void testCreateSparkEngine() throws Exception {
    try {
      SparkEngineDetailsPrototype sparkEngineDetailsPrototypeModel = new SparkEngineDetailsPrototype.Builder()
        .apiKey("apikey")
        .connectionString("1.2.3.4")
        .instanceId("spark-id")
        .managedBy("fully/self")
        .build();

      CreateSparkEngineOptions createSparkEngineOptions = new CreateSparkEngineOptions.Builder()
        .origin("native")
        .type("spark")
        .description("spark engine description")
        .engineDetails(sparkEngineDetailsPrototypeModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateSparkEngineCreatedBody> response = service.createSparkEngine(createSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateSparkEngineCreatedBody createSparkEngineCreatedBodyResult = response.getResult();

      assertNotNull(createSparkEngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngine" })
  public void testUpdateSparkEngine() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateSparkEngineOptions updateSparkEngineOptions = new UpdateSparkEngineOptions.Builder()
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateSparkEngineOKBody> response = service.updateSparkEngine(updateSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateSparkEngineOKBody updateSparkEngineOkBodyResult = response.getResult();

      assertNotNull(updateSparkEngineOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSparkEngine" })
  public void testListSparkEngineApplications() throws Exception {
    try {
      ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions = new ListSparkEngineApplicationsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListSparkEngineApplicationsOKBody> response = service.listSparkEngineApplications(listSparkEngineApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSparkEngineApplicationsOKBody listSparkEngineApplicationsOkBodyResult = response.getResult();

      assertNotNull(listSparkEngineApplicationsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngineApplications" })
  public void testCreateSparkEngineApplication() throws Exception {
    try {
      SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
        .application("s3://mybucket/wordcount.py")
        .arguments(java.util.Arrays.asList("people.txt"))
        .conf(java.util.Collections.singletonMap("key1", "key:value"))
        .env(java.util.Collections.singletonMap("key1", "key:value"))
        .name("SparkApplicaton1")
        .build();

      CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions = new CreateSparkEngineApplicationOptions.Builder()
        .engineId("testString")
        .applicationDetails(sparkApplicationDetailsModel)
        .jobEndpoint("<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications")
        .serviceInstanceId("testString")
        .type("iae")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateSparkEngineApplicationCreatedBody> response = service.createSparkEngineApplication(createSparkEngineApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateSparkEngineApplicationCreatedBody createSparkEngineApplicationCreatedBodyResult = response.getResult();

      assertNotNull(createSparkEngineApplicationCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSparkEngineApplication" })
  public void testGetSparkEngineApplicationStatus() throws Exception {
    try {
      GetSparkEngineApplicationStatusOptions getSparkEngineApplicationStatusOptions = new GetSparkEngineApplicationStatusOptions.Builder()
        .engineId("testString")
        .applicationId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetSparkEngineApplicationStatusOKBody> response = service.getSparkEngineApplicationStatus(getSparkEngineApplicationStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSparkEngineApplicationStatusOKBody getSparkEngineApplicationStatusOkBodyResult = response.getResult();

      assertNotNull(getSparkEngineApplicationStatusOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSparkEngineApplicationStatus" })
  public void testTestLhConsole() throws Exception {
    try {
      TestLHConsoleOptions testLhConsoleOptions = new TestLHConsoleOptions();

      // Invoke operation
      Response<SuccessResponse> response = service.testLHConsole(testLhConsoleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testTestLhConsole" })
  public void testListCatalogs() throws Exception {
    try {
      ListCatalogsOptions listCatalogsOptions = new ListCatalogsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListCatalogsOKBody> response = service.listCatalogs(listCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListCatalogsOKBody listCatalogsOkBodyResult = response.getResult();

      assertNotNull(listCatalogsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListCatalogs" })
  public void testGetCatalog() throws Exception {
    try {
      GetCatalogOptions getCatalogOptions = new GetCatalogOptions.Builder()
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetCatalogOKBody> response = service.getCatalog(getCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetCatalogOKBody getCatalogOkBodyResult = response.getResult();

      assertNotNull(getCatalogOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetCatalog" })
  public void testListSchemas() throws Exception {
    try {
      ListSchemasOptions listSchemasOptions = new ListSchemasOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListSchemasOKBody> response = service.listSchemas(listSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListSchemasOKBody listSchemasOkBodyResult = response.getResult();

      assertNotNull(listSchemasOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSchemas" })
  public void testCreateSchema() throws Exception {
    try {
      CreateSchemaOptions createSchemaOptions = new CreateSchemaOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .customPath("sample-path")
        .schemaName("SampleSchema1")
        .bucketName("sample-bucket")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateSchemaCreatedBody> response = service.createSchema(createSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateSchemaCreatedBody createSchemaCreatedBodyResult = response.getResult();

      assertNotNull(createSchemaCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSchema" })
  public void testListTables() throws Exception {
    try {
      ListTablesOptions listTablesOptions = new ListTablesOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListTablesOKBody> response = service.listTables(listTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListTablesOKBody listTablesOkBodyResult = response.getResult();

      assertNotNull(listTablesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListTables" })
  public void testGetTable() throws Exception {
    try {
      GetTableOptions getTableOptions = new GetTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetTableOKBody> response = service.getTable(getTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetTableOKBody getTableOkBodyResult = response.getResult();

      assertNotNull(getTableOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetTable" })
  public void testUpdateTable() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateTableOptions updateTableOptions = new UpdateTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateTableOKBody> response = service.updateTable(updateTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateTableOKBody updateTableOkBodyResult = response.getResult();

      assertNotNull(updateTableOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateTable" })
  public void testListTableSnapshots() throws Exception {
    try {
      ListTableSnapshotsOptions listTableSnapshotsOptions = new ListTableSnapshotsOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ListTableSnapshotsOKBody> response = service.listTableSnapshots(listTableSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ListTableSnapshotsOKBody listTableSnapshotsOkBodyResult = response.getResult();

      assertNotNull(listTableSnapshotsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListTableSnapshots" })
  public void testReplaceSnapshot() throws Exception {
    try {
      ReplaceSnapshotOptions replaceSnapshotOptions = new ReplaceSnapshotOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .snapshotId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ReplaceSnapshotCreatedBody> response = service.replaceSnapshot(replaceSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ReplaceSnapshotCreatedBody replaceSnapshotCreatedBodyResult = response.getResult();

      assertNotNull(replaceSnapshotCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceSnapshot" })
  public void testUpdateSyncCatalog() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateSyncCatalogOptions updateSyncCatalogOptions = new UpdateSyncCatalogOptions.Builder()
        .catalogId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<UpdateSyncCatalogOKBody> response = service.updateSyncCatalog(updateSyncCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateSyncCatalogOKBody updateSyncCatalogOkBodyResult = response.getResult();

      assertNotNull(updateSyncCatalogOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSyncCatalog" })
  public void testDeleteBucketRegistration() throws Exception {
    try {
      DeleteBucketRegistrationOptions deleteBucketRegistrationOptions = new DeleteBucketRegistrationOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteBucketRegistration(deleteBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBucketRegistration" })
  public void testDeleteDeactivateBucket() throws Exception {
    try {
      DeleteDeactivateBucketOptions deleteDeactivateBucketOptions = new DeleteDeactivateBucketOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDeactivateBucket(deleteDeactivateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDeactivateBucket" })
  public void testDeleteDatabaseCatalog() throws Exception {
    try {
      DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions = new DeleteDatabaseCatalogOptions.Builder()
        .databaseId("testString")
        .authInstanceId("testString")
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

  @Test(dependsOnMethods = { "testDeleteDatabaseCatalog" })
  public void testDeleteDb2Engine() throws Exception {
    try {
      DeleteDb2EngineOptions deleteDb2EngineOptions = new DeleteDb2EngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDb2Engine(deleteDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDb2Engine" })
  public void testDeleteNetezzaEngine() throws Exception {
    try {
      DeleteNetezzaEngineOptions deleteNetezzaEngineOptions = new DeleteNetezzaEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteNetezzaEngine(deleteNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteNetezzaEngine" })
  public void testDeleteOtherEngine() throws Exception {
    try {
      DeleteOtherEngineOptions deleteOtherEngineOptions = new DeleteOtherEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteOtherEngine(deleteOtherEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteOtherEngine" })
  public void testDeleteEngine() throws Exception {
    try {
      DeleteEngineOptions deleteEngineOptions = new DeleteEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteEngine(deleteEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteEngine" })
  public void testDeletePrestoEngineCatalogs() throws Exception {
    try {
      DeletePrestoEngineCatalogsOptions deletePrestoEngineCatalogsOptions = new DeletePrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrestoEngineCatalogs(deletePrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrestoEngineCatalogs" })
  public void testDeleteSparkEngine() throws Exception {
    try {
      DeleteSparkEngineOptions deleteSparkEngineOptions = new DeleteSparkEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngine(deleteSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngine" })
  public void testDeleteSparkEngineApplications() throws Exception {
    try {
      DeleteSparkEngineApplicationsOptions deleteSparkEngineApplicationsOptions = new DeleteSparkEngineApplicationsOptions.Builder()
        .engineId("testString")
        .applicationId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSparkEngineApplications(deleteSparkEngineApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSparkEngineApplications" })
  public void testDeleteSchema() throws Exception {
    try {
      DeleteSchemaOptions deleteSchemaOptions = new DeleteSchemaOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSchema(deleteSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSchema" })
  public void testDeleteTable() throws Exception {
    try {
      DeleteTableOptions deleteTableOptions = new DeleteTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteTable(deleteTableOptions).execute();
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
