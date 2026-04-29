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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AutoScalingConfig model.
 */
public class AutoScalingConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAutoScalingConfig() throws Throwable {
    AutoScalingConfig autoscalingConfigModel = new AutoScalingConfig.Builder()
      .type("cpu")
      .target(Long.valueOf("40"))
      .minWorkerQuantity(Long.valueOf("1"))
      .maxWorkerQuantity(Long.valueOf("18"))
      .queryTerminationGracePeriodMin(Long.valueOf("1"))
      .scaleInStabilizationWindowMin(Long.valueOf("5"))
      .scalingStepSize(Long.valueOf("1"))
      .build();
    assertEquals(autoscalingConfigModel.type(), "cpu");
    assertEquals(autoscalingConfigModel.target(), Long.valueOf("40"));
    assertEquals(autoscalingConfigModel.minWorkerQuantity(), Long.valueOf("1"));
    assertEquals(autoscalingConfigModel.maxWorkerQuantity(), Long.valueOf("18"));
    assertEquals(autoscalingConfigModel.queryTerminationGracePeriodMin(), Long.valueOf("1"));
    assertEquals(autoscalingConfigModel.scaleInStabilizationWindowMin(), Long.valueOf("5"));
    assertEquals(autoscalingConfigModel.scalingStepSize(), Long.valueOf("1"));

    String json = TestUtilities.serialize(autoscalingConfigModel);

    AutoScalingConfig autoscalingConfigModelNew = TestUtilities.deserialize(json, AutoScalingConfig.class);
    assertTrue(autoscalingConfigModelNew instanceof AutoScalingConfig);
    assertEquals(autoscalingConfigModelNew.type(), "cpu");
    assertEquals(autoscalingConfigModelNew.target(), Long.valueOf("40"));
    assertEquals(autoscalingConfigModelNew.minWorkerQuantity(), Long.valueOf("1"));
    assertEquals(autoscalingConfigModelNew.maxWorkerQuantity(), Long.valueOf("18"));
    assertEquals(autoscalingConfigModelNew.queryTerminationGracePeriodMin(), Long.valueOf("1"));
    assertEquals(autoscalingConfigModelNew.scaleInStabilizationWindowMin(), Long.valueOf("5"));
    assertEquals(autoscalingConfigModelNew.scalingStepSize(), Long.valueOf("1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAutoScalingConfigError() throws Throwable {
    new AutoScalingConfig.Builder().build();
  }

}