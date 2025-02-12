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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems model.
 */
public class DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems() throws Throwable {
    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("hive.metastore")
      .value("glue")
      .build();
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.encrypt(), Boolean.valueOf(true));
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.key(), "hive.metastore");
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.value(), "glue");

    String json = TestUtilities.serialize(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel);

    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModelNew = TestUtilities.deserialize(json, DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.class);
    assertTrue(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModelNew instanceof DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems);
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModelNew.encrypt(), Boolean.valueOf(true));
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModelNew.key(), "hive.metastore");
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModelNew.value(), "glue");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsError() throws Throwable {
    new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder().build();
  }

}