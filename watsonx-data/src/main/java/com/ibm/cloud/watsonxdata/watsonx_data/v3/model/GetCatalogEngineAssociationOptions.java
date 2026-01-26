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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getCatalogEngineAssociation options.
 */
public class GetCatalogEngineAssociationOptions extends GenericModel {

  protected String catalogName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetCatalogEngineAssociationOptions instance.
     *
     * @param getCatalogEngineAssociationOptions the instance to initialize the Builder with
     */
    private Builder(GetCatalogEngineAssociationOptions getCatalogEngineAssociationOptions) {
      this.catalogName = getCatalogEngineAssociationOptions.catalogName;
      this.authInstanceId = getCatalogEngineAssociationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogName the catalogName
     */
    public Builder(String catalogName) {
      this.catalogName = catalogName;
    }

    /**
     * Builds a GetCatalogEngineAssociationOptions.
     *
     * @return the new GetCatalogEngineAssociationOptions instance
     */
    public GetCatalogEngineAssociationOptions build() {
      return new GetCatalogEngineAssociationOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the GetCatalogEngineAssociationOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetCatalogEngineAssociationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetCatalogEngineAssociationOptions() { }

  protected GetCatalogEngineAssociationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogName,
      "catalogName cannot be empty");
    catalogName = builder.catalogName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetCatalogEngineAssociationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
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

