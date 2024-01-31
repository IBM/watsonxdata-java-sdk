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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEndpoints model.
 */
public class PrestissimoEndpointsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEndpoints() throws Throwable {
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

    String json = TestUtilities.serialize(prestissimoEndpointsModel);

    PrestissimoEndpoints prestissimoEndpointsModelNew = TestUtilities.deserialize(json, PrestissimoEndpoints.class);
    assertTrue(prestissimoEndpointsModelNew instanceof PrestissimoEndpoints);
    assertEquals(prestissimoEndpointsModelNew.applicationsApi(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications/<application_id>");
    assertEquals(prestissimoEndpointsModelNew.historyServerEndpoint(), "$HOST/v2/spark/v3/instances/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_history_server");
    assertEquals(prestissimoEndpointsModelNew.sparkAccessEndpoint(), "$HOST/analytics-engine/details/spark-<instance_id>");
    assertEquals(prestissimoEndpointsModelNew.sparkJobsV4Endpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/spark_applications");
    assertEquals(prestissimoEndpointsModelNew.sparkKernelEndpoint(), "$HOST/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/jkg/api/kernels");
    assertEquals(prestissimoEndpointsModelNew.viewHistoryServer(), "testString");
    assertEquals(prestissimoEndpointsModelNew.wxdApplicationEndpoint(), "$HOST/v1/1698311655308796/engines/spark817/applications");
  }
}