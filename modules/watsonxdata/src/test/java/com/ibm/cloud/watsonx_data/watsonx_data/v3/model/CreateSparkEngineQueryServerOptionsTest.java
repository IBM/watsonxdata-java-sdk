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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateSparkEngineQueryServerOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkEngineQueryServerDetailsPrototypes;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkVolumeDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSparkEngineQueryServerOptions model.
 */
public class CreateSparkEngineQueryServerOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSparkEngineQueryServerOptions() throws Throwable {
    SparkApplicationRuntime sparkApplicationRuntimeModel = new SparkApplicationRuntime.Builder()
      .sparkVersion("3.4")
      .build();
    assertEquals(sparkApplicationRuntimeModel.sparkVersion(), "3.4");

    SparkEngineQueryServerDetailsPrototypes sparkEngineQueryServerDetailsPrototypesModel = new SparkEngineQueryServerDetailsPrototypes.Builder()
      .conf(java.util.Collections.singletonMap("key1", "configuration"))
      .env(java.util.Collections.singletonMap("key1", "configuration"))
      .name("spark-sql-server")
      .runtime(sparkApplicationRuntimeModel)
      .build();
    assertEquals(sparkEngineQueryServerDetailsPrototypesModel.conf(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkEngineQueryServerDetailsPrototypesModel.env(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkEngineQueryServerDetailsPrototypesModel.name(), "spark-sql-server");
    assertEquals(sparkEngineQueryServerDetailsPrototypesModel.runtime(), sparkApplicationRuntimeModel);

    SparkVolumeDetails sparkVolumeDetailsModel = new SparkVolumeDetails.Builder()
      .mountPath("/mount/path")
      .name("my-volume")
      .readOnly(true)
      .sourceSubPath("/source/path")
      .build();
    assertEquals(sparkVolumeDetailsModel.mountPath(), "/mount/path");
    assertEquals(sparkVolumeDetailsModel.name(), "my-volume");
    assertEquals(sparkVolumeDetailsModel.readOnly(), Boolean.valueOf(true));
    assertEquals(sparkVolumeDetailsModel.sourceSubPath(), "/source/path");

    CreateSparkEngineQueryServerOptions createSparkEngineQueryServerOptionsModel = new CreateSparkEngineQueryServerOptions.Builder()
      .id("testString")
      .queryServerDetails(sparkEngineQueryServerDetailsPrototypesModel)
      .volumes(java.util.Arrays.asList(sparkVolumeDetailsModel))
      .authInstanceId("testString")
      .build();
    assertEquals(createSparkEngineQueryServerOptionsModel.id(), "testString");
    assertEquals(createSparkEngineQueryServerOptionsModel.queryServerDetails(), sparkEngineQueryServerDetailsPrototypesModel);
    assertEquals(createSparkEngineQueryServerOptionsModel.volumes(), java.util.Arrays.asList(sparkVolumeDetailsModel));
    assertEquals(createSparkEngineQueryServerOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineQueryServerOptionsError() throws Throwable {
    new CreateSparkEngineQueryServerOptions.Builder().build();
  }

}