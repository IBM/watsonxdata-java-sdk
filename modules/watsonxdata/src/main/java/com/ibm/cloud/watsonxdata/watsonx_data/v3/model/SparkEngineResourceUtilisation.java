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
 * Native spark engine resource utilisation.
 */
public class SparkEngineResourceUtilisation extends GenericModel {

  protected String cores;
  protected String memory;

  /**
   * Builder.
   */
  public static class Builder {
    private String cores;
    private String memory;

    /**
     * Instantiates a new Builder from an existing SparkEngineResourceUtilisation instance.
     *
     * @param sparkEngineResourceUtilisation the instance to initialize the Builder with
     */
    private Builder(SparkEngineResourceUtilisation sparkEngineResourceUtilisation) {
      this.cores = sparkEngineResourceUtilisation.cores;
      this.memory = sparkEngineResourceUtilisation.memory;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineResourceUtilisation.
     *
     * @return the new SparkEngineResourceUtilisation instance
     */
    public SparkEngineResourceUtilisation build() {
      return new SparkEngineResourceUtilisation(this);
    }

    /**
     * Set the cores.
     *
     * @param cores the cores
     * @return the SparkEngineResourceUtilisation builder
     */
    public Builder cores(String cores) {
      this.cores = cores;
      return this;
    }

    /**
     * Set the memory.
     *
     * @param memory the memory
     * @return the SparkEngineResourceUtilisation builder
     */
    public Builder memory(String memory) {
      this.memory = memory;
      return this;
    }
  }

  protected SparkEngineResourceUtilisation() { }

  protected SparkEngineResourceUtilisation(Builder builder) {
    cores = builder.cores;
    memory = builder.memory;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineResourceUtilisation builder
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
   * Memory.
   *
   * @return the memory
   */
  public String memory() {
    return memory;
  }
}

