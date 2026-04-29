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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceSalIntegrationEnrichmentGlobalSettings options.
 */
public class ReplaceSalIntegrationEnrichmentGlobalSettingsOptions extends GenericModel {

  protected SalEnrichmentSettingsExpansion expansion;
  protected SalEnrichmentSettingsTermAssignment termAssignment;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private SalEnrichmentSettingsExpansion expansion;
    private SalEnrichmentSettingsTermAssignment termAssignment;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ReplaceSalIntegrationEnrichmentGlobalSettingsOptions instance.
     *
     * @param replaceSalIntegrationEnrichmentGlobalSettingsOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceSalIntegrationEnrichmentGlobalSettingsOptions replaceSalIntegrationEnrichmentGlobalSettingsOptions) {
      this.expansion = replaceSalIntegrationEnrichmentGlobalSettingsOptions.expansion;
      this.termAssignment = replaceSalIntegrationEnrichmentGlobalSettingsOptions.termAssignment;
      this.authInstanceId = replaceSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param expansion the expansion
     * @param termAssignment the termAssignment
     */
    public Builder(SalEnrichmentSettingsExpansion expansion, SalEnrichmentSettingsTermAssignment termAssignment) {
      this.expansion = expansion;
      this.termAssignment = termAssignment;
    }

    /**
     * Builds a ReplaceSalIntegrationEnrichmentGlobalSettingsOptions.
     *
     * @return the new ReplaceSalIntegrationEnrichmentGlobalSettingsOptions instance
     */
    public ReplaceSalIntegrationEnrichmentGlobalSettingsOptions build() {
      return new ReplaceSalIntegrationEnrichmentGlobalSettingsOptions(this);
    }

    /**
     * Set the expansion.
     *
     * @param expansion the expansion
     * @return the ReplaceSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder expansion(SalEnrichmentSettingsExpansion expansion) {
      this.expansion = expansion;
      return this;
    }

    /**
     * Set the termAssignment.
     *
     * @param termAssignment the termAssignment
     * @return the ReplaceSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder termAssignment(SalEnrichmentSettingsTermAssignment termAssignment) {
      this.termAssignment = termAssignment;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ReplaceSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the salEnrichmentSettings.
     *
     * @param salEnrichmentSettings the salEnrichmentSettings
     * @return the ReplaceSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder salEnrichmentSettings(SalEnrichmentSettings salEnrichmentSettings) {
      this.expansion = salEnrichmentSettings.expansion();
      this.termAssignment = salEnrichmentSettings.termAssignment();
      return this;
    }
  }

  protected ReplaceSalIntegrationEnrichmentGlobalSettingsOptions() { }

  protected ReplaceSalIntegrationEnrichmentGlobalSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expansion,
      "expansion cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termAssignment,
      "termAssignment cannot be null");
    expansion = builder.expansion;
    termAssignment = builder.termAssignment;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSalIntegrationEnrichmentGlobalSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the expansion.
   *
   * semantic expansion.
   *
   * @return the expansion
   */
  public SalEnrichmentSettingsExpansion expansion() {
    return expansion;
  }

  /**
   * Gets the termAssignment.
   *
   * semantic expansion.
   *
   * @return the termAssignment
   */
  public SalEnrichmentSettingsTermAssignment termAssignment() {
    return termAssignment;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

