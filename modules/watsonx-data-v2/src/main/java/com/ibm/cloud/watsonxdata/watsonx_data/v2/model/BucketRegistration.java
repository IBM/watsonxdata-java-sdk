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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Bucket.
 */
public class BucketRegistration extends GenericModel {

  /**
   * bucket type.
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
    /** adls_gen1. */
    String ADLS_GEN1 = "adls_gen1";
    /** adls_gen2. */
    String ADLS_GEN2 = "adls_gen2";
    /** google_cs. */
    String GOOGLE_CS = "google_cs";
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

  protected List<String> actions;
  @SerializedName("associated_catalog")
  protected BucketCatalog associatedCatalog;
  @SerializedName("bucket_details")
  protected BucketDetails bucketDetails;
  @SerializedName("bucket_display_name")
  protected String bucketDisplayName;
  @SerializedName("bucket_id")
  protected String bucketId;
  @SerializedName("bucket_type")
  protected String bucketType;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected String createdOn;
  protected String description;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String region;
  protected String state;
  @SerializedName("storage_details")
  protected StorageDetails storageDetails;
  protected List<String> tags;

  protected BucketRegistration() { }

  /**
   * Gets the actions.
   *
   * Actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the associatedCatalog.
   *
   * bucket catalog.
   *
   * @return the associatedCatalog
   */
  public BucketCatalog getAssociatedCatalog() {
    return associatedCatalog;
  }

  /**
   * Gets the bucketDetails.
   *
   * bucket details.
   *
   * @return the bucketDetails
   */
  public BucketDetails getBucketDetails() {
    return bucketDetails;
  }

  /**
   * Gets the bucketDisplayName.
   *
   * bucket display name.
   *
   * @return the bucketDisplayName
   */
  public String getBucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the bucketId.
   *
   * bucket ID auto generated during bucket registration.
   *
   * @return the bucketId
   */
  public String getBucketId() {
    return bucketId;
  }

  /**
   * Gets the bucketType.
   *
   * bucket type.
   *
   * @return the bucketType
   */
  public String getBucketType() {
    return bucketType;
  }

  /**
   * Gets the createdBy.
   *
   * Username who created the bucket.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdOn.
   *
   * Creation date.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the description.
   *
   * bucket description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the managedBy.
   *
   * managed by.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return managedBy;
  }

  /**
   * Gets the region.
   *
   * Region where the bucket is located.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the state.
   *
   * mark bucket active or inactive.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the storageDetails.
   *
   * storage details.
   *
   * @return the storageDetails
   */
  public StorageDetails getStorageDetails() {
    return storageDetails;
  }

  /**
   * Gets the tags.
   *
   * tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }
}

