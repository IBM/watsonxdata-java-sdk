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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark engine configuration details.
 */
public class SparkEngineDetails extends GenericModel {

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("default_config")
  protected Map<String, String> defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  protected SparkEndpoints endpoints;
  @SerializedName("engine_home")
  protected SparkEngineHome engineHome;
  @SerializedName("engine_sub_type")
  protected String engineSubType;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("resource_limit_enabled")
  protected Boolean resourceLimitEnabled;
  @SerializedName("resource_limits")
  protected SparkEngineResourceLimit resourceLimits;
  @SerializedName("resource_utilisation")
  protected SparkEngineResourceUtilisation resourceUtilisation;
  @SerializedName("scale_config")
  protected SparkScaleConfig scaleConfig;
  @SerializedName("vscode_config")
  protected SparkVscodeConfig vscodeConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String connectionString;
    private Map<String, String> defaultConfig;
    private String defaultVersion;
    private SparkEndpoints endpoints;
    private SparkEngineHome engineHome;
    private String engineSubType;
    private String instanceId;
    private String managedBy;
    private Boolean resourceLimitEnabled;
    private SparkEngineResourceLimit resourceLimits;
    private SparkEngineResourceUtilisation resourceUtilisation;
    private SparkScaleConfig scaleConfig;
    private SparkVscodeConfig vscodeConfig;

