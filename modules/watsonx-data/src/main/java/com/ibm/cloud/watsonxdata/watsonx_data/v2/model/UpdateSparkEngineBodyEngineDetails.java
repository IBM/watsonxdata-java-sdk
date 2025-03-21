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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine details.
 */
public class UpdateSparkEngineBodyEngineDetails extends GenericModel {

  @SerializedName("default_config")
  protected Map<String, String> defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  @SerializedName("engine_home_bucket_name")
  protected String engineHomeBucketName;
  @SerializedName("resource_limit_enabled")
  protected Boolean resourceLimitEnabled;
  @SerializedName("resource_limits")
  protected SparkEngineResourceLimit resourceLimits;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> defaultConfig;
    private String defaultVersion;
    private String engineHomeBucketName;
    private Boolean resourceLimitEnabled;
    private SparkEngineResourceLimit resourceLimits;

    /**
     * Instantiates a new Builder from an existing UpdateSparkEngineBodyEngineDetails instance.
     *
     * @param updateSparkEngineBodyEngineDetails the instance to initialize the Builder with
     */
    private Builder(UpdateSparkEngineBodyEngineDetails updateSparkEngineBodyEngineDetails) {
      this.defaultConfig = updateSparkEngineBodyEngineDetails.defaultConfig;
      this.defaultVersion = updateSparkEngineBodyEngineDetails.defaultVersion;
      this.engineHomeBucketName = updateSparkEngineBodyEngineDetails.engineHomeBucketName;
      this.resourceLimitEnabled = updateSparkEngineBodyEngineDetails.resourceLimitEnabled;
      this.resourceLimits = updateSparkEngineBodyEngineDetails.resourceLimits;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateSparkEngineBodyEngineDetails.
     *
     * @return the new UpdateSparkEngineBodyEngineDetails instance
     */
    public UpdateSparkEngineBodyEngineDetails build() {
      return new UpdateSparkEngineBodyEngineDetails(this);
    }

    /**
     * Set the defaultConfig.
     *
     * @param defaultConfig the defaultConfig
     * @return the UpdateSparkEngineBodyEngineDetails builder
     */
    public Builder defaultConfig(Map<String, String> defaultConfig) {
      this.defaultConfig = defaultConfig;
      return this;
    }

    /**
     * Set the defaultVersion.
     *
     * @param defaultVersion the defaultVersion
     * @return the UpdateSparkEngineBodyEngineDetails builder
     */
    public Builder defaultVersion(String defaultVersion) {
      this.defaultVersion = defaultVersion;
      return this;
    }

    /**
     * Set the engineHomeBucketName.
     *
     * @param engineHomeBucketName the engineHomeBucketName
     * @return the UpdateSparkEngineBodyEngineDetails builder
     */
    public Builder engineHomeBucketName(String engineHomeBucketName) {
      this.engineHomeBucketName = engineHomeBucketName;
      return this;
    }

    /**
     * Set the resourceLimitEnabled.
     *
     * @param resourceLimitEnabled the resourceLimitEnabled
     * @return the UpdateSparkEngineBodyEngineDetails builder
     */
    public Builder resourceLimitEnabled(Boolean resourceLimitEnabled) {
      this.resourceLimitEnabled = resourceLimitEnabled;
      return this;
    }

    /**
     * Set the resourceLimits.
     *
     * @param resourceLimits the resourceLimits
     * @return the UpdateSparkEngineBodyEngineDetails builder
     */
    public Builder resourceLimits(SparkEngineResourceLimit resourceLimits) {
      this.resourceLimits = resourceLimits;
      return this;
    }
  }

  protected UpdateSparkEngineBodyEngineDetails() { }

  protected UpdateSparkEngineBodyEngineDetails(Builder builder) {
    defaultConfig = builder.defaultConfig;
    defaultVersion = builder.defaultVersion;
    engineHomeBucketName = builder.engineHomeBucketName;
    resourceLimitEnabled = builder.resourceLimitEnabled;
    resourceLimits = builder.resourceLimits;
  }

  /**
   * New builder.
   *
   * @return a UpdateSparkEngineBodyEngineDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the defaultConfig.
   *
   * Dynamic dict.
   *
   * @return the defaultConfig
   */
  public Map<String, String> defaultConfig() {
    return defaultConfig;
  }

  /**
   * Gets the defaultVersion.
   *
   * The default spark version for the native engine.
   *
   * @return the defaultVersion
   */
  public String defaultVersion() {
    return defaultVersion;
  }

  /**
   * Gets the engineHomeBucketName.
   *
   * Default bucket for spark.
   *
   * @return the engineHomeBucketName
   */
  public String engineHomeBucketName() {
    return engineHomeBucketName;
  }

  /**
   * Gets the resourceLimitEnabled.
   *
   * Resource limit enabled flag.
   *
   * @return the resourceLimitEnabled
   */
  public Boolean resourceLimitEnabled() {
    return resourceLimitEnabled;
  }

  /**
   * Gets the resourceLimits.
   *
   * Native spark engine resource quota.
   *
   * @return the resourceLimits
   */
  public SparkEngineResourceLimit resourceLimits() {
    return resourceLimits;
  }
}

