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
 * Spark application volume.
 */
public class SparkVolumeDetails extends GenericModel {

  @SerializedName("mount_path")
  protected String mountPath;
  protected String name;
  @SerializedName("read_only")
  protected Boolean readOnly;
  @SerializedName("source_sub_path")
  protected String sourceSubPath;

  /**
   * Builder.
   */
  public static class Builder {
    private String mountPath;
    private String name;
    private Boolean readOnly;
    private String sourceSubPath;

    /**
     * Instantiates a new Builder from an existing SparkVolumeDetails instance.
     *
     * @param sparkVolumeDetails the instance to initialize the Builder with
     */
    private Builder(SparkVolumeDetails sparkVolumeDetails) {
      this.mountPath = sparkVolumeDetails.mountPath;
      this.name = sparkVolumeDetails.name;
      this.readOnly = sparkVolumeDetails.readOnly;
      this.sourceSubPath = sparkVolumeDetails.sourceSubPath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkVolumeDetails.
     *
     * @return the new SparkVolumeDetails instance
     */
    public SparkVolumeDetails build() {
      return new SparkVolumeDetails(this);
    }

    /**
     * Set the mountPath.
     *
     * @param mountPath the mountPath
     * @return the SparkVolumeDetails builder
     */
    public Builder mountPath(String mountPath) {
      this.mountPath = mountPath;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SparkVolumeDetails builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the readOnly.
     *
     * @param readOnly the readOnly
     * @return the SparkVolumeDetails builder
     */
    public Builder readOnly(Boolean readOnly) {
      this.readOnly = readOnly;
      return this;
    }

    /**
     * Set the sourceSubPath.
     *
     * @param sourceSubPath the sourceSubPath
     * @return the SparkVolumeDetails builder
     */
    public Builder sourceSubPath(String sourceSubPath) {
      this.sourceSubPath = sourceSubPath;
      return this;
    }
  }

  protected SparkVolumeDetails() { }

  protected SparkVolumeDetails(Builder builder) {
    mountPath = builder.mountPath;
    name = builder.name;
    readOnly = builder.readOnly;
    sourceSubPath = builder.sourceSubPath;
  }

  /**
   * New builder.
   *
   * @return a SparkVolumeDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mountPath.
   *
   * Path in the spark cluster for the mounted volume.
   *
   * @return the mountPath
   */
  public String mountPath() {
    return mountPath;
  }

  /**
   * Gets the name.
   *
   * volume name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the readOnly.
   *
   * Read only flag.
   *
   * @return the readOnly
   */
  public Boolean readOnly() {
    return readOnly;
  }

  /**
   * Gets the sourceSubPath.
   *
   * Path in the volume to be mounted.
   *
   * @return the sourceSubPath
   */
  public String sourceSubPath() {
    return sourceSubPath;
  }
}

