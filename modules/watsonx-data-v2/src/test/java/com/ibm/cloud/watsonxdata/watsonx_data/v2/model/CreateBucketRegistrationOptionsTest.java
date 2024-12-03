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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateBucketRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
    BucketCatalog bucketCatalogModel = new BucketCatalog.Builder()
      .catalogName("sampleCatalog")
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .catalogType("iceberg")
      .build();
    assertEquals(bucketCatalogModel.catalogName(), "sampleCatalog");
    assertEquals(bucketCatalogModel.catalogTags(), java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"));
    assertEquals(bucketCatalogModel.catalogType(), "iceberg");

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

    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("<access_key>")
      .applicationId("<application_id>")
      .authMode("<account_key/sas/service_principle>")
      .containerName("sample-container")
      .directoryId("<directory_id>")
      .endpoint("abfss://<container_name>@<storage_account_name>.dfs.core.windows.net/")
      .sasToken("<sas_token>")
      .secretKey("secret_key")
      .storageAccountName("sample-storage")
      .build();
    assertEquals(storageDetailsModel.accessKey(), "<access_key>");
    assertEquals(storageDetailsModel.applicationId(), "<application_id>");
    assertEquals(storageDetailsModel.authMode(), "<account_key/sas/service_principle>");
    assertEquals(storageDetailsModel.containerName(), "sample-container");
    assertEquals(storageDetailsModel.directoryId(), "<directory_id>");
    assertEquals(storageDetailsModel.endpoint(), "abfss://<container_name>@<storage_account_name>.dfs.core.windows.net/");
    assertEquals(storageDetailsModel.sasToken(), "<sas_token>");
    assertEquals(storageDetailsModel.secretKey(), "secret_key");
    assertEquals(storageDetailsModel.storageAccountName(), "sample-storage");

    CreateBucketRegistrationOptions createBucketRegistrationOptionsModel = new CreateBucketRegistrationOptions.Builder()
      .bucketType("ibm_cos")
      .description("COS bucket for customer data")
      .managedBy("ibm")
      .associatedCatalog(bucketCatalogModel)
      .bucketDetails(bucketDetailsModel)
      .bucketDisplayName("sample-bucket-displayname")
      .region("us-south")
      .storageDetails(storageDetailsModel)
      .tags(java.util.Arrays.asList("bucket-tag1", "bucket-tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createBucketRegistrationOptionsModel.bucketType(), "ibm_cos");
    assertEquals(createBucketRegistrationOptionsModel.description(), "COS bucket for customer data");
    assertEquals(createBucketRegistrationOptionsModel.managedBy(), "ibm");
    assertEquals(createBucketRegistrationOptionsModel.associatedCatalog(), bucketCatalogModel);
    assertEquals(createBucketRegistrationOptionsModel.bucketDetails(), bucketDetailsModel);
    assertEquals(createBucketRegistrationOptionsModel.bucketDisplayName(), "sample-bucket-displayname");
    assertEquals(createBucketRegistrationOptionsModel.region(), "us-south");
    assertEquals(createBucketRegistrationOptionsModel.storageDetails(), storageDetailsModel);
    assertEquals(createBucketRegistrationOptionsModel.tags(), java.util.Arrays.asList("bucket-tag1", "bucket-tag2"));
    assertEquals(createBucketRegistrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBucketRegistrationOptionsError() throws Throwable {
    new CreateBucketRegistrationOptions.Builder().build();
  }

}