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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Iceberg source table information.
 */
public class IcebergSourceTable extends GenericModel {

  @SerializedName("schema_name")
  protected String schemaName;
  @SerializedName("table_name")
  protected String tableName;
  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("warehouse_name")
  protected String warehouseName;
  @SerializedName("snapshot_id")
  protected Long snapshotId;

  /**
   * Builder.
   */
  public static class Builder {
    private String schemaName;
    private String tableName;
    private String catalogName;
    private String warehouseName;
    private Long snapshotId;

    /**
     * Instantiates a new Builder from an existing IcebergSourceTable instance.
     *
     * @param icebergSourceTable the instance to initialize the Builder with
     */
    private Builder(IcebergSourceTable icebergSourceTable) {
      this.schemaName = icebergSourceTable.schemaName;
      this.tableName = icebergSourceTable.tableName;
      this.catalogName = icebergSourceTable.catalogName;
      this.warehouseName = icebergSourceTable.warehouseName;
      this.snapshotId = icebergSourceTable.snapshotId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IcebergSourceTable.
     *
     * @return the new IcebergSourceTable instance
     */
    public IcebergSourceTable build() {
      return new IcebergSourceTable(this);
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the IcebergSourceTable builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the IcebergSourceTable builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the IcebergSourceTable builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the warehouseName.
     *
     * @param warehouseName the warehouseName
     * @return the IcebergSourceTable builder
     */
    public Builder warehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
      return this;
    }

    /**
     * Set the snapshotId.
     *
     * @param snapshotId the snapshotId
     * @return the IcebergSourceTable builder
     */
    public Builder snapshotId(long snapshotId) {
      this.snapshotId = snapshotId;
      return this;
    }
  }

  protected IcebergSourceTable() { }

  protected IcebergSourceTable(Builder builder) {
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    catalogName = builder.catalogName;
    warehouseName = builder.warehouseName;
    snapshotId = builder.snapshotId;
  }

  /**
   * New builder.
   *
   * @return a IcebergSourceTable builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the schemaName.
   *
   * Iceberg schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the tableName.
   *
   * Iceberg table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
  }

  /**
   * Gets the catalogName.
   *
   * Iceberg catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the warehouseName.
   *
   * Iceberg warehouse name.
   *
   * @return the warehouseName
   */
  public String warehouseName() {
    return warehouseName;
  }

  /**
   * Gets the snapshotId.
   *
   * Iceberg snapshot ID.
   *
   * @return the snapshotId
   */
  public Long snapshotId() {
    return snapshotId;
  }
}

