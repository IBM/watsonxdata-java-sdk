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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
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
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();
    assertEquals(catalogsModel.catalogNames(), java.util.Arrays.asList("iceberg_data", "hive_data"));

    CreateIntegrationOptions createIntegrationOptionsModel = new CreateIntegrationOptions.Builder()
      .accessToken("Header.Payload.Signature")
      .apikey("apikey")
      .catalogs(catalogsModel)
      .certificate("certificate_content_base64_encoded")
      .certificateExtension("pem")
      .connectionMode("external")
      .crossAccountIntegration(false)
      .enableDataPolicyWithinWxd(false)
      .ikcUserAccountId("ikc_user_account_id")
      .password("password")
      .policyCacheTimeConfiguration("123456789")
      .resource("presto01")
      .ssl(true)
      .type("ranger")
      .url("https://abcd.efgh.com")
      .username("username")
      .authInstanceId("testString")
      .build();
    assertEquals(createIntegrationOptionsModel.accessToken(), "Header.Payload.Signature");
    assertEquals(createIntegrationOptionsModel.apikey(), "apikey");
    assertEquals(createIntegrationOptionsModel.catalogs(), catalogsModel);
    assertEquals(createIntegrationOptionsModel.certificate(), "certificate_content_base64_encoded");
    assertEquals(createIntegrationOptionsModel.certificateExtension(), "pem");
    assertEquals(createIntegrationOptionsModel.connectionMode(), "external");
    assertEquals(createIntegrationOptionsModel.crossAccountIntegration(), Boolean.valueOf(false));
    assertEquals(createIntegrationOptionsModel.enableDataPolicyWithinWxd(), Boolean.valueOf(false));
    assertEquals(createIntegrationOptionsModel.ikcUserAccountId(), "ikc_user_account_id");
    assertEquals(createIntegrationOptionsModel.password(), "password");
    assertEquals(createIntegrationOptionsModel.policyCacheTimeConfiguration(), "123456789");
    assertEquals(createIntegrationOptionsModel.resource(), "presto01");
    assertEquals(createIntegrationOptionsModel.ssl(), Boolean.valueOf(true));
    assertEquals(createIntegrationOptionsModel.type(), "ranger");
    assertEquals(createIntegrationOptionsModel.url(), "https://abcd.efgh.com");
    assertEquals(createIntegrationOptionsModel.username(), "username");
    assertEquals(createIntegrationOptionsModel.authInstanceId(), "testString");
  }
}