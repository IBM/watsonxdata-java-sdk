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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IcebergSourceTable;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IcebergSourceTable model.
 */
public class IcebergSourceTableTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIcebergSourceTable() throws Throwable {
    IcebergSourceTable icebergSourceTableModel = new IcebergSourceTable.Builder()
      .schemaName("testString")
      .tableName("testString")
      .catalogName("testString")
      .warehouseName("testString")
      .snapshotId(Long.valueOf("0"))
      .build();
    assertEquals(icebergSourceTableModel.schemaName(), "testString");
    assertEquals(icebergSourceTableModel.tableName(), "testString");
    assertEquals(icebergSourceTableModel.catalogName(), "testString");
    assertEquals(icebergSourceTableModel.warehouseName(), "testString");
    assertEquals(icebergSourceTableModel.snapshotId(), Long.valueOf("0"));

    String json = TestUtilities.serialize(icebergSourceTableModel);

    IcebergSourceTable icebergSourceTableModelNew = TestUtilities.deserialize(json, IcebergSourceTable.class);
    assertTrue(icebergSourceTableModelNew instanceof IcebergSourceTable);
    assertEquals(icebergSourceTableModelNew.schemaName(), "testString");
    assertEquals(icebergSourceTableModelNew.tableName(), "testString");
    assertEquals(icebergSourceTableModelNew.catalogName(), "testString");
    assertEquals(icebergSourceTableModelNew.warehouseName(), "testString");
    assertEquals(icebergSourceTableModelNew.snapshotId(), Long.valueOf("0"));
  }
}