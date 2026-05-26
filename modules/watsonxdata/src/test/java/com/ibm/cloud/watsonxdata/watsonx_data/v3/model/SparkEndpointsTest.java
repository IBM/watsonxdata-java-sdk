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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEndpoints model.
 */
public class SparkEndpointsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEndpoints() throws Throwable {
    SparkEndpoints sparkEndpointsModel = new SparkEndpoints.Builder()
      .applicationsApi("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id")
      .historyServerEndpoint("$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server")
      .sparkAccessEndpoint("$HOST/analytics-engine/details/spark-instance_id")
      .sparkJobsV4Endpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications")
      .sparkKernelEndpoint("$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels")
      .viewHistoryServer("testString")
      .wxdApplicationEndpoint("$HOST/v1/1698311655308796/engines/spark817/applications")
      .wxdEngineEndpoint("$HOST/v1/1698311655308796/engines/spark817")
      .wxdHistoryServerEndpoint("$HOST/v1/1698311655308796/engines/spark817/history_server")
      .wxdHistoryServerUiEndpoint("$HOST/v1/1698311655308796/engines/spark817/history_server/ui")
      .build();
    assertEquals(sparkEndpointsModel.applicationsApi(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id");
    assertEquals(sparkEndpointsModel.historyServerEndpoint(), "$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server");
    assertEquals(sparkEndpointsModel.sparkAccessEndpoint(), "$HOST/analytics-engine/details/spark-instance_id");
    assertEquals(sparkEndpointsModel.sparkJobsV4Endpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications");
    assertEquals(sparkEndpointsModel.sparkKernelEndpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels");
    assertEquals(sparkEndpointsModel.viewHistoryServer(), "testString");
    assertEquals(sparkEndpointsModel.wxdApplicationEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/applications");
    assertEquals(sparkEndpointsModel.wxdEngineEndpoint(), "$HOST/v1/1698311655308796/engines/spark817");
    assertEquals(sparkEndpointsModel.wxdHistoryServerEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/history_server");
    assertEquals(sparkEndpointsModel.wxdHistoryServerUiEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/history_server/ui");

    String json = TestUtilities.serialize(sparkEndpointsModel);

    SparkEndpoints sparkEndpointsModelNew = TestUtilities.deserialize(json, SparkEndpoints.class);
    assertTrue(sparkEndpointsModelNew instanceof SparkEndpoints);
    assertEquals(sparkEndpointsModelNew.applicationsApi(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/application_id");
    assertEquals(sparkEndpointsModelNew.historyServerEndpoint(), "$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server");
    assertEquals(sparkEndpointsModelNew.sparkAccessEndpoint(), "$HOST/analytics-engine/details/spark-instance_id");
    assertEquals(sparkEndpointsModelNew.sparkJobsV4Endpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications");
    assertEquals(sparkEndpointsModelNew.sparkKernelEndpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels");
    assertEquals(sparkEndpointsModelNew.viewHistoryServer(), "testString");
    assertEquals(sparkEndpointsModelNew.wxdApplicationEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/applications");
    assertEquals(sparkEndpointsModelNew.wxdEngineEndpoint(), "$HOST/v1/1698311655308796/engines/spark817");
    assertEquals(sparkEndpointsModelNew.wxdHistoryServerEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/history_server");
    assertEquals(sparkEndpointsModelNew.wxdHistoryServerUiEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/history_server/ui");
  }
}