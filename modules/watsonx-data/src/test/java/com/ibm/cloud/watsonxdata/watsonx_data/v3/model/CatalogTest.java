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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CatalogSyncMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MdsConnectionInfo;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Catalog model.
 */
public class CatalogTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalog() throws Throwable {
    Catalog catalogModel = new Catalog();
    assertNull(catalogModel.getActions());
    assertNull(catalogModel.getAssociatedDatabases());
    assertNull(catalogModel.getAssociatedEngines());
    assertNull(catalogModel.getAssociatedStorage());
    assertNull(catalogModel.getBasePath());
    assertNull(catalogModel.getCatalogSyncMetadata());
    assertNull(catalogModel.getCreatedAt());
    assertNull(catalogModel.getCreatedBy());
    assertNull(catalogModel.getDaysLeft());
    assertNull(catalogModel.getDescription());
    assertNull(catalogModel.isIsGfs());
    assertNull(catalogModel.getLocationUri());
    assertNull(catalogModel.getManagedBy());
    assertNull(catalogModel.getMdsConnectionInformation());
    assertNull(catalogModel.getMetastore());
    assertNull(catalogModel.getName());
    assertNull(catalogModel.getStatus());
    assertNull(catalogModel.getTags());
    assertNull(catalogModel.getType());
  }
}