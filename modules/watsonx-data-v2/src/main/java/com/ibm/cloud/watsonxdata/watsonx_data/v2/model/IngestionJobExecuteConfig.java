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
public class IngestionJobExecuteConfig extends GenericModel {

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

  protected IngestionJobExecuteConfig() { }

  /**
   * Gets the driverCores.
   *
   * Driver core(s) configuration for Spark engine.
   *
   * @return the driverCores
   */
  public Long getDriverCores() {
    return driverCores;
  }

  /**
   * Gets the driverMemory.
   *
   * Driver memory configuration (in GB) for Spark engine.
   *
   * @return the driverMemory
   */
  public String getDriverMemory() {
    return driverMemory;
  }

  /**
   * Gets the executorCores.
   *
   * Executor core(s) configuration for Spark engine.
   *
   * @return the executorCores
   */
  public Long getExecutorCores() {
    return executorCores;
  }

  /**
   * Gets the executorMemory.
   *
   * Executor memory configuration (in GB) for Spark engine.
   *
   * @return the executorMemory
   */
  public String getExecutorMemory() {
    return executorMemory;
  }

  /**
   * Gets the numExecutors.
   *
   * Number of executors to assign for Spark engine.
   *
   * @return the numExecutors
   */
  public Long getNumExecutors() {
    return numExecutors;
  }
}

