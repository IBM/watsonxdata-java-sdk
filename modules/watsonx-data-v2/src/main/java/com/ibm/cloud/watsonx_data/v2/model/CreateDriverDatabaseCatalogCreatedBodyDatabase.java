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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * response database.
 */
public class CreateDriverDatabaseCatalogCreatedBodyDatabase extends GenericModel {

  @SerializedName("database_display_name")
  protected String databaseDisplayName;
  @SerializedName("database_id")
  protected String databaseId;

  protected CreateDriverDatabaseCatalogCreatedBodyDatabase() { }

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
}

