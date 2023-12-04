/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.CreateOtherEngineOptions;
import com.ibm.cloud.watsonx_data.v2.model.OtherEngineDetails;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
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
    OtherEngineDetails otherEngineDetailsModel = new OtherEngineDetails.Builder()
      .connectionString("1.2.3.4")
      .engineType("netezza")
      .metastoreHost("1.2.3.4")
      .build();
    assertEquals(otherEngineDetailsModel.connectionString(), "1.2.3.4");
    assertEquals(otherEngineDetailsModel.engineType(), "netezza");
    assertEquals(otherEngineDetailsModel.metastoreHost(), "1.2.3.4");

    CreateOtherEngineOptions createOtherEngineOptionsModel = new CreateOtherEngineOptions.Builder()
      .description("external engine description")
      .engineDetails(otherEngineDetailsModel)
      .engineDisplayName("sampleEngine01")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createOtherEngineOptionsModel.description(), "external engine description");
    assertEquals(createOtherEngineOptionsModel.engineDetails(), otherEngineDetailsModel);
    assertEquals(createOtherEngineOptionsModel.engineDisplayName(), "sampleEngine01");
    assertEquals(createOtherEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createOtherEngineOptionsModel.authInstanceId(), "testString");
  }
}