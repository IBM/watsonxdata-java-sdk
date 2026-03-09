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
 * Spark engine configuration details.
 */
public class SparkEngineDetailsPrototype extends GenericModel {

  /**
   * How is the spark instance managed.
   */
  public interface ManagedBy {
    /** self. */
    String SELF = "self";
    /** fully. */
    String FULLY = "fully";
  }

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("default_config")
  protected Map<String, String> defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  @SerializedName("engine_home")
  protected SparkEngineHome engineHome;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("scale_config")
  protected SparkScaleConfig scaleConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String connectionString;
    private Map<String, String> defaultConfig;
    private String defaultVersion;
    private SparkEngineHome engineHome;
    private String instanceId;
    private String managedBy;
    private SparkScaleConfig scaleConfig;

    /**
     * Instantiates a new Builder from an existing SparkEngineDetailsPrototype instance.
     *
     * @param sparkEngineDetailsPrototype the instance to initialize the Builder with
     */
    private Builder(SparkEngineDetailsPrototype sparkEngineDetailsPrototype) {
      this.apiKey = sparkEngineDetailsPrototype.apiKey;
      this.connectionString = sparkEngineDetailsPrototype.connectionString;
      this.defaultConfig = sparkEngineDetailsPrototype.defaultConfig;
      this.defaultVersion = sparkEngineDetailsPrototype.defaultVersion;
      this.engineHome = sparkEngineDetailsPrototype.engineHome;
      this.instanceId = sparkEngineDetailsPrototype.instanceId;
      this.managedBy = sparkEngineDetailsPrototype.managedBy;
      this.scaleConfig = sparkEngineDetailsPrototype.scaleConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineDetailsPrototype.
     *
     * @return the new SparkEngineDetailsPrototype instance
     */
    public SparkEngineDetailsPrototype build() {
      return new SparkEngineDetailsPrototype(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the defaultConfig.
     *
     * @param defaultConfig the defaultConfig
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder defaultConfig(Map<String, String> defaultConfig) {
      this.defaultConfig = defaultConfig;
      return this;
    }

    /**
     * Set the defaultVersion.
     *
     * @param defaultVersion the defaultVersion
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder defaultVersion(String defaultVersion) {
      this.defaultVersion = defaultVersion;
      return this;
    }

    /**
     * Set the engineHome.
     *
     * @param engineHome the engineHome
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHome(SparkEngineHome engineHome) {
      this.engineHome = engineHome;
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the scaleConfig.
     *
     * @param scaleConfig the scaleConfig
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder scaleConfig(SparkScaleConfig scaleConfig) {
      this.scaleConfig = scaleConfig;
      return this;
    }
  }

  protected SparkEngineDetailsPrototype() { }

  protected SparkEngineDetailsPrototype(Builder builder) {
    apiKey = builder.apiKey;
    connectionString = builder.connectionString;
    defaultConfig = builder.defaultConfig;
    defaultVersion = builder.defaultVersion;
    engineHome = builder.engineHome;
    instanceId = builder.instanceId;
    managedBy = builder.managedBy;
    scaleConfig = builder.scaleConfig;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineDetailsPrototype builder
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
   * External engine connection string. Applicable only for external engine.
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
   * Gets the scaleConfig.
   *
   * Spark instance scale configuration.
   *
   * @return the scaleConfig
   */
  public SparkScaleConfig scaleConfig() {
    return scaleConfig;
  }
}

