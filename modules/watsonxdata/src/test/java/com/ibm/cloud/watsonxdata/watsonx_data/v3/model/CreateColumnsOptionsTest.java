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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Column;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateColumnsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateColumnsOptions model.
 */
public class CreateColumnsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateColumnsOptions() throws Throwable {
    Column columnModel = new Column.Builder()
      .comment("Expenses column for each department")
      .extra("AUTO_INCREMENT")
      .length("30")
      .name("expenses")
      .precision("10")
      .scale("2")
      .type("varchar")
      .build();
    assertEquals(columnModel.comment(), "Expenses column for each department");
    assertEquals(columnModel.extra(), "AUTO_INCREMENT");
    assertEquals(columnModel.length(), "30");
    assertEquals(columnModel.name(), "expenses");
    assertEquals(columnModel.precision(), "10");
    assertEquals(columnModel.scale(), "2");
    assertEquals(columnModel.type(), "varchar");

    CreateColumnsOptions createColumnsOptionsModel = new CreateColumnsOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .columns(java.util.Arrays.asList(columnModel))
      .authInstanceId("testString")
      .build();
    assertEquals(createColumnsOptionsModel.engineId(), "testString");
    assertEquals(createColumnsOptionsModel.catalogName(), "testString");
    assertEquals(createColumnsOptionsModel.schemaName(), "testString");
    assertEquals(createColumnsOptionsModel.tableName(), "testString");
    assertEquals(createColumnsOptionsModel.columns(), java.util.Arrays.asList(columnModel));
    assertEquals(createColumnsOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateColumnsOptionsError() throws Throwable {
    new CreateColumnsOptions.Builder().build();
  }

}