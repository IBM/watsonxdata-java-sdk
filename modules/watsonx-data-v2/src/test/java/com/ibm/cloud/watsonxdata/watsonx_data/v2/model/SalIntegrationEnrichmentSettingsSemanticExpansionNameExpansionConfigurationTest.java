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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration model.
 */
public class SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration() throws Throwable {
    SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.1"))
      .suggestionThreshold(Double.valueOf("0.1"))
      .build();
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel.assignmentThreshold(), Double.valueOf("0.1"));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel.suggestionThreshold(), Double.valueOf("0.1"));

    String json = TestUtilities.serialize(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel);

    SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModelNew = TestUtilities.deserialize(json, SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration.class);
    assertTrue(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModelNew instanceof SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration);
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModelNew.assignmentThreshold(), Double.valueOf("0.1"));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModelNew.suggestionThreshold(), Double.valueOf("0.1"));
  }
}