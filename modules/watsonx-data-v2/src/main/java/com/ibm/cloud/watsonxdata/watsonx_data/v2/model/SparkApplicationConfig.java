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
 * Spark applications details configuration.
 */
public class SparkApplicationConfig extends GenericModel {

  @SerializedName("spark_sample_config_properpty")
  protected String sparkSampleConfigProperpty;

  /**
   * Builder.
   */
  public static class Builder {
    private String sparkSampleConfigProperpty;

    /**
     * Instantiates a new Builder from an existing SparkApplicationConfig instance.
     *
     * @param sparkApplicationConfig the instance to initialize the Builder with
     */
    private Builder(SparkApplicationConfig sparkApplicationConfig) {
      this.sparkSampleConfigProperpty = sparkApplicationConfig.sparkSampleConfigProperpty;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkApplicationConfig.
     *
     * @return the new SparkApplicationConfig instance
     */
    public SparkApplicationConfig build() {
      return new SparkApplicationConfig(this);
    }

    /**
     * Set the sparkSampleConfigProperpty.
     *
     * @param sparkSampleConfigProperpty the sparkSampleConfigProperpty
     * @return the SparkApplicationConfig builder
     */
    public Builder sparkSampleConfigProperpty(String sparkSampleConfigProperpty) {
      this.sparkSampleConfigProperpty = sparkSampleConfigProperpty;
      return this;
    }
  }

  protected SparkApplicationConfig() { }

  protected SparkApplicationConfig(Builder builder) {
    sparkSampleConfigProperpty = builder.sparkSampleConfigProperpty;
  }

  /**
   * New builder.
   *
   * @return a SparkApplicationConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sparkSampleConfigProperpty.
   *
   * spark_sample_config_properpty.
   *
   * @return the sparkSampleConfigProperpty
   */
  public String sparkSampleConfigProperpty() {
    return sparkSampleConfigProperpty;
  }
}

