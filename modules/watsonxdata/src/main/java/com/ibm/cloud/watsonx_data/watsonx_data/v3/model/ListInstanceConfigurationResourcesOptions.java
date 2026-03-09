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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listInstanceConfigurationResources options.
 */
public class ListInstanceConfigurationResourcesOptions extends GenericModel {

  protected String target;
  protected Boolean internalHost;
  protected List<String> type;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private Boolean internalHost;
    private List<String> type;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListInstanceConfigurationResourcesOptions instance.
     *
     * @param listInstanceConfigurationResourcesOptions the instance to initialize the Builder with
     */
    private Builder(ListInstanceConfigurationResourcesOptions listInstanceConfigurationResourcesOptions) {
      this.target = listInstanceConfigurationResourcesOptions.target;
      this.internalHost = listInstanceConfigurationResourcesOptions.internalHost;
      this.type = listInstanceConfigurationResourcesOptions.type;
      this.authInstanceId = listInstanceConfigurationResourcesOptions.authInstanceId;
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
     * Builds a ListInstanceConfigurationResourcesOptions.
     *
     * @return the new ListInstanceConfigurationResourcesOptions instance
     */
    public ListInstanceConfigurationResourcesOptions build() {
      return new ListInstanceConfigurationResourcesOptions(this);
    }

    /**
     * Adds a new element to type.
     *
     * @param type the new element to be added
     * @return the ListInstanceConfigurationResourcesOptions builder
     */
    public Builder addType(String type) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(type,
        "type cannot be null");
      if (this.type == null) {
        this.type = new ArrayList<String>();
      }
      this.type.add(type);
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the ListInstanceConfigurationResourcesOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the internalHost.
     *
     * @param internalHost the internalHost
     * @return the ListInstanceConfigurationResourcesOptions builder
     */
    public Builder internalHost(Boolean internalHost) {
      this.internalHost = internalHost;
      return this;
    }

    /**
     * Set the type.
     * Existing type will be replaced.
     *
     * @param type the type
     * @return the ListInstanceConfigurationResourcesOptions builder
     */
    public Builder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListInstanceConfigurationResourcesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListInstanceConfigurationResourcesOptions() { }

  protected ListInstanceConfigurationResourcesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    target = builder.target;
    internalHost = builder.internalHost;
    type = builder.type;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListInstanceConfigurationResourcesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * Target type (e.g., `cpd`, `generic`) to determine the kind of the resources details to be shown for the resources
   * of the instance.
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the internalHost.
   *
   * Internal host applicable only for type `cpd`.
   *
   * @return the internalHost
   */
  public Boolean internalHost() {
    return internalHost;
  }

  /**
   * Gets the type.
   *
   * To filter based on the type of the resource (e.g., 'milvus', 'presto').
   *
   * @return the type
   */
  public List<String> type() {
    return type;
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

