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
 * The listSalIntegrationEnrichmentAssets options.
 */
public class ListSalIntegrationEnrichmentAssetsOptions extends GenericModel {

  protected String projectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListSalIntegrationEnrichmentAssetsOptions instance.
     *
     * @param listSalIntegrationEnrichmentAssetsOptions the instance to initialize the Builder with
     */
    private Builder(ListSalIntegrationEnrichmentAssetsOptions listSalIntegrationEnrichmentAssetsOptions) {
      this.projectId = listSalIntegrationEnrichmentAssetsOptions.projectId;
      this.authInstanceId = listSalIntegrationEnrichmentAssetsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param projectId the projectId
     */
    public Builder(String projectId) {
      this.projectId = projectId;
    }

    /**
     * Builds a ListSalIntegrationEnrichmentAssetsOptions.
     *
     * @return the new ListSalIntegrationEnrichmentAssetsOptions instance
     */
    public ListSalIntegrationEnrichmentAssetsOptions build() {
      return new ListSalIntegrationEnrichmentAssetsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListSalIntegrationEnrichmentAssetsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListSalIntegrationEnrichmentAssetsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListSalIntegrationEnrichmentAssetsOptions() { }

  protected ListSalIntegrationEnrichmentAssetsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    projectId = builder.projectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListSalIntegrationEnrichmentAssetsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * project id of enriched schema in IBM Knowledge Catalog.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
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

