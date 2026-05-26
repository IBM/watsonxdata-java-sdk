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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * description generation configuration.
 */
public class SalEnrichmentSettingsExpansionDescriptionConfiguration extends GenericModel {

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
     * Instantiates a new Builder from an existing SalEnrichmentSettingsExpansionDescriptionConfiguration instance.
     *
     * @param salEnrichmentSettingsExpansionDescriptionConfiguration the instance to initialize the Builder with
     */
    private Builder(SalEnrichmentSettingsExpansionDescriptionConfiguration salEnrichmentSettingsExpansionDescriptionConfiguration) {
      this.assignmentThreshold = salEnrichmentSettingsExpansionDescriptionConfiguration.assignmentThreshold;
      this.suggestionThreshold = salEnrichmentSettingsExpansionDescriptionConfiguration.suggestionThreshold;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalEnrichmentSettingsExpansionDescriptionConfiguration.
     *
     * @return the new SalEnrichmentSettingsExpansionDescriptionConfiguration instance
     */
    public SalEnrichmentSettingsExpansionDescriptionConfiguration build() {
      return new SalEnrichmentSettingsExpansionDescriptionConfiguration(this);
    }

    /**
     * Set the assignmentThreshold.
     *
     * @param assignmentThreshold the assignmentThreshold
     * @return the SalEnrichmentSettingsExpansionDescriptionConfiguration builder
     */
    public Builder assignmentThreshold(Double assignmentThreshold) {
      this.assignmentThreshold = assignmentThreshold;
      return this;
    }

    /**
     * Set the suggestionThreshold.
     *
     * @param suggestionThreshold the suggestionThreshold
     * @return the SalEnrichmentSettingsExpansionDescriptionConfiguration builder
     */
    public Builder suggestionThreshold(Double suggestionThreshold) {
      this.suggestionThreshold = suggestionThreshold;
      return this;
    }
  }

  protected SalEnrichmentSettingsExpansionDescriptionConfiguration() { }

  protected SalEnrichmentSettingsExpansionDescriptionConfiguration(Builder builder) {
    assignmentThreshold = builder.assignmentThreshold;
    suggestionThreshold = builder.suggestionThreshold;
  }

  /**
   * New builder.
   *
   * @return a SalEnrichmentSettingsExpansionDescriptionConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assignmentThreshold.
   *
   * assignment threshold (auto accept the semantic description).
   *
   * @return the assignmentThreshold
   */
  public Double assignmentThreshold() {
    return assignmentThreshold;
  }

  /**
   * Gets the suggestionThreshold.
   *
   * suggestion threshold (suggestion visible as semantic description).
   *
   * @return the suggestionThreshold
   */
  public Double suggestionThreshold() {
    return suggestionThreshold;
  }
}

