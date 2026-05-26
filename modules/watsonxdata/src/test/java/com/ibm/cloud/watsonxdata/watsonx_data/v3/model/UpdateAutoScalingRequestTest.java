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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AutoScalingConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateAutoScalingRequest;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateAutoScalingRequest model.
 */
public class UpdateAutoScalingRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateAutoScalingRequest() throws Throwable {
    AutoScalingConfig autoScalingConfigModel = new AutoScalingConfig.Builder()
      .type("cpu")
      .target(Long.valueOf("40"))
      .minWorkerQuantity(Long.valueOf("1"))
      .maxWorkerQuantity(Long.valueOf("1"))
      .queryTerminationGracePeriodMin(Long.valueOf("1"))
      .scaleInStabilizationWindowMin(Long.valueOf("5"))
      .scalingStepSize(Long.valueOf("1"))
      .build();
    assertEquals(autoScalingConfigModel.target(), Long.valueOf("40"));
    assertEquals(autoScalingConfigModel.minWorkerQuantity(), Long.valueOf("1"));
    assertEquals(autoScalingConfigModel.maxWorkerQuantity(), Long.valueOf("1"));
    assertEquals(autoScalingConfigModel.queryTerminationGracePeriodMin(), Long.valueOf("1"));
    assertEquals(autoScalingConfigModel.scaleInStabilizationWindowMin(), Long.valueOf("5"));
    assertEquals(autoScalingConfigModel.scalingStepSize(), Long.valueOf("1"));

    UpdateAutoScalingRequest updateAutoScalingRequestModel = new UpdateAutoScalingRequest.Builder()
      .autoscalingConfig(autoScalingConfigModel)
      .build();
    assertEquals(updateAutoScalingRequestModel.autoscalingConfig(), autoScalingConfigModel);

    String json = TestUtilities.serialize(updateAutoScalingRequestModel);

    UpdateAutoScalingRequest updateAutoScalingRequestModelNew = TestUtilities.deserialize(json, UpdateAutoScalingRequest.class);
    assertTrue(updateAutoScalingRequestModelNew instanceof UpdateAutoScalingRequest);
    assertEquals(updateAutoScalingRequestModelNew.autoscalingConfig().toString(), autoScalingConfigModel.toString());
  }
  @Test
  public void testUpdateAutoScalingRequestAsPatch() throws Throwable {
    AutoScalingConfig autoScalingConfigModel = new AutoScalingConfig.Builder()
      .type("cpu")
      .target(Long.valueOf("40"))
      .minWorkerQuantity(Long.valueOf("1"))
      .maxWorkerQuantity(Long.valueOf("1"))
      .queryTerminationGracePeriodMin(Long.valueOf("1"))
      .scaleInStabilizationWindowMin(Long.valueOf("5"))
      .scalingStepSize(Long.valueOf("1"))
      .build();

    UpdateAutoScalingRequest updateAutoScalingRequestModel = new UpdateAutoScalingRequest.Builder()
      .autoscalingConfig(autoScalingConfigModel)
      .build();

    Map<String, Object> mergePatch = updateAutoScalingRequestModel.asPatch();

    assertTrue(mergePatch.containsKey("autoscaling_config"));
  }

}