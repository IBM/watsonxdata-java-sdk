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
 * The createSalIntegrationEnrichmentGlobalSettings options.
 */
public class CreateSalIntegrationEnrichmentGlobalSettingsOptions extends GenericModel {

  protected SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion;
  protected SalIntegrationEnrichmentSettingsTermAssignment termAssignment;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion;
    private SalIntegrationEnrichmentSettingsTermAssignment termAssignment;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationEnrichmentGlobalSettingsOptions instance.
     *
     * @param createSalIntegrationEnrichmentGlobalSettingsOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationEnrichmentGlobalSettingsOptions createSalIntegrationEnrichmentGlobalSettingsOptions) {
      this.semanticExpansion = createSalIntegrationEnrichmentGlobalSettingsOptions.semanticExpansion;
      this.termAssignment = createSalIntegrationEnrichmentGlobalSettingsOptions.termAssignment;
      this.authInstanceId = createSalIntegrationEnrichmentGlobalSettingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateSalIntegrationEnrichmentGlobalSettingsOptions.
     *
     * @return the new CreateSalIntegrationEnrichmentGlobalSettingsOptions instance
     */
    public CreateSalIntegrationEnrichmentGlobalSettingsOptions build() {
      return new CreateSalIntegrationEnrichmentGlobalSettingsOptions(this);
    }

    /**
     * Set the semanticExpansion.
     *
     * @param semanticExpansion the semanticExpansion
     * @return the CreateSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder semanticExpansion(SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion) {
      this.semanticExpansion = semanticExpansion;
      return this;
    }

    /**
     * Set the termAssignment.
     *
     * @param termAssignment the termAssignment
     * @return the CreateSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder termAssignment(SalIntegrationEnrichmentSettingsTermAssignment termAssignment) {
      this.termAssignment = termAssignment;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the salIntegrationEnrichmentSettings.
     *
     * @param salIntegrationEnrichmentSettings the salIntegrationEnrichmentSettings
     * @return the CreateSalIntegrationEnrichmentGlobalSettingsOptions builder
     */
    public Builder salIntegrationEnrichmentSettings(SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettings) {
      this.semanticExpansion = salIntegrationEnrichmentSettings.semanticExpansion();
      this.termAssignment = salIntegrationEnrichmentSettings.termAssignment();
      return this;
    }
  }

  protected CreateSalIntegrationEnrichmentGlobalSettingsOptions() { }

  protected CreateSalIntegrationEnrichmentGlobalSettingsOptions(Builder builder) {
    semanticExpansion = builder.semanticExpansion;
    termAssignment = builder.termAssignment;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationEnrichmentGlobalSettingsOptions builder
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

