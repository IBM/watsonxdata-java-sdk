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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineResourceLimit;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateSparkEngineBodyEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateSparkEngineBodyEngineDetails model.
 */
public class UpdateSparkEngineBodyEngineDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateSparkEngineBodyEngineDetails() throws Throwable {
    SparkEngineResourceLimit sparkEngineResourceLimitModel = new SparkEngineResourceLimit.Builder()
      .cores("1")
      .memory("4G")
      .build();
    assertEquals(sparkEngineResourceLimitModel.cores(), "1");
    assertEquals(sparkEngineResourceLimitModel.memory(), "4G");

    UpdateSparkEngineBodyEngineDetails updateSparkEngineBodyEngineDetailsModel = new UpdateSparkEngineBodyEngineDetails.Builder()
      .defaultConfig(java.util.Collections.singletonMap("key1", "testString"))
      .defaultVersion("4.8.3")
      .engineHomeBucketName("test-spark-bucket")
      .resourceLimitEnabled(true)
      .resourceLimits(sparkEngineResourceLimitModel)
      .build();
    assertEquals(updateSparkEngineBodyEngineDetailsModel.defaultConfig(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(updateSparkEngineBodyEngineDetailsModel.defaultVersion(), "4.8.3");
    assertEquals(updateSparkEngineBodyEngineDetailsModel.engineHomeBucketName(), "test-spark-bucket");
    assertEquals(updateSparkEngineBodyEngineDetailsModel.resourceLimitEnabled(), Boolean.valueOf(true));
    assertEquals(updateSparkEngineBodyEngineDetailsModel.resourceLimits(), sparkEngineResourceLimitModel);

    String json = TestUtilities.serialize(updateSparkEngineBodyEngineDetailsModel);

    UpdateSparkEngineBodyEngineDetails updateSparkEngineBodyEngineDetailsModelNew = TestUtilities.deserialize(json, UpdateSparkEngineBodyEngineDetails.class);
    assertTrue(updateSparkEngineBodyEngineDetailsModelNew instanceof UpdateSparkEngineBodyEngineDetails);
    assertEquals(updateSparkEngineBodyEngineDetailsModelNew.defaultVersion(), "4.8.3");
    assertEquals(updateSparkEngineBodyEngineDetailsModelNew.engineHomeBucketName(), "test-spark-bucket");
    assertEquals(updateSparkEngineBodyEngineDetailsModelNew.resourceLimitEnabled(), Boolean.valueOf(true));
    assertEquals(updateSparkEngineBodyEngineDetailsModelNew.resourceLimits().toString(), sparkEngineResourceLimitModel.toString());
  }
}