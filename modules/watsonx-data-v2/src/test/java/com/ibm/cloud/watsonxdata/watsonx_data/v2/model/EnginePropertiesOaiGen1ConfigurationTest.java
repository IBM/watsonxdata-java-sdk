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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGen1Configuration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EnginePropertiesOaiGen1Configuration model.
 */
public class EnginePropertiesOaiGen1ConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEnginePropertiesOaiGen1Configuration() throws Throwable {
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

    String json = TestUtilities.serialize(enginePropertiesOaiGen1ConfigurationModel);

    EnginePropertiesOaiGen1Configuration enginePropertiesOaiGen1ConfigurationModelNew = TestUtilities.deserialize(json, EnginePropertiesOaiGen1Configuration.class);
    assertTrue(enginePropertiesOaiGen1ConfigurationModelNew instanceof EnginePropertiesOaiGen1Configuration);
    assertEquals(enginePropertiesOaiGen1ConfigurationModelNew.coordinator().toString(), nodeDescriptionBodyModel.toString());
    assertEquals(enginePropertiesOaiGen1ConfigurationModelNew.worker().toString(), nodeDescriptionBodyModel.toString());
  }
}