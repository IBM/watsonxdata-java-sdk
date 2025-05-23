/*
 * (C) Copyright IBM Corp. 2025.
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
 * The getIngestionJob options.
 */
public class GetIngestionJobOptions extends GenericModel {

  protected String jobId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String jobId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetIngestionJobOptions instance.
     *
     * @param getIngestionJobOptions the instance to initialize the Builder with
     */
    private Builder(GetIngestionJobOptions getIngestionJobOptions) {
      this.jobId = getIngestionJobOptions.jobId;
      this.authInstanceId = getIngestionJobOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param jobId the jobId
     * @param authInstanceId the authInstanceId
     */
    public Builder(String jobId, String authInstanceId) {
      this.jobId = jobId;
      this.authInstanceId = authInstanceId;
    }

    /**
     * Builds a GetIngestionJobOptions.
     *
     * @return the new GetIngestionJobOptions instance
     */
    public GetIngestionJobOptions build() {
      return new GetIngestionJobOptions(this);
    }

    /**
     * Set the jobId.
     *
     * @param jobId the jobId
     * @return the GetIngestionJobOptions builder
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetIngestionJobOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetIngestionJobOptions() { }

  protected GetIngestionJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.jobId,
      "jobId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    jobId = builder.jobId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetIngestionJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the jobId.
   *
   * ingestion job id.
   *
   * @return the jobId
   */
  public String jobId() {
    return jobId;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

