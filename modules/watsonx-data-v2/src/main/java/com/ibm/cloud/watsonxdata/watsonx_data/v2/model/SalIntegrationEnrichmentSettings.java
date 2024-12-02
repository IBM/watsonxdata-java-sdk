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
 * Sal Integration Enrichment Settings objects.
 */
public class SalIntegrationEnrichmentSettings extends GenericModel {

  @SerializedName("semantic_expansion")
  protected SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion;
  @SerializedName("term_assignment")
  protected SalIntegrationEnrichmentSettingsTermAssignment termAssignment;

  /**
   * Builder.
   */
  public static class Builder {
    private SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion;
    private SalIntegrationEnrichmentSettingsTermAssignment termAssignment;

    /**
     * Instantiates a new Builder from an existing SalIntegrationEnrichmentSettings instance.
     *
     * @param salIntegrationEnrichmentSettings the instance to initialize the Builder with
     */
    private Builder(SalIntegrationEnrichmentSettings salIntegrationEnrichmentSettings) {
      this.semanticExpansion = salIntegrationEnrichmentSettings.semanticExpansion;
      this.termAssignment = salIntegrationEnrichmentSettings.termAssignment;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalIntegrationEnrichmentSettings.
     *
     * @return the new SalIntegrationEnrichmentSettings instance
     */
    public SalIntegrationEnrichmentSettings build() {
      return new SalIntegrationEnrichmentSettings(this);
    }

    /**
     * Set the semanticExpansion.
     *
     * @param semanticExpansion the semanticExpansion
     * @return the SalIntegrationEnrichmentSettings builder
     */
    public Builder semanticExpansion(SalIntegrationEnrichmentSettingsSemanticExpansion semanticExpansion) {
      this.semanticExpansion = semanticExpansion;
      return this;
    }

    /**
     * Set the termAssignment.
     *
     * @param termAssignment the termAssignment
     * @return the SalIntegrationEnrichmentSettings builder
     */
    public Builder termAssignment(SalIntegrationEnrichmentSettingsTermAssignment termAssignment) {
      this.termAssignment = termAssignment;
      return this;
    }
  }

  protected SalIntegrationEnrichmentSettings() { }

  protected SalIntegrationEnrichmentSettings(Builder builder) {
    semanticExpansion = builder.semanticExpansion;
    termAssignment = builder.termAssignment;
  }

  /**
   * New builder.
   *
   * @return a SalIntegrationEnrichmentSettings builder
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
}

