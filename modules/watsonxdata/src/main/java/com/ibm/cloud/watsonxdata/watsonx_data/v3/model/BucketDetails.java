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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Storage connection details.
 */
public class BucketDetails extends GenericModel {

  /**
   * Storage authentication type.
   */
  public interface AuthMode {
    /** aws_assume_role. */
    String AWS_ASSUME_ROLE = "aws_assume_role";
    /** aws_assume_role_with_webidentity. */
    String AWS_ASSUME_ROLE_WITH_WEBIDENTITY = "aws_assume_role_with_webidentity";
    /** hmac. */
    String HMAC = "hmac";
  }

  /**
   * Storage type.
   */
  public interface Type {
    /** adls_gen1. */
    String ADLS_GEN1 = "adls_gen1";
    /** adls_gen2. */
    String ADLS_GEN2 = "adls_gen2";
    /** ibm_cos. */
    String IBM_COS = "ibm_cos";
    /** ibm_ceph. */
    String IBM_CEPH = "ibm_ceph";
    /** ibm_storage_scale. */
    String IBM_STORAGE_SCALE = "ibm_storage_scale";
    /** minio. */
    String MINIO = "minio";
    /** amazon_s3. */
    String AMAZON_S3 = "amazon_s3";
    /** aws_s3. */
    String AWS_S3 = "aws_s3";
    /** google_cs. */
    String GOOGLE_CS = "google_cs";
    /** ozone. */
    String OZONE = "ozone";
    /** hdfs. */
    String HDFS = "hdfs";
    /** s3. */
    String S3 = "s3";
  }

  @SerializedName("access_key")
  protected String accessKey;
  @SerializedName("account_name")
  protected String accountName;
  @SerializedName("application_id")
  protected String applicationId;
  @SerializedName("container_name")
  protected String containerName;
  @SerializedName("directory_id")
  protected String directoryId;
  protected String endpoint;
  protected String region;
  @SerializedName("secret_key")
  protected String secretKey;
  @SerializedName("auth_mode")
  protected String authMode;
  @SerializedName("role_arn")
  protected String roleArn;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String name;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessKey;
    private String accountName;
    private String applicationId;
    private String containerName;
    private String directoryId;
    private String endpoint;
    private String region;
    private String secretKey;
    private String authMode;
    private String roleArn;
    private String managedBy;
    private String name;
    private String type;

    /**
     * Instantiates a new Builder from an existing BucketDetails instance.
     *
     * @param bucketDetails the instance to initialize the Builder with
     */
    private Builder(BucketDetails bucketDetails) {
      this.accessKey = bucketDetails.accessKey;
      this.accountName = bucketDetails.accountName;
      this.applicationId = bucketDetails.applicationId;
      this.containerName = bucketDetails.containerName;
      this.directoryId = bucketDetails.directoryId;
      this.endpoint = bucketDetails.endpoint;
      this.region = bucketDetails.region;
      this.secretKey = bucketDetails.secretKey;
      this.authMode = bucketDetails.authMode;
      this.roleArn = bucketDetails.roleArn;
      this.managedBy = bucketDetails.managedBy;
      this.name = bucketDetails.name;
      this.type = bucketDetails.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param name the name
     * @param type the type
     */
    public Builder(String name, String type) {
      this.name = name;
      this.type = type;
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
     * Set the accountName.
     *
     * @param accountName the accountName
     * @return the BucketDetails builder
     */
    public Builder accountName(String accountName) {
      this.accountName = accountName;
      return this;
    }

    /**
     * Set the applicationId.
     *
     * @param applicationId the applicationId
     * @return the BucketDetails builder
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }

    /**
     * Set the containerName.
     *
     * @param containerName the containerName
     * @return the BucketDetails builder
     */
    public Builder containerName(String containerName) {
      this.containerName = containerName;
      return this;
    }

    /**
     * Set the directoryId.
     *
     * @param directoryId the directoryId
     * @return the BucketDetails builder
     */
    public Builder directoryId(String directoryId) {
      this.directoryId = directoryId;
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
     * Set the region.
     *
     * @param region the region
     * @return the BucketDetails builder
     */
    public Builder region(String region) {
      this.region = region;
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

    /**
     * Set the authMode.
     *
     * @param authMode the authMode
     * @return the BucketDetails builder
     */
    public Builder authMode(String authMode) {
      this.authMode = authMode;
      return this;
    }

    /**
     * Set the roleArn.
     *
     * @param roleArn the roleArn
     * @return the BucketDetails builder
     */
    public Builder roleArn(String roleArn) {
      this.roleArn = roleArn;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the BucketDetails builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the BucketDetails builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the BucketDetails builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected BucketDetails() { }

  protected BucketDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    accessKey = builder.accessKey;
    accountName = builder.accountName;
    applicationId = builder.applicationId;
    containerName = builder.containerName;
    directoryId = builder.directoryId;
    endpoint = builder.endpoint;
    region = builder.region;
    secretKey = builder.secretKey;
    authMode = builder.authMode;
    roleArn = builder.roleArn;
    managedBy = builder.managedBy;
    name = builder.name;
    type = builder.type;
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
   * Storage access key.
   *
   * @return the accessKey
   */
  public String accessKey() {
    return accessKey;
  }

  /**
   * Gets the accountName.
   *
   * Storage account name.
   *
   * @return the accountName
   */
  public String accountName() {
    return accountName;
  }

  /**
   * Gets the applicationId.
   *
   * Storage application ID.
   *
   * @return the applicationId
   */
  public String applicationId() {
    return applicationId;
  }

  /**
   * Gets the containerName.
   *
   * Storage container name.
   *
   * @return the containerName
   */
  public String containerName() {
    return containerName;
  }

  /**
   * Gets the directoryId.
   *
   * Storage directory ID.
   *
   * @return the directoryId
   */
  public String directoryId() {
    return directoryId;
  }

  /**
   * Gets the endpoint.
   *
   * Storage endpoint.
   *
   * @return the endpoint
   */
  public String endpoint() {
    return endpoint;
  }

  /**
   * Gets the region.
   *
   * Storage region.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the secretKey.
   *
   * Storage secret key.
   *
   * @return the secretKey
   */
  public String secretKey() {
    return secretKey;
  }

  /**
   * Gets the authMode.
   *
   * Storage authentication type.
   *
   * @return the authMode
   */
  public String authMode() {
    return authMode;
  }

  /**
   * Gets the roleArn.
   *
   * STS Role ARN.
   *
   * @return the roleArn
   */
  public String roleArn() {
    return roleArn;
  }

  /**
   * Gets the managedBy.
   *
   * Bucket managed by.
   *
   * @return the managedBy
   */
  public String managedBy() {
    return managedBy;
  }

  /**
   * Gets the name.
   *
   * Storage name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the type.
   *
   * Storage type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

