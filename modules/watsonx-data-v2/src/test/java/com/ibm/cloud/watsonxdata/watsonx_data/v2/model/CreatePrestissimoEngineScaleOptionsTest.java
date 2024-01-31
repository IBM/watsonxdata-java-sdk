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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestissimoEngineScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePrestissimoEngineScaleOptions model.
 */
public class CreatePrestissimoEngineScaleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePrestissimoEngineScaleOptions() throws Throwable {
    PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBodyModel = new PrestissimoNodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(prestissimoNodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(prestissimoNodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    CreatePrestissimoEngineScaleOptions createPrestissimoEngineScaleOptionsModel = new CreatePrestissimoEngineScaleOptions.Builder()
      .engineId("testString")
      .coordinator(prestissimoNodeDescriptionBodyModel)
      .worker(prestissimoNodeDescriptionBodyModel)
      .authInstanceId("testString")
      .build();
    assertEquals(createPrestissimoEngineScaleOptionsModel.engineId(), "testString");
    assertEquals(createPrestissimoEngineScaleOptionsModel.coordinator(), prestissimoNodeDescriptionBodyModel);
    assertEquals(createPrestissimoEngineScaleOptionsModel.worker(), prestissimoNodeDescriptionBodyModel);
    assertEquals(createPrestissimoEngineScaleOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineScaleOptionsError() throws Throwable {
    new CreatePrestissimoEngineScaleOptions.Builder().build();
  }

}