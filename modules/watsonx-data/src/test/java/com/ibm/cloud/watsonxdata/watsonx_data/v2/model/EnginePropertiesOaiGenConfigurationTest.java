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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EnginePropertiesOaiGenConfiguration model.
 */
public class EnginePropertiesOaiGenConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEnginePropertiesOaiGenConfiguration() throws Throwable {
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

    String json = TestUtilities.serialize(enginePropertiesOaiGenConfigurationModel);

    EnginePropertiesOaiGenConfiguration enginePropertiesOaiGenConfigurationModelNew = TestUtilities.deserialize(json, EnginePropertiesOaiGenConfiguration.class);
    assertTrue(enginePropertiesOaiGenConfigurationModelNew instanceof EnginePropertiesOaiGenConfiguration);
    assertEquals(enginePropertiesOaiGenConfigurationModelNew.coordinator().toString(), prestissimoNodeDescriptionBodyModel.toString());
    assertEquals(enginePropertiesOaiGenConfigurationModelNew.worker().toString(), prestissimoNodeDescriptionBodyModel.toString());
  }
}