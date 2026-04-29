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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IngestionEngine model.
 */
public class IngestionEngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIngestionEngine() throws Throwable {
    ExecuteConfig executeConfigModel = new ExecuteConfig.Builder()
      .driverMemory("testString")
      .driverCores(Long.valueOf("1"))
      .executorMemory("testString")
      .executorCores(Long.valueOf("1"))
      .numExecutors(Long.valueOf("1"))
      .build();
    assertEquals(executeConfigModel.driverMemory(), "testString");
    assertEquals(executeConfigModel.driverCores(), Long.valueOf("1"));
    assertEquals(executeConfigModel.executorMemory(), "testString");
    assertEquals(executeConfigModel.executorCores(), Long.valueOf("1"));
    assertEquals(executeConfigModel.numExecutors(), Long.valueOf("1"));

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

    IngestionEngine ingestionEngineModel = new IngestionEngine.Builder()
      .engineId("testString")
      .name("testString")
      .endpoint("testString")
      .origin("testString")
      .executeConfig(executeConfigModel)
      .bucketDetails(bucketDetailsModel)
      .logPath("testString")
      .build();
    assertEquals(ingestionEngineModel.engineId(), "testString");
    assertEquals(ingestionEngineModel.name(), "testString");
    assertEquals(ingestionEngineModel.endpoint(), "testString");
    assertEquals(ingestionEngineModel.origin(), "testString");
    assertEquals(ingestionEngineModel.executeConfig(), executeConfigModel);
    assertEquals(ingestionEngineModel.bucketDetails(), bucketDetailsModel);
    assertEquals(ingestionEngineModel.logPath(), "testString");

    String json = TestUtilities.serialize(ingestionEngineModel);

    IngestionEngine ingestionEngineModelNew = TestUtilities.deserialize(json, IngestionEngine.class);
    assertTrue(ingestionEngineModelNew instanceof IngestionEngine);
    assertEquals(ingestionEngineModelNew.engineId(), "testString");
    assertEquals(ingestionEngineModelNew.name(), "testString");
    assertEquals(ingestionEngineModelNew.endpoint(), "testString");
    assertEquals(ingestionEngineModelNew.origin(), "testString");
    assertEquals(ingestionEngineModelNew.executeConfig().toString(), executeConfigModel.toString());
    assertEquals(ingestionEngineModelNew.bucketDetails().toString(), bucketDetailsModel.toString());
    assertEquals(ingestionEngineModelNew.logPath(), "testString");
  }
}