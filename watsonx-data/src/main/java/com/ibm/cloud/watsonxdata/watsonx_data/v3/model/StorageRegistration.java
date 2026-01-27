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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Storage.
 */
public class StorageRegistration extends GenericModel {

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
   * Mark storage as active or inactive.
   */
  public interface State {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
  }

  /**
   * storage type.
   */
  public interface Type {
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
    /** ibm_storage_scale. */
    String IBM_STORAGE_SCALE = "ibm_storage_scale";
    /** ozone. */
    String OZONE = "ozone";
    /** s3. */
    String S3 = "s3";
  }

  protected List<String> actions;
  @SerializedName("associated_catalogs")
  protected List<StorageCatalog> associatedCatalogs;
  protected StorageDetails connection;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  protected String id;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String region;
  protected String state;
  @SerializedName("storage_use")
  protected String storageUse;
  @SerializedName("system_storage_update_credentials")
  protected Boolean systemStorageUpdateCredentials;
  protected List<String> tags;
  protected String type;
  @SerializedName("vault_enabled")
  protected Boolean vaultEnabled;

  protected StorageRegistration() { }

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
   * Gets the associatedCatalogs.
   *
   * associated catalogs.
   *
   * @return the associatedCatalogs
   */
  public List<StorageCatalog> getAssociatedCatalogs() {
    return associatedCatalogs;
  }

  /**
   * Gets the connection.
   *
   * storage details.
   *
   * @return the connection
   */
  public StorageDetails getConnection() {
    return connection;
  }

  /**
   * Gets the createdAt.
   *
   * Creation date.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Username of the user who created the storage.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the description.
   *
   * storage description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the displayName.
   *
   * Storage display name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }
  /**
   * Gets the id.
   *
   * storage ID auto generated during storage registration.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * Region where the storage is located.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the state.
   *
   * Mark storage as active or inactive.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the storageUse.
   *
   * parameter to show whether the bucket is of acl or qhmm use.
   *
   * @return the storageUse
   */
  public String getStorageUse() {
    return storageUse;
  }

  /**
   * Gets the systemStorageUpdateCredentials.
   *
   * Boolean value to specify whether updating HMAC credentials for internal system storage.
   *
   * @return the systemStorageUpdateCredentials
   */
  public Boolean isSystemStorageUpdateCredentials() {
    return systemStorageUpdateCredentials;
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

  /**
   * Gets the type.
   *
   * storage type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vaultEnabled.
   *
   * Boolean value to specify whether vault enabled or not.
   *
   * @return the vaultEnabled
   */
  public Boolean isVaultEnabled() {
    return vaultEnabled;
  }
}

