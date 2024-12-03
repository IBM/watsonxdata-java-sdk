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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateIntegration options.
 */
public class UpdateIntegrationOptions extends GenericModel {

  protected String integrationId;
  protected Map<String, Object> integrationPatch;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String integrationId;
    private Map<String, Object> integrationPatch;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateIntegrationOptions instance.
     *
     * @param updateIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateIntegrationOptions updateIntegrationOptions) {
      this.integrationId = updateIntegrationOptions.integrationId;
      this.integrationPatch = updateIntegrationOptions.integrationPatch;
      this.authInstanceId = updateIntegrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param integrationId the integrationId
     * @param integrationPatch the integrationPatch
     */
    public Builder(String integrationId, Map<String, Object> integrationPatch) {
      this.integrationId = integrationId;
      this.integrationPatch = integrationPatch;
    }

    /**
     * Builds a UpdateIntegrationOptions.
     *
     * @return the new UpdateIntegrationOptions instance
     */
    public UpdateIntegrationOptions build() {
      return new UpdateIntegrationOptions(this);
    }

    /**
     * Set the integrationId.
     *
     * @param integrationId the integrationId
     * @return the UpdateIntegrationOptions builder
     */
    public Builder integrationId(String integrationId) {
      this.integrationId = integrationId;
      return this;
    }

    /**
     * Set the integrationPatch.
     *
     * @param integrationPatch the integrationPatch
     * @return the UpdateIntegrationOptions builder
     */
    public Builder integrationPatch(Map<String, Object> integrationPatch) {
      this.integrationPatch = integrationPatch;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateIntegrationOptions() { }

  protected UpdateIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.integrationId,
      "integrationId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.integrationPatch,
      "integrationPatch cannot be null");
    integrationId = builder.integrationId;
    integrationPatch = builder.integrationPatch;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateIntegrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the integrationId.
   *
   * integration_id.
   *
   * @return the integrationId
   */
  public String integrationId() {
    return integrationId;
  }

  /**
   * Gets the integrationPatch.
   *
   * Integration update parameters.
   *
   * @return the integrationPatch
   */
  public Map<String, Object> integrationPatch() {
    return integrationPatch;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

