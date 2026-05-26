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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BucketDetails model.
 */
public class BucketDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBucketDetails() throws Throwable {
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("testString")
      .accountName("testString")
      .applicationId("testString")
      .containerName("testString")
      .directoryId("testString")
      .endpoint("testString")
      .region("testString")
      .secretKey("testString")
      .authMode("aws_assume_role")
      .roleArn("testString")
      .managedBy("testString")
      .name("testString")
      .type("adls_gen1")
      .build();
    assertEquals(bucketDetailsModel.accessKey(), "testString");
    assertEquals(bucketDetailsModel.accountName(), "testString");
    assertEquals(bucketDetailsModel.applicationId(), "testString");
    assertEquals(bucketDetailsModel.containerName(), "testString");
    assertEquals(bucketDetailsModel.directoryId(), "testString");
    assertEquals(bucketDetailsModel.endpoint(), "testString");
    assertEquals(bucketDetailsModel.region(), "testString");
    assertEquals(bucketDetailsModel.secretKey(), "testString");
    assertEquals(bucketDetailsModel.authMode(), "aws_assume_role");
    assertEquals(bucketDetailsModel.roleArn(), "testString");
    assertEquals(bucketDetailsModel.managedBy(), "testString");
    assertEquals(bucketDetailsModel.name(), "testString");
    assertEquals(bucketDetailsModel.type(), "adls_gen1");

    String json = TestUtilities.serialize(bucketDetailsModel);

    BucketDetails bucketDetailsModelNew = TestUtilities.deserialize(json, BucketDetails.class);
    assertTrue(bucketDetailsModelNew instanceof BucketDetails);
    assertEquals(bucketDetailsModelNew.accessKey(), "testString");
    assertEquals(bucketDetailsModelNew.accountName(), "testString");
    assertEquals(bucketDetailsModelNew.applicationId(), "testString");
    assertEquals(bucketDetailsModelNew.containerName(), "testString");
    assertEquals(bucketDetailsModelNew.directoryId(), "testString");
    assertEquals(bucketDetailsModelNew.endpoint(), "testString");
    assertEquals(bucketDetailsModelNew.region(), "testString");
    assertEquals(bucketDetailsModelNew.secretKey(), "testString");
    assertEquals(bucketDetailsModelNew.authMode(), "aws_assume_role");
    assertEquals(bucketDetailsModelNew.roleArn(), "testString");
    assertEquals(bucketDetailsModelNew.managedBy(), "testString");
    assertEquals(bucketDetailsModelNew.name(), "testString");
    assertEquals(bucketDetailsModelNew.type(), "adls_gen1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBucketDetailsError() throws Throwable {
    new BucketDetails.Builder().build();
  }

}