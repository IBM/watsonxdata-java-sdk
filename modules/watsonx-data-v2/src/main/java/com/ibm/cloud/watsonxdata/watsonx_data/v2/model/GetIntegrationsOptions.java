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
 * The getIntegrations options.
 */
public class GetIntegrationsOptions extends GenericModel {

  protected String integrationId;
  protected String authInstanceId;
  protected String secret;

  /**
   * Builder.
   */
  public static class Builder {
    private String integrationId;
    private String authInstanceId;
    private String secret;

    /**
     * Instantiates a new Builder from an existing GetIntegrationsOptions instance.
     *
     * @param getIntegrationsOptions the instance to initialize the Builder with
     */
    private Builder(GetIntegrationsOptions getIntegrationsOptions) {
      this.integrationId = getIntegrationsOptions.integrationId;
      this.authInstanceId = getIntegrationsOptions.authInstanceId;
      this.secret = getIntegrationsOptions.secret;
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
     * Builds a GetIntegrationsOptions.
     *
     * @return the new GetIntegrationsOptions instance
     */
    public GetIntegrationsOptions build() {
      return new GetIntegrationsOptions(this);
    }

    /**
     * Set the integrationId.
     *
     * @param integrationId the integrationId
     * @return the GetIntegrationsOptions builder
     */
    public Builder integrationId(String integrationId) {
      this.integrationId = integrationId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetIntegrationsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the GetIntegrationsOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }
  }

  protected GetIntegrationsOptions() { }

  protected GetIntegrationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.integrationId,
      "integrationId cannot be empty");
    integrationId = builder.integrationId;
    authInstanceId = builder.authInstanceId;
    secret = builder.secret;
  }

  /**
   * New builder.
   *
   * @return a GetIntegrationsOptions builder
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

  /**
   * Gets the secret.
   *
   * API Authentication service token.
   *
   * @return the secret
   */
  public String secret() {
    return secret;
  }
}

