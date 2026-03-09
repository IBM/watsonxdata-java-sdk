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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The rollbackTable options.
 */
public class RollbackTableOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String tableName;
  protected String snapshotId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String snapshotId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RollbackTableOptions instance.
     *
     * @param rollbackTableOptions the instance to initialize the Builder with
     */
    private Builder(RollbackTableOptions rollbackTableOptions) {
      this.catalogName = rollbackTableOptions.catalogName;
      this.schemaName = rollbackTableOptions.schemaName;
      this.tableName = rollbackTableOptions.tableName;
      this.snapshotId = rollbackTableOptions.snapshotId;
      this.authInstanceId = rollbackTableOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogName the catalogName
     * @param schemaName the schemaName
     * @param tableName the tableName
     * @param snapshotId the snapshotId
     */
    public Builder(String catalogName, String schemaName, String tableName, String snapshotId) {
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.tableName = tableName;
      this.snapshotId = snapshotId;
    }

    /**
     * Builds a RollbackTableOptions.
     *
     * @return the new RollbackTableOptions instance
     */
    public RollbackTableOptions build() {
      return new RollbackTableOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the RollbackTableOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the RollbackTableOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the RollbackTableOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the snapshotId.
     *
     * @param snapshotId the snapshotId
     * @return the RollbackTableOptions builder
     */
    public Builder snapshotId(String snapshotId) {
      this.snapshotId = snapshotId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RollbackTableOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RollbackTableOptions() { }

  protected RollbackTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogName,
      "catalogName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaName,
      "schemaName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableName,
      "tableName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotId,
      "snapshotId cannot be null");
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    snapshotId = builder.snapshotId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RollbackTableOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the tableName.
   *
   * Table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
  }

  /**
   * Gets the snapshotId.
   *
   * Snapshot Id.
   *
   * @return the snapshotId
   */
  public String snapshotId() {
    return snapshotId;
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
}

