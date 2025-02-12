/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseRegistrationPatchTablesItems model.
 */
public class DatabaseRegistrationPatchTablesItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseRegistrationPatchTablesItems() throws Throwable {
    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
      .createdOn("1686792721")
      .fileContents("sample file content")
      .fileName("test.json")
      .schemaName("customer")
      .tableName("customer")
      .build();
    assertEquals(databaseRegistrationPatchTablesItemsModel.createdOn(), "1686792721");
    assertEquals(databaseRegistrationPatchTablesItemsModel.fileContents(), "sample file content");
    assertEquals(databaseRegistrationPatchTablesItemsModel.fileName(), "test.json");
    assertEquals(databaseRegistrationPatchTablesItemsModel.schemaName(), "customer");
    assertEquals(databaseRegistrationPatchTablesItemsModel.tableName(), "customer");

    String json = TestUtilities.serialize(databaseRegistrationPatchTablesItemsModel);

    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModelNew = TestUtilities.deserialize(json, DatabaseRegistrationPatchTablesItems.class);
    assertTrue(databaseRegistrationPatchTablesItemsModelNew instanceof DatabaseRegistrationPatchTablesItems);
    assertEquals(databaseRegistrationPatchTablesItemsModelNew.createdOn(), "1686792721");
    assertEquals(databaseRegistrationPatchTablesItemsModelNew.fileContents(), "sample file content");
    assertEquals(databaseRegistrationPatchTablesItemsModelNew.fileName(), "test.json");
    assertEquals(databaseRegistrationPatchTablesItemsModelNew.schemaName(), "customer");
    assertEquals(databaseRegistrationPatchTablesItemsModelNew.tableName(), "customer");
  }
}