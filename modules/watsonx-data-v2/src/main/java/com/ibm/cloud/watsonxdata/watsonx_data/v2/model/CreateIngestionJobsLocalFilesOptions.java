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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createIngestionJobsLocalFiles options.
 */
public class CreateIngestionJobsLocalFilesOptions extends GenericModel {

  /**
   * File format of source file.
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
  protected InputStream sourceDataFile;
  protected String targetTable;
  protected String jobId;
  protected String username;
  protected String sourceDataFileContentType;
  protected String sourceFileType;
  protected String csvProperty;
  protected Boolean createIfNotExist;
  protected Boolean validateCsvHeader;
  protected String executeConfig;
  protected String engineId;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private InputStream sourceDataFile;
    private String targetTable;
    private String jobId;
    private String username;
    private String sourceDataFileContentType;
    private String sourceFileType;
    private String csvProperty;
    private Boolean createIfNotExist;
    private Boolean validateCsvHeader;
    private String executeConfig;
    private String engineId;

    /**
     * Instantiates a new Builder from an existing CreateIngestionJobsLocalFilesOptions instance.
     *
     * @param createIngestionJobsLocalFilesOptions the instance to initialize the Builder with
     */
    private Builder(CreateIngestionJobsLocalFilesOptions createIngestionJobsLocalFilesOptions) {
      this.authInstanceId = createIngestionJobsLocalFilesOptions.authInstanceId;
      this.sourceDataFile = createIngestionJobsLocalFilesOptions.sourceDataFile;
      this.targetTable = createIngestionJobsLocalFilesOptions.targetTable;
      this.jobId = createIngestionJobsLocalFilesOptions.jobId;
      this.username = createIngestionJobsLocalFilesOptions.username;
      this.sourceDataFileContentType = createIngestionJobsLocalFilesOptions.sourceDataFileContentType;
      this.sourceFileType = createIngestionJobsLocalFilesOptions.sourceFileType;
      this.csvProperty = createIngestionJobsLocalFilesOptions.csvProperty;
      this.createIfNotExist = createIngestionJobsLocalFilesOptions.createIfNotExist;
      this.validateCsvHeader = createIngestionJobsLocalFilesOptions.validateCsvHeader;
      this.executeConfig = createIngestionJobsLocalFilesOptions.executeConfig;
      this.engineId = createIngestionJobsLocalFilesOptions.engineId;
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
     * @param sourceDataFile the sourceDataFile
     * @param targetTable the targetTable
     * @param jobId the jobId
     * @param username the username
     */
    public Builder(String authInstanceId, InputStream sourceDataFile, String targetTable, String jobId, String username) {
      this.authInstanceId = authInstanceId;
      this.sourceDataFile = sourceDataFile;
      this.targetTable = targetTable;
      this.jobId = jobId;
      this.username = username;
    }

    /**
     * Builds a CreateIngestionJobsLocalFilesOptions.
     *
     * @return the new CreateIngestionJobsLocalFilesOptions instance
     */
    public CreateIngestionJobsLocalFilesOptions build() {
      return new CreateIngestionJobsLocalFilesOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the sourceDataFile.
     *
     * @param sourceDataFile the sourceDataFile
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder sourceDataFile(InputStream sourceDataFile) {
      this.sourceDataFile = sourceDataFile;
      return this;
    }

    /**
     * Set the targetTable.
     *
     * @param targetTable the targetTable
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder targetTable(String targetTable) {
      this.targetTable = targetTable;
      return this;
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the sourceDataFileContentType.
     *
     * @param sourceDataFileContentType the sourceDataFileContentType
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder sourceDataFileContentType(String sourceDataFileContentType) {
      this.sourceDataFileContentType = sourceDataFileContentType;
      return this;
    }

    /**
     * Set the sourceFileType.
     *
     * @param sourceFileType the sourceFileType
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder sourceFileType(String sourceFileType) {
      this.sourceFileType = sourceFileType;
      return this;
    }

    /**
     * Set the csvProperty.
     *
     * @param csvProperty the csvProperty
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder csvProperty(String csvProperty) {
      this.csvProperty = csvProperty;
      return this;
    }

    /**
     * Set the createIfNotExist.
     *
     * @param createIfNotExist the createIfNotExist
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder createIfNotExist(Boolean createIfNotExist) {
      this.createIfNotExist = createIfNotExist;
      return this;
    }

    /**
     * Set the validateCsvHeader.
     *
     * @param validateCsvHeader the validateCsvHeader
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder validateCsvHeader(Boolean validateCsvHeader) {
      this.validateCsvHeader = validateCsvHeader;
      return this;
    }

    /**
     * Set the executeConfig.
     *
     * @param executeConfig the executeConfig
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder executeConfig(String executeConfig) {
      this.executeConfig = executeConfig;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateIngestionJobsLocalFilesOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the sourceDataFile.
     *
     * @param sourceDataFile the sourceDataFile
     * @return the CreateIngestionJobsLocalFilesOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder sourceDataFile(File sourceDataFile) throws FileNotFoundException {
      this.sourceDataFile = new FileInputStream(sourceDataFile);
      return this;
    }
  }

  protected CreateIngestionJobsLocalFilesOptions() { }

  protected CreateIngestionJobsLocalFilesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceDataFile,
      "sourceDataFile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.targetTable,
      "targetTable cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.jobId,
      "jobId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.username,
      "username cannot be null");
    authInstanceId = builder.authInstanceId;
    sourceDataFile = builder.sourceDataFile;
    targetTable = builder.targetTable;
    jobId = builder.jobId;
    username = builder.username;
    sourceDataFileContentType = builder.sourceDataFileContentType;
    sourceFileType = builder.sourceFileType;
    csvProperty = builder.csvProperty;
    createIfNotExist = builder.createIfNotExist;
    validateCsvHeader = builder.validateCsvHeader;
    executeConfig = builder.executeConfig;
    engineId = builder.engineId;
  }

  /**
   * New builder.
   *
   * @return a CreateIngestionJobsLocalFilesOptions builder
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
   * Gets the sourceDataFile.
   *
   * The user local file submitted for ingestion.
   *
   * @return the sourceDataFile
   */
  public InputStream sourceDataFile() {
    return sourceDataFile;
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
   * Gets the sourceDataFileContentType.
   *
   * The content type of sourceDataFile. Values for this parameter can be obtained from the HttpMediaType class.
   *
   * @return the sourceDataFileContentType
   */
  public String sourceDataFileContentType() {
    return sourceDataFileContentType;
  }

  /**
   * Gets the sourceFileType.
   *
   * File format of source file.
   *
   * @return the sourceFileType
   */
  public String sourceFileType() {
    return sourceFileType;
  }

  /**
   * Gets the csvProperty.
   *
   * Ingestion CSV properties (base64 encoding of a stringifed json).
   *
   * @return the csvProperty
   */
  public String csvProperty() {
    return csvProperty;
  }

  /**
   * Gets the createIfNotExist.
   *
   * Create new target table (if true); Insert into pre-existing target table (if false).
   *
   * @return the createIfNotExist
   */
  public Boolean createIfNotExist() {
    return createIfNotExist;
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

  /**
   * Gets the executeConfig.
   *
   * Ingestion engine configuration (base64 encoding of a stringifed json).
   *
   * @return the executeConfig
   */
  public String executeConfig() {
    return executeConfig;
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
}

