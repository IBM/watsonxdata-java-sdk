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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createIngestionJobs options.
 */
public class CreateIngestionJobsOptions extends GenericModel {

  /**
   * Source file types (parquet or csv or json).
   */
  public interface SourceFileType {
    /** csv. */
    String CSV = "csv";
    /** parquet. */
    String PARQUET = "parquet";
    /** json. */
    String JSON = "json";
  }

  protected String authInstanceId;
  protected String jobId;
  protected String sourceDataFiles;
  protected String targetTable;
  protected String username;
  protected Boolean createIfNotExist;
  protected IngestionJobPrototypeCsvProperty csvProperty;
  protected String engineId;
  protected IngestionJobPrototypeExecuteConfig executeConfig;
  protected String partitionBy;
  protected String schema;
  protected String sourceFileType;
  protected Boolean validateCsvHeader;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String jobId;
    private String sourceDataFiles;
    private String targetTable;
    private String username;
    private Boolean createIfNotExist;
    private IngestionJobPrototypeCsvProperty csvProperty;
    private String engineId;
    private IngestionJobPrototypeExecuteConfig executeConfig;
    private String partitionBy;
    private String schema;
    private String sourceFileType;
    private Boolean validateCsvHeader;

    /**
     * Instantiates a new Builder from an existing CreateIngestionJobsOptions instance.
     *
     * @param createIngestionJobsOptions the instance to initialize the Builder with
     */
    private Builder(CreateIngestionJobsOptions createIngestionJobsOptions) {
      this.authInstanceId = createIngestionJobsOptions.authInstanceId;
      this.jobId = createIngestionJobsOptions.jobId;
      this.sourceDataFiles = createIngestionJobsOptions.sourceDataFiles;
      this.targetTable = createIngestionJobsOptions.targetTable;
      this.username = createIngestionJobsOptions.username;
      this.createIfNotExist = createIngestionJobsOptions.createIfNotExist;
      this.csvProperty = createIngestionJobsOptions.csvProperty;
      this.engineId = createIngestionJobsOptions.engineId;
      this.executeConfig = createIngestionJobsOptions.executeConfig;
      this.partitionBy = createIngestionJobsOptions.partitionBy;
      this.schema = createIngestionJobsOptions.schema;
      this.sourceFileType = createIngestionJobsOptions.sourceFileType;
      this.validateCsvHeader = createIngestionJobsOptions.validateCsvHeader;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authInstanceId the authInstanceId
     * @param jobId the jobId
     * @param sourceDataFiles the sourceDataFiles
     * @param targetTable the targetTable
     * @param username the username
     */
    public Builder(String authInstanceId, String jobId, String sourceDataFiles, String targetTable, String username) {
      this.authInstanceId = authInstanceId;
      this.jobId = jobId;
      this.sourceDataFiles = sourceDataFiles;
      this.targetTable = targetTable;
      this.username = username;
    }

    /**
     * Builds a CreateIngestionJobsOptions.
     *
     * @return the new CreateIngestionJobsOptions instance
     */
    public CreateIngestionJobsOptions build() {
      return new CreateIngestionJobsOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the sourceDataFiles.
     *
     * @param sourceDataFiles the sourceDataFiles
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder sourceDataFiles(String sourceDataFiles) {
      this.sourceDataFiles = sourceDataFiles;
      return this;
    }

    /**
     * Set the targetTable.
     *
     * @param targetTable the targetTable
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder targetTable(String targetTable) {
      this.targetTable = targetTable;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the createIfNotExist.
     *
     * @param createIfNotExist the createIfNotExist
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder createIfNotExist(Boolean createIfNotExist) {
      this.createIfNotExist = createIfNotExist;
      return this;
    }

    /**
     * Set the csvProperty.
     *
     * @param csvProperty the csvProperty
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder csvProperty(IngestionJobPrototypeCsvProperty csvProperty) {
      this.csvProperty = csvProperty;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the executeConfig.
     *
     * @param executeConfig the executeConfig
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder executeConfig(IngestionJobPrototypeExecuteConfig executeConfig) {
      this.executeConfig = executeConfig;
      return this;
    }

    /**
     * Set the partitionBy.
     *
     * @param partitionBy the partitionBy
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder partitionBy(String partitionBy) {
      this.partitionBy = partitionBy;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the sourceFileType.
     *
     * @param sourceFileType the sourceFileType
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder sourceFileType(String sourceFileType) {
      this.sourceFileType = sourceFileType;
      return this;
    }

    /**
     * Set the validateCsvHeader.
     *
     * @param validateCsvHeader the validateCsvHeader
     * @return the CreateIngestionJobsOptions builder
     */
    public Builder validateCsvHeader(Boolean validateCsvHeader) {
      this.validateCsvHeader = validateCsvHeader;
      return this;
    }
  }

  protected CreateIngestionJobsOptions() { }

  protected CreateIngestionJobsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jobId,
      "jobId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceDataFiles,
      "sourceDataFiles cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.targetTable,
      "targetTable cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    authInstanceId = builder.authInstanceId;
    jobId = builder.jobId;
    sourceDataFiles = builder.sourceDataFiles;
    targetTable = builder.targetTable;
    username = builder.username;
    createIfNotExist = builder.createIfNotExist;
    csvProperty = builder.csvProperty;
    engineId = builder.engineId;
    executeConfig = builder.executeConfig;
    partitionBy = builder.partitionBy;
    schema = builder.schema;
    sourceFileType = builder.sourceFileType;
    validateCsvHeader = builder.validateCsvHeader;
  }

  /**
   * New builder.
   *
   * @return a CreateIngestionJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the jobId.
   *
   * Job ID of the job.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the sourceDataFiles.
   *
   * Comma separated source file or directory path.
   *
   * @return the sourceDataFiles
   */
  public String sourceDataFiles() {
    return sourceDataFiles;
  }

  /**
   * Gets the targetTable.
   *
   * Target table name in format catalog.schema.table.
   *
   * @return the targetTable
   */
  public String targetTable() {
    return targetTable;
  }

  /**
   * Gets the username.
   *
   * User submitting ingestion job.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the createIfNotExist.
   *
   * Create new target table (if True); Insert into pre-existing target table (if False).
   *
   * @return the createIfNotExist
   */
  public Boolean createIfNotExist() {
    return createIfNotExist;
  }

  /**
   * Gets the csvProperty.
   *
   * Ingestion CSV properties.
   *
   * @return the csvProperty
   */
  public IngestionJobPrototypeCsvProperty csvProperty() {
    return csvProperty;
  }

  /**
   * Gets the engineId.
   *
   * ID of the spark engine to be used for ingestion.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the executeConfig.
   *
   * Ingestion engine configuration.
   *
   * @return the executeConfig
   */
  public IngestionJobPrototypeExecuteConfig executeConfig() {
    return executeConfig;
  }

  /**
   * Gets the partitionBy.
   *
   * Partition by expression of the target table.
   *
   * @return the partitionBy
   */
  public String partitionBy() {
    return partitionBy;
  }

  /**
   * Gets the schema.
   *
   * Schema definition of the source table.
   *
   * @return the schema
   */
  public String schema() {
    return schema;
  }

  /**
   * Gets the sourceFileType.
   *
   * Source file types (parquet or csv or json).
   *
   * @return the sourceFileType
   */
  public String sourceFileType() {
    return sourceFileType;
  }

  /**
   * Gets the validateCsvHeader.
   *
   * Validate CSV header if the target table exist.
   *
   * @return the validateCsvHeader
   */
  public Boolean validateCsvHeader() {
    return validateCsvHeader;
  }
}

