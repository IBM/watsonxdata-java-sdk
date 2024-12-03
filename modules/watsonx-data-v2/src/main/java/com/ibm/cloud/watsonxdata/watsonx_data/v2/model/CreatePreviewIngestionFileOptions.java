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
 * The createPreviewIngestionFile options.
 */
public class CreatePreviewIngestionFileOptions extends GenericModel {

  /**
   * File format of source file(s).
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
  protected String sourceDataFiles;
  protected PreviewIngestionFilePrototypeCsvProperty csvProperty;
  protected String sourceFileType;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String sourceDataFiles;
    private PreviewIngestionFilePrototypeCsvProperty csvProperty;
    private String sourceFileType;

    /**
     * Instantiates a new Builder from an existing CreatePreviewIngestionFileOptions instance.
     *
     * @param createPreviewIngestionFileOptions the instance to initialize the Builder with
     */
    private Builder(CreatePreviewIngestionFileOptions createPreviewIngestionFileOptions) {
      this.authInstanceId = createPreviewIngestionFileOptions.authInstanceId;
      this.sourceDataFiles = createPreviewIngestionFileOptions.sourceDataFiles;
      this.csvProperty = createPreviewIngestionFileOptions.csvProperty;
      this.sourceFileType = createPreviewIngestionFileOptions.sourceFileType;
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
     * @param sourceDataFiles the sourceDataFiles
     */
    public Builder(String authInstanceId, String sourceDataFiles) {
      this.authInstanceId = authInstanceId;
      this.sourceDataFiles = sourceDataFiles;
    }

    /**
     * Builds a CreatePreviewIngestionFileOptions.
     *
     * @return the new CreatePreviewIngestionFileOptions instance
     */
    public CreatePreviewIngestionFileOptions build() {
      return new CreatePreviewIngestionFileOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreatePreviewIngestionFileOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the sourceDataFiles.
     *
     * @param sourceDataFiles the sourceDataFiles
     * @return the CreatePreviewIngestionFileOptions builder
     */
    public Builder sourceDataFiles(String sourceDataFiles) {
      this.sourceDataFiles = sourceDataFiles;
      return this;
    }

    /**
     * Set the csvProperty.
     *
     * @param csvProperty the csvProperty
     * @return the CreatePreviewIngestionFileOptions builder
     */
    public Builder csvProperty(PreviewIngestionFilePrototypeCsvProperty csvProperty) {
      this.csvProperty = csvProperty;
      return this;
    }

    /**
     * Set the sourceFileType.
     *
     * @param sourceFileType the sourceFileType
     * @return the CreatePreviewIngestionFileOptions builder
     */
    public Builder sourceFileType(String sourceFileType) {
      this.sourceFileType = sourceFileType;
      return this;
    }
  }

  protected CreatePreviewIngestionFileOptions() { }

  protected CreatePreviewIngestionFileOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sourceDataFiles,
      "sourceDataFiles cannot be null");
    authInstanceId = builder.authInstanceId;
    sourceDataFiles = builder.sourceDataFiles;
    csvProperty = builder.csvProperty;
    sourceFileType = builder.sourceFileType;
  }

  /**
   * New builder.
   *
   * @return a CreatePreviewIngestionFileOptions builder
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
   * Gets the csvProperty.
   *
   * CSV properties of source file(s).
   *
   * @return the csvProperty
   */
  public PreviewIngestionFilePrototypeCsvProperty csvProperty() {
    return csvProperty;
  }

  /**
   * Gets the sourceFileType.
   *
   * File format of source file(s).
   *
   * @return the sourceFileType
   */
  public String sourceFileType() {
    return sourceFileType;
  }
}

