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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineDetailsPrototype;
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
    SparkEngineDetailsPrototype sparkEngineDetailsPrototypeModel = new SparkEngineDetailsPrototype.Builder()
      .apiKey("apikey")
      .connectionString("1.2.3.4")
      .instanceId("spark-id")
      .managedBy("fully/self")
      .build();
    assertEquals(sparkEngineDetailsPrototypeModel.apiKey(), "apikey");
    assertEquals(sparkEngineDetailsPrototypeModel.connectionString(), "1.2.3.4");
    assertEquals(sparkEngineDetailsPrototypeModel.instanceId(), "spark-id");
    assertEquals(sparkEngineDetailsPrototypeModel.managedBy(), "fully/self");

    CreateSparkEngineOptions createSparkEngineOptionsModel = new CreateSparkEngineOptions.Builder()
      .origin("external")
      .type("spark")
      .description("spark engine description")
      .engineDetails(sparkEngineDetailsPrototypeModel)
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createSparkEngineOptionsModel.origin(), "external");
    assertEquals(createSparkEngineOptionsModel.type(), "spark");
    assertEquals(createSparkEngineOptionsModel.description(), "spark engine description");
    assertEquals(createSparkEngineOptionsModel.engineDetails(), sparkEngineDetailsPrototypeModel);
    assertEquals(createSparkEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createSparkEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createSparkEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineOptionsError() throws Throwable {
    new CreateSparkEngineOptions.Builder().build();
  }

}