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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine details.
 */
public class SparkEnginePatchEngineDetails extends GenericModel {

  @SerializedName("default_config")
  protected Map<String, String> defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  @SerializedName("engine_home")
  protected SparkEngineHomePatch engineHome;
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
    private SparkEngineHomePatch engineHome;
    private Boolean resourceLimitEnabled;
    private SparkEngineResourceLimit resourceLimits;

    /**
     * Instantiates a new Builder from an existing SparkEnginePatchEngineDetails instance.
     *
     * @param sparkEnginePatchEngineDetails the instance to initialize the Builder with
     */
    private Builder(SparkEnginePatchEngineDetails sparkEnginePatchEngineDetails) {
      this.defaultConfig = sparkEnginePatchEngineDetails.defaultConfig;
      this.defaultVersion = sparkEnginePatchEngineDetails.defaultVersion;
      this.engineHome = sparkEnginePatchEngineDetails.engineHome;
      this.resourceLimitEnabled = sparkEnginePatchEngineDetails.resourceLimitEnabled;
      this.resourceLimits = sparkEnginePatchEngineDetails.resourceLimits;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEnginePatchEngineDetails.
     *
     * @return the new SparkEnginePatchEngineDetails instance
     */
    public SparkEnginePatchEngineDetails build() {
      return new SparkEnginePatchEngineDetails(this);
    }

    /**
     * Set the defaultConfig.
     *
     * @param defaultConfig the defaultConfig
     * @return the SparkEnginePatchEngineDetails builder
     */
    public Builder defaultConfig(Map<String, String> defaultConfig) {
      this.defaultConfig = defaultConfig;
      return this;
    }

    /**
     * Set the defaultVersion.
     *
     * @param defaultVersion the defaultVersion
     * @return the SparkEnginePatchEngineDetails builder
     */
    public Builder defaultVersion(String defaultVersion) {
      this.defaultVersion = defaultVersion;
      return this;
    }

    /**
     * Set the engineHome.
     *
     * @param engineHome the engineHome
     * @return the SparkEnginePatchEngineDetails builder
     */
    public Builder engineHome(SparkEngineHomePatch engineHome) {
      this.engineHome = engineHome;
      return this;
    }

    /**
     * Set the resourceLimitEnabled.
     *
     * @param resourceLimitEnabled the resourceLimitEnabled
     * @return the SparkEnginePatchEngineDetails builder
     */
    public Builder resourceLimitEnabled(Boolean resourceLimitEnabled) {
      this.resourceLimitEnabled = resourceLimitEnabled;
      return this;
    }

    /**
     * Set the resourceLimits.
     *
     * @param resourceLimits the resourceLimits
     * @return the SparkEnginePatchEngineDetails builder
     */
    public Builder resourceLimits(SparkEngineResourceLimit resourceLimits) {
      this.resourceLimits = resourceLimits;
      return this;
    }
  }

  protected SparkEnginePatchEngineDetails() { }

  protected SparkEnginePatchEngineDetails(Builder builder) {
    defaultConfig = builder.defaultConfig;
    defaultVersion = builder.defaultVersion;
    engineHome = builder.engineHome;
    resourceLimitEnabled = builder.resourceLimitEnabled;
    resourceLimits = builder.resourceLimits;
  }

  /**
   * New builder.
   *
   * @return a SparkEnginePatchEngineDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the defaultConfig.
   *
   * Default Spark configuration properties to be updated. To remove a property, set its value to null.
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
   * Gets the engineHome.
   *
   * Engine home properties for Spark engine configuration for Patch.
   *
   * @return the engineHome
   */
  public SparkEngineHomePatch engineHome() {
    return engineHome;
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

