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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateMilvusServiceScaleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
      .serviceId("testString")
      .tshirtSize("testString")
      .indexType("FLAT")
      .iwCpu(Long.valueOf("1"))
      .iwMemory(Long.valueOf("1"))
      .iwReplicas(Long.valueOf("1"))
      .milvusName("milvus123")
      .qwCpu(Long.valueOf("1"))
      .qwMemory(Long.valueOf("1"))
      .qwReplicas(Long.valueOf("1"))
      .vectorDimension(Long.valueOf("384"))
      .authInstanceId("testString")
      .build();
    assertEquals(createMilvusServiceScaleOptionsModel.serviceId(), "testString");
    assertEquals(createMilvusServiceScaleOptionsModel.tshirtSize(), "testString");
    assertEquals(createMilvusServiceScaleOptionsModel.indexType(), "FLAT");
    assertEquals(createMilvusServiceScaleOptionsModel.iwCpu(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.iwMemory(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.iwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.milvusName(), "milvus123");
    assertEquals(createMilvusServiceScaleOptionsModel.qwCpu(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.qwMemory(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.qwReplicas(), Long.valueOf("1"));
    assertEquals(createMilvusServiceScaleOptionsModel.vectorDimension(), Long.valueOf("384"));
    assertEquals(createMilvusServiceScaleOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMilvusServiceScaleOptionsError() throws Throwable {
    new CreateMilvusServiceScaleOptions.Builder().build();
  }

}