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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IngestionJob model.
 */
public class IngestionJobTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIngestionJob() throws Throwable {
    IngestionJob ingestionJobModel = new IngestionJob();
    assertNull(ingestionJobModel.isCreateIfNotExist());
    assertNull(ingestionJobModel.getCsvProperty());
    assertNull(ingestionJobModel.getDetails());
    assertNull(ingestionJobModel.getEndTimestamp());
    assertNull(ingestionJobModel.getEngineId());
    assertNull(ingestionJobModel.getEngineName());
    assertNull(ingestionJobModel.getExecuteConfig());
    assertNull(ingestionJobModel.getInstanceId());
    assertNull(ingestionJobModel.getJobId());
    assertNull(ingestionJobModel.getPartitionBy());
    assertNull(ingestionJobModel.getSchema());
    assertNull(ingestionJobModel.getSourceDataFiles());
    assertNull(ingestionJobModel.getSourceFileType());
    assertNull(ingestionJobModel.getStartTimestamp());
    assertNull(ingestionJobModel.getStatus());
    assertNull(ingestionJobModel.getTargetTable());
    assertNull(ingestionJobModel.getUsername());
    assertNull(ingestionJobModel.isValidateCsvHeader());
  }
}