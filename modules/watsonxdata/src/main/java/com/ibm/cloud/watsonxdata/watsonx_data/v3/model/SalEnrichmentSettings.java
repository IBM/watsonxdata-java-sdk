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
 * Request payload object of SAL Integration Enrichment Global Settings.
 */
public class SalEnrichmentSettings extends GenericModel {

  protected SalEnrichmentSettingsExpansion expansion;
  @SerializedName("term_assignment")
  protected SalEnrichmentSettingsTermAssignment termAssignment;

  /**
   * Builder.
   */
  public static class Builder {
    private SalEnrichmentSettingsExpansion expansion;
    private SalEnrichmentSettingsTermAssignment termAssignment;

    /**
     * Instantiates a new Builder from an existing SalEnrichmentSettings instance.
     *
     * @param salEnrichmentSettings the instance to initialize the Builder with
     */
    private Builder(SalEnrichmentSettings salEnrichmentSettings) {
      this.expansion = salEnrichmentSettings.expansion;
      this.termAssignment = salEnrichmentSettings.termAssignment;
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
     * Builds a SalEnrichmentSettings.
     *
     * @return the new SalEnrichmentSettings instance
     */
    public SalEnrichmentSettings build() {
      return new SalEnrichmentSettings(this);
    }

    /**
     * Set the expansion.
     *
     * @param expansion the expansion
     * @return the SalEnrichmentSettings builder
     */
    public Builder expansion(SalEnrichmentSettingsExpansion expansion) {
      this.expansion = expansion;
      return this;
    }

    /**
     * Set the termAssignment.
     *
     * @param termAssignment the termAssignment
     * @return the SalEnrichmentSettings builder
     */
    public Builder termAssignment(SalEnrichmentSettingsTermAssignment termAssignment) {
      this.termAssignment = termAssignment;
      return this;
    }
  }

  protected SalEnrichmentSettings() { }

  protected SalEnrichmentSettings(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expansion,
      "expansion cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.termAssignment,
      "termAssignment cannot be null");
    expansion = builder.expansion;
    termAssignment = builder.termAssignment;
  }

  /**
   * New builder.
   *
   * @return a SalEnrichmentSettings builder
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
}

