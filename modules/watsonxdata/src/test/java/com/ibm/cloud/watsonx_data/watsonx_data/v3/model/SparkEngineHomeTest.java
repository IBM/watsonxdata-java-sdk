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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineHome;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEngineHome model.
 */
public class SparkEngineHomeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEngineHome() throws Throwable {
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

    String json = TestUtilities.serialize(sparkEngineHomeModel);

    SparkEngineHome sparkEngineHomeModelNew = TestUtilities.deserialize(json, SparkEngineHome.class);
    assertTrue(sparkEngineHomeModelNew instanceof SparkEngineHome);
    assertEquals(sparkEngineHomeModelNew.path(), "spark/spark1234");
    assertEquals(sparkEngineHomeModelNew.storageName(), "test-spark-storage");
    assertEquals(sparkEngineHomeModelNew.volume(), "test-spark-volume");
    assertEquals(sparkEngineHomeModelNew.volumeId(), "1704979825978585");
    assertEquals(sparkEngineHomeModelNew.volumeName(), "my-volume");
    assertEquals(sparkEngineHomeModelNew.volumeStorageClass(), "nfs-client");
    assertEquals(sparkEngineHomeModelNew.volumeStorageSize(), "5Gi");
  }
}