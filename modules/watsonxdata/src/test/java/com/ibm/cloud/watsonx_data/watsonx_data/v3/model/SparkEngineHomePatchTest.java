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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineHomePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEngineHomePatch model.
 */
public class SparkEngineHomePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEngineHomePatch() throws Throwable {
    SparkEngineHomePatch sparkEngineHomePatchModel = new SparkEngineHomePatch.Builder()
      .storageName("test-spark-storage")
      .build();
    assertEquals(sparkEngineHomePatchModel.storageName(), "test-spark-storage");

    String json = TestUtilities.serialize(sparkEngineHomePatchModel);

    SparkEngineHomePatch sparkEngineHomePatchModelNew = TestUtilities.deserialize(json, SparkEngineHomePatch.class);
    assertTrue(sparkEngineHomePatchModelNew instanceof SparkEngineHomePatch);
    assertEquals(sparkEngineHomePatchModelNew.storageName(), "test-spark-storage");
  }
}