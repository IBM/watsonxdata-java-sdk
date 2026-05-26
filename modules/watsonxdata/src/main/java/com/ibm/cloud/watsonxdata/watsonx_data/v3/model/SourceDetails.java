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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of ingestion source files.
 */
public class SourceDetails extends GenericModel {

  /**
   * Source file types (parquet, csv, json, orc, avro or text).
   */
  public interface FileType {
    /** csv. */
    String CSV = "csv";
    /** parquet. */
    String PARQUET = "parquet";
    /** json. */
    String JSON = "json";
    /** orc. */
    String ORC = "orc";
    /** avro. */
    String AVRO = "avro";
    /** txt. */
    String TXT = "txt";
  }

  /**
   * Ingestion source type.
   */
  public interface SourceType {
    /** iceberg. */
    String ICEBERG = "iceberg";
    /** db. */
    String DB = "db";
    /** local. */
    String LOCAL = "local";
    /** storage. */
    String STORAGE = "storage";
  }

  @SerializedName("file_paths")
  protected String filePaths;
  @SerializedName("file_type")
  protected String fileType;
  @SerializedName("source_type")
  protected String sourceType;
  protected List<IngestionSchemaResponse> schema;
  @SerializedName("schema_transformations")
  protected List<SchemaTransformation> schemaTransformations;
  @SerializedName("schema_name")
  protected String schemaName;
  @SerializedName("table_name")
  protected String tableName;
  @SerializedName("bucket_details")
  protected BucketDetails bucketDetails;
  @SerializedName("iceberg_source_table")
  protected IcebergSourceTable icebergSourceTable;
  @SerializedName("source_database")
  protected DbConnectionModel sourceDatabase;
  @SerializedName("file_format_properties")
  protected FileFormatProperties fileFormatProperties;
  @SerializedName("is_local_ingestion")
  protected Boolean isLocalIngestion;

  /**
   * Builder.
   */
  public static class Builder {
    private String filePaths;
    private String fileType;
    private String sourceType;
    private List<SchemaTransformation> schemaTransformations;
    private String schemaName;
    private String tableName;
    private BucketDetails bucketDetails;
    private IcebergSourceTable icebergSourceTable;
    private DbConnectionModel sourceDatabase;
    private FileFormatProperties fileFormatProperties;
    private Boolean isLocalIngestion;

    /**
     * Instantiates a new Builder from an existing SourceDetails instance.
     *
     * @param sourceDetails the instance to initialize the Builder with
     */
    private Builder(SourceDetails sourceDetails) {
      this.filePaths = sourceDetails.filePaths;
      this.fileType = sourceDetails.fileType;
      this.sourceType = sourceDetails.sourceType;
      this.schemaTransformations = sourceDetails.schemaTransformations;
      this.schemaName = sourceDetails.schemaName;
      this.tableName = sourceDetails.tableName;
      this.bucketDetails = sourceDetails.bucketDetails;
      this.icebergSourceTable = sourceDetails.icebergSourceTable;
      this.sourceDatabase = sourceDetails.sourceDatabase;
      this.fileFormatProperties = sourceDetails.fileFormatProperties;
      this.isLocalIngestion = sourceDetails.isLocalIngestion;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param sourceType the sourceType
     */
    public Builder(String sourceType) {
      this.sourceType = sourceType;
    }

    /**
     * Builds a SourceDetails.
     *
     * @return the new SourceDetails instance
     */
    public SourceDetails build() {
      return new SourceDetails(this);
    }

    /**
     * Adds a new element to schemaTransformations.
     *
     * @param schemaTransformations the new element to be added
     * @return the SourceDetails builder
     */
    public Builder addSchemaTransformations(SchemaTransformation schemaTransformations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(schemaTransformations,
        "schemaTransformations cannot be null");
      if (this.schemaTransformations == null) {
        this.schemaTransformations = new ArrayList<SchemaTransformation>();
      }
      this.schemaTransformations.add(schemaTransformations);
      return this;
    }

    /**
     * Set the filePaths.
     *
     * @param filePaths the filePaths
     * @return the SourceDetails builder
     */
    public Builder filePaths(String filePaths) {
      this.filePaths = filePaths;
      return this;
    }

    /**
     * Set the fileType.
     *
     * @param fileType the fileType
     * @return the SourceDetails builder
     */
    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }

