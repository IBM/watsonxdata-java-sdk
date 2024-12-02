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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * database catalog.
 */
public class DatabaseCatalog extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("catalog_tags")
  protected List<String> catalogTags;
  @SerializedName("catalog_type")
  protected String catalogType;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private List<String> catalogTags;
    private String catalogType;

    /**
     * Instantiates a new Builder from an existing DatabaseCatalog instance.
     *
     * @param databaseCatalog the instance to initialize the Builder with
     */
    private Builder(DatabaseCatalog databaseCatalog) {
      this.catalogName = databaseCatalog.catalogName;
      this.catalogTags = databaseCatalog.catalogTags;
      this.catalogType = databaseCatalog.catalogType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseCatalog.
     *
     * @return the new DatabaseCatalog instance
     */
    public DatabaseCatalog build() {
      return new DatabaseCatalog(this);
    }

    /**
     * Adds a new element to catalogTags.
     *
     * @param catalogTags the new element to be added
     * @return the DatabaseCatalog builder
     */
    public Builder addCatalogTags(String catalogTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(catalogTags,
        "catalogTags cannot be null");
      if (this.catalogTags == null) {
        this.catalogTags = new ArrayList<String>();
      }
      this.catalogTags.add(catalogTags);
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the DatabaseCatalog builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the catalogTags.
     * Existing catalogTags will be replaced.
     *
     * @param catalogTags the catalogTags
     * @return the DatabaseCatalog builder
     */
    public Builder catalogTags(List<String> catalogTags) {
      this.catalogTags = catalogTags;
      return this;
    }

    /**
     * Set the catalogType.
     *
     * @param catalogType the catalogType
     * @return the DatabaseCatalog builder
     */
    public Builder catalogType(String catalogType) {
      this.catalogType = catalogType;
      return this;
    }
  }

  protected DatabaseCatalog() { }

  protected DatabaseCatalog(Builder builder) {
    catalogName = builder.catalogName;
    catalogTags = builder.catalogTags;
    catalogType = builder.catalogType;
  }

  /**
   * New builder.
   *
   * @return a DatabaseCatalog builder
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
   * Gets the catalogTags.
   *
   * catalog tags.
   *
   * @return the catalogTags
   */
  public List<String> catalogTags() {
    return catalogTags;
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
}

