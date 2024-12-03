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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ErrorObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalIntegration model.
 */
public class SalIntegrationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalIntegration() throws Throwable {
    SalIntegration salIntegrationModel = new SalIntegration();
    assertNull(salIntegrationModel.getCategoryId());
    assertNull(salIntegrationModel.getEngineId());
    assertNull(salIntegrationModel.getErrors());
    assertNull(salIntegrationModel.getGovernanceScopeId());
    assertNull(salIntegrationModel.getGovernanceScopeType());
    assertNull(salIntegrationModel.getInstanceId());
    assertNull(salIntegrationModel.getStatus());
    assertNull(salIntegrationModel.getStorageResourceCrn());
    assertNull(salIntegrationModel.getStorageType());
    assertNull(salIntegrationModel.getTimestamp());
    assertNull(salIntegrationModel.isTrialPlan());
    assertNull(salIntegrationModel.getUsername());
  }
}