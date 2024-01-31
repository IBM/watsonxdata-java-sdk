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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ValidateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ValidateDatabaseBodyDatabaseDetails model.
 */
public class ValidateDatabaseBodyDatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testValidateDatabaseBodyDatabaseDetails() throws Throwable {
    ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModel = new ValidateDatabaseBodyDatabaseDetails.Builder()
      .databaseName("sampledatabase")
      .hostname("db2@hostname.com")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .sasl(true)
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .validateServerCertificate(true)
      .build();
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.databaseName(), "sampledatabase");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.hostname(), "db2@hostname.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.port(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.sasl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.tables(), "kafka_table_name");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.username(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModel.validateServerCertificate(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(validateDatabaseBodyDatabaseDetailsModel);

    ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetailsModelNew = TestUtilities.deserialize(json, ValidateDatabaseBodyDatabaseDetails.class);
    assertTrue(validateDatabaseBodyDatabaseDetailsModelNew instanceof ValidateDatabaseBodyDatabaseDetails);
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.databaseName(), "sampledatabase");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.hostname(), "db2@hostname.com");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.password(), "samplepassword");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.port(), Long.valueOf("4553"));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.sasl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.tables(), "kafka_table_name");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.username(), "sampleuser");
    assertEquals(validateDatabaseBodyDatabaseDetailsModelNew.validateServerCertificate(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateDatabaseBodyDatabaseDetailsError() throws Throwable {
    new ValidateDatabaseBodyDatabaseDetails.Builder().build();
  }

}