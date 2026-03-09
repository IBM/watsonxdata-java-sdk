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
 * The listCatalogEngineAssociation options.
 */
public class ListCatalogEngineAssociationOptions extends GenericModel {

  protected String secret;
  protected String engineId;

  /**
   * Builder.
   */
  public static class Builder {
    private String secret;
    private String engineId;

    /**
     * Instantiates a new Builder from an existing ListCatalogEngineAssociationOptions instance.
     *
     * @param listCatalogEngineAssociationOptions the instance to initialize the Builder with
     */
    private Builder(ListCatalogEngineAssociationOptions listCatalogEngineAssociationOptions) {
      this.secret = listCatalogEngineAssociationOptions.secret;
      this.engineId = listCatalogEngineAssociationOptions.engineId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secret the secret
     */
    public Builder(String secret) {
      this.secret = secret;
    }

    /**
     * Builds a ListCatalogEngineAssociationOptions.
     *
     * @return the new ListCatalogEngineAssociationOptions instance
     */
    public ListCatalogEngineAssociationOptions build() {
      return new ListCatalogEngineAssociationOptions(this);
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the ListCatalogEngineAssociationOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ListCatalogEngineAssociationOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }
  }

  protected ListCatalogEngineAssociationOptions() { }

  protected ListCatalogEngineAssociationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secret,
      "secret cannot be null");
    secret = builder.secret;
    engineId = builder.engineId;
  }

  /**
   * New builder.
   *
   * @return a ListCatalogEngineAssociationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secret.
   *
   * API Authentication service token.
   *
   * @return the secret
   */
  public String secret() {
    return secret;
  }

  /**
   * Gets the engineId.
   *
   * engine_id to filter out the engine details.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }
}

