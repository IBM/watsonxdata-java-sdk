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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CoordinatorNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.WorkerNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreatePrestoEngineOptions model.
 */
public class CreatePrestoEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreatePrestoEngineOptions() throws Throwable {
    CoordinatorNodeDescriptionBody coordinatorNodeDescriptionBodyModel = new CoordinatorNodeDescriptionBody.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();
    assertEquals(coordinatorNodeDescriptionBodyModel.nodeType(), "starter");
    assertEquals(coordinatorNodeDescriptionBodyModel.quantity(), Long.valueOf("1"));

    WorkerNodeDescriptionBody workerNodeDescriptionBodyModel = new WorkerNodeDescriptionBody.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();
    assertEquals(workerNodeDescriptionBodyModel.nodeType(), "starter");
    assertEquals(workerNodeDescriptionBodyModel.quantity(), Long.valueOf("1"));

    EngineDetails engineDetailsModel = new EngineDetails.Builder()
      .coordinator(coordinatorNodeDescriptionBodyModel)
      .sizeConfig("starter")
      .worker(workerNodeDescriptionBodyModel)
      .build();
    assertEquals(engineDetailsModel.coordinator(), coordinatorNodeDescriptionBodyModel);
    assertEquals(engineDetailsModel.sizeConfig(), "starter");
    assertEquals(engineDetailsModel.worker(), workerNodeDescriptionBodyModel);

    CreatePrestoEngineOptions createPrestoEngineOptionsModel = new CreatePrestoEngineOptions.Builder()
      .configuration(engineDetailsModel)
      .displayName("sampleEngine")
      .origin("native")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("presto engine for running sql queries")
      .id("sampleEngine123")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createPrestoEngineOptionsModel.configuration(), engineDetailsModel);
    assertEquals(createPrestoEngineOptionsModel.displayName(), "sampleEngine");
    assertEquals(createPrestoEngineOptionsModel.origin(), "native");
    assertEquals(createPrestoEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("iceberg_data", "hive_data"));
    assertEquals(createPrestoEngineOptionsModel.description(), "presto engine for running sql queries");
    assertEquals(createPrestoEngineOptionsModel.id(), "sampleEngine123");
    assertEquals(createPrestoEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createPrestoEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestoEngineOptionsError() throws Throwable {
    new CreatePrestoEngineOptions.Builder().build();
  }

}