/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.CreateSparkEngineApplicationOptions;
import com.ibm.cloud.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
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
    SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
      .application("s3://mybucket/wordcount.py")
      .arguments(java.util.Arrays.asList("people.txt"))
      .conf(java.util.Collections.singletonMap("key1", "key:value"))
      .env(java.util.Collections.singletonMap("key1", "key:value"))
      .name("SparkApplicaton1")
      .build();
    assertEquals(sparkApplicationDetailsModel.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModel.arguments(), java.util.Arrays.asList("people.txt"));
    assertEquals(sparkApplicationDetailsModel.conf(), java.util.Collections.singletonMap("key1", "key:value"));
    assertEquals(sparkApplicationDetailsModel.env(), java.util.Collections.singletonMap("key1", "key:value"));
    assertEquals(sparkApplicationDetailsModel.name(), "SparkApplicaton1");

    CreateSparkEngineApplicationOptions createSparkEngineApplicationOptionsModel = new CreateSparkEngineApplicationOptions.Builder()
      .engineId("testString")
      .applicationDetails(sparkApplicationDetailsModel)
      .jobEndpoint("<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications")
      .serviceInstanceId("testString")
      .type("iae")
      .authInstanceId("testString")
      .build();
    assertEquals(createSparkEngineApplicationOptionsModel.engineId(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.applicationDetails(), sparkApplicationDetailsModel);
    assertEquals(createSparkEngineApplicationOptionsModel.jobEndpoint(), "<host>/v4/analytics_engines/c7b3fccf-badb-46b0-b1ef-9b3154424021/engine_applications");
    assertEquals(createSparkEngineApplicationOptionsModel.serviceInstanceId(), "testString");
    assertEquals(createSparkEngineApplicationOptionsModel.type(), "iae");
    assertEquals(createSparkEngineApplicationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSparkEngineApplicationOptionsError() throws Throwable {
    new CreateSparkEngineApplicationOptions.Builder().build();
  }

}