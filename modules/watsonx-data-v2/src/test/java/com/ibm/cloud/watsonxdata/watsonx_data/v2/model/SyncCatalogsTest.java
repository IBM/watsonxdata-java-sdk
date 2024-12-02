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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SyncCatalogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SyncCatalogs model.
 */
public class SyncCatalogsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSyncCatalogs() throws Throwable {
    SyncCatalogs syncCatalogsModel = new SyncCatalogs.Builder()
      .autoAddNewTables(true)
      .syncIcebergMd(true)
      .build();
    assertEquals(syncCatalogsModel.autoAddNewTables(), Boolean.valueOf(true));
    assertEquals(syncCatalogsModel.syncIcebergMd(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(syncCatalogsModel);

    SyncCatalogs syncCatalogsModelNew = TestUtilities.deserialize(json, SyncCatalogs.class);
    assertTrue(syncCatalogsModelNew instanceof SyncCatalogs);
    assertEquals(syncCatalogsModelNew.autoAddNewTables(), Boolean.valueOf(true));
    assertEquals(syncCatalogsModelNew.syncIcebergMd(), Boolean.valueOf(true));
  }
  @Test
  public void testSyncCatalogsAsPatch() throws Throwable {
    SyncCatalogs syncCatalogsModel = new SyncCatalogs.Builder()
      .autoAddNewTables(true)
      .syncIcebergMd(true)
      .build();

    Map<String, Object> mergePatch = syncCatalogsModel.asPatch();

    assertTrue(mergePatch.containsKey("auto_add_new_tables"));
    assertTrue(mergePatch.containsKey("sync_iceberg_md"));
  }

}