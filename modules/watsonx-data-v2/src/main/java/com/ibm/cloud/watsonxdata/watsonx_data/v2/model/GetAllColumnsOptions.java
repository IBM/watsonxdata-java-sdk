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
 * The getAllColumns options.
 */
public class GetAllColumnsOptions extends GenericModel {

  protected String tableName;
  protected String catalogName;
  protected String schemaName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String tableName;
    private String catalogName;
    private String schemaName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetAllColumnsOptions instance.
     *
     * @param getAllColumnsOptions the instance to initialize the Builder with
     */
    private Builder(GetAllColumnsOptions getAllColumnsOptions) {
      this.tableName = getAllColumnsOptions.tableName;
      this.catalogName = getAllColumnsOptions.catalogName;
      this.schemaName = getAllColumnsOptions.schemaName;
      this.authInstanceId = getAllColumnsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetAllColumnsOptions.
     *
     * @return the new GetAllColumnsOptions instance
     */
    public GetAllColumnsOptions build() {
      return new GetAllColumnsOptions(this);
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the GetAllColumnsOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the GetAllColumnsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the GetAllColumnsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetAllColumnsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetAllColumnsOptions() { }

  protected GetAllColumnsOptions(Builder builder) {
    tableName = builder.tableName;
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetAllColumnsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

