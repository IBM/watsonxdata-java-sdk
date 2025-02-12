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
 * The loadTable options.
 */
public class LoadTableOptions extends GenericModel {

  protected String catalogId;
  protected String schemaId;
  protected String tableId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String schemaId;
    private String tableId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing LoadTableOptions instance.
     *
     * @param loadTableOptions the instance to initialize the Builder with
     */
    private Builder(LoadTableOptions loadTableOptions) {
      this.catalogId = loadTableOptions.catalogId;
      this.schemaId = loadTableOptions.schemaId;
      this.tableId = loadTableOptions.tableId;
      this.authInstanceId = loadTableOptions.authInstanceId;
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
     * @param tableId the tableId
     */
    public Builder(String catalogId, String schemaId, String tableId) {
      this.catalogId = catalogId;
      this.schemaId = schemaId;
      this.tableId = tableId;
    }

    /**
     * Builds a LoadTableOptions.
     *
     * @return the new LoadTableOptions instance
     */
    public LoadTableOptions build() {
      return new LoadTableOptions(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the LoadTableOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the schemaId.
     *
     * @param schemaId the schemaId
     * @return the LoadTableOptions builder
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }

    /**
     * Set the tableId.
     *
     * @param tableId the tableId
     * @return the LoadTableOptions builder
     */
    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the LoadTableOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected LoadTableOptions() { }

  protected LoadTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaId,
      "schemaId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableId,
      "tableId cannot be empty");
    catalogId = builder.catalogId;
    schemaId = builder.schemaId;
    tableId = builder.tableId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a LoadTableOptions builder
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
   * Gets the tableId.
   *
   * URL encoded table name.
   *
   * @return the tableId
   */
  public String tableId() {
    return tableId;
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

