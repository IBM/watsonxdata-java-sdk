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
 * semantic expansion.
 */
public class SalEnrichmentSettingsTermAssignment extends GenericModel {

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
     * Instantiates a new Builder from an existing SalEnrichmentSettingsTermAssignment instance.
     *
     * @param salEnrichmentSettingsTermAssignment the instance to initialize the Builder with
     */
    private Builder(SalEnrichmentSettingsTermAssignment salEnrichmentSettingsTermAssignment) {
      this.classBasedAssignments = salEnrichmentSettingsTermAssignment.classBasedAssignments;
      this.evaluateNegativeAssignments = salEnrichmentSettingsTermAssignment.evaluateNegativeAssignments;
      this.llmBasedAssignments = salEnrichmentSettingsTermAssignment.llmBasedAssignments;
      this.mlBasedAssignmentsCustom = salEnrichmentSettingsTermAssignment.mlBasedAssignmentsCustom;
      this.mlBasedAssignmentsDefault = salEnrichmentSettingsTermAssignment.mlBasedAssignmentsDefault;
      this.nameMatching = salEnrichmentSettingsTermAssignment.nameMatching;
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
     * @param classBasedAssignments the classBasedAssignments
     * @param evaluateNegativeAssignments the evaluateNegativeAssignments
     * @param llmBasedAssignments the llmBasedAssignments
     * @param mlBasedAssignmentsCustom the mlBasedAssignmentsCustom
     * @param mlBasedAssignmentsDefault the mlBasedAssignmentsDefault
     * @param nameMatching the nameMatching
     * @param termAssignmentThreshold the termAssignmentThreshold
     * @param termSuggestionThreshold the termSuggestionThreshold
     */
    public Builder(Boolean classBasedAssignments, Boolean evaluateNegativeAssignments, Boolean llmBasedAssignments, Boolean mlBasedAssignmentsCustom, Boolean mlBasedAssignmentsDefault, Boolean nameMatching, Double termAssignmentThreshold, Double termSuggestionThreshold) {
      this.classBasedAssignments = classBasedAssignments;
      this.evaluateNegativeAssignments = evaluateNegativeAssignments;
      this.llmBasedAssignments = llmBasedAssignments;
      this.mlBasedAssignmentsCustom = mlBasedAssignmentsCustom;
      this.mlBasedAssignmentsDefault = mlBasedAssignmentsDefault;
      this.nameMatching = nameMatching;
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
     * Set the classBasedAssignments.
     *
     * @param classBasedAssignments the classBasedAssignments
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder classBasedAssignments(Boolean classBasedAssignments) {
      this.classBasedAssignments = classBasedAssignments;
      return this;
    }

    /**
     * Set the evaluateNegativeAssignments.
     *
     * @param evaluateNegativeAssignments the evaluateNegativeAssignments
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder evaluateNegativeAssignments(Boolean evaluateNegativeAssignments) {
      this.evaluateNegativeAssignments = evaluateNegativeAssignments;
      return this;
    }

    /**
     * Set the llmBasedAssignments.
     *
     * @param llmBasedAssignments the llmBasedAssignments
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder llmBasedAssignments(Boolean llmBasedAssignments) {
      this.llmBasedAssignments = llmBasedAssignments;
      return this;
    }

    /**
     * Set the mlBasedAssignmentsCustom.
     *
     * @param mlBasedAssignmentsCustom the mlBasedAssignmentsCustom
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder mlBasedAssignmentsCustom(Boolean mlBasedAssignmentsCustom) {
      this.mlBasedAssignmentsCustom = mlBasedAssignmentsCustom;
      return this;
    }

    /**
     * Set the mlBasedAssignmentsDefault.
     *
     * @param mlBasedAssignmentsDefault the mlBasedAssignmentsDefault
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder mlBasedAssignmentsDefault(Boolean mlBasedAssignmentsDefault) {
      this.mlBasedAssignmentsDefault = mlBasedAssignmentsDefault;
      return this;
    }

    /**
     * Set the nameMatching.
     *
     * @param nameMatching the nameMatching
     * @return the SalEnrichmentSettingsTermAssignment builder
     */
    public Builder nameMatching(Boolean nameMatching) {
      this.nameMatching = nameMatching;
      return this;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.classBasedAssignments,
      "classBasedAssignments cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.evaluateNegativeAssignments,
      "evaluateNegativeAssignments cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.llmBasedAssignments,
      "llmBasedAssignments cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mlBasedAssignmentsCustom,
      "mlBasedAssignmentsCustom cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mlBasedAssignmentsDefault,
      "mlBasedAssignmentsDefault cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nameMatching,
      "nameMatching cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termAssignmentThreshold,
      "termAssignmentThreshold cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termSuggestionThreshold,
      "termSuggestionThreshold cannot be null");
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
   * @return a SalEnrichmentSettingsTermAssignment builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the classBasedAssignments.
   *
   * if use class based assignments.
   *
   * @return the classBasedAssignments
   */
  public Boolean classBasedAssignments() {
    return classBasedAssignments;
  }

  /**
   * Gets the evaluateNegativeAssignments.
   *
   * if enable evaluate negative assignments.
   *
   * @return the evaluateNegativeAssignments
   */
  public Boolean evaluateNegativeAssignments() {
    return evaluateNegativeAssignments;
  }

  /**
   * Gets the llmBasedAssignments.
   *
   * if enable llm based assignments.
   *
   * @return the llmBasedAssignments
   */
  public Boolean llmBasedAssignments() {
    return llmBasedAssignments;
  }

  /**
   * Gets the mlBasedAssignmentsCustom.
   *
   * if enable machinelearning based assignments custom.
   *
   * @return the mlBasedAssignmentsCustom
   */
  public Boolean mlBasedAssignmentsCustom() {
    return mlBasedAssignmentsCustom;
  }

  /**
   * Gets the mlBasedAssignmentsDefault.
   *
   * if enable machinelearning based assignments default.
   *
   * @return the mlBasedAssignmentsDefault
   */
  public Boolean mlBasedAssignmentsDefault() {
    return mlBasedAssignmentsDefault;
  }

  /**
   * Gets the nameMatching.
   *
   * if assign by name matching.
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

