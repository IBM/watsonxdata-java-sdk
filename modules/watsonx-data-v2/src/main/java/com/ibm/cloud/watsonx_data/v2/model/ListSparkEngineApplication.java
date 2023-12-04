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
 * Engine Application Detail.
 */
public class ListSparkEngineApplication extends GenericModel {

  @SerializedName("application_id")
  protected String applicationId;
  @SerializedName("auto_termination_time")
  protected String autoTerminationTime;
  @SerializedName("creation_time")
  protected String creationTime;
  @SerializedName("end_time")
  protected String endTime;
  @SerializedName("failed_time")
  protected String failedTime;
  @SerializedName("finish_time")
  protected String finishTime;
  protected String id;
  protected ListSparkEngineApplicationRuntime runtime;
  @SerializedName("spark_application_id")
  protected String sparkApplicationId;
  @SerializedName("spark_application_name")
  protected String sparkApplicationName;
  @SerializedName("start_time")
  protected String startTime;
  protected String state;
  @SerializedName("submission_time")
  protected String submissionTime;
  @SerializedName("template_id")
  protected String templateId;

  protected ListSparkEngineApplication() { }

  /**
   * Gets the applicationId.
   *
   * Application ID.
   *
   * @return the applicationId
   */
  public String getApplicationId() {
    return applicationId;
  }

  /**
   * Gets the autoTerminationTime.
   *
   * Auto Termination Time.
   *
   * @return the autoTerminationTime
   */
  public String getAutoTerminationTime() {
    return autoTerminationTime;
  }

  /**
   * Gets the creationTime.
   *
   * Creation Time.
   *
   * @return the creationTime
   */
  public String getCreationTime() {
    return creationTime;
  }

  /**
   * Gets the endTime.
   *
   * End Time.
   *
   * @return the endTime
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Gets the failedTime.
   *
   * Failed Time.
   *
   * @return the failedTime
   */
  public String getFailedTime() {
    return failedTime;
  }

  /**
   * Gets the finishTime.
   *
   * Finish Time.
   *
   * @return the finishTime
   */
  public String getFinishTime() {
    return finishTime;
  }

  /**
   * Gets the id.
   *
   * Application ID.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the runtime.
   *
   * application run time.
   *
   * @return the runtime
   */
  public ListSparkEngineApplicationRuntime getRuntime() {
    return runtime;
  }

  /**
   * Gets the sparkApplicationId.
   *
   * Spark application ID.
   *
   * @return the sparkApplicationId
   */
  public String getSparkApplicationId() {
    return sparkApplicationId;
  }

  /**
   * Gets the sparkApplicationName.
   *
   * Spark application name.
   *
   * @return the sparkApplicationName
   */
  public String getSparkApplicationName() {
    return sparkApplicationName;
  }

  /**
   * Gets the startTime.
   *
   * Start Time.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the state.
   *
   * Application State.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the submissionTime.
   *
   * Application submission time.
   *
   * @return the submissionTime
   */
  public String getSubmissionTime() {
    return submissionTime;
  }

  /**
   * Gets the templateId.
   *
   * Submission Time.
   *
   * @return the templateId
   */
  public String getTemplateId() {
    return templateId;
  }
}

