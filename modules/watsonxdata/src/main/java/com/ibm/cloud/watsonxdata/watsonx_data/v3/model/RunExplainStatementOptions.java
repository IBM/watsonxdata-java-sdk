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
 * The runExplainStatement options.
 */
public class RunExplainStatementOptions extends GenericModel {

  /**
   * Format.
   */
  public interface Format {
    /** text. */
    String TEXT = "text";
    /** graphviz. */
    String GRAPHVIZ = "graphviz";
    /** json. */
    String JSON = "json";
  }

  /**
   * Type.
   */
  public interface Type {
    /** logical. */
    String LOGICAL = "logical";
    /** distributed. */
    String DISTRIBUTED = "distributed";
    /** validate. */
    String VALIDATE = "validate";
    /** io. */
    String IO = "io";
  }

  protected String id;
  protected String statement;
  protected String catalog;
  protected String format;
  protected String schema;
  protected String type;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String statement;
    private String catalog;
    private String format;
    private String schema;
    private String type;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RunExplainStatementOptions instance.
     *
     * @param runExplainStatementOptions the instance to initialize the Builder with
     */
    private Builder(RunExplainStatementOptions runExplainStatementOptions) {
      this.id = runExplainStatementOptions.id;
      this.statement = runExplainStatementOptions.statement;
      this.catalog = runExplainStatementOptions.catalog;
      this.format = runExplainStatementOptions.format;
      this.schema = runExplainStatementOptions.schema;
      this.type = runExplainStatementOptions.type;
      this.authInstanceId = runExplainStatementOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param statement the statement
     */
    public Builder(String id, String statement) {
      this.id = id;
      this.statement = statement;
    }

    /**
     * Builds a RunExplainStatementOptions.
     *
     * @return the new RunExplainStatementOptions instance
     */
    public RunExplainStatementOptions build() {
      return new RunExplainStatementOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the RunExplainStatementOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the statement.
     *
     * @param statement the statement
     * @return the RunExplainStatementOptions builder
     */
    public Builder statement(String statement) {
      this.statement = statement;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the RunExplainStatementOptions builder
     */
    public Builder catalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the RunExplainStatementOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the RunExplainStatementOptions builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the RunExplainStatementOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RunExplainStatementOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RunExplainStatementOptions() { }

  protected RunExplainStatementOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.statement,
      "statement cannot be null");
    id = builder.id;
    statement = builder.statement;
    catalog = builder.catalog;
    format = builder.format;
    schema = builder.schema;
    type = builder.type;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RunExplainStatementOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the statement.
   *
   * Presto query to determine explain plan.
   *
   * @return the statement
   */
  public String statement() {
    return statement;
  }

  /**
   * Gets the catalog.
   *
   * Catalog name.
   *
   * @return the catalog
   */
  public String catalog() {
    return catalog;
  }

  /**
   * Gets the format.
   *
   * Format.
   *
   * @return the format
   */
  public String format() {
    return format;
  }

  /**
   * Gets the schema.
   *
   * Schema name.
   *
   * @return the schema
   */
  public String schema() {
    return schema;
  }

  /**
   * Gets the type.
   *
   * Type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

