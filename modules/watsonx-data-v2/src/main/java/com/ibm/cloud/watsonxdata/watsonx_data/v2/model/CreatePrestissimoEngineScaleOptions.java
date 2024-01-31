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
 * The createPrestissimoEngineScale options.
 */
public class CreatePrestissimoEngineScaleOptions extends GenericModel {

  protected String engineId;
  protected PrestissimoNodeDescriptionBody coordinator;
  protected PrestissimoNodeDescriptionBody worker;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private PrestissimoNodeDescriptionBody coordinator;
    private PrestissimoNodeDescriptionBody worker;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreatePrestissimoEngineScaleOptions instance.
     *
     * @param createPrestissimoEngineScaleOptions the instance to initialize the Builder with
     */
    private Builder(CreatePrestissimoEngineScaleOptions createPrestissimoEngineScaleOptions) {
      this.engineId = createPrestissimoEngineScaleOptions.engineId;
      this.coordinator = createPrestissimoEngineScaleOptions.coordinator;
      this.worker = createPrestissimoEngineScaleOptions.worker;
      this.authInstanceId = createPrestissimoEngineScaleOptions.authInstanceId;
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
     * Builds a CreatePrestissimoEngineScaleOptions.
     *
     * @return the new CreatePrestissimoEngineScaleOptions instance
     */
    public CreatePrestissimoEngineScaleOptions build() {
      return new CreatePrestissimoEngineScaleOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreatePrestissimoEngineScaleOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the CreatePrestissimoEngineScaleOptions builder
     */
    public Builder coordinator(PrestissimoNodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the CreatePrestissimoEngineScaleOptions builder
     */
    public Builder worker(PrestissimoNodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreatePrestissimoEngineScaleOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreatePrestissimoEngineScaleOptions() { }

  protected CreatePrestissimoEngineScaleOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    coordinator = builder.coordinator;
    worker = builder.worker;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreatePrestissimoEngineScaleOptions builder
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
   * Gets the worker.
   *
   * Node details.
   *
   * @return the worker
   */
  public PrestissimoNodeDescriptionBody worker() {
    return worker;
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

