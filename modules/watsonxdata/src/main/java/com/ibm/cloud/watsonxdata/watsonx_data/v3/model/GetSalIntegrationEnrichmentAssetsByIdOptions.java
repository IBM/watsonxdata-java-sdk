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
 * The getSalIntegrationEnrichmentAssetsById options.
 */
public class GetSalIntegrationEnrichmentAssetsByIdOptions extends GenericModel {

  protected String projectId;
  protected String id;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String id;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentAssetsByIdOptions instance.
     *
     * @param getSalIntegrationEnrichmentAssetsByIdOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentAssetsByIdOptions getSalIntegrationEnrichmentAssetsByIdOptions) {
      this.projectId = getSalIntegrationEnrichmentAssetsByIdOptions.projectId;
      this.id = getSalIntegrationEnrichmentAssetsByIdOptions.id;
      this.authInstanceId = getSalIntegrationEnrichmentAssetsByIdOptions.authInstanceId;
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
     * @param id the id
     */
    public Builder(String projectId, String id) {
      this.projectId = projectId;
      this.id = id;
    }

    /**
     * Builds a GetSalIntegrationEnrichmentAssetsByIdOptions.
     *
     * @return the new GetSalIntegrationEnrichmentAssetsByIdOptions instance
     */
    public GetSalIntegrationEnrichmentAssetsByIdOptions build() {
      return new GetSalIntegrationEnrichmentAssetsByIdOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetSalIntegrationEnrichmentAssetsByIdOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetSalIntegrationEnrichmentAssetsByIdOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentAssetsByIdOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentAssetsByIdOptions() { }

  protected GetSalIntegrationEnrichmentAssetsByIdOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.projectId,
      "projectId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    projectId = builder.projectId;
    id = builder.id;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentAssetsByIdOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * enrichment project id in IBM Knowledge Catalog.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the id.
   *
   * enrichment data asset id in IBM Knowledge Catalog.
   *
   * @return the id
   */
  public String id() {
    return id;
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

