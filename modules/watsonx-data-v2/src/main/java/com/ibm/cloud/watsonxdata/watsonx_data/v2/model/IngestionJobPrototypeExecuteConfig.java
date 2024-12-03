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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Ingestion engine configuration.
 */
public class IngestionJobPrototypeExecuteConfig extends GenericModel {

  @SerializedName("driver_cores")
  protected Long driverCores;
  @SerializedName("driver_memory")
  protected String driverMemory;
  @SerializedName("executor_cores")
  protected Long executorCores;
  @SerializedName("executor_memory")
  protected String executorMemory;
  @SerializedName("num_executors")
  protected Long numExecutors;

  /**
   * Builder.
   */
  public static class Builder {
    private Long driverCores;
    private String driverMemory;
    private Long executorCores;
    private String executorMemory;
    private Long numExecutors;

    /**
     * Instantiates a new Builder from an existing IngestionJobPrototypeExecuteConfig instance.
     *
     * @param ingestionJobPrototypeExecuteConfig the instance to initialize the Builder with
     */
    private Builder(IngestionJobPrototypeExecuteConfig ingestionJobPrototypeExecuteConfig) {
      this.driverCores = ingestionJobPrototypeExecuteConfig.driverCores;
      this.driverMemory = ingestionJobPrototypeExecuteConfig.driverMemory;
      this.executorCores = ingestionJobPrototypeExecuteConfig.executorCores;
      this.executorMemory = ingestionJobPrototypeExecuteConfig.executorMemory;
      this.numExecutors = ingestionJobPrototypeExecuteConfig.numExecutors;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IngestionJobPrototypeExecuteConfig.
     *
     * @return the new IngestionJobPrototypeExecuteConfig instance
     */
    public IngestionJobPrototypeExecuteConfig build() {
      return new IngestionJobPrototypeExecuteConfig(this);
    }

    /**
     * Set the driverCores.
     *
     * @param driverCores the driverCores
     * @return the IngestionJobPrototypeExecuteConfig builder
     */
    public Builder driverCores(long driverCores) {
      this.driverCores = driverCores;
      return this;
    }

    /**
     * Set the driverMemory.
     *
     * @param driverMemory the driverMemory
     * @return the IngestionJobPrototypeExecuteConfig builder
     */
    public Builder driverMemory(String driverMemory) {
      this.driverMemory = driverMemory;
      return this;
    }

    /**
     * Set the executorCores.
     *
     * @param executorCores the executorCores
     * @return the IngestionJobPrototypeExecuteConfig builder
     */
    public Builder executorCores(long executorCores) {
      this.executorCores = executorCores;
      return this;
    }

    /**
     * Set the executorMemory.
     *
     * @param executorMemory the executorMemory
     * @return the IngestionJobPrototypeExecuteConfig builder
     */
    public Builder executorMemory(String executorMemory) {
      this.executorMemory = executorMemory;
      return this;
    }

    /**
     * Set the numExecutors.
     *
     * @param numExecutors the numExecutors
     * @return the IngestionJobPrototypeExecuteConfig builder
     */
    public Builder numExecutors(long numExecutors) {
      this.numExecutors = numExecutors;
      return this;
    }
  }

  protected IngestionJobPrototypeExecuteConfig() { }

  protected IngestionJobPrototypeExecuteConfig(Builder builder) {
    driverCores = builder.driverCores;
    driverMemory = builder.driverMemory;
    executorCores = builder.executorCores;
    executorMemory = builder.executorMemory;
    numExecutors = builder.numExecutors;
  }

  /**
   * New builder.
   *
   * @return a IngestionJobPrototypeExecuteConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the driverCores.
   *
   * Driver core(s) configuration for Spark engine.
   *
   * @return the driverCores
   */
  public Long driverCores() {
    return driverCores;
  }

  /**
   * Gets the driverMemory.
   *
   * Driver memory configuration (in GB) for Spark engine.
   *
   * @return the driverMemory
   */
  public String driverMemory() {
    return driverMemory;
  }

  /**
   * Gets the executorCores.
   *
   * Executor core(s) configuration for Spark engine.
   *
   * @return the executorCores
   */
  public Long executorCores() {
    return executorCores;
  }

  /**
   * Gets the executorMemory.
   *
   * Executor memory configuration (in GB) for Spark engine.
   *
   * @return the executorMemory
   */
  public String executorMemory() {
    return executorMemory;
  }

  /**
   * Gets the numExecutors.
   *
   * Number of executors to assign for Spark engine.
   *
   * @return the numExecutors
   */
  public Long numExecutors() {
    return numExecutors;
  }
}

