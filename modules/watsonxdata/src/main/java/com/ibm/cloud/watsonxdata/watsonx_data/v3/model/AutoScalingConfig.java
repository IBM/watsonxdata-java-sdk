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
 * Autoscaling configuration for the engine.
 */
public class AutoScalingConfig extends GenericModel {

  /**
   * Autoscaling type.
   */
  public interface Type {
    /** cpu. */
    String CPU = "cpu";
    /** memory. */
    String MEMORY = "memory";
  }

  protected String type;
  protected Long target;
  @SerializedName("min_worker_quantity")
  protected Long minWorkerQuantity;
  @SerializedName("max_worker_quantity")
  protected Long maxWorkerQuantity;
  @SerializedName("query_termination_grace_period_min")
  protected Long queryTerminationGracePeriodMin;
  @SerializedName("scale_in_stabilization_window_min")
  protected Long scaleInStabilizationWindowMin;
  @SerializedName("scaling_step_size")
  protected Long scalingStepSize;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Long target;
    private Long minWorkerQuantity;
    private Long maxWorkerQuantity;
    private Long queryTerminationGracePeriodMin;
    private Long scaleInStabilizationWindowMin;
    private Long scalingStepSize;

    /**
     * Instantiates a new Builder from an existing AutoScalingConfig instance.
     *
     * @param autoScalingConfig the instance to initialize the Builder with
     */
    private Builder(AutoScalingConfig autoScalingConfig) {
      this.type = autoScalingConfig.type;
      this.target = autoScalingConfig.target;
      this.minWorkerQuantity = autoScalingConfig.minWorkerQuantity;
      this.maxWorkerQuantity = autoScalingConfig.maxWorkerQuantity;
      this.queryTerminationGracePeriodMin = autoScalingConfig.queryTerminationGracePeriodMin;
      this.scaleInStabilizationWindowMin = autoScalingConfig.scaleInStabilizationWindowMin;
      this.scalingStepSize = autoScalingConfig.scalingStepSize;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a AutoScalingConfig.
     *
     * @return the new AutoScalingConfig instance
     */
    public AutoScalingConfig build() {
      return new AutoScalingConfig(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the AutoScalingConfig builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the AutoScalingConfig builder
     */
    public Builder target(long target) {
      this.target = target;
      return this;
    }

    /**
     * Set the minWorkerQuantity.
     *
     * @param minWorkerQuantity the minWorkerQuantity
     * @return the AutoScalingConfig builder
     */
    public Builder minWorkerQuantity(long minWorkerQuantity) {
      this.minWorkerQuantity = minWorkerQuantity;
      return this;
    }

    /**
     * Set the maxWorkerQuantity.
     *
     * @param maxWorkerQuantity the maxWorkerQuantity
     * @return the AutoScalingConfig builder
     */
    public Builder maxWorkerQuantity(long maxWorkerQuantity) {
      this.maxWorkerQuantity = maxWorkerQuantity;
      return this;
    }

    /**
     * Set the queryTerminationGracePeriodMin.
     *
     * @param queryTerminationGracePeriodMin the queryTerminationGracePeriodMin
     * @return the AutoScalingConfig builder
     */
    public Builder queryTerminationGracePeriodMin(long queryTerminationGracePeriodMin) {
      this.queryTerminationGracePeriodMin = queryTerminationGracePeriodMin;
      return this;
    }

    /**
     * Set the scaleInStabilizationWindowMin.
     *
     * @param scaleInStabilizationWindowMin the scaleInStabilizationWindowMin
     * @return the AutoScalingConfig builder
     */
    public Builder scaleInStabilizationWindowMin(long scaleInStabilizationWindowMin) {
      this.scaleInStabilizationWindowMin = scaleInStabilizationWindowMin;
      return this;
    }

    /**
     * Set the scalingStepSize.
     *
     * @param scalingStepSize the scalingStepSize
     * @return the AutoScalingConfig builder
     */
    public Builder scalingStepSize(long scalingStepSize) {
      this.scalingStepSize = scalingStepSize;
      return this;
    }
  }

  protected AutoScalingConfig() { }

  protected AutoScalingConfig(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
    target = builder.target;
    minWorkerQuantity = builder.minWorkerQuantity;
    maxWorkerQuantity = builder.maxWorkerQuantity;
    queryTerminationGracePeriodMin = builder.queryTerminationGracePeriodMin;
    scaleInStabilizationWindowMin = builder.scaleInStabilizationWindowMin;
    scalingStepSize = builder.scalingStepSize;
  }

  /**
   * New builder.
   *
   * @return a AutoScalingConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Autoscaling type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the target.
   *
   * Target utilization percentage.
   *
   * @return the target
   */
  public Long target() {
    return target;
  }

  /**
   * Gets the minWorkerQuantity.
   *
   * Minimum number of worker nodes.
   *
   * @return the minWorkerQuantity
   */
  public Long minWorkerQuantity() {
    return minWorkerQuantity;
  }

  /**
   * Gets the maxWorkerQuantity.
   *
   * Maximum number of worker nodes.
   *
   * @return the maxWorkerQuantity
   */
  public Long maxWorkerQuantity() {
    return maxWorkerQuantity;
  }

  /**
   * Gets the queryTerminationGracePeriodMin.
   *
   * Grace period in minutes before terminating queries.
   *
   * @return the queryTerminationGracePeriodMin
   */
  public Long queryTerminationGracePeriodMin() {
    return queryTerminationGracePeriodMin;
  }

  /**
   * Gets the scaleInStabilizationWindowMin.
   *
   * Stabilization window in minutes for scale-in.
   *
   * @return the scaleInStabilizationWindowMin
   */
  public Long scaleInStabilizationWindowMin() {
    return scaleInStabilizationWindowMin;
  }

  /**
   * Gets the scalingStepSize.
   *
   * Number of nodes to add/remove per scaling action.
   *
   * @return the scalingStepSize
   */
  public Long scalingStepSize() {
    return scalingStepSize;
  }
}

