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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestissimoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoCoordinatorNodeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoWorkerNodeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePrestissimoEngineOptions model.
 */
public class CreatePrestissimoEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePrestissimoEngineOptions() throws Throwable {
    PrestissimoCoordinatorNodeDetails prestissimoCoordinatorNodeDetailsModel = new PrestissimoCoordinatorNodeDetails.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();
    assertEquals(prestissimoCoordinatorNodeDetailsModel.nodeType(), "starter");
    assertEquals(prestissimoCoordinatorNodeDetailsModel.quantity(), Long.valueOf("1"));

    PrestissimoWorkerNodeDetails prestissimoWorkerNodeDetailsModel = new PrestissimoWorkerNodeDetails.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();
    assertEquals(prestissimoWorkerNodeDetailsModel.nodeType(), "worker");
    assertEquals(prestissimoWorkerNodeDetailsModel.quantity(), Long.valueOf("1"));

    PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
      .coordinator(prestissimoCoordinatorNodeDetailsModel)
      .sizeConfig("starter")
      .worker(prestissimoWorkerNodeDetailsModel)
      .build();
    assertEquals(prestissimoEngineDetailsModel.coordinator(), prestissimoCoordinatorNodeDetailsModel);
    assertEquals(prestissimoEngineDetailsModel.sizeConfig(), "starter");
    assertEquals(prestissimoEngineDetailsModel.worker(), prestissimoWorkerNodeDetailsModel);

    CreatePrestissimoEngineOptions createPrestissimoEngineOptionsModel = new CreatePrestissimoEngineOptions.Builder()
      .configuration(prestissimoEngineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("hive_data"))
      .description("prestissimo engine description")
      .id("sampleEngine123")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createPrestissimoEngineOptionsModel.configuration(), prestissimoEngineDetailsModel);
    assertEquals(createPrestissimoEngineOptionsModel.displayName(), "sampleEngine");
    assertEquals(createPrestissimoEngineOptionsModel.origin(), "native");
    assertEquals(createPrestissimoEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("hive_data"));
    assertEquals(createPrestissimoEngineOptionsModel.description(), "prestissimo engine description");
    assertEquals(createPrestissimoEngineOptionsModel.id(), "sampleEngine123");
    assertEquals(createPrestissimoEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createPrestissimoEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestissimoEngineOptionsError() throws Throwable {
    new CreatePrestissimoEngineOptions.Builder().build();
  }

}