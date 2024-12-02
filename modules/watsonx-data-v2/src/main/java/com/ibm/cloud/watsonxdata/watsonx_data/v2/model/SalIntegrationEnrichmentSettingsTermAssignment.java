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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * semantic expansion.
 */
public class SalIntegrationEnrichmentSettingsTermAssignment extends GenericModel {

  @SerializedName("class_based_assignments")
  protected Boolean classBasedAssignments;
  @SerializedName("evaluate_negative_assignments")
  protected Boolean evaluateNegativeAssignments;
  @SerializedName("llm_based_assignments")
  protected Boolean llmBasedAssignments;
  @SerializedName("ml_based_assignments_custom")
  protected Boolean mlBasedAssignmentsCustom;
  @SerializedName("ml_based_assignments_default")
  protected Boolean mlBasedAssignmentsDefault;
  @SerializedName("name_matching")
  protected Boolean nameMatching;
  @SerializedName("term_assignment_threshold")
  protected Double termAssignmentThreshold;
  @SerializedName("term_suggestion_threshold")
  protected Double termSuggestionThreshold;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean classBasedAssignments;
    private Boolean evaluateNegativeAssignments;
    private Boolean llmBasedAssignments;
    private Boolean mlBasedAssignmentsCustom;
    private Boolean mlBasedAssignmentsDefault;
    private Boolean nameMatching;
    private Double termAssignmentThreshold;
    private Double termSuggestionThreshold;

    /**
     * Instantiates a new Builder from an existing SalIntegrationEnrichmentSettingsTermAssignment instance.
     *
     * @param salIntegrationEnrichmentSettingsTermAssignment the instance to initialize the Builder with
     */
    private Builder(SalIntegrationEnrichmentSettingsTermAssignment salIntegrationEnrichmentSettingsTermAssignment) {
      this.classBasedAssignments = salIntegrationEnrichmentSettingsTermAssignment.classBasedAssignments;
      this.evaluateNegativeAssignments = salIntegrationEnrichmentSettingsTermAssignment.evaluateNegativeAssignments;
      this.llmBasedAssignments = salIntegrationEnrichmentSettingsTermAssignment.llmBasedAssignments;
      this.mlBasedAssignmentsCustom = salIntegrationEnrichmentSettingsTermAssignment.mlBasedAssignmentsCustom;
      this.mlBasedAssignmentsDefault = salIntegrationEnrichmentSettingsTermAssignment.mlBasedAssignmentsDefault;
      this.nameMatching = salIntegrationEnrichmentSettingsTermAssignment.nameMatching;
      this.termAssignmentThreshold = salIntegrationEnrichmentSettingsTermAssignment.termAssignmentThreshold;
      this.termSuggestionThreshold = salIntegrationEnrichmentSettingsTermAssignment.termSuggestionThreshold;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalIntegrationEnrichmentSettingsTermAssignment.
     *
     * @return the new SalIntegrationEnrichmentSettingsTermAssignment instance
     */
    public SalIntegrationEnrichmentSettingsTermAssignment build() {
      return new SalIntegrationEnrichmentSettingsTermAssignment(this);
    }

    /**
     * Set the classBasedAssignments.
     *
     * @param classBasedAssignments the classBasedAssignments
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder classBasedAssignments(Boolean classBasedAssignments) {
      this.classBasedAssignments = classBasedAssignments;
      return this;
    }

    /**
     * Set the evaluateNegativeAssignments.
     *
     * @param evaluateNegativeAssignments the evaluateNegativeAssignments
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder evaluateNegativeAssignments(Boolean evaluateNegativeAssignments) {
      this.evaluateNegativeAssignments = evaluateNegativeAssignments;
      return this;
    }

    /**
     * Set the llmBasedAssignments.
     *
     * @param llmBasedAssignments the llmBasedAssignments
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder llmBasedAssignments(Boolean llmBasedAssignments) {
      this.llmBasedAssignments = llmBasedAssignments;
      return this;
    }

    /**
     * Set the mlBasedAssignmentsCustom.
     *
     * @param mlBasedAssignmentsCustom the mlBasedAssignmentsCustom
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder mlBasedAssignmentsCustom(Boolean mlBasedAssignmentsCustom) {
      this.mlBasedAssignmentsCustom = mlBasedAssignmentsCustom;
      return this;
    }

    /**
     * Set the mlBasedAssignmentsDefault.
     *
     * @param mlBasedAssignmentsDefault the mlBasedAssignmentsDefault
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder mlBasedAssignmentsDefault(Boolean mlBasedAssignmentsDefault) {
      this.mlBasedAssignmentsDefault = mlBasedAssignmentsDefault;
      return this;
    }

    /**
     * Set the nameMatching.
     *
     * @param nameMatching the nameMatching
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder nameMatching(Boolean nameMatching) {
      this.nameMatching = nameMatching;
      return this;
    }

    /**
     * Set the termAssignmentThreshold.
     *
     * @param termAssignmentThreshold the termAssignmentThreshold
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder termAssignmentThreshold(Double termAssignmentThreshold) {
      this.termAssignmentThreshold = termAssignmentThreshold;
      return this;
    }

    /**
     * Set the termSuggestionThreshold.
     *
     * @param termSuggestionThreshold the termSuggestionThreshold
     * @return the SalIntegrationEnrichmentSettingsTermAssignment builder
     */
    public Builder termSuggestionThreshold(Double termSuggestionThreshold) {
      this.termSuggestionThreshold = termSuggestionThreshold;
      return this;
    }
  }

