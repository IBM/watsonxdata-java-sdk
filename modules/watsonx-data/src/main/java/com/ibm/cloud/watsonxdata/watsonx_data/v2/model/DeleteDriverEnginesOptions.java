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
 * The deleteDriverEngines options.
 */
public class DeleteDriverEnginesOptions extends GenericModel {

  protected String driverId;
  protected String engineIds;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String driverId;
    private String engineIds;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDriverEnginesOptions instance.
     *
     * @param deleteDriverEnginesOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDriverEnginesOptions deleteDriverEnginesOptions) {
      this.driverId = deleteDriverEnginesOptions.driverId;
      this.engineIds = deleteDriverEnginesOptions.engineIds;
      this.authInstanceId = deleteDriverEnginesOptions.authInstanceId;
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
     * @param engineIds the engineIds
     */
    public Builder(String driverId, String engineIds) {
      this.driverId = driverId;
      this.engineIds = engineIds;
    }

    /**
     * Builds a DeleteDriverEnginesOptions.
     *
     * @return the new DeleteDriverEnginesOptions instance
     */
    public DeleteDriverEnginesOptions build() {
      return new DeleteDriverEnginesOptions(this);
    }

    /**
     * Set the driverId.
     *
     * @param driverId the driverId
     * @return the DeleteDriverEnginesOptions builder
     */
    public Builder driverId(String driverId) {
      this.driverId = driverId;
      return this;
    }

    /**
     * Set the engineIds.
     *
     * @param engineIds the engineIds
     * @return the DeleteDriverEnginesOptions builder
     */
    public Builder engineIds(String engineIds) {
      this.engineIds = engineIds;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDriverEnginesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDriverEnginesOptions() { }

  protected DeleteDriverEnginesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.driverId,
      "driverId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineIds,
      "engineIds cannot be null");
    driverId = builder.driverId;
    engineIds = builder.engineIds;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDriverEnginesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the driverId.
   *
   * driver id.
   *
   * @return the driverId
   */
  public String driverId() {
    return driverId;
  }

  /**
   * Gets the engineIds.
   *
   * Engine id(s) to be disassociated from the driver, comma separated.
   *
   * @return the engineIds
   */
  public String engineIds() {
    return engineIds;
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

