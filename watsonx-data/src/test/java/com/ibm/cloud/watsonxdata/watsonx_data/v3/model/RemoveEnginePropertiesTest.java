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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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
    RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalPropertiesModel = new RemoveEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();
    assertEquals(removeEnginePropertiesCatalogAdditionalPropertiesModel.coordinator(), java.util.Arrays.asList("property_name"));
    assertEquals(removeEnginePropertiesCatalogAdditionalPropertiesModel.worker(), java.util.Arrays.asList("property_name"));

    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();
    assertEquals(removeEnginePropertiesConfigurationModel.coordinator(), java.util.Arrays.asList("property_name"));
    assertEquals(removeEnginePropertiesConfigurationModel.worker(), java.util.Arrays.asList("property_name"));

    RemoveEnginePropertiesJvm removeEnginePropertiesJvmModel = new RemoveEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();
    assertEquals(removeEnginePropertiesJvmModel.coordinator(), java.util.Arrays.asList("property_name"));
    assertEquals(removeEnginePropertiesJvmModel.worker(), java.util.Arrays.asList("property_name"));

    RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();
    assertEquals(removeEnginePropertiesLogConfigModel.coordinator(), java.util.Arrays.asList("property_name"));
    assertEquals(removeEnginePropertiesLogConfigModel.worker(), java.util.Arrays.asList("property_name"));

    RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removeEnginePropertiesConfigurationModel)
      .eventListener(java.util.Arrays.asList("property_name"))
      .global(java.util.Arrays.asList("property_name"))
      .jmxExporterConfig(java.util.Arrays.asList("testString"))
      .jvm(removeEnginePropertiesJvmModel)
      .logConfig(removeEnginePropertiesLogConfigModel)
      .build();
    assertEquals(removeEnginePropertiesModel.catalog(), java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel));
    assertEquals(removeEnginePropertiesModel.configuration(), removeEnginePropertiesConfigurationModel);
    assertEquals(removeEnginePropertiesModel.eventListener(), java.util.Arrays.asList("property_name"));
    assertEquals(removeEnginePropertiesModel.global(), java.util.Arrays.asList("property_name"));
    assertEquals(removeEnginePropertiesModel.jmxExporterConfig(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesModel.jvm(), removeEnginePropertiesJvmModel);
    assertEquals(removeEnginePropertiesModel.logConfig(), removeEnginePropertiesLogConfigModel);

    String json = TestUtilities.serialize(removeEnginePropertiesModel);

    RemoveEngineProperties removeEnginePropertiesModelNew = TestUtilities.deserialize(json, RemoveEngineProperties.class);
    assertTrue(removeEnginePropertiesModelNew instanceof RemoveEngineProperties);
    assertEquals(removeEnginePropertiesModelNew.configuration().toString(), removeEnginePropertiesConfigurationModel.toString());
    assertEquals(removeEnginePropertiesModelNew.jvm().toString(), removeEnginePropertiesJvmModel.toString());
    assertEquals(removeEnginePropertiesModelNew.logConfig().toString(), removeEnginePropertiesLogConfigModel.toString());
  }
}