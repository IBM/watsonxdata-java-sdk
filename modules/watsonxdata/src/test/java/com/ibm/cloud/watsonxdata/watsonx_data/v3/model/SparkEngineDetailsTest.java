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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineHome;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineResourceUtilisation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkScaleConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkVscodeConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEngineDetails model.
 */
public class SparkEngineDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEngineDetails() throws Throwable {
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

    SparkEngineHome sparkEngineHomeModel = new SparkEngineHome.Builder()
      .path("spark/spark1234")
      .storageName("test-spark-storage")
      .volume("test-spark-volume")
      .volumeId("1704979825978585")
      .volumeName("my-volume")
      .build();
    assertEquals(sparkEngineHomeModel.path(), "spark/spark1234");
    assertEquals(sparkEngineHomeModel.storageName(), "test-spark-storage");
    assertEquals(sparkEngineHomeModel.volume(), "test-spark-volume");
    assertEquals(sparkEngineHomeModel.volumeId(), "1704979825978585");
    assertEquals(sparkEngineHomeModel.volumeName(), "my-volume");

    SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
      .cores("1")
      .memory("4G")
      .build();
    assertEquals(sparkEngineResourceLimitModel.cores(), "1");
    assertEquals(sparkEngineResourceLimitModel.memory(), "4G");

    SparkEngineResourceUtilisation sparkEngineResourceUtilisationModel = new SparkEngineResourceUtilisation.Builder()
      .cores("1m")
      .memory("4Gi")
      .build();
    assertEquals(sparkEngineResourceUtilisationModel.cores(), "1m");
    assertEquals(sparkEngineResourceUtilisationModel.memory(), "4Gi");

    SparkScaleConfig sparkScaleConfigModel = new SparkScaleConfig.Builder()
      .autoScaleEnabled(true)
      .currentNumberOfNodes(Long.valueOf("2"))
      .maximumNumberOfNodes(Long.valueOf("5"))
      .minimumNumberOfNodes(Long.valueOf("1"))
      .nodeType("medium")
      .numberOfNodes(Long.valueOf("2"))
      .build();
    assertEquals(sparkScaleConfigModel.autoScaleEnabled(), Boolean.valueOf(true));
    assertEquals(sparkScaleConfigModel.currentNumberOfNodes(), Long.valueOf("2"));
    assertEquals(sparkScaleConfigModel.maximumNumberOfNodes(), Long.valueOf("5"));
    assertEquals(sparkScaleConfigModel.minimumNumberOfNodes(), Long.valueOf("1"));
    assertEquals(sparkScaleConfigModel.nodeType(), "medium");
    assertEquals(sparkScaleConfigModel.numberOfNodes(), Long.valueOf("2"));

    SparkVscodeConfig sparkVscodeConfigModel = new SparkVscodeConfig.Builder()
      .crn("crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2")
      .environmentType("SaaS")
      .host("us-south.lakehouse.dev.cloud.ibm.com")
      .userName("user@example.com")
      .build();
    assertEquals(sparkVscodeConfigModel.crn(), "crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2");
    assertEquals(sparkVscodeConfigModel.environmentType(), "SaaS");
    assertEquals(sparkVscodeConfigModel.host(), "us-south.lakehouse.dev.cloud.ibm.com");
    assertEquals(sparkVscodeConfigModel.userName(), "user@example.com");

    SparkEngineDetails sparkEngineDetailsModel = new SparkEngineDetails.Builder()
      .apiKey("apikey")
      .connectionString("https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id")
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .endpoints(sparkEndpointsModel)
      .engineHome(sparkEngineHomeModel)
      .engineSubType("java")
      .instanceId("spark-id")
      .managedBy("fully")
      .resourceLimitEnabled(true)
      .resourceLimits(sparkEngineResourceLimitModel)
      .resourceUtilisation(sparkEngineResourceUtilisationModel)
      .scaleConfig(sparkScaleConfigModel)
      .vscodeConfig(sparkVscodeConfigModel)
      .build();
    assertEquals(sparkEngineDetailsModel.apiKey(), "apikey");
    assertEquals(sparkEngineDetailsModel.connectionString(), "https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id");
    assertEquals(sparkEngineDetailsModel.defaultConfig(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkEngineDetailsModel.defaultVersion(), "4.8.3");
    assertEquals(sparkEngineDetailsModel.endpoints(), sparkEndpointsModel);
    assertEquals(sparkEngineDetailsModel.engineHome(), sparkEngineHomeModel);
    assertEquals(sparkEngineDetailsModel.engineSubType(), "java");
    assertEquals(sparkEngineDetailsModel.instanceId(), "spark-id");
    assertEquals(sparkEngineDetailsModel.managedBy(), "fully");
    assertEquals(sparkEngineDetailsModel.resourceLimitEnabled(), Boolean.valueOf(true));
    assertEquals(sparkEngineDetailsModel.resourceLimits(), sparkEngineResourceLimitModel);
    assertEquals(sparkEngineDetailsModel.resourceUtilisation(), sparkEngineResourceUtilisationModel);
    assertEquals(sparkEngineDetailsModel.scaleConfig(), sparkScaleConfigModel);
    assertEquals(sparkEngineDetailsModel.vscodeConfig(), sparkVscodeConfigModel);

    String json = TestUtilities.serialize(sparkEngineDetailsModel);

    SparkEngineDetails sparkEngineDetailsModelNew = TestUtilities.deserialize(json, SparkEngineDetails.class);
    assertTrue(sparkEngineDetailsModelNew instanceof SparkEngineDetails);
    assertEquals(sparkEngineDetailsModelNew.apiKey(), "apikey");
    assertEquals(sparkEngineDetailsModelNew.connectionString(), "https://xyz.region.ae.cloud.123.com/v3/analytics_engines/spark_iae_id");
    assertEquals(sparkEngineDetailsModelNew.defaultVersion(), "4.8.3");
    assertEquals(sparkEngineDetailsModelNew.endpoints().toString(), sparkEndpointsModel.toString());
    assertEquals(sparkEngineDetailsModelNew.engineHome().toString(), sparkEngineHomeModel.toString());
    assertEquals(sparkEngineDetailsModelNew.engineSubType(), "java");
    assertEquals(sparkEngineDetailsModelNew.instanceId(), "spark-id");
    assertEquals(sparkEngineDetailsModelNew.managedBy(), "fully");
    assertEquals(sparkEngineDetailsModelNew.resourceLimitEnabled(), Boolean.valueOf(true));
    assertEquals(sparkEngineDetailsModelNew.resourceLimits().toString(), sparkEngineResourceLimitModel.toString());
    assertEquals(sparkEngineDetailsModelNew.resourceUtilisation().toString(), sparkEngineResourceUtilisationModel.toString());
    assertEquals(sparkEngineDetailsModelNew.scaleConfig().toString(), sparkScaleConfigModel.toString());
    assertEquals(sparkEngineDetailsModelNew.vscodeConfig().toString(), sparkVscodeConfigModel.toString());
  }
}