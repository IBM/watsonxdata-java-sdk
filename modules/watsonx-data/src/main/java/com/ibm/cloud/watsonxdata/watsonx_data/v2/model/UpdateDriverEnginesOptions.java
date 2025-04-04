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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateDriverEngines options.
 */
public class UpdateDriverEnginesOptions extends GenericModel {

  protected String driverId;
  protected Map<String, Object> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String driverId;
    private Map<String, Object> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateDriverEnginesOptions instance.
     *
     * @param updateDriverEnginesOptions the instance to initialize the Builder with
     */
    private Builder(UpdateDriverEnginesOptions updateDriverEnginesOptions) {
      this.driverId = updateDriverEnginesOptions.driverId;
      this.body = updateDriverEnginesOptions.body;
      this.authInstanceId = updateDriverEnginesOptions.authInstanceId;
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
     * @param body the body
     */
    public Builder(String driverId, Map<String, Object> body) {
      this.driverId = driverId;
      this.body = body;
    }

    /**
     * Builds a UpdateDriverEnginesOptions.
     *
     * @return the new UpdateDriverEnginesOptions instance
     */
    public UpdateDriverEnginesOptions build() {
      return new UpdateDriverEnginesOptions(this);
    }

    /**
     * Set the driverId.
     *
     * @param driverId the driverId
     * @return the UpdateDriverEnginesOptions builder
     */
    public Builder driverId(String driverId) {
      this.driverId = driverId;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the UpdateDriverEnginesOptions builder
     */
    public Builder body(Map<String, Object> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateDriverEnginesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateDriverEnginesOptions() { }

  protected UpdateDriverEnginesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.driverId,
      "driverId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    driverId = builder.driverId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateDriverEnginesOptions builder
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
   * Gets the body.
   *
   * Engine details.
   *
   * @return the body
   */
  public Map<String, Object> body() {
    return body;
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

