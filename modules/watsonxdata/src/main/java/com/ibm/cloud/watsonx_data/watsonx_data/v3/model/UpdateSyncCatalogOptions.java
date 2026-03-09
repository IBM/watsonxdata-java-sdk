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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSyncCatalog options.
 */
public class UpdateSyncCatalogOptions extends GenericModel {

  protected String id;
  protected Boolean autoAddNewTables;
  protected Boolean registerNewTables;
  protected Boolean syncExistingTables;
  protected Boolean syncIcebergMd;
  protected String syncPath;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean autoAddNewTables;
    private Boolean registerNewTables;
    private Boolean syncExistingTables;
    private Boolean syncIcebergMd;
    private String syncPath;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateSyncCatalogOptions instance.
     *
     * @param updateSyncCatalogOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSyncCatalogOptions updateSyncCatalogOptions) {
      this.id = updateSyncCatalogOptions.id;
      this.autoAddNewTables = updateSyncCatalogOptions.autoAddNewTables;
      this.registerNewTables = updateSyncCatalogOptions.registerNewTables;
      this.syncExistingTables = updateSyncCatalogOptions.syncExistingTables;
      this.syncIcebergMd = updateSyncCatalogOptions.syncIcebergMd;
      this.syncPath = updateSyncCatalogOptions.syncPath;
      this.authInstanceId = updateSyncCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateSyncCatalogOptions.
     *
     * @return the new UpdateSyncCatalogOptions instance
     */
    public UpdateSyncCatalogOptions build() {
      return new UpdateSyncCatalogOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the autoAddNewTables.
     *
     * @param autoAddNewTables the autoAddNewTables
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder autoAddNewTables(Boolean autoAddNewTables) {
      this.autoAddNewTables = autoAddNewTables;
      return this;
    }

    /**
     * Set the registerNewTables.
     *
     * @param registerNewTables the registerNewTables
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder registerNewTables(Boolean registerNewTables) {
      this.registerNewTables = registerNewTables;
      return this;
    }

    /**
     * Set the syncExistingTables.
     *
     * @param syncExistingTables the syncExistingTables
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder syncExistingTables(Boolean syncExistingTables) {
      this.syncExistingTables = syncExistingTables;
      return this;
    }

    /**
     * Set the syncIcebergMd.
     *
     * @param syncIcebergMd the syncIcebergMd
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder syncIcebergMd(Boolean syncIcebergMd) {
      this.syncIcebergMd = syncIcebergMd;
      return this;
    }

    /**
     * Set the syncPath.
     *
     * @param syncPath the syncPath
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder syncPath(String syncPath) {
      this.syncPath = syncPath;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateSyncCatalogOptions() { }

  protected UpdateSyncCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    autoAddNewTables = builder.autoAddNewTables;
    registerNewTables = builder.registerNewTables;
    syncExistingTables = builder.syncExistingTables;
    syncIcebergMd = builder.syncIcebergMd;
    syncPath = builder.syncPath;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateSyncCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * catalog ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the autoAddNewTables.
   *
   * Automatically detect and add new tables to the system when they appear in the source.
   *
   * @return the autoAddNewTables
   */
  public Boolean autoAddNewTables() {
    return autoAddNewTables;
  }

  /**
   * Gets the registerNewTables.
   *
   * Register newly discovered tables in the system so they can be tracked and managed.
   *
   * @return the registerNewTables
   */
  public Boolean registerNewTables() {
    return registerNewTables;
  }

  /**
   * Gets the syncExistingTables.
   *
   * Synchronize and update metadata for existing tables that are already registered.
   *
   * @return the syncExistingTables
   */
  public Boolean syncExistingTables() {
    return syncExistingTables;
  }

  /**
   * Gets the syncIcebergMd.
   *
   * Indicates whether to synchronize metadata from Iceberg tables with the system.
   *
   * @return the syncIcebergMd
   */
  public Boolean syncIcebergMd() {
    return syncIcebergMd;
  }

  /**
   * Gets the syncPath.
   *
   * Path within the bucket from where the details will be sync-ed.
   *
   * @return the syncPath
   */
  public String syncPath() {
    return syncPath;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

