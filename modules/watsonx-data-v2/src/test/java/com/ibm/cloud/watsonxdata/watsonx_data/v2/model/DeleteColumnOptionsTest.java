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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteColumnOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteColumnOptions model.
 */
public class DeleteColumnOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteColumnOptions() throws Throwable {
    DeleteColumnOptions deleteColumnOptionsModel = new DeleteColumnOptions.Builder()
      .engineId("testString")
      .catalogId("testString")
      .schemaId("testString")
      .tableId("testString")
      .columnId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(deleteColumnOptionsModel.engineId(), "testString");
    assertEquals(deleteColumnOptionsModel.catalogId(), "testString");
    assertEquals(deleteColumnOptionsModel.schemaId(), "testString");
    assertEquals(deleteColumnOptionsModel.tableId(), "testString");
    assertEquals(deleteColumnOptionsModel.columnId(), "testString");
    assertEquals(deleteColumnOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteColumnOptionsError() throws Throwable {
    new DeleteColumnOptions.Builder().build();
  }

}