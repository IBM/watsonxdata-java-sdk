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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Endpoints.
 */
public class PrestissimoEndpoints extends GenericModel {

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

    /**
     * Instantiates a new Builder from an existing PrestissimoEndpoints instance.
     *
     * @param prestissimoEndpoints the instance to initialize the Builder with
     */
    private Builder(PrestissimoEndpoints prestissimoEndpoints) {
      this.applicationsApi = prestissimoEndpoints.applicationsApi;
      this.historyServerEndpoint = prestissimoEndpoints.historyServerEndpoint;
      this.sparkAccessEndpoint = prestissimoEndpoints.sparkAccessEndpoint;
      this.sparkJobsV4Endpoint = prestissimoEndpoints.sparkJobsV4Endpoint;
      this.sparkKernelEndpoint = prestissimoEndpoints.sparkKernelEndpoint;
      this.viewHistoryServer = prestissimoEndpoints.viewHistoryServer;
      this.wxdApplicationEndpoint = prestissimoEndpoints.wxdApplicationEndpoint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEndpoints.
     *
     * @return the new PrestissimoEndpoints instance
     */
    public PrestissimoEndpoints build() {
      return new PrestissimoEndpoints(this);
    }

    /**
     * Set the applicationsApi.
     *
     * @param applicationsApi the applicationsApi
     * @return the PrestissimoEndpoints builder
     */
    public Builder applicationsApi(String applicationsApi) {
      this.applicationsApi = applicationsApi;
      return this;
    }

    /**
     * Set the historyServerEndpoint.
     *
     * @param historyServerEndpoint the historyServerEndpoint
     * @return the PrestissimoEndpoints builder
     */
    public Builder historyServerEndpoint(String historyServerEndpoint) {
      this.historyServerEndpoint = historyServerEndpoint;
      return this;
    }

    /**
     * Set the sparkAccessEndpoint.
     *
     * @param sparkAccessEndpoint the sparkAccessEndpoint
     * @return the PrestissimoEndpoints builder
     */
    public Builder sparkAccessEndpoint(String sparkAccessEndpoint) {
      this.sparkAccessEndpoint = sparkAccessEndpoint;
      return this;
    }

    /**
     * Set the sparkJobsV4Endpoint.
     *
     * @param sparkJobsV4Endpoint the sparkJobsV4Endpoint
     * @return the PrestissimoEndpoints builder
     */
    public Builder sparkJobsV4Endpoint(String sparkJobsV4Endpoint) {
      this.sparkJobsV4Endpoint = sparkJobsV4Endpoint;
      return this;
    }

    /**
     * Set the sparkKernelEndpoint.
     *
     * @param sparkKernelEndpoint the sparkKernelEndpoint
     * @return the PrestissimoEndpoints builder
     */
    public Builder sparkKernelEndpoint(String sparkKernelEndpoint) {
      this.sparkKernelEndpoint = sparkKernelEndpoint;
      return this;
    }

    /**
     * Set the viewHistoryServer.
     *
     * @param viewHistoryServer the viewHistoryServer
     * @return the PrestissimoEndpoints builder
     */
    public Builder viewHistoryServer(String viewHistoryServer) {
      this.viewHistoryServer = viewHistoryServer;
      return this;
    }

    /**
     * Set the wxdApplicationEndpoint.
     *
     * @param wxdApplicationEndpoint the wxdApplicationEndpoint
     * @return the PrestissimoEndpoints builder
     */
    public Builder wxdApplicationEndpoint(String wxdApplicationEndpoint) {
      this.wxdApplicationEndpoint = wxdApplicationEndpoint;
      return this;
    }
  }

  protected PrestissimoEndpoints() { }

  protected PrestissimoEndpoints(Builder builder) {
    applicationsApi = builder.applicationsApi;
    historyServerEndpoint = builder.historyServerEndpoint;
    sparkAccessEndpoint = builder.sparkAccessEndpoint;
    sparkJobsV4Endpoint = builder.sparkJobsV4Endpoint;
    sparkKernelEndpoint = builder.sparkKernelEndpoint;
    viewHistoryServer = builder.viewHistoryServer;
    wxdApplicationEndpoint = builder.wxdApplicationEndpoint;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEndpoints builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the applicationsApi.
   *
   * Application API.
   *
   * @return the applicationsApi
   */
  public String applicationsApi() {
    return applicationsApi;
  }

  /**
   * Gets the historyServerEndpoint.
   *
   * History server endpoint.
   *
   * @return the historyServerEndpoint
   */
  public String historyServerEndpoint() {
    return historyServerEndpoint;
  }

  /**
   * Gets the sparkAccessEndpoint.
   *
   * Spark kernel endpoint.
   *
   * @return the sparkAccessEndpoint
   */
  public String sparkAccessEndpoint() {
    return sparkAccessEndpoint;
  }

  /**
   * Gets the sparkJobsV4Endpoint.
   *
   * Spark jobs V4 endpoint.
   *
   * @return the sparkJobsV4Endpoint
   */
  public String sparkJobsV4Endpoint() {
    return sparkJobsV4Endpoint;
  }

  /**
   * Gets the sparkKernelEndpoint.
   *
   * Spark kernel endpoint.
   *
   * @return the sparkKernelEndpoint
   */
  public String sparkKernelEndpoint() {
    return sparkKernelEndpoint;
  }

  /**
   * Gets the viewHistoryServer.
   *
   * View history server.
   *
   * @return the viewHistoryServer
   */
  public String viewHistoryServer() {
    return viewHistoryServer;
  }

  /**
   * Gets the wxdApplicationEndpoint.
   *
   * Wxd application endpoint.
   *
   * @return the wxdApplicationEndpoint
   */
  public String wxdApplicationEndpoint() {
    return wxdApplicationEndpoint;
  }
}

