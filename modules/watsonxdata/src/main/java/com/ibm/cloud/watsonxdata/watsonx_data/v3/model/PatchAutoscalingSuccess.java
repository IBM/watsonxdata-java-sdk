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
 * Autoscaling configuration update success response.
 */
public class PatchAutoscalingSuccess extends GenericModel {

  @SerializedName("autoscaling_enabled")
  protected Boolean autoscalingEnabled;
  @SerializedName("autoscaling_config")
  protected PatchAutoscalingConfig autoscalingConfig;

  protected PatchAutoscalingSuccess() { }

  /**
   * Gets the autoscalingEnabled.
   *
   * Whether autoscaling is enabled.
   *
   * @return the autoscalingEnabled
   */
  public Boolean isAutoscalingEnabled() {
    return autoscalingEnabled;
  }

  /**
   * Gets the autoscalingConfig.
   *
   * Updated autoscaling configuration.
   *
   * @return the autoscalingConfig
   */
  public PatchAutoscalingConfig getAutoscalingConfig() {
    return autoscalingConfig;
  }
}

