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
 * Spark applications details env samples.
 */
public class SparkApplicationEnv extends GenericModel {

  @SerializedName("sample_env_key")
  protected String sampleEnvKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String sampleEnvKey;

    /**
     * Instantiates a new Builder from an existing SparkApplicationEnv instance.
     *
     * @param sparkApplicationEnv the instance to initialize the Builder with
     */
    private Builder(SparkApplicationEnv sparkApplicationEnv) {
      this.sampleEnvKey = sparkApplicationEnv.sampleEnvKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkApplicationEnv.
     *
     * @return the new SparkApplicationEnv instance
     */
    public SparkApplicationEnv build() {
      return new SparkApplicationEnv(this);
    }

    /**
     * Set the sampleEnvKey.
     *
     * @param sampleEnvKey the sampleEnvKey
     * @return the SparkApplicationEnv builder
     */
    public Builder sampleEnvKey(String sampleEnvKey) {
      this.sampleEnvKey = sampleEnvKey;
      return this;
    }
  }

  protected SparkApplicationEnv() { }

  protected SparkApplicationEnv(Builder builder) {
    sampleEnvKey = builder.sampleEnvKey;
  }

  /**
   * New builder.
   *
   * @return a SparkApplicationEnv builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sampleEnvKey.
   *
   * sample.
   *
   * @return the sampleEnvKey
   */
  public String sampleEnvKey() {
    return sampleEnvKey;
  }
}

