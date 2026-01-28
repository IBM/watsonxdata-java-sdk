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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesCatalogAdditionalProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RemovePrestissimoEnginePropertiesLogConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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

    PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
      .description("updated description for prestissimo engine")
      .displayName("sampleEngine")
      .xProperties(prestissimoEnginePropertiesModel)
      .removeEngineProperties(removePrestissimoEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(prestissimoEnginePatchModel.description(), "updated description for prestissimo engine");
    assertEquals(prestissimoEnginePatchModel.displayName(), "sampleEngine");
    assertEquals(prestissimoEnginePatchModel.xProperties(), prestissimoEnginePropertiesModel);
    assertEquals(prestissimoEnginePatchModel.removeEngineProperties(), removePrestissimoEnginePropertiesModel);
    assertEquals(prestissimoEnginePatchModel.restartType(), "force");
    assertEquals(prestissimoEnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(prestissimoEnginePatchModel);

    PrestissimoEnginePatch prestissimoEnginePatchModelNew = TestUtilities.deserialize(json, PrestissimoEnginePatch.class);
    assertTrue(prestissimoEnginePatchModelNew instanceof PrestissimoEnginePatch);
    assertEquals(prestissimoEnginePatchModelNew.description(), "updated description for prestissimo engine");
    assertEquals(prestissimoEnginePatchModelNew.displayName(), "sampleEngine");
    assertEquals(prestissimoEnginePatchModelNew.xProperties().toString(), prestissimoEnginePropertiesModel.toString());
    assertEquals(prestissimoEnginePatchModelNew.removeEngineProperties().toString(), removePrestissimoEnginePropertiesModel.toString());
    assertEquals(prestissimoEnginePatchModelNew.restartType(), "force");
  }
  @Test
  public void testPrestissimoEnginePatchAsPatch() throws Throwable {
    PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new PrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .worker(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();

    PrestissimoEnginePropertiesConfiguration prestissimoEnginePropertiesConfigurationModel = new PrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    PrestissimoEnginePropertiesJvm prestissimoEnginePropertiesJvmModel = new PrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    PrestissimoEnginePropertiesLogConfig prestissimoEnginePropertiesLogConfigModel = new PrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .worker(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    PrestissimoEngineProperties prestissimoEnginePropertiesModel = new PrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", prestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(prestissimoEnginePropertiesConfigurationModel)
      .global(java.util.Collections.singletonMap("key1", "testString"))
      .jvm(prestissimoEnginePropertiesJvmModel)
      .logConfig(prestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Collections.singletonMap("key1", "testString"))
      .velox(java.util.Collections.singletonMap("key1", "testString"))
      .build();

    RemovePrestissimoEnginePropertiesCatalogAdditionalProperties removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel = new RemovePrestissimoEnginePropertiesCatalogAdditionalProperties.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    RemovePrestissimoEnginePropertiesConfiguration removePrestissimoEnginePropertiesConfigurationModel = new RemovePrestissimoEnginePropertiesConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    RemovePrestissimoEnginePropertiesJvm removePrestissimoEnginePropertiesJvmModel = new RemovePrestissimoEnginePropertiesJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .build();

    RemovePrestissimoEnginePropertiesLogConfig removePrestissimoEnginePropertiesLogConfigModel = new RemovePrestissimoEnginePropertiesLogConfig.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();

    RemovePrestissimoEngineProperties removePrestissimoEnginePropertiesModel = new RemovePrestissimoEngineProperties.Builder()
      .catalog(java.util.Collections.singletonMap("key1", removePrestissimoEnginePropertiesCatalogAdditionalPropertiesModel))
      .configuration(removePrestissimoEnginePropertiesConfigurationModel)
      .global(java.util.Arrays.asList("testString"))
      .jvm(removePrestissimoEnginePropertiesJvmModel)
      .logConfig(removePrestissimoEnginePropertiesLogConfigModel)
      .optimizerProperties(java.util.Arrays.asList("testString"))
      .velox(java.util.Arrays.asList("testString"))
      .build();

    PrestissimoEnginePatch prestissimoEnginePatchModel = new PrestissimoEnginePatch.Builder()
      .description("updated description for prestissimo engine")
      .displayName("sampleEngine")
      .xProperties(prestissimoEnginePropertiesModel)
      .removeEngineProperties(removePrestissimoEnginePropertiesModel)
      .restartType("force")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = prestissimoEnginePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "updated description for prestissimo engine");
    assertEquals(mergePatch.get("display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("properties"));
    assertTrue(mergePatch.containsKey("remove_engine_properties"));
    assertEquals(mergePatch.get("restart_type"), "force");
    assertTrue(mergePatch.containsKey("tags"));
  }

}