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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceSalIntegrationEnrichmentProjectSettings options.
 */
public class ReplaceSalIntegrationEnrichmentProjectSettingsOptions extends GenericModel {

  protected String projectId;
  protected SalEnrichmentSettingsExpansion expansion;
  protected SalEnrichmentSettingsTermAssignment termAssignment;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private SalEnrichmentSettingsExpansion expansion;
    private SalEnrichmentSettingsTermAssignment termAssignment;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ReplaceSalIntegrationEnrichmentProjectSettingsOptions instance.
     *
     * @param replaceSalIntegrationEnrichmentProjectSettingsOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceSalIntegrationEnrichmentProjectSettingsOptions replaceSalIntegrationEnrichmentProjectSettingsOptions) {
      this.projectId = replaceSalIntegrationEnrichmentProjectSettingsOptions.projectId;
      this.expansion = replaceSalIntegrationEnrichmentProjectSettingsOptions.expansion;
      this.termAssignment = replaceSalIntegrationEnrichmentProjectSettingsOptions.termAssignment;
      this.authInstanceId = replaceSalIntegrationEnrichmentProjectSettingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     * @param expansion the expansion
     * @param termAssignment the termAssignment
     */
    public Builder(String projectId, SalEnrichmentSettingsExpansion expansion, SalEnrichmentSettingsTermAssignment termAssignment) {
      this.projectId = projectId;
      this.expansion = expansion;
      this.termAssignment = termAssignment;
    }

    /**
     * Builds a ReplaceSalIntegrationEnrichmentProjectSettingsOptions.
     *
     * @return the new ReplaceSalIntegrationEnrichmentProjectSettingsOptions instance
     */
    public ReplaceSalIntegrationEnrichmentProjectSettingsOptions build() {
      return new ReplaceSalIntegrationEnrichmentProjectSettingsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ReplaceSalIntegrationEnrichmentProjectSettingsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the expansion.
     *
     * @param expansion the expansion
     * @return the ReplaceSalIntegrationEnrichmentProjectSettingsOptions builder
     */
    public Builder expansion(SalEnrichmentSettingsExpansion expansion) {
      this.expansion = expansion;
      return this;
    }

    /**
     * Set the termAssignment.
     *
     * @param termAssignment the termAssignment
     * @return the ReplaceSalIntegrationEnrichmentProjectSettingsOptions builder
     */
    public Builder termAssignment(SalEnrichmentSettingsTermAssignment termAssignment) {
      this.termAssignment = termAssignment;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ReplaceSalIntegrationEnrichmentProjectSettingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the salEnrichmentSettings.
     *
     * @param salEnrichmentSettings the salEnrichmentSettings
     * @return the ReplaceSalIntegrationEnrichmentProjectSettingsOptions builder
     */
    public Builder salEnrichmentSettings(SalEnrichmentSettings salEnrichmentSettings) {
      this.expansion = salEnrichmentSettings.expansion();
      this.termAssignment = salEnrichmentSettings.termAssignment();
      return this;
    }
  }

  protected ReplaceSalIntegrationEnrichmentProjectSettingsOptions() { }

  protected ReplaceSalIntegrationEnrichmentProjectSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expansion,
      "expansion cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termAssignment,
      "termAssignment cannot be null");
    projectId = builder.projectId;
    expansion = builder.expansion;
    termAssignment = builder.termAssignment;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ReplaceSalIntegrationEnrichmentProjectSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * Watsonx.data Intelligence project id.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
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
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

