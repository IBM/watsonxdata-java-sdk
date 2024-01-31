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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ReplacePrestoEngineCatalogsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplacePrestoEngineCatalogsOptions model.
 */
public class ReplacePrestoEngineCatalogsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplacePrestoEngineCatalogsOptions() throws Throwable {
    ReplacePrestoEngineCatalogsOptions replacePrestoEngineCatalogsOptionsModel = new ReplacePrestoEngineCatalogsOptions.Builder()
      .engineId("testString")
      .catalogNames("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(replacePrestoEngineCatalogsOptionsModel.engineId(), "testString");
    assertEquals(replacePrestoEngineCatalogsOptionsModel.catalogNames(), "testString");
    assertEquals(replacePrestoEngineCatalogsOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplacePrestoEngineCatalogsOptionsError() throws Throwable {
    new ReplacePrestoEngineCatalogsOptions.Builder().build();
  }

}