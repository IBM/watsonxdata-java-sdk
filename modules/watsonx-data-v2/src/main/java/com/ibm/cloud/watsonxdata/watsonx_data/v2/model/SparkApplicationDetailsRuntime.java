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
 * application run time.
 */
public class SparkApplicationDetailsRuntime extends GenericModel {

  @SerializedName("spark_version")
  protected String sparkVersion;

  /**
   * Builder.
   */
  public static class Builder {
    private String sparkVersion;

    /**
     * Instantiates a new Builder from an existing SparkApplicationDetailsRuntime instance.
     *
     * @param sparkApplicationDetailsRuntime the instance to initialize the Builder with
     */
    private Builder(SparkApplicationDetailsRuntime sparkApplicationDetailsRuntime) {
      this.sparkVersion = sparkApplicationDetailsRuntime.sparkVersion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkApplicationDetailsRuntime.
     *
     * @return the new SparkApplicationDetailsRuntime instance
     */
    public SparkApplicationDetailsRuntime build() {
      return new SparkApplicationDetailsRuntime(this);
    }

    /**
     * Set the sparkVersion.
     *
     * @param sparkVersion the sparkVersion
     * @return the SparkApplicationDetailsRuntime builder
     */
    public Builder sparkVersion(String sparkVersion) {
      this.sparkVersion = sparkVersion;
      return this;
    }
  }

  protected SparkApplicationDetailsRuntime() { }

  protected SparkApplicationDetailsRuntime(Builder builder) {
    sparkVersion = builder.sparkVersion;
  }

  /**
   * New builder.
   *
   * @return a SparkApplicationDetailsRuntime builder
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

