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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServicePatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MilvusServicePatch model.
 */
public class MilvusServicePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMilvusServicePatch() throws Throwable {
    MilvusServicePatch milvusServicePatchModel = new MilvusServicePatch.Builder()
      .description("updated description for milvus service")
      .serviceDisplayName("sampleService")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();
    assertEquals(milvusServicePatchModel.description(), "updated description for milvus service");
    assertEquals(milvusServicePatchModel.serviceDisplayName(), "sampleService");
    assertEquals(milvusServicePatchModel.tags(), java.util.Arrays.asList("tag1", "tag2"));

    String json = TestUtilities.serialize(milvusServicePatchModel);

    MilvusServicePatch milvusServicePatchModelNew = TestUtilities.deserialize(json, MilvusServicePatch.class);
    assertTrue(milvusServicePatchModelNew instanceof MilvusServicePatch);
    assertEquals(milvusServicePatchModelNew.description(), "updated description for milvus service");
    assertEquals(milvusServicePatchModelNew.serviceDisplayName(), "sampleService");
  }
  @Test
  public void testMilvusServicePatchAsPatch() throws Throwable {
    MilvusServicePatch milvusServicePatchModel = new MilvusServicePatch.Builder()
      .description("updated description for milvus service")
      .serviceDisplayName("sampleService")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .build();

    Map<String, Object> mergePatch = milvusServicePatchModel.asPatch();

    assertEquals(mergePatch.get("description"), "updated description for milvus service");
    assertEquals(mergePatch.get("service_display_name"), "sampleService");
    assertTrue(mergePatch.containsKey("tags"));
  }

}