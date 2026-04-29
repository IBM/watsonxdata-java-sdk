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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updatePrestoEngineAutoscaling options.
 */
public class UpdatePrestoEngineAutoscalingOptions extends GenericModel {

  protected String engineId;
  protected Map<String, Object> updateAutoScalingRequestPatch;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private Map<String, Object> updateAutoScalingRequestPatch;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdatePrestoEngineAutoscalingOptions instance.
     *
     * @param updatePrestoEngineAutoscalingOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePrestoEngineAutoscalingOptions updatePrestoEngineAutoscalingOptions) {
      this.engineId = updatePrestoEngineAutoscalingOptions.engineId;
      this.updateAutoScalingRequestPatch = updatePrestoEngineAutoscalingOptions.updateAutoScalingRequestPatch;
      this.authInstanceId = updatePrestoEngineAutoscalingOptions.authInstanceId;
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
     * @param updateAutoScalingRequestPatch the updateAutoScalingRequestPatch
     */
    public Builder(String engineId, Map<String, Object> updateAutoScalingRequestPatch) {
      this.engineId = engineId;
      this.updateAutoScalingRequestPatch = updateAutoScalingRequestPatch;
    }

    /**
     * Builds a UpdatePrestoEngineAutoscalingOptions.
     *
     * @return the new UpdatePrestoEngineAutoscalingOptions instance
     */
    public UpdatePrestoEngineAutoscalingOptions build() {
      return new UpdatePrestoEngineAutoscalingOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdatePrestoEngineAutoscalingOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the updateAutoScalingRequestPatch.
     *
     * @param updateAutoScalingRequestPatch the updateAutoScalingRequestPatch
     * @return the UpdatePrestoEngineAutoscalingOptions builder
     */
    public Builder updateAutoScalingRequestPatch(Map<String, Object> updateAutoScalingRequestPatch) {
      this.updateAutoScalingRequestPatch = updateAutoScalingRequestPatch;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdatePrestoEngineAutoscalingOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdatePrestoEngineAutoscalingOptions() { }

  protected UpdatePrestoEngineAutoscalingOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.updateAutoScalingRequestPatch,
      "updateAutoScalingRequestPatch cannot be null");
    engineId = builder.engineId;
    updateAutoScalingRequestPatch = builder.updateAutoScalingRequestPatch;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdatePrestoEngineAutoscalingOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine ID.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the updateAutoScalingRequestPatch.
   *
   * Autoscaling configuration.
   *
   * @return the updateAutoScalingRequestPatch
   */
  public Map<String, Object> updateAutoScalingRequestPatch() {
    return updateAutoScalingRequestPatch;
  }

  /**
   * Gets the authInstanceId.
   *
   * Watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

