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
 * The updatePrestoEngineConfig options.
 */
public class UpdatePrestoEngineConfigOptions extends GenericModel {

  protected String engineId;
  protected String authInstanceId;
  protected Map<String, Object> prestoEnginePropertiesDetailsPatch;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String authInstanceId;
    private Map<String, Object> prestoEnginePropertiesDetailsPatch;

    /**
     * Instantiates a new Builder from an existing UpdatePrestoEngineConfigOptions instance.
     *
     * @param updatePrestoEngineConfigOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePrestoEngineConfigOptions updatePrestoEngineConfigOptions) {
      this.engineId = updatePrestoEngineConfigOptions.engineId;
      this.authInstanceId = updatePrestoEngineConfigOptions.authInstanceId;
      this.prestoEnginePropertiesDetailsPatch = updatePrestoEngineConfigOptions.prestoEnginePropertiesDetailsPatch;
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
     * @param authInstanceId the authInstanceId
     * @param prestoEnginePropertiesDetailsPatch the prestoEnginePropertiesDetailsPatch
     */
    public Builder(String engineId, String authInstanceId, Map<String, Object> prestoEnginePropertiesDetailsPatch) {
      this.engineId = engineId;
      this.authInstanceId = authInstanceId;
      this.prestoEnginePropertiesDetailsPatch = prestoEnginePropertiesDetailsPatch;
    }

    /**
     * Builds a UpdatePrestoEngineConfigOptions.
     *
     * @return the new UpdatePrestoEngineConfigOptions instance
     */
    public UpdatePrestoEngineConfigOptions build() {
      return new UpdatePrestoEngineConfigOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdatePrestoEngineConfigOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdatePrestoEngineConfigOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the prestoEnginePropertiesDetailsPatch.
     *
     * @param prestoEnginePropertiesDetailsPatch the prestoEnginePropertiesDetailsPatch
     * @return the UpdatePrestoEngineConfigOptions builder
     */
    public Builder prestoEnginePropertiesDetailsPatch(Map<String, Object> prestoEnginePropertiesDetailsPatch) {
      this.prestoEnginePropertiesDetailsPatch = prestoEnginePropertiesDetailsPatch;
      return this;
    }
  }

  protected UpdatePrestoEngineConfigOptions() { }

  protected UpdatePrestoEngineConfigOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prestoEnginePropertiesDetailsPatch,
      "prestoEnginePropertiesDetailsPatch cannot be null");
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
    prestoEnginePropertiesDetailsPatch = builder.prestoEnginePropertiesDetailsPatch;
  }

  /**
   * New builder.
   *
   * @return a UpdatePrestoEngineConfigOptions builder
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
   * Gets the authInstanceId.
   *
   * Authentication Instance ID (CRN).
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the prestoEnginePropertiesDetailsPatch.
   *
   * Engine properties configuration to update.
   *
   * @return the prestoEnginePropertiesDetailsPatch
   */
  public Map<String, Object> prestoEnginePropertiesDetailsPatch() {
    return prestoEnginePropertiesDetailsPatch;
  }
}

