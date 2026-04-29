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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkVscodeConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkVscodeConfig model.
 */
public class SparkVscodeConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkVscodeConfig() throws Throwable {
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

    String json = TestUtilities.serialize(sparkVscodeConfigModel);

    SparkVscodeConfig sparkVscodeConfigModelNew = TestUtilities.deserialize(json, SparkVscodeConfig.class);
    assertTrue(sparkVscodeConfigModelNew instanceof SparkVscodeConfig);
    assertEquals(sparkVscodeConfigModelNew.crn(), "crn:v1:staging:public:lakehouse:us-east:a/9aa2b62f2a644ffb9e004451dc631307:00924abc-59a3-45bc-a2c0-58bbccf89ee2");
    assertEquals(sparkVscodeConfigModelNew.environmentType(), "SaaS");
    assertEquals(sparkVscodeConfigModelNew.host(), "us-south.lakehouse.dev.cloud.ibm.com");
    assertEquals(sparkVscodeConfigModelNew.userName(), "user@example.com");
  }
}