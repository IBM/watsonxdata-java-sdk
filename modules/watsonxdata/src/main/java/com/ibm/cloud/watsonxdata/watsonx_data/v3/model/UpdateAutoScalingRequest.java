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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Request body for updating autoscaling configuration.
 */
public class UpdateAutoScalingRequest extends GenericModel {

  @SerializedName("autoscaling_config")
  protected AutoScalingConfig autoscalingConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private AutoScalingConfig autoscalingConfig;

    /**
     * Instantiates a new Builder from an existing UpdateAutoScalingRequest instance.
     *
     * @param updateAutoScalingRequest the instance to initialize the Builder with
     */
    private Builder(UpdateAutoScalingRequest updateAutoScalingRequest) {
      this.autoscalingConfig = updateAutoScalingRequest.autoscalingConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateAutoScalingRequest.
     *
     * @return the new UpdateAutoScalingRequest instance
     */
    public UpdateAutoScalingRequest build() {
      return new UpdateAutoScalingRequest(this);
    }

    /**
     * Set the autoscalingConfig.
     *
     * @param autoscalingConfig the autoscalingConfig
     * @return the UpdateAutoScalingRequest builder
     */
    public Builder autoscalingConfig(AutoScalingConfig autoscalingConfig) {
      this.autoscalingConfig = autoscalingConfig;
      return this;
    }
  }

  protected UpdateAutoScalingRequest() { }

  protected UpdateAutoScalingRequest(Builder builder) {
    autoscalingConfig = builder.autoscalingConfig;
  }

  /**
   * New builder.
   *
   * @return a UpdateAutoScalingRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the autoscalingConfig.
   *
   * Autoscaling configuration for engine.
   *
   * @return the autoscalingConfig
   */
  public AutoScalingConfig autoscalingConfig() {
    return autoscalingConfig;
  }

  /**
   * Construct a JSON merge-patch from the UpdateAutoScalingRequest.
   *
   * Note that properties of the UpdateAutoScalingRequest with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the UpdateAutoScalingRequest
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

