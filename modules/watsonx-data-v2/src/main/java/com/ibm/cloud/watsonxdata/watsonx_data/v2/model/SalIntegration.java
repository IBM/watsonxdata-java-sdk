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
 * Sal Integration object.
 */
public class SalIntegration extends GenericModel {

  @SerializedName("category_id")
  protected String categoryId;
  @SerializedName("engine_id")
  protected String engineId;
  protected List<ErrorObj> errors;
  @SerializedName("governance_scope_id")
  protected String governanceScopeId;
  @SerializedName("governance_scope_type")
  protected String governanceScopeType;
  @SerializedName("instance_id")
  protected String instanceId;
  protected String status;
  @SerializedName("storage_resource_crn")
  protected String storageResourceCrn;
  @SerializedName("storage_type")
  protected String storageType;
  protected String timestamp;
  @SerializedName("trial_plan")
  protected Boolean trialPlan;
  protected String username;

  protected SalIntegration() { }

  /**
   * Gets the categoryId.
   *
   * category UUID.
   *
   * @return the categoryId
   */
  public String getCategoryId() {
    return categoryId;
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String getEngineId() {
    return engineId;
  }

  /**
   * Gets the errors.
   *
   * errors.
   *
   * @return the errors
   */
  public List<ErrorObj> getErrors() {
    return errors;
  }

  /**
   * Gets the governanceScopeId.
   *
   * governance scope UUID.
   *
   * @return the governanceScopeId
   */
  public String getGovernanceScopeId() {
    return governanceScopeId;
  }

  /**
   * Gets the governanceScopeType.
   *
   * governance scope type.
   *
   * @return the governanceScopeType
   */
  public String getGovernanceScopeType() {
    return governanceScopeType;
  }

  /**
   * Gets the instanceId.
   *
   * instance_id.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the status.
   *
   * status of the integration.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the storageResourceCrn.
   *
   * COS resource CRN.
   *
   * @return the storageResourceCrn
   */
  public String getStorageResourceCrn() {
    return storageResourceCrn;
  }

  /**
   * Gets the storageType.
   *
   * COS storage type.
   *
   * @return the storageType
   */
  public String getStorageType() {
    return storageType;
  }

  /**
   * Gets the timestamp.
   *
   * sal integration creation timestamp.
   *
   * @return the timestamp
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the trialPlan.
   *
   * whether the integration is trial plan.
   *
   * @return the trialPlan
   */
  public Boolean isTrialPlan() {
    return trialPlan;
  }

  /**
   * Gets the username.
   *
   * user name.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

