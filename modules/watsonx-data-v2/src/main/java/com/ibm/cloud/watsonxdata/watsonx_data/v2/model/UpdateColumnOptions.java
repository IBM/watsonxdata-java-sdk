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
 * The updateColumn options.
 */
public class UpdateColumnOptions extends GenericModel {

  protected String engineId;
  protected String catalogId;
  protected String schemaId;
  protected String tableId;
  protected String columnId;
  protected List<JsonPatchOperation> body;
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
    private List<JsonPatchOperation> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateColumnOptions instance.
     *
     * @param updateColumnOptions the instance to initialize the Builder with
     */
    private Builder(UpdateColumnOptions updateColumnOptions) {
      this.engineId = updateColumnOptions.engineId;
      this.catalogId = updateColumnOptions.catalogId;
      this.schemaId = updateColumnOptions.schemaId;
      this.tableId = updateColumnOptions.tableId;
      this.columnId = updateColumnOptions.columnId;
      this.body = updateColumnOptions.body;
      this.authInstanceId = updateColumnOptions.authInstanceId;
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
     * @param body the body
     */
    public Builder(String engineId, String catalogId, String schemaId, String tableId, String columnId, List<JsonPatchOperation> body) {
      this.engineId = engineId;
      this.catalogId = catalogId;
      this.schemaId = schemaId;
      this.tableId = tableId;
      this.columnId = columnId;
      this.body = body;
    }

    /**
     * Builds a UpdateColumnOptions.
     *
     * @return the new UpdateColumnOptions instance
     */
    public UpdateColumnOptions build() {
      return new UpdateColumnOptions(this);
    }

    /**
     * Adds a new element to body.
     *
     * @param body the new element to be added
     * @return the UpdateColumnOptions builder
     */
    public Builder addBody(JsonPatchOperation body) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(body,
        "body cannot be null");
      if (this.body == null) {
        this.body = new ArrayList<JsonPatchOperation>();
      }
      this.body.add(body);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdateColumnOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the UpdateColumnOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the schemaId.
     *
     * @param schemaId the schemaId
     * @return the UpdateColumnOptions builder
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }

    /**
     * Set the tableId.
     *
     * @param tableId the tableId
     * @return the UpdateColumnOptions builder
     */
    public Builder tableId(String tableId) {
      this.tableId = tableId;
      return this;
    }

    /**
     * Set the columnId.
     *
     * @param columnId the columnId
     * @return the UpdateColumnOptions builder
     */
    public Builder columnId(String columnId) {
      this.columnId = columnId;
      return this;
    }

    /**
     * Set the body.
     * Existing body will be replaced.
     *
     * @param body the body
     * @return the UpdateColumnOptions builder
     */
    public Builder body(List<JsonPatchOperation> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateColumnOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateColumnOptions() { }

  protected UpdateColumnOptions(Builder builder) {
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    engineId = builder.engineId;
    catalogId = builder.catalogId;
    schemaId = builder.schemaId;
    tableId = builder.tableId;
    columnId = builder.columnId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateColumnOptions builder
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
   * Gets the body.
   *
   * Request body.
   *
   * @return the body
   */
  public List<JsonPatchOperation> body() {
    return body;
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

