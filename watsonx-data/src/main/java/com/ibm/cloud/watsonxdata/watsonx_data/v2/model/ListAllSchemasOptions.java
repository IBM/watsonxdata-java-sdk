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
 * The listAllSchemas options.
 */
public class ListAllSchemasOptions extends GenericModel {

  protected String catalogName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListAllSchemasOptions instance.
     *
     * @param listAllSchemasOptions the instance to initialize the Builder with
     */
    private Builder(ListAllSchemasOptions listAllSchemasOptions) {
      this.catalogName = listAllSchemasOptions.catalogName;
      this.authInstanceId = listAllSchemasOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListAllSchemasOptions.
     *
     * @return the new ListAllSchemasOptions instance
     */
    public ListAllSchemasOptions build() {
      return new ListAllSchemasOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListAllSchemasOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListAllSchemasOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListAllSchemasOptions() { }

  protected ListAllSchemasOptions(Builder builder) {
    catalogName = builder.catalogName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListAllSchemasOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
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

