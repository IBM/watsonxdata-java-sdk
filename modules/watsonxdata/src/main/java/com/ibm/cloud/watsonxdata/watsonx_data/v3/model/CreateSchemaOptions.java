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
 * The createSchema options.
 */
public class CreateSchemaOptions extends GenericModel {

  protected String engineId;
  protected String id;
  protected String customPath;
  protected String name;
  protected String hostname;
  protected Long port;
  protected String storageName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String id;
    private String customPath;
    private String name;
    private String hostname;
    private Long port;
    private String storageName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSchemaOptions instance.
     *
     * @param createSchemaOptions the instance to initialize the Builder with
     */
    private Builder(CreateSchemaOptions createSchemaOptions) {
      this.engineId = createSchemaOptions.engineId;
      this.id = createSchemaOptions.id;
      this.customPath = createSchemaOptions.customPath;
      this.name = createSchemaOptions.name;
      this.hostname = createSchemaOptions.hostname;
      this.port = createSchemaOptions.port;
      this.storageName = createSchemaOptions.storageName;
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
     * @param id the id
     * @param customPath the customPath
     * @param name the name
     */
    public Builder(String engineId, String id, String customPath, String name) {
      this.engineId = engineId;
      this.id = id;
      this.customPath = customPath;
      this.name = name;
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
     * Set the id.
     *
     * @param id the id
     * @return the CreateSchemaOptions builder
     */
    public Builder id(String id) {
      this.id = id;
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
     * Set the name.
     *
     * @param name the name
     * @return the CreateSchemaOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the CreateSchemaOptions builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the CreateSchemaOptions builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the storageName.
     *
     * @param storageName the storageName
     * @return the CreateSchemaOptions builder
     */
    public Builder storageName(String storageName) {
      this.storageName = storageName;
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

    /**
     * Set the schemaPrototype.
     *
     * @param schemaPrototype the schemaPrototype
     * @return the CreateSchemaOptions builder
     */
    public Builder schemaPrototype(SchemaPrototype schemaPrototype) {
      this.customPath = schemaPrototype.customPath();
      this.name = schemaPrototype.name();
      this.hostname = schemaPrototype.hostname();
      this.port = schemaPrototype.port();
      this.storageName = schemaPrototype.storageName();
      return this;
    }
  }

  protected CreateSchemaOptions() { }

  protected CreateSchemaOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.customPath,
      "customPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    engineId = builder.engineId;
    id = builder.id;
    customPath = builder.customPath;
    name = builder.name;
    hostname = builder.hostname;
    port = builder.port;
    storageName = builder.storageName;
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
   * Engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the id.
   *
   * Catalog id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the customPath.
   *
   * Path within bucket where schema will be created.
   *
   * @return the customPath
   */
  public String customPath() {
    return customPath;
  }

  /**
   * Gets the name.
   *
   * Unique schema name, schemas with same names are not allowed in a catalog.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the hostname.
   *
   * Host name of the HDFS bucket. Need to be provided if using HDFS.
   *
   * @return the hostname
   */
  public String hostname() {
    return hostname;
  }

  /**
   * Gets the port.
   *
   * Port of the HDFS bucket. Need to be provided if using HDFS.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the storageName.
   *
   * Bucket associated to catalog where schema will be added.
   *
   * @return the storageName
   */
  public String storageName() {
    return storageName;
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

