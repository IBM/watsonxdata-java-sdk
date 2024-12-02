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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.StartSparkEngineHistoryServerOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StartSparkEngineHistoryServerOptions model.
 */
public class StartSparkEngineHistoryServerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStartSparkEngineHistoryServerOptions() throws Throwable {
    StartSparkEngineHistoryServerOptions startSparkEngineHistoryServerOptionsModel = new StartSparkEngineHistoryServerOptions.Builder()
      .engineId("testString")
      .cores("1")
      .memory("4G")
      .authInstanceId("testString")
      .build();
    assertEquals(startSparkEngineHistoryServerOptionsModel.engineId(), "testString");
    assertEquals(startSparkEngineHistoryServerOptionsModel.cores(), "1");
    assertEquals(startSparkEngineHistoryServerOptionsModel.memory(), "4G");
    assertEquals(startSparkEngineHistoryServerOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStartSparkEngineHistoryServerOptionsError() throws Throwable {
    new StartSparkEngineHistoryServerOptions.Builder().build();
  }

}