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
 * The getDatabaseProperties options.
 */
public class GetDatabasePropertiesOptions extends GenericModel {

  protected String secret;
  protected String databaseIds;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String secret;
    private String databaseIds;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetDatabasePropertiesOptions instance.
     *
     * @param getDatabasePropertiesOptions the instance to initialize the Builder with
     */
    private Builder(GetDatabasePropertiesOptions getDatabasePropertiesOptions) {
      this.secret = getDatabasePropertiesOptions.secret;
      this.databaseIds = getDatabasePropertiesOptions.databaseIds;
      this.authInstanceId = getDatabasePropertiesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param secret the secret
     */
    public Builder(String secret) {
      this.secret = secret;
    }

    /**
     * Builds a GetDatabasePropertiesOptions.
     *
     * @return the new GetDatabasePropertiesOptions instance
     */
    public GetDatabasePropertiesOptions build() {
      return new GetDatabasePropertiesOptions(this);
    }

    /**
     * Set the secret.
     *
     * @param secret the secret
     * @return the GetDatabasePropertiesOptions builder
     */
    public Builder secret(String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Set the databaseIds.
     *
     * @param databaseIds the databaseIds
     * @return the GetDatabasePropertiesOptions builder
     */
    public Builder databaseIds(String databaseIds) {
      this.databaseIds = databaseIds;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetDatabasePropertiesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetDatabasePropertiesOptions() { }

  protected GetDatabasePropertiesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.secret,
      "secret cannot be null");
    secret = builder.secret;
    databaseIds = builder.databaseIds;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetDatabasePropertiesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the secret.
   *
   * API Authentication service token.
   *
   * @return the secret
   */
  public String secret() {
    return secret;
  }

  /**
   * Gets the databaseIds.
   *
   * List of database Ids whose properties need to be sent.
   *
   * @return the databaseIds
   */
  public String databaseIds() {
    return databaseIds;
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

