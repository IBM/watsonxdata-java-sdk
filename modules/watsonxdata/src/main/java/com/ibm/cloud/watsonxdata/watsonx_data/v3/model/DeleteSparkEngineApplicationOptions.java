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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteSparkEngineApplication options.
 */
public class DeleteSparkEngineApplicationOptions extends GenericModel {

  protected String engineId;
  protected String id;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String id;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteSparkEngineApplicationOptions instance.
     *
     * @param deleteSparkEngineApplicationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSparkEngineApplicationOptions deleteSparkEngineApplicationOptions) {
      this.engineId = deleteSparkEngineApplicationOptions.engineId;
      this.id = deleteSparkEngineApplicationOptions.id;
      this.authInstanceId = deleteSparkEngineApplicationOptions.authInstanceId;
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
     * @param id the id
     */
    public Builder(String engineId, String id) {
      this.engineId = engineId;
      this.id = id;
    }

    /**
     * Builds a DeleteSparkEngineApplicationOptions.
     *
     * @return the new DeleteSparkEngineApplicationOptions instance
     */
    public DeleteSparkEngineApplicationOptions build() {
      return new DeleteSparkEngineApplicationOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the DeleteSparkEngineApplicationOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSparkEngineApplicationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteSparkEngineApplicationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteSparkEngineApplicationOptions() { }

  protected DeleteSparkEngineApplicationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    engineId = builder.engineId;
    id = builder.id;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSparkEngineApplicationOptions builder
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
   * Gets the id.
   *
   * Application id.
   *
   * @return the id
   */
  public String id() {
    return id;
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

