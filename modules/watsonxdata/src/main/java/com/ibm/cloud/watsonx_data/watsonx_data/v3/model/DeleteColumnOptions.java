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
 * The deleteColumn options.
 */
public class DeleteColumnOptions extends GenericModel {

  protected String engineId;
  protected String catalogName;
  protected String schemaName;
  protected String tableName;
  protected String columnName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String columnName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteColumnOptions instance.
     *
     * @param deleteColumnOptions the instance to initialize the Builder with
     */
    private Builder(DeleteColumnOptions deleteColumnOptions) {
      this.engineId = deleteColumnOptions.engineId;
      this.catalogName = deleteColumnOptions.catalogName;
      this.schemaName = deleteColumnOptions.schemaName;
      this.tableName = deleteColumnOptions.tableName;
      this.columnName = deleteColumnOptions.columnName;
      this.authInstanceId = deleteColumnOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     * @param catalogName the catalogName
     * @param schemaName the schemaName
     * @param tableName the tableName
     * @param columnName the columnName
     */
    public Builder(String engineId, String catalogName, String schemaName, String tableName, String columnName) {
      this.engineId = engineId;
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.tableName = tableName;
      this.columnName = columnName;
    }

    /**
     * Builds a DeleteColumnOptions.
     *
     * @return the new DeleteColumnOptions instance
     */
    public DeleteColumnOptions build() {
      return new DeleteColumnOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the DeleteColumnOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the DeleteColumnOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the DeleteColumnOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the DeleteColumnOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the columnName.
     *
     * @param columnName the columnName
     * @return the DeleteColumnOptions builder
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteColumnOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteColumnOptions() { }

  protected DeleteColumnOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogName,
      "catalogName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaName,
      "schemaName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableName,
      "tableName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.columnName,
      "columnName cannot be empty");
    engineId = builder.engineId;
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    columnName = builder.columnName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteColumnOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the schemaName.
   *
   * URL encoded schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the tableName.
   *
   * URL encoded table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
  }

  /**
   * Gets the columnName.
   *
   * Url encoded column name.
   *
   * @return the columnName
   */
  public String columnName() {
    return columnName;
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

