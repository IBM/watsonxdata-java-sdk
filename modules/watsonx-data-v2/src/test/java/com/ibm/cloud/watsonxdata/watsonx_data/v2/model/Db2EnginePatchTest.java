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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EnginePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Db2EnginePatch model.
 */
public class Db2EnginePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDb2EnginePatch() throws Throwable {
    Db2EnginePatch db2EnginePatchModel = new Db2EnginePatch.Builder()
      .description("db2 engine updated description")
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(db2EnginePatchModel.description(), "db2 engine updated description");
    assertEquals(db2EnginePatchModel.engineDisplayName(), "sampleEngine");
    assertEquals(db2EnginePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(db2EnginePatchModel);

    Db2EnginePatch db2EnginePatchModelNew = TestUtilities.deserialize(json, Db2EnginePatch.class);
    assertTrue(db2EnginePatchModelNew instanceof Db2EnginePatch);
    assertEquals(db2EnginePatchModelNew.description(), "db2 engine updated description");
    assertEquals(db2EnginePatchModelNew.engineDisplayName(), "sampleEngine");
  }
  @Test
  public void testDb2EnginePatchAsPatch() throws Throwable {
    Db2EnginePatch db2EnginePatchModel = new Db2EnginePatch.Builder()
      .description("db2 engine updated description")
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = db2EnginePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "db2 engine updated description");
    assertEquals(mergePatch.get("engine_display_name"), "sampleEngine");
    assertTrue(mergePatch.containsKey("tags"));
  }

}