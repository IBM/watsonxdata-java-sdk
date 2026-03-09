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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Database registration object.
 */
public class DatabaseRegistration extends GenericModel {

  protected List<String> actions;
  @SerializedName("associated_catalog")
  protected DatabaseCatalog associatedCatalog;
  @SerializedName("catalog_name")
  protected String catalogName;
  protected DatabaseDetails connection;
  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  protected String id;
  @SerializedName("properties")
  protected List<DatabaseRegistrationDatabasePropertiesItems> xProperties;
  protected List<DatabaseRegistrationTablesItems> tables;
  protected List<String> tags;
  protected List<DatabaseRegistrationTopicsItems> topics;
  protected String type;
  @SerializedName("vault_enabled")
  protected Boolean vaultEnabled;

  protected DatabaseRegistration() { }

  /**
   * Gets the actions.
   *
   * actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the associatedCatalog.
   *
   * database catalog.
   *
   * @return the associatedCatalog
   */
  public DatabaseCatalog getAssociatedCatalog() {
    return associatedCatalog;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the connection.
   *
   * database details.
   *
   * @return the connection
   */
  public DatabaseDetails getConnection() {
    return connection;
  }

  /**
   * Gets the createdAt.
   *
   * Created on.
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
   * Gets the description.
   *
   * Database description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the displayName.
   *
   * Database display name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the id.
   *
   * Database ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the xProperties.
   *
   * This will hold all the properties for a custom database.
   *
   * @return the xProperties
   */
  public List<DatabaseRegistrationDatabasePropertiesItems> getXProperties() {
    return xProperties;
  }

  /**
   * Gets the tables.
   *
   * List of tables.
   *
   * @return the tables
   */
  public List<DatabaseRegistrationTablesItems> getTables() {
    return tables;
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
   * Gets the topics.
   *
   * List of topics.
   *
   * @return the topics
   */
  public List<DatabaseRegistrationTopicsItems> getTopics() {
    return topics;
  }

  /**
   * Gets the type.
   *
   * Connector type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the vaultEnabled.
   *
   * vault enabled or not.
   *
   * @return the vaultEnabled
   */
  public Boolean isVaultEnabled() {
    return vaultEnabled;
  }
}

