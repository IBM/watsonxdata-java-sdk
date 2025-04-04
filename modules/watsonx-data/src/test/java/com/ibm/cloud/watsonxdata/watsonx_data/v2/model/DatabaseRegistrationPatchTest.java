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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseRegistrationPatch model.
 */
public class DatabaseRegistrationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseRegistrationPatch() throws Throwable {
    DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
      .password("samplepassword")
      .username("sampleuser")
      .build();
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.username(), "sampleuser");

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdOn("1686792721")
      .fileContents("sample file contents")
      .fileName("sample file name")
      .topicName("customer")
      .build();
    assertEquals(databaseRegistrationPatchTopicsItemsModel.createdOn(), "1686792721");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.fileContents(), "sample file contents");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.fileName(), "sample file name");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.topicName(), "customer");

    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .databaseDetails(databaseRegistrationPatchDatabaseDetailsModel)
      .databaseDisplayName("new_database")
      .description("External database description")
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();
    assertEquals(databaseRegistrationPatchModel.databaseDetails(), databaseRegistrationPatchDatabaseDetailsModel);
    assertEquals(databaseRegistrationPatchModel.databaseDisplayName(), "new_database");
    assertEquals(databaseRegistrationPatchModel.description(), "External database description");
    assertEquals(databaseRegistrationPatchModel.tags(), java.util.Arrays.asList("testdatabase", "userdatabase"));
    assertEquals(databaseRegistrationPatchModel.topics(), java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel));

    String json = TestUtilities.serialize(databaseRegistrationPatchModel);

    DatabaseRegistrationPatch databaseRegistrationPatchModelNew = TestUtilities.deserialize(json, DatabaseRegistrationPatch.class);
    assertTrue(databaseRegistrationPatchModelNew instanceof DatabaseRegistrationPatch);
    assertEquals(databaseRegistrationPatchModelNew.databaseDetails().toString(), databaseRegistrationPatchDatabaseDetailsModel.toString());
    assertEquals(databaseRegistrationPatchModelNew.databaseDisplayName(), "new_database");
    assertEquals(databaseRegistrationPatchModelNew.description(), "External database description");
  }
  @Test
  public void testDatabaseRegistrationPatchAsPatch() throws Throwable {
    DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
      .password("samplepassword")
      .username("sampleuser")
      .build();

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdOn("1686792721")
      .fileContents("sample file contents")
      .fileName("sample file name")
      .topicName("customer")
      .build();

    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .databaseDetails(databaseRegistrationPatchDatabaseDetailsModel)
      .databaseDisplayName("new_database")
      .description("External database description")
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();

    Map<String, Object> mergePatch = databaseRegistrationPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("database_details"));
    assertEquals(mergePatch.get("database_display_name"), "new_database");
    assertEquals(mergePatch.get("description"), "External database description");
    assertTrue(mergePatch.containsKey("tags"));
    assertTrue(mergePatch.containsKey("topics"));
  }

}