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
 * The deleteCatalog options.
 */
public class DeleteCatalogOptions extends GenericModel {

  protected String name;
  protected Boolean skipMdsCall;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private Boolean skipMdsCall;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteCatalogOptions instance.
     *
     * @param deleteCatalogOptions the instance to initialize the Builder with
     */
    private Builder(DeleteCatalogOptions deleteCatalogOptions) {
      this.name = deleteCatalogOptions.name;
      this.skipMdsCall = deleteCatalogOptions.skipMdsCall;
      this.authInstanceId = deleteCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a DeleteCatalogOptions.
     *
     * @return the new DeleteCatalogOptions instance
     */
    public DeleteCatalogOptions build() {
      return new DeleteCatalogOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DeleteCatalogOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the skipMdsCall.
     *
     * @param skipMdsCall the skipMdsCall
     * @return the DeleteCatalogOptions builder
     */
    public Builder skipMdsCall(Boolean skipMdsCall) {
      this.skipMdsCall = skipMdsCall;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteCatalogOptions() { }

  protected DeleteCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
    skipMdsCall = builder.skipMdsCall;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * catalog id.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the skipMdsCall.
   *
   * Skip MDS call when Unity catalog is added.
   *
   * @return the skipMdsCall
   */
  public Boolean skipMdsCall() {
    return skipMdsCall;
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

