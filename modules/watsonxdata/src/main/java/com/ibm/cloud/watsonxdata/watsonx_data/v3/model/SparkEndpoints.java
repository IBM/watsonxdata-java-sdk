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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark engine endpoints.
 */
public class SparkEndpoints extends GenericModel {

  @SerializedName("applications_api")
  protected String applicationsApi;
  @SerializedName("history_server_endpoint")
  protected String historyServerEndpoint;
  @SerializedName("spark_access_endpoint")
  protected String sparkAccessEndpoint;
  @SerializedName("spark_jobs_v4_endpoint")
  protected String sparkJobsV4Endpoint;
  @SerializedName("spark_kernel_endpoint")
  protected String sparkKernelEndpoint;
  @SerializedName("view_history_server")
  protected String viewHistoryServer;
  @SerializedName("wxd_application_endpoint")
  protected String wxdApplicationEndpoint;
  @SerializedName("wxd_engine_endpoint")
  protected String wxdEngineEndpoint;
  @SerializedName("wxd_history_server_endpoint")
  protected String wxdHistoryServerEndpoint;
  @SerializedName("wxd_history_server_ui_endpoint")
  protected String wxdHistoryServerUiEndpoint;

  /**
   * Builder.
   */
  public static class Builder {
    private String applicationsApi;
    private String historyServerEndpoint;
    private String sparkAccessEndpoint;
    private String sparkJobsV4Endpoint;
    private String sparkKernelEndpoint;
    private String viewHistoryServer;
    private String wxdApplicationEndpoint;
    private String wxdEngineEndpoint;
    private String wxdHistoryServerEndpoint;
    private String wxdHistoryServerUiEndpoint;

    /**
     * Instantiates a new Builder from an existing SparkEndpoints instance.
     *
     * @param sparkEndpoints the instance to initialize the Builder with
     */
    private Builder(SparkEndpoints sparkEndpoints) {
      this.applicationsApi = sparkEndpoints.applicationsApi;
      this.historyServerEndpoint = sparkEndpoints.historyServerEndpoint;
      this.sparkAccessEndpoint = sparkEndpoints.sparkAccessEndpoint;
      this.sparkJobsV4Endpoint = sparkEndpoints.sparkJobsV4Endpoint;
      this.sparkKernelEndpoint = sparkEndpoints.sparkKernelEndpoint;
      this.viewHistoryServer = sparkEndpoints.viewHistoryServer;
      this.wxdApplicationEndpoint = sparkEndpoints.wxdApplicationEndpoint;
      this.wxdEngineEndpoint = sparkEndpoints.wxdEngineEndpoint;
      this.wxdHistoryServerEndpoint = sparkEndpoints.wxdHistoryServerEndpoint;
      this.wxdHistoryServerUiEndpoint = sparkEndpoints.wxdHistoryServerUiEndpoint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEndpoints.
     *
     * @return the new SparkEndpoints instance
     */
    public SparkEndpoints build() {
      return new SparkEndpoints(this);
    }

    /**
     * Set the applicationsApi.
     *
     * @param applicationsApi the applicationsApi
     * @return the SparkEndpoints builder
     */
    public Builder applicationsApi(String applicationsApi) {
      this.applicationsApi = applicationsApi;
      return this;
    }

    /**
     * Set the historyServerEndpoint.
     *
     * @param historyServerEndpoint the historyServerEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder historyServerEndpoint(String historyServerEndpoint) {
      this.historyServerEndpoint = historyServerEndpoint;
      return this;
    }

    /**
     * Set the sparkAccessEndpoint.
     *
     * @param sparkAccessEndpoint the sparkAccessEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder sparkAccessEndpoint(String sparkAccessEndpoint) {
      this.sparkAccessEndpoint = sparkAccessEndpoint;
      return this;
    }

    /**
     * Set the sparkJobsV4Endpoint.
     *
     * @param sparkJobsV4Endpoint the sparkJobsV4Endpoint
     * @return the SparkEndpoints builder
     */
    public Builder sparkJobsV4Endpoint(String sparkJobsV4Endpoint) {
      this.sparkJobsV4Endpoint = sparkJobsV4Endpoint;
      return this;
    }

    /**
     * Set the sparkKernelEndpoint.
     *
     * @param sparkKernelEndpoint the sparkKernelEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder sparkKernelEndpoint(String sparkKernelEndpoint) {
      this.sparkKernelEndpoint = sparkKernelEndpoint;
      return this;
    }

    /**
     * Set the viewHistoryServer.
     *
     * @param viewHistoryServer the viewHistoryServer
     * @return the SparkEndpoints builder
     */
    public Builder viewHistoryServer(String viewHistoryServer) {
      this.viewHistoryServer = viewHistoryServer;
      return this;
    }

    /**
     * Set the wxdApplicationEndpoint.
     *
     * @param wxdApplicationEndpoint the wxdApplicationEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder wxdApplicationEndpoint(String wxdApplicationEndpoint) {
      this.wxdApplicationEndpoint = wxdApplicationEndpoint;
      return this;
    }

    /**
     * Set the wxdEngineEndpoint.
     *
     * @param wxdEngineEndpoint the wxdEngineEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder wxdEngineEndpoint(String wxdEngineEndpoint) {
      this.wxdEngineEndpoint = wxdEngineEndpoint;
      return this;
    }

    /**
     * Set the wxdHistoryServerEndpoint.
     *
     * @param wxdHistoryServerEndpoint the wxdHistoryServerEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder wxdHistoryServerEndpoint(String wxdHistoryServerEndpoint) {
      this.wxdHistoryServerEndpoint = wxdHistoryServerEndpoint;
      return this;
    }

    /**
     * Set the wxdHistoryServerUiEndpoint.
     *
     * @param wxdHistoryServerUiEndpoint the wxdHistoryServerUiEndpoint
     * @return the SparkEndpoints builder
     */
    public Builder wxdHistoryServerUiEndpoint(String wxdHistoryServerUiEndpoint) {
      this.wxdHistoryServerUiEndpoint = wxdHistoryServerUiEndpoint;
      return this;
    }
  }

