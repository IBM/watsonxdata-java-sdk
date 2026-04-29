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
 * Details of ingestion target table.
 */
public class TargetDetails extends GenericModel {

  protected String catalog;
  protected String schema;
  protected String table;
  @SerializedName("write_mode")
  protected String writeMode;
  @SerializedName("merge_on_read")
  protected Boolean mergeOnRead;
  @SerializedName("schema_mode")
  protected String schemaMode;
  @SerializedName("schema_infer")
  protected Boolean schemaInfer;
  @SerializedName("catalog_uri")
  protected String catalogUri;
  @SerializedName("bucket_details")
  protected BucketDetails bucketDetails;
  protected String location;
  @SerializedName("is_new_schema")
  protected Boolean isNewSchema;
  @SerializedName("is_new_table")
  protected Boolean isNewTable;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalog;
    private String schema;
    private String table;
    private String writeMode;
    private Boolean mergeOnRead;
    private String schemaMode;
    private Boolean schemaInfer;
    private String catalogUri;
    private BucketDetails bucketDetails;
    private String location;
    private Boolean isNewSchema;
    private Boolean isNewTable;

    /**
     * Instantiates a new Builder from an existing TargetDetails instance.
     *
     * @param targetDetails the instance to initialize the Builder with
     */
    private Builder(TargetDetails targetDetails) {
      this.catalog = targetDetails.catalog;
      this.schema = targetDetails.schema;
      this.table = targetDetails.table;
      this.writeMode = targetDetails.writeMode;
      this.mergeOnRead = targetDetails.mergeOnRead;
      this.schemaMode = targetDetails.schemaMode;
      this.schemaInfer = targetDetails.schemaInfer;
      this.catalogUri = targetDetails.catalogUri;
      this.bucketDetails = targetDetails.bucketDetails;
      this.location = targetDetails.location;
      this.isNewSchema = targetDetails.isNewSchema;
      this.isNewTable = targetDetails.isNewTable;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalog the catalog
     * @param schema the schema
     * @param table the table
     * @param writeMode the writeMode
     */
    public Builder(String catalog, String schema, String table, String writeMode) {
      this.catalog = catalog;
      this.schema = schema;
      this.table = table;
      this.writeMode = writeMode;
    }

    /**
     * Builds a TargetDetails.
     *
     * @return the new TargetDetails instance
     */
    public TargetDetails build() {
      return new TargetDetails(this);
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the TargetDetails builder
     */
    public Builder catalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the TargetDetails builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the table.
     *
     * @param table the table
     * @return the TargetDetails builder
     */
    public Builder table(String table) {
      this.table = table;
      return this;
    }

    /**
     * Set the writeMode.
     *
     * @param writeMode the writeMode
     * @return the TargetDetails builder
     */
    public Builder writeMode(String writeMode) {
      this.writeMode = writeMode;
      return this;
    }

    /**
     * Set the mergeOnRead.
     *
     * @param mergeOnRead the mergeOnRead
     * @return the TargetDetails builder
     */
    public Builder mergeOnRead(Boolean mergeOnRead) {
      this.mergeOnRead = mergeOnRead;
      return this;
    }

    /**
     * Set the schemaMode.
     *
     * @param schemaMode the schemaMode
     * @return the TargetDetails builder
     */
    public Builder schemaMode(String schemaMode) {
      this.schemaMode = schemaMode;
      return this;
    }

    /**
     * Set the schemaInfer.
     *
     * @param schemaInfer the schemaInfer
     * @return the TargetDetails builder
     */
    public Builder schemaInfer(Boolean schemaInfer) {
      this.schemaInfer = schemaInfer;
      return this;
    }

    /**
     * Set the catalogUri.
     *
     * @param catalogUri the catalogUri
     * @return the TargetDetails builder
     */
    public Builder catalogUri(String catalogUri) {
      this.catalogUri = catalogUri;
      return this;
    }

    /**
     * Set the bucketDetails.
     *
     * @param bucketDetails the bucketDetails
     * @return the TargetDetails builder
     */
    public Builder bucketDetails(BucketDetails bucketDetails) {
      this.bucketDetails = bucketDetails;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the TargetDetails builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the isNewSchema.
     *
     * @param isNewSchema the isNewSchema
     * @return the TargetDetails builder
     */
    public Builder isNewSchema(Boolean isNewSchema) {
      this.isNewSchema = isNewSchema;
      return this;
    }

    /**
     * Set the isNewTable.
     *
     * @param isNewTable the isNewTable
     * @return the TargetDetails builder
     */
    public Builder isNewTable(Boolean isNewTable) {
      this.isNewTable = isNewTable;
      return this;
    }
  }

  protected TargetDetails() { }

  protected TargetDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalog,
      "catalog cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schema,
      "schema cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.table,
      "table cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.writeMode,
      "writeMode cannot be null");
    catalog = builder.catalog;
    schema = builder.schema;
    table = builder.table;
    writeMode = builder.writeMode;
    mergeOnRead = builder.mergeOnRead;
    schemaMode = builder.schemaMode;
    schemaInfer = builder.schemaInfer;
    catalogUri = builder.catalogUri;
    bucketDetails = builder.bucketDetails;
    location = builder.location;
    isNewSchema = builder.isNewSchema;
    isNewTable = builder.isNewTable;
  }

  /**
   * New builder.
   *
   * @return a TargetDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * Catalog of target table.
   *
   * @return the catalog
   */
  public String catalog() {
    return catalog;
  }

  /**
   * Gets the schema.
   *
   * Schema of target table.
   *
   * @return the schema
   */
  public String schema() {
    return schema;
  }

  /**
   * Gets the table.
   *
   * Target table where files will be ingested.
   *
   * @return the table
   */
  public String table() {
    return table;
  }

  /**
   * Gets the writeMode.
   *
   * Append to existing data or overwrite it.
   *
   * @return the writeMode
   */
  public String writeMode() {
    return writeMode;
  }

  /**
   * Gets the mergeOnRead.
   *
   * Create table with 'merge-on-read' property.
   *
   * @return the mergeOnRead
   */
  public Boolean mergeOnRead() {
    return mergeOnRead;
  }

  /**
   * Gets the schemaMode.
   *
   * Controls schema validation mode. Use 'strict' to enforce exact schema match, or 'sloppy' to allow relaxed matching.
   *
   * @return the schemaMode
   */
  public String schemaMode() {
    return schemaMode;
  }

  /**
   * Gets the schemaInfer.
   *
   * Cast source column types to match target table types during append operations. When enabled, matching columns are
   * cast to target types to prevent type mismatch errors. Works independently of schema_mode.
   *
   * @return the schemaInfer
   */
  public Boolean schemaInfer() {
    return schemaInfer;
  }

  /**
   * Gets the catalogUri.
   *
   * Metastore catalog URI.
   *
   * @return the catalogUri
   */
  public String catalogUri() {
    return catalogUri;
  }

  /**
   * Gets the bucketDetails.
   *
   * Storage connection details.
   *
   * @return the bucketDetails
   */
  public BucketDetails bucketDetails() {
    return bucketDetails;
  }

  /**
   * Gets the location.
   *
   * Warehouse location.
   *
   * @return the location
   */
  public String location() {
    return location;
  }

  /**
   * Gets the isNewSchema.
   *
   * Determine if target schema was created in this ingestion job.
   *
   * @return the isNewSchema
   */
  public Boolean isNewSchema() {
    return isNewSchema;
  }

  /**
   * Gets the isNewTable.
   *
   * Determine if target table was created in this ingestion job.
   *
   * @return the isNewTable
   */
  public Boolean isNewTable() {
    return isNewTable;
  }
}

