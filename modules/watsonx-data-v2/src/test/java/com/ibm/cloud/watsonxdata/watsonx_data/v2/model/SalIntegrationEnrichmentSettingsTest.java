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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettings;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansion;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsTermAssignment;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalIntegrationEnrichmentSettings model.
 */
public class SalIntegrationEnrichmentSettingsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalIntegrationEnrichmentSettings() throws Throwable {
    SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.14"))
      .suggestionThreshold(Double.valueOf("0.9"))
      .build();
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel.assignmentThreshold(), Double.valueOf("0.14"));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel.suggestionThreshold(), Double.valueOf("0.9"));

    SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel = new SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.1"))
      .suggestionThreshold(Double.valueOf("0.1"))
      .build();
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel.assignmentThreshold(), Double.valueOf("0.1"));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel.suggestionThreshold(), Double.valueOf("0.1"));

    SalIntegrationEnrichmentSettingsSemanticExpansion salIntegrationEnrichmentSettingsSemanticExpansionModel = new SalIntegrationEnrichmentSettingsSemanticExpansion.Builder()
      .descriptionGeneration(true)
      .descriptionGenerationConfiguration(salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel)
      .nameExpansion(true)
      .nameExpansionConfiguration(salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel)
      .build();
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionModel.descriptionGeneration(), Boolean.valueOf(true));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionModel.descriptionGenerationConfiguration(), salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfigurationModel);
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionModel.nameExpansion(), Boolean.valueOf(true));
    assertEquals(salIntegrationEnrichmentSettingsSemanticExpansionModel.nameExpansionConfiguration(), salIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfigurationModel);

    SalIntegrationEnrichmentSettingsTermAssignment salIntegrationEnrichmentSettingsTermAssignmentModel = new SalIntegrationEnrichmentSettingsTermAssignment.Builder()
      .classBasedAssignments(false)
      .evaluateNegativeAssignments(false)
      .llmBasedAssignments(false)
      .mlBasedAssignmentsCustom(false)
      .mlBasedAssignmentsDefault(false)
      .nameMatching(false)
      .termAssignmentThreshold(Double.valueOf("0.3"))
      .termSuggestionThreshold(Double.valueOf("0.4"))
      .build();
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.classBasedAssignments(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.evaluateNegativeAssignments(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.llmBasedAssignments(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.mlBasedAssignmentsCustom(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.mlBasedAssignmentsDefault(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.nameMatching(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.termAssignmentThreshold(), Double.valueOf("0.3"));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModel.termSuggestionThreshold(), Double.valueOf("0.4"));

    SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettingsModel = new SalIntegrationEnrichmentSettings.Builder()
      .semanticExpansion(salIntegrationEnrichmentSettingsSemanticExpansionModel)
      .termAssignment(salIntegrationEnrichmentSettingsTermAssignmentModel)
      .build();
    assertEquals(salIntegrationEnrichmentSettingsModel.semanticExpansion(), salIntegrationEnrichmentSettingsSemanticExpansionModel);
    assertEquals(salIntegrationEnrichmentSettingsModel.termAssignment(), salIntegrationEnrichmentSettingsTermAssignmentModel);

    String json = TestUtilities.serialize(salIntegrationEnrichmentSettingsModel);

    SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettingsModelNew = TestUtilities.deserialize(json, SalIntegrationEnrichmentSettings.class);
    assertTrue(salIntegrationEnrichmentSettingsModelNew instanceof SalIntegrationEnrichmentSettings);
    assertEquals(salIntegrationEnrichmentSettingsModelNew.semanticExpansion().toString(), salIntegrationEnrichmentSettingsSemanticExpansionModel.toString());
    assertEquals(salIntegrationEnrichmentSettingsModelNew.termAssignment().toString(), salIntegrationEnrichmentSettingsTermAssignmentModel.toString());
  }
}