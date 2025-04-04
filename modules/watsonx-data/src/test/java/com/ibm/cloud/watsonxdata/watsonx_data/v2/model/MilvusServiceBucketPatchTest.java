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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusServiceBucketPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MilvusServiceBucketPatch model.
 */
public class MilvusServiceBucketPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMilvusServiceBucketPatch() throws Throwable {
    MilvusServiceBucketPatch milvusServiceBucketPatchModel = new MilvusServiceBucketPatch.Builder()
      .bucketName("Sample bucket name")
      .managedBy("customer")
      .rootPath("Sample path")
      .tshirtSize("small")
      .build();
    assertEquals(milvusServiceBucketPatchModel.bucketName(), "Sample bucket name");
    assertEquals(milvusServiceBucketPatchModel.managedBy(), "customer");
    assertEquals(milvusServiceBucketPatchModel.rootPath(), "Sample path");
    assertEquals(milvusServiceBucketPatchModel.tshirtSize(), "small");

    String json = TestUtilities.serialize(milvusServiceBucketPatchModel);

    MilvusServiceBucketPatch milvusServiceBucketPatchModelNew = TestUtilities.deserialize(json, MilvusServiceBucketPatch.class);
    assertTrue(milvusServiceBucketPatchModelNew instanceof MilvusServiceBucketPatch);
    assertEquals(milvusServiceBucketPatchModelNew.bucketName(), "Sample bucket name");
    assertEquals(milvusServiceBucketPatchModelNew.managedBy(), "customer");
    assertEquals(milvusServiceBucketPatchModelNew.rootPath(), "Sample path");
    assertEquals(milvusServiceBucketPatchModelNew.tshirtSize(), "small");
  }
  @Test
  public void testMilvusServiceBucketPatchAsPatch() throws Throwable {
    MilvusServiceBucketPatch milvusServiceBucketPatchModel = new MilvusServiceBucketPatch.Builder()
      .bucketName("Sample bucket name")
      .managedBy("customer")
      .rootPath("Sample path")
      .tshirtSize("small")
      .build();

    Map<String, Object> mergePatch = milvusServiceBucketPatchModel.asPatch();

    assertEquals(mergePatch.get("bucket_name"), "Sample bucket name");
    assertEquals(mergePatch.get("managed_by"), "customer");
    assertEquals(mergePatch.get("root_path"), "Sample path");
    assertEquals(mergePatch.get("tshirt_size"), "small");
  }

}