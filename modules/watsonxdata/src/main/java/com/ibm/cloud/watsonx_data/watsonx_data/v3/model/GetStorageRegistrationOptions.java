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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getStorageRegistration options.
 */
public class GetStorageRegistrationOptions extends GenericModel {

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
     * Instantiates a new Builder from an existing GetStorageRegistrationOptions instance.
     *
     * @param getStorageRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(GetStorageRegistrationOptions getStorageRegistrationOptions) {
      this.id = getStorageRegistrationOptions.id;
      this.authInstanceId = getStorageRegistrationOptions.authInstanceId;
      this.skipMdsCall = getStorageRegistrationOptions.skipMdsCall;
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
     * Builds a GetStorageRegistrationOptions.
     *
     * @return the new GetStorageRegistrationOptions instance
     */
    public GetStorageRegistrationOptions build() {
      return new GetStorageRegistrationOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetStorageRegistrationOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetStorageRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the skipMdsCall.
     *
     * @param skipMdsCall the skipMdsCall
     * @return the GetStorageRegistrationOptions builder
     */
    public Builder skipMdsCall(Boolean skipMdsCall) {
      this.skipMdsCall = skipMdsCall;
      return this;
    }
  }

  protected GetStorageRegistrationOptions() { }

  protected GetStorageRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    authInstanceId = builder.authInstanceId;
    skipMdsCall = builder.skipMdsCall;
  }

  /**
   * New builder.
   *
   * @return a GetStorageRegistrationOptions builder
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
   * watsonx.data instance ID.
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

