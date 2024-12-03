/*
 * (C) Copyright IBM Corp. 2024.
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
 * The listMilvusServiceDatabases options.
 */
public class ListMilvusServiceDatabasesOptions extends GenericModel {

  protected String serviceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListMilvusServiceDatabasesOptions instance.
     *
     * @param listMilvusServiceDatabasesOptions the instance to initialize the Builder with
     */
    private Builder(ListMilvusServiceDatabasesOptions listMilvusServiceDatabasesOptions) {
      this.serviceId = listMilvusServiceDatabasesOptions.serviceId;
      this.authInstanceId = listMilvusServiceDatabasesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param serviceId the serviceId
     */
    public Builder(String serviceId) {
      this.serviceId = serviceId;
    }

    /**
     * Builds a ListMilvusServiceDatabasesOptions.
     *
     * @return the new ListMilvusServiceDatabasesOptions instance
     */
    public ListMilvusServiceDatabasesOptions build() {
      return new ListMilvusServiceDatabasesOptions(this);
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the ListMilvusServiceDatabasesOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListMilvusServiceDatabasesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListMilvusServiceDatabasesOptions() { }

  protected ListMilvusServiceDatabasesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serviceId,
      "serviceId cannot be empty");
    serviceId = builder.serviceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListMilvusServiceDatabasesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the serviceId.
   *
   * service id.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
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

