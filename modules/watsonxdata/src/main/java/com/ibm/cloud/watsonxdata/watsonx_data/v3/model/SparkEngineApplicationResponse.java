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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Engine Application Status.
 *
 * This type supports additional properties of type Object.
 */
public class SparkEngineApplicationResponse extends DynamicModel<Object> {

  @SerializedName("application_details")
  protected SparkApplicationDetails applicationDetails;
  @SerializedName("auto_termination_time")
  protected String autoTerminationTime;
  @SerializedName("creation_time")
  protected String creationTime;
  @SerializedName("deploy_mode")
  protected String deployMode;
  @SerializedName("end_time")
  protected String endTime;
  @SerializedName("failed_time")
  protected String failedTime;
  @SerializedName("finish_time")
  protected String finishTime;
  @SerializedName("id")
  protected String id;
  @SerializedName("init_scripts")
  protected List<String> initScripts;
  @SerializedName("max_retries")
  protected String maxRetries;
  @SerializedName("min_retry_interval_in_seconds")
  protected String minRetryIntervalInSeconds;
  @SerializedName("retry_attempt")
  protected String retryAttempt;
  @SerializedName("runtime")
  protected SparkApplicationRuntime runtime;
  @SerializedName("spark_application_id")
  protected String sparkApplicationId;
  @SerializedName("spark_application_name")
  protected String sparkApplicationName;
  @SerializedName("spark_ui")
  protected String sparkUi;
  @SerializedName("spark_version")
  protected String sparkVersion;
  @SerializedName("start_time")
  protected String startTime;
  @SerializedName("state")
  protected String state;
  @SerializedName("state_details")
  protected List<SparkApplicationStateDetail> stateDetails;
  @SerializedName("submission_time")
  protected String submissionTime;
  @SerializedName("template_id")
  protected String templateId;
  @SerializedName("wxd_application_ui_endpoint")
  protected String wxdApplicationUiEndpoint;

  public SparkEngineApplicationResponse() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the applicationDetails.
   *
   * Application details.
   *
   * @return the applicationDetails
   */
  public SparkApplicationDetails getApplicationDetails() {
    return this.applicationDetails;
  }

  /**
   * Gets the autoTerminationTime.
   *
   * Time when the application is automatically stopped. This property is available only in SAAS.
   *
   * @return the autoTerminationTime
   */
  public String getAutoTerminationTime() {
    return this.autoTerminationTime;
  }

  /**
   * Gets the creationTime.
   *
   * Time when the application request was accepted. Software only.
   *
   * @return the creationTime
   */
  public String getCreationTime() {
    return this.creationTime;
  }

  /**
   * Gets the deployMode.
   *
   * Deployment mode.
   *
   * @return the deployMode
   */
  public String getDeployMode() {
    return this.deployMode;
  }

  /**
   * Gets the endTime.
   *
   * End Time.
   *
   * @return the endTime
   */
  public String getEndTime() {
    return this.endTime;
  }

  /**
   * Gets the failedTime.
   *
   * Failed time.
   *
   * @return the failedTime
   */
  public String getFailedTime() {
    return this.failedTime;
  }

  /**
   * Gets the finishTime.
   *
   * Time when the application finished running or was stopped. This property is available only after the application
   * finishes running.
   *
   * @return the finishTime
   */
  public String getFinishTime() {
    return this.finishTime;
  }

  /**
   * Gets the id.
   *
   * Application ID.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the initScripts.
   *
   * Initialization scripts to run before the application starts.
   *
   * @return the initScripts
   */
  public List<String> getInitScripts() {
    return this.initScripts;
  }

  /**
   * Gets the maxRetries.
   *
   * Maximum number of retries for the application. Supported only in watsonx.data software.
   *
   * @return the maxRetries
   */
  public String getMaxRetries() {
    return this.maxRetries;
  }

  /**
   * Gets the minRetryIntervalInSeconds.
   *
   * Minimum retry interval in seconds between retry attempts. Supported only in watsonx.data software.
   *
   * @return the minRetryIntervalInSeconds
   */
  public String getMinRetryIntervalInSeconds() {
    return this.minRetryIntervalInSeconds;
  }

  /**
   * Gets the retryAttempt.
   *
   * Current retry attempt number.
   *
   * @return the retryAttempt
   */
  public String getRetryAttempt() {
    return this.retryAttempt;
  }

  /**
   * Gets the runtime.
   *
   * Application runtime configuration.
   *
   * @return the runtime
   */
  public SparkApplicationRuntime getRuntime() {
    return this.runtime;
  }

  /**
   * Gets the sparkApplicationId.
   *
   * Spark application ID.
   *
   * @return the sparkApplicationId
   */
  public String getSparkApplicationId() {
    return this.sparkApplicationId;
  }

  /**
   * Gets the sparkApplicationName.
   *
   * Spark application name.
   *
   * @return the sparkApplicationName
   */
  public String getSparkApplicationName() {
    return this.sparkApplicationName;
  }

  /**
   * Gets the sparkUi.
   *
   * Spark UI Endpoint.
   *
   * @return the sparkUi
   */
  public String getSparkUi() {
    return this.sparkUi;
  }

  /**
   * Gets the sparkVersion.
   *
   * Included if spark_version was specified in application creation request or a default value was set in spark engine
   * details.
   *
   * @return the sparkVersion
   */
  public String getSparkVersion() {
    return this.sparkVersion;
  }

  /**
   * Gets the startTime.
   *
   * Time when the application started running. This property is available only if/after the application starts running.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return this.startTime;
  }

  /**
   * Gets the state.
   *
   * Application state.
   *
   * @return the state
   */
  public String getState() {
    return this.state;
  }

  /**
   * Gets the stateDetails.
   *
   * Application state details.
   *
   * @return the stateDetails
   */
  public List<SparkApplicationStateDetail> getStateDetails() {
    return this.stateDetails;
  }

  /**
   * Gets the submissionTime.
   *
   * Time when the request was accepted. SAAS only.
   *
   * @return the submissionTime
   */
  public String getSubmissionTime() {
    return this.submissionTime;
  }

  /**
   * Gets the templateId.
   *
   * Image template id based on spark version. Software only.
   *
   * @return the templateId
   */
  public String getTemplateId() {
    return this.templateId;
  }

  /**
   * Gets the wxdApplicationUiEndpoint.
   *
   * Wxd history_server endpoint.
   *
   * @return the wxdApplicationUiEndpoint
   */
  public String getWxdApplicationUiEndpoint() {
    return this.wxdApplicationUiEndpoint;
  }
}
