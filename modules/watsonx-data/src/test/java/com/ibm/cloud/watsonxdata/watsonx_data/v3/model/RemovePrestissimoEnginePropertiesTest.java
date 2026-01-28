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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RemovePrestissimoEngineProperties model.
 */
public class RemovePrestissimoEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRemovePrestissimoEngineProperties() throws Throwable {
    RemovePrestissimoEnginePropertiesCatalogAdditionalProperties removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new RemovePrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel.worker(), java.util.Arrays.asList("testString"));

    RemovePrestissimoEnginePropertiesConfiguration removePrestissimoEnginePropertiesConfigurationModel = new RemovePrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removePrestissimoEnginePropertiesConfigurationModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removePrestissimoEnginePropertiesConfigurationModel.worker(), java.util.Arrays.asList("testString"));

    RemovePrestissimoEnginePropertiesJvm removePrestissimoEnginePropertiesJvmModel = new RemovePrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removePrestissimoEnginePropertiesJvmModel.coordinator(), java.util.Arrays.asList("testString"));

    RemovePrestissimoEnginePropertiesLogConfig removePrestissimoEnginePropertiesLogConfigModel = new RemovePrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removePrestissimoEnginePropertiesLogConfigModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removePrestissimoEnginePropertiesLogConfigModel.worker(), java.util.Arrays.asList("testString"));

    RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModel = new RemovePrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removePrestissimoEnginePropertiesConfigurationModel)
      .global(java.util.Arrays.asList("testString"))
      .jvm(removePrestissimoEnginePropertiesJvmModel)
      .logConfig(removePrestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Arrays.asList("testString"))
      .velox(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removePrestissimoEnginePropertiesModel.catalog(), java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel));
    assertEquals(removePrestissimoEnginePropertiesModel.configuration(), removePrestissimoEnginePropertiesConfigurationModel);
    assertEquals(removePrestissimoEnginePropertiesModel.global(), java.util.Arrays.asList("testString"));
    assertEquals(removePrestissimoEnginePropertiesModel.jvm(), removePrestissimoEnginePropertiesJvmModel);
    assertEquals(removePrestissimoEnginePropertiesModel.logConfig(), removePrestissimoEnginePropertiesLogConfigModel);
    assertEquals(removePrestissimoEnginePropertiesModel.optimizerProperties(), java.util.Arrays.asList("testString"));
    assertEquals(removePrestissimoEnginePropertiesModel.velox(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(removePrestissimoEnginePropertiesModel);

    RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModelNew = TestUtilities.deserialize(json, RemovePrestissimoEngineProperties.class);
    assertTrue(removePrestissimoEnginePropertiesModelNew instanceof RemovePrestissimoEngineProperties);
    assertEquals(removePrestissimoEnginePropertiesModelNew.configuration().toString(), removePrestissimoEnginePropertiesConfigurationModel.toString());
    assertEquals(removePrestissimoEnginePropertiesModelNew.jvm().toString(), removePrestissimoEnginePropertiesJvmModel.toString());
    assertEquals(removePrestissimoEnginePropertiesModelNew.logConfig().toString(), removePrestissimoEnginePropertiesLogConfigModel.toString());
  }
}