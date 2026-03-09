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
 * The listSalIntegrationMappings options.
 */
public class ListSalIntegrationMappingsOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String next;
  protected Long limit;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String next;
    private Long limit;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListSalIntegrationMappingsOptions instance.
     *
     * @param listSalIntegrationMappingsOptions the instance to initialize the Builder with
     */
    private Builder(ListSalIntegrationMappingsOptions listSalIntegrationMappingsOptions) {
      this.catalogName = listSalIntegrationMappingsOptions.catalogName;
      this.schemaName = listSalIntegrationMappingsOptions.schemaName;
      this.next = listSalIntegrationMappingsOptions.next;
      this.limit = listSalIntegrationMappingsOptions.limit;
      this.authInstanceId = listSalIntegrationMappingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSalIntegrationMappingsOptions.
     *
     * @return the new ListSalIntegrationMappingsOptions instance
     */
    public ListSalIntegrationMappingsOptions build() {
      return new ListSalIntegrationMappingsOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListSalIntegrationMappingsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ListSalIntegrationMappingsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the next.
     *
     * @param next the next
     * @return the ListSalIntegrationMappingsOptions builder
     */
    public Builder next(String next) {
      this.next = next;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSalIntegrationMappingsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListSalIntegrationMappingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListSalIntegrationMappingsOptions() { }

  protected ListSalIntegrationMappingsOptions(Builder builder) {
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    next = builder.next;
    limit = builder.limit;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListSalIntegrationMappingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogName.
   *
   * catalog name in Watsonx.data.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the schemaName.
   *
   * schema name in Watsonx.data.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the next.
   *
   * reference as an continuing results from earlier query.
   *
   * @return the next
   */
  public String next() {
    return next;
  }

  /**
   * Gets the limit.
   *
   * number of results to return in one response.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
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

