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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
    assertNull(databaseRegistrationModel.getCreatedBy());
    assertNull(databaseRegistrationModel.getCreatedOn());
    assertNull(databaseRegistrationModel.getDatabaseDetails());
    assertNull(databaseRegistrationModel.getDatabaseDisplayName());
    assertNull(databaseRegistrationModel.getDatabaseId());
    assertNull(databaseRegistrationModel.getDatabaseProperties());
    assertNull(databaseRegistrationModel.getDatabaseType());
    assertNull(databaseRegistrationModel.getTables());
    assertNull(databaseRegistrationModel.getDescription());
    assertNull(databaseRegistrationModel.getTags());
    assertNull(databaseRegistrationModel.getTopics());
  }
}