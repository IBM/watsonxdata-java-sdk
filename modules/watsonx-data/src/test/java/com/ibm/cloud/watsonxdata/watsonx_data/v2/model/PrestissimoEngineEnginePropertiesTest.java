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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesVelox;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEngineEngineProperties model.
 */
public class PrestissimoEngineEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEngineEngineProperties() throws Throwable {
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

    String json = TestUtilities.serialize(prestissimoEngineEnginePropertiesModel);

    PrestissimoEngineEngineProperties prestissimoEngineEnginePropertiesModelNew = TestUtilities.deserialize(json, PrestissimoEngineEngineProperties.class);
    assertTrue(prestissimoEngineEnginePropertiesModelNew instanceof PrestissimoEngineEngineProperties);
    assertEquals(prestissimoEngineEnginePropertiesModelNew.catalog().toString(), prestissimoEnginePropertiesCatalogModel.toString());
    assertEquals(prestissimoEngineEnginePropertiesModelNew.configuration().toString(), enginePropertiesOaiGenConfigurationModel.toString());
    assertEquals(prestissimoEngineEnginePropertiesModelNew.velox().toString(), prestissimoEnginePropertiesVeloxModel.toString());
    assertEquals(prestissimoEngineEnginePropertiesModelNew.jvm().toString(), prestissimoEnginePropertiesOaiGen1JvmModel.toString());
  }
}