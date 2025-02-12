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
 * The getServiceDetail options.
 */
public class GetServiceDetailOptions extends GenericModel {

  protected String target;
  protected String engineOrServiceType;
  protected String id;
  protected String database;
  protected Boolean internalHost;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;
    private String engineOrServiceType;
    private String id;
    private String database;
    private Boolean internalHost;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetServiceDetailOptions instance.
     *
     * @param getServiceDetailOptions the instance to initialize the Builder with
     */
    private Builder(GetServiceDetailOptions getServiceDetailOptions) {
      this.target = getServiceDetailOptions.target;
      this.engineOrServiceType = getServiceDetailOptions.engineOrServiceType;
      this.id = getServiceDetailOptions.id;
      this.database = getServiceDetailOptions.database;
      this.internalHost = getServiceDetailOptions.internalHost;
      this.authInstanceId = getServiceDetailOptions.authInstanceId;
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
     * @param engineOrServiceType the engineOrServiceType
     * @param id the id
     */
    public Builder(String target, String engineOrServiceType, String id) {
      this.target = target;
      this.engineOrServiceType = engineOrServiceType;
      this.id = id;
    }

    /**
     * Builds a GetServiceDetailOptions.
     *
     * @return the new GetServiceDetailOptions instance
     */
    public GetServiceDetailOptions build() {
      return new GetServiceDetailOptions(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the GetServiceDetailOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }

    /**
     * Set the engineOrServiceType.
     *
     * @param engineOrServiceType the engineOrServiceType
     * @return the GetServiceDetailOptions builder
     */
    public Builder engineOrServiceType(String engineOrServiceType) {
      this.engineOrServiceType = engineOrServiceType;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetServiceDetailOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the database.
     *
     * @param database the database
     * @return the GetServiceDetailOptions builder
     */
    public Builder database(String database) {
      this.database = database;
      return this;
    }

    /**
     * Set the internalHost.
     *
     * @param internalHost the internalHost
     * @return the GetServiceDetailOptions builder
     */
    public Builder internalHost(Boolean internalHost) {
      this.internalHost = internalHost;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetServiceDetailOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetServiceDetailOptions() { }

  protected GetServiceDetailOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.target,
      "target cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineOrServiceType,
      "engineOrServiceType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    target = builder.target;
    engineOrServiceType = builder.engineOrServiceType;
    id = builder.id;
    database = builder.database;
    internalHost = builder.internalHost;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetServiceDetailOptions builder
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
   * Gets the engineOrServiceType.
   *
   * Type of engine or service (e.g., 'milvus', 'presto').
   *
   * @return the engineOrServiceType
   */
  public String engineOrServiceType() {
    return engineOrServiceType;
  }

  /**
   * Gets the id.
   *
   * Service ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the database.
   *
   * Database name in milvus.
   *
   * @return the database
   */
  public String database() {
    return database;
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
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

