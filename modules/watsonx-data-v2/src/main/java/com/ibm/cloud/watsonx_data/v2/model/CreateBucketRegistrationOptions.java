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

  /**
   * mark bucket active or inactive.
   */
  public interface State {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  protected BucketDetails bucketDetails;
  protected String bucketType;
  protected String catalogName;
  protected String description;
  protected String managedBy;
  protected String tableType;
  protected String bucketDisplayName;
  protected List<String> bucketTags;
  protected List<String> catalogTags;
  protected String region;
  protected String state;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private BucketDetails bucketDetails;
    private String bucketType;
    private String catalogName;
    private String description;
    private String managedBy;
    private String tableType;
    private String bucketDisplayName;
    private List<String> bucketTags;
    private List<String> catalogTags;
    private String region;
    private String state;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateBucketRegistrationOptions instance.
     *
     * @param createBucketRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateBucketRegistrationOptions createBucketRegistrationOptions) {
      this.bucketDetails = createBucketRegistrationOptions.bucketDetails;
      this.bucketType = createBucketRegistrationOptions.bucketType;
      this.catalogName = createBucketRegistrationOptions.catalogName;
      this.description = createBucketRegistrationOptions.description;
      this.managedBy = createBucketRegistrationOptions.managedBy;
      this.tableType = createBucketRegistrationOptions.tableType;
      this.bucketDisplayName = createBucketRegistrationOptions.bucketDisplayName;
      this.bucketTags = createBucketRegistrationOptions.bucketTags;
      this.catalogTags = createBucketRegistrationOptions.catalogTags;
      this.region = createBucketRegistrationOptions.region;
      this.state = createBucketRegistrationOptions.state;
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
     * @param catalogName the catalogName
     * @param description the description
     * @param managedBy the managedBy
     * @param tableType the tableType
     */
    public Builder(BucketDetails bucketDetails, String bucketType, String catalogName, String description, String managedBy, String tableType) {
      this.bucketDetails = bucketDetails;
      this.bucketType = bucketType;
      this.catalogName = catalogName;
      this.description = description;
      this.managedBy = managedBy;
      this.tableType = tableType;
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
     * Adds an bucketTags to bucketTags.
     *
     * @param bucketTags the new bucketTags
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder addBucketTags(String bucketTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bucketTags,
        "bucketTags cannot be null");
      if (this.bucketTags == null) {
        this.bucketTags = new ArrayList<String>();
      }
      this.bucketTags.add(bucketTags);
      return this;
    }

    /**
     * Adds an catalogTags to catalogTags.
     *
     * @param catalogTags the new catalogTags
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder addCatalogTags(String catalogTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogTags,
        "catalogTags cannot be null");
      if (this.catalogTags == null) {
        this.catalogTags = new ArrayList<String>();
      }
      this.catalogTags.add(catalogTags);
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
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
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
     * Set the tableType.
     *
     * @param tableType the tableType
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder tableType(String tableType) {
      this.tableType = tableType;
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
     * Set the bucketTags.
     * Existing bucketTags will be replaced.
     *
     * @param bucketTags the bucketTags
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder bucketTags(List<String> bucketTags) {
      this.bucketTags = bucketTags;
      return this;
    }

    /**
     * Set the catalogTags.
     * Existing catalogTags will be replaced.
     *
     * @param catalogTags the catalogTags
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder catalogTags(List<String> catalogTags) {
      this.catalogTags = catalogTags;
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
     * Set the state.
     *
     * @param state the state
     * @return the CreateBucketRegistrationOptions builder
     */
    public Builder state(String state) {
      this.state = state;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.managedBy,
      "managedBy cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableType,
      "tableType cannot be null");
    bucketDetails = builder.bucketDetails;
    bucketType = builder.bucketType;
    catalogName = builder.catalogName;
    description = builder.description;
    managedBy = builder.managedBy;
    tableType = builder.tableType;
    bucketDisplayName = builder.bucketDisplayName;
    bucketTags = builder.bucketTags;
    catalogTags = builder.catalogTags;
    region = builder.region;
    state = builder.state;
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
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
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
   * Gets the tableType.
   *
   * Table type.
   *
   * @return the tableType
   */
  public String tableType() {
    return tableType;
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
   * Gets the bucketTags.
   *
   * tags.
   *
   * @return the bucketTags
   */
  public List<String> bucketTags() {
    return bucketTags;
  }

  /**
   * Gets the catalogTags.
   *
   * catalog tags.
   *
   * @return the catalogTags
   */
  public List<String> catalogTags() {
    return catalogTags;
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
   * Gets the state.
   *
   * mark bucket active or inactive.
   *
   * @return the state
   */
  public String state() {
    return state;
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

