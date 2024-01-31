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
 * The createSchema options.
 */
public class CreateSchemaOptions extends GenericModel {

  protected String engineId;
  protected String catalogId;
  protected String customPath;
  protected String schemaName;
  protected String bucketName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogId;
    private String customPath;
    private String schemaName;
    private String bucketName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSchemaOptions instance.
     *
     * @param createSchemaOptions the instance to initialize the Builder with
     */
    private Builder(CreateSchemaOptions createSchemaOptions) {
      this.engineId = createSchemaOptions.engineId;
      this.catalogId = createSchemaOptions.catalogId;
      this.customPath = createSchemaOptions.customPath;
      this.schemaName = createSchemaOptions.schemaName;
      this.bucketName = createSchemaOptions.bucketName;
      this.authInstanceId = createSchemaOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     * @param catalogId the catalogId
     * @param customPath the customPath
     * @param schemaName the schemaName
     */
    public Builder(String engineId, String catalogId, String customPath, String schemaName) {
      this.engineId = engineId;
      this.catalogId = catalogId;
      this.customPath = customPath;
      this.schemaName = schemaName;
    }

    /**
     * Builds a CreateSchemaOptions.
     *
     * @return the new CreateSchemaOptions instance
     */
    public CreateSchemaOptions build() {
      return new CreateSchemaOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateSchemaOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the CreateSchemaOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the customPath.
     *
     * @param customPath the customPath
     * @return the CreateSchemaOptions builder
     */
    public Builder customPath(String customPath) {
      this.customPath = customPath;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the CreateSchemaOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the CreateSchemaOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSchemaOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSchemaOptions() { }

  protected CreateSchemaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.customPath,
      "customPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schemaName,
      "schemaName cannot be null");
    engineId = builder.engineId;
    catalogId = builder.catalogId;
    customPath = builder.customPath;
    schemaName = builder.schemaName;
    bucketName = builder.bucketName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSchemaOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the catalogId.
   *
   * Catalog name.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the customPath.
   *
   * Path associated with bucket.
   *
   * @return the customPath
   */
  public String customPath() {
    return customPath;
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
   * Gets the bucketName.
   *
   * Bucket associated to metastore where schema will be added.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

