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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addDatabaseCatalog options.
 */
public class AddDatabaseCatalogOptions extends GenericModel {

  protected String databaseId;
  protected String catalogName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseId;
    private String catalogName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing AddDatabaseCatalogOptions instance.
     *
     * @param addDatabaseCatalogOptions the instance to initialize the Builder with
     */
    private Builder(AddDatabaseCatalogOptions addDatabaseCatalogOptions) {
      this.databaseId = addDatabaseCatalogOptions.databaseId;
      this.catalogName = addDatabaseCatalogOptions.catalogName;
      this.authInstanceId = addDatabaseCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param databaseId the databaseId
     */
    public Builder(String databaseId) {
      this.databaseId = databaseId;
    }

    /**
     * Builds a AddDatabaseCatalogOptions.
     *
     * @return the new AddDatabaseCatalogOptions instance
     */
    public AddDatabaseCatalogOptions build() {
      return new AddDatabaseCatalogOptions(this);
    }

    /**
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the AddDatabaseCatalogOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the AddDatabaseCatalogOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the AddDatabaseCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected AddDatabaseCatalogOptions() { }

  protected AddDatabaseCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.databaseId,
      "databaseId cannot be empty");
    databaseId = builder.databaseId;
    catalogName = builder.catalogName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a AddDatabaseCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseId.
   *
   * database id.
   *
   * @return the databaseId
   */
  public String databaseId() {
    return databaseId;
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

