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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Application runtime configuration.
 */
public class SparkApplicationRuntime extends GenericModel {

  @SerializedName("spark_version")
  protected String sparkVersion;

  /**
   * Builder.
   */
  public static class Builder {
    private String sparkVersion;

    /**
     * Instantiates a new Builder from an existing SparkApplicationRuntime instance.
     *
     * @param sparkApplicationRuntime the instance to initialize the Builder with
     */
    private Builder(SparkApplicationRuntime sparkApplicationRuntime) {
      this.sparkVersion = sparkApplicationRuntime.sparkVersion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkApplicationRuntime.
     *
     * @return the new SparkApplicationRuntime instance
     */
    public SparkApplicationRuntime build() {
      return new SparkApplicationRuntime(this);
    }

    /**
     * Set the sparkVersion.
     *
     * @param sparkVersion the sparkVersion
     * @return the SparkApplicationRuntime builder
     */
    public Builder sparkVersion(String sparkVersion) {
      this.sparkVersion = sparkVersion;
      return this;
    }
  }

  protected SparkApplicationRuntime() { }

  protected SparkApplicationRuntime(Builder builder) {
    sparkVersion = builder.sparkVersion;
  }

  /**
   * New builder.
   *
   * @return a SparkApplicationRuntime builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sparkVersion.
   *
   * Spark Version.
   *
   * @return the sparkVersion
   */
  public String sparkVersion() {
    return sparkVersion;
  }
}

