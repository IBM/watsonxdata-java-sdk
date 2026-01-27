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
 * The listTables options.
 */
public class ListTablesOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String engineId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String engineId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListTablesOptions instance.
     *
     * @param listTablesOptions the instance to initialize the Builder with
     */
    private Builder(ListTablesOptions listTablesOptions) {
      this.catalogName = listTablesOptions.catalogName;
      this.schemaName = listTablesOptions.schemaName;
      this.engineId = listTablesOptions.engineId;
      this.authInstanceId = listTablesOptions.authInstanceId;
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
     * @param engineId the engineId
     */
    public Builder(String catalogName, String schemaName, String engineId) {
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.engineId = engineId;
    }

    /**
     * Builds a ListTablesOptions.
     *
     * @return the new ListTablesOptions instance
     */
    public ListTablesOptions build() {
      return new ListTablesOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListTablesOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ListTablesOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ListTablesOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListTablesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListTablesOptions() { }

  protected ListTablesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogName,
      "catalogName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaName,
      "schemaName cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListTablesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the schemaName.
   *
   * URL encoded schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the engineId.
   *
   * Engine id of presto/prestissimo/spark/db2/netezza other engine.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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

