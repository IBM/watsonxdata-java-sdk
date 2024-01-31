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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createColumns options.
 */
public class CreateColumnsOptions extends GenericModel {

  protected String engineId;
  protected String catalogId;
  protected String schemaId;
  protected String tableId;
  protected List<Column> columns;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogId;
    private String schemaId;
    private String tableId;
    private List<Column> columns;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateColumnsOptions instance.
     *
     * @param createColumnsOptions the instance to initialize the Builder with
     */
    private Builder(CreateColumnsOptions createColumnsOptions) {
      this.engineId = createColumnsOptions.engineId;
      this.catalogId = createColumnsOptions.catalogId;
      this.schemaId = createColumnsOptions.schemaId;
      this.tableId = createColumnsOptions.tableId;
      this.columns = createColumnsOptions.columns;
      this.authInstanceId = createColumnsOptions.authInstanceId;
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
     */
    public Builder(String engineId, String catalogId, String schemaId, String tableId) {
      this.engineId = engineId;
      this.catalogId = catalogId;
      this.schemaId = schemaId;
      this.tableId = tableId;
    }

    /**
     * Builds a CreateColumnsOptions.
     *
     * @return the new CreateColumnsOptions instance
     */
    public CreateColumnsOptions build() {
      return new CreateColumnsOptions(this);
    }

    /**
     * Adds a new element to columns.
     *
     * @param columns the new element to be added
     * @return the CreateColumnsOptions builder
     */
    public Builder addColumns(Column columns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(columns,
        "columns cannot be null");
      if (this.columns == null) {
        this.columns = new ArrayList<Column>();
      }
      this.columns.add(columns);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateColumnsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the CreateColumnsOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the schemaId.
     *
     * @param schemaId the schemaId
     * @return the CreateColumnsOptions builder
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }

    /**
     * Set the tableId.
     *
     * @param tableId the tableId
     * @return the CreateColumnsOptions builder
     */
    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    /**
     * Set the columns.
     * Existing columns will be replaced.
     *
     * @param columns the columns
     * @return the CreateColumnsOptions builder
     */
    public Builder columns(List<Column> columns) {
      this.columns = columns;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateColumnsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateColumnsOptions() { }

  protected CreateColumnsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaId,
      "schemaId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableId,
      "tableId cannot be empty");
    engineId = builder.engineId;
    catalogId = builder.catalogId;
    schemaId = builder.schemaId;
    tableId = builder.tableId;
    columns = builder.columns;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateColumnsOptions builder
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
   * Gets the columns.
   *
   * List of the tables present in the schema.
   *
   * @return the columns
   */
  public List<Column> columns() {
    return columns;
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

