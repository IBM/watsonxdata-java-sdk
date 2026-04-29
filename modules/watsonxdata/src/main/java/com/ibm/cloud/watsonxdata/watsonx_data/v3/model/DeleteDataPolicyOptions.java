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
 * The deleteDataPolicy options.
 */
public class DeleteDataPolicyOptions extends GenericModel {

  protected String name;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String name;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDataPolicyOptions instance.
     *
     * @param deleteDataPolicyOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDataPolicyOptions deleteDataPolicyOptions) {
      this.name = deleteDataPolicyOptions.name;
      this.authInstanceId = deleteDataPolicyOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     */
    public Builder(String name) {
      this.name = name;
    }

    /**
     * Builds a DeleteDataPolicyOptions.
     *
     * @return the new DeleteDataPolicyOptions instance
     */
    public DeleteDataPolicyOptions build() {
      return new DeleteDataPolicyOptions(this);
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the DeleteDataPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDataPolicyOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDataPolicyOptions() { }

  protected DeleteDataPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.name,
      "name cannot be empty");
    name = builder.name;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the name.
   *
   * Policy name which is passing as path param to delete.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the authInstanceId.
   *
   * Unique identifier assigned to a specific watsonx.data instance.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

