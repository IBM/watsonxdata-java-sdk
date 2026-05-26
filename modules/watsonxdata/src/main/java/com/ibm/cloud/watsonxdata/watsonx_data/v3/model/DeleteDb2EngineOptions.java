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
 * The deleteDb2Engine options.
 */
public class DeleteDb2EngineOptions extends GenericModel {

  protected String id;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDb2EngineOptions instance.
     *
     * @param deleteDb2EngineOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDb2EngineOptions deleteDb2EngineOptions) {
      this.id = deleteDb2EngineOptions.id;
      this.authInstanceId = deleteDb2EngineOptions.authInstanceId;
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
     * Builds a DeleteDb2EngineOptions.
     *
     * @return the new DeleteDb2EngineOptions instance
     */
    public DeleteDb2EngineOptions build() {
      return new DeleteDb2EngineOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteDb2EngineOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDb2EngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDb2EngineOptions() { }

  protected DeleteDb2EngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDb2EngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * engine id.
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
}

