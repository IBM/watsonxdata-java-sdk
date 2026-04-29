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
 * The listStorageRegistrationsObjects options.
 */
public class ListStorageRegistrationsObjectsOptions extends GenericModel {

  protected String storageId;
  protected String authInstanceId;
  protected String path;
  protected Boolean paginated;
  protected Long pageSize;
  protected String prefix;
  protected String startAfter;

  /**
   * Builder.
   */
  public static class Builder {
    private String storageId;
    private String authInstanceId;
    private String path;
    private Boolean paginated;
    private Long pageSize;
    private String prefix;
    private String startAfter;

    /**
     * Instantiates a new Builder from an existing ListStorageRegistrationsObjectsOptions instance.
     *
     * @param listStorageRegistrationsObjectsOptions the instance to initialize the Builder with
     */
    private Builder(ListStorageRegistrationsObjectsOptions listStorageRegistrationsObjectsOptions) {
      this.storageId = listStorageRegistrationsObjectsOptions.storageId;
      this.authInstanceId = listStorageRegistrationsObjectsOptions.authInstanceId;
      this.path = listStorageRegistrationsObjectsOptions.path;
      this.paginated = listStorageRegistrationsObjectsOptions.paginated;
      this.pageSize = listStorageRegistrationsObjectsOptions.pageSize;
      this.prefix = listStorageRegistrationsObjectsOptions.prefix;
      this.startAfter = listStorageRegistrationsObjectsOptions.startAfter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param storageId the storageId
     */
    public Builder(String storageId) {
      this.storageId = storageId;
    }

    /**
     * Builds a ListStorageRegistrationsObjectsOptions.
     *
     * @return the new ListStorageRegistrationsObjectsOptions instance
     */
    public ListStorageRegistrationsObjectsOptions build() {
      return new ListStorageRegistrationsObjectsOptions(this);
    }

    /**
     * Set the storageId.
     *
     * @param storageId the storageId
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder storageId(String storageId) {
      this.storageId = storageId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the paginated.
     *
     * @param paginated the paginated
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder paginated(Boolean paginated) {
      this.paginated = paginated;
      return this;
    }

    /**
     * Set the pageSize.
     *
     * @param pageSize the pageSize
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder pageSize(long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }

    /**
     * Set the startAfter.
     *
     * @param startAfter the startAfter
     * @return the ListStorageRegistrationsObjectsOptions builder
     */
    public Builder startAfter(String startAfter) {
      this.startAfter = startAfter;
      return this;
    }
  }

  protected ListStorageRegistrationsObjectsOptions() { }

  protected ListStorageRegistrationsObjectsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.storageId,
      "storageId cannot be empty");
    storageId = builder.storageId;
    authInstanceId = builder.authInstanceId;
    path = builder.path;
    paginated = builder.paginated;
    pageSize = builder.pageSize;
    prefix = builder.prefix;
    startAfter = builder.startAfter;
  }

  /**
   * New builder.
   *
   * @return a ListStorageRegistrationsObjectsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the storageId.
   *
   * storage id.
   *
   * @return the storageId
   */
  public String storageId() {
    return storageId;
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

  /**
   * Gets the path.
   *
   * path.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the paginated.
   *
   * data to be paginated or not.
   *
   * @return the paginated
   */
  public Boolean paginated() {
    return paginated;
  }

  /**
   * Gets the pageSize.
   *
   * The number of items per page (default is 1000 , max 1000).
   *
   * @return the pageSize
   */
  public Long pageSize() {
    return pageSize;
  }

  /**
   * Gets the prefix.
   *
   * prefix to filter the objects by.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }

  /**
   * Gets the startAfter.
   *
   * StartAfter is where you want Amazon S3 to start listing from.
   *
   * @return the startAfter
   */
  public String startAfter() {
    return startAfter;
  }
}

