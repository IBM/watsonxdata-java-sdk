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
 * The listMilvusDatabaseCollections options.
 */
public class ListMilvusDatabaseCollectionsOptions extends GenericModel {

  protected String serviceId;
  protected String databaseId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private String databaseId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListMilvusDatabaseCollectionsOptions instance.
     *
     * @param listMilvusDatabaseCollectionsOptions the instance to initialize the Builder with
     */
    private Builder(ListMilvusDatabaseCollectionsOptions listMilvusDatabaseCollectionsOptions) {
      this.serviceId = listMilvusDatabaseCollectionsOptions.serviceId;
      this.databaseId = listMilvusDatabaseCollectionsOptions.databaseId;
      this.authInstanceId = listMilvusDatabaseCollectionsOptions.authInstanceId;
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
     * @param databaseId the databaseId
     */
    public Builder(String serviceId, String databaseId) {
      this.serviceId = serviceId;
      this.databaseId = databaseId;
    }

    /**
     * Builds a ListMilvusDatabaseCollectionsOptions.
     *
     * @return the new ListMilvusDatabaseCollectionsOptions instance
     */
    public ListMilvusDatabaseCollectionsOptions build() {
      return new ListMilvusDatabaseCollectionsOptions(this);
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the ListMilvusDatabaseCollectionsOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the ListMilvusDatabaseCollectionsOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListMilvusDatabaseCollectionsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListMilvusDatabaseCollectionsOptions() { }

  protected ListMilvusDatabaseCollectionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serviceId,
      "serviceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.databaseId,
      "databaseId cannot be empty");
    serviceId = builder.serviceId;
    databaseId = builder.databaseId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListMilvusDatabaseCollectionsOptions builder
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
   * Gets the databaseId.
   *
   * database id.
   *
   * @return the databaseId
   */
  public String databaseId() {
    return databaseId;
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

