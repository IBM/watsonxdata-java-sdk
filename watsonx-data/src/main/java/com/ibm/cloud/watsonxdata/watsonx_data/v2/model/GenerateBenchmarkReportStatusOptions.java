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
 * The generateBenchmarkReportStatus options.
 */
public class GenerateBenchmarkReportStatusOptions extends GenericModel {

  protected String reqId;
  protected String engineId;
  protected String bucketName;
  protected String podName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String reqId;
    private String engineId;
    private String bucketName;
    private String podName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GenerateBenchmarkReportStatusOptions instance.
     *
     * @param generateBenchmarkReportStatusOptions the instance to initialize the Builder with
     */
    private Builder(GenerateBenchmarkReportStatusOptions generateBenchmarkReportStatusOptions) {
      this.reqId = generateBenchmarkReportStatusOptions.reqId;
      this.engineId = generateBenchmarkReportStatusOptions.engineId;
      this.bucketName = generateBenchmarkReportStatusOptions.bucketName;
      this.podName = generateBenchmarkReportStatusOptions.podName;
      this.authInstanceId = generateBenchmarkReportStatusOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param reqId the reqId
     * @param engineId the engineId
     * @param bucketName the bucketName
     * @param podName the podName
     */
    public Builder(String reqId, String engineId, String bucketName, String podName) {
      this.reqId = reqId;
      this.engineId = engineId;
      this.bucketName = bucketName;
      this.podName = podName;
    }

    /**
     * Builds a GenerateBenchmarkReportStatusOptions.
     *
     * @return the new GenerateBenchmarkReportStatusOptions instance
     */
    public GenerateBenchmarkReportStatusOptions build() {
      return new GenerateBenchmarkReportStatusOptions(this);
    }

    /**
     * Set the reqId.
     *
     * @param reqId the reqId
     * @return the GenerateBenchmarkReportStatusOptions builder
     */
    public Builder reqId(String reqId) {
      this.reqId = reqId;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the GenerateBenchmarkReportStatusOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the GenerateBenchmarkReportStatusOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the podName.
     *
     * @param podName the podName
     * @return the GenerateBenchmarkReportStatusOptions builder
     */
    public Builder podName(String podName) {
      this.podName = podName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GenerateBenchmarkReportStatusOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GenerateBenchmarkReportStatusOptions() { }

  protected GenerateBenchmarkReportStatusOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.reqId,
      "reqId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.podName,
      "podName cannot be null");
    reqId = builder.reqId;
    engineId = builder.engineId;
    bucketName = builder.bucketName;
    podName = builder.podName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GenerateBenchmarkReportStatusOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the reqId.
   *
   * request_id.
   *
   * @return the reqId
   */
  public String reqId() {
    return reqId;
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the bucketName.
   *
   * bucket name.
   *
   * @return the bucketName
   */
  public String bucketName() {
    return bucketName;
  }

  /**
   * Gets the podName.
   *
   * specify the pod name of the respective presto pod like coordinator(single node),
   * coordinator-blue-0,worker-0(multinode).
   *
   * @return the podName
   */
  public String podName() {
    return podName;
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

