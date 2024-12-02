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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * catalogs definition.
 */
public class SyncCatalogs extends GenericModel {

  @SerializedName("auto_add_new_tables")
  protected Boolean autoAddNewTables;
  @SerializedName("sync_iceberg_md")
  protected Boolean syncIcebergMd;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoAddNewTables;
    private Boolean syncIcebergMd;

    /**
     * Instantiates a new Builder from an existing SyncCatalogs instance.
     *
     * @param syncCatalogs the instance to initialize the Builder with
     */
    private Builder(SyncCatalogs syncCatalogs) {
      this.autoAddNewTables = syncCatalogs.autoAddNewTables;
      this.syncIcebergMd = syncCatalogs.syncIcebergMd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SyncCatalogs.
     *
     * @return the new SyncCatalogs instance
     */
    public SyncCatalogs build() {
      return new SyncCatalogs(this);
    }

    /**
     * Set the autoAddNewTables.
     *
     * @param autoAddNewTables the autoAddNewTables
     * @return the SyncCatalogs builder
     */
    public Builder autoAddNewTables(Boolean autoAddNewTables) {
      this.autoAddNewTables = autoAddNewTables;
      return this;
    }

    /**
     * Set the syncIcebergMd.
     *
     * @param syncIcebergMd the syncIcebergMd
     * @return the SyncCatalogs builder
     */
    public Builder syncIcebergMd(Boolean syncIcebergMd) {
      this.syncIcebergMd = syncIcebergMd;
      return this;
    }
  }

  protected SyncCatalogs() { }

  protected SyncCatalogs(Builder builder) {
    autoAddNewTables = builder.autoAddNewTables;
    syncIcebergMd = builder.syncIcebergMd;
  }

  /**
   * New builder.
   *
   * @return a SyncCatalogs builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the autoAddNewTables.
   *
   * Auto add new table.
   *
   * @return the autoAddNewTables
   */
  public Boolean autoAddNewTables() {
    return autoAddNewTables;
  }

  /**
   * Gets the syncIcebergMd.
   *
   * Sync iceberg metadata.
   *
   * @return the syncIcebergMd
   */
  public Boolean syncIcebergMd() {
    return syncIcebergMd;
  }

  /**
   * Construct a JSON merge-patch from the SyncCatalogs.
   *
   * Note that properties of the SyncCatalogs with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SyncCatalogs
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

