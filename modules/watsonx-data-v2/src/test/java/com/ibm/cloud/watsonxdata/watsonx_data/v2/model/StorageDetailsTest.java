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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StorageDetails model.
 */
public class StorageDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStorageDetails() throws Throwable {
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

    String json = TestUtilities.serialize(storageDetailsModel);

    StorageDetails storageDetailsModelNew = TestUtilities.deserialize(json, StorageDetails.class);
    assertTrue(storageDetailsModelNew instanceof StorageDetails);
    assertEquals(storageDetailsModelNew.accessKey(), "<access_key>");
    assertEquals(storageDetailsModelNew.applicationId(), "<application_id>");
    assertEquals(storageDetailsModelNew.authMode(), "<account_key/sas/service_principle>");
    assertEquals(storageDetailsModelNew.containerName(), "sample-container");
    assertEquals(storageDetailsModelNew.directoryId(), "<directory_id>");
    assertEquals(storageDetailsModelNew.endpoint(), "abfss://<container_name>@<storage_account_name>.dfs.core.windows.net/");
    assertEquals(storageDetailsModelNew.sasToken(), "<sas_token>");
    assertEquals(storageDetailsModelNew.secretKey(), "secret_key");
    assertEquals(storageDetailsModelNew.storageAccountName(), "sample-storage");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStorageDetailsError() throws Throwable {
    new StorageDetails.Builder().build();
  }

}