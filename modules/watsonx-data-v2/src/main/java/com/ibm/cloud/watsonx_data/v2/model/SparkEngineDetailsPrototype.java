/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

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
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("managed_by")
  protected String managedBy;

  /**
   * Builder.
   */
  public static class Builder {
    private String apiKey;
    private String connectionString;
    private String instanceId;
    private String managedBy;

    /**
     * Instantiates a new Builder from an existing SparkEngineDetailsPrototype instance.
     *
     * @param sparkEngineDetailsPrototype the instance to initialize the Builder with
     */
    private Builder(SparkEngineDetailsPrototype sparkEngineDetailsPrototype) {
      this.apiKey = sparkEngineDetailsPrototype.apiKey;
      this.connectionString = sparkEngineDetailsPrototype.connectionString;
      this.instanceId = sparkEngineDetailsPrototype.instanceId;
      this.managedBy = sparkEngineDetailsPrototype.managedBy;
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
  }

  protected SparkEngineDetailsPrototype() { }

  protected SparkEngineDetailsPrototype(Builder builder) {
    apiKey = builder.apiKey;
    connectionString = builder.connectionString;
    instanceId = builder.instanceId;
    managedBy = builder.managedBy;
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
}

