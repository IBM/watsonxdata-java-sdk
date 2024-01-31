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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDb2EngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDb2EngineOptions model.
 */
public class CreateDb2EngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDb2EngineOptions() throws Throwable {
    Db2EngineDetailsBody db2EngineDetailsBodyModel = new Db2EngineDetailsBody.Builder()
      .connectionString("1.2.3.4")
      .build();
    assertEquals(db2EngineDetailsBodyModel.connectionString(), "1.2.3.4");

    CreateDb2EngineOptions createDb2EngineOptionsModel = new CreateDb2EngineOptions.Builder()
      .origin("external")
      .type("db2")
      .description("db2 engine description")
      .engineDetails(db2EngineDetailsBodyModel)
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createDb2EngineOptionsModel.origin(), "external");
    assertEquals(createDb2EngineOptionsModel.type(), "db2");
    assertEquals(createDb2EngineOptionsModel.description(), "db2 engine description");
    assertEquals(createDb2EngineOptionsModel.engineDetails(), db2EngineDetailsBodyModel);
    assertEquals(createDb2EngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createDb2EngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createDb2EngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDb2EngineOptionsError() throws Throwable {
    new CreateDb2EngineOptions.Builder().build();
  }

}