/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listTables options.
 */
public class ListTablesOptions extends GenericModel {

  protected String catalogId;
  protected String schemaId;
  protected String engineId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String schemaId;
    private String engineId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListTablesOptions instance.
     *
     * @param listTablesOptions the instance to initialize the Builder with
     */
    private Builder(ListTablesOptions listTablesOptions) {
      this.catalogId = listTablesOptions.catalogId;
      this.schemaId = listTablesOptions.schemaId;
      this.engineId = listTablesOptions.engineId;
      this.authInstanceId = listTablesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param schemaId the schemaId
     * @param engineId the engineId
     */
    public Builder(String catalogId, String schemaId, String engineId) {
      this.catalogId = catalogId;
      this.schemaId = schemaId;
      this.engineId = engineId;
    }

    /**
     * Builds a ListTablesOptions.
     *
     * @return the new ListTablesOptions instance
     */
    public ListTablesOptions build() {
      return new ListTablesOptions(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the ListTablesOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the schemaId.
     *
     * @param schemaId the schemaId
     * @return the ListTablesOptions builder
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ListTablesOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListTablesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListTablesOptions() { }

  protected ListTablesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaId,
      "schemaId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    catalogId = builder.catalogId;
    schemaId = builder.schemaId;
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListTablesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * catalog id.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the schemaId.
   *
   * URL encoded schema name.
   *
   * @return the schemaId
   */
  public String schemaId() {
    return schemaId;
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

