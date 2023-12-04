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
 * The testBucketConnection options.
 */
public class TestBucketConnectionOptions extends GenericModel {

  /**
   * type of bucket that is selected.
   */
  public interface BucketType {
    /** amazon_s3. */
    String AMAZON_S3 = "amazon_s3";
    /** aws_s3. */
    String AWS_S3 = "aws_s3";
    /** minio. */
    String MINIO = "minio";
    /** ibm_cos. */
    String IBM_COS = "ibm_cos";
    /** ibm_ceph. */
    String IBM_CEPH = "ibm_ceph";
  }

  protected String accessKey;
  protected String bucketName;
  protected String bucketType;
  protected String endpoint;
  protected String region;
  protected String secretKey;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessKey;
    private String bucketName;
    private String bucketType;
    private String endpoint;
    private String region;
    private String secretKey;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing TestBucketConnectionOptions instance.
     *
     * @param testBucketConnectionOptions the instance to initialize the Builder with
     */
    private Builder(TestBucketConnectionOptions testBucketConnectionOptions) {
      this.accessKey = testBucketConnectionOptions.accessKey;
      this.bucketName = testBucketConnectionOptions.bucketName;
      this.bucketType = testBucketConnectionOptions.bucketType;
      this.endpoint = testBucketConnectionOptions.endpoint;
      this.region = testBucketConnectionOptions.region;
      this.secretKey = testBucketConnectionOptions.secretKey;
      this.authInstanceId = testBucketConnectionOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accessKey the accessKey
     * @param bucketName the bucketName
     * @param bucketType the bucketType
     * @param endpoint the endpoint
     * @param region the region
     * @param secretKey the secretKey
     */
    public Builder(String accessKey, String bucketName, String bucketType, String endpoint, String region, String secretKey) {
      this.accessKey = accessKey;
      this.bucketName = bucketName;
      this.bucketType = bucketType;
      this.endpoint = endpoint;
      this.region = region;
      this.secretKey = secretKey;
    }

    /**
     * Builds a TestBucketConnectionOptions.
     *
     * @return the new TestBucketConnectionOptions instance
     */
    public TestBucketConnectionOptions build() {
      return new TestBucketConnectionOptions(this);
    }

    /**
     * Set the accessKey.
     *
     * @param accessKey the accessKey
     * @return the TestBucketConnectionOptions builder
     */
    public Builder accessKey(String accessKey) {
      this.accessKey = accessKey;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the TestBucketConnectionOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the bucketType.
     *
     * @param bucketType the bucketType
     * @return the TestBucketConnectionOptions builder
     */
    public Builder bucketType(String bucketType) {
      this.bucketType = bucketType;
      return this;
    }

    /**
     * Set the endpoint.
     *
     * @param endpoint the endpoint
     * @return the TestBucketConnectionOptions builder
     */
    public Builder endpoint(String endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the TestBucketConnectionOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the secretKey.
     *
     * @param secretKey the secretKey
     * @return the TestBucketConnectionOptions builder
     */
    public Builder secretKey(String secretKey) {
      this.secretKey = secretKey;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the TestBucketConnectionOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected TestBucketConnectionOptions() { }

  protected TestBucketConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.accessKey,
      "accessKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketType,
      "bucketType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.endpoint,
      "endpoint cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.region,
      "region cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secretKey,
      "secretKey cannot be null");
    accessKey = builder.accessKey;
    bucketName = builder.bucketName;
    bucketType = builder.bucketType;
    endpoint = builder.endpoint;
    region = builder.region;
    secretKey = builder.secretKey;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a TestBucketConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessKey.
   *
   * access key to access the bucket.
   *
   * @return the accessKey
   */
  public String accessKey() {
    return accessKey;
  }

  /**
   * Gets the bucketName.
   *
   * name of the bucket to be checked.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the bucketType.
   *
   * type of bucket that is selected.
   *
   * @return the bucketType
   */
  public String bucketType() {
    return bucketType;
  }

  /**
   * Gets the endpoint.
   *
   * endpoint to reach the bucket.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the region.
   *
   * bucket region.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the secretKey.
   *
   * secret key to access the bucket.
   *
   * @return the secretKey
   */
  public String secretKey() {
    return secretKey;
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