  protected SalIntegrationEnrichmentSettingsTermAssignment() { }

  protected SalIntegrationEnrichmentSettingsTermAssignment(Builder builder) {
    classBasedAssignments = builder.classBasedAssignments;
    evaluateNegativeAssignments = builder.evaluateNegativeAssignments;
    llmBasedAssignments = builder.llmBasedAssignments;
    mlBasedAssignmentsCustom = builder.mlBasedAssignmentsCustom;
    mlBasedAssignmentsDefault = builder.mlBasedAssignmentsDefault;
    nameMatching = builder.nameMatching;
    termAssignmentThreshold = builder.termAssignmentThreshold;
    termSuggestionThreshold = builder.termSuggestionThreshold;
  }

  /**
   * New builder.
   *
   * @return a SalIntegrationEnrichmentSettingsTermAssignment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the classBasedAssignments.
   *
   * class based assignments.
   *
   * @return the classBasedAssignments
   */
  public Boolean classBasedAssignments() {
    return classBasedAssignments;
  }

  /**
   * Gets the evaluateNegativeAssignments.
   *
   * evaluate negative assignments.
   *
   * @return the evaluateNegativeAssignments
   */
  public Boolean evaluateNegativeAssignments() {
    return evaluateNegativeAssignments;
  }

  /**
   * Gets the llmBasedAssignments.
   *
   * llm based assignments.
   *
   * @return the llmBasedAssignments
   */
  public Boolean llmBasedAssignments() {
    return llmBasedAssignments;
  }

  /**
   * Gets the mlBasedAssignmentsCustom.
   *
   * ml based assignments custom.
   *
   * @return the mlBasedAssignmentsCustom
   */
  public Boolean mlBasedAssignmentsCustom() {
    return mlBasedAssignmentsCustom;
  }

  /**
   * Gets the mlBasedAssignmentsDefault.
   *
   * ml based assignments default.
   *
   * @return the mlBasedAssignmentsDefault
   */
  public Boolean mlBasedAssignmentsDefault() {
    return mlBasedAssignmentsDefault;
  }

  /**
   * Gets the nameMatching.
   *
   * name matching.
   *
   * @return the nameMatching
   */
  public Boolean nameMatching() {
    return nameMatching;
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

