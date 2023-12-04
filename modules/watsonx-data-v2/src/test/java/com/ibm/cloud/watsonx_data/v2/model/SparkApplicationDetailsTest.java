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
import com.ibm.cloud.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
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

    String json = TestUtilities.serialize(sparkApplicationDetailsModel);

    SparkApplicationDetails sparkApplicationDetailsModelNew = TestUtilities.deserialize(json, SparkApplicationDetails.class);
    assertTrue(sparkApplicationDetailsModelNew instanceof SparkApplicationDetails);
    assertEquals(sparkApplicationDetailsModelNew.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModelNew.name(), "SparkApplicaton1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSparkApplicationDetailsError() throws Throwable {
    new SparkApplicationDetails.Builder().build();
  }

}