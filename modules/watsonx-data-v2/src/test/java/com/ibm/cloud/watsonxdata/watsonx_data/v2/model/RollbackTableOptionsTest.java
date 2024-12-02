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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RollbackTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RollbackTableOptions model.
 */
public class RollbackTableOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRollbackTableOptions() throws Throwable {
    RollbackTableOptions rollbackTableOptionsModel = new RollbackTableOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .snapshotId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(rollbackTableOptionsModel.engineId(), "testString");
    assertEquals(rollbackTableOptionsModel.catalogId(), "testString");
    assertEquals(rollbackTableOptionsModel.schemaId(), "testString");
    assertEquals(rollbackTableOptionsModel.tableId(), "testString");
    assertEquals(rollbackTableOptionsModel.snapshotId(), "testString");
    assertEquals(rollbackTableOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRollbackTableOptionsError() throws Throwable {
    new RollbackTableOptions.Builder().build();
  }

}