/*
 * (C) Copyright IBM Corp. 2025.
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
 * Native spark engine resource quota.
 */
public class SparkEngineResourceLimit extends GenericModel {

  protected String cores;
  protected String memory;

  /**
   * Builder.
   */
  public static class Builder {
    private String cores;
    private String memory;

    /**
     * Instantiates a new Builder from an existing SparkEngineResourceLimit instance.
     *
     * @param sparkEngineResourceLimit the instance to initialize the Builder with
     */
    private Builder(SparkEngineResourceLimit sparkEngineResourceLimit) {
      this.cores = sparkEngineResourceLimit.cores;
      this.memory = sparkEngineResourceLimit.memory;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineResourceLimit.
     *
     * @return the new SparkEngineResourceLimit instance
     */
    public SparkEngineResourceLimit build() {
      return new SparkEngineResourceLimit(this);
    }

    /**
     * Set the cores.
     *
     * @param cores the cores
     * @return the SparkEngineResourceLimit builder
     */
    public Builder cores(String cores) {
      this.cores = cores;
      return this;
    }

    /**
     * Set the memory.
     *
     * @param memory the memory
     * @return the SparkEngineResourceLimit builder
     */
    public Builder memory(String memory) {
      this.memory = memory;
      return this;
    }
  }

  protected SparkEngineResourceLimit() { }

  protected SparkEngineResourceLimit(Builder builder) {
    cores = builder.cores;
    memory = builder.memory;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineResourceLimit builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cores.
   *
   * CPU.
   *
   * @return the cores
   */
  public String cores() {
    return cores;
  }

  /**
   * Gets the memory.
   *
   * Memory in GiB.
   *
   * @return the memory
   */
  public String memory() {
    return memory;
  }
}

