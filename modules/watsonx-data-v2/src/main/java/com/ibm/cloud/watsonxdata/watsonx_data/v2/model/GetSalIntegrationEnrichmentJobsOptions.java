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
 * The getSalIntegrationEnrichmentJobs options.
 */
public class GetSalIntegrationEnrichmentJobsOptions extends GenericModel {

  protected String wkcProjectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String wkcProjectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentJobsOptions instance.
     *
     * @param getSalIntegrationEnrichmentJobsOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentJobsOptions getSalIntegrationEnrichmentJobsOptions) {
      this.wkcProjectId = getSalIntegrationEnrichmentJobsOptions.wkcProjectId;
      this.authInstanceId = getSalIntegrationEnrichmentJobsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationEnrichmentJobsOptions.
     *
     * @return the new GetSalIntegrationEnrichmentJobsOptions instance
     */
    public GetSalIntegrationEnrichmentJobsOptions build() {
      return new GetSalIntegrationEnrichmentJobsOptions(this);
    }

    /**
     * Set the wkcProjectId.
     *
     * @param wkcProjectId the wkcProjectId
     * @return the GetSalIntegrationEnrichmentJobsOptions builder
     */
    public Builder wkcProjectId(String wkcProjectId) {
      this.wkcProjectId = wkcProjectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentJobsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentJobsOptions() { }

  protected GetSalIntegrationEnrichmentJobsOptions(Builder builder) {
    wkcProjectId = builder.wkcProjectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the wkcProjectId.
   *
   * ikc project id.
   *
   * @return the wkcProjectId
   */
  public String wkcProjectId() {
    return wkcProjectId;
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

