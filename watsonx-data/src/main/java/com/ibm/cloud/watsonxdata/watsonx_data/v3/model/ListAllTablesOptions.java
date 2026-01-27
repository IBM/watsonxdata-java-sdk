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
 * The listAllTables options.
 */
public class ListAllTablesOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListAllTablesOptions instance.
     *
     * @param listAllTablesOptions the instance to initialize the Builder with
     */
    private Builder(ListAllTablesOptions listAllTablesOptions) {
      this.catalogName = listAllTablesOptions.catalogName;
      this.schemaName = listAllTablesOptions.schemaName;
      this.authInstanceId = listAllTablesOptions.authInstanceId;
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
     * Builds a ListAllTablesOptions.
     *
     * @return the new ListAllTablesOptions instance
     */
    public ListAllTablesOptions build() {
      return new ListAllTablesOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListAllTablesOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ListAllTablesOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListAllTablesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListAllTablesOptions() { }

  protected ListAllTablesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListAllTablesOptions builder
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
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
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

