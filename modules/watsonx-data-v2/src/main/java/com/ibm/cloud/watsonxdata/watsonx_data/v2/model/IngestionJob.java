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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Ingestion job.
 */
public class IngestionJob extends GenericModel {

  /**
   * Source file types (parquet or csv).
   */
  public interface SourceFileType {
    /** csv. */
    String CSV = "csv";
    /** parquet. */
    String PARQUET = "parquet";
  }

  @SerializedName("create_if_not_exist")
  protected Boolean createIfNotExist;
  @SerializedName("csv_property")
  protected IngestionJobCsvProperty csvProperty;
  protected String details;
  @SerializedName("end_timestamp")
  protected String endTimestamp;
  @SerializedName("engine_id")
  protected String engineId;
  @SerializedName("engine_name")
  protected String engineName;
  @SerializedName("execute_config")
  protected IngestionJobExecuteConfig executeConfig;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("partition_by")
  protected String partitionBy;
  protected String schema;
  @SerializedName("source_data_files")
  protected String sourceDataFiles;
  @SerializedName("source_file_type")
  protected String sourceFileType;
  @SerializedName("start_timestamp")
  protected String startTimestamp;
  protected String status;
  @SerializedName("target_table")
  protected String targetTable;
  protected String username;
  @SerializedName("validate_csv_header")
  protected Boolean validateCsvHeader;

  protected IngestionJob() { }

  /**
   * Gets the createIfNotExist.
   *
   * Create new target table (if True); Insert into pre-existing target table (if False).
   *
   * @return the createIfNotExist
   */
  public Boolean isCreateIfNotExist() {
    return createIfNotExist;
  }

  /**
   * Gets the csvProperty.
   *
   * Ingestion CSV properties.
   *
   * @return the csvProperty
   */
  public IngestionJobCsvProperty getCsvProperty() {
    return csvProperty;
  }

  /**
   * Gets the details.
   *
   * Error messages of failed ingestion job.
   *
   * @return the details
   */
  public String getDetails() {
    return details;
  }

  /**
   * Gets the endTimestamp.
   *
   * Unix timestamp of ingestion job completing.
   *
   * @return the endTimestamp
   */
  public String getEndTimestamp() {
    return endTimestamp;
  }

  /**
   * Gets the engineId.
   *
   * ID of the spark engine to be used for ingestion.
   *
   * @return the engineId
   */
  public String getEngineId() {
    return engineId;
  }

  /**
   * Gets the engineName.
   *
   * Name of the spark engine to be used for ingestion.
   *
   * @return the engineName
   */
  public String getEngineName() {
    return engineName;
  }

  /**
   * Gets the executeConfig.
   *
   * Ingestion engine configuration.
   *
   * @return the executeConfig
   */
  public IngestionJobExecuteConfig getExecuteConfig() {
    return executeConfig;
  }

  /**
   * Gets the instanceId.
   *
   * Instance ID of the lakehouse where ingestion job is executed.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the jobId.
   *
   * Job ID of the ingestion job.
   *
   * @return the jobId
   */
  public String getJobId() {
    return jobId;
  }

  /**
   * Gets the partitionBy.
   *
   * partition by expression of the target table.
   *
   * @return the partitionBy
   */
  public String getPartitionBy() {
    return partitionBy;
  }

  /**
   * Gets the schema.
   *
   * Schema definition of the source table.
   *
   * @return the schema
   */
  public String getSchema() {
    return schema;
  }

  /**
   * Gets the sourceDataFiles.
   *
   * Source data location of the ingestion job.
   *
   * @return the sourceDataFiles
   */
  public String getSourceDataFiles() {
    return sourceDataFiles;
  }

  /**
   * Gets the sourceFileType.
   *
   * Source file types (parquet or csv).
   *
   * @return the sourceFileType
   */
  public String getSourceFileType() {
    return sourceFileType;
  }

  /**
   * Gets the startTimestamp.
   *
   * Unix timestamp of ingestion job starting.
   *
   * @return the startTimestamp
   */
  public String getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * Gets the status.
   *
   * Current state of ingestion job.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the targetTable.
   *
   * Target table name in format catalog.schema.table.
   *
   * @return the targetTable
   */
  public String getTargetTable() {
    return targetTable;
  }

  /**
   * Gets the username.
   *
   * Ingestion job user.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the validateCsvHeader.
   *
   * Validate CSV header if the target table exist.
   *
   * @return the validateCsvHeader
   */
  public Boolean isValidateCsvHeader() {
    return validateCsvHeader;
  }
}

