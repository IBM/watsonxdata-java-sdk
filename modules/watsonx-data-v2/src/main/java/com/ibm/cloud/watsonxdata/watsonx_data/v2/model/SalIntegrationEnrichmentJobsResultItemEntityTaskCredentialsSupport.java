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
 * Credentials support information for the task.
 */
public class SalIntegrationEnrichmentJobsResultItemEntityTaskCredentialsSupport extends GenericModel {

  @SerializedName("account_id")
  protected String accountId;
  @SerializedName("task_credentials_enabled")
  protected Boolean taskCredentialsEnabled;
  @SerializedName("user_id")
  protected String userId;

  protected SalIntegrationEnrichmentJobsResultItemEntityTaskCredentialsSupport() { }

  /**
   * Gets the accountId.
   *
   * The account ID associated with the task.
   *
   * @return the accountId
   */
  public String getAccountId() {
    return accountId;
  }

  /**
   * Gets the taskCredentialsEnabled.
   *
   * Indicates if task credentials are enabled.
   *
   * @return the taskCredentialsEnabled
   */
  public Boolean isTaskCredentialsEnabled() {
    return taskCredentialsEnabled;
  }

  /**
   * Gets the userId.
   *
   * The user ID associated with the task.
   *
   * @return the userId
   */
  public String getUserId() {
    return userId;
  }
}

