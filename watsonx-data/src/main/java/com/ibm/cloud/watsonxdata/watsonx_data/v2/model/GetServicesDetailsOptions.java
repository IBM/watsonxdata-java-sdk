/*
 * (C) Copyright IBM Corp. 2025.
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
 * The getServicesDetails options.
 */
public class GetServicesDetailsOptions extends GenericModel {

  protected String target;
  protected String engineOrServiceType;
  protected Boolean internalHost;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private String engineOrServiceType;
    private Boolean internalHost;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetServicesDetailsOptions instance.
     *
     * @param getServicesDetailsOptions the instance to initialize the Builder with
     */
    private Builder(GetServicesDetailsOptions getServicesDetailsOptions) {
      this.target = getServicesDetailsOptions.target;
      this.engineOrServiceType = getServicesDetailsOptions.engineOrServiceType;
      this.internalHost = getServicesDetailsOptions.internalHost;
      this.authInstanceId = getServicesDetailsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     * @param engineOrServiceType the engineOrServiceType
     */
    public Builder(String target, String engineOrServiceType) {
      this.target = target;
      this.engineOrServiceType = engineOrServiceType;
    }

    /**
     * Builds a GetServicesDetailsOptions.
     *
     * @return the new GetServicesDetailsOptions instance
     */
    public GetServicesDetailsOptions build() {
      return new GetServicesDetailsOptions(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the GetServicesDetailsOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the engineOrServiceType.
     *
     * @param engineOrServiceType the engineOrServiceType
     * @return the GetServicesDetailsOptions builder
     */
    public Builder engineOrServiceType(String engineOrServiceType) {
      this.engineOrServiceType = engineOrServiceType;
      return this;
    }

    /**
     * Set the internalHost.
     *
     * @param internalHost the internalHost
     * @return the GetServicesDetailsOptions builder
     */
    public Builder internalHost(Boolean internalHost) {
      this.internalHost = internalHost;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetServicesDetailsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetServicesDetailsOptions() { }

  protected GetServicesDetailsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineOrServiceType,
      "engineOrServiceType cannot be empty");
    target = builder.target;
    engineOrServiceType = builder.engineOrServiceType;
    internalHost = builder.internalHost;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetServicesDetailsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * Target type (e.g., 'cpd', 'generic').
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the engineOrServiceType.
   *
   * Type of engine or service (e.g., 'milvus', 'presto').
   *
   * @return the engineOrServiceType
   */
  public String engineOrServiceType() {
    return engineOrServiceType;
  }

  /**
   * Gets the internalHost.
   *
   * Internal host.
   *
   * @return the internalHost
   */
  public Boolean internalHost() {
    return internalHost;
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

