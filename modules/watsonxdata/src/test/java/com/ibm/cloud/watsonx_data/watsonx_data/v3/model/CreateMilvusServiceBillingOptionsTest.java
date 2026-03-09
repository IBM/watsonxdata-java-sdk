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
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.CreateMilvusServiceBillingOptions;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMilvusServiceBillingOptions model.
 */
public class CreateMilvusServiceBillingOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMilvusServiceBillingOptions() throws Throwable {
    CreateMilvusServiceBillingOptions createMilvusServiceBillingOptionsModel = new CreateMilvusServiceBillingOptions.Builder()
      .iwCpu(Double.valueOf("0"))
      .iwMemory(Double.valueOf("0"))
      .iwReplicas(Long.valueOf("0"))
      .qwCpu(Double.valueOf("0"))
      .qwMemory(Double.valueOf("0"))
      .qwReplicas(Long.valueOf("0"))
      .dcCpu(Double.valueOf("0"))
      .dcMemory(Double.valueOf("0"))
      .dcReplicas(Long.valueOf("0"))
      .dwCpu(Double.valueOf("0"))
      .dwMemory(Double.valueOf("0"))
      .dwReplicas(Long.valueOf("0"))
      .etcdCpu(Double.valueOf("0"))
      .etcdMemory(Double.valueOf("0"))
      .kafkaCpu(Double.valueOf("0"))
      .kafkaMemory(Double.valueOf("0"))
      .proxyCpu(Double.valueOf("0"))
      .proxyMemory(Double.valueOf("0"))
      .proxyReplicas(Long.valueOf("0"))
      .qcCpu(Double.valueOf("0"))
      .qcMemory(Double.valueOf("0"))
      .qcReplicas(Long.valueOf("0"))
      .rcCpu(Double.valueOf("0"))
      .rcMemory(Double.valueOf("0"))
      .rcReplicas(Long.valueOf("0"))
      .authInstanceId("testString")
      .build();
    assertEquals(createMilvusServiceBillingOptionsModel.iwCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.iwMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.iwReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.qwCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.qwMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.qwReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.dcCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.dcMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.dcReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.dwCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.dwMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.dwReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.etcdCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.etcdMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.kafkaCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.kafkaMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.proxyCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.proxyMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.proxyReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.qcCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.qcMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.qcReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.rcCpu(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.rcMemory(), Double.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.rcReplicas(), Long.valueOf("0"));
    assertEquals(createMilvusServiceBillingOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceBillingOptionsError() throws Throwable {
    new CreateMilvusServiceBillingOptions.Builder().build();
  }

}