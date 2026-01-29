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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEnginePropertiesCatalogAdditionalProperties model.
 */
public class PrestissimoEnginePropertiesCatalogAdditionalPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEnginePropertiesCatalogAdditionalProperties() throws Throwable {
    PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(prestissimoEnginePropertiesCatalogAdditionalPropertiesModel.coordinator(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(prestissimoEnginePropertiesCatalogAdditionalPropertiesModel.worker(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(prestissimoEnginePropertiesCatalogAdditionalPropertiesModel);

    PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModelNew = TestUtilities.deserialize(json, PrestissimoEnginePropertiesCatalogAdditionalProperties.class);
    assertTrue(prestissimoEnginePropertiesCatalogAdditionalPropertiesModelNew instanceof PrestissimoEnginePropertiesCatalogAdditionalProperties);
    assertEquals(prestissimoEnginePropertiesCatalogAdditionalPropertiesModelNew.coordinator().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(prestissimoEnginePropertiesCatalogAdditionalPropertiesModelNew.worker().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
}