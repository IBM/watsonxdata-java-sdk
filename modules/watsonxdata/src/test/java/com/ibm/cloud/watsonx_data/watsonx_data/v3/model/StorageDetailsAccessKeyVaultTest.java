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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.StorageDetailsAccessKeyVault;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StorageDetailsAccessKeyVault model.
 */
public class StorageDetailsAccessKeyVaultTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStorageDetailsAccessKeyVault() throws Throwable {
    StorageDetailsAccessKeyVault storageDetailsAccessKeyVaultModel = new StorageDetailsAccessKeyVault.Builder()
      .key("access_key")
      .secretName("my-secret'name123")
      .secretUrn("12345:my-secret'name123")
      .build();
    assertEquals(storageDetailsAccessKeyVaultModel.key(), "access_key");
    assertEquals(storageDetailsAccessKeyVaultModel.secretName(), "my-secret'name123");
    assertEquals(storageDetailsAccessKeyVaultModel.secretUrn(), "12345:my-secret'name123");

    String json = TestUtilities.serialize(storageDetailsAccessKeyVaultModel);

    StorageDetailsAccessKeyVault storageDetailsAccessKeyVaultModelNew = TestUtilities.deserialize(json, StorageDetailsAccessKeyVault.class);
    assertTrue(storageDetailsAccessKeyVaultModelNew instanceof StorageDetailsAccessKeyVault);
    assertEquals(storageDetailsAccessKeyVaultModelNew.key(), "access_key");
    assertEquals(storageDetailsAccessKeyVaultModelNew.secretName(), "my-secret'name123");
    assertEquals(storageDetailsAccessKeyVaultModelNew.secretUrn(), "12345:my-secret'name123");
  }
}