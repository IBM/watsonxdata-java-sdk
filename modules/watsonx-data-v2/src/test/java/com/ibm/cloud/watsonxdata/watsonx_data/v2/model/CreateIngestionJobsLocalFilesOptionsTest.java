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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateIngestionJobsLocalFilesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateIngestionJobsLocalFilesOptions model.
 */
public class CreateIngestionJobsLocalFilesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateIngestionJobsLocalFilesOptions() throws Throwable {
    CreateIngestionJobsLocalFilesOptions createIngestionJobsLocalFilesOptionsModel = new CreateIngestionJobsLocalFilesOptions.Builder()
      .authInstanceId("testString")
      .sourceDataFile(TestUtilities.createMockStream("This is a mock file."))
      .targetTable("testString")
      .jobId("testString")
      .username("testString")
      .sourceDataFileContentType("testString")
      .sourceFileType("csv")
      .csvProperty("testString")
      .createIfNotExist(false)
      .validateCsvHeader(false)
      .executeConfig("testString")
      .engineId("testString")
      .build();
    assertEquals(createIngestionJobsLocalFilesOptionsModel.authInstanceId(), "testString");
    assertEquals(IOUtils.toString(createIngestionJobsLocalFilesOptionsModel.sourceDataFile()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(createIngestionJobsLocalFilesOptionsModel.targetTable(), "testString");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.jobId(), "testString");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.username(), "testString");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.sourceDataFileContentType(), "testString");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.sourceFileType(), "csv");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.csvProperty(), "testString");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.createIfNotExist(), Boolean.valueOf(false));
    assertEquals(createIngestionJobsLocalFilesOptionsModel.validateCsvHeader(), Boolean.valueOf(false));
    assertEquals(createIngestionJobsLocalFilesOptionsModel.executeConfig(), "testString");
    assertEquals(createIngestionJobsLocalFilesOptionsModel.engineId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIngestionJobsLocalFilesOptionsError() throws Throwable {
    new CreateIngestionJobsLocalFilesOptions.Builder().build();
  }

}