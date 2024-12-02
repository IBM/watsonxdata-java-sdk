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
 * The runPrestissimoExplainAnalyzeStatement options.
 */
public class RunPrestissimoExplainAnalyzeStatementOptions extends GenericModel {

  protected String engineId;
  protected String statement;
  protected Boolean verbose;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String statement;
    private Boolean verbose;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RunPrestissimoExplainAnalyzeStatementOptions instance.
     *
     * @param runPrestissimoExplainAnalyzeStatementOptions the instance to initialize the Builder with
     */
    private Builder(RunPrestissimoExplainAnalyzeStatementOptions runPrestissimoExplainAnalyzeStatementOptions) {
      this.engineId = runPrestissimoExplainAnalyzeStatementOptions.engineId;
      this.statement = runPrestissimoExplainAnalyzeStatementOptions.statement;
      this.verbose = runPrestissimoExplainAnalyzeStatementOptions.verbose;
      this.authInstanceId = runPrestissimoExplainAnalyzeStatementOptions.authInstanceId;
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
     * Builds a RunPrestissimoExplainAnalyzeStatementOptions.
     *
     * @return the new RunPrestissimoExplainAnalyzeStatementOptions instance
     */
    public RunPrestissimoExplainAnalyzeStatementOptions build() {
      return new RunPrestissimoExplainAnalyzeStatementOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the RunPrestissimoExplainAnalyzeStatementOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the statement.
     *
     * @param statement the statement
     * @return the RunPrestissimoExplainAnalyzeStatementOptions builder
     */
    public Builder statement(String statement) {
      this.statement = statement;
      return this;
    }

    /**
     * Set the verbose.
     *
     * @param verbose the verbose
     * @return the RunPrestissimoExplainAnalyzeStatementOptions builder
     */
    public Builder verbose(Boolean verbose) {
      this.verbose = verbose;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RunPrestissimoExplainAnalyzeStatementOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RunPrestissimoExplainAnalyzeStatementOptions() { }

  protected RunPrestissimoExplainAnalyzeStatementOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.statement,
      "statement cannot be null");
    engineId = builder.engineId;
    statement = builder.statement;
    verbose = builder.verbose;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RunPrestissimoExplainAnalyzeStatementOptions builder
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
   * Presto query to show explain analyze.
   *
   * @return the statement
   */
  public String statement() {
    return statement;
  }

  /**
   * Gets the verbose.
   *
   * Verbose.
   *
   * @return the verbose
   */
  public Boolean verbose() {
    return verbose;
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

