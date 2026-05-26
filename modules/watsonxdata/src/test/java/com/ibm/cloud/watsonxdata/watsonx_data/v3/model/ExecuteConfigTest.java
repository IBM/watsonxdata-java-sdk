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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExecuteConfig model.
 */
public class ExecuteConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExecuteConfig() throws Throwable {
    ExecuteConfig executeConfigModel = new ExecuteConfig.Builder()
      .driverMemory("testString")
      .driverCores(Long.valueOf("1"))
      .executorMemory("testString")
      .executorCores(Long.valueOf("1"))
      .numExecutors(Long.valueOf("1"))
      .build();
    assertEquals(executeConfigModel.driverMemory(), "testString");
    assertEquals(executeConfigModel.driverCores(), Long.valueOf("1"));
    assertEquals(executeConfigModel.executorMemory(), "testString");
    assertEquals(executeConfigModel.executorCores(), Long.valueOf("1"));
    assertEquals(executeConfigModel.numExecutors(), Long.valueOf("1"));

    String json = TestUtilities.serialize(executeConfigModel);

    ExecuteConfig executeConfigModelNew = TestUtilities.deserialize(json, ExecuteConfig.class);
    assertTrue(executeConfigModelNew instanceof ExecuteConfig);
    assertEquals(executeConfigModelNew.driverMemory(), "testString");
    assertEquals(executeConfigModelNew.driverCores(), Long.valueOf("1"));
    assertEquals(executeConfigModelNew.executorMemory(), "testString");
    assertEquals(executeConfigModelNew.executorCores(), Long.valueOf("1"));
    assertEquals(executeConfigModelNew.numExecutors(), Long.valueOf("1"));
  }
}