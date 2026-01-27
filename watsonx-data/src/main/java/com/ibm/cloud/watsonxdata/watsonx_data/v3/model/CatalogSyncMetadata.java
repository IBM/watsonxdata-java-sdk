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
 * Catalog synchronization metadata.
 */
public class CatalogSyncMetadata extends GenericModel {

  @SerializedName("last_sync_at")
  protected String lastSyncAt;
  @SerializedName("sync_description")
  protected String syncDescription;
  @SerializedName("sync_exception")
  protected List<String> syncException;
  @SerializedName("sync_status")
  protected String syncStatus;

  protected CatalogSyncMetadata() { }

  /**
   * Gets the lastSyncAt.
   *
   * The time the catalog was last synced at, in epoch timestamp format. If no sync has happened, this property will be
   * empty.
   *
   * @return the lastSyncAt
   */
  public String getLastSyncAt() {
    return lastSyncAt;
  }

  /**
   * Gets the syncDescription.
   *
   * Catalog synchronization status message.
   *
   * @return the syncDescription
   */
  public String getSyncDescription() {
    return syncDescription;
  }

  /**
   * Gets the syncException.
   *
   * Catalog synchronization error messages.
   *
   * @return the syncException
   */
  public List<String> getSyncException() {
    return syncException;
  }

  /**
   * Gets the syncStatus.
   *
   * Catalog synchronization status.
   *
   * @return the syncStatus
   */
  public String getSyncStatus() {
    return syncStatus;
  }
}

