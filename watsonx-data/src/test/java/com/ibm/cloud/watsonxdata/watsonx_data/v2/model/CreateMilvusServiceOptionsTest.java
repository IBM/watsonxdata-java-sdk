/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMilvusServiceOptions model.
 */
public class CreateMilvusServiceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMilvusServiceOptions() throws Throwable {
    CreateMilvusServiceOptions createMilvusServiceOptionsModel = new CreateMilvusServiceOptions.Builder()
      .bucketName("Sample bucket name")
      .origin("native")
      .rootPath("Sample path")
      .serviceDisplayName("sampleService")
      .bucketType("Sample bucket type")
      .description("milvus service for running sql queries")
      .indexType("FLAT")
      .iwCpu(Long.valueOf("1"))
      .iwMemory(Long.valueOf("1"))
      .iwReplicas(Long.valueOf("1"))
      .managedBy("customer")
      .qwCpu(Long.valueOf("1"))
      .qwMemory(Long.valueOf("1"))
      .qwReplicas(Long.valueOf("1"))
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .tshirtSize("small")
      .vectorDimension(Long.valueOf("384"))
      .authInstanceId("testString")
      .build();
    assertEquals(createMilvusServiceOptionsModel.bucketName(), "Sample bucket name");
    assertEquals(createMilvusServiceOptionsModel.origin(), "native");
    assertEquals(createMilvusServiceOptionsModel.rootPath(), "Sample path");
    assertEquals(createMilvusServiceOptionsModel.serviceDisplayName(), "sampleService");
    assertEquals(createMilvusServiceOptionsModel.bucketType(), "Sample bucket type");
    assertEquals(createMilvusServiceOptionsModel.description(), "milvus service for running sql queries");
    assertEquals(createMilvusServiceOptionsModel.indexType(), "FLAT");
    assertEquals(createMilvusServiceOptionsModel.iwCpu(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.iwMemory(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.iwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.managedBy(), "customer");
    assertEquals(createMilvusServiceOptionsModel.qwCpu(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.qwMemory(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.qwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createMilvusServiceOptionsModel.tshirtSize(), "small");
    assertEquals(createMilvusServiceOptionsModel.vectorDimension(), Long.valueOf("384"));
    assertEquals(createMilvusServiceOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceOptionsError() throws Throwable {
    new CreateMilvusServiceOptions.Builder().build();
  }

}