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
 * The getSalIntegrationMappings options.
 */
public class GetSalIntegrationMappingsOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationMappingsOptions instance.
     *
     * @param getSalIntegrationMappingsOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationMappingsOptions getSalIntegrationMappingsOptions) {
      this.catalogName = getSalIntegrationMappingsOptions.catalogName;
      this.schemaName = getSalIntegrationMappingsOptions.schemaName;
      this.authInstanceId = getSalIntegrationMappingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogName the catalogName
     * @param schemaName the schemaName
     */
    public Builder(String catalogName, String schemaName) {
      this.catalogName = catalogName;
      this.schemaName = schemaName;
    }

    /**
     * Builds a GetSalIntegrationMappingsOptions.
     *
     * @return the new GetSalIntegrationMappingsOptions instance
     */
    public GetSalIntegrationMappingsOptions build() {
      return new GetSalIntegrationMappingsOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the GetSalIntegrationMappingsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the GetSalIntegrationMappingsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationMappingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationMappingsOptions() { }

  protected GetSalIntegrationMappingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schemaName,
      "schemaName cannot be null");
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationMappingsOptions builder
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
   * Gets the schemaName.
   *
   * schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
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

