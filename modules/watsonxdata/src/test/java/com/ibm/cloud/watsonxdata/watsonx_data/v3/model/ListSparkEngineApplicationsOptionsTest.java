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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListSparkEngineApplicationsOptions model.
 */
public class ListSparkEngineApplicationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListSparkEngineApplicationsOptions() throws Throwable {
    ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptionsModel = new ListSparkEngineApplicationsOptions.Builder()
      .id("testString")
      .authInstanceId("testString")
      .state(java.util.Arrays.asList("testString"))
      .submissionTimeInterval("testString")
      .startTimeInterval("testString")
      .endTimeInterval("testString")
      .limit(Long.valueOf("500"))
      .start("testString")
      .build();
    assertEquals(listSparkEngineApplicationsOptionsModel.id(), "testString");
    assertEquals(listSparkEngineApplicationsOptionsModel.authInstanceId(), "testString");
    assertEquals(listSparkEngineApplicationsOptionsModel.state(), java.util.Arrays.asList("testString"));
    assertEquals(listSparkEngineApplicationsOptionsModel.submissionTimeInterval(), "testString");
    assertEquals(listSparkEngineApplicationsOptionsModel.startTimeInterval(), "testString");
    assertEquals(listSparkEngineApplicationsOptionsModel.endTimeInterval(), "testString");
    assertEquals(listSparkEngineApplicationsOptionsModel.limit(), Long.valueOf("500"));
    assertEquals(listSparkEngineApplicationsOptionsModel.start(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListSparkEngineApplicationsOptionsError() throws Throwable {
    new ListSparkEngineApplicationsOptions.Builder().build();
  }

}