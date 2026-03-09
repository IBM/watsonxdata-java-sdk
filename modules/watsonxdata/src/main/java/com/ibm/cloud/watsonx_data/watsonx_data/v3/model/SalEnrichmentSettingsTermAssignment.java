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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * semantic expansion.
 */
public class SalEnrichmentSettingsTermAssignment extends GenericModel {

  @SerializedName("term_assignment_threshold")
  protected Double termAssignmentThreshold;
  @SerializedName("term_suggestion_threshold")
  protected Double termSuggestionThreshold;

  /**
   * Builder.
   */
  public static class Builder {
    private Double termAssignmentThreshold;
    private Double termSuggestionThreshold;

    /**
     * Instantiates a new Builder from an existing SalEnrichmentSettingsTermAssignment instance.
     *
     * @param salEnrichmentSettingsTermAssignment the instance to initialize the Builder with
     */
    private Builder(SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignment) {
      this.termAssignmentThreshold = salEnrichmentSettingsTermAssignment.termAssignmentThreshold;
      this.termSuggestionThreshold = salEnrichmentSettingsTermAssignment.termSuggestionThreshold;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param termAssignmentThreshold the termAssignmentThreshold
     * @param termSuggestionThreshold the termSuggestionThreshold
     */
    public Builder(Double termAssignmentThreshold, Double termSuggestionThreshold) {
      this.termAssignmentThreshold = termAssignmentThreshold;
      this.termSuggestionThreshold = termSuggestionThreshold;
    }

    /**
     * Builds a SalEnrichmentSettingsTermAssignment.
     *
     * @return the new SalEnrichmentSettingsTermAssignment instance
     */
    public SalEnrichmentSettingsTermAssignment build() {
      return new SalEnrichmentSettingsTermAssignment(this);
    }

    /**
     * Set the termAssignmentThreshold.
     *
     * @param termAssignmentThreshold the termAssignmentThreshold
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder termAssignmentThreshold(Double termAssignmentThreshold) {
      this.termAssignmentThreshold = termAssignmentThreshold;
      return this;
    }

    /**
     * Set the termSuggestionThreshold.
     *
     * @param termSuggestionThreshold the termSuggestionThreshold
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder termSuggestionThreshold(Double termSuggestionThreshold) {
      this.termSuggestionThreshold = termSuggestionThreshold;
      return this;
    }
  }

  protected SalEnrichmentSettingsTermAssignment() { }

  protected SalEnrichmentSettingsTermAssignment(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termAssignmentThreshold,
      "termAssignmentThreshold cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termSuggestionThreshold,
      "termSuggestionThreshold cannot be null");
    termAssignmentThreshold = builder.termAssignmentThreshold;
    termSuggestionThreshold = builder.termSuggestionThreshold;
  }

  /**
   * New builder.
   *
   * @return a SalEnrichmentSettingsTermAssignment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the termAssignmentThreshold.
   *
   * term assignment threshold.
   *
   * @return the termAssignmentThreshold
   */
  public Double termAssignmentThreshold() {
    return termAssignmentThreshold;
  }

  /**
   * Gets the termSuggestionThreshold.
   *
   * term suggestion threshold.
   *
   * @return the termSuggestionThreshold
   */
  public Double termSuggestionThreshold() {
    return termSuggestionThreshold;
  }
}

