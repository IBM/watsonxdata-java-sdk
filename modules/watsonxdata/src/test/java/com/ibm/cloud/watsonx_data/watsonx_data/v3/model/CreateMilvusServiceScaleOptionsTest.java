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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServiceScaleOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMilvusServiceScaleOptions model.
 */
public class CreateMilvusServiceScaleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMilvusServiceScaleOptions() throws Throwable {
    CreateMilvusServiceScaleOptions createMilvusServiceScaleOptionsModel = new CreateMilvusServiceScaleOptions.Builder()
      .id("testString")
      .tshirtSize("small")
      .dcCpu(Double.valueOf("0.01"))
      .dcMemory(Double.valueOf("0.01"))
      .dcReplicas(Long.valueOf("1"))
      .dwCpu(Double.valueOf("0.01"))
      .dwMemory(Double.valueOf("0.01"))
      .dwReplicas(Long.valueOf("1"))
      .etcdCpu(Double.valueOf("0.01"))
      .etcdMemory(Double.valueOf("0.01"))
      .indexType("flat")
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
      .vector(Long.valueOf("1"))
      .vectorDimension(Long.valueOf("384"))
      .authInstanceId("testString")
      .build();
    assertEquals(createMilvusServiceScaleOptionsModel.id(), "testString");
    assertEquals(createMilvusServiceScaleOptionsModel.tshirtSize(), "small");
    assertEquals(createMilvusServiceScaleOptionsModel.dcCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.dcMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.dcReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.dwCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.dwMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.dwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.etcdCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.etcdMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.indexType(), "flat");
    assertEquals(createMilvusServiceScaleOptionsModel.iwCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.iwMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.iwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.kafkaCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.kafkaMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.proxyCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.proxyMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.proxyReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.qcCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.qcMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.qcReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.qwCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.qwMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.qwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.rcCpu(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.rcMemory(), Double.valueOf("0.01"));
    assertEquals(createMilvusServiceScaleOptionsModel.rcReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.vector(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.vectorDimension(), Long.valueOf("384"));
    assertEquals(createMilvusServiceScaleOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceScaleOptionsError() throws Throwable {
    new CreateMilvusServiceScaleOptions.Builder().build();
  }

}