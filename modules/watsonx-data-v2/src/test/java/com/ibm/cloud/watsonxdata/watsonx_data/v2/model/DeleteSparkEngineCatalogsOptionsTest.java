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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteSparkEngineCatalogsOptions model.
 */
public class DeleteSparkEngineCatalogsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteSparkEngineCatalogsOptions() throws Throwable {
    DeleteSparkEngineCatalogsOptions deleteSparkEngineCatalogsOptionsModel = new DeleteSparkEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(deleteSparkEngineCatalogsOptionsModel.engineId(), "testString");
    assertEquals(deleteSparkEngineCatalogsOptionsModel.catalogNames(), "testString");
    assertEquals(deleteSparkEngineCatalogsOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineCatalogsOptionsError() throws Throwable {
    new DeleteSparkEngineCatalogsOptions.Builder().build();
  }

}