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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkEngineApplicationCallback;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SparkVolumeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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
    SparkApplicationRuntime sparkApplicationRuntimeModel = new SparkApplicationRuntime.Builder()
      .sparkVersion("3.4")
      .build();
    assertEquals(sparkApplicationRuntimeModel.sparkVersion(), "3.4");

    SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
      .application("s3://mybucket/wordcount.py")
      .archives("s3://mybucket/myarchive.zip")
      .arguments(java.util.Arrays.asList("people.txt"))
      .xClass("org.apache.spark.examples.SparkPi")
      .conf(java.util.Collections.singletonMap("key1", "configuration"))
      .env(java.util.Collections.singletonMap("key1", "configuration"))
      .files("s3://mybucket/myfile.txt")
      .jars("testString")
      .name("SparkApplicaton1")
      .packages("org.apache.spark:example_1.2.3")
      .repositories("https://repo1.maven.org/maven2/")
      .runtime(sparkApplicationRuntimeModel)
      .sparkVersion("3.3")
      .build();
    assertEquals(sparkApplicationDetailsModel.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModel.archives(), "s3://mybucket/myarchive.zip");
    assertEquals(sparkApplicationDetailsModel.arguments(), java.util.Arrays.asList("people.txt"));
    assertEquals(sparkApplicationDetailsModel.xClass(), "org.apache.spark.examples.SparkPi");
    assertEquals(sparkApplicationDetailsModel.conf(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkApplicationDetailsModel.env(), java.util.Collections.singletonMap("key1", "configuration"));
    assertEquals(sparkApplicationDetailsModel.files(), "s3://mybucket/myfile.txt");
    assertEquals(sparkApplicationDetailsModel.jars(), "testString");
    assertEquals(sparkApplicationDetailsModel.name(), "SparkApplicaton1");
    assertEquals(sparkApplicationDetailsModel.packages(), "org.apache.spark:example_1.2.3");
    assertEquals(sparkApplicationDetailsModel.repositories(), "https://repo1.maven.org/maven2/");
    assertEquals(sparkApplicationDetailsModel.runtime(), sparkApplicationRuntimeModel);
    assertEquals(sparkApplicationDetailsModel.sparkVersion(), "3.3");

    SparkEngineApplicationCallback sparkEngineApplicationCallbackModel = new SparkEngineApplicationCallback.Builder()
      .url("testString")
      .build();
    assertEquals(sparkEngineApplicationCallbackModel.url(), "testString");

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
      .id("testString")
      .applicationDetails(sparkApplicationDetailsModel)
      .callback(sparkEngineApplicationCallbackModel)
      .contextId("testString")
      .contextType("project")
      .deployMode("local")
      .idempotencyKey("testString")
      .initScripts(java.util.Arrays.asList("file://init_scripts/test.sh"))
      .jobEndpoint("<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications")
      .maxRetries("3")
      .minRetryIntervalInSeconds("30")
      .serviceInstanceId("iae")
      .timeoutInSeconds("60")
      .type("spark")
      .volumes(java.util.Arrays.asList(sparkVolumeDetailsModel))
      .authInstanceId("testString")
      .build();
    assertEquals(createSparkEngineApplicationOptionsModel.id(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.applicationDetails(), sparkApplicationDetailsModel);
    assertEquals(createSparkEngineApplicationOptionsModel.callback(), sparkEngineApplicationCallbackModel);
    assertEquals(createSparkEngineApplicationOptionsModel.contextId(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.contextType(), "project");
    assertEquals(createSparkEngineApplicationOptionsModel.deployMode(), "local");
    assertEquals(createSparkEngineApplicationOptionsModel.idempotencyKey(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.initScripts(), java.util.Arrays.asList("file://init_scripts/test.sh"));
    assertEquals(createSparkEngineApplicationOptionsModel.jobEndpoint(), "<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications");
    assertEquals(createSparkEngineApplicationOptionsModel.maxRetries(), "3");
    assertEquals(createSparkEngineApplicationOptionsModel.minRetryIntervalInSeconds(), "30");
    assertEquals(createSparkEngineApplicationOptionsModel.serviceInstanceId(), "iae");
    assertEquals(createSparkEngineApplicationOptionsModel.timeoutInSeconds(), "60");
    assertEquals(createSparkEngineApplicationOptionsModel.type(), "spark");
    assertEquals(createSparkEngineApplicationOptionsModel.volumes(), java.util.Arrays.asList(sparkVolumeDetailsModel));
    assertEquals(createSparkEngineApplicationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineApplicationOptionsError() throws Throwable {
    new CreateSparkEngineApplicationOptions.Builder().build();
  }

}