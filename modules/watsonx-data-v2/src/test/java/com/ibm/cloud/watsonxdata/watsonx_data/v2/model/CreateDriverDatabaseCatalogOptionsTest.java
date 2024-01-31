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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDriverDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDriverDatabaseCatalogOptions model.
 */
public class CreateDriverDatabaseCatalogOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDriverDatabaseCatalogOptions() throws Throwable {
    CreateDriverDatabaseCatalogOptions createDriverDatabaseCatalogOptionsModel = new CreateDriverDatabaseCatalogOptions.Builder()
      .driver(TestUtilities.createMockStream("This is a mock file."))
      .driverFileName("testString")
      .databaseDisplayName("testString")
      .databaseType("testString")
      .catalogName("testString")
      .hostname("testString")
      .port("testString")
      .username("testString")
      .password("testString")
      .databaseName("testString")
      .driverContentType("testString")
      .certificate("testString")
      .certificateExtension("testString")
      .ssl("testString")
      .description("testString")
      .createdOn("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(IOUtils.toString(createDriverDatabaseCatalogOptionsModel.driver()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(createDriverDatabaseCatalogOptionsModel.driverFileName(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.databaseDisplayName(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.databaseType(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.catalogName(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.hostname(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.port(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.username(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.password(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.databaseName(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.driverContentType(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.certificate(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.certificateExtension(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.ssl(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.description(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.createdOn(), "testString");
    assertEquals(createDriverDatabaseCatalogOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDriverDatabaseCatalogOptionsError() throws Throwable {
    new CreateDriverDatabaseCatalogOptions.Builder().build();
  }

}