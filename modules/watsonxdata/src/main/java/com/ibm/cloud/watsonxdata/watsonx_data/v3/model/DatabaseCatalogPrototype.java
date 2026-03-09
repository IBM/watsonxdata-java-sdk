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
 * database catalog.
 */
public class DatabaseCatalogPrototype extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("catalog_type")
  protected String catalogType;
  @SerializedName("is_gfs")
  protected Boolean isGfs;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String catalogType;
    private Boolean isGfs;

    /**
     * Instantiates a new Builder from an existing DatabaseCatalogPrototype instance.
     *
     * @param databaseCatalogPrototype the instance to initialize the Builder with
     */
    private Builder(DatabaseCatalogPrototype databaseCatalogPrototype) {
      this.catalogName = databaseCatalogPrototype.catalogName;
      this.catalogType = databaseCatalogPrototype.catalogType;
      this.isGfs = databaseCatalogPrototype.isGfs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseCatalogPrototype.
     *
     * @return the new DatabaseCatalogPrototype instance
     */
    public DatabaseCatalogPrototype build() {
      return new DatabaseCatalogPrototype(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the DatabaseCatalogPrototype builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the catalogType.
     *
     * @param catalogType the catalogType
     * @return the DatabaseCatalogPrototype builder
     */
    public Builder catalogType(String catalogType) {
      this.catalogType = catalogType;
      return this;
    }

    /**
     * Set the isGfs.
     *
     * @param isGfs the isGfs
     * @return the DatabaseCatalogPrototype builder
     */
    public Builder isGfs(Boolean isGfs) {
      this.isGfs = isGfs;
      return this;
    }
  }

  protected DatabaseCatalogPrototype() { }

  protected DatabaseCatalogPrototype(Builder builder) {
    catalogName = builder.catalogName;
    catalogType = builder.catalogType;
    isGfs = builder.isGfs;
  }

  /**
   * New builder.
   *
   * @return a DatabaseCatalogPrototype builder
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
   * Gets the catalogType.
   *
   * catalog type.
   *
   * @return the catalogType
   */
  public String catalogType() {
    return catalogType;
  }

  /**
   * Gets the isGfs.
   *
   * Flag to check if catalog is federated or not.
   *
   * @return the isGfs
   */
  public Boolean isGfs() {
    return isGfs;
  }
}

