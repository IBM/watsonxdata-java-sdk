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
public class SalEnrichmentSettingsExpansion extends GenericModel {

  protected Boolean description;
  @SerializedName("description_configuration")
  protected SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration;
  protected Boolean name;
  @SerializedName("name_configuration")
  protected SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean description;
    private SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration;
    private Boolean name;
    private SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration;

    /**
     * Instantiates a new Builder from an existing SalEnrichmentSettingsExpansion instance.
     *
     * @param salEnrichmentSettingsExpansion the instance to initialize the Builder with
     */
    private Builder(SalEnrichmentSettingsExpansion salEnrichmentSettingsExpansion) {
      this.description = salEnrichmentSettingsExpansion.description;
      this.descriptionConfiguration = salEnrichmentSettingsExpansion.descriptionConfiguration;
      this.name = salEnrichmentSettingsExpansion.name;
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
     * @param description the description
     * @param descriptionConfiguration the descriptionConfiguration
     * @param name the name
     * @param nameConfiguration the nameConfiguration
     */
    public Builder(Boolean description, SalEnrichmentSettingsExpansionDescriptionConfiguration descriptionConfiguration, Boolean name, SalEnrichmentSettingsExpansionNameConfiguration nameConfiguration) {
      this.description = description;
      this.descriptionConfiguration = descriptionConfiguration;
      this.name = name;
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
     * Set the description.
     *
     * @param description the description
     * @return the SalEnrichmentSettingsExpansion builder
     */
    public Builder description(Boolean description) {
      this.description = description;
      return this;
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
     * Set the name.
     *
     * @param name the name
     * @return the SalEnrichmentSettingsExpansion builder
     */
    public Builder name(Boolean name) {
      this.name = name;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.descriptionConfiguration,
      "descriptionConfiguration cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nameConfiguration,
      "nameConfiguration cannot be null");
    description = builder.description;
    descriptionConfiguration = builder.descriptionConfiguration;
    name = builder.name;
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
   * Gets the description.
   *
   * if enable description generation (generate semantic description).
   *
   * @return the description
   */
  public Boolean description() {
    return description;
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
   * Gets the name.
   *
   * if enable name expansion (generate semantic name).
   *
   * @return the name
   */
  public Boolean name() {
    return name;
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

