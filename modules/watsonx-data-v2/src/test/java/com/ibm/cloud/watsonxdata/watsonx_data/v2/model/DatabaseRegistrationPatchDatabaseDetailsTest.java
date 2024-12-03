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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseRegistrationPatchDatabaseDetails model.
 */
public class DatabaseRegistrationPatchDatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseRegistrationPatchDatabaseDetails() throws Throwable {
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

    String json = TestUtilities.serialize(databaseRegistrationPatchDatabaseDetailsModel);

    DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetailsModelNew = TestUtilities.deserialize(json, DatabaseRegistrationPatchDatabaseDetails.class);
    assertTrue(databaseRegistrationPatchDatabaseDetailsModelNew instanceof DatabaseRegistrationPatchDatabaseDetails);
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.authenticationValue(), "LDAP");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.password(), "samplepassword");
    assertEquals(databaseRegistrationPatchDatabaseDetailsModelNew.username(), "sampleuser");
  }
}