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
import com.ibm.cloud.watsonx_data.test.SdkIntegrationTestBase;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogEngineResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogSyncMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ColumnsCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CoordinatorNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeletePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Driver;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Endpoint;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EndpointCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetAllColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogEngineAssociationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetEndpointsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetInstanceConfigurationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetMdsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetPrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetTableDetailsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.InstanceResourceEndpoint;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.JdbcThriftUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.JsonPatchOperation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListAllSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListAllTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestissimoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestissimoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListPrestoEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListStorageRegistrationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MDSRestUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MDSService;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Mds;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MdsConnectionInfo;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoCoordinatorNodeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoWorkerNodeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RegisterTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Resource;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceGroupForEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaResponseSummary;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemasCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageCatalogPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistrationCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessReadyResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Table;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableColumDetail;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableColumDetailColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TablePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableResponseCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TableResponseSummary;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateMdsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.WatsonxInstanceDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.WorkerNodeDescriptionBody;
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
      PrestissimoCoordinatorNodeDetails prestissimoCoordinatorNodeDetailsModel = new PrestissimoCoordinatorNodeDetails.Builder()
        .nodeType("starter")
        .quantity(Long.valueOf("1"))
        .build();

      PrestissimoWorkerNodeDetails prestissimoWorkerNodeDetailsModel = new PrestissimoWorkerNodeDetails.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("1"))
        .build();

      PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
        .coordinator(prestissimoCoordinatorNodeDetailsModel)
        .sizeConfig("starter")
        .worker(prestissimoWorkerNodeDetailsModel)
        .build();

      CreatePrestissimoEngineOptions createPrestissimoEngineOptions = new CreatePrestissimoEngineOptions.Builder()
        .configuration(prestissimoEngineDetailsModel)
        .displayName("sampleEngine")
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("hive_data"))
        .description("prestissimo engine description")
        .id("sampleEngine123")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
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
        .id("testString")
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
      PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      PrestissimoEnginePropertiesConfiguration prestissimoEnginePropertiesConfigurationModel = new PrestissimoEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      PrestissimoEnginePropertiesJvm prestissimoEnginePropertiesJvmModel = new PrestissimoEnginePropertiesJvm.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      PrestissimoEnginePropertiesLogConfig prestissimoEnginePropertiesLogConfigModel = new PrestissimoEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      PrestissimoEngineProperties prestissimoEnginePropertiesModel = new PrestissimoEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(prestissimoEnginePropertiesConfigurationModel)
        .global(java.util.Collections.singletonMap("key1", "testString"))
        .jvm(prestissimoEnginePropertiesJvmModel)
        .logConfig(prestissimoEnginePropertiesLogConfigModel)
        .optimizerProperties(java.util.Collections.singletonMap("key1", "testString"))
        .velox(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      RemovePrestissimoEnginePropertiesCatalogAdditionalProperties removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new RemovePrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEnginePropertiesConfiguration removePrestissimoEnginePropertiesConfigurationModel = new RemovePrestissimoEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEnginePropertiesJvm removePrestissimoEnginePropertiesJvmModel = new RemovePrestissimoEnginePropertiesJvm.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEnginePropertiesLogConfig removePrestissimoEnginePropertiesLogConfigModel = new RemovePrestissimoEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Arrays.asList("testString"))
        .worker(java.util.Arrays.asList("testString"))
        .build();

      RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModel = new RemovePrestissimoEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(removePrestissimoEnginePropertiesConfigurationModel)
        .global(java.util.Arrays.asList("testString"))
        .jvm(removePrestissimoEnginePropertiesJvmModel)
        .logConfig(removePrestissimoEnginePropertiesLogConfigModel)
        .optimizerProperties(java.util.Arrays.asList("testString"))
        .velox(java.util.Arrays.asList("testString"))
        .build();

      PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
        .description("updated description for prestissimo engine")
        .displayName("sampleEngine")
        .xProperties(prestissimoEnginePropertiesModel)
        .removeEngineProperties(removePrestissimoEnginePropertiesModel)
        .restartType("force")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> prestissimoEnginePatchModelAsPatch = prestissimoEnginePatchModel.asPatch();

      UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions = new UpdatePrestissimoEngineOptions.Builder()
        .id("testString")
        .body(prestissimoEnginePatchModelAsPatch)
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
        .id("testString")
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
  public void testCreatePrestissimoEngineCatalogs() throws Exception {
    try {
      CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptions = new CreatePrestissimoEngineCatalogsOptions.Builder()
        .id("testString")
        .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.createPrestissimoEngineCatalogs(createPrestissimoEngineCatalogsOptions).execute();
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

  @Test(dependsOnMethods = { "testCreatePrestissimoEngineCatalogs" })
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
      CoordinatorNodeDescriptionBody coordinatorNodeDescriptionBodyModel = new CoordinatorNodeDescriptionBody.Builder()
        .nodeType("starter")
        .quantity(Long.valueOf("1"))
        .build();

      WorkerNodeDescriptionBody workerNodeDescriptionBodyModel = new WorkerNodeDescriptionBody.Builder()
        .nodeType("starter")
        .quantity(Long.valueOf("1"))
        .build();

      EngineDetails engineDetailsModel = new EngineDetails.Builder()
        .coordinator(coordinatorNodeDescriptionBodyModel)
        .sizeConfig("starter")
        .worker(workerNodeDescriptionBodyModel)
        .build();

      CreatePrestoEngineOptions createPrestoEngineOptions = new CreatePrestoEngineOptions.Builder()
        .configuration(engineDetailsModel)
        .displayName("sampleEngine")
        .origin("native")
        .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
        .description("presto engine for running sql queries")
        .id("sampleEngine123")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
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
  public void testCreatePrestoEngineCatalogs() throws Exception {
    try {
      CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptions = new CreatePrestoEngineCatalogsOptions.Builder()
        .engineId("testString")
        .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogCollection> response = service.createPrestoEngineCatalogs(createPrestoEngineCatalogsOptions).execute();
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

  @Test(dependsOnMethods = { "testCreatePrestoEngineCatalogs" })
  public void testGetPrestoEngine() throws Exception {
    try {
      GetPrestoEngineOptions getPrestoEngineOptions = new GetPrestoEngineOptions.Builder()
        .id("testString")
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
      EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      EnginePropertiesConfiguration enginePropertiesConfigurationModel = new EnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
        .build();

      EnginePropertiesJvm enginePropertiesJvmModel = new EnginePropertiesJvm.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
        .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
        .build();

      EnginePropertiesLogConfig enginePropertiesLogConfigModel = new EnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Collections.singletonMap("key1", "testString"))
        .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
        .build();

      EngineProperties enginePropertiesModel = new EngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(enginePropertiesConfigurationModel)
        .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
        .global(java.util.Collections.singletonMap("key1", "global_property_value"))
        .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
        .jvm(enginePropertiesJvmModel)
        .logConfig(enginePropertiesLogConfigModel)
        .build();

      RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalPropertiesModel = new RemoveEnginePropertiesCatalogAdditionalProperties.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEnginePropertiesJvm removeEnginePropertiesJvmModel = new RemoveEnginePropertiesJvm.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
        .coordinator(java.util.Arrays.asList("property_name"))
        .worker(java.util.Arrays.asList("property_name"))
        .build();

      RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
        .catalog(java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel))
        .configuration(removeEnginePropertiesConfigurationModel)
        .eventListener(java.util.Arrays.asList("property_name"))
        .global(java.util.Arrays.asList("property_name"))
        .jmxExporterConfig(java.util.Arrays.asList("testString"))
        .jvm(removeEnginePropertiesJvmModel)
        .logConfig(removeEnginePropertiesLogConfigModel)
        .build();

      PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
        .description("updated description for presto engine")
        .displayName("sampleEngine")
        .xProperties(enginePropertiesModel)
        .removeEngineProperties(removeEnginePropertiesModel)
        .restartType("force")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .build();
      Map<String, Object> prestoEnginePatchModelAsPatch = prestoEnginePatchModel.asPatch();

      UpdatePrestoEngineOptions updatePrestoEngineOptions = new UpdatePrestoEngineOptions.Builder()
        .id("testString")
        .body(prestoEnginePatchModelAsPatch)
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
  public void testTestLhConsole() throws Exception {
    try {
      TestLHConsoleOptions testLhConsoleOptions = new TestLHConsoleOptions();

      // Invoke operation
      Response<SuccessReadyResponse> response = service.testLHConsole(testLhConsoleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessReadyResponse successReadyResponseResult = response.getResult();
      assertNotNull(successReadyResponseResult);

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
        .secret("testString")
        .defaultCatalogs(false)
        .view("testString")
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
  public void testGetCatalogEngineAssociation() throws Exception {
    try {
      GetCatalogEngineAssociationOptions getCatalogEngineAssociationOptions = new GetCatalogEngineAssociationOptions.Builder()
        .catalogName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CatalogEngineResponse> response = service.getCatalogEngineAssociation(getCatalogEngineAssociationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CatalogEngineResponse catalogEngineResponseResult = response.getResult();
      assertNotNull(catalogEngineResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetCatalogEngineAssociation" })
  public void testListTables() throws Exception {
    try {
      ListTablesOptions listTablesOptions = new ListTablesOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
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
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .engineId("testString")
        .type("testString")
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
      TablePatch tablePatchModel = new TablePatch.Builder()
        .name("updated_table_name")
        .build();
      Map<String, Object> tablePatchModelAsPatch = tablePatchModel.asPatch();

      UpdateTableOptions updateTableOptions = new UpdateTableOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .engineId("testString")
        .body(tablePatchModelAsPatch)
        .type("testString")
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
  public void testListSchemas() throws Exception {
    try {
      ListSchemasOptions listSchemasOptions = new ListSchemasOptions.Builder()
        .engineId("testString")
        .id("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemasCollection> response = service.listSchemas(listSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchemasCollection schemasCollectionResult = response.getResult();
      assertNotNull(schemasCollectionResult);

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
        .id("testString")
        .customPath("sample-path")
        .name("SampleSchema1")
        .hostname("db2@hostname.com")
        .port(Long.valueOf("4553"))
        .storageName("sample-bucket")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemaPrototype> response = service.createSchema(createSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SchemaPrototype schemaPrototypeResult = response.getResult();
      assertNotNull(schemaPrototypeResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSchema" })
  public void testGetCatalog() throws Exception {
    try {
      GetCatalogOptions getCatalogOptions = new GetCatalogOptions.Builder()
        .name("testString")
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
  public void testGetMds() throws Exception {
    try {
      GetMdsOptions getMdsOptions = new GetMdsOptions.Builder()
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Mds> response = service.getMds(getMdsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Mds mdsResult = response.getResult();
      assertNotNull(mdsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMds" })
  public void testUpdateMds() throws Exception {
    try {
      JsonPatchOperation jsonPatchOperationModel = new JsonPatchOperation.Builder()
        .op("add")
        .path("testString")
        .from("testString")
        .value("testString")
        .build();

      UpdateMdsOptions updateMdsOptions = new UpdateMdsOptions.Builder()
        .body(java.util.Arrays.asList(jsonPatchOperationModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Mds> response = service.updateMds(updateMdsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Mds mdsResult = response.getResult();
      assertNotNull(mdsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateMds" })
  public void testGetInstanceConfiguration() throws Exception {
    try {
      GetInstanceConfigurationOptions getInstanceConfigurationOptions = new GetInstanceConfigurationOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<WatsonxInstanceDetails> response = service.getInstanceConfiguration(getInstanceConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WatsonxInstanceDetails watsonxInstanceDetailsResult = response.getResult();
      assertNotNull(watsonxInstanceDetailsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetInstanceConfiguration" })
  public void testGetEndpoints() throws Exception {
    try {
      GetEndpointsOptions getEndpointsOptions = new GetEndpointsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<EndpointCollection> response = service.getEndpoints(getEndpointsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EndpointCollection endpointCollectionResult = response.getResult();
      assertNotNull(endpointCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEndpoints" })
  public void testRegisterTable() throws Exception {
    try {
      RegisterTableOptions registerTableOptions = new RegisterTableOptions.Builder()
        .catalogId("testString")
        .schemaId("testString")
        .metadataLocation("s3a://storagename/path/to/table/metadata_location/_delta_log")
        .tableName("table1")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RegisterTableCreatedBody> response = service.registerTable(registerTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RegisterTableCreatedBody registerTableCreatedBodyResult = response.getResult();
      assertNotNull(registerTableCreatedBodyResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRegisterTable" })
  public void testGetAllColumns() throws Exception {
    try {
      GetAllColumnsOptions getAllColumnsOptions = new GetAllColumnsOptions.Builder()
        .catalogName("testString")
        .tableName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ColumnsCollection> response = service.getAllColumns(getAllColumnsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ColumnsCollection columnsCollectionResult = response.getResult();
      assertNotNull(columnsCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllColumns" })
  public void testListAllSchemas() throws Exception {
    try {
      ListAllSchemasOptions listAllSchemasOptions = new ListAllSchemasOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SchemaResponseCollection> response = service.listAllSchemas(listAllSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SchemaResponseCollection schemaResponseCollectionResult = response.getResult();
      assertNotNull(schemaResponseCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAllSchemas" })
  public void testListAllTables() throws Exception {
    try {
      ListAllTablesOptions listAllTablesOptions = new ListAllTablesOptions.Builder()
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TableResponseCollection> response = service.listAllTables(listAllTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableResponseCollection tableResponseCollectionResult = response.getResult();
      assertNotNull(tableResponseCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListAllTables" })
  public void testGetTableDetails() throws Exception {
    try {
      GetTableDetailsOptions getTableDetailsOptions = new GetTableDetailsOptions.Builder()
        .tableName("testString")
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<TableResponse> response = service.getTableDetails(getTableDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      TableResponse tableResponseResult = response.getResult();
      assertNotNull(tableResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetTableDetails" })
  public void testListStorageRegistrations() throws Exception {
    try {
      ListStorageRegistrationsOptions listStorageRegistrationsOptions = new ListStorageRegistrationsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<StorageRegistrationCollection> response = service.listStorageRegistrations(listStorageRegistrationsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageRegistrationCollection storageRegistrationCollectionResult = response.getResult();
      assertNotNull(storageRegistrationCollectionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListStorageRegistrations" })
  public void testCreateStorageRegistration() throws Exception {
    try {
      StorageCatalogPrototype storageCatalogPrototypeModel = new StorageCatalogPrototype.Builder()
        .basePath("/abc/def")
        .catalogName("sampleCatalog")
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .catalogType("iceberg")
        .build();

      SecretDetails secretDetailsModel = new SecretDetails.Builder()
        .key("secret key")
        .secretName("secret name")
        .secretUrn("secret urn")
        .build();

      StorageDetails storageDetailsModel = new StorageDetails.Builder()
        .accessKey("<access_key>")
        .accessKeyVault(secretDetailsModel)
        .accountName("sample-storage")
        .applicationId("application-id")
        .authMode("iam")
        .containerName("sample-container")
        .directoryId("directory-id")
        .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
        .keyFile("key_file")
        .mrapArn("arn:aws:s3::123456789012:accesspoint/mrap/mrapName")
        .name("sample-storage")
        .provider("ibm-cos")
        .region("us-south")
        .roleArn("arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9")
        .sasToken("<sas-token>")
        .secretKey("secret_key")
        .secretKeyVault(secretDetailsModel)
        .vaultEnabled(true)
        .build();

      CreateStorageRegistrationOptions createStorageRegistrationOptions = new CreateStorageRegistrationOptions.Builder()
        .description("COS storage for customer data")
        .displayName("sample-storage-displayname")
        .managedBy("ibm")
        .type("ibm_cos")
        .associatedCatalog(storageCatalogPrototypeModel)
        .connection(storageDetailsModel)
        .region("us-south")
        .storageUse("qhmm")
        .tags(java.util.Arrays.asList("storage-tag1", "storage-tag2"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<StorageRegistration> response = service.createStorageRegistration(createStorageRegistrationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      StorageRegistration storageRegistrationResult = response.getResult();
      assertNotNull(storageRegistrationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateStorageRegistration" })
  public void testDeletePrestissimoEngine() throws Exception {
    try {
      DeletePrestissimoEngineOptions deletePrestissimoEngineOptions = new DeletePrestissimoEngineOptions.Builder()
        .id("testString")
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
        .id("testString")
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
  public void testDeleteEngine() throws Exception {
    try {
      DeleteEngineOptions deleteEngineOptions = new DeleteEngineOptions.Builder()
        .id("testString")
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
  public void testDeleteSchema() throws Exception {
    try {
      DeleteSchemaOptions deleteSchemaOptions = new DeleteSchemaOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
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
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .engineId("testString")
        .type("testString")
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
  public void testDeleteCatalog() throws Exception {
    try {
      DeleteCatalogOptions deleteCatalogOptions = new DeleteCatalogOptions.Builder()
        .name("testString")
        .skipMdsCall(false)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteCatalog(deleteCatalogOptions).execute();
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
