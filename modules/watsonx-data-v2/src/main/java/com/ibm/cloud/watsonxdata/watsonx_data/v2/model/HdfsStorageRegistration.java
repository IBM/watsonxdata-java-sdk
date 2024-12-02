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
 * HDFS storage registration.
 */
public class HdfsStorageRegistration extends GenericModel {

  /**
   * HDFS type.
   */
  public interface BucketType {
    /** hdfs. */
    String HDFS = "hdfs";
  }

  /**
   * managed by.
   */
  public interface ManagedBy {
    /** customer. */
    String CUSTOMER = "customer";
  }

  /**
   * mark hdfs active or inactive.
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
  protected String state;
  protected List<String> tags;

  protected HdfsStorageRegistration() { }

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
   * Gets the bucketDisplayName.
   *
   * HDFS storage display name.
   *
   * @return the bucketDisplayName
   */
  public String getBucketDisplayName() {
    return bucketDisplayName;
  }

  /**
   * Gets the bucketId.
   *
   * HDFS Storage ID auto generated during registration.
   *
   * @return the bucketId
   */
  public String getBucketId() {
    return bucketId;
  }

  /**
   * Gets the bucketType.
   *
   * HDFS type.
   *
   * @return the bucketType
   */
  public String getBucketType() {
    return bucketType;
  }

  /**
   * Gets the createdBy.
   *
   * Username who created the HDFS storage.
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
   * HDFS description.
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
   * Gets the state.
   *
   * mark hdfs active or inactive.
   *
   * @return the state
   */
  public String getState() {
    return state;
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

