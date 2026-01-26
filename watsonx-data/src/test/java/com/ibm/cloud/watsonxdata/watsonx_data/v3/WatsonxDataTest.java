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

  // Test the listPrestissimoEngines operation with a valid options model parameter
  @Test
  public void testListPrestissimoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"prestissimo_engines\": [{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}]}";
    String listPrestissimoEnginesPath = "/prestissimo_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestissimoEnginesOptions model
    ListPrestissimoEnginesOptions listPrestissimoEnginesOptionsModel = new ListPrestissimoEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listPrestissimoEngines() with a valid options model and verify the result
    Response<PrestissimoEngineCollection> response = watsonxDataService.listPrestissimoEngines(listPrestissimoEnginesOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngineCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestissimoEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestissimoEngines operation with and without retries enabled
  @Test
  public void testListPrestissimoEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestissimoEnginesWOptions();

    watsonxDataService.disableRetries();
    testListPrestissimoEnginesWOptions();
  }

  // Test the createPrestissimoEngine operation with a valid options model parameter
  @Test
  public void testCreatePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String createPrestissimoEnginePath = "/prestissimo_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PrestissimoCoordinatorNodeDetails model
    PrestissimoCoordinatorNodeDetails prestissimoCoordinatorNodeDetailsModel = new PrestissimoCoordinatorNodeDetails.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the PrestissimoWorkerNodeDetails model
    PrestissimoWorkerNodeDetails prestissimoWorkerNodeDetailsModel = new PrestissimoWorkerNodeDetails.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the PrestissimoEngineDetails model
    PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
      .coordinator(prestissimoCoordinatorNodeDetailsModel)
      .sizeConfig("starter")
      .worker(prestissimoWorkerNodeDetailsModel)
      .build();

    // Construct an instance of the CreatePrestissimoEngineOptions model
    CreatePrestissimoEngineOptions createPrestissimoEngineOptionsModel = new CreatePrestissimoEngineOptions.Builder()
      .configuration(prestissimoEngineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("hive_data"))
      .description("prestissimo engine description")
      .id("sampleEngine123")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestissimoEngine() with a valid options model and verify the result
    Response<PrestissimoEngine> response = watsonxDataService.createPrestissimoEngine(createPrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestissimoEngine operation with and without retries enabled
  @Test
  public void testCreatePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestissimoEngineWOptions();
  }

  // Test the createPrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestissimoEngine(null).execute();
  }

  // Test the getPrestissimoEngine operation with a valid options model parameter
  @Test
  public void testGetPrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String getPrestissimoEnginePath = "/prestissimo_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestissimoEngineOptions model
    GetPrestissimoEngineOptions getPrestissimoEngineOptionsModel = new GetPrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestissimoEngine() with a valid options model and verify the result
    Response<PrestissimoEngine> response = watsonxDataService.getPrestissimoEngine(getPrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPrestissimoEngine operation with and without retries enabled
  @Test
  public void testGetPrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testGetPrestissimoEngineWOptions();
  }

  // Test the getPrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetPrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getPrestissimoEngine(null).execute();
  }

  // Test the deletePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testDeletePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePrestissimoEnginePath = "/prestissimo_engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePrestissimoEngineOptions model
    DeletePrestissimoEngineOptions deletePrestissimoEngineOptionsModel = new DeletePrestissimoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deletePrestissimoEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deletePrestissimoEngine(deletePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deletePrestissimoEngine operation with and without retries enabled
  @Test
  public void testDeletePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeletePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testDeletePrestissimoEngineWOptions();
  }

  // Test the deletePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deletePrestissimoEngine(null).execute();
  }

  // Test the updatePrestissimoEngine operation with a valid options model parameter
  @Test
  public void testUpdatePrestissimoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"analyze_status\": \"not_started\", \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"created_at\": 0, \"created_by\": \"<username>@<domain>.com\", \"description\": \"prestissimo engine for running sql queries\", \"display_name\": \"sampleEngine\", \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"xyz-prestissimo-01-prestissimo-svc\", \"id\": \"prestissimo\", \"is_qhmm_engine\": true, \"last_time_analyzed\": \"not_started\", \"optimizer_enabled\": \"false\", \"origin\": \"native\", \"port\": 0, \"properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"global\": {\"mapKey\": \"inner\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"inner\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"inner\"}}, \"optimizer_properties\": {\"mapKey\": \"inner\"}, \"velox\": {\"mapKey\": \"inner\"}}, \"query_status\": \"completed\", \"region\": \"us-south\", \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 0, \"tags\": [\"tags\"], \"type\": \"prestissimo\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String updatePrestissimoEnginePath = "/prestissimo_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PrestissimoEnginePropertiesCatalogAdditionalProperties model
    PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesConfiguration model
    PrestissimoEnginePropertiesConfiguration prestissimoEnginePropertiesConfigurationModel = new PrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesJvm model
    PrestissimoEnginePropertiesJvm prestissimoEnginePropertiesJvmModel = new PrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePropertiesLogConfig model
    PrestissimoEnginePropertiesLogConfig prestissimoEnginePropertiesLogConfigModel = new PrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the PrestissimoEngineProperties model
    PrestissimoEngineProperties prestissimoEnginePropertiesModel = new PrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(prestissimoEnginePropertiesConfigurationModel)
      .global(java.util.Collections.singletonMap("key1", "testString"))
      .jvm(prestissimoEnginePropertiesJvmModel)
      .logConfig(prestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Collections.singletonMap("key1", "testString"))
      .velox(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesCatalogAdditionalProperties model
    RemovePrestissimoEnginePropertiesCatalogAdditionalProperties removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new RemovePrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesConfiguration model
    RemovePrestissimoEnginePropertiesConfiguration removePrestissimoEnginePropertiesConfigurationModel = new RemovePrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesJvm model
    RemovePrestissimoEnginePropertiesJvm removePrestissimoEnginePropertiesJvmModel = new RemovePrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEnginePropertiesLogConfig model
    RemovePrestissimoEnginePropertiesLogConfig removePrestissimoEnginePropertiesLogConfigModel = new RemovePrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RemovePrestissimoEngineProperties model
    RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModel = new RemovePrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removePrestissimoEnginePropertiesConfigurationModel)
      .global(java.util.Arrays.asList("testString"))
      .jvm(removePrestissimoEnginePropertiesJvmModel)
      .logConfig(removePrestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Arrays.asList("testString"))
      .velox(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the PrestissimoEnginePatch model
    PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
      .description("updated description for prestissimo engine")
      .displayName("sampleEngine")
      .xProperties(prestissimoEnginePropertiesModel)
      .removeEngineProperties(removePrestissimoEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> prestissimoEnginePatchModelAsPatch = prestissimoEnginePatchModel.asPatch();

    // Construct an instance of the UpdatePrestissimoEngineOptions model
    UpdatePrestissimoEngineOptions updatePrestissimoEngineOptionsModel = new UpdatePrestissimoEngineOptions.Builder()
      .id("testString")
      .body(prestissimoEnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updatePrestissimoEngine() with a valid options model and verify the result
    Response<PrestissimoEngine> response = watsonxDataService.updatePrestissimoEngine(updatePrestissimoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestissimoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrestissimoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrestissimoEngine operation with and without retries enabled
  @Test
  public void testUpdatePrestissimoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdatePrestissimoEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdatePrestissimoEngineWOptions();
  }

  // Test the updatePrestissimoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestissimoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updatePrestissimoEngine(null).execute();
  }

  // Test the listPrestissimoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListPrestissimoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String listPrestissimoEngineCatalogsPath = "/prestissimo_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListPrestissimoEngineCatalogsOptions model
    ListPrestissimoEngineCatalogsOptions listPrestissimoEngineCatalogsOptionsModel = new ListPrestissimoEngineCatalogsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listPrestissimoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.listPrestissimoEngineCatalogs(listPrestissimoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listPrestissimoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listPrestissimoEngineCatalogs operation with and without retries enabled
  @Test
  public void testListPrestissimoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListPrestissimoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListPrestissimoEngineCatalogsWOptions();
  }

  // Test the listPrestissimoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPrestissimoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listPrestissimoEngineCatalogs(null).execute();
  }

  // Test the createPrestissimoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testCreatePrestissimoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String createPrestissimoEngineCatalogsPath = "/prestissimo_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePrestissimoEngineCatalogsOptions model
    CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptionsModel = new CreatePrestissimoEngineCatalogsOptions.Builder()
      .id("testString")
      .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestissimoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.createPrestissimoEngineCatalogs(createPrestissimoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestissimoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestissimoEngineCatalogs operation with and without retries enabled
  @Test
  public void testCreatePrestissimoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestissimoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestissimoEngineCatalogsWOptions();
  }

  // Test the createPrestissimoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestissimoEngineCatalogs(null).execute();
  }

  // Test the deletePrestissimoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testDeletePrestissimoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deletePrestissimoEngineCatalogsPath = "/prestissimo_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeletePrestissimoEngineCatalogsOptions model
    DeletePrestissimoEngineCatalogsOptions deletePrestissimoEngineCatalogsOptionsModel = new DeletePrestissimoEngineCatalogsOptions.Builder()
      .id("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deletePrestissimoEngineCatalogs() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deletePrestissimoEngineCatalogs(deletePrestissimoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrestissimoEngineCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_names"), "testString");
  }

  // Test the deletePrestissimoEngineCatalogs operation with and without retries enabled
  @Test
  public void testDeletePrestissimoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeletePrestissimoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testDeletePrestissimoEngineCatalogsWOptions();
  }

  // Test the deletePrestissimoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeletePrestissimoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deletePrestissimoEngineCatalogs(null).execute();
  }

  // Test the listPrestoEngines operation with a valid options model parameter
  @Test
  public void testListPrestoEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"presto_engines\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}]}";
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
    Response<PrestoEngineCollection> response = watsonxDataService.listPrestoEngines(listPrestoEnginesOptionsModel).execute();
    assertNotNull(response);
    PrestoEngineCollection responseObj = response.getResult();
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

  // Test the createPrestoEngine operation with a valid options model parameter
  @Test
  public void testCreatePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String createPrestoEnginePath = "/presto_engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CoordinatorNodeDescriptionBody model
    CoordinatorNodeDescriptionBody coordinatorNodeDescriptionBodyModel = new CoordinatorNodeDescriptionBody.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the WorkerNodeDescriptionBody model
    WorkerNodeDescriptionBody workerNodeDescriptionBodyModel = new WorkerNodeDescriptionBody.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();

    // Construct an instance of the EngineDetails model
    EngineDetails engineDetailsModel = new EngineDetails.Builder()
      .coordinator(coordinatorNodeDescriptionBodyModel)
      .sizeConfig("starter")
      .worker(workerNodeDescriptionBodyModel)
      .build();

    // Construct an instance of the CreatePrestoEngineOptions model
    CreatePrestoEngineOptions createPrestoEngineOptionsModel = new CreatePrestoEngineOptions.Builder()
      .configuration(engineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("presto engine for running sql queries")
      .id("sampleEngine123")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestoEngine() with a valid options model and verify the result
    Response<PrestoEngine> response = watsonxDataService.createPrestoEngine(createPrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestoEngine operation with and without retries enabled
  @Test
  public void testCreatePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestoEngineWOptions();
  }

  // Test the createPrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestoEngine(null).execute();
  }

  // Test the listPrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testListPrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
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
    Response<CatalogCollection> response = watsonxDataService.listPrestoEngineCatalogs(listPrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
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

  // Test the createPrestoEngineCatalogs operation with a valid options model parameter
  @Test
  public void testCreatePrestoEngineCatalogsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String createPrestoEngineCatalogsPath = "/presto_engines/testString/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreatePrestoEngineCatalogsOptions model
    CreatePrestoEngineCatalogsOptions createPrestoEngineCatalogsOptionsModel = new CreatePrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames(java.util.Arrays.asList("iceberg_catalog"))
      .authInstanceId("testString")
      .build();

    // Invoke createPrestoEngineCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.createPrestoEngineCatalogs(createPrestoEngineCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrestoEngineCatalogsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createPrestoEngineCatalogs operation with and without retries enabled
  @Test
  public void testCreatePrestoEngineCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreatePrestoEngineCatalogsWOptions();

    watsonxDataService.disableRetries();
    testCreatePrestoEngineCatalogsWOptions();
  }

  // Test the createPrestoEngineCatalogs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestoEngineCatalogsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createPrestoEngineCatalogs(null).execute();
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

  // Test the getPrestoEngine operation with a valid options model parameter
  @Test
  public void testGetPrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String getPrestoEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPrestoEngineOptions model
    GetPrestoEngineOptions getPrestoEngineOptionsModel = new GetPrestoEngineOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPrestoEngine() with a valid options model and verify the result
    Response<PrestoEngine> response = watsonxDataService.getPrestoEngine(getPrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngine responseObj = response.getResult();
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
      .id("testString")
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

  // Test the updatePrestoEngine operation with a valid options model parameter
  @Test
  public void testUpdatePrestoEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"build_version\": \"1.0.3.0.0\", \"configuration\": {\"coordinator\": {\"node_type\": \"starter\", \"quantity\": 1}, \"size_config\": \"starter\", \"worker\": {\"node_type\": \"starter\", \"quantity\": 1}}, \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 1}, \"created_at\": 1, \"created_by\": \"username@domain.com\", \"description\": \"presto engine for running sql queries\", \"display_name\": \"sampleEngine\", \"drivers\": [{\"connection_type\": \"hana\", \"driver_id\": \"hanadriver123\", \"driver_name\": \"hanadriver-1.2.3\", \"driver_version\": \"1.2.3\"}], \"engine_properties\": {\"catalog\": {\"mapKey\": {\"coordinator\": {\"anyKey\": \"anyValue\"}, \"worker\": {\"anyKey\": \"anyValue\"}}}, \"configuration\": {\"coordinator\": {\"mapKey\": \"configuration_property_value\"}, \"worker\": {\"mapKey\": \"configuration_property_value\"}}, \"event_listener\": {\"mapKey\": \"event_listener_property_value\"}, \"global\": {\"mapKey\": \"global_property_value\"}, \"jmx_exporter_config\": {\"mapKey\": \"jmx_exporter_config_property_value\"}, \"jvm\": {\"coordinator\": {\"mapKey\": \"JVM_property_value\"}, \"worker\": {\"mapKey\": \"JVM_property_value\"}}, \"log_config\": {\"coordinator\": {\"mapKey\": \"inner\"}, \"worker\": {\"mapKey\": \"log_config_property_value\"}}}, \"external_host_name\": \"your-hostname.apps.your-domain.com\", \"failure_message\": \"Failed to start engine\", \"group_id\": \"new_group_id\", \"host_name\": \"ibm-lh-lakehouse-presto-01-presto-svc\", \"id\": \"sampleEngine123\", \"is_qhmm_engine\": true, \"origin\": \"native\", \"port\": 1, \"query_status\": \"completed\", \"resource_groups\": [{\"resource_group_file_name\": \"resource_group.json\", \"resource_group_id\": \"resourceGroup689\"}], \"size_config\": \"starter\", \"status\": \"running\", \"status_code\": 1, \"tags\": [\"tags\"], \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 1}}";
    String updatePrestoEnginePath = "/presto_engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EnginePropertiesCatalogAdditionalProperties model
    EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    // Construct an instance of the EnginePropertiesConfiguration model
    EnginePropertiesConfiguration enginePropertiesConfigurationModel = new EnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .build();

    // Construct an instance of the EnginePropertiesJvm model
    EnginePropertiesJvm enginePropertiesJvmModel = new EnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .build();

    // Construct an instance of the EnginePropertiesLogConfig model
    EnginePropertiesLogConfig enginePropertiesLogConfigModel = new EnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .build();

    // Construct an instance of the EngineProperties model
    EngineProperties enginePropertiesModel = new EngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(enginePropertiesConfigurationModel)
      .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
      .global(java.util.Collections.singletonMap("key1", "global_property_value"))
      .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
      .jvm(enginePropertiesJvmModel)
      .logConfig(enginePropertiesLogConfigModel)
      .build();

    // Construct an instance of the RemoveEnginePropertiesCatalogAdditionalProperties model
    RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalPropertiesModel = new RemoveEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEnginePropertiesConfiguration model
    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEnginePropertiesJvm model
    RemoveEnginePropertiesJvm removeEnginePropertiesJvmModel = new RemoveEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEnginePropertiesLogConfig model
    RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    // Construct an instance of the RemoveEngineProperties model
    RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removeEnginePropertiesConfigurationModel)
      .eventListener(java.util.Arrays.asList("property_name"))
      .global(java.util.Arrays.asList("property_name"))
      .jmxExporterConfig(java.util.Arrays.asList("testString"))
      .jvm(removeEnginePropertiesJvmModel)
      .logConfig(removeEnginePropertiesLogConfigModel)
      .build();

    // Construct an instance of the PrestoEnginePatch model
    PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
      .description("updated description for presto engine")
      .displayName("sampleEngine")
      .xProperties(enginePropertiesModel)
      .removeEngineProperties(removeEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    Map<String, Object> prestoEnginePatchModelAsPatch = prestoEnginePatchModel.asPatch();

    // Construct an instance of the UpdatePrestoEngineOptions model
    UpdatePrestoEngineOptions updatePrestoEngineOptionsModel = new UpdatePrestoEngineOptions.Builder()
      .id("testString")
      .body(prestoEnginePatchModelAsPatch)
      .authInstanceId("testString")
      .build();

    // Invoke updatePrestoEngine() with a valid options model and verify the result
    Response<PrestoEngine> response = watsonxDataService.updatePrestoEngine(updatePrestoEngineOptionsModel).execute();
    assertNotNull(response);
    PrestoEngine responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updatePrestoEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updatePrestoEngine operation with and without retries enabled
  @Test
  public void testUpdatePrestoEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdatePrestoEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdatePrestoEngineWOptions();
  }

  // Test the updatePrestoEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestoEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updatePrestoEngine(null).execute();
  }

  // Test the testLHConsole operation with a valid options model parameter
  @Test
  public void testTestLhConsoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"buildstring\": \"buildstring\", \"console_version\": \"consoleVersion\", \"message\": \"message\", \"message_code\": \"messageCode\", \"schema_version\": \"schemaVersion\"}";
    String testLHConsolePath = "/ready";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TestLHConsoleOptions model
    TestLHConsoleOptions testLhConsoleOptionsModel = new TestLHConsoleOptions();

    // Invoke testLHConsole() with a valid options model and verify the result
    Response<SuccessReadyResponse> response = watsonxDataService.testLHConsole(testLhConsoleOptionsModel).execute();
    assertNotNull(response);
    SuccessReadyResponse responseObj = response.getResult();
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
    String mockResponseBody = "{\"catalogs\": [{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}]}";
    String listCatalogsPath = "/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListCatalogsOptions model
    ListCatalogsOptions listCatalogsOptionsModel = new ListCatalogsOptions.Builder()
      .authInstanceId("testString")
      .secret("testString")
      .defaultCatalogs(false)
      .view("testString")
      .build();

    // Invoke listCatalogs() with a valid options model and verify the result
    Response<CatalogCollection> response = watsonxDataService.listCatalogs(listCatalogsOptionsModel).execute();
    assertNotNull(response);
    CatalogCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCatalogsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("default_catalogs")), Boolean.valueOf(false));
    assertEquals(query.get("view"), "testString");
  }

  // Test the listCatalogs operation with and without retries enabled
  @Test
  public void testListCatalogsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListCatalogsWOptions();

    watsonxDataService.disableRetries();
    testListCatalogsWOptions();
  }

  // Test the getCatalogEngineAssociation operation with a valid options model parameter
  @Test
  public void testGetCatalogEngineAssociationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"associated_engines\": [\"associatedEngines\"], \"catalog_name\": \"sampleCatalog\", \"catalog_type\": \"iceberg\"}";
    String getCatalogEngineAssociationPath = "/catalogs/testString/engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogEngineAssociationOptions model
    GetCatalogEngineAssociationOptions getCatalogEngineAssociationOptionsModel = new GetCatalogEngineAssociationOptions.Builder()
      .catalogName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getCatalogEngineAssociation() with a valid options model and verify the result
    Response<CatalogEngineResponse> response = watsonxDataService.getCatalogEngineAssociation(getCatalogEngineAssociationOptionsModel).execute();
    assertNotNull(response);
    CatalogEngineResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCatalogEngineAssociationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCatalogEngineAssociation operation with and without retries enabled
  @Test
  public void testGetCatalogEngineAssociationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetCatalogEngineAssociationWOptions();

    watsonxDataService.disableRetries();
    testGetCatalogEngineAssociationWOptions();
  }

  // Test the getCatalogEngineAssociation operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCatalogEngineAssociationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getCatalogEngineAssociation(null).execute();
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
      .catalogName("testString")
      .schemaName("testString")
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
    String mockResponseBody = "{\"tables\": [\"tables\"]}";
    String listTablesPath = "/catalogs/testString/schemas/testString/tables";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListTablesOptions model
    ListTablesOptions listTablesOptionsModel = new ListTablesOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .engineId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listTables() with a valid options model and verify the result
    Response<TableCollection> response = watsonxDataService.listTables(listTablesOptionsModel).execute();
    assertNotNull(response);
    TableCollection responseObj = response.getResult();
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
    String mockResponseBody = "{\"columns\": [{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}], \"name\": \"name\"}";
    String getTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTableOptions model
    GetTableOptions getTableOptionsModel = new GetTableOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .type("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTable() with a valid options model and verify the result
    Response<Table> response = watsonxDataService.getTable(getTableOptionsModel).execute();
    assertNotNull(response);
    Table responseObj = response.getResult();
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
    assertEquals(query.get("type"), "testString");
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
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .type("testString")
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
    assertEquals(query.get("type"), "testString");
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
    String mockResponseBody = "{\"columns\": [{\"comment\": \"Expenses column for each department\", \"extra\": \"AUTO_INCREMENT\", \"length\": \"30\", \"name\": \"expenses\", \"precision\": \"10\", \"scale\": \"2\", \"type\": \"varchar\"}], \"name\": \"name\"}";
    String updateTablePath = "/catalogs/testString/schemas/testString/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TablePatch model
    TablePatch tablePatchModel = new TablePatch.Builder()
      .name("updated_table_name")
      .build();
    Map<String, Object> tablePatchModelAsPatch = tablePatchModel.asPatch();

    // Construct an instance of the UpdateTableOptions model
    UpdateTableOptions updateTableOptionsModel = new UpdateTableOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .engineId("testString")
      .body(tablePatchModelAsPatch)
      .type("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateTable() with a valid options model and verify the result
    Response<Table> response = watsonxDataService.updateTable(updateTableOptionsModel).execute();
    assertNotNull(response);
    Table responseObj = response.getResult();
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
    assertEquals(query.get("type"), "testString");
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

  // Test the listSchemas operation with a valid options model parameter
  @Test
  public void testListSchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"schemas\": [\"schemas\"]}";
    String listSchemasPath = "/catalogs/testString/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListSchemasOptions model
    ListSchemasOptions listSchemasOptionsModel = new ListSchemasOptions.Builder()
      .engineId("testString")
      .id("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listSchemas() with a valid options model and verify the result
    Response<SchemasCollection> response = watsonxDataService.listSchemas(listSchemasOptionsModel).execute();
    assertNotNull(response);
    SchemasCollection responseObj = response.getResult();
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
    String mockResponseBody = "{\"custom_path\": \"sample-path\", \"hostname\": \"db2@hostname.com\", \"name\": \"SampleSchema1\", \"port\": 4553, \"storage_name\": \"sample-bucket\"}";
    String createSchemaPath = "/catalogs/testString/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSchemaOptions model
    CreateSchemaOptions createSchemaOptionsModel = new CreateSchemaOptions.Builder()
      .engineId("testString")
      .id("testString")
      .customPath("sample-path")
      .name("SampleSchema1")
      .hostname("db2@hostname.com")
      .port(Long.valueOf("4553"))
      .storageName("sample-bucket")
      .authInstanceId("testString")
      .build();

    // Invoke createSchema() with a valid options model and verify the result
    Response<SchemaPrototype> response = watsonxDataService.createSchema(createSchemaOptionsModel).execute();
    assertNotNull(response);
    SchemaPrototype responseObj = response.getResult();
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

  // Test the getCatalog operation with a valid options model parameter
  @Test
  public void testGetCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"select\"], \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"associated_storage\": [\"associatedStorage\"], \"base_path\": \"/abc/def\", \"catalog_sync_metadata\": {\"last_sync_at\": \"1602839833\", \"sync_description\": \"Table registration was successful\", \"sync_exception\": [\"syncException\"], \"sync_status\": \"SUCCESS\"}, \"created_at\": \"1602839833\", \"created_by\": \"<username>@<domain>.com\", \"days_left\": \"30\", \"description\": \"Iceberg catalog description\", \"is_gfs\": false, \"location_uri\": \"s3a://testbucket\", \"managed_by\": \"ibm\", \"mds_connection_information\": {\"external_metastore_rest_uri\": \"https://samplehost-catalog:4352\", \"external_metastore_thrift_uri\": \"https://samplehost-catalog:4352\", \"hostname\": \"example.example.lakehouse.dev.appdomain.cloud\", \"port\": \"3232\", \"rest_uri\": \"https://samplehost-catalog:4352\", \"thrift_uri\": \"thrift://samplehost-catalog:4354\"}, \"metastore\": \"glue\", \"name\": \"sampleCatalog\", \"status\": \"running\", \"tags\": [\"tags\"], \"type\": \"iceberg\"}";
    String getCatalogPath = "/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogOptions model
    GetCatalogOptions getCatalogOptionsModel = new GetCatalogOptions.Builder()
      .name("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getCatalog() with a valid options model and verify the result
    Response<Catalog> response = watsonxDataService.getCatalog(getCatalogOptionsModel).execute();
    assertNotNull(response);
    Catalog responseObj = response.getResult();
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

  // Test the deleteCatalog operation with a valid options model parameter
  @Test
  public void testDeleteCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteCatalogPath = "/catalogs/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCatalogOptions model
    DeleteCatalogOptions deleteCatalogOptionsModel = new DeleteCatalogOptions.Builder()
      .name("testString")
      .skipMdsCall(false)
      .authInstanceId("testString")
      .build();

    // Invoke deleteCatalog() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteCatalog(deleteCatalogOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCatalogPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(Boolean.valueOf(query.get("skip_mds_call")), Boolean.valueOf(false));
  }

  // Test the deleteCatalog operation with and without retries enabled
  @Test
  public void testDeleteCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteCatalogWOptions();

    watsonxDataService.disableRetries();
    testDeleteCatalogWOptions();
  }

  // Test the deleteCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteCatalog(null).execute();
  }

  // Test the getMds operation with a valid options model parameter
  @Test
  public void testGetMdsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mds_enabled\": true, \"mds_service\": {\"host_name\": \"thrift://s3.samplehostname.com\", \"https_port\": 32430, \"pg_available\": true, \"port\": 32421, \"status\": \"RUNNING\", \"status_code\": 0, \"version\": \"2.0.4.0.0\"}, \"status\": \"RUNNING\"}";
    String getMdsPath = "/configuration/mds";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMdsOptions model
    GetMdsOptions getMdsOptionsModel = new GetMdsOptions.Builder()
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getMds() with a valid options model and verify the result
    Response<Mds> response = watsonxDataService.getMds(getMdsOptionsModel).execute();
    assertNotNull(response);
    Mds responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMdsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMds operation with and without retries enabled
  @Test
  public void testGetMdsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetMdsWOptions();

    watsonxDataService.disableRetries();
    testGetMdsWOptions();
  }

  // Test the updateMds operation with a valid options model parameter
  @Test
  public void testUpdateMdsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mds_enabled\": true, \"mds_service\": {\"host_name\": \"thrift://s3.samplehostname.com\", \"https_port\": 32430, \"pg_available\": true, \"port\": 32421, \"status\": \"RUNNING\", \"status_code\": 0, \"version\": \"2.0.4.0.0\"}, \"status\": \"RUNNING\"}";
    String updateMdsPath = "/configuration/mds";
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

    // Construct an instance of the UpdateMdsOptions model
    UpdateMdsOptions updateMdsOptionsModel = new UpdateMdsOptions.Builder()
      .body(java.util.Arrays.asList(jsonPatchOperationModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateMds() with a valid options model and verify the result
    Response<Mds> response = watsonxDataService.updateMds(updateMdsOptionsModel).execute();
    assertNotNull(response);
    Mds responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMdsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMds operation with and without retries enabled
  @Test
  public void testUpdateMdsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateMdsWOptions();

    watsonxDataService.disableRetries();
    testUpdateMdsWOptions();
  }

  // Test the updateMds operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMdsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateMds(null).execute();
  }

  // Test the getInstanceConfiguration operation with a valid options model parameter
  @Test
  public void testGetInstanceConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"resources\": [{\"details\": [{\"ca_certificate\": \"sample ca certificate\", \"default_configs\": {\"mapKey\": \"configuration\"}, \"external\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"grpc_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"hostname\": \"sample hostname\", \"id\": \"sample ID\", \"instance_crn\": \"sample instance CRN\", \"instance_id\": \"sample instance ID\", \"internal\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"jdbc_class\": \"com.facebook.presto.jdbc.PrestoDriver\", \"jdbc_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"mds_rest_urls\": {\"external\": \"https://username:password@metastore1-internal-hostname:9083\", \"internal\": \"https://username:password@metastore1-internal-hostname:9083\"}, \"name\": \"sample name\", \"port\": 4553, \"proxy_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553, \"spark_engine_endpoint\": \"Spark Engine endpoint\", \"ssl_certificate\": \"sample ssl certificate\", \"thrift_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"type\": \"presto\", \"version\": \"java\", \"watsonx_data_application_endpoint\": \"sample application end point\"}], \"type\": \"presto\"}], \"watsonx_data_instance\": {\"ca_certificate\": \"sample ca certificate\", \"default_configs\": {\"mapKey\": \"configuration\"}, \"external\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"grpc_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"hostname\": \"sample hostname\", \"id\": \"sample ID\", \"instance_crn\": \"sample instance CRN\", \"instance_id\": \"sample instance ID\", \"internal\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"jdbc_class\": \"com.facebook.presto.jdbc.PrestoDriver\", \"jdbc_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"mds_rest_urls\": {\"external\": \"https://username:password@metastore1-internal-hostname:9083\", \"internal\": \"https://username:password@metastore1-internal-hostname:9083\"}, \"name\": \"sample name\", \"port\": 4553, \"proxy_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_api_endpoint\": {\"hostname\": \"sample hostname\", \"port\": 4553, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553}, \"rest_hostname\": \"sample hostname\", \"rest_port\": 4553, \"spark_engine_endpoint\": \"Spark Engine endpoint\", \"ssl_certificate\": \"sample ssl certificate\", \"thrift_urls\": {\"external\": \"thrift://username:password@metastore1-internal-hostname:9083\", \"internal\": \"thrift://username:password@metastore1-internal-hostname:9083\"}, \"type\": \"presto\", \"version\": \"java\", \"watsonx_data_application_endpoint\": \"sample application end point\"}}";
    String getInstanceConfigurationPath = "/instance_configuration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetInstanceConfigurationOptions model
    GetInstanceConfigurationOptions getInstanceConfigurationOptionsModel = new GetInstanceConfigurationOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getInstanceConfiguration() with a valid options model and verify the result
    Response<WatsonxInstanceDetails> response = watsonxDataService.getInstanceConfiguration(getInstanceConfigurationOptionsModel).execute();
    assertNotNull(response);
    WatsonxInstanceDetails responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInstanceConfigurationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getInstanceConfiguration operation with and without retries enabled
  @Test
  public void testGetInstanceConfigurationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetInstanceConfigurationWOptions();

    watsonxDataService.disableRetries();
    testGetInstanceConfigurationWOptions();
  }

  // Test the getEndpoints operation with a valid options model parameter
  @Test
  public void testGetEndpointsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"endpoints\": [{\"external_host\": \"https://cpg-svc.your-hostname.apps.your-domain.com\", \"service_status\": \"running\", \"service_type\": \"cpg\"}]}";
    String getEndpointsPath = "/endpoints";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEndpointsOptions model
    GetEndpointsOptions getEndpointsOptionsModel = new GetEndpointsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getEndpoints() with a valid options model and verify the result
    Response<EndpointCollection> response = watsonxDataService.getEndpoints(getEndpointsOptionsModel).execute();
    assertNotNull(response);
    EndpointCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEndpointsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEndpoints operation with and without retries enabled
  @Test
  public void testGetEndpointsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetEndpointsWOptions();

    watsonxDataService.disableRetries();
    testGetEndpointsWOptions();
  }

  // Test the registerTable operation with a valid options model parameter
  @Test
  public void testRegisterTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"message\": \"message\", \"message_code\": \"messageCode\"}}";
    String registerTablePath = "/catalogs/testString/schemas/testString/register";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RegisterTableOptions model
    RegisterTableOptions registerTableOptionsModel = new RegisterTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .metadataLocation("s3a://storagename/path/to/table/metadata_location/_delta_log")
      .tableName("table1")
      .authInstanceId("testString")
      .build();

    // Invoke registerTable() with a valid options model and verify the result
    Response<RegisterTableCreatedBody> response = watsonxDataService.registerTable(registerTableOptionsModel).execute();
    assertNotNull(response);
    RegisterTableCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, registerTablePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the registerTable operation with and without retries enabled
  @Test
  public void testRegisterTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRegisterTableWOptions();

    watsonxDataService.disableRetries();
    testRegisterTableWOptions();
  }

  // Test the registerTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.registerTable(null).execute();
  }

  // Test the getAllColumns operation with a valid options model parameter
  @Test
  public void testGetAllColumnsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"columns\": [{\"catalog\": \"catalog\", \"columns\": [{\"column\": \"column\", \"index\": 0, \"nullable\": true, \"precision\": 0, \"scale\": 0, \"signed\": true, \"type\": \"type\"}], \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\"}], \"count\": 3}";
    String getAllColumnsPath = "/columns";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllColumnsOptions model
    GetAllColumnsOptions getAllColumnsOptionsModel = new GetAllColumnsOptions.Builder()
      .catalogName("testString")
      .tableName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getAllColumns() with a valid options model and verify the result
    Response<ColumnsCollection> response = watsonxDataService.getAllColumns(getAllColumnsOptionsModel).execute();
    assertNotNull(response);
    ColumnsCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllColumnsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("table_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the getAllColumns operation with and without retries enabled
  @Test
  public void testGetAllColumnsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetAllColumnsWOptions();

    watsonxDataService.disableRetries();
    testGetAllColumnsWOptions();
  }

  // Test the getAllColumns operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllColumnsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getAllColumns(null).execute();
  }

  // Test the listAllSchemas operation with a valid options model parameter
  @Test
  public void testListAllSchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"count\": 3, \"message\": \"message\", \"message_code\": \"messageCode\", \"schemas\": [{\"catalog\": \"catalog\", \"catalog_type\": \"catalogType\", \"owner\": \"owner\", \"schema_name\": \"schemaName\", \"storage\": \"storage\"}]}";
    String listAllSchemasPath = "/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllSchemasOptions model
    ListAllSchemasOptions listAllSchemasOptionsModel = new ListAllSchemasOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listAllSchemas() with a valid options model and verify the result
    Response<SchemaResponseCollection> response = watsonxDataService.listAllSchemas(listAllSchemasOptionsModel).execute();
    assertNotNull(response);
    SchemaResponseCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllSchemasPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the listAllSchemas operation with and without retries enabled
  @Test
  public void testListAllSchemasWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListAllSchemasWOptions();

    watsonxDataService.disableRetries();
    testListAllSchemasWOptions();
  }

  // Test the listAllTables operation with a valid options model parameter
  @Test
  public void testListAllTablesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"count\": 3, \"message\": \"message\", \"message_code\": \"messageCode\", \"tables\": [{\"catalog\": \"catalog\", \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\"}]}";
    String listAllTablesPath = "/tables";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListAllTablesOptions model
    ListAllTablesOptions listAllTablesOptionsModel = new ListAllTablesOptions.Builder()
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke listAllTables() with a valid options model and verify the result
    Response<TableResponseCollection> response = watsonxDataService.listAllTables(listAllTablesOptionsModel).execute();
    assertNotNull(response);
    TableResponseCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAllTablesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the listAllTables operation with and without retries enabled
  @Test
  public void testListAllTablesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListAllTablesWOptions();

    watsonxDataService.disableRetries();
    testListAllTablesWOptions();
  }

  // Test the listAllTables operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListAllTablesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.listAllTables(null).execute();
  }

  // Test the getTableDetails operation with a valid options model parameter
  @Test
  public void testGetTableDetailsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog\": \"catalog\", \"message\": \"message\", \"message_code\": \"messageCode\", \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\", \"tables\": [{\"catalog\": \"catalog\", \"columns\": [{\"column\": \"column\", \"index\": 0, \"nullable\": true, \"precision\": 0, \"scale\": 0, \"signed\": true, \"type\": \"type\"}], \"owner\": \"owner\", \"schema\": \"schema\", \"storage\": \"storage\", \"table\": \"table\"}]}";
    String getTableDetailsPath = "/tables/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTableDetailsOptions model
    GetTableDetailsOptions getTableDetailsOptionsModel = new GetTableDetailsOptions.Builder()
      .tableName("testString")
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTableDetails() with a valid options model and verify the result
    Response<TableResponse> response = watsonxDataService.getTableDetails(getTableDetailsOptionsModel).execute();
    assertNotNull(response);
    TableResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTableDetailsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the getTableDetails operation with and without retries enabled
  @Test
  public void testGetTableDetailsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetTableDetailsWOptions();

    watsonxDataService.disableRetries();
    testGetTableDetailsWOptions();
  }

  // Test the getTableDetails operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTableDetailsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getTableDetails(null).execute();
  }

  // Test the listStorageRegistrations operation with a valid options model parameter
  @Test
  public void testListStorageRegistrationsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"storage_registrations\": [{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"<access_key>\", \"access_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"iam\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"mrap_arn\": \"arn:aws:s3::123456789012:accesspoint/mrap/mrapName\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9\", \"sas_token\": \"<sas-token>\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"acl\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"type\": \"ibm_cos\", \"vault_enabled\": true}]}";
    String listStorageRegistrationsPath = "/storage_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListStorageRegistrationsOptions model
    ListStorageRegistrationsOptions listStorageRegistrationsOptionsModel = new ListStorageRegistrationsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke listStorageRegistrations() with a valid options model and verify the result
    Response<StorageRegistrationCollection> response = watsonxDataService.listStorageRegistrations(listStorageRegistrationsOptionsModel).execute();
    assertNotNull(response);
    StorageRegistrationCollection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listStorageRegistrationsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the listStorageRegistrations operation with and without retries enabled
  @Test
  public void testListStorageRegistrationsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListStorageRegistrationsWOptions();

    watsonxDataService.disableRetries();
    testListStorageRegistrationsWOptions();
  }

  // Test the createStorageRegistration operation with a valid options model parameter
  @Test
  public void testCreateStorageRegistrationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"actions\": [\"actions\"], \"associated_catalogs\": [{\"base_path\": \"/abc/def\", \"catalog_name\": \"sampleCatalog\", \"catalog_tags\": [\"catalogTags\"], \"catalog_type\": \"iceberg\"}], \"connection\": {\"access_key\": \"<access_key>\", \"access_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"account_name\": \"sample-storage\", \"application_id\": \"application-id\", \"auth_mode\": \"iam\", \"container_name\": \"sample-container\", \"directory_id\": \"directory-id\", \"endpoint\": \"https://s3.us-south.cloud-object-storage.appdomain.cloud/\", \"key_file\": \"key_file\", \"mrap_arn\": \"arn:aws:s3::123456789012:accesspoint/mrap/mrapName\", \"name\": \"sample-storage\", \"provider\": \"ibm-cos\", \"region\": \"us-south\", \"role_arn\": \"arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9\", \"sas_token\": \"<sas-token>\", \"secret_key\": \"secret_key\", \"secret_key_vault\": {\"key\": \"secret key\", \"secret_name\": \"secret name\", \"secret_urn\": \"secret urn\"}, \"vault_enabled\": true}, \"created_at\": \"1686120645\", \"created_by\": \"<username>@<domain>.com\", \"description\": \"COS storage for customer data\", \"display_name\": \"sample-storage-displayname\", \"id\": \"samplestorage123\", \"managed_by\": \"ibm\", \"region\": \"us-south\", \"state\": \"active\", \"storage_use\": \"acl\", \"system_storage_update_credentials\": true, \"tags\": [\"tags\"], \"type\": \"ibm_cos\", \"vault_enabled\": true}";
    String createStorageRegistrationPath = "/storage_registrations";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the StorageCatalogPrototype model
    StorageCatalogPrototype storageCatalogPrototypeModel = new StorageCatalogPrototype.Builder()
      .basePath("/abc/def")
      .catalogName("sampleCatalog")
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .catalogType("iceberg")
      .build();

    // Construct an instance of the SecretDetails model
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();

    // Construct an instance of the StorageDetails model
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

    // Construct an instance of the CreateStorageRegistrationOptions model
    CreateStorageRegistrationOptions createStorageRegistrationOptionsModel = new CreateStorageRegistrationOptions.Builder()
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

    // Invoke createStorageRegistration() with a valid options model and verify the result
    Response<StorageRegistration> response = watsonxDataService.createStorageRegistration(createStorageRegistrationOptionsModel).execute();
    assertNotNull(response);
    StorageRegistration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createStorageRegistrationPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createStorageRegistration operation with and without retries enabled
  @Test
  public void testCreateStorageRegistrationWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateStorageRegistrationWOptions();

    watsonxDataService.disableRetries();
    testCreateStorageRegistrationWOptions();
  }

  // Test the createStorageRegistration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateStorageRegistrationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createStorageRegistration(null).execute();
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