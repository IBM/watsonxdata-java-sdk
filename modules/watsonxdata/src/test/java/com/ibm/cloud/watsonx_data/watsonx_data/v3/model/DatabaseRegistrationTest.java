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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseCatalog;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistration;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationTablesItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.DatabaseRegistrationTopicsItems;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseRegistration model.
 */
public class DatabaseRegistrationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseRegistration() throws Throwable {
    DatabaseRegistration databaseRegistrationModel = new DatabaseRegistration();
    assertNull(databaseRegistrationModel.getActions());
    assertNull(databaseRegistrationModel.getAssociatedCatalog());
    assertNull(databaseRegistrationModel.getCatalogName());
    assertNull(databaseRegistrationModel.getConnection());
    assertNull(databaseRegistrationModel.getCreatedAt());
    assertNull(databaseRegistrationModel.getCreatedBy());
    assertNull(databaseRegistrationModel.getDescription());
    assertNull(databaseRegistrationModel.getDisplayName());
    assertNull(databaseRegistrationModel.getId());
    assertNull(databaseRegistrationModel.getXProperties());
    assertNull(databaseRegistrationModel.getTables());
    assertNull(databaseRegistrationModel.getTags());
    assertNull(databaseRegistrationModel.getTopics());
    assertNull(databaseRegistrationModel.getType());
    assertNull(databaseRegistrationModel.isVaultEnabled());
  }
}