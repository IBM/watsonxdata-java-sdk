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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.StorageRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StorageRegistration model.
 */
public class StorageRegistrationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStorageRegistration() throws Throwable {
    StorageRegistration storageRegistrationModel = new StorageRegistration();
    assertNull(storageRegistrationModel.getActions());
    assertNull(storageRegistrationModel.getAssociatedCatalogs());
    assertNull(storageRegistrationModel.getConnection());
    assertNull(storageRegistrationModel.getCreatedAt());
    assertNull(storageRegistrationModel.getCreatedBy());
    assertNull(storageRegistrationModel.getDescription());
    assertNull(storageRegistrationModel.getDisplayName());
    assertNull(storageRegistrationModel.getId());
    assertNull(storageRegistrationModel.getManagedBy());
    assertNull(storageRegistrationModel.getRegion());
    assertNull(storageRegistrationModel.getState());
    assertNull(storageRegistrationModel.getStorageUse());
    assertNull(storageRegistrationModel.isSystemStorageUpdateCredentials());
    assertNull(storageRegistrationModel.getTags());
    assertNull(storageRegistrationModel.getType());
    assertNull(storageRegistrationModel.isVaultEnabled());
  }
}