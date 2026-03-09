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
public class SalEnrichmentSettingsExpansion extends GenericModel {

  @SerializedName("description_configuration")
  protected SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration;
  @SerializedName("name_configuration")
  protected SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration;

  /**
   * Builder.
   */
  public static class Builder {
    private SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration;
    private SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration;

    /**
     * Instantiates a new Builder from an existing SalEnrichmentSettingsExpansion instance.
     *
     * @param salEnrichmentSettingsExpansion the instance to initialize the Builder with
     */
    private Builder(SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansion) {
      this.descriptionConfiguration = salEnrichmentSettingsExpansion.descriptionConfiguration;
      this.nameConfiguration = salEnrichmentSettingsExpansion.nameConfiguration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param descriptionConfiguration the descriptionConfiguration
     * @param nameConfiguration the nameConfiguration
     */
    public Builder(SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration, SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration) {
      this.descriptionConfiguration = descriptionConfiguration;
      this.nameConfiguration = nameConfiguration;
    }

    /**
     * Builds a SalEnrichmentSettingsExpansion.
     *
     * @return the new SalEnrichmentSettingsExpansion instance
     */
    public SalEnrichmentSettingsExpansion build() {
      return new SalEnrichmentSettingsExpansion(this);
    }

    /**
     * Set the descriptionConfiguration.
     *
     * @param descriptionConfiguration the descriptionConfiguration
     * @return the SalEnrichmentSettingsExpansion builder
     */
    public Builder descriptionConfiguration(SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration) {
      this.descriptionConfiguration = descriptionConfiguration;
      return this;
    }

    /**
     * Set the nameConfiguration.
     *
     * @param nameConfiguration the nameConfiguration
     * @return the SalEnrichmentSettingsExpansion builder
     */
    public Builder nameConfiguration(SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration) {
      this.nameConfiguration = nameConfiguration;
      return this;
    }
  }

  protected SalEnrichmentSettingsExpansion() { }

  protected SalEnrichmentSettingsExpansion(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.descriptionConfiguration,
      "descriptionConfiguration cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nameConfiguration,
      "nameConfiguration cannot be null");
    descriptionConfiguration = builder.descriptionConfiguration;
    nameConfiguration = builder.nameConfiguration;
  }

  /**
   * New builder.
   *
   * @return a SalEnrichmentSettingsExpansion builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the descriptionConfiguration.
   *
   * description generation configuration.
   *
   * @return the descriptionConfiguration
   */
  public SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration() {
    return descriptionConfiguration;
  }

  /**
   * Gets the nameConfiguration.
   *
   * if enable name expansion configuration.
   *
   * @return the nameConfiguration
   */
  public SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration() {
    return nameConfiguration;
  }
}

