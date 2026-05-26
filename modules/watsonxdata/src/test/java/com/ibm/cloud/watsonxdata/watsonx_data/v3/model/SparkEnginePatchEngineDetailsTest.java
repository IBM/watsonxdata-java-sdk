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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEnginePatchEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEnginePatchEngineDetails model.
 */
public class SparkEnginePatchEngineDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEnginePatchEngineDetails() throws Throwable {
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

    String json = TestUtilities.serialize(sparkEnginePatchEngineDetailsModel);

    SparkEnginePatchEngineDetails sparkEnginePatchEngineDetailsModelNew = TestUtilities.deserialize(json, SparkEnginePatchEngineDetails.class);
    assertTrue(sparkEnginePatchEngineDetailsModelNew instanceof SparkEnginePatchEngineDetails);
    assertEquals(sparkEnginePatchEngineDetailsModelNew.defaultVersion(), "4.8.3");
    assertEquals(sparkEnginePatchEngineDetailsModelNew.engineHome().toString(), sparkEngineHomePatchModel.toString());
    assertEquals(sparkEnginePatchEngineDetailsModelNew.resourceLimitEnabled(), Boolean.valueOf(true));
    assertEquals(sparkEnginePatchEngineDetailsModelNew.resourceLimits().toString(), sparkEngineResourceLimitModel.toString());
  }
}