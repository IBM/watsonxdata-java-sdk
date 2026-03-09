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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationDetails;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.SparkApplicationRuntime;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkApplicationDetails model.
 */
public class SparkApplicationDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkApplicationDetails() throws Throwable {
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

    String json = TestUtilities.serialize(sparkApplicationDetailsModel);

    SparkApplicationDetails sparkApplicationDetailsModelNew = TestUtilities.deserialize(json, SparkApplicationDetails.class);
    assertTrue(sparkApplicationDetailsModelNew instanceof SparkApplicationDetails);
    assertEquals(sparkApplicationDetailsModelNew.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModelNew.archives(), "s3://mybucket/myarchive.zip");
    assertEquals(sparkApplicationDetailsModelNew.xClass(), "org.apache.spark.examples.SparkPi");
    assertEquals(sparkApplicationDetailsModelNew.files(), "s3://mybucket/myfile.txt");
    assertEquals(sparkApplicationDetailsModelNew.jars(), "testString");
    assertEquals(sparkApplicationDetailsModelNew.name(), "SparkApplicaton1");
    assertEquals(sparkApplicationDetailsModelNew.packages(), "org.apache.spark:example_1.2.3");
    assertEquals(sparkApplicationDetailsModelNew.repositories(), "https://repo1.maven.org/maven2/");
    assertEquals(sparkApplicationDetailsModelNew.runtime().toString(), sparkApplicationRuntimeModel.toString());
    assertEquals(sparkApplicationDetailsModelNew.sparkVersion(), "3.3");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSparkApplicationDetailsError() throws Throwable {
    new SparkApplicationDetails.Builder().build();
  }

}