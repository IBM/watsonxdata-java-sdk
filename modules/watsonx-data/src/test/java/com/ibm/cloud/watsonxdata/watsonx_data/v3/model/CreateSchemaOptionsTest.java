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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSchemaOptions model.
 */
public class CreateSchemaOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSchemaOptions() throws Throwable {
    CreateSchemaOptions createSchemaOptionsModel = new CreateSchemaOptions.Builder()
      .engineId("testString")
      .id("testString")
      .customPath("sample-path")
      .name("SampleSchema1")
      .hostname("db2@hostname.com")
      .port(Long.valueOf("4553"))
      .storageName("sample-bucket")
      .authInstanceId("testString")
      .build();
    assertEquals(createSchemaOptionsModel.engineId(), "testString");
    assertEquals(createSchemaOptionsModel.id(), "testString");
    assertEquals(createSchemaOptionsModel.customPath(), "sample-path");
    assertEquals(createSchemaOptionsModel.name(), "SampleSchema1");
    assertEquals(createSchemaOptionsModel.hostname(), "db2@hostname.com");
    assertEquals(createSchemaOptionsModel.port(), Long.valueOf("4553"));
    assertEquals(createSchemaOptionsModel.storageName(), "sample-bucket");
    assertEquals(createSchemaOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSchemaOptionsError() throws Throwable {
    new CreateSchemaOptions.Builder().build();
  }

}