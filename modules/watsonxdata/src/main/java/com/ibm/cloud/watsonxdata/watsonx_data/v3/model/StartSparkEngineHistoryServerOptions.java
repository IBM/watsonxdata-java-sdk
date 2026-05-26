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
 * The startSparkEngineHistoryServer options.
 */
public class StartSparkEngineHistoryServerOptions extends GenericModel {

  protected String id;
  protected String cores;
  protected String memory;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String cores;
    private String memory;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing StartSparkEngineHistoryServerOptions instance.
     *
     * @param startSparkEngineHistoryServerOptions the instance to initialize the Builder with
     */
    private Builder(StartSparkEngineHistoryServerOptions startSparkEngineHistoryServerOptions) {
      this.id = startSparkEngineHistoryServerOptions.id;
      this.cores = startSparkEngineHistoryServerOptions.cores;
      this.memory = startSparkEngineHistoryServerOptions.memory;
      this.authInstanceId = startSparkEngineHistoryServerOptions.authInstanceId;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a StartSparkEngineHistoryServerOptions.
     *
     * @return the new StartSparkEngineHistoryServerOptions instance
     */
    public StartSparkEngineHistoryServerOptions build() {
      return new StartSparkEngineHistoryServerOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the StartSparkEngineHistoryServerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cores.
     *
     * @param cores the cores
     * @return the StartSparkEngineHistoryServerOptions builder
     */
    public Builder cores(String cores) {
      this.cores = cores;
      return this;
    }

    /**
     * Set the memory.
     *
     * @param memory the memory
     * @return the StartSparkEngineHistoryServerOptions builder
     */
    public Builder memory(String memory) {
      this.memory = memory;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the StartSparkEngineHistoryServerOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected StartSparkEngineHistoryServerOptions() { }

  protected StartSparkEngineHistoryServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    cores = builder.cores;
    memory = builder.memory;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a StartSparkEngineHistoryServerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the cores.
   *
   * CPU cores to be allocated to the history server.
   *
   * @return the cores
   */
  public String cores() {
    return cores;
  }

  /**
   * Gets the memory.
   *
   * Memory to be allocated for the history server. Kuberneted memory unit (G) must also be specified.
   *
   * @return the memory
   */
  public String memory() {
    return memory;
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

