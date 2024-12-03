/*
 * (C) Copyright IBM Corp. 2024.
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
 * The deleteColumn options.
 */
public class DeleteColumnOptions extends GenericModel {

  protected String engineId;
  protected String catalogId;
  protected String schemaId;
  protected String tableId;
  protected String columnId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogId;
    private String schemaId;
    private String tableId;
    private String columnId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteColumnOptions instance.
     *
     * @param deleteColumnOptions the instance to initialize the Builder with
     */
    private Builder(DeleteColumnOptions deleteColumnOptions) {
      this.engineId = deleteColumnOptions.engineId;
      this.catalogId = deleteColumnOptions.catalogId;
      this.schemaId = deleteColumnOptions.schemaId;
      this.tableId = deleteColumnOptions.tableId;
      this.columnId = deleteColumnOptions.columnId;
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
     * @param catalogId the catalogId
     * @param schemaId the schemaId
     * @param tableId the tableId
     * @param columnId the columnId
     */
    public Builder(String engineId, String catalogId, String schemaId, String tableId, String columnId) {
      this.engineId = engineId;
      this.catalogId = catalogId;
      this.schemaId = schemaId;
      this.tableId = tableId;
      this.columnId = columnId;
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
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the DeleteColumnOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the schemaId.
     *
     * @param schemaId the schemaId
     * @return the DeleteColumnOptions builder
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }

    /**
     * Set the tableId.
     *
     * @param tableId the tableId
     * @return the DeleteColumnOptions builder
     */
    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    /**
     * Set the columnId.
     *
     * @param columnId the columnId
     * @return the DeleteColumnOptions builder
     */
    public Builder columnId(String columnId) {
      this.columnId = columnId;
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
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaId,
      "schemaId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableId,
      "tableId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.columnId,
      "columnId cannot be empty");
    engineId = builder.engineId;
    catalogId = builder.catalogId;
    schemaId = builder.schemaId;
    tableId = builder.tableId;
    columnId = builder.columnId;
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
   * URL encoded schema name.
   *
   * @return the tableId
   */
  public String tableId() {
    return tableId;
  }

  /**
   * Gets the columnId.
   *
   * URL encoded schema name.
   *
   * @return the columnId
   */
  public String columnId() {
    return columnId;
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

