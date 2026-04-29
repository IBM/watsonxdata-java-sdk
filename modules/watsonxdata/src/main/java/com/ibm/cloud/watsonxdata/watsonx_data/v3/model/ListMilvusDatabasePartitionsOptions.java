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
 * The listMilvusDatabasePartitions options.
 */
public class ListMilvusDatabasePartitionsOptions extends GenericModel {

  protected String serviceId;
  protected String databaseId;
  protected String collectionName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private String databaseId;
    private String collectionName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListMilvusDatabasePartitionsOptions instance.
     *
     * @param listMilvusDatabasePartitionsOptions the instance to initialize the Builder with
     */
    private Builder(ListMilvusDatabasePartitionsOptions listMilvusDatabasePartitionsOptions) {
      this.serviceId = listMilvusDatabasePartitionsOptions.serviceId;
      this.databaseId = listMilvusDatabasePartitionsOptions.databaseId;
      this.collectionName = listMilvusDatabasePartitionsOptions.collectionName;
      this.authInstanceId = listMilvusDatabasePartitionsOptions.authInstanceId;
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
     * @param collectionName the collectionName
     */
    public Builder(String serviceId, String databaseId, String collectionName) {
      this.serviceId = serviceId;
      this.databaseId = databaseId;
      this.collectionName = collectionName;
    }

    /**
     * Builds a ListMilvusDatabasePartitionsOptions.
     *
     * @return the new ListMilvusDatabasePartitionsOptions instance
     */
    public ListMilvusDatabasePartitionsOptions build() {
      return new ListMilvusDatabasePartitionsOptions(this);
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the ListMilvusDatabasePartitionsOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the ListMilvusDatabasePartitionsOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the collectionName.
     *
     * @param collectionName the collectionName
     * @return the ListMilvusDatabasePartitionsOptions builder
     */
    public Builder collectionName(String collectionName) {
      this.collectionName = collectionName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListMilvusDatabasePartitionsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListMilvusDatabasePartitionsOptions() { }

  protected ListMilvusDatabasePartitionsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serviceId,
      "serviceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.databaseId,
      "databaseId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.collectionName,
      "collectionName cannot be empty");
    serviceId = builder.serviceId;
    databaseId = builder.databaseId;
    collectionName = builder.collectionName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListMilvusDatabasePartitionsOptions builder
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
   * Gets the collectionName.
   *
   * collection name.
   *
   * @return the collectionName
   */
  public String collectionName() {
    return collectionName;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

