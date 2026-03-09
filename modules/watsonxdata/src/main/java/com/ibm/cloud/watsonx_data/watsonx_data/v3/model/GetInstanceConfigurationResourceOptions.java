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
 * The getInstanceConfigurationResource options.
 */
public class GetInstanceConfigurationResourceOptions extends GenericModel {

  protected String target;
  protected String id;
  protected String database;
  protected Boolean internalHost;
  protected Boolean privateHost;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private String id;
    private String database;
    private Boolean internalHost;
    private Boolean privateHost;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetInstanceConfigurationResourceOptions instance.
     *
     * @param getInstanceConfigurationResourceOptions the instance to initialize the Builder with
     */
    private Builder(GetInstanceConfigurationResourceOptions getInstanceConfigurationResourceOptions) {
      this.target = getInstanceConfigurationResourceOptions.target;
      this.id = getInstanceConfigurationResourceOptions.id;
      this.database = getInstanceConfigurationResourceOptions.database;
      this.internalHost = getInstanceConfigurationResourceOptions.internalHost;
      this.privateHost = getInstanceConfigurationResourceOptions.privateHost;
      this.authInstanceId = getInstanceConfigurationResourceOptions.authInstanceId;
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
     * @param id the id
     */
    public Builder(String target, String id) {
      this.target = target;
      this.id = id;
    }

    /**
     * Builds a GetInstanceConfigurationResourceOptions.
     *
     * @return the new GetInstanceConfigurationResourceOptions instance
     */
    public GetInstanceConfigurationResourceOptions build() {
      return new GetInstanceConfigurationResourceOptions(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the GetInstanceConfigurationResourceOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetInstanceConfigurationResourceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the database.
     *
     * @param database the database
     * @return the GetInstanceConfigurationResourceOptions builder
     */
    public Builder database(String database) {
      this.database = database;
      return this;
    }

    /**
     * Set the internalHost.
     *
     * @param internalHost the internalHost
     * @return the GetInstanceConfigurationResourceOptions builder
     */
    public Builder internalHost(Boolean internalHost) {
      this.internalHost = internalHost;
      return this;
    }

    /**
     * Set the privateHost.
     *
     * @param privateHost the privateHost
     * @return the GetInstanceConfigurationResourceOptions builder
     */
    public Builder privateHost(Boolean privateHost) {
      this.privateHost = privateHost;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetInstanceConfigurationResourceOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetInstanceConfigurationResourceOptions() { }

  protected GetInstanceConfigurationResourceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    target = builder.target;
    id = builder.id;
    database = builder.database;
    internalHost = builder.internalHost;
    privateHost = builder.privateHost;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetInstanceConfigurationResourceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * Target type (e.g., 'cpd', 'generic') to determine the kind of the resources details to be shown for the resources
   * of the instance.
   *
   * @return the target
   */
  public String target() {
    return target;
  }

  /**
   * Gets the id.
   *
   * Specifies the id of the resource.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the database.
   *
   * To filter based on Database name (Supported only for resource type Milvus and target cpd``).
   *
   * @return the database
   */
  public String database() {
    return database;
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
   * Gets the privateHost.
   *
   * Use private endpoint.
   *
   * @return the privateHost
   */
  public Boolean privateHost() {
    return privateHost;
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

