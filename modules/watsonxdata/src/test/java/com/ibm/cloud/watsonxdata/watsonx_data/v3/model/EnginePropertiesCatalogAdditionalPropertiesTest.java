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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EnginePropertiesCatalogAdditionalProperties model.
 */
public class EnginePropertiesCatalogAdditionalPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEnginePropertiesCatalogAdditionalProperties() throws Throwable {
    EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(enginePropertiesCatalogAdditionalPropertiesModel.coordinator(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(enginePropertiesCatalogAdditionalPropertiesModel.worker(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(enginePropertiesCatalogAdditionalPropertiesModel);

    EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModelNew = TestUtilities.deserialize(json, EnginePropertiesCatalogAdditionalProperties.class);
    assertTrue(enginePropertiesCatalogAdditionalPropertiesModelNew instanceof EnginePropertiesCatalogAdditionalProperties);
    assertEquals(enginePropertiesCatalogAdditionalPropertiesModelNew.coordinator().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(enginePropertiesCatalogAdditionalPropertiesModelNew.worker().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
}