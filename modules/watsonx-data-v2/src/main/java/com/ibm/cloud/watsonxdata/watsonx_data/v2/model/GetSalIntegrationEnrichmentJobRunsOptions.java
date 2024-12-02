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
 * The getSalIntegrationEnrichmentJobRuns options.
 */
public class GetSalIntegrationEnrichmentJobRunsOptions extends GenericModel {

  protected String jobId;
  protected String projectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String projectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentJobRunsOptions instance.
     *
     * @param getSalIntegrationEnrichmentJobRunsOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentJobRunsOptions getSalIntegrationEnrichmentJobRunsOptions) {
      this.jobId = getSalIntegrationEnrichmentJobRunsOptions.jobId;
      this.projectId = getSalIntegrationEnrichmentJobRunsOptions.projectId;
      this.authInstanceId = getSalIntegrationEnrichmentJobRunsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationEnrichmentJobRunsOptions.
     *
     * @return the new GetSalIntegrationEnrichmentJobRunsOptions instance
     */
    public GetSalIntegrationEnrichmentJobRunsOptions build() {
      return new GetSalIntegrationEnrichmentJobRunsOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetSalIntegrationEnrichmentJobRunsOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetSalIntegrationEnrichmentJobRunsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentJobRunsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentJobRunsOptions() { }

  protected GetSalIntegrationEnrichmentJobRunsOptions(Builder builder) {
    jobId = builder.jobId;
    projectId = builder.projectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentJobRunsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * enrichment job id.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
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

