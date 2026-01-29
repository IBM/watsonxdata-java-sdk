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

package com.ibm.cloud.watsonxdata.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SecretDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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
    SecretDetails secretDetailsModel = new SecretDetails.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();
    assertEquals(secretDetailsModel.key(), "secret key");
    assertEquals(secretDetailsModel.secretName(), "secret name");
    assertEquals(secretDetailsModel.secretUrn(), "secret urn");

    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("<access_key>")
      .accessKeyVault(secretDetailsModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("iam")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .mrapArn("arn:aws:s3::123456789012:accesspoint/mrap/mrapName")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9")
      .sasToken("<sas-token>")
      .secretKey("secret_key")
      .secretKeyVault(secretDetailsModel)
      .vaultEnabled(true)
      .build();
    assertEquals(storageDetailsModel.accessKey(), "<access_key>");
    assertEquals(storageDetailsModel.accessKeyVault(), secretDetailsModel);
    assertEquals(storageDetailsModel.accountName(), "sample-storage");
    assertEquals(storageDetailsModel.applicationId(), "application-id");
    assertEquals(storageDetailsModel.authMode(), "iam");
    assertEquals(storageDetailsModel.containerName(), "sample-container");
    assertEquals(storageDetailsModel.directoryId(), "directory-id");
    assertEquals(storageDetailsModel.endpoint(), "https://s3.us-south.cloud-object-storage.appdomain.cloud/");
    assertEquals(storageDetailsModel.keyFile(), "key_file");
    assertEquals(storageDetailsModel.mrapArn(), "arn:aws:s3::123456789012:accesspoint/mrap/mrapName");
    assertEquals(storageDetailsModel.name(), "sample-storage");
    assertEquals(storageDetailsModel.provider(), "ibm-cos");
    assertEquals(storageDetailsModel.region(), "us-south");
    assertEquals(storageDetailsModel.roleArn(), "arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9");
    assertEquals(storageDetailsModel.sasToken(), "<sas-token>");
    assertEquals(storageDetailsModel.secretKey(), "secret_key");
    assertEquals(storageDetailsModel.secretKeyVault(), secretDetailsModel);
    assertEquals(storageDetailsModel.vaultEnabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(storageDetailsModel);

    StorageDetails storageDetailsModelNew = TestUtilities.deserialize(json, StorageDetails.class);
    assertTrue(storageDetailsModelNew instanceof StorageDetails);
    assertEquals(storageDetailsModelNew.accessKey(), "<access_key>");
    assertEquals(storageDetailsModelNew.accessKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(storageDetailsModelNew.accountName(), "sample-storage");
    assertEquals(storageDetailsModelNew.applicationId(), "application-id");
    assertEquals(storageDetailsModelNew.authMode(), "iam");
    assertEquals(storageDetailsModelNew.containerName(), "sample-container");
    assertEquals(storageDetailsModelNew.directoryId(), "directory-id");
    assertEquals(storageDetailsModelNew.endpoint(), "https://s3.us-south.cloud-object-storage.appdomain.cloud/");
    assertEquals(storageDetailsModelNew.keyFile(), "key_file");
    assertEquals(storageDetailsModelNew.mrapArn(), "arn:aws:s3::123456789012:accesspoint/mrap/mrapName");
    assertEquals(storageDetailsModelNew.name(), "sample-storage");
    assertEquals(storageDetailsModelNew.provider(), "ibm-cos");
    assertEquals(storageDetailsModelNew.region(), "us-south");
    assertEquals(storageDetailsModelNew.roleArn(), "arn:aws:iam::5ssdd5467-002c-a4f8cac3f3f9");
    assertEquals(storageDetailsModelNew.sasToken(), "<sas-token>");
    assertEquals(storageDetailsModelNew.secretKey(), "secret_key");
    assertEquals(storageDetailsModelNew.secretKeyVault().toString(), secretDetailsModel.toString());
    assertEquals(storageDetailsModelNew.vaultEnabled(), Boolean.valueOf(true));
  }
}