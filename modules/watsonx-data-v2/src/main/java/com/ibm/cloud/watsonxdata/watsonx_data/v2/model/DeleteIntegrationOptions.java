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
 * The deleteIntegration options.
 */
public class DeleteIntegrationOptions extends GenericModel {

  protected String integrationId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String integrationId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteIntegrationOptions instance.
     *
     * @param deleteIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteIntegrationOptions deleteIntegrationOptions) {
      this.integrationId = deleteIntegrationOptions.integrationId;
      this.authInstanceId = deleteIntegrationOptions.authInstanceId;
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
     */
    public Builder(String integrationId) {
      this.integrationId = integrationId;
    }

    /**
     * Builds a DeleteIntegrationOptions.
     *
     * @return the new DeleteIntegrationOptions instance
     */
    public DeleteIntegrationOptions build() {
      return new DeleteIntegrationOptions(this);
    }

    /**
     * Set the integrationId.
     *
     * @param integrationId the integrationId
     * @return the DeleteIntegrationOptions builder
     */
    public Builder integrationId(String integrationId) {
      this.integrationId = integrationId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteIntegrationOptions() { }

  protected DeleteIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.integrationId,
      "integrationId cannot be empty");
    integrationId = builder.integrationId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteIntegrationOptions builder
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

