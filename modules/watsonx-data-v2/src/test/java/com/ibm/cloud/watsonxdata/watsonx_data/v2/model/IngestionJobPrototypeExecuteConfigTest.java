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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobPrototypeExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IngestionJobPrototypeExecuteConfig model.
 */
public class IngestionJobPrototypeExecuteConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIngestionJobPrototypeExecuteConfig() throws Throwable {
    IngestionJobPrototypeExecuteConfig ingestionJobPrototypeExecuteConfigModel = new IngestionJobPrototypeExecuteConfig.Builder()
      .driverCores(Long.valueOf("1"))
      .driverMemory("2G")
      .executorCores(Long.valueOf("1"))
      .executorMemory("2G")
      .numExecutors(Long.valueOf("1"))
      .build();
    assertEquals(ingestionJobPrototypeExecuteConfigModel.driverCores(), Long.valueOf("1"));
    assertEquals(ingestionJobPrototypeExecuteConfigModel.driverMemory(), "2G");
    assertEquals(ingestionJobPrototypeExecuteConfigModel.executorCores(), Long.valueOf("1"));
    assertEquals(ingestionJobPrototypeExecuteConfigModel.executorMemory(), "2G");
    assertEquals(ingestionJobPrototypeExecuteConfigModel.numExecutors(), Long.valueOf("1"));

    String json = TestUtilities.serialize(ingestionJobPrototypeExecuteConfigModel);

    IngestionJobPrototypeExecuteConfig ingestionJobPrototypeExecuteConfigModelNew = TestUtilities.deserialize(json, IngestionJobPrototypeExecuteConfig.class);
    assertTrue(ingestionJobPrototypeExecuteConfigModelNew instanceof IngestionJobPrototypeExecuteConfig);
    assertEquals(ingestionJobPrototypeExecuteConfigModelNew.driverCores(), Long.valueOf("1"));
    assertEquals(ingestionJobPrototypeExecuteConfigModelNew.driverMemory(), "2G");
    assertEquals(ingestionJobPrototypeExecuteConfigModelNew.executorCores(), Long.valueOf("1"));
    assertEquals(ingestionJobPrototypeExecuteConfigModelNew.executorMemory(), "2G");
    assertEquals(ingestionJobPrototypeExecuteConfigModelNew.numExecutors(), Long.valueOf("1"));
  }
}