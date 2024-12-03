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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetezzaEnginePatch model.
 */
public class NetezzaEnginePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetezzaEnginePatch() throws Throwable {
    NetezzaEnginePatch netezzaEnginePatchModel = new NetezzaEnginePatch.Builder()
      .description("netezza engine updated description")
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(netezzaEnginePatchModel.description(), "netezza engine updated description");
    assertEquals(netezzaEnginePatchModel.engineDisplayName(), "sampleEngine");
    assertEquals(netezzaEnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(netezzaEnginePatchModel);

    NetezzaEnginePatch netezzaEnginePatchModelNew = TestUtilities.deserialize(json, NetezzaEnginePatch.class);
    assertTrue(netezzaEnginePatchModelNew instanceof NetezzaEnginePatch);
    assertEquals(netezzaEnginePatchModelNew.description(), "netezza engine updated description");
    assertEquals(netezzaEnginePatchModelNew.engineDisplayName(), "sampleEngine");
  }
  @Test
  public void testNetezzaEnginePatchAsPatch() throws Throwable {
    NetezzaEnginePatch netezzaEnginePatchModel = new NetezzaEnginePatch.Builder()
      .description("netezza engine updated description")
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = netezzaEnginePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "netezza engine updated description");
    assertEquals(mergePatch.get("engine_display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("tags"));
  }

}