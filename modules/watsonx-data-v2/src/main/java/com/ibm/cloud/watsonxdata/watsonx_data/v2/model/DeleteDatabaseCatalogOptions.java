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
 * The deleteDatabaseCatalog options.
 */
public class DeleteDatabaseCatalogOptions extends GenericModel {

  protected String databaseId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteDatabaseCatalogOptions instance.
     *
     * @param deleteDatabaseCatalogOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions) {
      this.databaseId = deleteDatabaseCatalogOptions.databaseId;
      this.authInstanceId = deleteDatabaseCatalogOptions.authInstanceId;
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
     * Builds a DeleteDatabaseCatalogOptions.
     *
     * @return the new DeleteDatabaseCatalogOptions instance
     */
    public DeleteDatabaseCatalogOptions build() {
      return new DeleteDatabaseCatalogOptions(this);
    }

    /**
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the DeleteDatabaseCatalogOptions builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteDatabaseCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteDatabaseCatalogOptions() { }

  protected DeleteDatabaseCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.databaseId,
      "databaseId cannot be empty");
    databaseId = builder.databaseId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteDatabaseCatalogOptions builder
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

