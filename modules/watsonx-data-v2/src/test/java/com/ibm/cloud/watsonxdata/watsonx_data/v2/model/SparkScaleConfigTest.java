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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkScaleConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkScaleConfig model.
 */
public class SparkScaleConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkScaleConfig() throws Throwable {
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

    String json = TestUtilities.serialize(sparkScaleConfigModel);

    SparkScaleConfig sparkScaleConfigModelNew = TestUtilities.deserialize(json, SparkScaleConfig.class);
    assertTrue(sparkScaleConfigModelNew instanceof SparkScaleConfig);
    assertEquals(sparkScaleConfigModelNew.autoScaleEnabled(), Boolean.valueOf(true));
    assertEquals(sparkScaleConfigModelNew.currentNumberOfNodes(), Long.valueOf("2"));
    assertEquals(sparkScaleConfigModelNew.maximumNumberOfNodes(), Long.valueOf("5"));
    assertEquals(sparkScaleConfigModelNew.minimumNumberOfNodes(), Long.valueOf("1"));
    assertEquals(sparkScaleConfigModelNew.nodeType(), "medium");
    assertEquals(sparkScaleConfigModelNew.numberOfNodes(), Long.valueOf("2"));
  }
}