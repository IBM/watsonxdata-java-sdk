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
 * Updated autoscaling configuration.
 */
public class PatchAutoscalingConfig extends GenericModel {

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

  protected PatchAutoscalingConfig() { }

  /**
   * Gets the target.
   *
   * CPU target in percentage for autoscaling event.
   *
   * @return the target
   */
  public Long getTarget() {
    return target;
  }

  /**
   * Gets the minWorkerQuantity.
   *
   * Minimum number of worker nodes.
   *
   * @return the minWorkerQuantity
   */
  public Long getMinWorkerQuantity() {
    return minWorkerQuantity;
  }

  /**
   * Gets the maxWorkerQuantity.
   *
   * Maximum number of worker nodes.
   *
   * @return the maxWorkerQuantity
   */
  public Long getMaxWorkerQuantity() {
    return maxWorkerQuantity;
  }

  /**
   * Gets the queryTerminationGracePeriodMin.
   *
   * Pod termination wait time in minutes.
   *
   * @return the queryTerminationGracePeriodMin
   */
  public Long getQueryTerminationGracePeriodMin() {
    return queryTerminationGracePeriodMin;
  }

  /**
   * Gets the scaleInStabilizationWindowMin.
   *
   * Wait time between scale-in operations in minutes.
   *
   * @return the scaleInStabilizationWindowMin
   */
  public Long getScaleInStabilizationWindowMin() {
    return scaleInStabilizationWindowMin;
  }

  /**
   * Gets the scalingStepSize.
   *
   * Number of workers to add/remove per scaling operation.
   *
   * @return the scalingStepSize
   */
  public Long getScalingStepSize() {
    return scalingStepSize;
  }
}

