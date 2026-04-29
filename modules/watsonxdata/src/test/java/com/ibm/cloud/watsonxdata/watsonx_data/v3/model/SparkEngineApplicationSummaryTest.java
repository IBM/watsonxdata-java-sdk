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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationStateDetail;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationSummary;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEngineApplicationSummary model.
 */
public class SparkEngineApplicationSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEngineApplicationSummary() throws Throwable {
    SparkEngineApplicationSummary sparkEngineApplicationSummaryModel = new SparkEngineApplicationSummary();
    assertNull(sparkEngineApplicationSummaryModel.getAutoTerminationTime());
    assertNull(sparkEngineApplicationSummaryModel.getCreationTime());
    assertNull(sparkEngineApplicationSummaryModel.getDeployMode());
    assertNull(sparkEngineApplicationSummaryModel.getEndTime());
    assertNull(sparkEngineApplicationSummaryModel.getFailedTime());
    assertNull(sparkEngineApplicationSummaryModel.getFinishTime());
    assertNull(sparkEngineApplicationSummaryModel.getId());
    assertNull(sparkEngineApplicationSummaryModel.getIdempotencyKey());
    assertNull(sparkEngineApplicationSummaryModel.getInitScripts());
    assertNull(sparkEngineApplicationSummaryModel.getMaxRetries());
    assertNull(sparkEngineApplicationSummaryModel.getMinRetryIntervalInSeconds());
    assertNull(sparkEngineApplicationSummaryModel.getRetryAttempt());
    assertNull(sparkEngineApplicationSummaryModel.getRuntime());
    assertNull(sparkEngineApplicationSummaryModel.getSparkApplicationId());
    assertNull(sparkEngineApplicationSummaryModel.getSparkApplicationName());
    assertNull(sparkEngineApplicationSummaryModel.getSparkUi());
    assertNull(sparkEngineApplicationSummaryModel.getSparkVersion());
    assertNull(sparkEngineApplicationSummaryModel.getStartTime());
    assertNull(sparkEngineApplicationSummaryModel.getState());
    assertNull(sparkEngineApplicationSummaryModel.getStateDetails());
    assertNull(sparkEngineApplicationSummaryModel.getSubmissionTime());
    assertNull(sparkEngineApplicationSummaryModel.getTemplateId());
    assertNull(sparkEngineApplicationSummaryModel.getTimeoutInSeconds());
    assertNull(sparkEngineApplicationSummaryModel.getWxdApplicationUiEndpoint());
  }
}