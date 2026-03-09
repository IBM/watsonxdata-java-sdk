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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.OtherEngineConfigurationBody;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateOtherEngineOptions model.
 */
public class CreateOtherEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateOtherEngineOptions() throws Throwable {
    OtherEngineConfigurationBody otherEngineConfigurationBodyModel = new OtherEngineConfigurationBody.Builder()
      .connectionString("1.2.3.4")
      .type("netezza")
      .build();
    assertEquals(otherEngineConfigurationBodyModel.connectionString(), "1.2.3.4");
    assertEquals(otherEngineConfigurationBodyModel.type(), "netezza");

    CreateOtherEngineOptions createOtherEngineOptionsModel = new CreateOtherEngineOptions.Builder()
      .configuration(otherEngineConfigurationBodyModel)
      .displayName("sampleEngine01")
      .origin("external")
      .description("external engine description")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createOtherEngineOptionsModel.configuration(), otherEngineConfigurationBodyModel);
    assertEquals(createOtherEngineOptionsModel.displayName(), "sampleEngine01");
    assertEquals(createOtherEngineOptionsModel.origin(), "external");
    assertEquals(createOtherEngineOptionsModel.description(), "external engine description");
    assertEquals(createOtherEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createOtherEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateOtherEngineOptionsError() throws Throwable {
    new CreateOtherEngineOptions.Builder().build();
  }

}