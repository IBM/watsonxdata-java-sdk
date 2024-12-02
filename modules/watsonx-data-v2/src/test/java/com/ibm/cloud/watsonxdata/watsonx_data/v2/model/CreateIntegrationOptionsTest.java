/*
 * (C) Copyright IBM Corp. 2024.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateIntegrationOptions model.
 */
public class CreateIntegrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateIntegrationOptions() throws Throwable {
    CreateIntegrationOptions createIntegrationOptionsModel = new CreateIntegrationOptions.Builder()
      .apikey("apikey")
      .enableDataPolicyWithinWxd(false)
      .password("password")
      .resource("presto01")
      .serviceType("ranger")
      .storageCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .url("ikc.url")
      .username("username@email.com")
      .authInstanceId("testString")
      .build();
    assertEquals(createIntegrationOptionsModel.apikey(), "apikey");
    assertEquals(createIntegrationOptionsModel.enableDataPolicyWithinWxd(), Boolean.valueOf(false));
    assertEquals(createIntegrationOptionsModel.password(), "password");
    assertEquals(createIntegrationOptionsModel.resource(), "presto01");
    assertEquals(createIntegrationOptionsModel.serviceType(), "ranger");
    assertEquals(createIntegrationOptionsModel.storageCatalogs(), java.util.Arrays.asList("iceberg_data", "hive_data"));
    assertEquals(createIntegrationOptionsModel.url(), "ikc.url");
    assertEquals(createIntegrationOptionsModel.username(), "username@email.com");
    assertEquals(createIntegrationOptionsModel.authInstanceId(), "testString");
  }
}