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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Define the catalog details.
 */
public class CatalogDetail extends GenericModel {

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
  @SerializedName("associated_buckets")
  protected List<String> associatedBuckets;
  @SerializedName("associated_databases")
  protected List<String> associatedDatabases;
  @SerializedName("associated_engines")
  protected List<String> associatedEngines;
  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("catalog_type")
  protected String catalogType;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected String createdOn;
  protected String description;
  protected String hostname;
  @SerializedName("last_sync_at")
  protected String lastSyncAt;
  @SerializedName("managed_by")
  protected String managedBy;
  protected String metastore;
  protected String port;
  protected String status;
  @SerializedName("sync_description")
  protected String syncDescription;
  @SerializedName("sync_exception")
  protected List<String> syncException;
  @SerializedName("sync_status")
  protected String syncStatus;
  protected List<String> tags;
  @SerializedName("thrift_uri")
  protected String thriftUri;

  protected CatalogDetail() { }

  /**
   * Gets the actions.
   *
   * list of allowed actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the associatedBuckets.
   *
   * Associated buckets items.
   *
   * @return the associatedBuckets
   */
  public List<String> getAssociatedBuckets() {
    return associatedBuckets;
  }

  /**
   * Gets the associatedDatabases.
   *
   * Associated databases items.
   *
   * @return the associatedDatabases
   */
  public List<String> getAssociatedDatabases() {
    return associatedDatabases;
  }

  /**
   * Gets the associatedEngines.
   *
   * Associated engines items.
   *
   * @return the associatedEngines
   */
  public List<String> getAssociatedEngines() {
    return associatedEngines;
  }

  /**
   * Gets the catalogName.
   *
   * Name for the catalog.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the catalogType.
   *
   * Table type.
   *
   * @return the catalogType
   */
  public String getCatalogType() {
    return catalogType;
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
   * Gets the createdOn.
   *
   * Created on.
   *
   * @return the createdOn
   */
  public String getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the description.
   *
   * Description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the hostname.
   *
   * IBM thrift uri hostname.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the lastSyncAt.
   *
   * Last sync time.
   *
   * @return the lastSyncAt
   */
  public String getLastSyncAt() {
    return lastSyncAt;
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
   * Gets the metastore.
   *
   * Catalog name.
   *
   * @return the metastore
   */
  public String getMetastore() {
    return metastore;
  }

  /**
   * Gets the port.
   *
   * IBM thrift uri port.
   *
   * @return the port
   */
  public String getPort() {
    return port;
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
   * Gets the syncDescription.
   *
   * Sync description.
   *
   * @return the syncDescription
   */
  public String getSyncDescription() {
    return syncDescription;
  }

  /**
   * Gets the syncException.
   *
   * Tables not sync because data is corrupted.
   *
   * @return the syncException
   */
  public List<String> getSyncException() {
    return syncException;
  }

  /**
   * Gets the syncStatus.
   *
   * Sync status.
   *
   * @return the syncStatus
   */
  public String getSyncStatus() {
    return syncStatus;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the thriftUri.
   *
   * Customer thrift uri.
   *
   * @return the thriftUri
   */
  public String getThriftUri() {
    return thriftUri;
  }
}

