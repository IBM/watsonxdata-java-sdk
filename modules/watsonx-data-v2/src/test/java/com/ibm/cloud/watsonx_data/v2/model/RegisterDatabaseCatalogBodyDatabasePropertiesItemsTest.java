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
import com.ibm.cloud.watsonx_data.v2.model.RegisterDatabaseCatalogBodyDatabasePropertiesItems;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RegisterDatabaseCatalogBodyDatabasePropertiesItems model.
 */
public class RegisterDatabaseCatalogBodyDatabasePropertiesItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRegisterDatabaseCatalogBodyDatabasePropertiesItems() throws Throwable {
    RegisterDatabaseCatalogBodyDatabasePropertiesItems registerDatabaseCatalogBodyDatabasePropertiesItemsModel = new RegisterDatabaseCatalogBodyDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("hive.metastore")
      .value("glue")
      .build();
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModel.encrypt(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModel.key(), "hive.metastore");
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModel.value(), "glue");

    String json = TestUtilities.serialize(registerDatabaseCatalogBodyDatabasePropertiesItemsModel);

    RegisterDatabaseCatalogBodyDatabasePropertiesItems registerDatabaseCatalogBodyDatabasePropertiesItemsModelNew = TestUtilities.deserialize(json, RegisterDatabaseCatalogBodyDatabasePropertiesItems.class);
    assertTrue(registerDatabaseCatalogBodyDatabasePropertiesItemsModelNew instanceof RegisterDatabaseCatalogBodyDatabasePropertiesItems);
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModelNew.encrypt(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModelNew.key(), "hive.metastore");
    assertEquals(registerDatabaseCatalogBodyDatabasePropertiesItemsModelNew.value(), "glue");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterDatabaseCatalogBodyDatabasePropertiesItemsError() throws Throwable {
    new RegisterDatabaseCatalogBodyDatabasePropertiesItems.Builder().build();
  }

}