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
 * The deleteSparkEngineApplications options.
 */
public class DeleteSparkEngineApplicationsOptions extends GenericModel {

  protected String engineId;
  protected String applicationId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String applicationId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteSparkEngineApplicationsOptions instance.
     *
     * @param deleteSparkEngineApplicationsOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSparkEngineApplicationsOptions deleteSparkEngineApplicationsOptions) {
      this.engineId = deleteSparkEngineApplicationsOptions.engineId;
      this.applicationId = deleteSparkEngineApplicationsOptions.applicationId;
      this.authInstanceId = deleteSparkEngineApplicationsOptions.authInstanceId;
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
     * @param applicationId the applicationId
     */
    public Builder(String engineId, String applicationId) {
      this.engineId = engineId;
      this.applicationId = applicationId;
    }

    /**
     * Builds a DeleteSparkEngineApplicationsOptions.
     *
     * @return the new DeleteSparkEngineApplicationsOptions instance
     */
    public DeleteSparkEngineApplicationsOptions build() {
      return new DeleteSparkEngineApplicationsOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the DeleteSparkEngineApplicationsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the applicationId.
     *
     * @param applicationId the applicationId
     * @return the DeleteSparkEngineApplicationsOptions builder
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteSparkEngineApplicationsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteSparkEngineApplicationsOptions() { }

  protected DeleteSparkEngineApplicationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.applicationId,
      "applicationId cannot be null");
    engineId = builder.engineId;
    applicationId = builder.applicationId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSparkEngineApplicationsOptions builder
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
   * Gets the applicationId.
   *
   * Application id(s) to be stopped, comma separated.
   *
   * @return the applicationId
   */
  public String applicationId() {
    return applicationId;
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

