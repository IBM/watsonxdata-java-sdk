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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EngineDetailsBody model.
 */
public class EngineDetailsBodyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngineDetailsBody() throws Throwable {
    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(nodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(nodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
      .apiKey("<api_key>")
      .connectionString("1.2.3.4")
      .coordinator(nodeDescriptionBodyModel)
      .instanceId("instance_id")
      .managedBy("fully/self")
      .sizeConfig("starter")
      .worker(nodeDescriptionBodyModel)
      .build();
    assertEquals(engineDetailsBodyModel.apiKey(), "<api_key>");
    assertEquals(engineDetailsBodyModel.connectionString(), "1.2.3.4");
    assertEquals(engineDetailsBodyModel.coordinator(), nodeDescriptionBodyModel);
    assertEquals(engineDetailsBodyModel.instanceId(), "instance_id");
    assertEquals(engineDetailsBodyModel.managedBy(), "fully/self");
    assertEquals(engineDetailsBodyModel.sizeConfig(), "starter");
    assertEquals(engineDetailsBodyModel.worker(), nodeDescriptionBodyModel);

    String json = TestUtilities.serialize(engineDetailsBodyModel);

    EngineDetailsBody engineDetailsBodyModelNew = TestUtilities.deserialize(json, EngineDetailsBody.class);
    assertTrue(engineDetailsBodyModelNew instanceof EngineDetailsBody);
    assertEquals(engineDetailsBodyModelNew.apiKey(), "<api_key>");
    assertEquals(engineDetailsBodyModelNew.connectionString(), "1.2.3.4");
    assertEquals(engineDetailsBodyModelNew.coordinator().toString(), nodeDescriptionBodyModel.toString());
    assertEquals(engineDetailsBodyModelNew.instanceId(), "instance_id");
    assertEquals(engineDetailsBodyModelNew.managedBy(), "fully/self");
    assertEquals(engineDetailsBodyModelNew.sizeConfig(), "starter");
    assertEquals(engineDetailsBodyModelNew.worker().toString(), nodeDescriptionBodyModel.toString());
  }
}