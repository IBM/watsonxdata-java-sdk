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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Column model.
 */
public class ColumnTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testColumn() throws Throwable {
    Column columnModel = new Column.Builder()
      .columnName("expenses")
      .comment("expenses column")
      .extra("varchar")
      .length("30")
      .scale("2")
      .precision("10")
      .type("varchar")
      .build();
    assertEquals(columnModel.columnName(), "expenses");
    assertEquals(columnModel.comment(), "expenses column");
    assertEquals(columnModel.extra(), "varchar");
    assertEquals(columnModel.length(), "30");
    assertEquals(columnModel.scale(), "2");
    assertEquals(columnModel.precision(), "10");
    assertEquals(columnModel.type(), "varchar");

    String json = TestUtilities.serialize(columnModel);

    Column columnModelNew = TestUtilities.deserialize(json, Column.class);
    assertTrue(columnModelNew instanceof Column);
    assertEquals(columnModelNew.columnName(), "expenses");
    assertEquals(columnModelNew.comment(), "expenses column");
    assertEquals(columnModelNew.extra(), "varchar");
    assertEquals(columnModelNew.length(), "30");
    assertEquals(columnModelNew.scale(), "2");
    assertEquals(columnModelNew.precision(), "10");
    assertEquals(columnModelNew.type(), "varchar");
  }
}