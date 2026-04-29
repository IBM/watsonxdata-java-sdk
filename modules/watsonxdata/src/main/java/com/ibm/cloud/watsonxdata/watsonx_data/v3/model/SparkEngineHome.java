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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine home properties for Spark engine configuration.
 */
public class SparkEngineHome extends GenericModel {

  protected String path;
  @SerializedName("storage_name")
  protected String storageName;
  protected String volume;
  @SerializedName("volume_id")
  protected String volumeId;
  @SerializedName("volume_name")
  protected String volumeName;

  /**
   * Builder.
   */
  public static class Builder {
    private String path;
    private String storageName;
    private String volume;
    private String volumeId;
    private String volumeName;

    /**
     * Instantiates a new Builder from an existing SparkEngineHome instance.
     *
     * @param sparkEngineHome the instance to initialize the Builder with
     */
    private Builder(SparkEngineHome sparkEngineHome) {
      this.path = sparkEngineHome.path;
      this.storageName = sparkEngineHome.storageName;
      this.volume = sparkEngineHome.volume;
      this.volumeId = sparkEngineHome.volumeId;
      this.volumeName = sparkEngineHome.volumeName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineHome.
     *
     * @return the new SparkEngineHome instance
     */
    public SparkEngineHome build() {
      return new SparkEngineHome(this);
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the SparkEngineHome builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the storageName.
     *
     * @param storageName the storageName
     * @return the SparkEngineHome builder
     */
    public Builder storageName(String storageName) {
      this.storageName = storageName;
      return this;
    }

    /**
     * Set the volume.
     *
     * @param volume the volume
     * @return the SparkEngineHome builder
     */
    public Builder volume(String volume) {
      this.volume = volume;
      return this;
    }

    /**
     * Set the volumeId.
     *
     * @param volumeId the volumeId
     * @return the SparkEngineHome builder
     */
    public Builder volumeId(String volumeId) {
      this.volumeId = volumeId;
      return this;
    }

    /**
     * Set the volumeName.
     *
     * @param volumeName the volumeName
     * @return the SparkEngineHome builder
     */
    public Builder volumeName(String volumeName) {
      this.volumeName = volumeName;
      return this;
    }
  }

  protected SparkEngineHome() { }

  protected SparkEngineHome(Builder builder) {
    path = builder.path;
    storageName = builder.storageName;
    volume = builder.volume;
    volumeId = builder.volumeId;
    volumeName = builder.volumeName;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineHome builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the path.
   *
   * Path in specified storage where engine home data will be stored. This is relevant for SAAS.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the storageName.
   *
   * Name of the registered object storage instance to be used as Spark engine home. This is available only in SAAS.
   *
   * @return the storageName
   */
  public String storageName() {
    return storageName;
  }

  /**
   * Gets the volume.
   *
   * Qualified name of the persistent volume to be used as Spark engine home. This is available only in CPD.
   *
   * @return the volume
   */
  public String volume() {
    return volume;
  }

  /**
   * Gets the volumeId.
   *
   * ID of the persistent volume to be used as Spark engine home. This is available only in CPD. To be specified when
   * creating a new Spark engine with existing volume.
   *
   * @return the volumeId
   */
  public String volumeId() {
    return volumeId;
  }

  /**
   * Gets the volumeName.
   *
   * Name of the persistent volume to be created. This is available only in CPD. To be specified when creating a new
   * Spark engine along with a new volume.
   *
   * @return the volumeName
   */
  public String volumeName() {
    return volumeName;
  }
}

