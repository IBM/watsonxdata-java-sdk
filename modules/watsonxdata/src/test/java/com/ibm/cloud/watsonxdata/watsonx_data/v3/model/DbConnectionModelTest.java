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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DbConnectionModel;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DbConnectionModel model.
 */
public class DbConnectionModelTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDbConnectionModel() throws Throwable {
    DbConnectionModel dbConnectionModelModel = new DbConnectionModel.Builder()
      .databaseId("testString")
      .dbType("testString")
      .host("testString")
      .port("testString")
      .dbName("testString")
      .dbUsername("testString")
      .password("testString")
      .authenticationValue("testString")
      .isSsl(false)
      .certExtension("testString")
      .certContent("testString")
      .connectionMode("testString")
      .connectionModeValue("testString")
      .jdbcUrl("testString")
      .build();
    assertEquals(dbConnectionModelModel.databaseId(), "testString");
    assertEquals(dbConnectionModelModel.dbType(), "testString");
    assertEquals(dbConnectionModelModel.host(), "testString");
    assertEquals(dbConnectionModelModel.port(), "testString");
    assertEquals(dbConnectionModelModel.dbName(), "testString");
    assertEquals(dbConnectionModelModel.dbUsername(), "testString");
    assertEquals(dbConnectionModelModel.password(), "testString");
    assertEquals(dbConnectionModelModel.authenticationValue(), "testString");
    assertEquals(dbConnectionModelModel.isSsl(), Boolean.valueOf(false));
    assertEquals(dbConnectionModelModel.certExtension(), "testString");
    assertEquals(dbConnectionModelModel.certContent(), "testString");
    assertEquals(dbConnectionModelModel.connectionMode(), "testString");
    assertEquals(dbConnectionModelModel.connectionModeValue(), "testString");
    assertEquals(dbConnectionModelModel.jdbcUrl(), "testString");

    String json = TestUtilities.serialize(dbConnectionModelModel);

    DbConnectionModel dbConnectionModelModelNew = TestUtilities.deserialize(json, DbConnectionModel.class);
    assertTrue(dbConnectionModelModelNew instanceof DbConnectionModel);
    assertEquals(dbConnectionModelModelNew.databaseId(), "testString");
    assertEquals(dbConnectionModelModelNew.dbType(), "testString");
    assertEquals(dbConnectionModelModelNew.host(), "testString");
    assertEquals(dbConnectionModelModelNew.port(), "testString");
    assertEquals(dbConnectionModelModelNew.dbName(), "testString");
    assertEquals(dbConnectionModelModelNew.dbUsername(), "testString");
    assertEquals(dbConnectionModelModelNew.password(), "testString");
    assertEquals(dbConnectionModelModelNew.authenticationValue(), "testString");
    assertEquals(dbConnectionModelModelNew.isSsl(), Boolean.valueOf(false));
    assertEquals(dbConnectionModelModelNew.certExtension(), "testString");
    assertEquals(dbConnectionModelModelNew.certContent(), "testString");
    assertEquals(dbConnectionModelModelNew.connectionMode(), "testString");
    assertEquals(dbConnectionModelModelNew.connectionModeValue(), "testString");
    assertEquals(dbConnectionModelModelNew.jdbcUrl(), "testString");
  }
}