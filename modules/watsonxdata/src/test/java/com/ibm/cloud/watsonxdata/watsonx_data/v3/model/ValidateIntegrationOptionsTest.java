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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Catalogs;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ValidateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ValidateIntegrationOptions model.
 */
public class ValidateIntegrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testValidateIntegrationOptions() throws Throwable {
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();
    assertEquals(catalogsModel.catalogNames(), java.util.Arrays.asList("iceberg_data", "hive_data"));

    ValidateIntegrationOptions validateIntegrationOptionsModel = new ValidateIntegrationOptions.Builder()
      .type("ranger")
      .accessToken("Header.Payload.Signature")
      .apikey("apikey")
      .catalogs(catalogsModel)
      .certificate("certificate_content_base64_encoded")
      .password("password")
      .ssl(true)
      .url("https://www.abcd.com")
      .username("username")
      .authInstanceId("testString")
      .build();
    assertEquals(validateIntegrationOptionsModel.type(), "ranger");
    assertEquals(validateIntegrationOptionsModel.accessToken(), "Header.Payload.Signature");
    assertEquals(validateIntegrationOptionsModel.apikey(), "apikey");
    assertEquals(validateIntegrationOptionsModel.catalogs(), catalogsModel);
    assertEquals(validateIntegrationOptionsModel.certificate(), "certificate_content_base64_encoded");
    assertEquals(validateIntegrationOptionsModel.password(), "password");
    assertEquals(validateIntegrationOptionsModel.ssl(), Boolean.valueOf(true));
    assertEquals(validateIntegrationOptionsModel.url(), "https://www.abcd.com");
    assertEquals(validateIntegrationOptionsModel.username(), "username");
    assertEquals(validateIntegrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateIntegrationOptionsError() throws Throwable {
    new ValidateIntegrationOptions.Builder().build();
  }

}