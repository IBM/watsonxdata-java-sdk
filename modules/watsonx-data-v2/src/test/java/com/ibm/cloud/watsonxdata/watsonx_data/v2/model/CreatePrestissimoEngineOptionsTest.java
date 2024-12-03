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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePrestissimoEngineOptions model.
 */
public class CreatePrestissimoEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePrestissimoEngineOptions() throws Throwable {
    PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(prestissimoNodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(prestissimoNodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    PrestissimoEndpoints prestissimoEndpointsModel = new PrestissimoEndpoints.Builder()
      .applicationsApi("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>")
      .historyServerEndpoint("$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server")
      .sparkAccessEndpoint("$HOST/analytics-engine/details/spark-<instance_id>")
      .sparkJobsV4Endpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications")
      .sparkKernelEndpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels")
      .viewHistoryServer("testString")
      .wxdApplicationEndpoint("$HOST/v1/1698311655308796/engines/spark817/applications")
      .build();
    assertEquals(prestissimoEndpointsModel.applicationsApi(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>");
    assertEquals(prestissimoEndpointsModel.historyServerEndpoint(), "$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server");
    assertEquals(prestissimoEndpointsModel.sparkAccessEndpoint(), "$HOST/analytics-engine/details/spark-<instance_id>");
    assertEquals(prestissimoEndpointsModel.sparkJobsV4Endpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications");
    assertEquals(prestissimoEndpointsModel.sparkKernelEndpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels");
    assertEquals(prestissimoEndpointsModel.viewHistoryServer(), "testString");
    assertEquals(prestissimoEndpointsModel.wxdApplicationEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/applications");

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
    assertEquals(prestissimoEngineDetailsModel.apiKey(), "<api_key>");
    assertEquals(prestissimoEngineDetailsModel.connectionString(), "1.2.3.4");
    assertEquals(prestissimoEngineDetailsModel.coordinator(), prestissimoNodeDescriptionBodyModel);
    assertEquals(prestissimoEngineDetailsModel.endpoints(), prestissimoEndpointsModel);
    assertEquals(prestissimoEngineDetailsModel.instanceId(), "instance_id");
    assertEquals(prestissimoEngineDetailsModel.managedBy(), "fully/self");
    assertEquals(prestissimoEngineDetailsModel.metastoreHost(), "1.2.3.4");
    assertEquals(prestissimoEngineDetailsModel.sizeConfig(), "starter");
    assertEquals(prestissimoEngineDetailsModel.worker(), prestissimoNodeDescriptionBodyModel);

    CreatePrestissimoEngineOptions createPrestissimoEngineOptionsModel = new CreatePrestissimoEngineOptions.Builder()
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("hive_data"))
      .description("prestissimo engine description")
      .engineDetails(prestissimoEngineDetailsModel)
      .engineDisplayName("sampleEngine")
      .region("us-south")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .version("1.2.3")
      .authInstanceId("testString")
      .build();
    assertEquals(createPrestissimoEngineOptionsModel.origin(), "native");
    assertEquals(createPrestissimoEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("hive_data"));
    assertEquals(createPrestissimoEngineOptionsModel.description(), "prestissimo engine description");
    assertEquals(createPrestissimoEngineOptionsModel.engineDetails(), prestissimoEngineDetailsModel);
    assertEquals(createPrestissimoEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createPrestissimoEngineOptionsModel.region(), "us-south");
    assertEquals(createPrestissimoEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createPrestissimoEngineOptionsModel.version(), "1.2.3");
    assertEquals(createPrestissimoEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineOptionsError() throws Throwable {
    new CreatePrestissimoEngineOptions.Builder().build();
  }

}