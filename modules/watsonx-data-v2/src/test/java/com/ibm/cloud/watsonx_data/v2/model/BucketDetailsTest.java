/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.BucketDetails;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BucketDetails model.
 */
public class BucketDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBucketDetails() throws Throwable {
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .secretKey("secret_key")
      .build();
    assertEquals(bucketDetailsModel.accessKey(), "<access_key>");
    assertEquals(bucketDetailsModel.bucketName(), "sample-bucket");
    assertEquals(bucketDetailsModel.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(bucketDetailsModel.secretKey(), "secret_key");

    String json = TestUtilities.serialize(bucketDetailsModel);

    BucketDetails bucketDetailsModelNew = TestUtilities.deserialize(json, BucketDetails.class);
    assertTrue(bucketDetailsModelNew instanceof BucketDetails);
    assertEquals(bucketDetailsModelNew.accessKey(), "<access_key>");
    assertEquals(bucketDetailsModelNew.bucketName(), "sample-bucket");
    assertEquals(bucketDetailsModelNew.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(bucketDetailsModelNew.secretKey(), "secret_key");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBucketDetailsError() throws Throwable {
    new BucketDetails.Builder().build();
  }

}