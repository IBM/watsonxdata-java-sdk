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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemoveEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestoEnginePatch model.
 */
public class PrestoEnginePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestoEnginePatch() throws Throwable {
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

    PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
      .description("updated description for presto engine")
      .displayName("sampleEngine")
      .xProperties(enginePropertiesModel)
      .removeEngineProperties(removeEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(prestoEnginePatchModel.description(), "updated description for presto engine");
    assertEquals(prestoEnginePatchModel.displayName(), "sampleEngine");
    assertEquals(prestoEnginePatchModel.xProperties(), enginePropertiesModel);
    assertEquals(prestoEnginePatchModel.removeEngineProperties(), removeEnginePropertiesModel);
    assertEquals(prestoEnginePatchModel.restartType(), "force");
    assertEquals(prestoEnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(prestoEnginePatchModel);

    PrestoEnginePatch prestoEnginePatchModelNew = TestUtilities.deserialize(json, PrestoEnginePatch.class);
    assertTrue(prestoEnginePatchModelNew instanceof PrestoEnginePatch);
    assertEquals(prestoEnginePatchModelNew.description(), "updated description for presto engine");
    assertEquals(prestoEnginePatchModelNew.displayName(), "sampleEngine");
    assertEquals(prestoEnginePatchModelNew.xProperties().toString(), enginePropertiesModel.toString());
    assertEquals(prestoEnginePatchModelNew.removeEngineProperties().toString(), removeEnginePropertiesModel.toString());
    assertEquals(prestoEnginePatchModelNew.restartType(), "force");
  }
  @Test
  public void testPrestoEnginePatchAsPatch() throws Throwable {
    EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalPropertiesModel = new EnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    EnginePropertiesConfiguration enginePropertiesConfigurationModel = new EnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .build();

    EnginePropertiesJvm enginePropertiesJvmModel = new EnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .build();

    EnginePropertiesLogConfig enginePropertiesLogConfigModel = new EnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .build();

    EngineProperties enginePropertiesModel = new EngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", enginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(enginePropertiesConfigurationModel)
      .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
      .global(java.util.Collections.singletonMap("key1", "global_property_value"))
      .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
      .jvm(enginePropertiesJvmModel)
      .logConfig(enginePropertiesLogConfigModel)
      .build();

    RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalPropertiesModel = new RemoveEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    RemoveEnginePropertiesJvm removeEnginePropertiesJvmModel = new RemoveEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    RemoveEnginePropertiesLogConfig removeEnginePropertiesLogConfigModel = new RemoveEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("property_name"))
      .worker(java.util.Arrays.asList("property_name"))
      .build();

    RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removeEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removeEnginePropertiesConfigurationModel)
      .eventListener(java.util.Arrays.asList("property_name"))
      .global(java.util.Arrays.asList("property_name"))
      .jmxExporterConfig(java.util.Arrays.asList("testString"))
      .jvm(removeEnginePropertiesJvmModel)
      .logConfig(removeEnginePropertiesLogConfigModel)
      .build();

    PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
      .description("updated description for presto engine")
      .displayName("sampleEngine")
      .xProperties(enginePropertiesModel)
      .removeEngineProperties(removeEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = prestoEnginePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "updated description for presto engine");
    assertEquals(mergePatch.get("display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("properties"));
    assertTrue(mergePatch.containsKey("remove_engine_properties"));
    assertEquals(mergePatch.get("restart_type"), "force");
    assertTrue(mergePatch.containsKey("tags"));
  }

}