    /**
     * Instantiates a new Builder from an existing SparkEngineDetails instance.
     *
     * @param sparkEngineDetails the instance to initialize the Builder with
     */
    private Builder(SparkEngineDetails sparkEngineDetails) {
      this.apiKey = sparkEngineDetails.apiKey;
      this.connectionString = sparkEngineDetails.connectionString;
      this.defaultConfig = sparkEngineDetails.defaultConfig;
      this.defaultVersion = sparkEngineDetails.defaultVersion;
      this.endpoints = sparkEngineDetails.endpoints;
      this.engineHome = sparkEngineDetails.engineHome;
      this.engineSubType = sparkEngineDetails.engineSubType;
      this.instanceId = sparkEngineDetails.instanceId;
      this.managedBy = sparkEngineDetails.managedBy;
      this.resourceLimitEnabled = sparkEngineDetails.resourceLimitEnabled;
      this.resourceLimits = sparkEngineDetails.resourceLimits;
      this.resourceUtilisation = sparkEngineDetails.resourceUtilisation;
      this.scaleConfig = sparkEngineDetails.scaleConfig;
      this.vscodeConfig = sparkEngineDetails.vscodeConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineDetails.
     *
     * @return the new SparkEngineDetails instance
     */
    public SparkEngineDetails build() {
      return new SparkEngineDetails(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the SparkEngineDetails builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the SparkEngineDetails builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the defaultConfig.
     *
     * @param defaultConfig the defaultConfig
     * @return the SparkEngineDetails builder
     */
    public Builder defaultConfig(Map<String, String> defaultConfig) {
      this.defaultConfig = defaultConfig;
      return this;
    }

    /**
     * Set the defaultVersion.
     *
     * @param defaultVersion the defaultVersion
     * @return the SparkEngineDetails builder
     */
    public Builder defaultVersion(String defaultVersion) {
      this.defaultVersion = defaultVersion;
      return this;
    }

    /**
     * Set the endpoints.
     *
     * @param endpoints the endpoints
     * @return the SparkEngineDetails builder
     */
    public Builder endpoints(SparkEndpoints endpoints) {
      this.endpoints = endpoints;
      return this;
    }

    /**
     * Set the engineHome.
     *
     * @param engineHome the engineHome
     * @return the SparkEngineDetails builder
     */
    public Builder engineHome(SparkEngineHome engineHome) {
      this.engineHome = engineHome;
      return this;
    }

    /**
     * Set the engineSubType.
     *
     * @param engineSubType the engineSubType
     * @return the SparkEngineDetails builder
     */
    public Builder engineSubType(String engineSubType) {
      this.engineSubType = engineSubType;
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the SparkEngineDetails builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the SparkEngineDetails builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the resourceLimitEnabled.
     *
     * @param resourceLimitEnabled the resourceLimitEnabled
     * @return the SparkEngineDetails builder
     */
    public Builder resourceLimitEnabled(Boolean resourceLimitEnabled) {
      this.resourceLimitEnabled = resourceLimitEnabled;
      return this;
    }

    /**
     * Set the resourceLimits.
     *
     * @param resourceLimits the resourceLimits
     * @return the SparkEngineDetails builder
     */
    public Builder resourceLimits(SparkEngineResourceLimit resourceLimits) {
      this.resourceLimits = resourceLimits;
      return this;
    }

    /**
     * Set the resourceUtilisation.
     *
     * @param resourceUtilisation the resourceUtilisation
     * @return the SparkEngineDetails builder
     */
    public Builder resourceUtilisation(SparkEngineResourceUtilisation resourceUtilisation) {
      this.resourceUtilisation = resourceUtilisation;
      return this;
    }

    /**
     * Set the scaleConfig.
     *
     * @param scaleConfig the scaleConfig
     * @return the SparkEngineDetails builder
     */
    public Builder scaleConfig(SparkScaleConfig scaleConfig) {
      this.scaleConfig = scaleConfig;
      return this;
    }

    /**
     * Set the vscodeConfig.
     *
     * @param vscodeConfig the vscodeConfig
     * @return the SparkEngineDetails builder
     */
    public Builder vscodeConfig(SparkVscodeConfig vscodeConfig) {
      this.vscodeConfig = vscodeConfig;
      return this;
    }
  }

  protected SparkEngineDetails() { }

  protected SparkEngineDetails(Builder builder) {
    apiKey = builder.apiKey;
    connectionString = builder.connectionString;
    defaultConfig = builder.defaultConfig;
    defaultVersion = builder.defaultVersion;
    endpoints = builder.endpoints;
    engineHome = builder.engineHome;
    engineSubType = builder.engineSubType;
    instanceId = builder.instanceId;
    managedBy = builder.managedBy;
    resourceLimitEnabled = builder.resourceLimitEnabled;
    resourceLimits = builder.resourceLimits;
    resourceUtilisation = builder.resourceUtilisation;
    scaleConfig = builder.scaleConfig;
    vscodeConfig = builder.vscodeConfig;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apiKey.
   *
   * Api key to be used for connecting with external Analytics engine instance. Applicable only for external engine.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the connectionString.
   *
   * External engine connection string. Applicable only for  external engine.
   *
   * @return the connectionString
   */
  public String connectionString() {
    return connectionString;
  }

  /**
   * Gets the defaultConfig.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the defaultConfig
   */
  public Map<String, String> defaultConfig() {
    return defaultConfig;
  }

  /**
   * Gets the defaultVersion.
   *
   * Default spark version for applications run on this Spark engine.
   *
   * @return the defaultVersion
   */
  public String defaultVersion() {
    return defaultVersion;
  }

  /**
   * Gets the endpoints.
   *
   * Spark engine endpoints.
   *
   * @return the endpoints
   */
  public SparkEndpoints endpoints() {
    return endpoints;
  }

  /**
   * Gets the engineHome.
   *
   * Engine home properties for Spark engine configuration.
   *
   * @return the engineHome
   */
  public SparkEngineHome engineHome() {
    return engineHome;
  }

  /**
   * Gets the engineSubType.
   *
   * spark engine sub type.
   *
   * @return the engineSubType
   */
  public String engineSubType() {
    return engineSubType;
  }

  /**
   * Gets the instanceId.
   *
   * Id of Analytics engine instance used as external engine.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the managedBy.
   *
   * How is the spark instance managed.
   *
   * @return the managedBy
   */
  public String managedBy() {
    return managedBy;
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

  /**
   * Gets the resourceUtilisation.
   *
   * Native spark engine resource utilisation.
   *
   * @return the resourceUtilisation
   */
  public SparkEngineResourceUtilisation resourceUtilisation() {
    return resourceUtilisation;
  }

  /**
   * Gets the scaleConfig.
   *
   * Spark instance scale configuration.
   *
   * @return the scaleConfig
   */
  public SparkScaleConfig scaleConfig() {
    return scaleConfig;
  }

  /**
   * Gets the vscodeConfig.
   *
   * Spark vscode configuration.
   *
   * @return the vscodeConfig
   */
  public SparkVscodeConfig vscodeConfig() {
    return vscodeConfig;
  }
}

