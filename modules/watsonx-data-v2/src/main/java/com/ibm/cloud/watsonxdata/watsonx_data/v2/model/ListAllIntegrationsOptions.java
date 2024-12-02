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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listAllIntegrations options.
 */
public class ListAllIntegrationsOptions extends GenericModel {

  protected String authInstanceId;
  protected String secret;
  protected String serviceType;
  protected List<String> state;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String secret;
    private String serviceType;
    private List<String> state;

    /**
     * Instantiates a new Builder from an existing ListAllIntegrationsOptions instance.
     *
     * @param listAllIntegrationsOptions the instance to initialize the Builder with
     */
    private Builder(ListAllIntegrationsOptions listAllIntegrationsOptions) {
      this.authInstanceId = listAllIntegrationsOptions.authInstanceId;
      this.secret = listAllIntegrationsOptions.secret;
      this.serviceType = listAllIntegrationsOptions.serviceType;
      this.state = listAllIntegrationsOptions.state;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListAllIntegrationsOptions.
     *
     * @return the new ListAllIntegrationsOptions instance
     */
    public ListAllIntegrationsOptions build() {
      return new ListAllIntegrationsOptions(this);
    }

    /**
     * Adds a new element to state.
     *
     * @param state the new element to be added
     * @return the ListAllIntegrationsOptions builder
     */
    public Builder addState(String state) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(state,
        "state cannot be null");
      if (this.state == null) {
        this.state = new ArrayList<String>();
      }
      this.state.add(state);
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListAllIntegrationsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the ListAllIntegrationsOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the serviceType.
     *
     * @param serviceType the serviceType
     * @return the ListAllIntegrationsOptions builder
     */
    public Builder serviceType(String serviceType) {
      this.serviceType = serviceType;
      return this;
    }

    /**
     * Set the state.
     * Existing state will be replaced.
     *
     * @param state the state
     * @return the ListAllIntegrationsOptions builder
     */
    public Builder state(List<String> state) {
      this.state = state;
      return this;
    }
  }

  protected ListAllIntegrationsOptions() { }

  protected ListAllIntegrationsOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
    secret = builder.secret;
    serviceType = builder.serviceType;
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a ListAllIntegrationsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the serviceType.
   *
   * service_type.
   *
   * @return the serviceType
   */
  public String serviceType() {
    return serviceType;
  }

  /**
   * Gets the state.
   *
   * state.
   *
   * @return the state
   */
  public List<String> state() {
    return state;
  }
}

