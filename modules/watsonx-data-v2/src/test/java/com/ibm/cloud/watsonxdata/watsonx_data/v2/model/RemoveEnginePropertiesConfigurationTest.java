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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RemoveEnginePropertiesConfiguration model.
 */
public class RemoveEnginePropertiesConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRemoveEnginePropertiesConfiguration() throws Throwable {
    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesConfigurationModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesConfigurationModel.worker(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(removeEnginePropertiesConfigurationModel);

    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModelNew = TestUtilities.deserialize(json, RemoveEnginePropertiesConfiguration.class);
    assertTrue(removeEnginePropertiesConfigurationModelNew instanceof RemoveEnginePropertiesConfiguration);
  }
}