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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGenConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesVelox;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesPrestissimoOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEnginePatch model.
 */
public class PrestissimoEnginePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEnginePatch() throws Throwable {
    PrestissimoEnginePropertiesCatalog prestissimoEnginePropertiesCatalogModel = new PrestissimoEnginePropertiesCatalog.Builder()
      .catalogName(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesCatalogModel.catalogName(), java.util.Arrays.asList("testString"));

    PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(prestissimoNodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(prestissimoNodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    EnginePropertiesOaiGenConfiguration enginePropertiesOaiGenConfigurationModel = new EnginePropertiesOaiGenConfiguration.Builder()
      .coordinator(prestissimoNodeDescriptionBodyModel)
      .worker(prestissimoNodeDescriptionBodyModel)
      .build();
    assertEquals(enginePropertiesOaiGenConfigurationModel.coordinator(), prestissimoNodeDescriptionBodyModel);
    assertEquals(enginePropertiesOaiGenConfigurationModel.worker(), prestissimoNodeDescriptionBodyModel);

    PrestissimoEnginePropertiesVelox prestissimoEnginePropertiesVeloxModel = new PrestissimoEnginePropertiesVelox.Builder()
      .veloxProperty(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesVeloxModel.veloxProperty(), java.util.Arrays.asList("testString"));

    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(nodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(nodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    PrestissimoEnginePropertiesOaiGen1Jvm prestissimoEnginePropertiesOaiGen1JvmModel = new PrestissimoEnginePropertiesOaiGen1Jvm.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .build();
    assertEquals(prestissimoEnginePropertiesOaiGen1JvmModel.coordinator(), nodeDescriptionBodyModel);

    PrestissimoEngineEngineProperties prestissimoEngineEnginePropertiesModel = new PrestissimoEngineEngineProperties.Builder()
      .catalog(prestissimoEnginePropertiesCatalogModel)
      .configuration(enginePropertiesOaiGenConfigurationModel)
      .velox(prestissimoEnginePropertiesVeloxModel)
      .jvm(prestissimoEnginePropertiesOaiGen1JvmModel)
      .build();
    assertEquals(prestissimoEngineEnginePropertiesModel.catalog(), prestissimoEnginePropertiesCatalogModel);
    assertEquals(prestissimoEngineEnginePropertiesModel.configuration(), enginePropertiesOaiGenConfigurationModel);
    assertEquals(prestissimoEngineEnginePropertiesModel.velox(), prestissimoEnginePropertiesVeloxModel);
    assertEquals(prestissimoEngineEnginePropertiesModel.jvm(), prestissimoEnginePropertiesOaiGen1JvmModel);

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

    PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
      .description("updated description for prestissimo engine")
      .engineDisplayName("sampleEngine")
      .engineProperties(prestissimoEngineEnginePropertiesModel)
      .engineRestart("force")
      .removeEngineProperties(removeEnginePropertiesModel)
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(prestissimoEnginePatchModel.description(), "updated description for prestissimo engine");
    assertEquals(prestissimoEnginePatchModel.engineDisplayName(), "sampleEngine");
    assertEquals(prestissimoEnginePatchModel.engineProperties(), prestissimoEngineEnginePropertiesModel);
    assertEquals(prestissimoEnginePatchModel.engineRestart(), "force");
    assertEquals(prestissimoEnginePatchModel.removeEngineProperties(), removeEnginePropertiesModel);
    assertEquals(prestissimoEnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(prestissimoEnginePatchModel);

    PrestissimoEnginePatch prestissimoEnginePatchModelNew = TestUtilities.deserialize(json, PrestissimoEnginePatch.class);
    assertTrue(prestissimoEnginePatchModelNew instanceof PrestissimoEnginePatch);
    assertEquals(prestissimoEnginePatchModelNew.description(), "updated description for prestissimo engine");
    assertEquals(prestissimoEnginePatchModelNew.engineDisplayName(), "sampleEngine");
    assertEquals(prestissimoEnginePatchModelNew.engineProperties().toString(), prestissimoEngineEnginePropertiesModel.toString());
    assertEquals(prestissimoEnginePatchModelNew.engineRestart(), "force");
    assertEquals(prestissimoEnginePatchModelNew.removeEngineProperties().toString(), removeEnginePropertiesModel.toString());
  }
  @Test
  public void testPrestissimoEnginePatchAsPatch() throws Throwable {
    PrestissimoEnginePropertiesCatalog prestissimoEnginePropertiesCatalogModel = new PrestissimoEnginePropertiesCatalog.Builder()
      .catalogName(java.util.Arrays.asList("testString"))
      .build();

    PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    EnginePropertiesOaiGenConfiguration enginePropertiesOaiGenConfigurationModel = new EnginePropertiesOaiGenConfiguration.Builder()
      .coordinator(prestissimoNodeDescriptionBodyModel)
      .worker(prestissimoNodeDescriptionBodyModel)
      .build();

    PrestissimoEnginePropertiesVelox prestissimoEnginePropertiesVeloxModel = new PrestissimoEnginePropertiesVelox.Builder()
      .veloxProperty(java.util.Arrays.asList("testString"))
      .build();

    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    PrestissimoEnginePropertiesOaiGen1Jvm prestissimoEnginePropertiesOaiGen1JvmModel = new PrestissimoEnginePropertiesOaiGen1Jvm.Builder()
      .coordinator(nodeDescriptionBodyModel)
      .build();

    PrestissimoEngineEngineProperties prestissimoEngineEnginePropertiesModel = new PrestissimoEngineEngineProperties.Builder()
      .catalog(prestissimoEnginePropertiesCatalogModel)
      .configuration(enginePropertiesOaiGenConfigurationModel)
      .velox(prestissimoEnginePropertiesVeloxModel)
      .jvm(prestissimoEnginePropertiesOaiGen1JvmModel)
      .build();

    RemoveEnginePropertiesConfiguration removeEnginePropertiesConfigurationModel = new RemoveEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    RemoveEnginePropertiesPrestissimoOaiGenJvm removeEnginePropertiesPrestissimoOaiGenJvmModel = new RemoveEnginePropertiesPrestissimoOaiGenJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();

    RemoveEngineProperties removeEnginePropertiesModel = new RemoveEngineProperties.Builder()
      .catalog(prestissimoEnginePropertiesCatalogModel)
      .configuration(removeEnginePropertiesConfigurationModel)
      .jvm(removeEnginePropertiesPrestissimoOaiGenJvmModel)
      .velox(java.util.Arrays.asList("testString"))
      .build();

    PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
      .description("updated description for prestissimo engine")
      .engineDisplayName("sampleEngine")
      .engineProperties(prestissimoEngineEnginePropertiesModel)
      .engineRestart("force")
      .removeEngineProperties(removeEnginePropertiesModel)
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = prestissimoEnginePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "updated description for prestissimo engine");
    assertEquals(mergePatch.get("engine_display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("engine_properties"));
    assertEquals(mergePatch.get("engine_restart"), "force");
    assertTrue(mergePatch.containsKey("remove_engine_properties"));
    assertTrue(mergePatch.containsKey("tags"));
  }

}