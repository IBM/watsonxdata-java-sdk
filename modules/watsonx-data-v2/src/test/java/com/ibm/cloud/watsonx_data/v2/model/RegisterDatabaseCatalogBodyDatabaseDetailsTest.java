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
import com.ibm.cloud.watsonx_data.v2.model.RegisterDatabaseCatalogBodyDatabaseDetails;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RegisterDatabaseCatalogBodyDatabaseDetails model.
 */
public class RegisterDatabaseCatalogBodyDatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRegisterDatabaseCatalogBodyDatabaseDetails() throws Throwable {
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

    String json = TestUtilities.serialize(registerDatabaseCatalogBodyDatabaseDetailsModel);

    RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModelNew = TestUtilities.deserialize(json, RegisterDatabaseCatalogBodyDatabaseDetails.class);
    assertTrue(registerDatabaseCatalogBodyDatabaseDetailsModelNew instanceof RegisterDatabaseCatalogBodyDatabaseDetails);
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.certificate(), "contents of a pem/crt file");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.certificateExtension(), "pem/crt");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.databaseName(), "new_database");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.hostname(), "db2@<hostname>.com");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.password(), "samplepassword");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.port(), Long.valueOf("4553"));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.sasl(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.tables(), "kafka_table_name");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.username(), "sampleuser");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterDatabaseCatalogBodyDatabaseDetailsError() throws Throwable {
    new RegisterDatabaseCatalogBodyDatabaseDetails.Builder().build();
  }

}