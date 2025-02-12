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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTablesItems;
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
    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.encrypt(), Boolean.valueOf(true));
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.key(), "abc");
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.value(), "xyz");

    DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
      .authenticationValue("LDAP")
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .databaseProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
      .password("samplepassword")
      .username("sampleuser")
      .build();
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.authenticationValue(), "LDAP");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.databaseProperties(), java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel));
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.username(), "sampleuser");

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

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdOn("1686792721")
      .fileContents("sample file contents")
      .fileName("test.json")
      .topicName("customer")
      .build();
    assertEquals(databaseRegistrationPatchTopicsItemsModel.createdOn(), "1686792721");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.fileContents(), "sample file contents");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.fileName(), "test.json");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.topicName(), "customer");

    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .databaseDetails(databaseRegistrationPatchDatabaseDetailsModel)
      .databaseDisplayName("new_database")
      .description("External database description")
      .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();
    assertEquals(databaseRegistrationPatchModel.databaseDetails(), databaseRegistrationPatchDatabaseDetailsModel);
    assertEquals(databaseRegistrationPatchModel.databaseDisplayName(), "new_database");
    assertEquals(databaseRegistrationPatchModel.description(), "External database description");
    assertEquals(databaseRegistrationPatchModel.tables(), java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel));
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
    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();

    DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModel = new DatabaseRegistrationPatchDatabaseDetails.Builder()
      .authenticationValue("LDAP")
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .databaseProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
      .password("samplepassword")
      .username("sampleuser")
      .build();

    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
      .createdOn("1686792721")
      .fileContents("sample file content")
      .fileName("test.json")
      .schemaName("customer")
      .tableName("customer")
      .build();

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdOn("1686792721")
      .fileContents("sample file contents")
      .fileName("test.json")
      .topicName("customer")
      .build();

    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .databaseDetails(databaseRegistrationPatchDatabaseDetailsModel)
      .databaseDisplayName("new_database")
      .description("External database description")
      .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();

    Map<String, Object> mergePatch = databaseRegistrationPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("database_details"));
    assertEquals(mergePatch.get("database_display_name"), "new_database");
    assertEquals(mergePatch.get("description"), "External database description");
    assertTrue(mergePatch.containsKey("tables"));
    assertTrue(mergePatch.containsKey("tags"));
    assertTrue(mergePatch.containsKey("topics"));
  }

}