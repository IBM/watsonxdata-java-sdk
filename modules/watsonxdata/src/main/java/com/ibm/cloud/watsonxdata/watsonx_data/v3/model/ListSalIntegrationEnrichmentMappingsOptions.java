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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSalIntegrationEnrichmentMappings options.
 */
public class ListSalIntegrationEnrichmentMappingsOptions extends GenericModel {

  protected String catalogName;
  protected String schemaName;
  protected String next;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String next;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListSalIntegrationEnrichmentMappingsOptions instance.
     *
     * @param listSalIntegrationEnrichmentMappingsOptions the instance to initialize the Builder with
     */
    private Builder(ListSalIntegrationEnrichmentMappingsOptions listSalIntegrationEnrichmentMappingsOptions) {
      this.catalogName = listSalIntegrationEnrichmentMappingsOptions.catalogName;
      this.schemaName = listSalIntegrationEnrichmentMappingsOptions.schemaName;
      this.next = listSalIntegrationEnrichmentMappingsOptions.next;
      this.authInstanceId = listSalIntegrationEnrichmentMappingsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSalIntegrationEnrichmentMappingsOptions.
     *
     * @return the new ListSalIntegrationEnrichmentMappingsOptions instance
     */
    public ListSalIntegrationEnrichmentMappingsOptions build() {
      return new ListSalIntegrationEnrichmentMappingsOptions(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ListSalIntegrationEnrichmentMappingsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ListSalIntegrationEnrichmentMappingsOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the next.
     *
     * @param next the next
     * @return the ListSalIntegrationEnrichmentMappingsOptions builder
     */
    public Builder next(String next) {
      this.next = next;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListSalIntegrationEnrichmentMappingsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListSalIntegrationEnrichmentMappingsOptions() { }

  protected ListSalIntegrationEnrichmentMappingsOptions(Builder builder) {
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    next = builder.next;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListSalIntegrationEnrichmentMappingsOptions builder
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
   * reference as an continue of reading results from earlier query (if the results exceed 100).
   *
   * @return the next
   */
  public String next() {
    return next;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

