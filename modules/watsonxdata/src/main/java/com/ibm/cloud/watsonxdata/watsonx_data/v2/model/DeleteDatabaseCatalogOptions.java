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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteDatabaseCatalog options.
 */
public class DeleteDatabaseCatalogOptions extends GenericModel {

  protected String id;
  protected String authInstanceId;
  protected String secret;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String authInstanceId;
    private String secret;

    /**
     * Instantiates a new Builder from an existing DeleteDatabaseCatalogOptions instance.
     *
     * @param deleteDatabaseCatalogOptions the instance to initialize the Builder with
     */
    private Builder(DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions) {
      this.id = deleteDatabaseCatalogOptions.id;
      this.authInstanceId = deleteDatabaseCatalogOptions.authInstanceId;
      this.secret = deleteDatabaseCatalogOptions.secret;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
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
     * Set the id.
     *
     * @param id the id
     * @return the DeleteDatabaseCatalogOptions builder
     */
    public Builder id(String id) {
      this.id = id;
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

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the DeleteDatabaseCatalogOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }
  }

  protected DeleteDatabaseCatalogOptions() { }

  protected DeleteDatabaseCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    authInstanceId = builder.authInstanceId;
    secret = builder.secret;
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
   * Gets the id.
   *
   * database id.
   *
   * @return the id
   */
  public String id() {
    return id;
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

  /**
   * Gets the secret.
   *
   * secret auth for internal calls.
   *
   * @return the secret
   */
  public String secret() {
    return secret;
  }
}

