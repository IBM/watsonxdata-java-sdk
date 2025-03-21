/*
 * (C) Copyright IBM Corp. 2025.
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
 * The getSchemaDetails options.
 */
public class GetSchemaDetailsOptions extends GenericModel {

  protected String schemaName;
  protected String catalogName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String schemaName;
    private String catalogName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSchemaDetailsOptions instance.
     *
     * @param getSchemaDetailsOptions the instance to initialize the Builder with
     */
    private Builder(GetSchemaDetailsOptions getSchemaDetailsOptions) {
      this.schemaName = getSchemaDetailsOptions.schemaName;
      this.catalogName = getSchemaDetailsOptions.catalogName;
      this.authInstanceId = getSchemaDetailsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param schemaName the schemaName
     */
    public Builder(String schemaName) {
      this.schemaName = schemaName;
    }

    /**
     * Builds a GetSchemaDetailsOptions.
     *
     * @return the new GetSchemaDetailsOptions instance
     */
    public GetSchemaDetailsOptions build() {
      return new GetSchemaDetailsOptions(this);
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the GetSchemaDetailsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the GetSchemaDetailsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSchemaDetailsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSchemaDetailsOptions() { }

  protected GetSchemaDetailsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.schemaName,
      "schemaName cannot be empty");
    schemaName = builder.schemaName;
    catalogName = builder.catalogName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSchemaDetailsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

