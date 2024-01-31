/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v2;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.watsonx_data.test.SdkIntegrationTestBase;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationObjectCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketStatusResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateActivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDriverDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEnginePauseCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEnginePauseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineRestartCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineRestartOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineResumeCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineResumeOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineScaleCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateEngineScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEnginePauseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineRestartOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineResumeOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSchemaCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPrototypeDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteDeactivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteOtherEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Deployment;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeploymentPlatformOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeploymentsResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Engines;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDeploymentsOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetDeploymentsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestissimoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestoEngineCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetSparkEngineApplicationStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.JsonPatchOperation;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListBucketRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDatabaseRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListDb2EnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListMilvusServicesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListNetezzaEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListOtherEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestissimoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSchemasOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListSparkEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListTableSnapshotsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ListTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusService;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplacePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplacePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplaceSnapshotCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplaceSnapshotOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultPrestissimoExplainStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ResultRunPrestissimoExplainAnalyzeStatement;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainAnalyzeStatementOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunPrestissimoExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunPrestissimoExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetailsConf;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusApplicationDetailsConf;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusStateDetailsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineDetailsPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableSnapshot;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TableSnapshotCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestBucketConnectionOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestBucketConnectionOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestDatabaseConnectionResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSyncCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ValidateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ValidateDatabaseConnectionOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
      Response<BucketRegistrationCollection> response = service.listBucketRegistrations(listBucketRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistrationCollection bucketRegistrationCollectionResult = response.getResult();

      assertNotNull(bucketRegistrationCollectionResult);
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

      BucketCatalog bucketCatalogModel = new BucketCatalog.Builder()
        .catalogName("sampleCatalog")
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .catalogType("iceberg")
        .build();

      CreateBucketRegistrationOptions createBucketRegistrationOptions = new CreateBucketRegistrationOptions.Builder()
        .bucketDetails(bucketDetailsModel)
        .bucketType("ibm_cos")
        .description("COS bucket for customer data")
        .managedBy("ibm")
        .associatedCatalog(bucketCatalogModel)
        .bucketDisplayName("sample-bucket-displayname")
        .region("us-south")
        .tags(java.util.Arrays.asList("bucket-tag1", "bucket-tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<BucketRegistration> response = service.createBucketRegistration(createBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      BucketRegistration bucketRegistrationResult = response.getResult();

      assertNotNull(bucketRegistrationResult);
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
      Response<BucketRegistration> response = service.getBucketRegistration(getBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistration bucketRegistrationResult = response.getResult();

      assertNotNull(bucketRegistrationResult);
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
      Response<BucketRegistration> response = service.updateBucketRegistration(updateBucketRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistration bucketRegistrationResult = response.getResult();

      assertNotNull(bucketRegistrationResult);
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
      Response<BucketRegistrationObjectCollection> response = service.listBucketObjects(listBucketObjectsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketRegistrationObjectCollection bucketRegistrationObjectCollectionResult = response.getResult();

      assertNotNull(bucketRegistrationObjectCollectionResult);
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
        .driver(TestUtilities.createMockStream("This is a mock file."))
        .driverFileName("testString")
        .databaseDisplayName("testString")
        .databaseType("testString")
        .catalogName("testString")
        .hostname("testString")
        .port("testString")
        .username("testString")
        .password("testString")
        .databaseName("testString")
        .driverContentType("testString")
        .certificate("testString")
        .certificateExtension("testString")
        .ssl("testString")
        .description("testString")
        .createdOn("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DatabaseRegistration> response = service.createDriverDatabaseCatalog(createDriverDatabaseCatalogOptions).execute();
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

  @Test(dependsOnMethods = { "testCreateDriverDatabaseCatalog" })
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
      DatabaseCatalog databaseCatalogModel = new DatabaseCatalog.Builder()
        .catalogName("sampleCatalog")
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .catalogType("iceberg")
        .build();

      DatabaseDetails databaseDetailsModel = new DatabaseDetails.Builder()
        .certificate("contents of a pem/crt file")
        .certificateExtension("pem/crt")
        .databaseName("new_database")
        .hostname("db2@<hostname>.com")
        .hostnameInCertificate("samplehostname")
        .hosts("abc.com:1234,xyz.com:4321")
        .password("samplepassword")
        .port(Long.valueOf("4553"))
        .sasl(true)
        .ssl(true)
        .tables("kafka_table_name")
        .username("sampleuser")
        .validateServerCertificate(true)
        .build();

      DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
        .encrypt(true)
        .key("abc")
        .value("xyz")
        .build();

      CreateDatabaseRegistrationOptions createDatabaseRegistrationOptions = new CreateDatabaseRegistrationOptions.Builder()
        .databaseDisplayName("new_database")
        .databaseType("db2")
        .associatedCatalog(databaseCatalogModel)
        .createdOn("1686792721")
        .databaseDetails(databaseDetailsModel)
        .databaseProperties(java.util.Arrays.asList(databaseRegistrationPrototypeDatabasePropertiesItemsModel))
        .description("db2 extenal database description")
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
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
  public void testGetDatabase() throws Exception {
    try {
      GetDatabaseOptions getDatabaseOptions = new GetDatabaseOptions.Builder()
        .databaseId("testString")
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
      ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModel = new ValidateDatabaseBodyDatabaseDetails.Builder()
        .databaseName("sampledatabase")
        .hostname("db2@hostname.com")
        .password("samplepassword")
        .port(Long.valueOf("4553"))
        .sasl(true)
        .ssl(true)
        .tables("kafka_table_name")
        .username("sampleuser")
        .validateServerCertificate(true)
        .build();

      ValidateDatabaseConnectionOptions validateDatabaseConnectionOptions = new ValidateDatabaseConnectionOptions.Builder()
        .databaseDetails(validateDatabaseBodyDatabaseDetailsModel)
        .databaseType("netezza")
        .certificate("contents of a pem/crt file")
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
  public void testListDb2Engines() throws Exception {
    try {
      ListDb2EnginesOptions listDb2EnginesOptions = new ListDb2EnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Db2EngineCollection> response = service.listDb2Engines(listDb2EnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Db2EngineCollection db2EngineCollectionResult = response.getResult();

      assertNotNull(db2EngineCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDb2Engines" })
  public void testCreateDb2Engine() throws Exception {
    try {
      Db2EngineDetailsBody db2EngineDetailsBodyModel = new Db2EngineDetailsBody.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateDb2EngineOptions createDb2EngineOptions = new CreateDb2EngineOptions.Builder()
        .origin("external")
        .type("db2")
        .description("db2 engine description")
        .engineDetails(db2EngineDetailsBodyModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Db2Engine> response = service.createDb2Engine(createDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      Db2Engine db2EngineResult = response.getResult();

      assertNotNull(db2EngineResult);
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
      Response<Db2Engine> response = service.updateDb2Engine(updateDb2EngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Db2Engine db2EngineResult = response.getResult();

      assertNotNull(db2EngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDb2Engine" })
  public void testGetEngines() throws Exception {
    try {
      GetEnginesOptions getEnginesOptions = new GetEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Engines> response = service.getEngines(getEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Engines enginesResult = response.getResult();

      assertNotNull(enginesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEngines" })
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
      Response<NetezzaEngineCollection> response = service.listNetezzaEngines(listNetezzaEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetezzaEngineCollection netezzaEngineCollectionResult = response.getResult();

      assertNotNull(netezzaEngineCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListNetezzaEngines" })
  public void testCreateNetezzaEngine() throws Exception {
    try {
      NetezzaEngineDetailsBody netezzaEngineDetailsBodyModel = new NetezzaEngineDetailsBody.Builder()
        .connectionString("1.2.3.4")
        .build();

      CreateNetezzaEngineOptions createNetezzaEngineOptions = new CreateNetezzaEngineOptions.Builder()
        .origin("external")
        .type("netezza")
        .description("netezza engine description")
        .engineDetails(netezzaEngineDetailsBodyModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<NetezzaEngine> response = service.createNetezzaEngine(createNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      NetezzaEngine netezzaEngineResult = response.getResult();

      assertNotNull(netezzaEngineResult);
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
      Response<NetezzaEngine> response = service.updateNetezzaEngine(updateNetezzaEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      NetezzaEngine netezzaEngineResult = response.getResult();

      assertNotNull(netezzaEngineResult);
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
      Response<OtherEngineCollection> response = service.listOtherEngines(listOtherEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      OtherEngineCollection otherEngineCollectionResult = response.getResult();

      assertNotNull(otherEngineCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListOtherEngines" })
  public void testCreateOtherEngine() throws Exception {
    try {
      OtherEngineDetailsBody otherEngineDetailsBodyModel = new OtherEngineDetailsBody.Builder()
        .connectionString("1.2.3.4")
        .engineType("netezza")
        .build();

      CreateOtherEngineOptions createOtherEngineOptions = new CreateOtherEngineOptions.Builder()
        .engineDetails(otherEngineDetailsBodyModel)
        .engineDisplayName("sampleEngine01")
        .description("external engine description")
        .origin("external")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .type("netezza")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<OtherEngine> response = service.createOtherEngine(createOtherEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      OtherEngine otherEngineResult = response.getResult();

      assertNotNull(otherEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateOtherEngine" })
  public void testListPrestissimoEngines() throws Exception {
    try {
      ListPrestissimoEnginesOptions listPrestissimoEnginesOptions = new ListPrestissimoEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngineCollection> response = service.listPrestissimoEngines(listPrestissimoEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestissimoEngineCollection prestissimoEngineCollectionResult = response.getResult();

      assertNotNull(prestissimoEngineCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestissimoEngines" })
  public void testCreatePrestissimoEngine() throws Exception {
    try {
      PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      PrestissimoEndpoints prestissimoEndpointsModel = new PrestissimoEndpoints.Builder()
        .applicationsApi("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>")
        .historyServerEndpoint("$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server")
        .sparkAccessEndpoint("$HOST/analytics-engine/details/spark-<instance_id>")
        .sparkJobsV4Endpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications")
        .sparkKernelEndpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels")
        .viewHistoryServer("testString")
        .wxdApplicationEndpoint("$HOST/v1/1698311655308796/engines/spark817/applications")
        .build();

      PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
        .apiKey("<api_key>")
        .connectionString("1.2.3.4")
        .coordinator(prestissimoNodeDescriptionBodyModel)
        .endpoints(prestissimoEndpointsModel)
        .instanceId("instance_id")
        .managedBy("fully/self")
        .metastoreHost("1.2.3.4")
        .sizeConfig("starter")
        .worker(prestissimoNodeDescriptionBodyModel)
        .build();

      CreatePrestissimoEngineOptions createPrestissimoEngineOptions = new CreatePrestissimoEngineOptions.Builder()
        .origin("native")
        .type("prestissimo")
        .associatedCatalogs(java.util.Arrays.asList("hive_data"))
        .description("prestissimo engine description")
        .engineDetails(prestissimoEngineDetailsModel)
        .engineDisplayName("sampleEngine")
        .region("us-south")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .version("1.2.3")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngine> response = service.createPrestissimoEngine(createPrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PrestissimoEngine prestissimoEngineResult = response.getResult();

      assertNotNull(prestissimoEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestissimoEngine" })
  public void testGetPrestissimoEngine() throws Exception {
    try {
      GetPrestissimoEngineOptions getPrestissimoEngineOptions = new GetPrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngine> response = service.getPrestissimoEngine(getPrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestissimoEngine prestissimoEngineResult = response.getResult();

      assertNotNull(prestissimoEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestissimoEngine" })
  public void testUpdatePrestissimoEngine() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions = new UpdatePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestissimoEngine> response = service.updatePrestissimoEngine(updatePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestissimoEngine prestissimoEngineResult = response.getResult();

      assertNotNull(prestissimoEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrestissimoEngine" })
  public void testListPrestissimoEngineCatalogs() throws Exception {
    try {
      ListPrestissimoEngineCatalogsOptions listPrestissimoEngineCatalogsOptions = new ListPrestissimoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.listPrestissimoEngineCatalogs(listPrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();

      assertNotNull(catalogCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestissimoEngineCatalogs" })
  public void testReplacePrestissimoEngineCatalogs() throws Exception {
    try {
      ReplacePrestissimoEngineCatalogsOptions replacePrestissimoEngineCatalogsOptions = new ReplacePrestissimoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.replacePrestissimoEngineCatalogs(replacePrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CatalogCollection catalogCollectionResult = response.getResult();

      assertNotNull(catalogCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplacePrestissimoEngineCatalogs" })
  public void testGetPrestissimoEngineCatalog() throws Exception {
    try {
      GetPrestissimoEngineCatalogOptions getPrestissimoEngineCatalogOptions = new GetPrestissimoEngineCatalogOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Catalog> response = service.getPrestissimoEngineCatalog(getPrestissimoEngineCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();

      assertNotNull(catalogResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestissimoEngineCatalog" })
  public void testCreatePrestissimoEnginePause() throws Exception {
    try {
      CreatePrestissimoEnginePauseOptions createPrestissimoEnginePauseOptions = new CreatePrestissimoEnginePauseOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createPrestissimoEnginePause(createPrestissimoEnginePauseOptions).execute();
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

  @Test(dependsOnMethods = { "testCreatePrestissimoEnginePause" })
  public void testRunPrestissimoExplainStatement() throws Exception {
    try {
      RunPrestissimoExplainStatementOptions runPrestissimoExplainStatementOptions = new RunPrestissimoExplainStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .format("json")
        .type("io")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ResultPrestissimoExplainStatement> response = service.runPrestissimoExplainStatement(runPrestissimoExplainStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResultPrestissimoExplainStatement resultPrestissimoExplainStatementResult = response.getResult();

      assertNotNull(resultPrestissimoExplainStatementResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunPrestissimoExplainStatement" })
  public void testRunPrestissimoExplainAnalyzeStatement() throws Exception {
    try {
      RunPrestissimoExplainAnalyzeStatementOptions runPrestissimoExplainAnalyzeStatementOptions = new RunPrestissimoExplainAnalyzeStatementOptions.Builder()
        .engineId("testString")
        .statement("show schemas in catalog_name")
        .verbose(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ResultRunPrestissimoExplainAnalyzeStatement> response = service.runPrestissimoExplainAnalyzeStatement(runPrestissimoExplainAnalyzeStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResultRunPrestissimoExplainAnalyzeStatement resultRunPrestissimoExplainAnalyzeStatementResult = response.getResult();

      assertNotNull(resultRunPrestissimoExplainAnalyzeStatementResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunPrestissimoExplainAnalyzeStatement" })
  public void testCreatePrestissimoEngineRestart() throws Exception {
    try {
      CreatePrestissimoEngineRestartOptions createPrestissimoEngineRestartOptions = new CreatePrestissimoEngineRestartOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createPrestissimoEngineRestart(createPrestissimoEngineRestartOptions).execute();
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

  @Test(dependsOnMethods = { "testCreatePrestissimoEngineRestart" })
  public void testCreatePrestissimoEngineResume() throws Exception {
    try {
      CreatePrestissimoEngineResumeOptions createPrestissimoEngineResumeOptions = new CreatePrestissimoEngineResumeOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createPrestissimoEngineResume(createPrestissimoEngineResumeOptions).execute();
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

  @Test(dependsOnMethods = { "testCreatePrestissimoEngineResume" })
  public void testCreatePrestissimoEngineScale() throws Exception {
    try {
      PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      CreatePrestissimoEngineScaleOptions createPrestissimoEngineScaleOptions = new CreatePrestissimoEngineScaleOptions.Builder()
        .engineId("testString")
        .coordinator(prestissimoNodeDescriptionBodyModel)
        .worker(prestissimoNodeDescriptionBodyModel)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createPrestissimoEngineScale(createPrestissimoEngineScaleOptions).execute();
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

  @Test(dependsOnMethods = { "testCreatePrestissimoEngineScale" })
  public void testListPrestoEngines() throws Exception {
    try {
      ListPrestoEnginesOptions listPrestoEnginesOptions = new ListPrestoEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngineCollection> response = service.listPrestoEngines(listPrestoEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngineCollection prestoEngineCollectionResult = response.getResult();

      assertNotNull(prestoEngineCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListPrestoEngines" })
  public void testCreatePrestoEngine() throws Exception {
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

      CreatePrestoEngineOptions createPrestoEngineOptions = new CreatePrestoEngineOptions.Builder()
        .origin("native")
        .type("presto")
        .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .description("presto engine for running sql queries")
        .engineDetails(engineDetailsBodyModel)
        .engineDisplayName("sampleEngine")
        .region("us-south")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .version("1.2.3")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngine> response = service.createPrestoEngine(createPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PrestoEngine prestoEngineResult = response.getResult();

      assertNotNull(prestoEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreatePrestoEngine" })
  public void testGetPrestoEngine() throws Exception {
    try {
      GetPrestoEngineOptions getPrestoEngineOptions = new GetPrestoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngine> response = service.getPrestoEngine(getPrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngine prestoEngineResult = response.getResult();

      assertNotNull(prestoEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPrestoEngine" })
  public void testUpdatePrestoEngine() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdatePrestoEngineOptions updatePrestoEngineOptions = new UpdatePrestoEngineOptions.Builder()
        .engineId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PrestoEngine> response = service.updatePrestoEngine(updatePrestoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PrestoEngine prestoEngineResult = response.getResult();

      assertNotNull(prestoEngineResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdatePrestoEngine" })
  public void testListPrestoEngineCatalogs() throws Exception {
    try {
      ListPrestoEngineCatalogsOptions listPrestoEngineCatalogsOptions = new ListPrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.listPrestoEngineCatalogs(listPrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();

      assertNotNull(catalogCollectionResult);
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
      Response<CatalogCollection> response = service.replacePrestoEngineCatalogs(replacePrestoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CatalogCollection catalogCollectionResult = response.getResult();

      assertNotNull(catalogCollectionResult);
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
      Response<Catalog> response = service.getPrestoEngineCatalog(getPrestoEngineCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();

      assertNotNull(catalogResult);
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
      Response<SparkEngineCollection> response = service.listSparkEngines(listSparkEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineCollection sparkEngineCollectionResult = response.getResult();

      assertNotNull(sparkEngineCollectionResult);
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
        .origin("external")
        .type("spark")
        .description("spark engine description")
        .engineDetails(sparkEngineDetailsPrototypeModel)
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SparkEngine> response = service.createSparkEngine(createSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SparkEngine sparkEngineResult = response.getResult();

      assertNotNull(sparkEngineResult);
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
      Response<SparkEngine> response = service.updateSparkEngine(updateSparkEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngine sparkEngineResult = response.getResult();

      assertNotNull(sparkEngineResult);
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
      Response<SparkEngineApplicationStatusCollection> response = service.listSparkEngineApplications(listSparkEngineApplicationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationStatusCollection sparkEngineApplicationStatusCollectionResult = response.getResult();

      assertNotNull(sparkEngineApplicationStatusCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListSparkEngineApplications" })
  public void testCreateSparkEngineApplication() throws Exception {
    try {
      SparkApplicationDetailsConf sparkApplicationDetailsConfModel = new SparkApplicationDetailsConf.Builder()
        .sparkAppName("MyJob")
        .sparkHiveMetastoreClientAuthMode("PLAIN")
        .sparkHiveMetastoreClientPlainPassword("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9...")
        .sparkHiveMetastoreClientPlainUsername("ibm_lh_token_admin")
        .sparkHiveMetastoreTruststorePassword("changeit")
        .sparkHiveMetastoreTruststorePath("file:///opt/ibm/jdk/lib/security/cacerts")
        .sparkHiveMetastoreTruststoreType("JKS")
        .sparkHiveMetastoreUseSsl("true")
        .sparkSqlCatalogImplementation("Spark Catalog Implementation")
        .sparkSqlCatalogLakehouse("org.apache.iceberg.spark.SparkCatalog")
        .sparkSqlCatalogLakehouseType("Spark Catalog Type")
        .sparkSqlCatalogLakehouseUri("Spark Catalog URI")
        .sparkSqlExtensions("org.apache.iceberg.spark.extensions.IcebergSparkSessionExtensions")
        .sparkSqlIcebergVectorizationEnabled("false")
        .build();

      SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
        .application("s3://mybucket/wordcount.py")
        .arguments(java.util.Arrays.asList("people.txt"))
        .conf(sparkApplicationDetailsConfModel)
        .env(java.util.Collections.singletonMap("anyKey", "anyValue"))
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
      Response<SparkEngineApplicationStatus> response = service.createSparkEngineApplication(createSparkEngineApplicationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SparkEngineApplicationStatus sparkEngineApplicationStatusResult = response.getResult();

      assertNotNull(sparkEngineApplicationStatusResult);
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
      Response<SparkEngineApplicationStatus> response = service.getSparkEngineApplicationStatus(getSparkEngineApplicationStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SparkEngineApplicationStatus sparkEngineApplicationStatusResult = response.getResult();

      assertNotNull(sparkEngineApplicationStatusResult);
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
      Response<CatalogCollection> response = service.listCatalogs(listCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogCollection catalogCollectionResult = response.getResult();

      assertNotNull(catalogCollectionResult);
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
      Response<Catalog> response = service.getCatalog(getCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Catalog catalogResult = response.getResult();

      assertNotNull(catalogResult);
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
      Response<TableCollection> response = service.listTables(listTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableCollection tableCollectionResult = response.getResult();

      assertNotNull(tableCollectionResult);
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
      Response<Table> response = service.getTable(getTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Table tableResult = response.getResult();

      assertNotNull(tableResult);
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
      Response<Table> response = service.updateTable(updateTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Table tableResult = response.getResult();

      assertNotNull(tableResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateTable" })
  public void testListColumns() throws Exception {
    try {
      ListColumnsOptions listColumnsOptions = new ListColumnsOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ColumnCollection> response = service.listColumns(listColumnsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ColumnCollection columnCollectionResult = response.getResult();

      assertNotNull(columnCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListColumns" })
  public void testCreateColumns() throws Exception {
    try {
      Column columnModel = new Column.Builder()
        .columnName("expenses")
        .comment("expenses column")
        .extra("varchar")
        .length("30")
        .scale("2")
        .type("varchar")
        .build();

      CreateColumnsOptions createColumnsOptions = new CreateColumnsOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .columns(java.util.Arrays.asList(columnModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ColumnCollection> response = service.createColumns(createColumnsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ColumnCollection columnCollectionResult = response.getResult();

      assertNotNull(columnCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateColumns" })
  public void testUpdateColumn() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateColumnOptions updateColumnOptions = new UpdateColumnOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .columnId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Column> response = service.updateColumn(updateColumnOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Column columnResult = response.getResult();

      assertNotNull(columnResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateColumn" })
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
      Response<TableSnapshotCollection> response = service.listTableSnapshots(listTableSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableSnapshotCollection tableSnapshotCollectionResult = response.getResult();

      assertNotNull(tableSnapshotCollectionResult);
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
  public void testListMilvusServices() throws Exception {
    try {
      ListMilvusServicesOptions listMilvusServicesOptions = new ListMilvusServicesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusServiceCollection> response = service.listMilvusServices(listMilvusServicesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusServiceCollection milvusServiceCollectionResult = response.getResult();

      assertNotNull(milvusServiceCollectionResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMilvusServices" })
  public void testCreateMilvusService() throws Exception {
    try {
      CreateMilvusServiceOptions createMilvusServiceOptions = new CreateMilvusServiceOptions.Builder()
        .origin("native")
        .type("milvus")
        .description("milvus service for running sql queries")
        .serviceDisplayName("sampleService")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.createMilvusService(createMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      MilvusService milvusServiceResult = response.getResult();

      assertNotNull(milvusServiceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMilvusService" })
  public void testGetMilvusService() throws Exception {
    try {
      GetMilvusServiceOptions getMilvusServiceOptions = new GetMilvusServiceOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.getMilvusService(getMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusService milvusServiceResult = response.getResult();

      assertNotNull(milvusServiceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMilvusService" })
  public void testUpdateMilvusService() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateMilvusServiceOptions updateMilvusServiceOptions = new UpdateMilvusServiceOptions.Builder()
        .serviceId("testString")
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<MilvusService> response = service.updateMilvusService(updateMilvusServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MilvusService milvusServiceResult = response.getResult();

      assertNotNull(milvusServiceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateMilvusService" })
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
  public void testDeletePrestissimoEngine() throws Exception {
    try {
      DeletePrestissimoEngineOptions deletePrestissimoEngineOptions = new DeletePrestissimoEngineOptions.Builder()
        .engineId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrestissimoEngine(deletePrestissimoEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrestissimoEngine" })
  public void testDeletePrestissimoEngineCatalogs() throws Exception {
    try {
      DeletePrestissimoEngineCatalogsOptions deletePrestissimoEngineCatalogsOptions = new DeletePrestissimoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deletePrestissimoEngineCatalogs(deletePrestissimoEngineCatalogsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeletePrestissimoEngineCatalogs" })
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

  @Test(dependsOnMethods = { "testDeleteTable" })
  public void testDeleteColumn() throws Exception {
    try {
      DeleteColumnOptions deleteColumnOptions = new DeleteColumnOptions.Builder()
        .engineId("testString")
        .catalogId("testString")
        .schemaId("testString")
        .tableId("testString")
        .columnId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteColumn(deleteColumnOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteColumn" })
  public void testDeleteMilvusService() throws Exception {
    try {
      DeleteMilvusServiceOptions deleteMilvusServiceOptions = new DeleteMilvusServiceOptions.Builder()
        .serviceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteMilvusService(deleteMilvusServiceOptions).execute();
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
