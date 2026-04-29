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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdatePrestoEngineConfigOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdatePrestoEngineConfigOptions model.
 */
public class UpdatePrestoEngineConfigOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdatePrestoEngineConfigOptions() throws Throwable {
    UpdatePrestoEngineConfigOptions updatePrestoEngineConfigOptionsModel = new UpdatePrestoEngineConfigOptions.Builder()
      .engineId("presto93")
      .authInstanceId("crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::")
      .prestoEnginePropertiesDetailsPatch(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(updatePrestoEngineConfigOptionsModel.engineId(), "presto93");
    assertEquals(updatePrestoEngineConfigOptionsModel.authInstanceId(), "crn:v1:staging:public:lakehouse:eu-de:a/810fe64a9e3446d1b919d0eff69d3c5f:87495456-c862-4b35-b8de-884b7f15eee4::");
    assertEquals(updatePrestoEngineConfigOptionsModel.prestoEnginePropertiesDetailsPatch(), java.util.Collections.singletonMap("anyKey", "anyValue"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdatePrestoEngineConfigOptionsError() throws Throwable {
    new UpdatePrestoEngineConfigOptions.Builder().build();
  }

}