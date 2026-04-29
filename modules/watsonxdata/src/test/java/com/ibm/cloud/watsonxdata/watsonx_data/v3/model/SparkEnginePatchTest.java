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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineHomePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEnginePatchEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEnginePatch model.
 */
public class SparkEnginePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEnginePatch() throws Throwable {
    SparkEngineHomePatch sparkEngineHomePatchModel = new SparkEngineHomePatch.Builder()
      .storageName("test-spark-storage")
      .build();
    assertEquals(sparkEngineHomePatchModel.storageName(), "test-spark-storage");

    SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
      .cores("1")
      .memory("4G")
      .build();
    assertEquals(sparkEngineResourceLimitModel.cores(), "1");
    assertEquals(sparkEngineResourceLimitModel.memory(), "4G");

    SparkEnginePatchEngineDetails sparkEnginePatchEngineDetailsModel = new SparkEnginePatchEngineDetails.Builder()
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .engineHome(sparkEngineHomePatchModel)
      .resourceLimitEnabled(true)
      .resourceLimits(sparkEngineResourceLimitModel)
      .build();
    assertEquals(sparkEnginePatchEngineDetailsModel.defaultConfig(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkEnginePatchEngineDetailsModel.defaultVersion(), "4.8.3");
    assertEquals(sparkEnginePatchEngineDetailsModel.engineHome(), sparkEngineHomePatchModel);
    assertEquals(sparkEnginePatchEngineDetailsModel.resourceLimitEnabled(), Boolean.valueOf(true));
    assertEquals(sparkEnginePatchEngineDetailsModel.resourceLimits(), sparkEngineResourceLimitModel);

    SparkEnginePatch sparkEnginePatchModel = new SparkEnginePatch.Builder()
      .configuration(sparkEnginePatchEngineDetailsModel)
      .description("updated description for spark engine")
      .displayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(sparkEnginePatchModel.configuration(), sparkEnginePatchEngineDetailsModel);
    assertEquals(sparkEnginePatchModel.description(), "updated description for spark engine");
    assertEquals(sparkEnginePatchModel.displayName(), "sampleEngine");
    assertEquals(sparkEnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(sparkEnginePatchModel);

    SparkEnginePatch sparkEnginePatchModelNew = TestUtilities.deserialize(json, SparkEnginePatch.class);
    assertTrue(sparkEnginePatchModelNew instanceof SparkEnginePatch);
    assertEquals(sparkEnginePatchModelNew.configuration().toString(), sparkEnginePatchEngineDetailsModel.toString());
    assertEquals(sparkEnginePatchModelNew.description(), "updated description for spark engine");
    assertEquals(sparkEnginePatchModelNew.displayName(), "sampleEngine");
  }
  @Test
  public void testSparkEnginePatchAsPatch() throws Throwable {
    SparkEngineHomePatch sparkEngineHomePatchModel = new SparkEngineHomePatch.Builder()
      .storageName("test-spark-storage")
      .build();

    SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
      .cores("1")
      .memory("4G")
      .build();

    SparkEnginePatchEngineDetails sparkEnginePatchEngineDetailsModel = new SparkEnginePatchEngineDetails.Builder()
      .defaultConfig(java.util.Collections.singletonMap("key1", "configuration"))
      .defaultVersion("4.8.3")
      .engineHome(sparkEngineHomePatchModel)
      .resourceLimitEnabled(true)
      .resourceLimits(sparkEngineResourceLimitModel)
      .build();

    SparkEnginePatch sparkEnginePatchModel = new SparkEnginePatch.Builder()
      .configuration(sparkEnginePatchEngineDetailsModel)
      .description("updated description for spark engine")
      .displayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = sparkEnginePatchModel.asPatch();

    assertTrue(mergePatch.containsKey("configuration"));
    assertEquals(mergePatch.get("description"), "updated description for spark engine");
    assertEquals(mergePatch.get("display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("tags"));
  }

}