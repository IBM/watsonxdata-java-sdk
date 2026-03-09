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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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
      .password("samplepassword")
      .xProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
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
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.xProperties(), java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel));
    assertEquals(databaseRegistrationPatchDatabaseDetailsModel.username(), "sampleuser");

    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file content")
      .fileName("test.json")
      .schemaName("customer")
      .tableName("customer")
      .build();
    assertEquals(databaseRegistrationPatchTablesItemsModel.createdAt(), "1686792721");
    assertEquals(databaseRegistrationPatchTablesItemsModel.fileContents(), "sample file content");
    assertEquals(databaseRegistrationPatchTablesItemsModel.fileName(), "test.json");
    assertEquals(databaseRegistrationPatchTablesItemsModel.schemaName(), "customer");
    assertEquals(databaseRegistrationPatchTablesItemsModel.tableName(), "customer");

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file contents")
      .fileName("test.json")
      .topicName("customer")
      .build();
    assertEquals(databaseRegistrationPatchTopicsItemsModel.createdAt(), "1686792721");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.fileContents(), "sample file contents");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.fileName(), "test.json");
    assertEquals(databaseRegistrationPatchTopicsItemsModel.topicName(), "customer");

    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .connection(databaseRegistrationPatchDatabaseDetailsModel)
      .description("External database description")
      .displayName("new_database")
      .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();
    assertEquals(databaseRegistrationPatchModel.connection(), databaseRegistrationPatchDatabaseDetailsModel);
    assertEquals(databaseRegistrationPatchModel.description(), "External database description");
    assertEquals(databaseRegistrationPatchModel.displayName(), "new_database");
    assertEquals(databaseRegistrationPatchModel.tables(), java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel));
    assertEquals(databaseRegistrationPatchModel.tags(), java.util.Arrays.asList("testdatabase", "userdatabase"));
    assertEquals(databaseRegistrationPatchModel.topics(), java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel));

    String json = TestUtilities.serialize(databaseRegistrationPatchModel);

    DatabaseRegistrationPatch databaseRegistrationPatchModelNew = TestUtilities.deserialize(json, DatabaseRegistrationPatch.class);
    assertTrue(databaseRegistrationPatchModelNew instanceof DatabaseRegistrationPatch);
    assertEquals(databaseRegistrationPatchModelNew.connection().toString(), databaseRegistrationPatchDatabaseDetailsModel.toString());
    assertEquals(databaseRegistrationPatchModelNew.description(), "External database description");
    assertEquals(databaseRegistrationPatchModelNew.displayName(), "new_database");
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
      .password("samplepassword")
      .xProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
      .username("sampleuser")
      .build();

    DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItemsModel = new DatabaseRegistrationPatchTablesItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file content")
      .fileName("test.json")
      .schemaName("customer")
      .tableName("customer")
      .build();

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModel = new DatabaseRegistrationPatchTopicsItems.Builder()
      .createdAt("1686792721")
      .fileContents("sample file contents")
      .fileName("test.json")
      .topicName("customer")
      .build();

    DatabaseRegistrationPatch databaseRegistrationPatchModel = new DatabaseRegistrationPatch.Builder()
      .connection(databaseRegistrationPatchDatabaseDetailsModel)
      .description("External database description")
      .displayName("new_database")
      .tables(java.util.Arrays.asList(databaseRegistrationPatchTablesItemsModel))
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .topics(java.util.Arrays.asList(databaseRegistrationPatchTopicsItemsModel))
      .build();

    Map<String, Object> mergePatch = databaseRegistrationPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("connection"));
    assertEquals(mergePatch.get("description"), "External database description");
    assertEquals(mergePatch.get("display_name"), "new_database");
    assertTrue(mergePatch.containsKey("tables"));
    assertTrue(mergePatch.containsKey("tags"));
    assertTrue(mergePatch.containsKey("topics"));
  }

}