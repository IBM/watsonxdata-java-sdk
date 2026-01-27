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
 * The getCatalog options.
 */
public class GetCatalogOptions extends GenericModel {

  protected String name;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetCatalogOptions instance.
     *
     * @param getCatalogOptions the instance to initialize the Builder with
     */
    private Builder(GetCatalogOptions getCatalogOptions) {
      this.name = getCatalogOptions.name;
      this.authInstanceId = getCatalogOptions.authInstanceId;
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
     * Builds a GetCatalogOptions.
     *
     * @return the new GetCatalogOptions instance
     */
    public GetCatalogOptions build() {
      return new GetCatalogOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the GetCatalogOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetCatalogOptions() { }

  protected GetCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * catalog name.
   *
   * @return the name
   */
  public String name() {
    return name;
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

