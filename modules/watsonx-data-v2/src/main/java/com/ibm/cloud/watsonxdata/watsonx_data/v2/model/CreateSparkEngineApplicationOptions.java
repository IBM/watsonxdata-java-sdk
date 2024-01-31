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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSparkEngineApplication options.
 */
public class CreateSparkEngineApplicationOptions extends GenericModel {

  /**
   * Engine Type.
   */
  public interface Type {
    /** iae. */
    String IAE = "iae";
    /** emr. */
    String EMR = "emr";
  }

  protected String engineId;
  protected SparkApplicationDetails applicationDetails;
  protected String jobEndpoint;
  protected String serviceInstanceId;
  protected String type;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private SparkApplicationDetails applicationDetails;
    private String jobEndpoint;
    private String serviceInstanceId;
    private String type;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSparkEngineApplicationOptions instance.
     *
     * @param createSparkEngineApplicationOptions the instance to initialize the Builder with
     */
    private Builder(CreateSparkEngineApplicationOptions createSparkEngineApplicationOptions) {
      this.engineId = createSparkEngineApplicationOptions.engineId;
      this.applicationDetails = createSparkEngineApplicationOptions.applicationDetails;
      this.jobEndpoint = createSparkEngineApplicationOptions.jobEndpoint;
      this.serviceInstanceId = createSparkEngineApplicationOptions.serviceInstanceId;
      this.type = createSparkEngineApplicationOptions.type;
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
     * @param engineId the engineId
     * @param applicationDetails the applicationDetails
     */
    public Builder(String engineId, SparkApplicationDetails applicationDetails) {
      this.engineId = engineId;
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
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateSparkEngineApplicationOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
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
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.applicationDetails,
      "applicationDetails cannot be null");
    engineId = builder.engineId;
    applicationDetails = builder.applicationDetails;
    jobEndpoint = builder.jobEndpoint;
    serviceInstanceId = builder.serviceInstanceId;
    type = builder.type;
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
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

