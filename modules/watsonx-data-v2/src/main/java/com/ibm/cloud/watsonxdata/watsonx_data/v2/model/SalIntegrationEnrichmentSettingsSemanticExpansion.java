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
public class SalIntegrationEnrichmentSettingsSemanticExpansion extends GenericModel {

  @SerializedName("description_generation")
  protected Boolean descriptionGeneration;
  @SerializedName("description_generation_configuration")
  protected SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration descriptionGenerationConfiguration;
  @SerializedName("name_expansion")
  protected Boolean nameExpansion;
  @SerializedName("name_expansion_configuration")
  protected SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration nameExpansionConfiguration;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean descriptionGeneration;
    private SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration descriptionGenerationConfiguration;
    private Boolean nameExpansion;
    private SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration nameExpansionConfiguration;

    /**
     * Instantiates a new Builder from an existing SalIntegrationEnrichmentSettingsSemanticExpansion instance.
     *
     * @param salIntegrationEnrichmentSettingsSemanticExpansion the instance to initialize the Builder with
     */
    private Builder(SalIntegrationEnrichmentSettingsSemanticExpansion salIntegrationEnrichmentSettingsSemanticExpansion) {
      this.descriptionGeneration = salIntegrationEnrichmentSettingsSemanticExpansion.descriptionGeneration;
      this.descriptionGenerationConfiguration = salIntegrationEnrichmentSettingsSemanticExpansion.descriptionGenerationConfiguration;
      this.nameExpansion = salIntegrationEnrichmentSettingsSemanticExpansion.nameExpansion;
      this.nameExpansionConfiguration = salIntegrationEnrichmentSettingsSemanticExpansion.nameExpansionConfiguration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalIntegrationEnrichmentSettingsSemanticExpansion.
     *
     * @return the new SalIntegrationEnrichmentSettingsSemanticExpansion instance
     */
    public SalIntegrationEnrichmentSettingsSemanticExpansion build() {
      return new SalIntegrationEnrichmentSettingsSemanticExpansion(this);
    }

    /**
     * Set the descriptionGeneration.
     *
     * @param descriptionGeneration the descriptionGeneration
     * @return the SalIntegrationEnrichmentSettingsSemanticExpansion builder
     */
    public Builder descriptionGeneration(Boolean descriptionGeneration) {
      this.descriptionGeneration = descriptionGeneration;
      return this;
    }

    /**
     * Set the descriptionGenerationConfiguration.
     *
     * @param descriptionGenerationConfiguration the descriptionGenerationConfiguration
     * @return the SalIntegrationEnrichmentSettingsSemanticExpansion builder
     */
    public Builder descriptionGenerationConfiguration(SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration descriptionGenerationConfiguration) {
      this.descriptionGenerationConfiguration = descriptionGenerationConfiguration;
      return this;
    }

    /**
     * Set the nameExpansion.
     *
     * @param nameExpansion the nameExpansion
     * @return the SalIntegrationEnrichmentSettingsSemanticExpansion builder
     */
    public Builder nameExpansion(Boolean nameExpansion) {
      this.nameExpansion = nameExpansion;
      return this;
    }

    /**
     * Set the nameExpansionConfiguration.
     *
     * @param nameExpansionConfiguration the nameExpansionConfiguration
     * @return the SalIntegrationEnrichmentSettingsSemanticExpansion builder
     */
    public Builder nameExpansionConfiguration(SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration nameExpansionConfiguration) {
      this.nameExpansionConfiguration = nameExpansionConfiguration;
      return this;
    }
  }

  protected SalIntegrationEnrichmentSettingsSemanticExpansion() { }

  protected SalIntegrationEnrichmentSettingsSemanticExpansion(Builder builder) {
    descriptionGeneration = builder.descriptionGeneration;
    descriptionGenerationConfiguration = builder.descriptionGenerationConfiguration;
    nameExpansion = builder.nameExpansion;
    nameExpansionConfiguration = builder.nameExpansionConfiguration;
  }

  /**
   * New builder.
   *
   * @return a SalIntegrationEnrichmentSettingsSemanticExpansion builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the descriptionGeneration.
   *
   * description generation.
   *
   * @return the descriptionGeneration
   */
  public Boolean descriptionGeneration() {
    return descriptionGeneration;
  }

  /**
   * Gets the descriptionGenerationConfiguration.
   *
   * description generation configuration.
   *
   * @return the descriptionGenerationConfiguration
   */
  public SalIntegrationEnrichmentSettingsSemanticExpansionDescriptionGenerationConfiguration descriptionGenerationConfiguration() {
    return descriptionGenerationConfiguration;
  }

  /**
   * Gets the nameExpansion.
   *
   * name expansion.
   *
   * @return the nameExpansion
   */
  public Boolean nameExpansion() {
    return nameExpansion;
  }

  /**
   * Gets the nameExpansionConfiguration.
   *
   * name expansion configuration.
   *
   * @return the nameExpansionConfiguration
   */
  public SalIntegrationEnrichmentSettingsSemanticExpansionNameExpansionConfiguration nameExpansionConfiguration() {
    return nameExpansionConfiguration;
  }
}

