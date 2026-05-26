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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listTableSnapshots options.
 */
public class ListTableSnapshotsOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String tableName;
  protected String engineId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String engineId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListTableSnapshotsOptions instance.
     *
     * @param listTableSnapshotsOptions the instance to initialize the Builder with
     */
    private Builder(ListTableSnapshotsOptions listTableSnapshotsOptions) {
      this.catalogName = listTableSnapshotsOptions.catalogName;
      this.schemaName = listTableSnapshotsOptions.schemaName;
      this.tableName = listTableSnapshotsOptions.tableName;
      this.engineId = listTableSnapshotsOptions.engineId;
      this.authInstanceId = listTableSnapshotsOptions.authInstanceId;
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
     */
    public Builder(String catalogName, String schemaName, String tableName) {
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.tableName = tableName;
    }

    /**
     * Builds a ListTableSnapshotsOptions.
     *
     * @return the new ListTableSnapshotsOptions instance
     */
    public ListTableSnapshotsOptions build() {
      return new ListTableSnapshotsOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListTableSnapshotsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ListTableSnapshotsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the ListTableSnapshotsOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ListTableSnapshotsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListTableSnapshotsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListTableSnapshotsOptions() { }

  protected ListTableSnapshotsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogName,
      "catalogName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaName,
      "schemaName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.tableName,
      "tableName cannot be empty");
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListTableSnapshotsOptions builder
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
   * Gets the engineId.
   *
   * Engine name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

