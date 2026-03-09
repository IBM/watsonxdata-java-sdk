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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createCatalogEngineAssociation options.
 */
public class CreateCatalogEngineAssociationOptions extends GenericModel {

  protected String secret;
  protected List<CatalogEngineAssociationObjectPrototype> catalogEngineAssociation;

  /**
   * Builder.
   */
  public static class Builder {
    private String secret;
    private List<CatalogEngineAssociationObjectPrototype> catalogEngineAssociation;

    /**
     * Instantiates a new Builder from an existing CreateCatalogEngineAssociationOptions instance.
     *
     * @param createCatalogEngineAssociationOptions the instance to initialize the Builder with
     */
    private Builder(CreateCatalogEngineAssociationOptions createCatalogEngineAssociationOptions) {
      this.secret = createCatalogEngineAssociationOptions.secret;
      this.catalogEngineAssociation = createCatalogEngineAssociationOptions.catalogEngineAssociation;
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
     * Builds a CreateCatalogEngineAssociationOptions.
     *
     * @return the new CreateCatalogEngineAssociationOptions instance
     */
    public CreateCatalogEngineAssociationOptions build() {
      return new CreateCatalogEngineAssociationOptions(this);
    }

    /**
     * Adds a new element to catalogEngineAssociation.
     *
     * @param catalogEngineAssociation the new element to be added
     * @return the CreateCatalogEngineAssociationOptions builder
     */
    public Builder addCatalogEngineAssociation(CatalogEngineAssociationObjectPrototype catalogEngineAssociation) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogEngineAssociation,
        "catalogEngineAssociation cannot be null");
      if (this.catalogEngineAssociation == null) {
        this.catalogEngineAssociation = new ArrayList<CatalogEngineAssociationObjectPrototype>();
      }
      this.catalogEngineAssociation.add(catalogEngineAssociation);
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the CreateCatalogEngineAssociationOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the catalogEngineAssociation.
     * Existing catalogEngineAssociation will be replaced.
     *
     * @param catalogEngineAssociation the catalogEngineAssociation
     * @return the CreateCatalogEngineAssociationOptions builder
     */
    public Builder catalogEngineAssociation(List<CatalogEngineAssociationObjectPrototype> catalogEngineAssociation) {
      this.catalogEngineAssociation = catalogEngineAssociation;
      return this;
    }
  }

  protected CreateCatalogEngineAssociationOptions() { }

  protected CreateCatalogEngineAssociationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secret,
      "secret cannot be null");
    secret = builder.secret;
    catalogEngineAssociation = builder.catalogEngineAssociation;
  }

  /**
   * New builder.
   *
   * @return a CreateCatalogEngineAssociationOptions builder
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
   * Gets the catalogEngineAssociation.
   *
   * List of catalog engine association objects.
   *
   * @return the catalogEngineAssociation
   */
  public List<CatalogEngineAssociationObjectPrototype> catalogEngineAssociation() {
    return catalogEngineAssociation;
  }
}

