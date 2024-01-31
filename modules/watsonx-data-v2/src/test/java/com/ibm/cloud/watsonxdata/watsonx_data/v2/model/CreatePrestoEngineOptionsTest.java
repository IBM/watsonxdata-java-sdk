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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreatePrestoEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(nodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(nodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
      .apiKey("<api_key>")
      .connectionString("1.2.3.4")
      .coordinator(nodeDescriptionBodyModel)
      .instanceId("instance_id")
      .managedBy("fully/self")
      .sizeConfig("starter")
      .worker(nodeDescriptionBodyModel)
      .build();
    assertEquals(engineDetailsBodyModel.apiKey(), "<api_key>");
    assertEquals(engineDetailsBodyModel.connectionString(), "1.2.3.4");
    assertEquals(engineDetailsBodyModel.coordinator(), nodeDescriptionBodyModel);
    assertEquals(engineDetailsBodyModel.instanceId(), "instance_id");
    assertEquals(engineDetailsBodyModel.managedBy(), "fully/self");
    assertEquals(engineDetailsBodyModel.sizeConfig(), "starter");
    assertEquals(engineDetailsBodyModel.worker(), nodeDescriptionBodyModel);

    CreatePrestoEngineOptions createPrestoEngineOptionsModel = new CreatePrestoEngineOptions.Builder()
      .origin("native")
      .type("presto")
      .associatedCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .description("presto engine for running sql queries")
      .engineDetails(engineDetailsBodyModel)
      .engineDisplayName("sampleEngine")
      .region("us-south")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .version("1.2.3")
      .authInstanceId("testString")
      .build();
    assertEquals(createPrestoEngineOptionsModel.origin(), "native");
    assertEquals(createPrestoEngineOptionsModel.type(), "presto");
    assertEquals(createPrestoEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("iceberg_data", "hive_data"));
    assertEquals(createPrestoEngineOptionsModel.description(), "presto engine for running sql queries");
    assertEquals(createPrestoEngineOptionsModel.engineDetails(), engineDetailsBodyModel);
    assertEquals(createPrestoEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createPrestoEngineOptionsModel.region(), "us-south");
    assertEquals(createPrestoEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createPrestoEngineOptionsModel.version(), "1.2.3");
    assertEquals(createPrestoEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrestoEngineOptionsError() throws Throwable {
    new CreatePrestoEngineOptions.Builder().build();
  }

}