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
 * The deleteDataPolicies options.
 */
public class DeleteDataPoliciesOptions extends GenericModel {

  protected String authInstanceId;
  protected String policies;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String policies;

    /**
     * Instantiates a new Builder from an existing DeleteDataPoliciesOptions instance.
     *
     * @param deleteDataPoliciesOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDataPoliciesOptions deleteDataPoliciesOptions) {
      this.authInstanceId = deleteDataPoliciesOptions.authInstanceId;
      this.policies = deleteDataPoliciesOptions.policies;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteDataPoliciesOptions.
     *
     * @return the new DeleteDataPoliciesOptions instance
     */
    public DeleteDataPoliciesOptions build() {
      return new DeleteDataPoliciesOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDataPoliciesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the policies.
     *
     * @param policies the policies
     * @return the DeleteDataPoliciesOptions builder
     */
    public Builder policies(String policies) {
      this.policies = policies;
      return this;
    }
  }

  protected DeleteDataPoliciesOptions() { }

  protected DeleteDataPoliciesOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
    policies = builder.policies;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataPoliciesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the policies.
   *
   * Data policies that must be deleted is passing as query param, for example: ?policies=policy1,policy2.
   *
   * @return the policies
   */
  public String policies() {
    return policies;
  }
}

