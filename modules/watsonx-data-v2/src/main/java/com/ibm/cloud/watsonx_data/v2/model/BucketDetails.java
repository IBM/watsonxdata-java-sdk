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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * bucket details.
 */
public class BucketDetails extends GenericModel {

  @SerializedName("access_key")
  protected String accessKey;
  @SerializedName("bucket_name")
  protected String bucketName;
  protected String endpoint;
  @SerializedName("secret_key")
  protected String secretKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessKey;
    private String bucketName;
    private String endpoint;
    private String secretKey;

    /**
     * Instantiates a new Builder from an existing BucketDetails instance.
     *
     * @param bucketDetails the instance to initialize the Builder with
     */
    private Builder(BucketDetails bucketDetails) {
      this.accessKey = bucketDetails.accessKey;
      this.bucketName = bucketDetails.bucketName;
      this.endpoint = bucketDetails.endpoint;
      this.secretKey = bucketDetails.secretKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketName the bucketName
     */
    public Builder(String bucketName) {
      this.bucketName = bucketName;
    }

    /**
     * Builds a BucketDetails.
     *
     * @return the new BucketDetails instance
     */
    public BucketDetails build() {
      return new BucketDetails(this);
    }

    /**
     * Set the accessKey.
     *
     * @param accessKey the accessKey
     * @return the BucketDetails builder
     */
    public Builder accessKey(String accessKey) {
      this.accessKey = accessKey;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the BucketDetails builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the BucketDetails builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the secretKey.
     *
     * @param secretKey the secretKey
     * @return the BucketDetails builder
     */
    public Builder secretKey(String secretKey) {
      this.secretKey = secretKey;
      return this;
    }
  }

  protected BucketDetails() { }

  protected BucketDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    accessKey = builder.accessKey;
    bucketName = builder.bucketName;
    endpoint = builder.endpoint;
    secretKey = builder.secretKey;
  }

  /**
   * New builder.
   *
   * @return a BucketDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessKey.
   *
   * Access key ID, encrypted during bucket registration.
   *
   * @return the accessKey
   */
  public String accessKey() {
    return accessKey;
  }

  /**
   * Gets the bucketName.
   *
   * actual bucket name.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the endpoint.
   *
   * Cos endpoint.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the secretKey.
   *
   * Secret access key, encrypted during bucket registration.
   *
   * @return the secretKey
   */
  public String secretKey() {
    return secretKey;
  }
}

