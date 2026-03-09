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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineDetailsPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineHome;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkScaleConfig;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
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
    SparkEngineHome sparkEngineHomeModel = new SparkEngineHome.Builder()
      .path("spark/spark1234")
      .storageName("test-spark-storage")
      .volume("test-spark-volume")
      .volumeId("1704979825978585")
      .volumeName("my-volume")
      .volumeStorageClass("nfs-client")
      .volumeStorageSize("5Gi")
      .build();
    assertEquals(sparkEngineHomeModel.path(), "spark/spark1234");
    assertEquals(sparkEngineHomeModel.storageName(), "test-spark-storage");
    assertEquals(sparkEngineHomeModel.volume(), "test-spark-volume");
    assertEquals(sparkEngineHomeModel.volumeId(), "1704979825978585");
    assertEquals(sparkEngineHomeModel.volumeName(), "my-volume");
    assertEquals(sparkEngineHomeModel.volumeStorageClass(), "nfs-client");
    assertEquals(sparkEngineHomeModel.volumeStorageSize(), "5Gi");

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
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .engineHome(sparkEngineHomeModel)
      .instanceId("spark-id")
      .managedBy("fully")
      .scaleConfig(sparkScaleConfigModel)
      .build();
    assertEquals(sparkEngineDetailsPrototypeModel.apiKey(), "apikey");
    assertEquals(sparkEngineDetailsPrototypeModel.connectionString(), "1.2.3.4");
    assertEquals(sparkEngineDetailsPrototypeModel.defaultConfig(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkEngineDetailsPrototypeModel.defaultVersion(), "4.8.3");
    assertEquals(sparkEngineDetailsPrototypeModel.engineHome(), sparkEngineHomeModel);
    assertEquals(sparkEngineDetailsPrototypeModel.instanceId(), "spark-id");
    assertEquals(sparkEngineDetailsPrototypeModel.managedBy(), "fully");
    assertEquals(sparkEngineDetailsPrototypeModel.scaleConfig(), sparkScaleConfigModel);

    CreateSparkEngineOptions createSparkEngineOptionsModel = new CreateSparkEngineOptions.Builder()
      .displayName("sampleEngine")
      .origin("external")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .configuration(sparkEngineDetailsPrototypeModel)
      .description("spark engine description")
      .id("sampleEngine123")
      .status("provisioning")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .type("spark")
      .authInstanceId("testString")
      .build();
    assertEquals(createSparkEngineOptionsModel.displayName(), "sampleEngine");
    assertEquals(createSparkEngineOptionsModel.origin(), "external");
    assertEquals(createSparkEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("iceberg_data", "hive_data"));
    assertEquals(createSparkEngineOptionsModel.configuration(), sparkEngineDetailsPrototypeModel);
    assertEquals(createSparkEngineOptionsModel.description(), "spark engine description");
    assertEquals(createSparkEngineOptionsModel.id(), "sampleEngine123");
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