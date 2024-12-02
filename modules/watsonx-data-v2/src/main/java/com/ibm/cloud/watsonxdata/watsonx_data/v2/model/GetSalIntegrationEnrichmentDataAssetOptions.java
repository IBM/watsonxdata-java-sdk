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
 * The getSalIntegrationEnrichmentDataAsset options.
 */
public class GetSalIntegrationEnrichmentDataAssetOptions extends GenericModel {

  protected String projectId;
  protected String assetId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String projectId;
    private String assetId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentDataAssetOptions instance.
     *
     * @param getSalIntegrationEnrichmentDataAssetOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentDataAssetOptions getSalIntegrationEnrichmentDataAssetOptions) {
      this.projectId = getSalIntegrationEnrichmentDataAssetOptions.projectId;
      this.assetId = getSalIntegrationEnrichmentDataAssetOptions.assetId;
      this.authInstanceId = getSalIntegrationEnrichmentDataAssetOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationEnrichmentDataAssetOptions.
     *
     * @return the new GetSalIntegrationEnrichmentDataAssetOptions instance
     */
    public GetSalIntegrationEnrichmentDataAssetOptions build() {
      return new GetSalIntegrationEnrichmentDataAssetOptions(this);
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetSalIntegrationEnrichmentDataAssetOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the GetSalIntegrationEnrichmentDataAssetOptions builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentDataAssetOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentDataAssetOptions() { }

  protected GetSalIntegrationEnrichmentDataAssetOptions(Builder builder) {
    projectId = builder.projectId;
    assetId = builder.assetId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentDataAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the projectId.
   *
   * enrichment project id.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the assetId.
   *
   * enrichment data asset id.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
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

