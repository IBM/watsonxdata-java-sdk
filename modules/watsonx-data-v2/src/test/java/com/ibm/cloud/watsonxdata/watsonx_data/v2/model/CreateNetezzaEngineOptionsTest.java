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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateNetezzaEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateNetezzaEngineOptions model.
 */
public class CreateNetezzaEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateNetezzaEngineOptions() throws Throwable {
    NetezzaEngineDetailsBody netezzaEngineDetailsBodyModel = new NetezzaEngineDetailsBody.Builder()
      .connectionString("1.2.3.4")
      .build();
    assertEquals(netezzaEngineDetailsBodyModel.connectionString(), "1.2.3.4");

    CreateNetezzaEngineOptions createNetezzaEngineOptionsModel = new CreateNetezzaEngineOptions.Builder()
      .origin("external")
      .description("netezza engine description")
      .engineDetails(netezzaEngineDetailsBodyModel)
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createNetezzaEngineOptionsModel.origin(), "external");
    assertEquals(createNetezzaEngineOptionsModel.description(), "netezza engine description");
    assertEquals(createNetezzaEngineOptionsModel.engineDetails(), netezzaEngineDetailsBodyModel);
    assertEquals(createNetezzaEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createNetezzaEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createNetezzaEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateNetezzaEngineOptionsError() throws Throwable {
    new CreateNetezzaEngineOptions.Builder().build();
  }

}