    /**
     * Set the sourceType.
     *
     * @param sourceType the sourceType
     * @return the SourceDetails builder
     */
    public Builder sourceType(String sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    /**
     * Set the schemaTransformations.
     * Existing schemaTransformations will be replaced.
     *
     * @param schemaTransformations the schemaTransformations
     * @return the SourceDetails builder
     */
    public Builder schemaTransformations(List<SchemaTransformation> schemaTransformations) {
      this.schemaTransformations = schemaTransformations;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the SourceDetails builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the SourceDetails builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the bucketDetails.
     *
     * @param bucketDetails the bucketDetails
     * @return the SourceDetails builder
     */
    public Builder bucketDetails(BucketDetails bucketDetails) {
      this.bucketDetails = bucketDetails;
      return this;
    }

    /**
     * Set the icebergSourceTable.
     *
     * @param icebergSourceTable the icebergSourceTable
     * @return the SourceDetails builder
     */
    public Builder icebergSourceTable(IcebergSourceTable icebergSourceTable) {
      this.icebergSourceTable = icebergSourceTable;
      return this;
    }

    /**
     * Set the sourceDatabase.
     *
     * @param sourceDatabase the sourceDatabase
     * @return the SourceDetails builder
     */
    public Builder sourceDatabase(DbConnectionModel sourceDatabase) {
      this.sourceDatabase = sourceDatabase;
      return this;
    }

    /**
     * Set the fileFormatProperties.
     *
     * @param fileFormatProperties the fileFormatProperties
     * @return the SourceDetails builder
     */
    public Builder fileFormatProperties(FileFormatProperties fileFormatProperties) {
      this.fileFormatProperties = fileFormatProperties;
      return this;
    }

    /**
     * Set the isLocalIngestion.
     *
     * @param isLocalIngestion the isLocalIngestion
     * @return the SourceDetails builder
     */
    public Builder isLocalIngestion(Boolean isLocalIngestion) {
      this.isLocalIngestion = isLocalIngestion;
      return this;
    }
  }

  protected SourceDetails() { }

  protected SourceDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceType,
      "sourceType cannot be null");
    filePaths = builder.filePaths;
    fileType = builder.fileType;
    sourceType = builder.sourceType;
    schemaTransformations = builder.schemaTransformations;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    bucketDetails = builder.bucketDetails;
    icebergSourceTable = builder.icebergSourceTable;
    sourceDatabase = builder.sourceDatabase;
    fileFormatProperties = builder.fileFormatProperties;
    isLocalIngestion = builder.isLocalIngestion;
  }

  /**
   * New builder.
   *
   * @return a SourceDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the filePaths.
   *
   * Comma separated source file or directory path.
   *
   * @return the filePaths
   */
  public String filePaths() {
    return filePaths;
  }

  /**
   * Gets the fileType.
   *
   * Source file types (parquet, csv, json, orc, avro or text).
   *
   * @return the fileType
   */
  public String fileType() {
    return fileType;
  }

  /**
   * Gets the sourceType.
   *
   * Ingestion source type.
   *
   * @return the sourceType
   */
  public String sourceType() {
    return sourceType;
  }

  /**
   * Gets the schema.
   *
   * List of schema information derived from file. Updates to a schema must be added to schema_transformations.
   *
   * @return the schema
   */
  public List<IngestionSchemaResponse> schema() {
    return schema;
  }

  /**
   * Gets the schemaTransformations.
   *
   * List of additions/transformations applied to the schema.
   *
   * @return the schemaTransformations
   */
  public List<SchemaTransformation> schemaTransformations() {
    return schemaTransformations;
  }

  /**
   * Gets the schemaName.
   *
   * Source DB Schema Name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the tableName.
   *
   * Source DB Table Name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
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
   * Gets the icebergSourceTable.
   *
   * Iceberg source table information.
   *
   * @return the icebergSourceTable
   */
  public IcebergSourceTable icebergSourceTable() {
    return icebergSourceTable;
  }

  /**
   * Gets the sourceDatabase.
   *
   * Database credentials model.
   *
   * @return the sourceDatabase
   */
  public DbConnectionModel sourceDatabase() {
    return sourceDatabase;
  }

  /**
   * Gets the fileFormatProperties.
   *
   * Options used to read CSV or Text file.
   *
   * @return the fileFormatProperties
   */
  public FileFormatProperties fileFormatProperties() {
    return fileFormatProperties;
  }

  /**
   * Gets the isLocalIngestion.
   *
   * Determine if ingestion job is a local ingestion job.
   *
   * @return the isLocalIngestion
   */
  public Boolean isLocalIngestion() {
    return isLocalIngestion;
  }
}

