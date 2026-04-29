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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSparkEngineApplication options.
 */
public class CreateSparkEngineApplicationOptions extends GenericModel {

  /**
   * type of context for the spark application.
   */
  public interface ContextType {
    /** project. */
    String PROJECT = "project";
    /** git_project. */
    String GIT_PROJECT = "git_project";
    /** space. */
    String SPACE = "space";
  }

  /**
   * Service Instance ID for POST.
   */
  public interface ServiceInstanceId {
    /** iae. */
    String IAE = "iae";
    /** emr. */
    String EMR = "emr";
  }

  /**
   * Engine Type.
   */
  public interface Type {
    /** spark. */
    String SPARK = "spark";
    /** gluten. */
    String GLUTEN = "gluten";
  }

  protected String id;
  protected SparkApplicationDetails applicationDetails;
  protected SparkEngineApplicationCallback callback;
  protected String contextId;
  protected String contextType;
  protected String deployMode;
  protected String idempotencyKey;
  protected List<String> initScripts;
  protected String jobEndpoint;
  protected String maxRetries;
  protected String minRetryIntervalInSeconds;
  protected String serviceInstanceId;
  protected String timeoutInSeconds;
  protected String type;
  protected List<SparkVolumeDetails> volumes;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private SparkApplicationDetails applicationDetails;
    private SparkEngineApplicationCallback callback;
    private String contextId;
    private String contextType;
    private String deployMode;
    private String idempotencyKey;
    private List<String> initScripts;
    private String jobEndpoint;
    private String maxRetries;
    private String minRetryIntervalInSeconds;
    private String serviceInstanceId;
    private String timeoutInSeconds;
    private String type;
    private List<SparkVolumeDetails> volumes;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSparkEngineApplicationOptions instance.
     *
     * @param createSparkEngineApplicationOptions the instance to initialize the Builder with
     */
    private Builder(CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions) {
      this.id = createSparkEngineApplicationOptions.id;
      this.applicationDetails = createSparkEngineApplicationOptions.applicationDetails;
      this.callback = createSparkEngineApplicationOptions.callback;
      this.contextId = createSparkEngineApplicationOptions.contextId;
      this.contextType = createSparkEngineApplicationOptions.contextType;
      this.deployMode = createSparkEngineApplicationOptions.deployMode;
      this.idempotencyKey = createSparkEngineApplicationOptions.idempotencyKey;
      this.initScripts = createSparkEngineApplicationOptions.initScripts;
      this.jobEndpoint = createSparkEngineApplicationOptions.jobEndpoint;
      this.maxRetries = createSparkEngineApplicationOptions.maxRetries;
      this.minRetryIntervalInSeconds = createSparkEngineApplicationOptions.minRetryIntervalInSeconds;
      this.serviceInstanceId = createSparkEngineApplicationOptions.serviceInstanceId;
      this.timeoutInSeconds = createSparkEngineApplicationOptions.timeoutInSeconds;
      this.type = createSparkEngineApplicationOptions.type;
      this.volumes = createSparkEngineApplicationOptions.volumes;
      this.authInstanceId = createSparkEngineApplicationOptions.authInstanceId;
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
     * @param applicationDetails the applicationDetails
     */
    public Builder(String id, SparkApplicationDetails applicationDetails) {
      this.id = id;
      this.applicationDetails = applicationDetails;
    }

    /**
     * Builds a CreateSparkEngineApplicationOptions.
     *
     * @return the new CreateSparkEngineApplicationOptions instance
     */
    public CreateSparkEngineApplicationOptions build() {
      return new CreateSparkEngineApplicationOptions(this);
    }

    /**
     * Adds a new element to initScripts.
     *
     * @param initScripts the new element to be added
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder addInitScripts(String initScripts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(initScripts,
        "initScripts cannot be null");
      if (this.initScripts == null) {
        this.initScripts = new ArrayList<String>();
      }
      this.initScripts.add(initScripts);
      return this;
    }

    /**
     * Adds a new element to volumes.
     *
     * @param volumes the new element to be added
     * @return the CreateSparkEngineApplicationOptions builder
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
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the applicationDetails.
     *
     * @param applicationDetails the applicationDetails
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder applicationDetails(SparkApplicationDetails applicationDetails) {
      this.applicationDetails = applicationDetails;
      return this;
    }

    /**
     * Set the callback.
     *
     * @param callback the callback
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder callback(SparkEngineApplicationCallback callback) {
      this.callback = callback;
      return this;
    }

    /**
     * Set the contextId.
     *
     * @param contextId the contextId
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder contextId(String contextId) {
      this.contextId = contextId;
      return this;
    }

    /**
     * Set the contextType.
     *
     * @param contextType the contextType
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder contextType(String contextType) {
      this.contextType = contextType;
      return this;
    }

    /**
     * Set the deployMode.
     *
     * @param deployMode the deployMode
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder deployMode(String deployMode) {
      this.deployMode = deployMode;
      return this;
    }

    /**
     * Set the idempotencyKey.
     *
     * @param idempotencyKey the idempotencyKey
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    /**
     * Set the initScripts.
     * Existing initScripts will be replaced.
     *
     * @param initScripts the initScripts
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder initScripts(List<String> initScripts) {
      this.initScripts = initScripts;
      return this;
    }

    /**
     * Set the jobEndpoint.
     *
     * @param jobEndpoint the jobEndpoint
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder jobEndpoint(String jobEndpoint) {
      this.jobEndpoint = jobEndpoint;
      return this;
    }

    /**
     * Set the maxRetries.
     *
     * @param maxRetries the maxRetries
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder maxRetries(String maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }

    /**
     * Set the minRetryIntervalInSeconds.
     *
     * @param minRetryIntervalInSeconds the minRetryIntervalInSeconds
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder minRetryIntervalInSeconds(String minRetryIntervalInSeconds) {
      this.minRetryIntervalInSeconds = minRetryIntervalInSeconds;
      return this;
    }

    /**
     * Set the serviceInstanceId.
     *
     * @param serviceInstanceId the serviceInstanceId
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder serviceInstanceId(String serviceInstanceId) {
      this.serviceInstanceId = serviceInstanceId;
      return this;
    }

    /**
     * Set the timeoutInSeconds.
     *
     * @param timeoutInSeconds the timeoutInSeconds
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder timeoutInSeconds(String timeoutInSeconds) {
      this.timeoutInSeconds = timeoutInSeconds;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the volumes.
     * Existing volumes will be replaced.
     *
     * @param volumes the volumes
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder volumes(List<SparkVolumeDetails> volumes) {
      this.volumes = volumes;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSparkEngineApplicationOptions() { }

  protected CreateSparkEngineApplicationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.applicationDetails,
      "applicationDetails cannot be null");
    id = builder.id;
    applicationDetails = builder.applicationDetails;
    callback = builder.callback;
    contextId = builder.contextId;
    contextType = builder.contextType;
    deployMode = builder.deployMode;
    idempotencyKey = builder.idempotencyKey;
    initScripts = builder.initScripts;
    jobEndpoint = builder.jobEndpoint;
    maxRetries = builder.maxRetries;
    minRetryIntervalInSeconds = builder.minRetryIntervalInSeconds;
    serviceInstanceId = builder.serviceInstanceId;
    timeoutInSeconds = builder.timeoutInSeconds;
    type = builder.type;
    volumes = builder.volumes;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSparkEngineApplicationOptions builder
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
   * Gets the applicationDetails.
   *
   * Application details.
   *
   * @return the applicationDetails
   */
  public SparkApplicationDetails applicationDetails() {
    return applicationDetails;
  }

  /**
   * Gets the callback.
   *
   * Spark Engine Application Callback.
   *
   * @return the callback
   */
  public SparkEngineApplicationCallback callback() {
    return callback;
  }

  /**
   * Gets the contextId.
   *
   * GUID.
   *
   * @return the contextId
   */
  public String contextId() {
    return contextId;
  }

  /**
   * Gets the contextType.
   *
   * type of context for the spark application.
   *
   * @return the contextType
   */
  public String contextType() {
    return contextType;
  }

  /**
   * Gets the deployMode.
   *
   * mode.
   *
   * @return the deployMode
   */
  public String deployMode() {
    return deployMode;
  }

  /**
   * Gets the idempotencyKey.
   *
   * Unique key to ensure idempotent operation.
   *
   * @return the idempotencyKey
   */
  public String idempotencyKey() {
    return idempotencyKey;
  }

  /**
   * Gets the initScripts.
   *
   * Initialization scripts to run before the application starts.
   *
   * @return the initScripts
   */
  public List<String> initScripts() {
    return initScripts;
  }

  /**
   * Gets the jobEndpoint.
   *
   * Job endpoint.
   *
   * @return the jobEndpoint
   */
  public String jobEndpoint() {
    return jobEndpoint;
  }

  /**
   * Gets the maxRetries.
   *
   * Maximum number of retries for the application. Supported only in watsonx.data software.
   *
   * @return the maxRetries
   */
  public String maxRetries() {
    return maxRetries;
  }

  /**
   * Gets the minRetryIntervalInSeconds.
   *
   * Minimum retry interval in seconds between retry attempts. Supported only in watsonx.data software.
   *
   * @return the minRetryIntervalInSeconds
   */
  public String minRetryIntervalInSeconds() {
    return minRetryIntervalInSeconds;
  }

  /**
   * Gets the serviceInstanceId.
   *
   * Service Instance ID for POST.
   *
   * @return the serviceInstanceId
   */
  public String serviceInstanceId() {
    return serviceInstanceId;
  }

  /**
   * Gets the timeoutInSeconds.
   *
   * Timeout for the application in seconds.
   *
   * @return the timeoutInSeconds
   */
  public String timeoutInSeconds() {
    return timeoutInSeconds;
  }

  /**
   * Gets the type.
   *
   * Engine Type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the volumes.
   *
   * Spark application volumes to mount. This property is applicable only in watsonx.data software.
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

