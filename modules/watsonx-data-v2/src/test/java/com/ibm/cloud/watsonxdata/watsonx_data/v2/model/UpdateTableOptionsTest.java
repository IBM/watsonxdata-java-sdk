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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateTableOptions model.
 */
public class UpdateTableOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTableOptions() throws Throwable {
    UpdateTableOptions updateTableOptionsModel = new UpdateTableOptions.Builder()
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .engineId("testString")
      .body(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .type("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(updateTableOptionsModel.catalogId(), "testString");
    assertEquals(updateTableOptionsModel.schemaId(), "testString");
    assertEquals(updateTableOptionsModel.tableId(), "testString");
    assertEquals(updateTableOptionsModel.engineId(), "testString");
    assertEquals(updateTableOptionsModel.body(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateTableOptionsModel.type(), "testString");
    assertEquals(updateTableOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTableOptionsError() throws Throwable {
    new UpdateTableOptions.Builder().build();
  }

}