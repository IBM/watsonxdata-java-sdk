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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageDetailsAccessKeyVault;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageRegistrationPatch;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StorageRegistrationPatch model.
 */
public class StorageRegistrationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStorageRegistrationPatch() throws Throwable {
    StorageDetailsAccessKeyVault storageDetailsAccessKeyVaultModel = new StorageDetailsAccessKeyVault.Builder()
      .key("access_key")
      .secretName("my-secret'name123")
      .secretUrn("12345:my-secret'name123")
      .build();
    assertEquals(storageDetailsAccessKeyVaultModel.key(), "access_key");
    assertEquals(storageDetailsAccessKeyVaultModel.secretName(), "my-secret'name123");
    assertEquals(storageDetailsAccessKeyVaultModel.secretUrn(), "12345:my-secret'name123");

    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("access_key")
      .accessKeyVault(storageDetailsAccessKeyVaultModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("hmac")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .mrapArn("arn:aws:s3::123456789012:accesspoint/mrap/mrapName")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::123456789012:role/my-role-name")
      .secretKey("secret_key")
      .secretKeyVault(storageDetailsAccessKeyVaultModel)
      .vaultEnabled(true)
      .build();
    assertEquals(storageDetailsModel.accessKey(), "access_key");
    assertEquals(storageDetailsModel.accessKeyVault(), storageDetailsAccessKeyVaultModel);
    assertEquals(storageDetailsModel.accountName(), "sample-storage");
    assertEquals(storageDetailsModel.applicationId(), "application-id");
    assertEquals(storageDetailsModel.authMode(), "hmac");
    assertEquals(storageDetailsModel.containerName(), "sample-container");
    assertEquals(storageDetailsModel.directoryId(), "directory-id");
    assertEquals(storageDetailsModel.endpoint(), "https://s3.us-south.cloud-object-storage.appdomain.cloud/");
    assertEquals(storageDetailsModel.keyFile(), "key_file");
    assertEquals(storageDetailsModel.mrapArn(), "arn:aws:s3::123456789012:accesspoint/mrap/mrapName");
    assertEquals(storageDetailsModel.name(), "sample-storage");
    assertEquals(storageDetailsModel.provider(), "ibm-cos");
    assertEquals(storageDetailsModel.region(), "us-south");
    assertEquals(storageDetailsModel.roleArn(), "arn:aws:iam::123456789012:role/my-role-name");
    assertEquals(storageDetailsModel.secretKey(), "secret_key");
    assertEquals(storageDetailsModel.secretKeyVault(), storageDetailsAccessKeyVaultModel);
    assertEquals(storageDetailsModel.vaultEnabled(), Boolean.valueOf(true));

    StorageRegistrationPatch storageRegistrationPatchModel = new StorageRegistrationPatch.Builder()
      .connection(storageDetailsModel)
      .description("COS storage for customer data")
      .displayName("sample-storage-displayname")
      .systemStorageUpdateCredentials(true)
      .tags(java.util.Arrays.asList("storage-tag1", "storage-tag2"))
      .build();
    assertEquals(storageRegistrationPatchModel.connection(), storageDetailsModel);
    assertEquals(storageRegistrationPatchModel.description(), "COS storage for customer data");
    assertEquals(storageRegistrationPatchModel.displayName(), "sample-storage-displayname");
    assertEquals(storageRegistrationPatchModel.systemStorageUpdateCredentials(), Boolean.valueOf(true));
    assertEquals(storageRegistrationPatchModel.tags(), java.util.Arrays.asList("storage-tag1", "storage-tag2"));

    String json = TestUtilities.serialize(storageRegistrationPatchModel);

    StorageRegistrationPatch storageRegistrationPatchModelNew = TestUtilities.deserialize(json, StorageRegistrationPatch.class);
    assertTrue(storageRegistrationPatchModelNew instanceof StorageRegistrationPatch);
    assertEquals(storageRegistrationPatchModelNew.connection().toString(), storageDetailsModel.toString());
    assertEquals(storageRegistrationPatchModelNew.description(), "COS storage for customer data");
    assertEquals(storageRegistrationPatchModelNew.displayName(), "sample-storage-displayname");
    assertEquals(storageRegistrationPatchModelNew.systemStorageUpdateCredentials(), Boolean.valueOf(true));
  }
  @Test
  public void testStorageRegistrationPatchAsPatch() throws Throwable {
    StorageDetailsAccessKeyVault storageDetailsAccessKeyVaultModel = new StorageDetailsAccessKeyVault.Builder()
      .key("access_key")
      .secretName("my-secret'name123")
      .secretUrn("12345:my-secret'name123")
      .build();

    StorageDetails storageDetailsModel = new StorageDetails.Builder()
      .accessKey("access_key")
      .accessKeyVault(storageDetailsAccessKeyVaultModel)
      .accountName("sample-storage")
      .applicationId("application-id")
      .authMode("hmac")
      .containerName("sample-container")
      .directoryId("directory-id")
      .endpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud/")
      .keyFile("key_file")
      .mrapArn("arn:aws:s3::123456789012:accesspoint/mrap/mrapName")
      .name("sample-storage")
      .provider("ibm-cos")
      .region("us-south")
      .roleArn("arn:aws:iam::123456789012:role/my-role-name")
      .secretKey("secret_key")
      .secretKeyVault(storageDetailsAccessKeyVaultModel)
      .vaultEnabled(true)
      .build();

    StorageRegistrationPatch storageRegistrationPatchModel = new StorageRegistrationPatch.Builder()
      .connection(storageDetailsModel)
      .description("COS storage for customer data")
      .displayName("sample-storage-displayname")
      .systemStorageUpdateCredentials(true)
      .tags(java.util.Arrays.asList("storage-tag1", "storage-tag2"))
      .build();

    Map<String, Object> mergePatch = storageRegistrationPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("connection"));
    assertEquals(mergePatch.get("description"), "COS storage for customer data");
    assertEquals(mergePatch.get("display_name"), "sample-storage-displayname");
    assertTrue(mergePatch.containsKey("system_storage_update_credentials"));
    assertTrue(mergePatch.containsKey("tags"));
  }

}