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
 * Engine configuration details.
 */
public class EngineDetails extends GenericModel {

  protected CoordinatorNodeDescriptionBody coordinator;
  @SerializedName("size_config")
  protected String sizeConfig;
  protected WorkerNodeDescriptionBody worker;
  @SerializedName("autoscaling_enabled")
  protected Boolean autoscalingEnabled;
  @SerializedName("autoscaling_config")
  protected AutoScalingConfig autoscalingConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private CoordinatorNodeDescriptionBody coordinator;
    private String sizeConfig;
    private WorkerNodeDescriptionBody worker;
    private Boolean autoscalingEnabled;
    private AutoScalingConfig autoscalingConfig;

    /**
     * Instantiates a new Builder from an existing EngineDetails instance.
     *
     * @param engineDetails the instance to initialize the Builder with
     */
    private Builder(EngineDetails engineDetails) {
      this.coordinator = engineDetails.coordinator;
      this.sizeConfig = engineDetails.sizeConfig;
      this.worker = engineDetails.worker;
      this.autoscalingEnabled = engineDetails.autoscalingEnabled;
      this.autoscalingConfig = engineDetails.autoscalingConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param coordinator the coordinator
     * @param sizeConfig the sizeConfig
     * @param worker the worker
     */
    public Builder(CoordinatorNodeDescriptionBody coordinator, String sizeConfig, WorkerNodeDescriptionBody worker) {
      this.coordinator = coordinator;
      this.sizeConfig = sizeConfig;
      this.worker = worker;
    }

    /**
     * Builds a EngineDetails.
     *
     * @return the new EngineDetails instance
     */
    public EngineDetails build() {
      return new EngineDetails(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EngineDetails builder
     */
    public Builder coordinator(CoordinatorNodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the sizeConfig.
     *
     * @param sizeConfig the sizeConfig
     * @return the EngineDetails builder
     */
    public Builder sizeConfig(String sizeConfig) {
      this.sizeConfig = sizeConfig;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EngineDetails builder
     */
    public Builder worker(WorkerNodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the autoscalingEnabled.
     *
     * @param autoscalingEnabled the autoscalingEnabled
     * @return the EngineDetails builder
     */
    public Builder autoscalingEnabled(Boolean autoscalingEnabled) {
      this.autoscalingEnabled = autoscalingEnabled;
      return this;
    }

    /**
     * Set the autoscalingConfig.
     *
     * @param autoscalingConfig the autoscalingConfig
     * @return the EngineDetails builder
     */
    public Builder autoscalingConfig(AutoScalingConfig autoscalingConfig) {
      this.autoscalingConfig = autoscalingConfig;
      return this;
    }
  }

  protected EngineDetails() { }

  protected EngineDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.coordinator,
      "coordinator cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sizeConfig,
      "sizeConfig cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.worker,
      "worker cannot be null");
    coordinator = builder.coordinator;
    sizeConfig = builder.sizeConfig;
    worker = builder.worker;
    autoscalingEnabled = builder.autoscalingEnabled;
    autoscalingConfig = builder.autoscalingConfig;
  }

  /**
   * New builder.
   *
   * @return a EngineDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * Presto engine configurations.
   *
   * @return the coordinator
   */
  public CoordinatorNodeDescriptionBody coordinator() {
    return coordinator;
  }

  /**
   * Gets the sizeConfig.
   *
   * CPD supported sizes are: custom, starter, small, medium, large, xlarge, and xxlarge. IBM cloud supported sizes are:
   * custom, starter, small, medium, large, cache_optimized, compute_optimized and lite.
   *
   * @return the sizeConfig
   */
  public String sizeConfig() {
    return sizeConfig;
  }

  /**
   * Gets the worker.
   *
   * Presto engine configurations.
   *
   * @return the worker
   */
  public WorkerNodeDescriptionBody worker() {
    return worker;
  }

  /**
   * Gets the autoscalingEnabled.
   *
   * Enable autoscaling for the engine.
   *
   * @return the autoscalingEnabled
   */
  public Boolean autoscalingEnabled() {
    return autoscalingEnabled;
  }

  /**
   * Gets the autoscalingConfig.
   *
   * Autoscaling configuration for the engine.
   *
   * @return the autoscalingConfig
   */
  public AutoScalingConfig autoscalingConfig() {
    return autoscalingConfig;
  }
}

