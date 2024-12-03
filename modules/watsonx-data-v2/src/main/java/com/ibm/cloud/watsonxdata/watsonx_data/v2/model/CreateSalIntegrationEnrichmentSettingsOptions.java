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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSalIntegrationEnrichmentSettings options.
 */
public class CreateSalIntegrationEnrichmentSettingsOptions extends GenericModel {

  protected SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion;
  protected SalIntegrationEnrichmentSettingsTermAssignment termAssignment;
  protected String projectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion;
    private SalIntegrationEnrichmentSettingsTermAssignment termAssignment;
    private String projectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationEnrichmentSettingsOptions instance.
     *
     * @param createSalIntegrationEnrichmentSettingsOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationEnrichmentSettingsOptions createSalIntegrationEnrichmentSettingsOptions) {
      this.semanticExpansion = createSalIntegrationEnrichmentSettingsOptions.semanticExpansion;
      this.termAssignment = createSalIntegrationEnrichmentSettingsOptions.termAssignment;
      this.projectId = createSalIntegrationEnrichmentSettingsOptions.projectId;
      this.authInstanceId = createSalIntegrationEnrichmentSettingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateSalIntegrationEnrichmentSettingsOptions.
     *
     * @return the new CreateSalIntegrationEnrichmentSettingsOptions instance
     */
    public CreateSalIntegrationEnrichmentSettingsOptions build() {
      return new CreateSalIntegrationEnrichmentSettingsOptions(this);
    }

    /**
     * Set the semanticExpansion.
     *
     * @param semanticExpansion the semanticExpansion
     * @return the CreateSalIntegrationEnrichmentSettingsOptions builder
     */
    public Builder semanticExpansion(SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion) {
      this.semanticExpansion = semanticExpansion;
      return this;
    }

    /**
     * Set the termAssignment.
     *
     * @param termAssignment the termAssignment
     * @return the CreateSalIntegrationEnrichmentSettingsOptions builder
     */
    public Builder termAssignment(SalIntegrationEnrichmentSettingsTermAssignment termAssignment) {
      this.termAssignment = termAssignment;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the CreateSalIntegrationEnrichmentSettingsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationEnrichmentSettingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the salIntegrationEnrichmentSettings.
     *
     * @param salIntegrationEnrichmentSettings the salIntegrationEnrichmentSettings
     * @return the CreateSalIntegrationEnrichmentSettingsOptions builder
     */
    public Builder salIntegrationEnrichmentSettings(SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettings) {
      this.semanticExpansion = salIntegrationEnrichmentSettings.semanticExpansion();
      this.termAssignment = salIntegrationEnrichmentSettings.termAssignment();
      return this;
    }
  }

  protected CreateSalIntegrationEnrichmentSettingsOptions() { }

  protected CreateSalIntegrationEnrichmentSettingsOptions(Builder builder) {
    semanticExpansion = builder.semanticExpansion;
    termAssignment = builder.termAssignment;
    projectId = builder.projectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationEnrichmentSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the semanticExpansion.
   *
   * semantic expansion.
   *
   * @return the semanticExpansion
   */
  public SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion() {
    return semanticExpansion;
  }

  /**
   * Gets the termAssignment.
   *
   * semantic expansion.
   *
   * @return the termAssignment
   */
  public SalIntegrationEnrichmentSettingsTermAssignment termAssignment() {
    return termAssignment;
  }

  /**
   * Gets the projectId.
   *
   * wkc project id.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
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

