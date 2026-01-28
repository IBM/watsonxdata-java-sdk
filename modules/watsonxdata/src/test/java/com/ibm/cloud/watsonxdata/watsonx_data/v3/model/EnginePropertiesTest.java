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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EngineProperties model.
 */
public class EnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngineProperties() throws Throwable {
    EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(enginePropertiesCatalogAdditionalPropertiesModel.coordinator(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(enginePropertiesCatalogAdditionalPropertiesModel.worker(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    EnginePropertiesConfiguration enginePropertiesConfigurationModel = new EnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .build();
    assertEquals(enginePropertiesConfigurationModel.coordinator(), java.util.Collections.singletonMap("key1", "configuration_property_value"));
    assertEquals(enginePropertiesConfigurationModel.worker(), java.util.Collections.singletonMap("key1", "configuration_property_value"));

    EnginePropertiesJvm enginePropertiesJvmModel = new EnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .build();
    assertEquals(enginePropertiesJvmModel.coordinator(), java.util.Collections.singletonMap("key1", "JVM_property_value"));
    assertEquals(enginePropertiesJvmModel.worker(), java.util.Collections.singletonMap("key1", "JVM_property_value"));

    EnginePropertiesLogConfig enginePropertiesLogConfigModel = new EnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .build();
    assertEquals(enginePropertiesLogConfigModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(enginePropertiesLogConfigModel.worker(), java.util.Collections.singletonMap("key1", "log_config_property_value"));

    EngineProperties enginePropertiesModel = new EngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(enginePropertiesConfigurationModel)
      .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
      .global(java.util.Collections.singletonMap("key1", "global_property_value"))
      .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
      .jvm(enginePropertiesJvmModel)
      .logConfig(enginePropertiesLogConfigModel)
      .build();
    assertEquals(enginePropertiesModel.catalog(), java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel));
    assertEquals(enginePropertiesModel.configuration(), enginePropertiesConfigurationModel);
    assertEquals(enginePropertiesModel.eventListener(), java.util.Collections.singletonMap("key1", "event_listener_property_value"));
    assertEquals(enginePropertiesModel.global(), java.util.Collections.singletonMap("key1", "global_property_value"));
    assertEquals(enginePropertiesModel.jmxExporterConfig(), java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"));
    assertEquals(enginePropertiesModel.jvm(), enginePropertiesJvmModel);
    assertEquals(enginePropertiesModel.logConfig(), enginePropertiesLogConfigModel);

    String json = TestUtilities.serialize(enginePropertiesModel);

    EngineProperties enginePropertiesModelNew = TestUtilities.deserialize(json, EngineProperties.class);
    assertTrue(enginePropertiesModelNew instanceof EngineProperties);
    assertEquals(enginePropertiesModelNew.configuration().toString(), enginePropertiesConfigurationModel.toString());
    assertEquals(enginePropertiesModelNew.jvm().toString(), enginePropertiesJvmModel.toString());
    assertEquals(enginePropertiesModelNew.logConfig().toString(), enginePropertiesLogConfigModel.toString());
  }
}