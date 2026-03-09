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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark Query Server details.
 */
public class SparkEngineQueryServerDetails extends GenericModel {

  @SerializedName("creation_time")
  protected String creationTime;
  @SerializedName("failed_time")
  protected String failedTime;
  @SerializedName("finish_time")
  protected String finishTime;
  protected String id;
  @SerializedName("query_server_details")
  protected SparkEngineQueryServerDetail queryServerDetails;
  protected SparkApplicationRuntime runtime;
  @SerializedName("server_endpoint")
  protected String serverEndpoint;
  @SerializedName("start_time")
  protected String startTime;
  protected String state;

  protected SparkEngineQueryServerDetails() { }

  /**
   * Gets the creationTime.
   *
   * Query Server creation time.
   *
   * @return the creationTime
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Gets the failedTime.
   *
   * Query Server failed time.
   *
   * @return the failedTime
   */
  public String getFailedTime() {
    return failedTime;
  }

  /**
   * Gets the finishTime.
   *
   * Query Server finish time.
   *
   * @return the finishTime
   */
  public String getFinishTime() {
    return finishTime;
  }

  /**
   * Gets the id.
   *
   * ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the queryServerDetails.
   *
   * Spark Query Server detail.
   *
   * @return the queryServerDetails
   */
  public SparkEngineQueryServerDetail getQueryServerDetails() {
    return queryServerDetails;
  }

  /**
   * Gets the runtime.
   *
   * Application runtime configuration.
   *
   * @return the runtime
   */
  public SparkApplicationRuntime getRuntime() {
    return runtime;
  }

  /**
   * Gets the serverEndpoint.
   *
   * Query Server endpoint.
   *
   * @return the serverEndpoint
   */
  public String getServerEndpoint() {
    return serverEndpoint;
  }

  /**
   * Gets the startTime.
   *
   * Query Server start time.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the state.
   *
   * Query Server state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }
}

