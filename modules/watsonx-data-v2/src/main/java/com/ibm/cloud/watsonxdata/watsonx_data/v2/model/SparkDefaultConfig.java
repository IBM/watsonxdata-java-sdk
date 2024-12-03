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
 * Spark Default Config details.
 */
public class SparkDefaultConfig extends GenericModel {

  protected String config1;
  protected String config2;

  /**
   * Builder.
   */
  public static class Builder {
    private String config1;
    private String config2;

    /**
     * Instantiates a new Builder from an existing SparkDefaultConfig instance.
     *
     * @param sparkDefaultConfig the instance to initialize the Builder with
     */
    private Builder(SparkDefaultConfig sparkDefaultConfig) {
      this.config1 = sparkDefaultConfig.config1;
      this.config2 = sparkDefaultConfig.config2;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkDefaultConfig.
     *
     * @return the new SparkDefaultConfig instance
     */
    public SparkDefaultConfig build() {
      return new SparkDefaultConfig(this);
    }

    /**
     * Set the config1.
     *
     * @param config1 the config1
     * @return the SparkDefaultConfig builder
     */
    public Builder config1(String config1) {
      this.config1 = config1;
      return this;
    }

    /**
     * Set the config2.
     *
     * @param config2 the config2
     * @return the SparkDefaultConfig builder
     */
    public Builder config2(String config2) {
      this.config2 = config2;
      return this;
    }
  }

  protected SparkDefaultConfig() { }

  protected SparkDefaultConfig(Builder builder) {
    config1 = builder.config1;
    config2 = builder.config2;
  }

  /**
   * New builder.
   *
   * @return a SparkDefaultConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the config1.
   *
   * config1.
   *
   * @return the config1
   */
  public String config1() {
    return config1;
  }

  /**
   * Gets the config2.
   *
   * config2.
   *
   * @return the config2
   */
  public String config2() {
    return config2;
  }
}

