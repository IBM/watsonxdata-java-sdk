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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
      .accessKey("b9cbf248ea5c4c96947e64407108559j")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .provider("ibm_cos")
      .region("us-south")
      .secretKey("13b4045cac1a0be54c9fjbe53cb22df5fn397cd2c45b66c87")
      .build();
    assertEquals(bucketDetailsModel.accessKey(), "b9cbf248ea5c4c96947e64407108559j");
    assertEquals(bucketDetailsModel.bucketName(), "sample-bucket");
    assertEquals(bucketDetailsModel.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(bucketDetailsModel.keyFile(), "key_file");
    assertEquals(bucketDetailsModel.provider(), "ibm_cos");
    assertEquals(bucketDetailsModel.region(), "us-south");
    assertEquals(bucketDetailsModel.secretKey(), "13b4045cac1a0be54c9fjbe53cb22df5fn397cd2c45b66c87");

    String json = TestUtilities.serialize(bucketDetailsModel);

    BucketDetails bucketDetailsModelNew = TestUtilities.deserialize(json, BucketDetails.class);
    assertTrue(bucketDetailsModelNew instanceof BucketDetails);
    assertEquals(bucketDetailsModelNew.accessKey(), "b9cbf248ea5c4c96947e64407108559j");
    assertEquals(bucketDetailsModelNew.bucketName(), "sample-bucket");
    assertEquals(bucketDetailsModelNew.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(bucketDetailsModelNew.keyFile(), "key_file");
    assertEquals(bucketDetailsModelNew.provider(), "ibm_cos");
    assertEquals(bucketDetailsModelNew.region(), "us-south");
    assertEquals(bucketDetailsModelNew.secretKey(), "13b4045cac1a0be54c9fjbe53cb22df5fn397cd2c45b66c87");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBucketDetailsError() throws Throwable {
    new BucketDetails.Builder().build();
  }

}