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
 * Node details.
 */
public class EngineDetailsBody extends GenericModel {

  /**
   * Size config.
   */
  public interface SizeConfig {
    /** starter. */
    String STARTER = "starter";
    /** cache_optimized. */
    String CACHE_OPTIMIZED = "cache_optimized";
    /** compute_optimized. */
    String COMPUTE_OPTIMIZED = "compute_optimized";
    /** small. */
    String SMALL = "small";
    /** medium. */
    String MEDIUM = "medium";
    /** large. */
    String LARGE = "large";
    /** custom. */
    String CUSTOM = "custom";
  }

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("connection_string")
  protected String connectionString;
  protected NodeDescriptionBody coordinator;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("size_config")
  protected String sizeConfig;
  protected NodeDescriptionBody worker;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String connectionString;
    private NodeDescriptionBody coordinator;
    private String instanceId;
    private String managedBy;
    private String sizeConfig;
    private NodeDescriptionBody worker;

    /**
     * Instantiates a new Builder from an existing EngineDetailsBody instance.
     *
     * @param engineDetailsBody the instance to initialize the Builder with
     */
    private Builder(EngineDetailsBody engineDetailsBody) {
      this.apiKey = engineDetailsBody.apiKey;
      this.connectionString = engineDetailsBody.connectionString;
      this.coordinator = engineDetailsBody.coordinator;
      this.instanceId = engineDetailsBody.instanceId;
      this.managedBy = engineDetailsBody.managedBy;
      this.sizeConfig = engineDetailsBody.sizeConfig;
      this.worker = engineDetailsBody.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EngineDetailsBody.
     *
     * @return the new EngineDetailsBody instance
     */
    public EngineDetailsBody build() {
      return new EngineDetailsBody(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the EngineDetailsBody builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the EngineDetailsBody builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EngineDetailsBody builder
     */
    public Builder coordinator(NodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the EngineDetailsBody builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the EngineDetailsBody builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the sizeConfig.
     *
     * @param sizeConfig the sizeConfig
     * @return the EngineDetailsBody builder
     */
    public Builder sizeConfig(String sizeConfig) {
      this.sizeConfig = sizeConfig;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EngineDetailsBody builder
     */
    public Builder worker(NodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EngineDetailsBody() { }

  protected EngineDetailsBody(Builder builder) {
    apiKey = builder.apiKey;
    connectionString = builder.connectionString;
    coordinator = builder.coordinator;
    instanceId = builder.instanceId;
    managedBy = builder.managedBy;
    sizeConfig = builder.sizeConfig;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EngineDetailsBody builder
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
   * Gets the coordinator.
   *
   * Coordinator/ worker properties.
   *
   * @return the coordinator
   */
  public NodeDescriptionBody coordinator() {
    return coordinator;
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
   * Gets the sizeConfig.
   *
   * Size config.
   *
   * @return the sizeConfig
   */
  public String sizeConfig() {
    return sizeConfig;
  }

  /**
   * Gets the worker.
   *
   * Coordinator/ worker properties.
   *
   * @return the worker
   */
  public NodeDescriptionBody worker() {
    return worker;
  }
}

