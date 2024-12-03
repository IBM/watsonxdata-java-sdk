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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ColumnPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ColumnPatch model.
 */
public class ColumnPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testColumnPatch() throws Throwable {
    ColumnPatch columnPatchModel = new ColumnPatch.Builder()
      .columnName("expenses")
      .build();
    assertEquals(columnPatchModel.columnName(), "expenses");

    String json = TestUtilities.serialize(columnPatchModel);

    ColumnPatch columnPatchModelNew = TestUtilities.deserialize(json, ColumnPatch.class);
    assertTrue(columnPatchModelNew instanceof ColumnPatch);
    assertEquals(columnPatchModelNew.columnName(), "expenses");
  }
  @Test
  public void testColumnPatchAsPatch() throws Throwable {
    ColumnPatch columnPatchModel = new ColumnPatch.Builder()
      .columnName("expenses")
      .build();

    Map<String, Object> mergePatch = columnPatchModel.asPatch();

    assertEquals(mergePatch.get("column_name"), "expenses");
  }

}