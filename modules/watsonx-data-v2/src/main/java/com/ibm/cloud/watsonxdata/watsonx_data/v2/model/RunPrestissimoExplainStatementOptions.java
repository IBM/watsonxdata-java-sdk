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
 * The runPrestissimoExplainStatement options.
 */
public class RunPrestissimoExplainStatementOptions extends GenericModel {

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

  protected String engineId;
  protected String statement;
  protected String format;
  protected String type;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String statement;
    private String format;
    private String type;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RunPrestissimoExplainStatementOptions instance.
     *
     * @param runPrestissimoExplainStatementOptions the instance to initialize the Builder with
     */
    private Builder(RunPrestissimoExplainStatementOptions runPrestissimoExplainStatementOptions) {
      this.engineId = runPrestissimoExplainStatementOptions.engineId;
      this.statement = runPrestissimoExplainStatementOptions.statement;
      this.format = runPrestissimoExplainStatementOptions.format;
      this.type = runPrestissimoExplainStatementOptions.type;
      this.authInstanceId = runPrestissimoExplainStatementOptions.authInstanceId;
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
     * @param statement the statement
     */
    public Builder(String engineId, String statement) {
      this.engineId = engineId;
      this.statement = statement;
    }

    /**
     * Builds a RunPrestissimoExplainStatementOptions.
     *
     * @return the new RunPrestissimoExplainStatementOptions instance
     */
    public RunPrestissimoExplainStatementOptions build() {
      return new RunPrestissimoExplainStatementOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the RunPrestissimoExplainStatementOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the statement.
     *
     * @param statement the statement
     * @return the RunPrestissimoExplainStatementOptions builder
     */
    public Builder statement(String statement) {
      this.statement = statement;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the RunPrestissimoExplainStatementOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the RunPrestissimoExplainStatementOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RunPrestissimoExplainStatementOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RunPrestissimoExplainStatementOptions() { }

  protected RunPrestissimoExplainStatementOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.statement,
      "statement cannot be null");
    engineId = builder.engineId;
    statement = builder.statement;
    format = builder.format;
    type = builder.type;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RunPrestissimoExplainStatementOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

