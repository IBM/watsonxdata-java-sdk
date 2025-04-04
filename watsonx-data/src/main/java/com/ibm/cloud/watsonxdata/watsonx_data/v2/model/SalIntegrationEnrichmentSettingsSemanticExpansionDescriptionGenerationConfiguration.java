/*
 * (C) Copyright IBM Corp. 2025.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * description generation configuration.
 */
public class SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration extends GenericModel {

  @SerializedName("assignment_threshold")
  protected Double assignmentThreshold;
  @SerializedName("suggestion_threshold")
  protected Double suggestionThreshold;

  /**
   * Builder.
   */
  public static class Builder {
    private Double assignmentThreshold;
    private Double suggestionThreshold;

    /**
     * Instantiates a new Builder from an existing SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration instance.
     *
     * @param salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration the instance to initialize the Builder with
     */
    private Builder(SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration) {
      this.assignmentThreshold = salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.assignmentThreshold;
      this.suggestionThreshold = salIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.suggestionThreshold;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration.
     *
     * @return the new SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration instance
     */
    public SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration build() {
      return new SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration(this);
    }

    /**
     * Set the assignmentThreshold.
     *
     * @param assignmentThreshold the assignmentThreshold
     * @return the SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration builder
     */
    public Builder assignmentThreshold(Double assignmentThreshold) {
      this.assignmentThreshold = assignmentThreshold;
      return this;
    }

    /**
     * Set the suggestionThreshold.
     *
     * @param suggestionThreshold the suggestionThreshold
     * @return the SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration builder
     */
    public Builder suggestionThreshold(Double suggestionThreshold) {
      this.suggestionThreshold = suggestionThreshold;
      return this;
    }
  }

  protected SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration() { }

  protected SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration(Builder builder) {
    assignmentThreshold = builder.assignmentThreshold;
    suggestionThreshold = builder.suggestionThreshold;
  }

  /**
   * New builder.
   *
   * @return a SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assignmentThreshold.
   *
   * assignment threshold.
   *
   * @return the assignmentThreshold
   */
  public Double assignmentThreshold() {
    return assignmentThreshold;
  }

  /**
   * Gets the suggestionThreshold.
   *
   * suggestion threshold.
   *
   * @return the suggestionThreshold
   */
  public Double suggestionThreshold() {
    return suggestionThreshold;
  }
}

