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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetail;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEngineQueryServerDetails model.
 */
public class SparkEngineQueryServerDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEngineQueryServerDetails() throws Throwable {
    SparkEngineQueryServerDetails sparkEngineQueryServerDetailsModel = new SparkEngineQueryServerDetails();
    assertNull(sparkEngineQueryServerDetailsModel.getCreationTime());
    assertNull(sparkEngineQueryServerDetailsModel.getFailedTime());
    assertNull(sparkEngineQueryServerDetailsModel.getFinishTime());
    assertNull(sparkEngineQueryServerDetailsModel.getId());
    assertNull(sparkEngineQueryServerDetailsModel.getQueryServerDetails());
    assertNull(sparkEngineQueryServerDetailsModel.getRuntime());
    assertNull(sparkEngineQueryServerDetailsModel.getServerEndpoint());
    assertNull(sparkEngineQueryServerDetailsModel.getStartTime());
    assertNull(sparkEngineQueryServerDetailsModel.getState());
  }
}