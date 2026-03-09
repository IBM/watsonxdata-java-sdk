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
 * Topic.
 */
public class DatabaseRegistrationPatchTopicsItems extends GenericModel {

  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("file_contents")
  protected String fileContents;
  @SerializedName("file_name")
  protected String fileName;
  @SerializedName("topic_name")
  protected String topicName;

  /**
   * Builder.
   */
  public static class Builder {
    private String createdAt;
    private String fileContents;
    private String fileName;
    private String topicName;

    /**
     * Instantiates a new Builder from an existing DatabaseRegistrationPatchTopicsItems instance.
     *
     * @param databaseRegistrationPatchTopicsItems the instance to initialize the Builder with
     */
    private Builder(DatabaseRegistrationPatchTopicsItems databaseRegistrationPatchTopicsItems) {
      this.createdAt = databaseRegistrationPatchTopicsItems.createdAt;
      this.fileContents = databaseRegistrationPatchTopicsItems.fileContents;
      this.fileName = databaseRegistrationPatchTopicsItems.fileName;
      this.topicName = databaseRegistrationPatchTopicsItems.topicName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseRegistrationPatchTopicsItems.
     *
     * @return the new DatabaseRegistrationPatchTopicsItems instance
     */
    public DatabaseRegistrationPatchTopicsItems build() {
      return new DatabaseRegistrationPatchTopicsItems(this);
    }

    /**
     * Set the createdAt.
     *
     * @param createdAt the createdAt
     * @return the DatabaseRegistrationPatchTopicsItems builder
     */
    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Set the fileContents.
     *
     * @param fileContents the fileContents
     * @return the DatabaseRegistrationPatchTopicsItems builder
     */
    public Builder fileContents(String fileContents) {
      this.fileContents = fileContents;
      return this;
    }

    /**
     * Set the fileName.
     *
     * @param fileName the fileName
     * @return the DatabaseRegistrationPatchTopicsItems builder
     */
    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    /**
     * Set the topicName.
     *
     * @param topicName the topicName
     * @return the DatabaseRegistrationPatchTopicsItems builder
     */
    public Builder topicName(String topicName) {
      this.topicName = topicName;
      return this;
    }
  }

  protected DatabaseRegistrationPatchTopicsItems() { }

  protected DatabaseRegistrationPatchTopicsItems(Builder builder) {
    createdAt = builder.createdAt;
    fileContents = builder.fileContents;
    fileName = builder.fileName;
    topicName = builder.topicName;
  }

  /**
   * New builder.
   *
   * @return a DatabaseRegistrationPatchTopicsItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the createdAt.
   *
   * Created on.
   *
   * @return the createdAt
   */
  public String createdAt() {
    return createdAt;
  }

  /**
   * Gets the fileContents.
   *
   * file contents.
   *
   * @return the fileContents
   */
  public String fileContents() {
    return fileContents;
  }

  /**
   * Gets the fileName.
   *
   * file name.
   *
   * @return the fileName
   */
  public String fileName() {
    return fileName;
  }

  /**
   * Gets the topicName.
   *
   * topic name.
   *
   * @return the topicName
   */
  public String topicName() {
    return topicName;
  }
}

