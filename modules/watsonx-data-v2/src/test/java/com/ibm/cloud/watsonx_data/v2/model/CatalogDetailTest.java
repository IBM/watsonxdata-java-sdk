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
import com.ibm.cloud.watsonx_data.v2.model.CatalogDetail;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogDetail model.
 */
public class CatalogDetailTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogDetail() throws Throwable {
    CatalogDetail catalogDetailModel = new CatalogDetail();
    assertNull(catalogDetailModel.getActions());
    assertNull(catalogDetailModel.getAssociatedBuckets());
    assertNull(catalogDetailModel.getAssociatedDatabases());
    assertNull(catalogDetailModel.getAssociatedEngines());
    assertNull(catalogDetailModel.getCatalogName());
    assertNull(catalogDetailModel.getCatalogType());
    assertNull(catalogDetailModel.getCreatedBy());
    assertNull(catalogDetailModel.getCreatedOn());
    assertNull(catalogDetailModel.getDescription());
    assertNull(catalogDetailModel.getHostname());
    assertNull(catalogDetailModel.getLastSyncAt());
    assertNull(catalogDetailModel.getManagedBy());
    assertNull(catalogDetailModel.getMetastore());
    assertNull(catalogDetailModel.getPort());
    assertNull(catalogDetailModel.getStatus());
    assertNull(catalogDetailModel.getSyncDescription());
    assertNull(catalogDetailModel.getSyncException());
    assertNull(catalogDetailModel.getSyncStatus());
    assertNull(catalogDetailModel.getTags());
    assertNull(catalogDetailModel.getThriftUri());
  }
}