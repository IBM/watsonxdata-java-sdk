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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSparkEngineQueryServer options.
 */
public class CreateSparkEngineQueryServerOptions extends GenericModel {

  protected String id;
  protected SparkEngineQueryServerDetailsPrototypes queryServerDetails;
  protected List<SparkVolumeDetails> volumes;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private SparkEngineQueryServerDetailsPrototypes queryServerDetails;
    private List<SparkVolumeDetails> volumes;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSparkEngineQueryServerOptions instance.
     *
     * @param createSparkEngineQueryServerOptions the instance to initialize the Builder with
     */
    private Builder(CreateSparkEngineQueryServerOptions createSparkEngineQueryServerOptions) {
      this.id = createSparkEngineQueryServerOptions.id;
      this.queryServerDetails = createSparkEngineQueryServerOptions.queryServerDetails;
      this.volumes = createSparkEngineQueryServerOptions.volumes;
      this.authInstanceId = createSparkEngineQueryServerOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a CreateSparkEngineQueryServerOptions.
     *
     * @return the new CreateSparkEngineQueryServerOptions instance
     */
    public CreateSparkEngineQueryServerOptions build() {
      return new CreateSparkEngineQueryServerOptions(this);
    }

    /**
     * Adds a new element to volumes.
     *
     * @param volumes the new element to be added
     * @return the CreateSparkEngineQueryServerOptions builder
     */
    public Builder addVolumes(SparkVolumeDetails volumes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(volumes,
        "volumes cannot be null");
      if (this.volumes == null) {
        this.volumes = new ArrayList<SparkVolumeDetails>();
      }
      this.volumes.add(volumes);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateSparkEngineQueryServerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the queryServerDetails.
     *
     * @param queryServerDetails the queryServerDetails
     * @return the CreateSparkEngineQueryServerOptions builder
     */
    public Builder queryServerDetails(SparkEngineQueryServerDetailsPrototypes queryServerDetails) {
      this.queryServerDetails = queryServerDetails;
      return this;
    }

    /**
     * Set the volumes.
     * Existing volumes will be replaced.
     *
     * @param volumes the volumes
     * @return the CreateSparkEngineQueryServerOptions builder
     */
    public Builder volumes(List<SparkVolumeDetails> volumes) {
      this.volumes = volumes;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSparkEngineQueryServerOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSparkEngineQueryServerOptions() { }

  protected CreateSparkEngineQueryServerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    queryServerDetails = builder.queryServerDetails;
    volumes = builder.volumes;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSparkEngineQueryServerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the queryServerDetails.
   *
   * Spark Query Server details prototype.
   *
   * @return the queryServerDetails
   */
  public SparkEngineQueryServerDetailsPrototypes queryServerDetails() {
    return queryServerDetails;
  }

  /**
   * Gets the volumes.
   *
   * Spark Query Server volumes to mount.
   *
   * @return the volumes
   */
  public List<SparkVolumeDetails> volumes() {
    return volumes;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

