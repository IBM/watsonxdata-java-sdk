/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Endpoints.
 */
public class Endpoints extends GenericModel {

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

  protected Endpoints() { }

  /**
   * Gets the applicationsApi.
   *
   * Application API.
   *
   * @return the applicationsApi
   */
  public String getApplicationsApi() {
    return applicationsApi;
  }

  /**
   * Gets the historyServerEndpoint.
   *
   * History server endpoint.
   *
   * @return the historyServerEndpoint
   */
  public String getHistoryServerEndpoint() {
    return historyServerEndpoint;
  }

  /**
   * Gets the sparkAccessEndpoint.
   *
   * Spark kernel endpoint.
   *
   * @return the sparkAccessEndpoint
   */
  public String getSparkAccessEndpoint() {
    return sparkAccessEndpoint;
  }

  /**
   * Gets the sparkJobsV4Endpoint.
   *
   * Spark jobs V4 endpoint.
   *
   * @return the sparkJobsV4Endpoint
   */
  public String getSparkJobsV4Endpoint() {
    return sparkJobsV4Endpoint;
  }

  /**
   * Gets the sparkKernelEndpoint.
   *
   * Spark kernel endpoint.
   *
   * @return the sparkKernelEndpoint
   */
  public String getSparkKernelEndpoint() {
    return sparkKernelEndpoint;
  }

  /**
   * Gets the viewHistoryServer.
   *
   * View history server.
   *
   * @return the viewHistoryServer
   */
  public String getViewHistoryServer() {
    return viewHistoryServer;
  }

  /**
   * Gets the wxdApplicationEndpoint.
   *
   * Wxd application endpoint.
   *
   * @return the wxdApplicationEndpoint
   */
  public String getWxdApplicationEndpoint() {
    return wxdApplicationEndpoint;
  }
}

