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
 * The listSalIntegrationEnrichmentDataAssets options.
 */
public class ListSalIntegrationEnrichmentDataAssetsOptions extends GenericModel {

  protected String projectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListSalIntegrationEnrichmentDataAssetsOptions instance.
     *
     * @param listSalIntegrationEnrichmentDataAssetsOptions the instance to initialize the Builder with
     */
    private Builder(ListSalIntegrationEnrichmentDataAssetsOptions listSalIntegrationEnrichmentDataAssetsOptions) {
      this.projectId = listSalIntegrationEnrichmentDataAssetsOptions.projectId;
      this.authInstanceId = listSalIntegrationEnrichmentDataAssetsOptions.authInstanceId;
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
     * Builds a ListSalIntegrationEnrichmentDataAssetsOptions.
     *
     * @return the new ListSalIntegrationEnrichmentDataAssetsOptions instance
     */
    public ListSalIntegrationEnrichmentDataAssetsOptions build() {
      return new ListSalIntegrationEnrichmentDataAssetsOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ListSalIntegrationEnrichmentDataAssetsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListSalIntegrationEnrichmentDataAssetsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListSalIntegrationEnrichmentDataAssetsOptions() { }

  protected ListSalIntegrationEnrichmentDataAssetsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    projectId = builder.projectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListSalIntegrationEnrichmentDataAssetsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * project id of enriched schema in Watsonx.data Intelligence.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
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

