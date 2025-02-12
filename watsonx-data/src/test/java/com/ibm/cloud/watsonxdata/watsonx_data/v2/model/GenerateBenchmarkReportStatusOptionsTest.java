/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GenerateBenchmarkReportStatusOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GenerateBenchmarkReportStatusOptions model.
 */
public class GenerateBenchmarkReportStatusOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGenerateBenchmarkReportStatusOptions() throws Throwable {
    GenerateBenchmarkReportStatusOptions generateBenchmarkReportStatusOptionsModel = new GenerateBenchmarkReportStatusOptions.Builder()
      .reqId("testString")
      .engineId("testString")
      .bucketName("testString")
      .podName("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(generateBenchmarkReportStatusOptionsModel.reqId(), "testString");
    assertEquals(generateBenchmarkReportStatusOptionsModel.engineId(), "testString");
    assertEquals(generateBenchmarkReportStatusOptionsModel.bucketName(), "testString");
    assertEquals(generateBenchmarkReportStatusOptionsModel.podName(), "testString");
    assertEquals(generateBenchmarkReportStatusOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGenerateBenchmarkReportStatusOptionsError() throws Throwable {
    new GenerateBenchmarkReportStatusOptions.Builder().build();
  }

}