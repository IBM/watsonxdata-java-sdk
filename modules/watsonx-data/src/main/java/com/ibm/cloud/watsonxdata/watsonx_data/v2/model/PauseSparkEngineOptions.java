/*
 * (C) Copyright IBM Corp. 2025.
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
 * The pauseSparkEngine options.
 */
public class PauseSparkEngineOptions extends GenericModel {

  protected String engineId;
  protected Boolean force;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private Boolean force;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing PauseSparkEngineOptions instance.
     *
     * @param pauseSparkEngineOptions the instance to initialize the Builder with
     */
    private Builder(PauseSparkEngineOptions pauseSparkEngineOptions) {
      this.engineId = pauseSparkEngineOptions.engineId;
      this.force = pauseSparkEngineOptions.force;
      this.authInstanceId = pauseSparkEngineOptions.authInstanceId;
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
     */
    public Builder(String engineId) {
      this.engineId = engineId;
    }

    /**
     * Builds a PauseSparkEngineOptions.
     *
     * @return the new PauseSparkEngineOptions instance
     */
    public PauseSparkEngineOptions build() {
      return new PauseSparkEngineOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the PauseSparkEngineOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the force.
     *
     * @param force the force
     * @return the PauseSparkEngineOptions builder
     */
    public Builder force(Boolean force) {
      this.force = force;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the PauseSparkEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected PauseSparkEngineOptions() { }

  protected PauseSparkEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    force = builder.force;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a PauseSparkEngineOptions builder
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
   * Gets the force.
   *
   * force spark engine pause.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

