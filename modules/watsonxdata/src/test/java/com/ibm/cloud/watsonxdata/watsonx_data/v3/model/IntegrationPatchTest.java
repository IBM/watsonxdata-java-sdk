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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IntegrationPatch model.
 */
public class IntegrationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIntegrationPatch() throws Throwable {
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();
    assertEquals(catalogsModel.catalogNames(), java.util.Arrays.asList("iceberg_data", "hive_data"));

    IntegrationPatch integrationPatchModel = new IntegrationPatch.Builder()
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
      .state("active")
      .url("https://abcd.efgh.com")
      .username("username")
      .build();
    assertEquals(integrationPatchModel.accessToken(), "Header.Payload.Signature");
    assertEquals(integrationPatchModel.apikey(), "apikey");
    assertEquals(integrationPatchModel.catalogs(), catalogsModel);
    assertEquals(integrationPatchModel.certificate(), "certificate_content_base64_encoded");
    assertEquals(integrationPatchModel.certificateExtension(), "pem");
    assertEquals(integrationPatchModel.connectionMode(), "external");
    assertEquals(integrationPatchModel.crossAccountIntegration(), Boolean.valueOf(false));
    assertEquals(integrationPatchModel.enableDataPolicyWithinWxd(), Boolean.valueOf(false));
    assertEquals(integrationPatchModel.ikcUserAccountId(), "ikc_user_account_id");
    assertEquals(integrationPatchModel.password(), "password");
    assertEquals(integrationPatchModel.policyCacheTimeConfiguration(), "123456789");
    assertEquals(integrationPatchModel.resource(), "presto01");
    assertEquals(integrationPatchModel.ssl(), Boolean.valueOf(true));
    assertEquals(integrationPatchModel.state(), "active");
    assertEquals(integrationPatchModel.url(), "https://abcd.efgh.com");
    assertEquals(integrationPatchModel.username(), "username");

    String json = TestUtilities.serialize(integrationPatchModel);

    IntegrationPatch integrationPatchModelNew = TestUtilities.deserialize(json, IntegrationPatch.class);
    assertTrue(integrationPatchModelNew instanceof IntegrationPatch);
    assertEquals(integrationPatchModelNew.accessToken(), "Header.Payload.Signature");
    assertEquals(integrationPatchModelNew.apikey(), "apikey");
    assertEquals(integrationPatchModelNew.catalogs().toString(), catalogsModel.toString());
    assertEquals(integrationPatchModelNew.certificate(), "certificate_content_base64_encoded");
    assertEquals(integrationPatchModelNew.certificateExtension(), "pem");
    assertEquals(integrationPatchModelNew.connectionMode(), "external");
    assertEquals(integrationPatchModelNew.crossAccountIntegration(), Boolean.valueOf(false));
    assertEquals(integrationPatchModelNew.enableDataPolicyWithinWxd(), Boolean.valueOf(false));
    assertEquals(integrationPatchModelNew.ikcUserAccountId(), "ikc_user_account_id");
    assertEquals(integrationPatchModelNew.password(), "password");
    assertEquals(integrationPatchModelNew.policyCacheTimeConfiguration(), "123456789");
    assertEquals(integrationPatchModelNew.resource(), "presto01");
    assertEquals(integrationPatchModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(integrationPatchModelNew.state(), "active");
    assertEquals(integrationPatchModelNew.url(), "https://abcd.efgh.com");
    assertEquals(integrationPatchModelNew.username(), "username");
  }
  @Test
  public void testIntegrationPatchAsPatch() throws Throwable {
    Catalogs catalogsModel = new Catalogs.Builder()
      .catalogNames(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .build();

    IntegrationPatch integrationPatchModel = new IntegrationPatch.Builder()
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
      .state("active")
      .url("https://abcd.efgh.com")
      .username("username")
      .build();

    Map<String, Object> mergePatch = integrationPatchModel.asPatch();

    assertEquals(mergePatch.get("access_token"), "Header.Payload.Signature");
    assertEquals(mergePatch.get("apikey"), "apikey");
    assertTrue(mergePatch.containsKey("catalogs"));
    assertEquals(mergePatch.get("certificate"), "certificate_content_base64_encoded");
    assertEquals(mergePatch.get("certificate_extension"), "pem");
    assertEquals(mergePatch.get("connection_mode"), "external");
    assertTrue(mergePatch.containsKey("cross_account_integration"));
    assertTrue(mergePatch.containsKey("enable_data_policy_within_wxd"));
    assertEquals(mergePatch.get("ikc_user_account_id"), "ikc_user_account_id");
    assertEquals(mergePatch.get("password"), "password");
    assertEquals(mergePatch.get("policy_cache_time_configuration"), "123456789");
    assertEquals(mergePatch.get("resource"), "presto01");
    assertTrue(mergePatch.containsKey("ssl"));
    assertEquals(mergePatch.get("state"), "active");
    assertEquals(mergePatch.get("url"), "https://abcd.efgh.com");
    assertEquals(mergePatch.get("username"), "username");
  }

}