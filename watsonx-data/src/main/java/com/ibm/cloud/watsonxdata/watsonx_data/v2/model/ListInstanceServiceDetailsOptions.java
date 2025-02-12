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
 * The listInstanceServiceDetails options.
 */
public class ListInstanceServiceDetailsOptions extends GenericModel {

  protected String target;
  protected Boolean internalHost;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private Boolean internalHost;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListInstanceServiceDetailsOptions instance.
     *
     * @param listInstanceServiceDetailsOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceServiceDetailsOptions listInstanceServiceDetailsOptions) {
      this.target = listInstanceServiceDetailsOptions.target;
      this.internalHost = listInstanceServiceDetailsOptions.internalHost;
      this.authInstanceId = listInstanceServiceDetailsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param target the target
     */
    public Builder(String target) {
      this.target = target;
    }

    /**
     * Builds a ListInstanceServiceDetailsOptions.
     *
     * @return the new ListInstanceServiceDetailsOptions instance
     */
    public ListInstanceServiceDetailsOptions build() {
      return new ListInstanceServiceDetailsOptions(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the ListInstanceServiceDetailsOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the internalHost.
     *
     * @param internalHost the internalHost
     * @return the ListInstanceServiceDetailsOptions builder
     */
    public Builder internalHost(Boolean internalHost) {
      this.internalHost = internalHost;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListInstanceServiceDetailsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListInstanceServiceDetailsOptions() { }

  protected ListInstanceServiceDetailsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    target = builder.target;
    internalHost = builder.internalHost;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceServiceDetailsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * Target type (e.g., 'cpd', 'generic').
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the internalHost.
   *
   * Internal host.
   *
   * @return the internalHost
   */
  public Boolean internalHost() {
    return internalHost;
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
}

