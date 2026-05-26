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
 * The pauseSparkEngine options.
 */
public class PauseSparkEngineOptions extends GenericModel {

  protected String id;
  protected Boolean force;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean force;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing PauseSparkEngineOptions instance.
     *
     * @param pauseSparkEngineOptions the instance to initialize the Builder with
     */
    private Builder(PauseSparkEngineOptions pauseSparkEngineOptions) {
      this.id = pauseSparkEngineOptions.id;
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
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
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
     * Set the id.
     *
     * @param id the id
     * @return the PauseSparkEngineOptions builder
     */
    public Builder id(String id) {
      this.id = id;
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
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
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
   * Gets the force.
   *
   * force spark engine pause. Default value is false.
   *
   * @return the force
   */
  public Boolean force() {
    return force;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

