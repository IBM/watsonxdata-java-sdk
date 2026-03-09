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
 * The deleteCatalogEngineAssociation options.
 */
public class DeleteCatalogEngineAssociationOptions extends GenericModel {

  protected String secret;
  protected String engineId;

  /**
   * Builder.
   */
  public static class Builder {
    private String secret;
    private String engineId;

    /**
     * Instantiates a new Builder from an existing DeleteCatalogEngineAssociationOptions instance.
     *
     * @param deleteCatalogEngineAssociationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteCatalogEngineAssociationOptions deleteCatalogEngineAssociationOptions) {
      this.secret = deleteCatalogEngineAssociationOptions.secret;
      this.engineId = deleteCatalogEngineAssociationOptions.engineId;
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
     * @param engineId the engineId
     */
    public Builder(String secret, String engineId) {
      this.secret = secret;
      this.engineId = engineId;
    }

    /**
     * Builds a DeleteCatalogEngineAssociationOptions.
     *
     * @return the new DeleteCatalogEngineAssociationOptions instance
     */
    public DeleteCatalogEngineAssociationOptions build() {
      return new DeleteCatalogEngineAssociationOptions(this);
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the DeleteCatalogEngineAssociationOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the DeleteCatalogEngineAssociationOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }
  }

  protected DeleteCatalogEngineAssociationOptions() { }

  protected DeleteCatalogEngineAssociationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secret,
      "secret cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    secret = builder.secret;
    engineId = builder.engineId;
  }

  /**
   * New builder.
   *
   * @return a DeleteCatalogEngineAssociationOptions builder
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
   * engine id whose association need to be deleted.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }
}

