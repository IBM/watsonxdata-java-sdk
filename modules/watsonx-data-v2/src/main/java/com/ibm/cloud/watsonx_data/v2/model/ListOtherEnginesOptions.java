/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listOtherEngines options.
 */
public class ListOtherEnginesOptions extends GenericModel {

  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListOtherEnginesOptions instance.
     *
     * @param listOtherEnginesOptions the instance to initialize the Builder with
     */
    private Builder(ListOtherEnginesOptions listOtherEnginesOptions) {
      this.authInstanceId = listOtherEnginesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListOtherEnginesOptions.
     *
     * @return the new ListOtherEnginesOptions instance
     */
    public ListOtherEnginesOptions build() {
      return new ListOtherEnginesOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListOtherEnginesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListOtherEnginesOptions() { }

  protected ListOtherEnginesOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListOtherEnginesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

