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
 * Spark Engine Detail.
 */
public class IngestionEngine extends GenericModel {

  @SerializedName("engine_id")
  protected String engineId;
  protected String name;
  protected String endpoint;
  protected String origin;
  @SerializedName("execute_config")
  protected ExecuteConfig executeConfig;
  @SerializedName("bucket_details")
  protected BucketDetails bucketDetails;
  @SerializedName("log_path")
  protected String logPath;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String name;
    private String endpoint;
    private String origin;
    private ExecuteConfig executeConfig;
    private BucketDetails bucketDetails;
    private String logPath;

    /**
     * Instantiates a new Builder from an existing IngestionEngine instance.
     *
     * @param ingestionEngine the instance to initialize the Builder with
     */
    private Builder(IngestionEngine ingestionEngine) {
      this.engineId = ingestionEngine.engineId;
      this.name = ingestionEngine.name;
      this.endpoint = ingestionEngine.endpoint;
      this.origin = ingestionEngine.origin;
      this.executeConfig = ingestionEngine.executeConfig;
      this.bucketDetails = ingestionEngine.bucketDetails;
      this.logPath = ingestionEngine.logPath;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IngestionEngine.
     *
     * @return the new IngestionEngine instance
     */
    public IngestionEngine build() {
      return new IngestionEngine(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the IngestionEngine builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the IngestionEngine builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the IngestionEngine builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the origin.
     *
     * @param origin the origin
     * @return the IngestionEngine builder
     */
    public Builder origin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * Set the executeConfig.
     *
     * @param executeConfig the executeConfig
     * @return the IngestionEngine builder
     */
    public Builder executeConfig(ExecuteConfig executeConfig) {
      this.executeConfig = executeConfig;
      return this;
    }

    /**
     * Set the bucketDetails.
     *
     * @param bucketDetails the bucketDetails
     * @return the IngestionEngine builder
     */
    public Builder bucketDetails(BucketDetails bucketDetails) {
      this.bucketDetails = bucketDetails;
      return this;
    }

    /**
     * Set the logPath.
     *
     * @param logPath the logPath
     * @return the IngestionEngine builder
     */
    public Builder logPath(String logPath) {
      this.logPath = logPath;
      return this;
    }
  }

  protected IngestionEngine() { }

  protected IngestionEngine(Builder builder) {
    engineId = builder.engineId;
    name = builder.name;
    endpoint = builder.endpoint;
    origin = builder.origin;
    executeConfig = builder.executeConfig;
    bucketDetails = builder.bucketDetails;
    logPath = builder.logPath;
  }

  /**
   * New builder.
   *
   * @return a IngestionEngine builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine programmatic name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the name.
   *
   * Engine display name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the endpoint.
   *
   * Engine endpoint.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the origin.
   *
   * Origin - created or registered.
   *
   * @return the origin
   */
  public String origin() {
    return origin;
  }

  /**
   * Gets the executeConfig.
   *
   * Ingestion engine configuration.
   *
   * @return the executeConfig
   */
  public ExecuteConfig executeConfig() {
    return executeConfig;
  }

  /**
   * Gets the bucketDetails.
   *
   * Storage connection details.
   *
   * @return the bucketDetails
   */
  public BucketDetails bucketDetails() {
    return bucketDetails;
  }

  /**
   * Gets the logPath.
   *
   * Engine log path.
   *
   * @return the logPath
   */
  public String logPath() {
    return logPath;
  }
}

