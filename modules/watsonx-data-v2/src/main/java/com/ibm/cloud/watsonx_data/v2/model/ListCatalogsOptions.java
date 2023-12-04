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
 * The listCatalogs options.
 */
public class ListCatalogsOptions extends GenericModel {

  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListCatalogsOptions instance.
     *
     * @param listCatalogsOptions the instance to initialize the Builder with
     */
    private Builder(ListCatalogsOptions listCatalogsOptions) {
      this.authInstanceId = listCatalogsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListCatalogsOptions.
     *
     * @return the new ListCatalogsOptions instance
     */
    public ListCatalogsOptions build() {
      return new ListCatalogsOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListCatalogsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListCatalogsOptions() { }

  protected ListCatalogsOptions(Builder builder) {
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListCatalogsOptions builder
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

