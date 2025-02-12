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
 * The generateBenchmarkReport options.
 */
public class GenerateBenchmarkReportOptions extends GenericModel {

  protected String bucketName;
  protected String engineId;
  protected String podName;
  protected String fileCount;
  protected String fileSize;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketName;
    private String engineId;
    private String podName;
    private String fileCount;
    private String fileSize;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GenerateBenchmarkReportOptions instance.
     *
     * @param generateBenchmarkReportOptions the instance to initialize the Builder with
     */
    private Builder(GenerateBenchmarkReportOptions generateBenchmarkReportOptions) {
      this.bucketName = generateBenchmarkReportOptions.bucketName;
      this.engineId = generateBenchmarkReportOptions.engineId;
      this.podName = generateBenchmarkReportOptions.podName;
      this.fileCount = generateBenchmarkReportOptions.fileCount;
      this.fileSize = generateBenchmarkReportOptions.fileSize;
      this.authInstanceId = generateBenchmarkReportOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketName the bucketName
     * @param engineId the engineId
     * @param podName the podName
     */
    public Builder(String bucketName, String engineId, String podName) {
      this.bucketName = bucketName;
      this.engineId = engineId;
      this.podName = podName;
    }

    /**
     * Builds a GenerateBenchmarkReportOptions.
     *
     * @return the new GenerateBenchmarkReportOptions instance
     */
    public GenerateBenchmarkReportOptions build() {
      return new GenerateBenchmarkReportOptions(this);
    }

    /**
     * Set the bucketName.
     *
     * @param bucketName the bucketName
     * @return the GenerateBenchmarkReportOptions builder
     */
    public Builder bucketName(String bucketName) {
      this.bucketName = bucketName;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the GenerateBenchmarkReportOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the podName.
     *
     * @param podName the podName
     * @return the GenerateBenchmarkReportOptions builder
     */
    public Builder podName(String podName) {
      this.podName = podName;
      return this;
    }

    /**
     * Set the fileCount.
     *
     * @param fileCount the fileCount
     * @return the GenerateBenchmarkReportOptions builder
     */
    public Builder fileCount(String fileCount) {
      this.fileCount = fileCount;
      return this;
    }

    /**
     * Set the fileSize.
     *
     * @param fileSize the fileSize
     * @return the GenerateBenchmarkReportOptions builder
     */
    public Builder fileSize(String fileSize) {
      this.fileSize = fileSize;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GenerateBenchmarkReportOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GenerateBenchmarkReportOptions() { }

  protected GenerateBenchmarkReportOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketName,
      "bucketName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.podName,
      "podName cannot be null");
    bucketName = builder.bucketName;
    engineId = builder.engineId;
    podName = builder.podName;
    fileCount = builder.fileCount;
    fileSize = builder.fileSize;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GenerateBenchmarkReportOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the fileCount.
   *
   * configure file_count and file_size for benchmarking.
   *
   * @return the fileCount
   */
  public String fileCount() {
    return fileCount;
  }

  /**
   * Gets the fileSize.
   *
   * configure file_count and file_size for benchmarking.
   *
   * @return the fileSize
   */
  public String fileSize() {
    return fileSize;
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

