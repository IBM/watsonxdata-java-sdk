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
 * The listInstanceDetails options.
 */
public class ListInstanceDetailsOptions extends GenericModel {

  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListInstanceDetailsOptions instance.
     *
     * @param listInstanceDetailsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceDetailsOptions listInstanceDetailsOptions) {
      this.authInstanceId = listInstanceDetailsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListInstanceDetailsOptions.
     *
     * @return the new ListInstanceDetailsOptions instance
     */
    public ListInstanceDetailsOptions build() {
      return new ListInstanceDetailsOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListInstanceDetailsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListInstanceDetailsOptions() { }

  protected ListInstanceDetailsOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceDetailsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

