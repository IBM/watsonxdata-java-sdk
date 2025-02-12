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
 * External engine details.
 */
public class SparkEngineDetails extends GenericModel {

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("default_config")
  protected SparkDefaultConfig defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  protected SparkEndpoints endpoints;
  @SerializedName("engine_home_bucket_display_name")
  protected String engineHomeBucketDisplayName;
  @SerializedName("engine_home_bucket_name")
  protected String engineHomeBucketName;
  @SerializedName("engine_home_path")
  protected String engineHomePath;
  @SerializedName("engine_home_volume")
  protected String engineHomeVolume;
  @SerializedName("engine_home_volume_id")
  protected String engineHomeVolumeId;
  @SerializedName("engine_home_volume_name")
  protected String engineHomeVolumeName;
  @SerializedName("engine_home_volume_storage_class")
  protected String engineHomeVolumeStorageClass;
  @SerializedName("engine_home_volume_storage_size")
  protected String engineHomeVolumeStorageSize;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("engine_sub_type")
  protected String engineSubType;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("scale_config")
  protected SparkScaleConfig scaleConfig;

  protected SparkEngineDetails() { }

  /**
   * Gets the apiKey.
   *
   * api key to work with the saas IAE instance.
   *
   * @return the apiKey
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Gets the connectionString.
   *
   * External engine connection string.
   *
   * @return the connectionString
   */
  public String getConnectionString() {
    return connectionString;
  }

  /**
   * Gets the defaultConfig.
   *
   * Spark Default Config details.
   *
   * @return the defaultConfig
   */
  public SparkDefaultConfig getDefaultConfig() {
    return defaultConfig;
  }

  /**
   * Gets the defaultVersion.
   *
   * The default spark version for the native engine.
   *
   * @return the defaultVersion
   */
  public String getDefaultVersion() {
    return defaultVersion;
  }

  /**
   * Gets the endpoints.
   *
   * Application Endpoints.
   *
   * @return the endpoints
   */
  public SparkEndpoints getEndpoints() {
    return endpoints;
  }

  /**
   * Gets the engineHomeBucketDisplayName.
   *
   * Default bucket for spark.
   *
   * @return the engineHomeBucketDisplayName
   */
  public String getEngineHomeBucketDisplayName() {
    return engineHomeBucketDisplayName;
  }

  /**
   * Gets the engineHomeBucketName.
   *
   * Default bucket for spark.
   *
   * @return the engineHomeBucketName
   */
  public String getEngineHomeBucketName() {
    return engineHomeBucketName;
  }

  /**
   * Gets the engineHomePath.
   *
   * Path for spark.
   *
   * @return the engineHomePath
   */
  public String getEngineHomePath() {
    return engineHomePath;
  }

  /**
   * Gets the engineHomeVolume.
   *
   * Default volume for spark.
   *
   * @return the engineHomeVolume
   */
  public String getEngineHomeVolume() {
    return engineHomeVolume;
  }

  /**
   * Gets the engineHomeVolumeId.
   *
   * Default volume for spark.
   *
   * @return the engineHomeVolumeId
   */
  public String getEngineHomeVolumeId() {
    return engineHomeVolumeId;
  }

  /**
   * Gets the engineHomeVolumeName.
   *
   * Name of the volume.
   *
   * @return the engineHomeVolumeName
   */
  public String getEngineHomeVolumeName() {
    return engineHomeVolumeName;
  }

  /**
   * Gets the engineHomeVolumeStorageClass.
   *
   * Storage class of the volume.
   *
   * @return the engineHomeVolumeStorageClass
   */
  public String getEngineHomeVolumeStorageClass() {
    return engineHomeVolumeStorageClass;
  }

  /**
   * Gets the engineHomeVolumeStorageSize.
   *
   * Storage size of the volume.
   *
   * @return the engineHomeVolumeStorageSize
   */
  public String getEngineHomeVolumeStorageSize() {
    return engineHomeVolumeStorageSize;
  }

  /**
   * Gets the instanceId.
   *
   * Instance to access the instance.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the engineSubType.
   *
   * spark engine sub type.
   *
   * @return the engineSubType
   */
  public String getEngineSubType() {
    return engineSubType;
  }

  /**
   * Gets the managedBy.
   *
   * How is the spark instance managed.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return managedBy;
  }

  /**
   * Gets the scaleConfig.
   *
   * Spark instance scale configuration.
   *
   * @return the scaleConfig
   */
  public SparkScaleConfig getScaleConfig() {
    return scaleConfig;
  }
}

