/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createSalIntegrationEnrichment options.
 */
public class CreateSalIntegrationEnrichmentOptions extends GenericModel {

  protected EnrichmentObj enrichmentPrototype;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private EnrichmentObj enrichmentPrototype;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationEnrichmentOptions instance.
     *
     * @param createSalIntegrationEnrichmentOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptions) {
      this.enrichmentPrototype = createSalIntegrationEnrichmentOptions.enrichmentPrototype;
      this.authInstanceId = createSalIntegrationEnrichmentOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateSalIntegrationEnrichmentOptions.
     *
     * @return the new CreateSalIntegrationEnrichmentOptions instance
     */
    public CreateSalIntegrationEnrichmentOptions build() {
      return new CreateSalIntegrationEnrichmentOptions(this);
    }

    /**
     * Set the enrichmentPrototype.
     *
     * @param enrichmentPrototype the enrichmentPrototype
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder enrichmentPrototype(EnrichmentObj enrichmentPrototype) {
      this.enrichmentPrototype = enrichmentPrototype;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationEnrichmentOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSalIntegrationEnrichmentOptions() { }

  protected CreateSalIntegrationEnrichmentOptions(Builder builder) {
    enrichmentPrototype = builder.enrichmentPrototype;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationEnrichmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enrichmentPrototype.
   *
   * Encrichment api object.
   *
   * @return the enrichmentPrototype
   */
  public EnrichmentObj enrichmentPrototype() {
    return enrichmentPrototype;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

