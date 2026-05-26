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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Catalogs model.
 */
public class CatalogsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogs() throws Throwable {
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();
    assertEquals(catalogsModel.catalogNames(), java.util.Arrays.asList("iceberg_data", "hive_data"));

    String json = TestUtilities.serialize(catalogsModel);

    Catalogs catalogsModelNew = TestUtilities.deserialize(json, Catalogs.class);
    assertTrue(catalogsModelNew instanceof Catalogs);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCatalogsError() throws Throwable {
    new Catalogs.Builder().build();
  }

}