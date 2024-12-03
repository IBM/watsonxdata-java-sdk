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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details about the job.
 */
public class SalIntegrationEnrichmentJobsResultItemEntityJob extends GenericModel {

  @SerializedName("asset_ref")
  protected String assetRef;
  @SerializedName("asset_ref_type")
  protected String assetRefType;
  protected SalIntegrationEnrichmentJobsResultItemEntityJobConfiguration configuration;
  @SerializedName("enable_notifications")
  protected Boolean enableNotifications;
  @SerializedName("future_scheduled_runs")
  protected List<String> futureScheduledRuns;
  @SerializedName("last_run_initiator")
  protected String lastRunInitiator;
  @SerializedName("last_run_status")
  protected String lastRunStatus;
  @SerializedName("last_run_status_timestamp")
  protected Long lastRunStatusTimestamp;
  @SerializedName("last_run_time")
  protected String lastRunTime;
  @SerializedName("project_name")
  protected String projectName;
  @SerializedName("schedule_creator_id")
  protected String scheduleCreatorId;
  @SerializedName("schedule_id")
  protected String scheduleId;
  @SerializedName("schedule_info")
  protected ScheduleInfo scheduleInfo;
  @SerializedName("task_credentials_support")
  protected SalIntegrationEnrichmentJobsResultItemEntityTaskCredentialsSupport taskCredentialsSupport;

  protected SalIntegrationEnrichmentJobsResultItemEntityJob() { }

  /**
   * Gets the assetRef.
   *
   * Reference ID for the asset.
   *
   * @return the assetRef
   */
  public String getAssetRef() {
    return assetRef;
  }

  /**
   * Gets the assetRefType.
   *
   * Type of the asset reference.
   *
   * @return the assetRefType
   */
  public String getAssetRefType() {
    return assetRefType;
  }

  /**
   * Gets the configuration.
   *
   * Configuration settings for the job.
   *
   * @return the configuration
   */
  public SalIntegrationEnrichmentJobsResultItemEntityJobConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * Gets the enableNotifications.
   *
   * Flag indicating if notifications are enabled for the job.
   *
   * @return the enableNotifications
   */
  public Boolean isEnableNotifications() {
    return enableNotifications;
  }

  /**
   * Gets the futureScheduledRuns.
   *
   * List of future scheduled run times.
   *
   * @return the futureScheduledRuns
   */
  public List<String> getFutureScheduledRuns() {
    return futureScheduledRuns;
  }

  /**
   * Gets the lastRunInitiator.
   *
   * Initiator of the last run.
   *
   * @return the lastRunInitiator
   */
  public String getLastRunInitiator() {
    return lastRunInitiator;
  }

  /**
   * Gets the lastRunStatus.
   *
   * Status of the last run.
   *
   * @return the lastRunStatus
   */
  public String getLastRunStatus() {
    return lastRunStatus;
  }

  /**
   * Gets the lastRunStatusTimestamp.
   *
   * Timestamp of the last run status.
   *
   * @return the lastRunStatusTimestamp
   */
  public Long getLastRunStatusTimestamp() {
    return lastRunStatusTimestamp;
  }

  /**
   * Gets the lastRunTime.
   *
   * Time of the last run.
   *
   * @return the lastRunTime
   */
  public String getLastRunTime() {
    return lastRunTime;
  }

  /**
   * Gets the projectName.
   *
   * Name of the project associated with the job.
   *
   * @return the projectName
   */
  public String getProjectName() {
    return projectName;
  }

  /**
   * Gets the scheduleCreatorId.
   *
   * ID of the creator of the schedule.
   *
   * @return the scheduleCreatorId
   */
  public String getScheduleCreatorId() {
    return scheduleCreatorId;
  }

  /**
   * Gets the scheduleId.
   *
   * ID of the schedule.
   *
   * @return the scheduleId
   */
  public String getScheduleId() {
    return scheduleId;
  }

  /**
   * Gets the scheduleInfo.
   *
   * Information about the schedule.
   *
   * @return the scheduleInfo
   */
  public ScheduleInfo getScheduleInfo() {
    return scheduleInfo;
  }

  /**
   * Gets the taskCredentialsSupport.
   *
   * Credentials support information for the task.
   *
   * @return the taskCredentialsSupport
   */
  public SalIntegrationEnrichmentJobsResultItemEntityTaskCredentialsSupport getTaskCredentialsSupport() {
    return taskCredentialsSupport;
  }
}

