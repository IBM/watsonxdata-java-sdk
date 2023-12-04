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
import com.ibm.cloud.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateBucketRegistrationOptions model.
 */
public class CreateBucketRegistrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateBucketRegistrationOptions() throws Throwable {
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

    CreateBucketRegistrationOptions createBucketRegistrationOptionsModel = new CreateBucketRegistrationOptions.Builder()
      .bucketDetails(bucketDetailsModel)
      .bucketType("ibm_cos")
      .catalogName("sampleCatalog")
      .description("COS bucket for customer data")
      .managedBy("ibm")
      .tableType("iceberg")
      .bucketDisplayName("sample-bucket-displayname")
      .bucketTags(java.util.Arrays.asList("read customer data", "write customer data'"))
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .region("us-south")
      .state("active")
      .authInstanceId("testString")
      .build();
    assertEquals(createBucketRegistrationOptionsModel.bucketDetails(), bucketDetailsModel);
    assertEquals(createBucketRegistrationOptionsModel.bucketType(), "ibm_cos");
    assertEquals(createBucketRegistrationOptionsModel.catalogName(), "sampleCatalog");
    assertEquals(createBucketRegistrationOptionsModel.description(), "COS bucket for customer data");
    assertEquals(createBucketRegistrationOptionsModel.managedBy(), "ibm");
    assertEquals(createBucketRegistrationOptionsModel.tableType(), "iceberg");
    assertEquals(createBucketRegistrationOptionsModel.bucketDisplayName(), "sample-bucket-displayname");
    assertEquals(createBucketRegistrationOptionsModel.bucketTags(), java.util.Arrays.asList("read customer data", "write customer data'"));
    assertEquals(createBucketRegistrationOptionsModel.catalogTags(), java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"));
    assertEquals(createBucketRegistrationOptionsModel.region(), "us-south");
    assertEquals(createBucketRegistrationOptionsModel.state(), "active");
    assertEquals(createBucketRegistrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBucketRegistrationOptionsError() throws Throwable {
    new CreateBucketRegistrationOptions.Builder().build();
  }

}