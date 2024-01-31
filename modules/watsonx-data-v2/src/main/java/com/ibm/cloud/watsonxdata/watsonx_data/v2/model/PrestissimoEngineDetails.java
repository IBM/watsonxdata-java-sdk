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
 * External engine details.
 */
public class PrestissimoEngineDetails extends GenericModel {

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
  protected PrestissimoNodeDescriptionBody coordinator;
  protected PrestissimoEndpoints endpoints;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("metastore_host")
  protected String metastoreHost;
  @SerializedName("size_config")
  protected String sizeConfig;
  protected PrestissimoNodeDescriptionBody worker;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String connectionString;
    private PrestissimoNodeDescriptionBody coordinator;
    private PrestissimoEndpoints endpoints;
    private String instanceId;
    private String managedBy;
    private String metastoreHost;
    private String sizeConfig;
    private PrestissimoNodeDescriptionBody worker;

    /**
     * Instantiates a new Builder from an existing PrestissimoEngineDetails instance.
     *
     * @param prestissimoEngineDetails the instance to initialize the Builder with
     */
    private Builder(PrestissimoEngineDetails prestissimoEngineDetails) {
      this.apiKey = prestissimoEngineDetails.apiKey;
      this.connectionString = prestissimoEngineDetails.connectionString;
      this.coordinator = prestissimoEngineDetails.coordinator;
      this.endpoints = prestissimoEngineDetails.endpoints;
      this.instanceId = prestissimoEngineDetails.instanceId;
      this.managedBy = prestissimoEngineDetails.managedBy;
      this.metastoreHost = prestissimoEngineDetails.metastoreHost;
      this.sizeConfig = prestissimoEngineDetails.sizeConfig;
      this.worker = prestissimoEngineDetails.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEngineDetails.
     *
     * @return the new PrestissimoEngineDetails instance
     */
    public PrestissimoEngineDetails build() {
      return new PrestissimoEngineDetails(this);
    }

    /**
     * Set the apiKey.
     *
     * @param apiKey the apiKey
     * @return the PrestissimoEngineDetails builder
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the PrestissimoEngineDetails builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the PrestissimoEngineDetails builder
     */
    public Builder coordinator(PrestissimoNodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the endpoints.
     *
     * @param endpoints the endpoints
     * @return the PrestissimoEngineDetails builder
     */
    public Builder endpoints(PrestissimoEndpoints endpoints) {
      this.endpoints = endpoints;
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the PrestissimoEngineDetails builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the PrestissimoEngineDetails builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the metastoreHost.
     *
     * @param metastoreHost the metastoreHost
     * @return the PrestissimoEngineDetails builder
     */
    public Builder metastoreHost(String metastoreHost) {
      this.metastoreHost = metastoreHost;
      return this;
    }

    /**
     * Set the sizeConfig.
     *
     * @param sizeConfig the sizeConfig
     * @return the PrestissimoEngineDetails builder
     */
    public Builder sizeConfig(String sizeConfig) {
      this.sizeConfig = sizeConfig;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the PrestissimoEngineDetails builder
     */
    public Builder worker(PrestissimoNodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }
  }

  protected PrestissimoEngineDetails() { }

  protected PrestissimoEngineDetails(Builder builder) {
    apiKey = builder.apiKey;
    connectionString = builder.connectionString;
    coordinator = builder.coordinator;
    endpoints = builder.endpoints;
    instanceId = builder.instanceId;
    managedBy = builder.managedBy;
    metastoreHost = builder.metastoreHost;
    sizeConfig = builder.sizeConfig;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEngineDetails builder
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
   * Node details.
   *
   * @return the coordinator
   */
  public PrestissimoNodeDescriptionBody coordinator() {
    return coordinator;
  }

  /**
   * Gets the endpoints.
   *
   * Endpoints.
   *
   * @return the endpoints
   */
  public PrestissimoEndpoints endpoints() {
    return endpoints;
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
   * Gets the metastoreHost.
   *
   * Metastore host.
   *
   * @return the metastoreHost
   */
  public String metastoreHost() {
    return metastoreHost;
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
   * Node details.
   *
   * @return the worker
   */
  public PrestissimoNodeDescriptionBody worker() {
    return worker;
  }
}

