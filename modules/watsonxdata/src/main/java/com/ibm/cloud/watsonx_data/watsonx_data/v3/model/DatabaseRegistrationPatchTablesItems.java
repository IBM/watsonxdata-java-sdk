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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Table.
 */
public class DatabaseRegistrationPatchTablesItems extends GenericModel {

  @SerializedName("created_at")
  protected String createdAt;
  @SerializedName("file_contents")
  protected String fileContents;
  @SerializedName("file_name")
  protected String fileName;
  @SerializedName("schema_name")
  protected String schemaName;
  @SerializedName("table_name")
  protected String tableName;

  /**
   * Builder.
   */
  public static class Builder {
    private String createdAt;
    private String fileContents;
    private String fileName;
    private String schemaName;
    private String tableName;

    /**
     * Instantiates a new Builder from an existing DatabaseRegistrationPatchTablesItems instance.
     *
     * @param databaseRegistrationPatchTablesItems the instance to initialize the Builder with
     */
    private Builder(DatabaseRegistrationPatchTablesItems databaseRegistrationPatchTablesItems) {
      this.createdAt = databaseRegistrationPatchTablesItems.createdAt;
      this.fileContents = databaseRegistrationPatchTablesItems.fileContents;
      this.fileName = databaseRegistrationPatchTablesItems.fileName;
      this.schemaName = databaseRegistrationPatchTablesItems.schemaName;
      this.tableName = databaseRegistrationPatchTablesItems.tableName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseRegistrationPatchTablesItems.
     *
     * @return the new DatabaseRegistrationPatchTablesItems instance
     */
    public DatabaseRegistrationPatchTablesItems build() {
      return new DatabaseRegistrationPatchTablesItems(this);
    }

    /**
     * Set the createdAt.
     *
     * @param createdAt the createdAt
     * @return the DatabaseRegistrationPatchTablesItems builder
     */
    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Set the fileContents.
     *
     * @param fileContents the fileContents
     * @return the DatabaseRegistrationPatchTablesItems builder
     */
    public Builder fileContents(String fileContents) {
      this.fileContents = fileContents;
      return this;
    }

    /**
     * Set the fileName.
     *
     * @param fileName the fileName
     * @return the DatabaseRegistrationPatchTablesItems builder
     */
    public Builder fileName(String fileName) {
      this.fileName = fileName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the DatabaseRegistrationPatchTablesItems builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the DatabaseRegistrationPatchTablesItems builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }
  }

  protected DatabaseRegistrationPatchTablesItems() { }

  protected DatabaseRegistrationPatchTablesItems(Builder builder) {
    createdAt = builder.createdAt;
    fileContents = builder.fileContents;
    fileName = builder.fileName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
  }

  /**
   * New builder.
   *
   * @return a DatabaseRegistrationPatchTablesItems builder
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
   * file content.
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
   * Gets the schemaName.
   *
   * schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the tableName.
   *
   * table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
  }
}

