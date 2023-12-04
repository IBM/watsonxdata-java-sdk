/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonx_data.v2.model.RegisterDatabaseCatalogBodyDatabaseDetails;
import com.ibm.cloud.watsonx_data.v2.model.RegisterDatabaseCatalogBodyDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDatabaseRegistrationOptions model.
 */
public class CreateDatabaseRegistrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDatabaseRegistrationOptions() throws Throwable {
    RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModel = new RegisterDatabaseCatalogBodyDatabaseDetails.Builder()
      .certificate("contents of a pem/crt file")
      .certificateExtension("pem/crt")
      .databaseName("new_database")
      .hostname("db2@<hostname>.com")
      .hosts("abc.com:1234,xyz.com:4321")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .sasl(true)
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .build();
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.certificate(), "contents of a pem/crt file");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.certificateExtension(), "pem/crt");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.databaseName(), "new_database");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.hostname(), "db2@<hostname>.com");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.port(), Long.valueOf("4553"));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.sasl(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.tables(), "kafka_table_name");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.username(), "sampleuser");

    RegisterDatabaseCatalogBodyDatabasePropertiesItems registerDatabaseCatalogBodyDatabasePropertiesItemsModel = new RegisterDatabaseCatalogBodyDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModel.encrypt(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModel.key(), "abc");
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModel.value(), "xyz");

    CreateDatabaseRegistrationOptions createDatabaseRegistrationOptionsModel = new CreateDatabaseRegistrationOptions.Builder()
      .catalogName("sampleCatalog")
      .databaseDisplayName("new_database")
      .databaseType("db2")
      .createdOn(Long.valueOf("26"))
      .databaseDetails(registerDatabaseCatalogBodyDatabaseDetailsModel)
      .databaseProperties(java.util.Arrays.asList(registerDatabaseCatalogBodyDatabasePropertiesItemsModel))
      .description("db2 extenal database description")
      .tags(java.util.Arrays.asList("tag_1", "tag_2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createDatabaseRegistrationOptionsModel.catalogName(), "sampleCatalog");
    assertEquals(createDatabaseRegistrationOptionsModel.databaseDisplayName(), "new_database");
    assertEquals(createDatabaseRegistrationOptionsModel.databaseType(), "db2");
    assertEquals(createDatabaseRegistrationOptionsModel.createdOn(), Long.valueOf("26"));
    assertEquals(createDatabaseRegistrationOptionsModel.databaseDetails(), registerDatabaseCatalogBodyDatabaseDetailsModel);
    assertEquals(createDatabaseRegistrationOptionsModel.databaseProperties(), java.util.Arrays.asList(registerDatabaseCatalogBodyDatabasePropertiesItemsModel));
    assertEquals(createDatabaseRegistrationOptionsModel.description(), "db2 extenal database description");
    assertEquals(createDatabaseRegistrationOptionsModel.tags(), java.util.Arrays.asList("tag_1", "tag_2"));
    assertEquals(createDatabaseRegistrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatabaseRegistrationOptionsError() throws Throwable {
    new CreateDatabaseRegistrationOptions.Builder().build();
  }

}