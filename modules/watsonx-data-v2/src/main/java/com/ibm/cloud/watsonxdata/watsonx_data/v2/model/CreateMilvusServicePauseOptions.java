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
 * The createMilvusServicePause options.
 */
public class CreateMilvusServicePauseOptions extends GenericModel {

  protected String serviceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateMilvusServicePauseOptions instance.
     *
     * @param createMilvusServicePauseOptions the instance to initialize the Builder with
     */
    private Builder(CreateMilvusServicePauseOptions createMilvusServicePauseOptions) {
      this.serviceId = createMilvusServicePauseOptions.serviceId;
      this.authInstanceId = createMilvusServicePauseOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param serviceId the serviceId
     */
    public Builder(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Builds a CreateMilvusServicePauseOptions.
     *
     * @return the new CreateMilvusServicePauseOptions instance
     */
    public CreateMilvusServicePauseOptions build() {
      return new CreateMilvusServicePauseOptions(this);
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the CreateMilvusServicePauseOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateMilvusServicePauseOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateMilvusServicePauseOptions() { }

  protected CreateMilvusServicePauseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serviceId,
      "serviceId cannot be empty");
    serviceId = builder.serviceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateMilvusServicePauseOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the serviceId.
   *
   * service id.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
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

