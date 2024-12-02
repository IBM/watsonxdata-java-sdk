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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BucketRegistrationPatch model.
 */
public class BucketRegistrationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBucketRegistrationPatch() throws Throwable {
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .provider("ibm_cos")
      .region("us-south")
      .secretKey("secret_key")
      .build();
    assertEquals(bucketDetailsModel.accessKey(), "<access_key>");
    assertEquals(bucketDetailsModel.bucketName(), "sample-bucket");
    assertEquals(bucketDetailsModel.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(bucketDetailsModel.keyFile(), "key_file");
    assertEquals(bucketDetailsModel.provider(), "ibm_cos");
    assertEquals(bucketDetailsModel.region(), "us-south");
    assertEquals(bucketDetailsModel.secretKey(), "secret_key");

    BucketRegistrationPatch bucketRegistrationPatchModel = new BucketRegistrationPatch.Builder()
      .bucketDetails(bucketDetailsModel)
      .bucketDisplayName("sample-bucket-displayname")
      .description("COS bucket for customer data")
      .tags(java.util.Arrays.asList("testbucket", "userbucket"))
      .build();
    assertEquals(bucketRegistrationPatchModel.bucketDetails(), bucketDetailsModel);
    assertEquals(bucketRegistrationPatchModel.bucketDisplayName(), "sample-bucket-displayname");
    assertEquals(bucketRegistrationPatchModel.description(), "COS bucket for customer data");
    assertEquals(bucketRegistrationPatchModel.tags(), java.util.Arrays.asList("testbucket", "userbucket"));

    String json = TestUtilities.serialize(bucketRegistrationPatchModel);

    BucketRegistrationPatch bucketRegistrationPatchModelNew = TestUtilities.deserialize(json, BucketRegistrationPatch.class);
    assertTrue(bucketRegistrationPatchModelNew instanceof BucketRegistrationPatch);
    assertEquals(bucketRegistrationPatchModelNew.bucketDetails().toString(), bucketDetailsModel.toString());
    assertEquals(bucketRegistrationPatchModelNew.bucketDisplayName(), "sample-bucket-displayname");
    assertEquals(bucketRegistrationPatchModelNew.description(), "COS bucket for customer data");
  }
  @Test
  public void testBucketRegistrationPatchAsPatch() throws Throwable {
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .provider("ibm_cos")
      .region("us-south")
      .secretKey("secret_key")
      .build();

    BucketRegistrationPatch bucketRegistrationPatchModel = new BucketRegistrationPatch.Builder()
      .bucketDetails(bucketDetailsModel)
      .bucketDisplayName("sample-bucket-displayname")
      .description("COS bucket for customer data")
      .tags(java.util.Arrays.asList("testbucket", "userbucket"))
      .build();

    Map<String, Object> mergePatch = bucketRegistrationPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("bucket_details"));
    assertEquals(mergePatch.get("bucket_display_name"), "sample-bucket-displayname");
    assertEquals(mergePatch.get("description"), "COS bucket for customer data");
    assertTrue(mergePatch.containsKey("tags"));
  }

}