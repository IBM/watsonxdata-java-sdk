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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchTopicsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseRegistrationPatchTopicsItems model.
 */
public class DatabaseRegistrationPatchTopicsItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseRegistrationPatchTopicsItems() throws Throwable {
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

    String json = TestUtilities.serialize(databaseRegistrationPatchTopicsItemsModel);

    DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItemsModelNew = TestUtilities.deserialize(json, DatabaseRegistrationPatchTopicsItems.class);
    assertTrue(databaseRegistrationPatchTopicsItemsModelNew instanceof DatabaseRegistrationPatchTopicsItems);
    assertEquals(databaseRegistrationPatchTopicsItemsModelNew.createdOn(), "1686792721");
    assertEquals(databaseRegistrationPatchTopicsItemsModelNew.fileContents(), "sample file contents");
    assertEquals(databaseRegistrationPatchTopicsItemsModelNew.fileName(), "sample file name");
    assertEquals(databaseRegistrationPatchTopicsItemsModelNew.topicName(), "customer");
  }
}