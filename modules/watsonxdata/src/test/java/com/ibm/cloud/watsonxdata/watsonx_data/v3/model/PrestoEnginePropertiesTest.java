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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ConfigurationProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.JvmProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.LogConfigProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestoEngineProperties model.
 */
public class PrestoEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestoEngineProperties() throws Throwable {
    CatalogProperties catalogPropertiesModel = new CatalogProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(catalogPropertiesModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(catalogPropertiesModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    ConfigurationProperties configurationPropertiesModel = new ConfigurationProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "configuration_property_value"))
      .build();
    assertEquals(configurationPropertiesModel.coordinator(), java.util.Collections.singletonMap("key1", "configuration_property_value"));
    assertEquals(configurationPropertiesModel.worker(), java.util.Collections.singletonMap("key1", "configuration_property_value"));

    JvmProperties jvmPropertiesModel = new JvmProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "JVM_property_value"))
      .build();
    assertEquals(jvmPropertiesModel.coordinator(), java.util.Collections.singletonMap("key1", "JVM_property_value"));
    assertEquals(jvmPropertiesModel.worker(), java.util.Collections.singletonMap("key1", "JVM_property_value"));

    LogConfigProperties logConfigPropertiesModel = new LogConfigProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .worker(java.util.Collections.singletonMap("key1", "log_config_property_value"))
      .build();
    assertEquals(logConfigPropertiesModel.coordinator(), java.util.Collections.singletonMap("key1", "log_config_property_value"));
    assertEquals(logConfigPropertiesModel.worker(), java.util.Collections.singletonMap("key1", "log_config_property_value"));

    PrestoEngineProperties prestoEnginePropertiesModel = new PrestoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", catalogPropertiesModel))
      .configuration(configurationPropertiesModel)
      .eventListener(java.util.Collections.singletonMap("key1", "event_listener_property_value"))
      .global(java.util.Collections.singletonMap("key1", "global_property_value"))
      .jmxExporterConfig(java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"))
      .jvm(jvmPropertiesModel)
      .logConfig(logConfigPropertiesModel)
      .build();
    assertEquals(prestoEnginePropertiesModel.catalog(), java.util.Collections.singletonMap("key1", catalogPropertiesModel));
    assertEquals(prestoEnginePropertiesModel.configuration(), configurationPropertiesModel);
    assertEquals(prestoEnginePropertiesModel.eventListener(), java.util.Collections.singletonMap("key1", "event_listener_property_value"));
    assertEquals(prestoEnginePropertiesModel.global(), java.util.Collections.singletonMap("key1", "global_property_value"));
    assertEquals(prestoEnginePropertiesModel.jmxExporterConfig(), java.util.Collections.singletonMap("key1", "jmx_exporter_config_property_value"));
    assertEquals(prestoEnginePropertiesModel.jvm(), jvmPropertiesModel);
    assertEquals(prestoEnginePropertiesModel.logConfig(), logConfigPropertiesModel);

    String json = TestUtilities.serialize(prestoEnginePropertiesModel);

    PrestoEngineProperties prestoEnginePropertiesModelNew = TestUtilities.deserialize(json, PrestoEngineProperties.class);
    assertTrue(prestoEnginePropertiesModelNew instanceof PrestoEngineProperties);
    assertEquals(prestoEnginePropertiesModelNew.configuration().toString(), configurationPropertiesModel.toString());
    assertEquals(prestoEnginePropertiesModelNew.jvm().toString(), jvmPropertiesModel.toString());
    assertEquals(prestoEnginePropertiesModelNew.logConfig().toString(), logConfigPropertiesModel.toString());
  }
}