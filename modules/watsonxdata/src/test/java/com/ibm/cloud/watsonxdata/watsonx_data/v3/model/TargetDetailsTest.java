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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TargetDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TargetDetails model.
 */
public class TargetDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTargetDetails() throws Throwable {
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

    TargetDetails targetDetailsModel = new TargetDetails.Builder()
      .catalog("testString")
      .schema("testString")
      .table("testString")
      .writeMode("testString")
      .mergeOnRead(false)
      .schemaMode("testString")
      .schemaInfer(true)
      .catalogUri("testString")
      .bucketDetails(bucketDetailsModel)
      .location("testString")
      .isNewSchema(false)
      .isNewTable(false)
      .build();
    assertEquals(targetDetailsModel.catalog(), "testString");
    assertEquals(targetDetailsModel.schema(), "testString");
    assertEquals(targetDetailsModel.table(), "testString");
    assertEquals(targetDetailsModel.writeMode(), "testString");
    assertEquals(targetDetailsModel.mergeOnRead(), Boolean.valueOf(false));
    assertEquals(targetDetailsModel.schemaMode(), "testString");
    assertEquals(targetDetailsModel.schemaInfer(), Boolean.valueOf(true));
    assertEquals(targetDetailsModel.catalogUri(), "testString");
    assertEquals(targetDetailsModel.bucketDetails(), bucketDetailsModel);
    assertEquals(targetDetailsModel.location(), "testString");
    assertEquals(targetDetailsModel.isNewSchema(), Boolean.valueOf(false));
    assertEquals(targetDetailsModel.isNewTable(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(targetDetailsModel);

    TargetDetails targetDetailsModelNew = TestUtilities.deserialize(json, TargetDetails.class);
    assertTrue(targetDetailsModelNew instanceof TargetDetails);
    assertEquals(targetDetailsModelNew.catalog(), "testString");
    assertEquals(targetDetailsModelNew.schema(), "testString");
    assertEquals(targetDetailsModelNew.table(), "testString");
    assertEquals(targetDetailsModelNew.writeMode(), "testString");
    assertEquals(targetDetailsModelNew.mergeOnRead(), Boolean.valueOf(false));
    assertEquals(targetDetailsModelNew.schemaMode(), "testString");
    assertEquals(targetDetailsModelNew.schemaInfer(), Boolean.valueOf(true));
    assertEquals(targetDetailsModelNew.catalogUri(), "testString");
    assertEquals(targetDetailsModelNew.bucketDetails().toString(), bucketDetailsModel.toString());
    assertEquals(targetDetailsModelNew.location(), "testString");
    assertEquals(targetDetailsModelNew.isNewSchema(), Boolean.valueOf(false));
    assertEquals(targetDetailsModelNew.isNewTable(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testTargetDetailsError() throws Throwable {
    new TargetDetails.Builder().build();
  }

}