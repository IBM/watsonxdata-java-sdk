/*
 * (C) Copyright IBM Corp. 2025.
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
 * The registerTable options.
 */
public class RegisterTableOptions extends GenericModel {

  protected String catalogId;
  protected String schemaId;
  protected String metadataLocation;
  protected String tableName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private String schemaId;
    private String metadataLocation;
    private String tableName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RegisterTableOptions instance.
     *
     * @param registerTableOptions the instance to initialize the Builder with
     */
    private Builder(RegisterTableOptions registerTableOptions) {
      this.catalogId = registerTableOptions.catalogId;
      this.schemaId = registerTableOptions.schemaId;
      this.metadataLocation = registerTableOptions.metadataLocation;
      this.tableName = registerTableOptions.tableName;
      this.authInstanceId = registerTableOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param schemaId the schemaId
     * @param metadataLocation the metadataLocation
     * @param tableName the tableName
     */
    public Builder(String catalogId, String schemaId, String metadataLocation, String tableName) {
      this.catalogId = catalogId;
      this.schemaId = schemaId;
      this.metadataLocation = metadataLocation;
      this.tableName = tableName;
    }

    /**
     * Builds a RegisterTableOptions.
     *
     * @return the new RegisterTableOptions instance
     */
    public RegisterTableOptions build() {
      return new RegisterTableOptions(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the RegisterTableOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the schemaId.
     *
     * @param schemaId the schemaId
     * @return the RegisterTableOptions builder
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }

    /**
     * Set the metadataLocation.
     *
     * @param metadataLocation the metadataLocation
     * @return the RegisterTableOptions builder
     */
    public Builder metadataLocation(String metadataLocation) {
      this.metadataLocation = metadataLocation;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the RegisterTableOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RegisterTableOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RegisterTableOptions() { }

  protected RegisterTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaId,
      "schemaId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.metadataLocation,
      "metadataLocation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableName,
      "tableName cannot be null");
    catalogId = builder.catalogId;
    schemaId = builder.schemaId;
    metadataLocation = builder.metadataLocation;
    tableName = builder.tableName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RegisterTableOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * catalog id.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the schemaId.
   *
   * URL encoded schema name.
   *
   * @return the schemaId
   */
  public String schemaId() {
    return schemaId;
  }

  /**
   * Gets the metadataLocation.
   *
   * Metadata location.
   *
   * @return the metadataLocation
   */
  public String metadataLocation() {
    return metadataLocation;
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

