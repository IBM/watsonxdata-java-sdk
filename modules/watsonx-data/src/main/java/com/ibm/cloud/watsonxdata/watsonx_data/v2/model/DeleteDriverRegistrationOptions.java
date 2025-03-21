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
 * The deleteDriverRegistration options.
 */
public class DeleteDriverRegistrationOptions extends GenericModel {

  protected String driverId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String driverId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDriverRegistrationOptions instance.
     *
     * @param deleteDriverRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDriverRegistrationOptions deleteDriverRegistrationOptions) {
      this.driverId = deleteDriverRegistrationOptions.driverId;
      this.authInstanceId = deleteDriverRegistrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param driverId the driverId
     */
    public Builder(String driverId) {
      this.driverId = driverId;
    }

    /**
     * Builds a DeleteDriverRegistrationOptions.
     *
     * @return the new DeleteDriverRegistrationOptions instance
     */
    public DeleteDriverRegistrationOptions build() {
      return new DeleteDriverRegistrationOptions(this);
    }

    /**
     * Set the driverId.
     *
     * @param driverId the driverId
     * @return the DeleteDriverRegistrationOptions builder
     */
    public Builder driverId(String driverId) {
      this.driverId = driverId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDriverRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDriverRegistrationOptions() { }

  protected DeleteDriverRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.driverId,
      "driverId cannot be empty");
    driverId = builder.driverId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDriverRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the driverId.
   *
   * Driver ID.
   *
   * @return the driverId
   */
  public String driverId() {
    return driverId;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

