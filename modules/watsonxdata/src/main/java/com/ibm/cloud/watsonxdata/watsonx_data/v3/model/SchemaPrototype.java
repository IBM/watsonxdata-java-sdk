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
 * Schema creation request details.
 */
public class SchemaPrototype extends GenericModel {

  @SerializedName("custom_path")
  protected String customPath;
  protected String hostname;
  protected String name;
  protected Long port;
  @SerializedName("storage_name")
  protected String storageName;

  /**
   * Builder.
   */
  public static class Builder {
    private String customPath;
    private String hostname;
    private String name;
    private Long port;
    private String storageName;

    /**
     * Instantiates a new Builder from an existing SchemaPrototype instance.
     *
     * @param schemaPrototype the instance to initialize the Builder with
     */
    private Builder(SchemaPrototype schemaPrototype) {
      this.customPath = schemaPrototype.customPath;
      this.hostname = schemaPrototype.hostname;
      this.name = schemaPrototype.name;
      this.port = schemaPrototype.port;
      this.storageName = schemaPrototype.storageName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param customPath the customPath
     * @param name the name
     */
    public Builder(String customPath, String name) {
      this.customPath = customPath;
      this.name = name;
    }

    /**
     * Builds a SchemaPrototype.
     *
     * @return the new SchemaPrototype instance
     */
    public SchemaPrototype build() {
      return new SchemaPrototype(this);
    }

    /**
     * Set the customPath.
     *
     * @param customPath the customPath
     * @return the SchemaPrototype builder
     */
    public Builder customPath(String customPath) {
      this.customPath = customPath;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the SchemaPrototype builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the SchemaPrototype builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the SchemaPrototype builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the storageName.
     *
     * @param storageName the storageName
     * @return the SchemaPrototype builder
     */
    public Builder storageName(String storageName) {
      this.storageName = storageName;
      return this;
    }
  }

  protected SchemaPrototype() { }

  protected SchemaPrototype(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.customPath,
      "customPath cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.name,
      "name cannot be null");
    customPath = builder.customPath;
    hostname = builder.hostname;
    name = builder.name;
    port = builder.port;
    storageName = builder.storageName;
  }

  /**
   * New builder.
   *
   * @return a SchemaPrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

