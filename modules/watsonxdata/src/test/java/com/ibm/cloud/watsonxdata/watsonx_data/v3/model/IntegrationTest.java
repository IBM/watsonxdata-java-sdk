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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Integration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Integration model.
 */
public class IntegrationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIntegration() throws Throwable {
    Integration integrationModel = new Integration();
    assertNull(integrationModel.getAccessToken());
    assertNull(integrationModel.getApikey());
    assertNull(integrationModel.getAuthUrl());
    assertNull(integrationModel.getCatalogs());
    assertNull(integrationModel.getCertificate());
    assertNull(integrationModel.getCertificateExtension());
    assertNull(integrationModel.getConfigProperties());
    assertNull(integrationModel.getConnectionMode());
    assertNull(integrationModel.isCrossAccountIntegration());
    assertNull(integrationModel.isEnableDataPolicyWithinWxd());
    assertNull(integrationModel.getGovernanceProperties());
    assertNull(integrationModel.getId());
    assertNull(integrationModel.getIkcUserAccountId());
    assertNull(integrationModel.getMantaUrl());
    assertNull(integrationModel.getModifiedAt());
    assertNull(integrationModel.getModifiedBy());
    assertNull(integrationModel.getPassword());
    assertNull(integrationModel.getPolicyCacheTimeConfiguration());
    assertNull(integrationModel.getResource());
    assertNull(integrationModel.isSsl());
    assertNull(integrationModel.getState());
    assertNull(integrationModel.getType());
    assertNull(integrationModel.getUrl());
    assertNull(integrationModel.getUsername());
    assertNull(integrationModel.getZenApikey());
  }
}