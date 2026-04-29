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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateMilvusServiceOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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
      .displayName("sampleService")
      .origin("native")
      .rootPath("Sample/path")
      .tshirtSize("small")
      .dcCpu(Double.valueOf("0.01"))
      .dcMemory(Double.valueOf("0.01"))
      .dcReplicas(Long.valueOf("1"))
      .description("milvus service for running sql queries")
      .dwCpu(Double.valueOf("0.01"))
      .dwMemory(Double.valueOf("0.01"))
      .dwReplicas(Long.valueOf("1"))
      .etcdCpu(Double.valueOf("0.01"))
      .etcdMemory(Double.valueOf("0.01"))
      .id("milvus123")
      .indexType("ivf_sq8")
      .iwCpu(Double.valueOf("0.01"))
      .iwMemory(Double.valueOf("0.01"))
      .iwReplicas(Long.valueOf("1"))
      .kafkaCpu(Double.valueOf("0.01"))
      .kafkaMemory(Double.valueOf("0.01"))
      .proxyCpu(Double.valueOf("0.01"))
      .proxyMemory(Double.valueOf("0.01"))
      .proxyReplicas(Long.valueOf("1"))
      .qcCpu(Double.valueOf("0.01"))
      .qcMemory(Double.valueOf("0.01"))
      .qcReplicas(Long.valueOf("1"))
      .qwCpu(Double.valueOf("0.01"))
      .qwMemory(Double.valueOf("0.01"))
      .qwReplicas(Long.valueOf("1"))
      .rcCpu(Double.valueOf("0.01"))
      .rcMemory(Double.valueOf("0.01"))
      .rcReplicas(Long.valueOf("1"))
      .storageName("Sample_storage_name")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .vector(Long.valueOf("1"))
      .vectorDimension(Long.valueOf("384"))
      .authInstanceId("testString")
      .build();
    assertEquals(createMilvusServiceOptionsModel.displayName(), "sampleService");
    assertEquals(createMilvusServiceOptionsModel.origin(), "native");
    assertEquals(createMilvusServiceOptionsModel.rootPath(), "Sample/path");
    assertEquals(createMilvusServiceOptionsModel.tshirtSize(), "small");
    assertEquals(createMilvusServiceOptionsModel.dcCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.dcMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.dcReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.description(), "milvus service for running sql queries");
    assertEquals(createMilvusServiceOptionsModel.dwCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.dwMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.dwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.etcdCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.etcdMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.id(), "milvus123");
    assertEquals(createMilvusServiceOptionsModel.indexType(), "ivf_sq8");
    assertEquals(createMilvusServiceOptionsModel.iwCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.iwMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.iwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.kafkaCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.kafkaMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.proxyCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.proxyMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.proxyReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.qcCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.qcMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.qcReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.qwCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.qwMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.qwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.rcCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.rcMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceOptionsModel.rcReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.storageName(), "Sample_storage_name");
    assertEquals(createMilvusServiceOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(createMilvusServiceOptionsModel.vector(), Long.valueOf("1"));
    assertEquals(createMilvusServiceOptionsModel.vectorDimension(), Long.valueOf("384"));
    assertEquals(createMilvusServiceOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceOptionsError() throws Throwable {
    new CreateMilvusServiceOptions.Builder().build();
  }

}