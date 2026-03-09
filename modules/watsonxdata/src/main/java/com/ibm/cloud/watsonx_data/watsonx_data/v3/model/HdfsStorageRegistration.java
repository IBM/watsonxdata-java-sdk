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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * HDFS storage registration.
 */
public class HdfsStorageRegistration extends GenericModel {

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

  /**
   * HDFS type.
   */
  public interface Type {
    /** hdfs. */
    String HDFS = "hdfs";
  }

  protected List<String> actions;
  @SerializedName("associated_catalog")
  protected StorageCatalog associatedCatalog;
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
  protected String state;
  protected List<String> tags;
  protected String type;

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
   * storage catalog.
   *
   * @return the associatedCatalog
   */
  public StorageCatalog getAssociatedCatalog() {
    return associatedCatalog;
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
   * Username who created the HDFS storage.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
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
   * Gets the displayName.
   *
   * HDFS storage display name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the id.
   *
   * HDFS Storage ID auto generated during registration.
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

  /**
   * Gets the type.
   *
   * HDFS type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

