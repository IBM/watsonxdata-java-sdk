/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkDefaultConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineDetailsPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkScaleConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSparkEngineOptions model.
 */
public class CreateSparkEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSparkEngineOptions() throws Throwable {
    SparkDefaultConfig sparkDefaultConfigModel = new SparkDefaultConfig.Builder()
      .config1("testString")
      .config2("testString")
      .build();
    assertEquals(sparkDefaultConfigModel.config1(), "testString");
    assertEquals(sparkDefaultConfigModel.config2(), "testString");

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

    SparkEngineDetailsPrototype sparkEngineDetailsPrototypeModel = new SparkEngineDetailsPrototype.Builder()
      .apiKey("apikey")
      .connectionString("1.2.3.4")
      .defaultConfig(sparkDefaultConfigModel)
      .defaultVersion("4.8.3")
      .engineHomeBucketDisplayName("test-spark-bucket")
      .engineHomeBucketName("test-spark-bucket")
      .engineHomePath("spark/spark1234")
      .engineHomeVolumeId("1704979825978585")
      .engineHomeVolumeName("my-volume")
      .engineHomeVolumeStorageClass("nfs-client")
      .engineHomeVolumeStorageSize("5Gi")
      .engineSubType("java/cpp")
      .instanceId("spark-id")
      .managedBy("fully/self")
      .scaleConfig(sparkScaleConfigModel)
      .build();
    assertEquals(sparkEngineDetailsPrototypeModel.apiKey(), "apikey");
    assertEquals(sparkEngineDetailsPrototypeModel.connectionString(), "1.2.3.4");
    assertEquals(sparkEngineDetailsPrototypeModel.defaultConfig(), sparkDefaultConfigModel);
    assertEquals(sparkEngineDetailsPrototypeModel.defaultVersion(), "4.8.3");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomeBucketDisplayName(), "test-spark-bucket");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomeBucketName(), "test-spark-bucket");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomePath(), "spark/spark1234");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomeVolumeId(), "1704979825978585");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomeVolumeName(), "my-volume");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomeVolumeStorageClass(), "nfs-client");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHomeVolumeStorageSize(), "5Gi");
    assertEquals(sparkEngineDetailsPrototypeModel.engineSubType(), "java/cpp");
    assertEquals(sparkEngineDetailsPrototypeModel.instanceId(), "spark-id");
    assertEquals(sparkEngineDetailsPrototypeModel.managedBy(), "fully/self");
    assertEquals(sparkEngineDetailsPrototypeModel.scaleConfig(), sparkScaleConfigModel);

    CreateSparkEngineOptions createSparkEngineOptionsModel = new CreateSparkEngineOptions.Builder()
      .origin("external")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("spark engine description")
      .engineDetails(sparkEngineDetailsPrototypeModel)
      .engineDisplayName("sampleEngine")
      .status("provisioning")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .type("spark")
      .authInstanceId("testString")
      .build();
    assertEquals(createSparkEngineOptionsModel.origin(), "external");
    assertEquals(createSparkEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("iceberg_data", "hive_data"));
    assertEquals(createSparkEngineOptionsModel.description(), "spark engine description");
    assertEquals(createSparkEngineOptionsModel.engineDetails(), sparkEngineDetailsPrototypeModel);
    assertEquals(createSparkEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createSparkEngineOptionsModel.status(), "provisioning");
    assertEquals(createSparkEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createSparkEngineOptionsModel.type(), "spark");
    assertEquals(createSparkEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineOptionsError() throws Throwable {
    new CreateSparkEngineOptions.Builder().build();
  }

}