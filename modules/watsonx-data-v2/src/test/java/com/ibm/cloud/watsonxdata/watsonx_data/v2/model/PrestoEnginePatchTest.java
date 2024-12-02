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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesLogConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Configuration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEngineEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePatchRemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesEventListener;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesGlobal;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesOaiGenConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
    PrestoEnginePropertiesCatalog prestoEnginePropertiesCatalogModel = new PrestoEnginePropertiesCatalog.Builder()
      .catalogName("testString")
      .build();
    assertEquals(prestoEnginePropertiesCatalogModel.catalogName(), "testString");

    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(nodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(nodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    EnginePropertiesOaiGen1Configuration enginePropertiesOaiGen1ConfigurationModel = new EnginePropertiesOaiGen1Configuration.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .worker(nodeDescriptionBodyModel)
      .build();
    assertEquals(enginePropertiesOaiGen1ConfigurationModel.coordinator(), nodeDescriptionBodyModel);
    assertEquals(enginePropertiesOaiGen1ConfigurationModel.worker(), nodeDescriptionBodyModel);

    PrestoEnginePropertiesEventListener prestoEnginePropertiesEventListenerModel = new PrestoEnginePropertiesEventListener.Builder()
      .eventListenerProperty("testString")
      .build();
    assertEquals(prestoEnginePropertiesEventListenerModel.eventListenerProperty(), "testString");

    PrestoEnginePropertiesGlobal prestoEnginePropertiesGlobalModel = new PrestoEnginePropertiesGlobal.Builder()
      .globalProperty("enable-mixed-case-support:true")
      .build();
    assertEquals(prestoEnginePropertiesGlobalModel.globalProperty(), "enable-mixed-case-support:true");

    EnginePropertiesOaiGen1Jvm enginePropertiesOaiGen1JvmModel = new EnginePropertiesOaiGen1Jvm.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .worker(nodeDescriptionBodyModel)
      .build();
    assertEquals(enginePropertiesOaiGen1JvmModel.coordinator(), nodeDescriptionBodyModel);
    assertEquals(enginePropertiesOaiGen1JvmModel.worker(), nodeDescriptionBodyModel);

    EnginePropertiesLogConfiguration enginePropertiesLogConfigurationModel = new EnginePropertiesLogConfiguration.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .worker(nodeDescriptionBodyModel)
      .build();
    assertEquals(enginePropertiesLogConfigurationModel.coordinator(), nodeDescriptionBodyModel);
    assertEquals(enginePropertiesLogConfigurationModel.worker(), nodeDescriptionBodyModel);

    PrestoEngineEngineProperties prestoEngineEnginePropertiesModel = new PrestoEngineEngineProperties.Builder()
      .catalog(prestoEnginePropertiesCatalogModel)
      .configuration(enginePropertiesOaiGen1ConfigurationModel)
      .eventListener(prestoEnginePropertiesEventListenerModel)
      .global(prestoEnginePropertiesGlobalModel)
      .jvm(enginePropertiesOaiGen1JvmModel)
      .logConfig(enginePropertiesLogConfigurationModel)
      .build();
    assertEquals(prestoEngineEnginePropertiesModel.catalog(), prestoEnginePropertiesCatalogModel);
    assertEquals(prestoEngineEnginePropertiesModel.configuration(), enginePropertiesOaiGen1ConfigurationModel);
    assertEquals(prestoEngineEnginePropertiesModel.eventListener(), prestoEnginePropertiesEventListenerModel);
    assertEquals(prestoEngineEnginePropertiesModel.global(), prestoEnginePropertiesGlobalModel);
    assertEquals(prestoEngineEnginePropertiesModel.jvm(), enginePropertiesOaiGen1JvmModel);
    assertEquals(prestoEngineEnginePropertiesModel.logConfig(), enginePropertiesLogConfigurationModel);

    RemoveEnginePropertiesOaiGenConfiguration removeEnginePropertiesOaiGenConfigurationModel = new RemoveEnginePropertiesOaiGenConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesOaiGenConfigurationModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesOaiGenConfigurationModel.worker(), java.util.Arrays.asList("testString"));

    RemoveEnginePropertiesOaiGenJvm removeEnginePropertiesOaiGenJvmModel = new RemoveEnginePropertiesOaiGenJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesOaiGenJvmModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesOaiGenJvmModel.worker(), java.util.Arrays.asList("testString"));

    PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEnginePropertiesModel = new PrestoEnginePatchRemoveEngineProperties.Builder()
      .catalog(prestoEnginePropertiesCatalogModel)
      .configuration(removeEnginePropertiesOaiGenConfigurationModel)
      .jvm(removeEnginePropertiesOaiGenJvmModel)
      .eventListener(java.util.Arrays.asList())
      .build();
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.catalog(), prestoEnginePropertiesCatalogModel);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.configuration(), removeEnginePropertiesOaiGenConfigurationModel);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.jvm(), removeEnginePropertiesOaiGenJvmModel);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.eventListener(), java.util.Arrays.asList());

    PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
      .description("updated description for presto engine")
      .engineDisplayName("sampleEngine")
      .engineProperties(prestoEngineEnginePropertiesModel)
      .engineRestart("force")
      .removeEngineProperties(prestoEnginePatchRemoveEnginePropertiesModel)
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(prestoEnginePatchModel.description(), "updated description for presto engine");
    assertEquals(prestoEnginePatchModel.engineDisplayName(), "sampleEngine");
    assertEquals(prestoEnginePatchModel.engineProperties(), prestoEngineEnginePropertiesModel);
    assertEquals(prestoEnginePatchModel.engineRestart(), "force");
    assertEquals(prestoEnginePatchModel.removeEngineProperties(), prestoEnginePatchRemoveEnginePropertiesModel);
    assertEquals(prestoEnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(prestoEnginePatchModel);

    PrestoEnginePatch prestoEnginePatchModelNew = TestUtilities.deserialize(json, PrestoEnginePatch.class);
    assertTrue(prestoEnginePatchModelNew instanceof PrestoEnginePatch);
    assertEquals(prestoEnginePatchModelNew.description(), "updated description for presto engine");
    assertEquals(prestoEnginePatchModelNew.engineDisplayName(), "sampleEngine");
    assertEquals(prestoEnginePatchModelNew.engineProperties().toString(), prestoEngineEnginePropertiesModel.toString());
    assertEquals(prestoEnginePatchModelNew.engineRestart(), "force");
    assertEquals(prestoEnginePatchModelNew.removeEngineProperties().toString(), prestoEnginePatchRemoveEnginePropertiesModel.toString());
  }
  @Test
  public void testPrestoEnginePatchAsPatch() throws Throwable {
    PrestoEnginePropertiesCatalog prestoEnginePropertiesCatalogModel = new PrestoEnginePropertiesCatalog.Builder()
      .catalogName("testString")
      .build();

    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    EnginePropertiesOaiGen1Configuration enginePropertiesOaiGen1ConfigurationModel = new EnginePropertiesOaiGen1Configuration.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .worker(nodeDescriptionBodyModel)
      .build();

    PrestoEnginePropertiesEventListener prestoEnginePropertiesEventListenerModel = new PrestoEnginePropertiesEventListener.Builder()
      .eventListenerProperty("testString")
      .build();

    PrestoEnginePropertiesGlobal prestoEnginePropertiesGlobalModel = new PrestoEnginePropertiesGlobal.Builder()
      .globalProperty("enable-mixed-case-support:true")
      .build();

    EnginePropertiesOaiGen1Jvm enginePropertiesOaiGen1JvmModel = new EnginePropertiesOaiGen1Jvm.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .worker(nodeDescriptionBodyModel)
      .build();

    EnginePropertiesLogConfiguration enginePropertiesLogConfigurationModel = new EnginePropertiesLogConfiguration.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .worker(nodeDescriptionBodyModel)
      .build();

    PrestoEngineEngineProperties prestoEngineEnginePropertiesModel = new PrestoEngineEngineProperties.Builder()
      .catalog(prestoEnginePropertiesCatalogModel)
      .configuration(enginePropertiesOaiGen1ConfigurationModel)
      .eventListener(prestoEnginePropertiesEventListenerModel)
      .global(prestoEnginePropertiesGlobalModel)
      .jvm(enginePropertiesOaiGen1JvmModel)
      .logConfig(enginePropertiesLogConfigurationModel)
      .build();

    RemoveEnginePropertiesOaiGenConfiguration removeEnginePropertiesOaiGenConfigurationModel = new RemoveEnginePropertiesOaiGenConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    RemoveEnginePropertiesOaiGenJvm removeEnginePropertiesOaiGenJvmModel = new RemoveEnginePropertiesOaiGenJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEnginePropertiesModel = new PrestoEnginePatchRemoveEngineProperties.Builder()
      .catalog(prestoEnginePropertiesCatalogModel)
      .configuration(removeEnginePropertiesOaiGenConfigurationModel)
      .jvm(removeEnginePropertiesOaiGenJvmModel)
      .eventListener(java.util.Arrays.asList())
      .build();

    PrestoEnginePatch prestoEnginePatchModel = new PrestoEnginePatch.Builder()
      .description("updated description for presto engine")
      .engineDisplayName("sampleEngine")
      .engineProperties(prestoEngineEnginePropertiesModel)
      .engineRestart("force")
      .removeEngineProperties(prestoEnginePatchRemoveEnginePropertiesModel)
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = prestoEnginePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "updated description for presto engine");
    assertEquals(mergePatch.get("engine_display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("engine_properties"));
    assertEquals(mergePatch.get("engine_restart"), "force");
    assertTrue(mergePatch.containsKey("remove_engine_properties"));
    assertTrue(mergePatch.containsKey("tags"));
  }

}