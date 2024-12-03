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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetailsRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationEnv;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkVolumeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSparkEngineApplicationOptions model.
 */
public class CreateSparkEngineApplicationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSparkEngineApplicationOptions() throws Throwable {
    SparkApplicationConfig sparkApplicationConfigModel = new SparkApplicationConfig.Builder()
      .sparkSampleConfigProperpty("testString")
      .build();
    assertEquals(sparkApplicationConfigModel.sparkSampleConfigProperpty(), "testString");

    SparkApplicationEnv sparkApplicationEnvModel = new SparkApplicationEnv.Builder()
      .sampleEnvKey("testString")
      .build();
    assertEquals(sparkApplicationEnvModel.sampleEnvKey(), "testString");

    SparkApplicationDetailsRuntime sparkApplicationDetailsRuntimeModel = new SparkApplicationDetailsRuntime.Builder()
      .sparkVersion("3.4")
      .build();
    assertEquals(sparkApplicationDetailsRuntimeModel.sparkVersion(), "3.4");

    SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
      .application("s3://mybucket/wordcount.py")
      .arguments(java.util.Arrays.asList("people.txt"))
      .xClass("org.apache.spark.examples.SparkPi")
      .conf(sparkApplicationConfigModel)
      .env(sparkApplicationEnvModel)
      .files("s3://mybucket/myfile.txt")
      .jars("testString")
      .name("SparkApplicaton1")
      .packages("org.apache.spark:example_1.2.3")
      .repositories("https://repo1.maven.org/maven2/")
      .sparkVersion("3.3")
      .runtime(sparkApplicationDetailsRuntimeModel)
      .build();
    assertEquals(sparkApplicationDetailsModel.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModel.arguments(), java.util.Arrays.asList("people.txt"));
    assertEquals(sparkApplicationDetailsModel.xClass(), "org.apache.spark.examples.SparkPi");
    assertEquals(sparkApplicationDetailsModel.conf(), sparkApplicationConfigModel);
    assertEquals(sparkApplicationDetailsModel.env(), sparkApplicationEnvModel);
    assertEquals(sparkApplicationDetailsModel.files(), "s3://mybucket/myfile.txt");
    assertEquals(sparkApplicationDetailsModel.jars(), "testString");
    assertEquals(sparkApplicationDetailsModel.name(), "SparkApplicaton1");
    assertEquals(sparkApplicationDetailsModel.packages(), "org.apache.spark:example_1.2.3");
    assertEquals(sparkApplicationDetailsModel.repositories(), "https://repo1.maven.org/maven2/");
    assertEquals(sparkApplicationDetailsModel.sparkVersion(), "3.3");
    assertEquals(sparkApplicationDetailsModel.runtime(), sparkApplicationDetailsRuntimeModel);

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

    CreateSparkEngineApplicationOptions createSparkEngineApplicationOptionsModel = new CreateSparkEngineApplicationOptions.Builder()
      .engineId("testString")
      .applicationDetails(sparkApplicationDetailsModel)
      .jobEndpoint("<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications")
      .serviceInstanceId("testString")
      .type("iae")
      .volumes(java.util.Arrays.asList(sparkVolumeDetailsModel))
      .authInstanceId("testString")
      .state(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(createSparkEngineApplicationOptionsModel.engineId(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.applicationDetails(), sparkApplicationDetailsModel);
    assertEquals(createSparkEngineApplicationOptionsModel.jobEndpoint(), "<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications");
    assertEquals(createSparkEngineApplicationOptionsModel.serviceInstanceId(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.type(), "iae");
    assertEquals(createSparkEngineApplicationOptionsModel.volumes(), java.util.Arrays.asList(sparkVolumeDetailsModel));
    assertEquals(createSparkEngineApplicationOptionsModel.authInstanceId(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.state(), java.util.Arrays.asList("testString"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineApplicationOptionsError() throws Throwable {
    new CreateSparkEngineApplicationOptions.Builder().build();
  }

}