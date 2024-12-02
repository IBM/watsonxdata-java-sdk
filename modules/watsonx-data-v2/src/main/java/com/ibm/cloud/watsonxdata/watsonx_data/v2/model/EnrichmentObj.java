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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Encrichment api object.
 */
public class EnrichmentObj extends GenericModel {

  protected String catalog;
  protected String operation;
  protected String schema;
  protected List<String> tables;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalog;
    private String operation;
    private String schema;
    private List<String> tables;

    /**
     * Instantiates a new Builder from an existing EnrichmentObj instance.
     *
     * @param enrichmentObj the instance to initialize the Builder with
     */
    private Builder(EnrichmentObj enrichmentObj) {
      this.catalog = enrichmentObj.catalog;
      this.operation = enrichmentObj.operation;
      this.schema = enrichmentObj.schema;
      this.tables = enrichmentObj.tables;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalog the catalog
     * @param operation the operation
     * @param schema the schema
     */
    public Builder(String catalog, String operation, String schema) {
      this.catalog = catalog;
      this.operation = operation;
      this.schema = schema;
    }

    /**
     * Builds a EnrichmentObj.
     *
     * @return the new EnrichmentObj instance
     */
    public EnrichmentObj build() {
      return new EnrichmentObj(this);
    }

    /**
     * Adds a new element to tables.
     *
     * @param tables the new element to be added
     * @return the EnrichmentObj builder
     */
    public Builder addTables(String tables) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tables,
        "tables cannot be null");
      if (this.tables == null) {
        this.tables = new ArrayList<String>();
      }
      this.tables.add(tables);
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the EnrichmentObj builder
     */
    public Builder catalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the EnrichmentObj builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the EnrichmentObj builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the tables.
     * Existing tables will be replaced.
     *
     * @param tables the tables
     * @return the EnrichmentObj builder
     */
    public Builder tables(List<String> tables) {
      this.tables = tables;
      return this;
    }
  }

  protected EnrichmentObj() { }

  protected EnrichmentObj(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalog,
      "catalog cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operation,
      "operation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schema,
      "schema cannot be null");
    catalog = builder.catalog;
    operation = builder.operation;
    schema = builder.schema;
    tables = builder.tables;
  }

  /**
   * New builder.
   *
   * @return a EnrichmentObj builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * catalog name.
   *
   * @return the catalog
   */
  public String catalog() {
    return catalog;
  }

  /**
   * Gets the operation.
   *
   * operation type.
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the schema.
   *
   * schema name.
   *
   * @return the schema
   */
  public String schema() {
    return schema;
  }

  /**
   * Gets the tables.
   *
   * schema name.
   *
   * @return the tables
   */
  public List<String> tables() {
    return tables;
  }
}

