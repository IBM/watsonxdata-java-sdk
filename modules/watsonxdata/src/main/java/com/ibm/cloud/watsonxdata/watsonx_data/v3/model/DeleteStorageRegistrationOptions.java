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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteStorageRegistration options.
 */
public class DeleteStorageRegistrationOptions extends GenericModel {

  protected String id;
  protected String authInstanceId;
  protected Boolean skipMdsCall;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String authInstanceId;
    private Boolean skipMdsCall;

    /**
     * Instantiates a new Builder from an existing DeleteStorageRegistrationOptions instance.
     *
     * @param deleteStorageRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(DeleteStorageRegistrationOptions deleteStorageRegistrationOptions) {
      this.id = deleteStorageRegistrationOptions.id;
      this.authInstanceId = deleteStorageRegistrationOptions.authInstanceId;
      this.skipMdsCall = deleteStorageRegistrationOptions.skipMdsCall;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DeleteStorageRegistrationOptions.
     *
     * @return the new DeleteStorageRegistrationOptions instance
     */
    public DeleteStorageRegistrationOptions build() {
      return new DeleteStorageRegistrationOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteStorageRegistrationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteStorageRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the skipMdsCall.
     *
     * @param skipMdsCall the skipMdsCall
     * @return the DeleteStorageRegistrationOptions builder
     */
    public Builder skipMdsCall(Boolean skipMdsCall) {
      this.skipMdsCall = skipMdsCall;
      return this;
    }
  }

  protected DeleteStorageRegistrationOptions() { }

  protected DeleteStorageRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    authInstanceId = builder.authInstanceId;
    skipMdsCall = builder.skipMdsCall;
  }

  /**
   * New builder.
   *
   * @return a DeleteStorageRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * storage id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the skipMdsCall.
   *
   * Skip MDS call when Unity catalog is added.
   *
   * @return the skipMdsCall
   */
  public Boolean skipMdsCall() {
    return skipMdsCall;
  }
}

