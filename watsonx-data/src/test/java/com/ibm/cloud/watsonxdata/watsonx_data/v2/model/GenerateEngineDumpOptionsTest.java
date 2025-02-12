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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateEngineDumpOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GenerateEngineDumpOptions model.
 */
public class GenerateEngineDumpOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGenerateEngineDumpOptions() throws Throwable {
    GenerateEngineDumpOptions generateEngineDumpOptionsModel = new GenerateEngineDumpOptions.Builder()
      .dumpFileName("prestodump")
      .dumpType("heat")
      .engineId("presto-123")
      .podName("presto")
      .authInstanceId("testString")
      .build();
    assertEquals(generateEngineDumpOptionsModel.dumpFileName(), "prestodump");
    assertEquals(generateEngineDumpOptionsModel.dumpType(), "heat");
    assertEquals(generateEngineDumpOptionsModel.engineId(), "presto-123");
    assertEquals(generateEngineDumpOptionsModel.podName(), "presto");
    assertEquals(generateEngineDumpOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGenerateEngineDumpOptionsError() throws Throwable {
    new GenerateEngineDumpOptions.Builder().build();
  }

}