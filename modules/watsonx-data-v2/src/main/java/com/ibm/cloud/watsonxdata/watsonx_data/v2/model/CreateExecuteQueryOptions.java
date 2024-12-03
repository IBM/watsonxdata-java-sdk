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
 * The createExecuteQuery options.
 */
public class CreateExecuteQueryOptions extends GenericModel {

  protected String engineId;
  protected String sqlString;
  protected String catalogName;
  protected String schemaName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String sqlString;
    private String catalogName;
    private String schemaName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateExecuteQueryOptions instance.
     *
     * @param createExecuteQueryOptions the instance to initialize the Builder with
     */
    private Builder(CreateExecuteQueryOptions createExecuteQueryOptions) {
      this.engineId = createExecuteQueryOptions.engineId;
      this.sqlString = createExecuteQueryOptions.sqlString;
      this.catalogName = createExecuteQueryOptions.catalogName;
      this.schemaName = createExecuteQueryOptions.schemaName;
      this.authInstanceId = createExecuteQueryOptions.authInstanceId;
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
     * @param sqlString the sqlString
     */
    public Builder(String engineId, String sqlString) {
      this.engineId = engineId;
      this.sqlString = sqlString;
    }

    /**
     * Builds a CreateExecuteQueryOptions.
     *
     * @return the new CreateExecuteQueryOptions instance
     */
    public CreateExecuteQueryOptions build() {
      return new CreateExecuteQueryOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateExecuteQueryOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the sqlString.
     *
     * @param sqlString the sqlString
     * @return the CreateExecuteQueryOptions builder
     */
    public Builder sqlString(String sqlString) {
      this.sqlString = sqlString;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreateExecuteQueryOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the CreateExecuteQueryOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateExecuteQueryOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateExecuteQueryOptions() { }

  protected CreateExecuteQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sqlString,
      "sqlString cannot be null");
    engineId = builder.engineId;
    sqlString = builder.sqlString;
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateExecuteQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the sqlString.
   *
   * query to be executed.
   *
   * @return the sqlString
   */
  public String sqlString() {
    return sqlString;
  }

  /**
   * Gets the catalogName.
   *
   * Name of the catalog.
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

