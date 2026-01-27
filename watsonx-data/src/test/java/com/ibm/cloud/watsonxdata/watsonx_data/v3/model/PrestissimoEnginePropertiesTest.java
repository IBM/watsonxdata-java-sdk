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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEngineProperties model.
 */
public class PrestissimoEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEngineProperties() throws Throwable {
    PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(prestissimoEnginePropertiesCatalogAdditionalPropertiesModel.coordinator(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(prestissimoEnginePropertiesCatalogAdditionalPropertiesModel.worker(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    PrestissimoEnginePropertiesConfiguration prestissimoEnginePropertiesConfigurationModel = new PrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesConfigurationModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(prestissimoEnginePropertiesConfigurationModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    PrestissimoEnginePropertiesJvm prestissimoEnginePropertiesJvmModel = new PrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesJvmModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));

    PrestissimoEnginePropertiesLogConfig prestissimoEnginePropertiesLogConfigModel = new PrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesLogConfigModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(prestissimoEnginePropertiesLogConfigModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    PrestissimoEngineProperties prestissimoEnginePropertiesModel = new PrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(prestissimoEnginePropertiesConfigurationModel)
      .global(java.util.Collections.singletonMap("key1", "testString"))
      .jvm(prestissimoEnginePropertiesJvmModel)
      .logConfig(prestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Collections.singletonMap("key1", "testString"))
      .velox(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesModel.catalog(), java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel));
    assertEquals(prestissimoEnginePropertiesModel.configuration(), prestissimoEnginePropertiesConfigurationModel);
    assertEquals(prestissimoEnginePropertiesModel.global(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(prestissimoEnginePropertiesModel.jvm(), prestissimoEnginePropertiesJvmModel);
    assertEquals(prestissimoEnginePropertiesModel.logConfig(), prestissimoEnginePropertiesLogConfigModel);
    assertEquals(prestissimoEnginePropertiesModel.optimizerProperties(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(prestissimoEnginePropertiesModel.velox(), java.util.Collections.singletonMap("key1", "testString"));

    String json = TestUtilities.serialize(prestissimoEnginePropertiesModel);

    PrestissimoEngineProperties prestissimoEnginePropertiesModelNew = TestUtilities.deserialize(json, PrestissimoEngineProperties.class);
    assertTrue(prestissimoEnginePropertiesModelNew instanceof PrestissimoEngineProperties);
    assertEquals(prestissimoEnginePropertiesModelNew.configuration().toString(), prestissimoEnginePropertiesConfigurationModel.toString());
    assertEquals(prestissimoEnginePropertiesModelNew.jvm().toString(), prestissimoEnginePropertiesJvmModel.toString());
    assertEquals(prestissimoEnginePropertiesModelNew.logConfig().toString(), prestissimoEnginePropertiesLogConfigModel.toString());
  }
}