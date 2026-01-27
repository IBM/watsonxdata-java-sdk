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
 * Define the catalog details.
 */
public class Catalog extends GenericModel {

  /**
   * allowed action.
   */
  public interface Actions {
    /** select. */
    String SELECT = "select";
    /** use. */
    String USE = "use";
    /** show. */
    String SHOW = "show";
    /** view. */
    String VIEW = "view";
    /** create. */
    String CREATE = "create";
    /** drop. */
    String DROP = "drop";
    /** alter. */
    String ALTER = "alter";
    /** insert. */
    String INSERT = "insert";
    /** grant. */
    String GRANT = "grant";
    /** revoke. */
    String REVOKE = "revoke";
    /** delete. */
    String DELETE = "delete";
    /** update. */
    String UPDATE = "update";
    /** remove. */
    String REMOVE = "remove";
    /** register. */
    String REGISTER = "register";
  }

  /**
   * Managed by.
   */
  public interface ManagedBy {
    /** ibm. */
    String IBM = "ibm";
    /** customer. */
    String CUSTOMER = "customer";
  }

  protected List<String> actions;
  @SerializedName("associated_databases")
  protected List<String> associatedDatabases;
  @SerializedName("associated_engines")
  protected List<String> associatedEngines;
  @SerializedName("associated_storage")
  protected List<String> associatedStorage;
  @SerializedName("base_path")
  protected String basePath;
  @SerializedName("catalog_sync_metadata")
  protected CatalogSyncMetadata catalogSyncMetadata;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("days_left")
  protected String daysLeft;
  protected String description;
  @SerializedName("is_gfs")
  protected Boolean isGfs;
  @SerializedName("location_uri")
  protected String locationUri;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("mds_connection_information")
  protected MdsConnectionInfo mdsConnectionInformation;
  protected String metastore;
  protected String name;
  protected String status;
  protected List<String> tags;
  protected String type;

  protected Catalog() { }

  /**
   * Gets the actions.
   *
   * List of allowed actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the associatedDatabases.
   *
   * List of associated databases.
   *
   * @return the associatedDatabases
   */
  public List<String> getAssociatedDatabases() {
    return associatedDatabases;
  }

  /**
   * Gets the associatedEngines.
   *
   * List of associated engines.
   *
   * @return the associatedEngines
   */
  public List<String> getAssociatedEngines() {
    return associatedEngines;
  }

  /**
   * Gets the associatedStorage.
   *
   * List of associated storage.
   *
   * @return the associatedStorage
   */
  public List<String> getAssociatedStorage() {
    return associatedStorage;
  }

  /**
   * Gets the basePath.
   *
   * catalog base path.
   *
   * @return the basePath
   */
  public String getBasePath() {
    return basePath;
  }

  /**
   * Gets the catalogSyncMetadata.
   *
   * Catalog synchronization metadata.
   *
   * @return the catalogSyncMetadata
   */
  public CatalogSyncMetadata getCatalogSyncMetadata() {
    return catalogSyncMetadata;
  }

  /**
   * Gets the createdAt.
   *
   * Epoch timestamp when the catalog was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Created by.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the daysLeft.
   *
   * Days left for catalog dissociation in case of vulnerability.
   *
   * @return the daysLeft
   */
  public String getDaysLeft() {
    return daysLeft;
  }

  /**
   * Gets the description.
   *
   * The description if added, for the catalog.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the isGfs.
   *
   * Flag to check if catalog is federated or not.
   *
   * @return the isGfs
   */
  public Boolean isIsGfs() {
    return isGfs;
  }

  /**
   * Gets the locationUri.
   *
   * catalog location uri.
   *
   * @return the locationUri
   */
  public String getLocationUri() {
    return locationUri;
  }

  /**
   * Gets the managedBy.
   *
   * Managed by.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return managedBy;
  }

  /**
   * Gets the mdsConnectionInformation.
   *
   * MDS Thrift server connection details.
   *
   * @return the mdsConnectionInformation
   */
  public MdsConnectionInfo getMdsConnectionInformation() {
    return mdsConnectionInformation;
  }

  /**
   * Gets the metastore.
   *
   * Underlying catalog or storage backend used for metadata operations.For example,if the database type is
   * `hive_hadoop2` or `iceberg`, the metastore is often set to `glue`.For HDFS, the metastore may be set to `hdfs`.
   *
   * @return the metastore
   */
  public String getMetastore() {
    return metastore;
  }

  /**
   * Gets the name.
   *
   * Name of the catalog.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the status.
   *
   * Catalog status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the tags.
   *
   * List of tags added to this catalog.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the type.
   *
   * Catalog type like iceberg,hive etc.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

