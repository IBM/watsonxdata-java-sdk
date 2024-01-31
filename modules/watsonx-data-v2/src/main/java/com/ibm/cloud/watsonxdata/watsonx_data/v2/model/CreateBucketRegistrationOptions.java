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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createBucketRegistration options.
 */
public class CreateBucketRegistrationOptions extends GenericModel {

  /**
   * bucket type.
   */
  public interface BucketType {
    /** aws_s3. */
    String AWS_S3 = "aws_s3";
    /** minio. */
    String MINIO = "minio";
    /** ibm_cos. */
    String IBM_COS = "ibm_cos";
    /** ibm_ceph. */
    String IBM_CEPH = "ibm_ceph";
  }

  /**
   * managed by.
   */
  public interface ManagedBy {
    /** ibm. */
    String IBM = "ibm";
    /** customer. */
    String CUSTOMER = "customer";
  }

  protected BucketDetails bucketDetails;
  protected String bucketType;
  protected String description;
  protected String managedBy;
  protected BucketCatalog associatedCatalog;
  protected String bucketDisplayName;
  protected String region;
  protected List<String> tags;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private BucketDetails bucketDetails;
    private String bucketType;
    private String description;
    private String managedBy;
    private BucketCatalog associatedCatalog;
    private String bucketDisplayName;
    private String region;
    private List<String> tags;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateBucketRegistrationOptions instance.
     *
     * @param createBucketRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateBucketRegistrationOptions createBucketRegistrationOptions) {
      this.bucketDetails = createBucketRegistrationOptions.bucketDetails;
      this.bucketType = createBucketRegistrationOptions.bucketType;
      this.description = createBucketRegistrationOptions.description;
      this.managedBy = createBucketRegistrationOptions.managedBy;
      this.associatedCatalog = createBucketRegistrationOptions.associatedCatalog;
      this.bucketDisplayName = createBucketRegistrationOptions.bucketDisplayName;
      this.region = createBucketRegistrationOptions.region;
      this.tags = createBucketRegistrationOptions.tags;
      this.authInstanceId = createBucketRegistrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketDetails the bucketDetails
     * @param bucketType the bucketType
     * @param description the description
     * @param managedBy the managedBy
     */
    public Builder(BucketDetails bucketDetails, String bucketType, String description, String managedBy) {
      this.bucketDetails = bucketDetails;
      this.bucketType = bucketType;
      this.description = description;
      this.managedBy = managedBy;
    }

    /**
     * Builds a CreateBucketRegistrationOptions.
     *
     * @return the new CreateBucketRegistrationOptions instance
     */
    public CreateBucketRegistrationOptions build() {
      return new CreateBucketRegistrationOptions(this);
    }

    /**
     * Adds a new element to tags.
     *
     * @param tags the new element to be added
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the bucketDetails.
     *
     * @param bucketDetails the bucketDetails
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder bucketDetails(BucketDetails bucketDetails) {
      this.bucketDetails = bucketDetails;
      return this;
    }

    /**
     * Set the bucketType.
     *
     * @param bucketType the bucketType
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder bucketType(String bucketType) {
      this.bucketType = bucketType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the managedBy.
     *
     * @param managedBy the managedBy
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder managedBy(String managedBy) {
      this.managedBy = managedBy;
      return this;
    }

    /**
     * Set the associatedCatalog.
     *
     * @param associatedCatalog the associatedCatalog
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder associatedCatalog(BucketCatalog associatedCatalog) {
      this.associatedCatalog = associatedCatalog;
      return this;
    }

    /**
     * Set the bucketDisplayName.
     *
     * @param bucketDisplayName the bucketDisplayName
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder bucketDisplayName(String bucketDisplayName) {
      this.bucketDisplayName = bucketDisplayName;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateBucketRegistrationOptions() { }

  protected CreateBucketRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketDetails,
      "bucketDetails cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketType,
      "bucketType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.managedBy,
      "managedBy cannot be null");
    bucketDetails = builder.bucketDetails;
    bucketType = builder.bucketType;
    description = builder.description;
    managedBy = builder.managedBy;
    associatedCatalog = builder.associatedCatalog;
    bucketDisplayName = builder.bucketDisplayName;
    region = builder.region;
    tags = builder.tags;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateBucketRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketDetails.
   *
   * bucket details.
   *
   * @return the bucketDetails
   */
  public BucketDetails bucketDetails() {
    return bucketDetails;
  }

  /**
   * Gets the bucketType.
   *
   * bucket type.
   *
   * @return the bucketType
   */
  public String bucketType() {
    return bucketType;
  }

  /**
   * Gets the description.
   *
   * bucket description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the managedBy.
   *
   * managed by.
   *
   * @return the managedBy
   */
  public String managedBy() {
    return managedBy;
  }

  /**
   * Gets the associatedCatalog.
   *
   * bucket catalog.
   *
   * @return the associatedCatalog
   */
  public BucketCatalog associatedCatalog() {
    return associatedCatalog;
  }

  /**
   * Gets the bucketDisplayName.
   *
   * bucket display name.
   *
   * @return the bucketDisplayName
   */
  public String bucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the region.
   *
   * region where the bucket is located.
   *
   * @return the region
   */
  public String region() {
    return region;
  }

  /**
   * Gets the tags.
   *
   * tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
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