  protected SparkEndpoints() { }

  protected SparkEndpoints(Builder builder) {
    applicationsApi = builder.applicationsApi;
    historyServerEndpoint = builder.historyServerEndpoint;
    sparkAccessEndpoint = builder.sparkAccessEndpoint;
    sparkJobsV4Endpoint = builder.sparkJobsV4Endpoint;
    sparkKernelEndpoint = builder.sparkKernelEndpoint;
    viewHistoryServer = builder.viewHistoryServer;
    wxdApplicationEndpoint = builder.wxdApplicationEndpoint;
    wxdEngineEndpoint = builder.wxdEngineEndpoint;
    wxdHistoryServerEndpoint = builder.wxdHistoryServerEndpoint;
    wxdHistoryServerUiEndpoint = builder.wxdHistoryServerUiEndpoint;
  }

  /**
   * New builder.
   *
   * @return a SparkEndpoints builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the applicationsApi.
   *
   * Application API. This property is available only for external Spark engines.
   *
   * @return the applicationsApi
   */
  public String applicationsApi() {
    return applicationsApi;
  }

  /**
   * Gets the historyServerEndpoint.
   *
   * History server endpoint. This property is available only for external Spark engines.
   *
   * @return the historyServerEndpoint
   */
  public String historyServerEndpoint() {
    return historyServerEndpoint;
  }

  /**
   * Gets the sparkAccessEndpoint.
   *
   * Details UI for Analytics Engine instance being used as external Spark engine. This property is available only for
   * external Spark engines.
   *
   * @return the sparkAccessEndpoint
   */
  public String sparkAccessEndpoint() {
    return sparkAccessEndpoint;
  }

  /**
   * Gets the sparkJobsV4Endpoint.
   *
   * Spark jobs V4 endpoint. This property is available only for external Spark engines.
   *
   * @return the sparkJobsV4Endpoint
   */
  public String sparkJobsV4Endpoint() {
    return sparkJobsV4Endpoint;
  }

  /**
   * Gets the sparkKernelEndpoint.
   *
   * Spark kernel endpoint. This property is available only for external Spark engines.
   *
   * @return the sparkKernelEndpoint
   */
  public String sparkKernelEndpoint() {
    return sparkKernelEndpoint;
  }

  /**
   * Gets the viewHistoryServer.
   *
   * View history server. This property is available only for external Spark engines.
   *
   * @return the viewHistoryServer
   */
  public String viewHistoryServer() {
    return viewHistoryServer;
  }

  /**
   * Gets the wxdApplicationEndpoint.
   *
   * Native Spark engine  application endpoint. This property is available only for native Spark engines.
   *
   * @return the wxdApplicationEndpoint
   */
  public String wxdApplicationEndpoint() {
    return wxdApplicationEndpoint;
  }

  /**
   * Gets the wxdEngineEndpoint.
   *
   * Native Spark engine endpoint. This property is available only for native Spark engines.
   *
   * @return the wxdEngineEndpoint
   */
  public String wxdEngineEndpoint() {
    return wxdEngineEndpoint;
  }

  /**
   * Gets the wxdHistoryServerEndpoint.
   *
   * Native Spark engine  history server management endpoint. This property is available only for native Spark engines.
   *
   * @return the wxdHistoryServerEndpoint
   */
  public String wxdHistoryServerEndpoint() {
    return wxdHistoryServerEndpoint;
  }

  /**
   * Gets the wxdHistoryServerUiEndpoint.
   *
   * Native Spark engine history UI URL. This property is available only for native Spark engines.
   *
   * @return the wxdHistoryServerUiEndpoint
   */
  public String wxdHistoryServerUiEndpoint() {
    return wxdHistoryServerUiEndpoint;
  }
}

