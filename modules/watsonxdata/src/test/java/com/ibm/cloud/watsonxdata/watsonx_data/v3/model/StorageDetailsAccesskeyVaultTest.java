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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageDetailsAccesskeyVault;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StorageDetailsAccesskeyVault model.
 */
public class StorageDetailsAccesskeyVaultTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStorageDetailsAccesskeyVault() throws Throwable {
    StorageDetailsAccesskeyVault storageDetailsAccesskeyVaultModel = new StorageDetailsAccesskeyVault.Builder()
      .key("secret key")
      .secretName("secret name")
      .secretUrn("secret urn")
      .build();
    assertEquals(storageDetailsAccesskeyVaultModel.key(), "secret key");
    assertEquals(storageDetailsAccesskeyVaultModel.secretName(), "secret name");
    assertEquals(storageDetailsAccesskeyVaultModel.secretUrn(), "secret urn");

    String json = TestUtilities.serialize(storageDetailsAccesskeyVaultModel);

    StorageDetailsAccesskeyVault storageDetailsAccesskeyVaultModelNew = TestUtilities.deserialize(json, StorageDetailsAccesskeyVault.class);
    assertTrue(storageDetailsAccesskeyVaultModelNew instanceof StorageDetailsAccesskeyVault);
    assertEquals(storageDetailsAccesskeyVaultModelNew.key(), "secret key");
    assertEquals(storageDetailsAccesskeyVaultModelNew.secretName(), "secret name");
    assertEquals(storageDetailsAccesskeyVaultModelNew.secretUrn(), "secret urn");
  }
}