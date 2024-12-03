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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
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
    IntegrationPatch integrationPatchModel = new IntegrationPatch.Builder()
      .apikey("apikey")
      .enableDataPolicyWithinWxd(false)
      .password("password")
      .resource("presto01")
      .storageCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .url("ikc.url")
      .username("username@email.com")
      .build();
    assertEquals(integrationPatchModel.apikey(), "apikey");
    assertEquals(integrationPatchModel.enableDataPolicyWithinWxd(), Boolean.valueOf(false));
    assertEquals(integrationPatchModel.password(), "password");
    assertEquals(integrationPatchModel.resource(), "presto01");
    assertEquals(integrationPatchModel.storageCatalogs(), java.util.Arrays.asList("iceberg_data", "hive_data"));
    assertEquals(integrationPatchModel.url(), "ikc.url");
    assertEquals(integrationPatchModel.username(), "username@email.com");

    String json = TestUtilities.serialize(integrationPatchModel);

    IntegrationPatch integrationPatchModelNew = TestUtilities.deserialize(json, IntegrationPatch.class);
    assertTrue(integrationPatchModelNew instanceof IntegrationPatch);
    assertEquals(integrationPatchModelNew.apikey(), "apikey");
    assertEquals(integrationPatchModelNew.enableDataPolicyWithinWxd(), Boolean.valueOf(false));
    assertEquals(integrationPatchModelNew.password(), "password");
    assertEquals(integrationPatchModelNew.resource(), "presto01");
    assertEquals(integrationPatchModelNew.url(), "ikc.url");
    assertEquals(integrationPatchModelNew.username(), "username@email.com");
  }
  @Test
  public void testIntegrationPatchAsPatch() throws Throwable {
    IntegrationPatch integrationPatchModel = new IntegrationPatch.Builder()
      .apikey("apikey")
      .enableDataPolicyWithinWxd(false)
      .password("password")
      .resource("presto01")
      .storageCatalogs(java.util.Arrays.asList("iceberg_data", "hive_data"))
      .url("ikc.url")
      .username("username@email.com")
      .build();

    Map<String, Object> mergePatch = integrationPatchModel.asPatch();

    assertEquals(mergePatch.get("apikey"), "apikey");
    assertTrue(mergePatch.containsKey("enable_data_policy_within_wxd"));
    assertEquals(mergePatch.get("password"), "password");
    assertEquals(mergePatch.get("resource"), "presto01");
    assertTrue(mergePatch.containsKey("storage_catalogs"));
    assertEquals(mergePatch.get("url"), "ikc.url");
    assertEquals(mergePatch.get("username"), "username@email.com");
  }

}