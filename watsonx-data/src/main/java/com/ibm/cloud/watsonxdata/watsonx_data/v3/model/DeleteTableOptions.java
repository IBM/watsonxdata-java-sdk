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
 * The deleteTable options.
 */
public class DeleteTableOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String tableName;
  protected String engineId;
  protected String type;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String engineId;
    private String type;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteTableOptions instance.
     *
     * @param deleteTableOptions the instance to initialize the Builder with
     */
    private Builder(DeleteTableOptions deleteTableOptions) {
      this.catalogName = deleteTableOptions.catalogName;
      this.schemaName = deleteTableOptions.schemaName;
      this.tableName = deleteTableOptions.tableName;
      this.engineId = deleteTableOptions.engineId;
      this.type = deleteTableOptions.type;
      this.authInstanceId = deleteTableOptions.authInstanceId;
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
     * @param schemaName the schemaName
     * @param tableName the tableName
     * @param engineId the engineId
     */
    public Builder(String catalogName, String schemaName, String tableName, String engineId) {
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.tableName = tableName;
      this.engineId = engineId;
    }

    /**
     * Builds a DeleteTableOptions.
     *
     * @return the new DeleteTableOptions instance
     */
    public DeleteTableOptions build() {
      return new DeleteTableOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the DeleteTableOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the DeleteTableOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the DeleteTableOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the DeleteTableOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DeleteTableOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteTableOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteTableOptions() { }

  protected DeleteTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogName,
      "catalogName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaName,
      "schemaName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableName,
      "tableName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    engineId = builder.engineId;
    type = builder.type;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteTableOptions builder
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
   * Gets the engineId.
   *
   * Engine id of presto/prestissimo/spark/db2/netezza other engine.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the type.
   *
   * URL encoded table type (view,base table).
   *
   * @return the type
   */
  public String type() {
    return type;
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

