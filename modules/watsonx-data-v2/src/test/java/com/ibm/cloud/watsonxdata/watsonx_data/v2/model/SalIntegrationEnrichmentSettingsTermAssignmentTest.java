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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationEnrichmentSettingsTermAssignment;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalIntegrationEnrichmentSettingsTermAssignment model.
 */
public class SalIntegrationEnrichmentSettingsTermAssignmentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalIntegrationEnrichmentSettingsTermAssignment() throws Throwable {
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

    String json = TestUtilities.serialize(salIntegrationEnrichmentSettingsTermAssignmentModel);

    SalIntegrationEnrichmentSettingsTermAssignment salIntegrationEnrichmentSettingsTermAssignmentModelNew = TestUtilities.deserialize(json, SalIntegrationEnrichmentSettingsTermAssignment.class);
    assertTrue(salIntegrationEnrichmentSettingsTermAssignmentModelNew instanceof SalIntegrationEnrichmentSettingsTermAssignment);
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.classBasedAssignments(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.evaluateNegativeAssignments(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.llmBasedAssignments(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.mlBasedAssignmentsCustom(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.mlBasedAssignmentsDefault(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.nameMatching(), Boolean.valueOf(false));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.termAssignmentThreshold(), Double.valueOf("0.3"));
    assertEquals(salIntegrationEnrichmentSettingsTermAssignmentModelNew.termSuggestionThreshold(), Double.valueOf("0.4"));
  }
}