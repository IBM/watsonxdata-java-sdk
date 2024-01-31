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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DatabaseDetails model.
 */
public class DatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDatabaseDetails() throws Throwable {
    DatabaseDetails databaseDetailsModel = new DatabaseDetails.Builder()
      .certificate("contents of a pem/crt file")
      .certificateExtension("pem/crt")
      .databaseName("new_database")
      .hostname("db2@<hostname>.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .sasl(true)
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .validateServerCertificate(true)
      .build();
    assertEquals(databaseDetailsModel.certificate(), "contents of a pem/crt file");
    assertEquals(databaseDetailsModel.certificateExtension(), "pem/crt");
    assertEquals(databaseDetailsModel.databaseName(), "new_database");
    assertEquals(databaseDetailsModel.hostname(), "db2@<hostname>.com");
    assertEquals(databaseDetailsModel.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsModel.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsModel.password(), "samplepassword");
    assertEquals(databaseDetailsModel.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.tables(), "kafka_table_name");
    assertEquals(databaseDetailsModel.username(), "sampleuser");
    assertEquals(databaseDetailsModel.validateServerCertificate(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(databaseDetailsModel);

    DatabaseDetails databaseDetailsModelNew = TestUtilities.deserialize(json, DatabaseDetails.class);
    assertTrue(databaseDetailsModelNew instanceof DatabaseDetails);
    assertEquals(databaseDetailsModelNew.certificate(), "contents of a pem/crt file");
    assertEquals(databaseDetailsModelNew.certificateExtension(), "pem/crt");
    assertEquals(databaseDetailsModelNew.databaseName(), "new_database");
    assertEquals(databaseDetailsModelNew.hostname(), "db2@<hostname>.com");
    assertEquals(databaseDetailsModelNew.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsModelNew.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsModelNew.password(), "samplepassword");
    assertEquals(databaseDetailsModelNew.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModelNew.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModelNew.tables(), "kafka_table_name");
    assertEquals(databaseDetailsModelNew.username(), "sampleuser");
    assertEquals(databaseDetailsModelNew.validateServerCertificate(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDatabaseDetailsError() throws Throwable {
    new DatabaseDetails.Builder().build();
  }

}