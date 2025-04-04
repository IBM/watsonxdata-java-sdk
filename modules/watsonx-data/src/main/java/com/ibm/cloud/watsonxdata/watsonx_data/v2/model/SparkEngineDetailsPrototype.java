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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Node details.
 */
public class SparkEngineDetailsPrototype extends GenericModel {

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("default_config")
  protected SparkDefaultConfig defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  @SerializedName("engine_home_bucket_display_name")
  protected String engineHomeBucketDisplayName;
  @SerializedName("engine_home_bucket_name")
  protected String engineHomeBucketName;
  @SerializedName("engine_home_path")
  protected String engineHomePath;
  @SerializedName("engine_home_volume_id")
  protected String engineHomeVolumeId;
  @SerializedName("engine_home_volume_name")
  protected String engineHomeVolumeName;
  @SerializedName("engine_home_volume_storage_class")
  protected String engineHomeVolumeStorageClass;
  @SerializedName("engine_home_volume_storage_size")
  protected String engineHomeVolumeStorageSize;
  @SerializedName("engine_sub_type")
  protected String engineSubType;
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
    private SparkDefaultConfig defaultConfig;
    private String defaultVersion;
    private String engineHomeBucketDisplayName;
    private String engineHomeBucketName;
    private String engineHomePath;
    private String engineHomeVolumeId;
    private String engineHomeVolumeName;
    private String engineHomeVolumeStorageClass;
    private String engineHomeVolumeStorageSize;
    private String engineSubType;
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
      this.engineHomeBucketDisplayName = sparkEngineDetailsPrototype.engineHomeBucketDisplayName;
      this.engineHomeBucketName = sparkEngineDetailsPrototype.engineHomeBucketName;
      this.engineHomePath = sparkEngineDetailsPrototype.engineHomePath;
      this.engineHomeVolumeId = sparkEngineDetailsPrototype.engineHomeVolumeId;
      this.engineHomeVolumeName = sparkEngineDetailsPrototype.engineHomeVolumeName;
      this.engineHomeVolumeStorageClass = sparkEngineDetailsPrototype.engineHomeVolumeStorageClass;
      this.engineHomeVolumeStorageSize = sparkEngineDetailsPrototype.engineHomeVolumeStorageSize;
      this.engineSubType = sparkEngineDetailsPrototype.engineSubType;
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
    public Builder defaultConfig(SparkDefaultConfig defaultConfig) {
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
     * Set the engineHomeBucketDisplayName.
     *
     * @param engineHomeBucketDisplayName the engineHomeBucketDisplayName
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomeBucketDisplayName(String engineHomeBucketDisplayName) {
      this.engineHomeBucketDisplayName = engineHomeBucketDisplayName;
      return this;
    }

    /**
     * Set the engineHomeBucketName.
     *
     * @param engineHomeBucketName the engineHomeBucketName
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomeBucketName(String engineHomeBucketName) {
      this.engineHomeBucketName = engineHomeBucketName;
      return this;
    }

    /**
     * Set the engineHomePath.
     *
     * @param engineHomePath the engineHomePath
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomePath(String engineHomePath) {
      this.engineHomePath = engineHomePath;
      return this;
    }

    /**
     * Set the engineHomeVolumeId.
     *
     * @param engineHomeVolumeId the engineHomeVolumeId
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomeVolumeId(String engineHomeVolumeId) {
      this.engineHomeVolumeId = engineHomeVolumeId;
      return this;
    }

    /**
     * Set the engineHomeVolumeName.
     *
     * @param engineHomeVolumeName the engineHomeVolumeName
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomeVolumeName(String engineHomeVolumeName) {
      this.engineHomeVolumeName = engineHomeVolumeName;
      return this;
    }

    /**
     * Set the engineHomeVolumeStorageClass.
     *
     * @param engineHomeVolumeStorageClass the engineHomeVolumeStorageClass
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomeVolumeStorageClass(String engineHomeVolumeStorageClass) {
      this.engineHomeVolumeStorageClass = engineHomeVolumeStorageClass;
      return this;
    }

    /**
     * Set the engineHomeVolumeStorageSize.
     *
     * @param engineHomeVolumeStorageSize the engineHomeVolumeStorageSize
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineHomeVolumeStorageSize(String engineHomeVolumeStorageSize) {
      this.engineHomeVolumeStorageSize = engineHomeVolumeStorageSize;
      return this;
    }

    /**
     * Set the engineSubType.
     *
     * @param engineSubType the engineSubType
     * @return the SparkEngineDetailsPrototype builder
     */
    public Builder engineSubType(String engineSubType) {
      this.engineSubType = engineSubType;
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
    engineHomeBucketDisplayName = builder.engineHomeBucketDisplayName;
    engineHomeBucketName = builder.engineHomeBucketName;
    engineHomePath = builder.engineHomePath;
    engineHomeVolumeId = builder.engineHomeVolumeId;
    engineHomeVolumeName = builder.engineHomeVolumeName;
    engineHomeVolumeStorageClass = builder.engineHomeVolumeStorageClass;
    engineHomeVolumeStorageSize = builder.engineHomeVolumeStorageSize;
    engineSubType = builder.engineSubType;
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
   * api key to work with the saas IAE instance.
   *
   * @return the apiKey
   */
  public String apiKey() {
    return apiKey;
  }

  /**
   * Gets the connectionString.
   *
   * External engine connection string.
   *
   * @return the connectionString
   */
  public String connectionString() {
    return connectionString;
  }

  /**
   * Gets the defaultConfig.
   *
   * Spark Default Config details.
   *
   * @return the defaultConfig
   */
  public SparkDefaultConfig defaultConfig() {
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
   * Gets the engineHomeBucketDisplayName.
   *
   * Default bucket name for spark.
   *
   * @return the engineHomeBucketDisplayName
   */
  public String engineHomeBucketDisplayName() {
    return engineHomeBucketDisplayName;
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
   * Gets the engineHomePath.
   *
   * Path for spark.
   *
   * @return the engineHomePath
   */
  public String engineHomePath() {
    return engineHomePath;
  }

  /**
   * Gets the engineHomeVolumeId.
   *
   * Default volume for spark.
   *
   * @return the engineHomeVolumeId
   */
  public String engineHomeVolumeId() {
    return engineHomeVolumeId;
  }

  /**
   * Gets the engineHomeVolumeName.
   *
   * Name of the volume.
   *
   * @return the engineHomeVolumeName
   */
  public String engineHomeVolumeName() {
    return engineHomeVolumeName;
  }

  /**
   * Gets the engineHomeVolumeStorageClass.
   *
   * Storage class of the volume.
   *
   * @return the engineHomeVolumeStorageClass
   */
  public String engineHomeVolumeStorageClass() {
    return engineHomeVolumeStorageClass;
  }

  /**
   * Gets the engineHomeVolumeStorageSize.
   *
   * Storage size of the volume.
   *
   * @return the engineHomeVolumeStorageSize
   */
  public String engineHomeVolumeStorageSize() {
    return engineHomeVolumeStorageSize;
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
   * Instance to access the instance.
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

