/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesLogConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Configuration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesEventListener;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesGlobal;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesJMX;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestoEngineEngineProperties model.
 */
public class PrestoEngineEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestoEngineEngineProperties() throws Throwable {
    EnginePropertiesCatalog enginePropertiesCatalogModel = new EnginePropertiesCatalog.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(enginePropertiesCatalogModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(enginePropertiesCatalogModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    PrestoEnginePropertiesCatalog prestoEnginePropertiesCatalogModel = new PrestoEnginePropertiesCatalog.Builder()
      .catalogName(enginePropertiesCatalogModel)
      .build();
    assertEquals(prestoEnginePropertiesCatalogModel.catalogName(), enginePropertiesCatalogModel);

    EnginePropertiesOaiGen1Configuration enginePropertiesOaiGen1ConfigurationModel = new EnginePropertiesOaiGen1Configuration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(enginePropertiesOaiGen1ConfigurationModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(enginePropertiesOaiGen1ConfigurationModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    PrestoEnginePropertiesEventListener prestoEnginePropertiesEventListenerModel = new PrestoEnginePropertiesEventListener.Builder()
      .eventListenerProperty("testString")
      .build();
    assertEquals(prestoEnginePropertiesEventListenerModel.eventListenerProperty(), "testString");

    PrestoEnginePropertiesGlobal prestoEnginePropertiesGlobalModel = new PrestoEnginePropertiesGlobal.Builder()
      .globalProperty("enable-mixed-case-support:true")
      .build();
    assertEquals(prestoEnginePropertiesGlobalModel.globalProperty(), "enable-mixed-case-support:true");

    EnginePropertiesOaiGen1Jvm enginePropertiesOaiGen1JvmModel = new EnginePropertiesOaiGen1Jvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(enginePropertiesOaiGen1JvmModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(enginePropertiesOaiGen1JvmModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    PrestoEnginePropertiesJMX prestoEnginePropertiesJmxModel = new PrestoEnginePropertiesJMX.Builder()
      .globalProperty("watsonx_data_presto_cluster_memory_manager_cluster_memory_bytes:presto.memory<name=ClusterMemoryManager><>ClusterMemoryBytes")
      .build();
    assertEquals(prestoEnginePropertiesJmxModel.globalProperty(), "watsonx_data_presto_cluster_memory_manager_cluster_memory_bytes:presto.memory<name=ClusterMemoryManager><>ClusterMemoryBytes");

    EnginePropertiesLogConfiguration enginePropertiesLogConfigurationModel = new EnginePropertiesLogConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(enginePropertiesLogConfigurationModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(enginePropertiesLogConfigurationModel.worker(), java.util.Collections.singletonMap("key1", "testString"));

    PrestoEngineEngineProperties prestoEngineEnginePropertiesModel = new PrestoEngineEngineProperties.Builder()
      .catalog(prestoEnginePropertiesCatalogModel)
      .configuration(enginePropertiesOaiGen1ConfigurationModel)
      .eventListener(prestoEnginePropertiesEventListenerModel)
      .global(prestoEnginePropertiesGlobalModel)
      .jvm(enginePropertiesOaiGen1JvmModel)
      .jmxExporterConfig(prestoEnginePropertiesJmxModel)
      .logConfig(enginePropertiesLogConfigurationModel)
      .build();
    assertEquals(prestoEngineEnginePropertiesModel.catalog(), prestoEnginePropertiesCatalogModel);
    assertEquals(prestoEngineEnginePropertiesModel.configuration(), enginePropertiesOaiGen1ConfigurationModel);
    assertEquals(prestoEngineEnginePropertiesModel.eventListener(), prestoEnginePropertiesEventListenerModel);
    assertEquals(prestoEngineEnginePropertiesModel.global(), prestoEnginePropertiesGlobalModel);
    assertEquals(prestoEngineEnginePropertiesModel.jvm(), enginePropertiesOaiGen1JvmModel);
    assertEquals(prestoEngineEnginePropertiesModel.jmxExporterConfig(), prestoEnginePropertiesJmxModel);
    assertEquals(prestoEngineEnginePropertiesModel.logConfig(), enginePropertiesLogConfigurationModel);

    String json = TestUtilities.serialize(prestoEngineEnginePropertiesModel);

    PrestoEngineEngineProperties prestoEngineEnginePropertiesModelNew = TestUtilities.deserialize(json, PrestoEngineEngineProperties.class);
    assertTrue(prestoEngineEnginePropertiesModelNew instanceof PrestoEngineEngineProperties);
    assertEquals(prestoEngineEnginePropertiesModelNew.catalog().toString(), prestoEnginePropertiesCatalogModel.toString());
    assertEquals(prestoEngineEnginePropertiesModelNew.configuration().toString(), enginePropertiesOaiGen1ConfigurationModel.toString());
    assertEquals(prestoEngineEnginePropertiesModelNew.eventListener().toString(), prestoEnginePropertiesEventListenerModel.toString());
    assertEquals(prestoEngineEnginePropertiesModelNew.global().toString(), prestoEnginePropertiesGlobalModel.toString());
    assertEquals(prestoEngineEnginePropertiesModelNew.jvm().toString(), enginePropertiesOaiGen1JvmModel.toString());
    assertEquals(prestoEngineEnginePropertiesModelNew.jmxExporterConfig().toString(), prestoEnginePropertiesJmxModel.toString());
    assertEquals(prestoEngineEnginePropertiesModelNew.logConfig().toString(), enginePropertiesLogConfigurationModel.toString());
  }
}