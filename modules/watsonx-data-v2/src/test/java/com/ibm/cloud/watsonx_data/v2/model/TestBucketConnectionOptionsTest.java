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
import com.ibm.cloud.watsonx_data.v2.model.TestBucketConnectionOptions;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TestBucketConnectionOptions model.
 */
public class TestBucketConnectionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTestBucketConnectionOptions() throws Throwable {
    TestBucketConnectionOptions testBucketConnectionOptionsModel = new TestBucketConnectionOptions.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .bucketType("ibm_cos")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .region("us-south")
      .secretKey("secret_key")
      .authInstanceId("testString")
      .build();
    assertEquals(testBucketConnectionOptionsModel.accessKey(), "<access_key>");
    assertEquals(testBucketConnectionOptionsModel.bucketName(), "sample-bucket");
    assertEquals(testBucketConnectionOptionsModel.bucketType(), "ibm_cos");
    assertEquals(testBucketConnectionOptionsModel.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(testBucketConnectionOptionsModel.region(), "us-south");
    assertEquals(testBucketConnectionOptionsModel.secretKey(), "secret_key");
    assertEquals(testBucketConnectionOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTestBucketConnectionOptionsError() throws Throwable {
    new TestBucketConnectionOptions.Builder().build();
  }

}