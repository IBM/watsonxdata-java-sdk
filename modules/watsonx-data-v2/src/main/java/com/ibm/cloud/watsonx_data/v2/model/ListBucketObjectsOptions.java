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
 * The listBucketObjects options.
 */
public class ListBucketObjectsOptions extends GenericModel {

  protected String bucketId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListBucketObjectsOptions instance.
     *
     * @param listBucketObjectsOptions the instance to initialize the Builder with
     */
    private Builder(ListBucketObjectsOptions listBucketObjectsOptions) {
      this.bucketId = listBucketObjectsOptions.bucketId;
      this.authInstanceId = listBucketObjectsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketId the bucketId
     */
    public Builder(String bucketId) {
      this.bucketId = bucketId;
    }

    /**
     * Builds a ListBucketObjectsOptions.
     *
     * @return the new ListBucketObjectsOptions instance
     */
    public ListBucketObjectsOptions build() {
      return new ListBucketObjectsOptions(this);
    }

    /**
     * Set the bucketId.
     *
     * @param bucketId the bucketId
     * @return the ListBucketObjectsOptions builder
     */
    public Builder bucketId(String bucketId) {
      this.bucketId = bucketId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListBucketObjectsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListBucketObjectsOptions() { }

  protected ListBucketObjectsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bucketId,
      "bucketId cannot be empty");
    bucketId = builder.bucketId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListBucketObjectsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * bucket id.
   *
   * @return the bucketId
   */
  public String bucketId() {
    return bucketId;
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

