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
 * The deleteSparkEngineCatalogs options.
 */
public class DeleteSparkEngineCatalogsOptions extends GenericModel {

  protected String id;
  protected String catalogNames;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String catalogNames;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteSparkEngineCatalogsOptions instance.
     *
     * @param deleteSparkEngineCatalogsOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSparkEngineCatalogsOptions deleteSparkEngineCatalogsOptions) {
      this.id = deleteSparkEngineCatalogsOptions.id;
      this.catalogNames = deleteSparkEngineCatalogsOptions.catalogNames;
      this.authInstanceId = deleteSparkEngineCatalogsOptions.authInstanceId;
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
     * @param catalogNames the catalogNames
     */
    public Builder(String id, String catalogNames) {
      this.id = id;
      this.catalogNames = catalogNames;
    }

    /**
     * Builds a DeleteSparkEngineCatalogsOptions.
     *
     * @return the new DeleteSparkEngineCatalogsOptions instance
     */
    public DeleteSparkEngineCatalogsOptions build() {
      return new DeleteSparkEngineCatalogsOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteSparkEngineCatalogsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the catalogNames.
     *
     * @param catalogNames the catalogNames
     * @return the DeleteSparkEngineCatalogsOptions builder
     */
    public Builder catalogNames(String catalogNames) {
      this.catalogNames = catalogNames;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteSparkEngineCatalogsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteSparkEngineCatalogsOptions() { }

  protected DeleteSparkEngineCatalogsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogNames,
      "catalogNames cannot be null");
    id = builder.id;
    catalogNames = builder.catalogNames;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSparkEngineCatalogsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the catalogNames.
   *
   * Catalog id(s) to be stopped, comma separated.
   *
   * @return the catalogNames
   */
  public String catalogNames() {
    return catalogNames;
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

