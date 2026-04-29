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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Ingestion job.
 */
public class IngestionJob extends GenericModel {

  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("job_id")
  protected String jobId;
  @SerializedName("application_id")
  protected String applicationId;
  protected String username;
  @SerializedName("start_timestamp")
  protected Date startTimestamp;
  @SerializedName("end_timestamp")
  protected Date endTimestamp;
  protected String status;
  @SerializedName("source_data_files")
  protected String sourceDataFiles;
  @SerializedName("target_table")
  protected String targetTable;
  protected String details;
  @SerializedName("engine_logs")
  protected String engineLogs;
  @SerializedName("engine_id")
  protected String engineId;
  @SerializedName("engine_name")
  protected String engineName;
  @SerializedName("partition_by")
  protected String partitionBy;
  @SerializedName("is_new_schema")
  protected Boolean isNewSchema;
  @SerializedName("is_new_table")
  protected Boolean isNewTable;

  protected IngestionJob() { }

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
   * Gets the applicationId.
   *
   * Application ID of the ingestion job.
   *
   * @return the applicationId
   */
  public String getApplicationId() {
    return applicationId;
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
   * Gets the startTimestamp.
   *
   * Unix timestamp of ingestion job starting.
   *
   * @return the startTimestamp
   */
  public Date getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * Gets the endTimestamp.
   *
   * Unix timestamp of ingestion job completing.
   *
   * @return the endTimestamp
   */
  public Date getEndTimestamp() {
    return endTimestamp;
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
   * Gets the engineLogs.
   *
   * Engine application logs.
   *
   * @return the engineLogs
   */
  public String getEngineLogs() {
    return engineLogs;
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
   * Gets the partitionBy.
   *
   * Comma delimited list of columns to partition by.
   *
   * @return the partitionBy
   */
  public String getPartitionBy() {
    return partitionBy;
  }

  /**
   * Gets the isNewSchema.
   *
   * Determine if target schema was created in this ingestion job.
   *
   * @return the isNewSchema
   */
  public Boolean isIsNewSchema() {
    return isNewSchema;
  }

  /**
   * Gets the isNewTable.
   *
   * Determine if target table was created in this ingestion job.
   *
   * @return the isNewTable
   */
  public Boolean isIsNewTable() {
    return isNewTable;
  }
}

