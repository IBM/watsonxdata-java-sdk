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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusServiceStoragePatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MilvusServiceStoragePatch model.
 */
public class MilvusServiceStoragePatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMilvusServiceStoragePatch() throws Throwable {
    MilvusServiceStoragePatch milvusServiceStoragePatchModel = new MilvusServiceStoragePatch.Builder()
      .rootPath("Sample path")
      .storageName("Sample storage name")
      .build();
    assertEquals(milvusServiceStoragePatchModel.rootPath(), "Sample path");
    assertEquals(milvusServiceStoragePatchModel.storageName(), "Sample storage name");

    String json = TestUtilities.serialize(milvusServiceStoragePatchModel);

    MilvusServiceStoragePatch milvusServiceStoragePatchModelNew = TestUtilities.deserialize(json, MilvusServiceStoragePatch.class);
    assertTrue(milvusServiceStoragePatchModelNew instanceof MilvusServiceStoragePatch);
    assertEquals(milvusServiceStoragePatchModelNew.rootPath(), "Sample path");
    assertEquals(milvusServiceStoragePatchModelNew.storageName(), "Sample storage name");
  }
  @Test
  public void testMilvusServiceStoragePatchAsPatch() throws Throwable {
    MilvusServiceStoragePatch milvusServiceStoragePatchModel = new MilvusServiceStoragePatch.Builder()
      .rootPath("Sample path")
      .storageName("Sample storage name")
      .build();

    Map<String, Object> mergePatch = milvusServiceStoragePatchModel.asPatch();

    assertEquals(mergePatch.get("root_path"), "Sample path");
    assertEquals(mergePatch.get("storage_name"), "Sample storage name");
  }


  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMilvusServiceStoragePatchError() throws Throwable {
    new MilvusServiceStoragePatch.Builder().build();
  }

}