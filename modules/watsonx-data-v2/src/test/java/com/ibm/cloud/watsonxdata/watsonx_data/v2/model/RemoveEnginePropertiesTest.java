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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesPrestissimoOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RemoveEngineProperties model.
 */
public class RemoveEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRemoveEngineProperties() throws Throwable {
    PrestissimoEnginePropertiesCatalog prestissimoEnginePropertiesCatalogModel = new PrestissimoEnginePropertiesCatalog.Builder()
      .catalogName(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesCatalogModel.catalogName(), java.util.Arrays.asList("testString"));

    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesConfigurationModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesConfigurationModel.worker(), java.util.Arrays.asList("testString"));

    RemoveEnginePropertiesPrestissimoOaiGenJvm removeEnginePropertiesPrestissimoOaiGenJvmModel = new RemoveEnginePropertiesPrestissimoOaiGenJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesPrestissimoOaiGenJvmModel.coordinator(), java.util.Arrays.asList("testString"));

    RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
      .catalog(prestissimoEnginePropertiesCatalogModel)
      .configuration(removeEnginePropertiesConfigurationModel)
      .jvm(removeEnginePropertiesPrestissimoOaiGenJvmModel)
      .velox(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesModel.catalog(), prestissimoEnginePropertiesCatalogModel);
    assertEquals(removeEnginePropertiesModel.configuration(), removeEnginePropertiesConfigurationModel);
    assertEquals(removeEnginePropertiesModel.jvm(), removeEnginePropertiesPrestissimoOaiGenJvmModel);
    assertEquals(removeEnginePropertiesModel.velox(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(removeEnginePropertiesModel);

    RemoveEngineProperties removeEnginePropertiesModelNew = TestUtilities.deserialize(json, RemoveEngineProperties.class);
    assertTrue(removeEnginePropertiesModelNew instanceof RemoveEngineProperties);
    assertEquals(removeEnginePropertiesModelNew.catalog().toString(), prestissimoEnginePropertiesCatalogModel.toString());
    assertEquals(removeEnginePropertiesModelNew.configuration().toString(), removeEnginePropertiesConfigurationModel.toString());
    assertEquals(removeEnginePropertiesModelNew.jvm().toString(), removeEnginePropertiesPrestissimoOaiGenJvmModel.toString());
  }
}