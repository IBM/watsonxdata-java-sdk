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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ReplaceSalIntegrationEnrichmentProjectSettingsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansion;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansionDescriptionConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansionNameConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsTermAssignment;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceSalIntegrationEnrichmentProjectSettingsOptions model.
 */
public class ReplaceSalIntegrationEnrichmentProjectSettingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceSalIntegrationEnrichmentProjectSettingsOptions() throws Throwable {
    SalEnrichmentSettingsExpansionDescriptionConfiguration salEnrichmentSettingsExpansionDescriptionConfigurationModel = new SalEnrichmentSettingsExpansionDescriptionConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.14"))
      .suggestionThreshold(Double.valueOf("0.9"))
      .build();
    assertEquals(salEnrichmentSettingsExpansionDescriptionConfigurationModel.assignmentThreshold(), Double.valueOf("0.14"));
    assertEquals(salEnrichmentSettingsExpansionDescriptionConfigurationModel.suggestionThreshold(), Double.valueOf("0.9"));

    SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModel = new SalEnrichmentSettingsExpansionNameConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.1"))
      .suggestionThreshold(Double.valueOf("0.1"))
      .build();
    assertEquals(salEnrichmentSettingsExpansionNameConfigurationModel.assignmentThreshold(), Double.valueOf("0.1"));
    assertEquals(salEnrichmentSettingsExpansionNameConfigurationModel.suggestionThreshold(), Double.valueOf("0.1"));

    SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansionModel = new SalEnrichmentSettingsExpansion.Builder()
      .description(true)
      .descriptionConfiguration(salEnrichmentSettingsExpansionDescriptionConfigurationModel)
      .name(true)
      .nameConfiguration(salEnrichmentSettingsExpansionNameConfigurationModel)
      .build();
    assertEquals(salEnrichmentSettingsExpansionModel.description(), Boolean.valueOf(true));
    assertEquals(salEnrichmentSettingsExpansionModel.descriptionConfiguration(), salEnrichmentSettingsExpansionDescriptionConfigurationModel);
    assertEquals(salEnrichmentSettingsExpansionModel.name(), Boolean.valueOf(true));
    assertEquals(salEnrichmentSettingsExpansionModel.nameConfiguration(), salEnrichmentSettingsExpansionNameConfigurationModel);

    SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignmentModel = new SalEnrichmentSettingsTermAssignment.Builder()
      .classBasedAssignments(false)
      .evaluateNegativeAssignments(false)
      .llmBasedAssignments(false)
      .mlBasedAssignmentsCustom(false)
      .mlBasedAssignmentsDefault(false)
      .nameMatching(false)
      .termAssignmentThreshold(Double.valueOf("0.3"))
      .termSuggestionThreshold(Double.valueOf("0.4"))
      .build();
    assertEquals(salEnrichmentSettingsTermAssignmentModel.classBasedAssignments(), Boolean.valueOf(false));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.evaluateNegativeAssignments(), Boolean.valueOf(false));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.llmBasedAssignments(), Boolean.valueOf(false));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.mlBasedAssignmentsCustom(), Boolean.valueOf(false));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.mlBasedAssignmentsDefault(), Boolean.valueOf(false));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.nameMatching(), Boolean.valueOf(false));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.termAssignmentThreshold(), Double.valueOf("0.3"));
    assertEquals(salEnrichmentSettingsTermAssignmentModel.termSuggestionThreshold(), Double.valueOf("0.4"));

    ReplaceSalIntegrationEnrichmentProjectSettingsOptions replaceSalIntegrationEnrichmentProjectSettingsOptionsModel = new ReplaceSalIntegrationEnrichmentProjectSettingsOptions.Builder()
      .projectId("testString")
      .expansion(salEnrichmentSettingsExpansionModel)
      .termAssignment(salEnrichmentSettingsTermAssignmentModel)
      .authInstanceId("testString")
      .build();
    assertEquals(replaceSalIntegrationEnrichmentProjectSettingsOptionsModel.projectId(), "testString");
    assertEquals(replaceSalIntegrationEnrichmentProjectSettingsOptionsModel.expansion(), salEnrichmentSettingsExpansionModel);
    assertEquals(replaceSalIntegrationEnrichmentProjectSettingsOptionsModel.termAssignment(), salEnrichmentSettingsTermAssignmentModel);
    assertEquals(replaceSalIntegrationEnrichmentProjectSettingsOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSalIntegrationEnrichmentProjectSettingsOptionsError() throws Throwable {
    new ReplaceSalIntegrationEnrichmentProjectSettingsOptions.Builder().build();
  }

}