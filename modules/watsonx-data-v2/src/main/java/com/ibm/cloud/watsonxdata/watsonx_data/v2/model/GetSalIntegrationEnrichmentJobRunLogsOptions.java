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
 * The getSalIntegrationEnrichmentJobRunLogs options.
 */
public class GetSalIntegrationEnrichmentJobRunLogsOptions extends GenericModel {

  protected String jobId;
  protected String jobRunId;
  protected String projectId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String jobRunId;
    private String projectId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationEnrichmentJobRunLogsOptions instance.
     *
     * @param getSalIntegrationEnrichmentJobRunLogsOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationEnrichmentJobRunLogsOptions getSalIntegrationEnrichmentJobRunLogsOptions) {
      this.jobId = getSalIntegrationEnrichmentJobRunLogsOptions.jobId;
      this.jobRunId = getSalIntegrationEnrichmentJobRunLogsOptions.jobRunId;
      this.projectId = getSalIntegrationEnrichmentJobRunLogsOptions.projectId;
      this.authInstanceId = getSalIntegrationEnrichmentJobRunLogsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationEnrichmentJobRunLogsOptions.
     *
     * @return the new GetSalIntegrationEnrichmentJobRunLogsOptions instance
     */
    public GetSalIntegrationEnrichmentJobRunLogsOptions build() {
      return new GetSalIntegrationEnrichmentJobRunLogsOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetSalIntegrationEnrichmentJobRunLogsOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the jobRunId.
     *
     * @param jobRunId the jobRunId
     * @return the GetSalIntegrationEnrichmentJobRunLogsOptions builder
     */
    public Builder jobRunId(String jobRunId) {
      this.jobRunId = jobRunId;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the GetSalIntegrationEnrichmentJobRunLogsOptions builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationEnrichmentJobRunLogsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationEnrichmentJobRunLogsOptions() { }

  protected GetSalIntegrationEnrichmentJobRunLogsOptions(Builder builder) {
    jobId = builder.jobId;
    jobRunId = builder.jobRunId;
    projectId = builder.projectId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationEnrichmentJobRunLogsOptions builder
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
   * Gets the jobRunId.
   *
   * enrichment job run id.
   *
   * @return the jobRunId
   */
  public String jobRunId() {
    return jobRunId;
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

