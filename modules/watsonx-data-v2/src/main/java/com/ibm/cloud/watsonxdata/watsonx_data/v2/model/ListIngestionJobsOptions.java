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
 * The listIngestionJobs options.
 */
public class ListIngestionJobsOptions extends GenericModel {

  protected String authInstanceId;
  protected String start;
  protected Long jobsPerPage;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String start;
    private Long jobsPerPage;

    /**
     * Instantiates a new Builder from an existing ListIngestionJobsOptions instance.
     *
     * @param listIngestionJobsOptions the instance to initialize the Builder with
     */
    private Builder(ListIngestionJobsOptions listIngestionJobsOptions) {
      this.authInstanceId = listIngestionJobsOptions.authInstanceId;
      this.start = listIngestionJobsOptions.start;
      this.jobsPerPage = listIngestionJobsOptions.jobsPerPage;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authInstanceId the authInstanceId
     */
    public Builder(String authInstanceId) {
      this.authInstanceId = authInstanceId;
    }

    /**
     * Builds a ListIngestionJobsOptions.
     *
     * @return the new ListIngestionJobsOptions instance
     */
    public ListIngestionJobsOptions build() {
      return new ListIngestionJobsOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListIngestionJobsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListIngestionJobsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the jobsPerPage.
     *
     * @param jobsPerPage the jobsPerPage
     * @return the ListIngestionJobsOptions builder
     */
    public Builder jobsPerPage(long jobsPerPage) {
      this.jobsPerPage = jobsPerPage;
      return this;
    }
  }

  protected ListIngestionJobsOptions() { }

  protected ListIngestionJobsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    authInstanceId = builder.authInstanceId;
    start = builder.start;
    jobsPerPage = builder.jobsPerPage;
  }

  /**
   * New builder.
   *
   * @return a ListIngestionJobsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

  /**
   * Gets the start.
   *
   * Page number of requested ingestion jobs.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the jobsPerPage.
   *
   * Number of requested ingestion jobs.
   *
   * @return the jobsPerPage
   */
  public Long jobsPerPage() {
    return jobsPerPage;
  }
}

