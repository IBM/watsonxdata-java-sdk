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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SalEnrichmentSettingsExpansionNameConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalEnrichmentSettingsExpansionNameConfiguration model.
 */
public class SalEnrichmentSettingsExpansionNameConfigurationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalEnrichmentSettingsExpansionNameConfiguration() throws Throwable {
    SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModel = new SalEnrichmentSettingsExpansionNameConfiguration.Builder()
      .assignmentThreshold(Double.valueOf("0.1"))
      .suggestionThreshold(Double.valueOf("0.1"))
      .build();
    assertEquals(salEnrichmentSettingsExpansionNameConfigurationModel.assignmentThreshold(), Double.valueOf("0.1"));
    assertEquals(salEnrichmentSettingsExpansionNameConfigurationModel.suggestionThreshold(), Double.valueOf("0.1"));

    String json = TestUtilities.serialize(salEnrichmentSettingsExpansionNameConfigurationModel);

    SalEnrichmentSettingsExpansionNameConfiguration salEnrichmentSettingsExpansionNameConfigurationModelNew = TestUtilities.deserialize(json, SalEnrichmentSettingsExpansionNameConfiguration.class);
    assertTrue(salEnrichmentSettingsExpansionNameConfigurationModelNew instanceof SalEnrichmentSettingsExpansionNameConfiguration);
    assertEquals(salEnrichmentSettingsExpansionNameConfigurationModelNew.assignmentThreshold(), Double.valueOf("0.1"));
    assertEquals(salEnrichmentSettingsExpansionNameConfigurationModelNew.suggestionThreshold(), Double.valueOf("0.1"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSalEnrichmentSettingsExpansionNameConfigurationError() throws Throwable {
    new SalEnrichmentSettingsExpansionNameConfiguration.Builder().build();
  }

}