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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration model.
 */
public class SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration() throws Throwable {
    SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.14"))
      .suggestionThreshold(Double.valueOf("0.9"))
      .build();
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel.assignmentThreshold(), Double.valueOf("0.14"));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel.suggestionThreshold(), Double.valueOf("0.9"));

    String json = TestUtilities.serialize(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel);

    SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModelNew = TestUtilities.deserialize(json, SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.class);
    assertTrue(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModelNew instanceof SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration);
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModelNew.assignmentThreshold(), Double.valueOf("0.14"));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModelNew.suggestionThreshold(), Double.valueOf("0.9"));
  }
}