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
 * database registration object.
 */
public class DatabaseRegistration extends GenericModel {

  protected List<String> actions;
  @SerializedName("associated_catalog")
  protected DatabaseCatalog associatedCatalog;
  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected String createdOn;
  @SerializedName("database_details")
  protected DatabaseDetails databaseDetails;
  @SerializedName("database_display_name")
  protected String databaseDisplayName;
  @SerializedName("database_id")
  protected String databaseId;
  @SerializedName("database_properties")
  protected List<DatabaseRegistrationDatabasePropertiesItems> databaseProperties;
  @SerializedName("database_type")
  protected String databaseType;
  protected String description;
  protected List<String> tags;

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
   * Gets the databaseDetails.
   *
   * database details.
   *
   * @return the databaseDetails
   */
  public DatabaseDetails getDatabaseDetails() {
    return databaseDetails;
  }

  /**
   * Gets the databaseDisplayName.
   *
   * Database display name.
   *
   * @return the databaseDisplayName
   */
  public String getDatabaseDisplayName() {
    return databaseDisplayName;
  }

  /**
   * Gets the databaseId.
   *
   * Database ID.
   *
   * @return the databaseId
   */
  public String getDatabaseId() {
    return databaseId;
  }

  /**
   * Gets the databaseProperties.
   *
   * This will hold all the properties for a custom database.
   *
   * @return the databaseProperties
   */
  public List<DatabaseRegistrationDatabasePropertiesItems> getDatabaseProperties() {
    return databaseProperties;
  }

  /**
   * Gets the databaseType.
   *
   * Connector type.
   *
   * @return the databaseType
   */
  public String getDatabaseType() {
    return databaseType;
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

