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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CatalogEngineAssociationPatchObjectPrototype;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogEngineAssociationPatchObjectPrototype model.
 */
public class CatalogEngineAssociationPatchObjectPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogEngineAssociationPatchObjectPrototype() throws Throwable {
    CatalogEngineAssociationPatchObjectPrototype catalogEngineAssociationPatchObjectPrototypeModel = new CatalogEngineAssociationPatchObjectPrototype.Builder()
      .action("add")
      .catalogName("hive_data")
      .engineId("spark762")
      .build();
    assertEquals(catalogEngineAssociationPatchObjectPrototypeModel.action(), "add");
    assertEquals(catalogEngineAssociationPatchObjectPrototypeModel.catalogName(), "hive_data");
    assertEquals(catalogEngineAssociationPatchObjectPrototypeModel.engineId(), "spark762");

    String json = TestUtilities.serialize(catalogEngineAssociationPatchObjectPrototypeModel);

    CatalogEngineAssociationPatchObjectPrototype catalogEngineAssociationPatchObjectPrototypeModelNew = TestUtilities.deserialize(json, CatalogEngineAssociationPatchObjectPrototype.class);
    assertTrue(catalogEngineAssociationPatchObjectPrototypeModelNew instanceof CatalogEngineAssociationPatchObjectPrototype);
    assertEquals(catalogEngineAssociationPatchObjectPrototypeModelNew.action(), "add");
    assertEquals(catalogEngineAssociationPatchObjectPrototypeModelNew.catalogName(), "hive_data");
    assertEquals(catalogEngineAssociationPatchObjectPrototypeModelNew.engineId(), "spark762");
  }
}