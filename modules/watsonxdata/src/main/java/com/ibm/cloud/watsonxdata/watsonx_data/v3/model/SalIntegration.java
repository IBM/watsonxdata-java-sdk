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
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Basic Semantic Automation Layer(SAL) integration settings.
 */
public class SalIntegration extends GenericModel {

  @SerializedName("category_id")
  protected String categoryId;
  @SerializedName("created_at_epoch")
  protected String createdAtEpoch;
  @SerializedName("engine_id")
  protected String engineId;
  protected List<ErrorObj> errors;
  @SerializedName("instance_id")
  protected String instanceId;
  protected String status;
  @SerializedName("storage_resource_crn")
  protected String storageResourceCrn;
  @SerializedName("storage_type")
  protected String storageType;
  @SerializedName("trial_plan")
  protected Boolean trialPlan;
  protected String username;

  protected SalIntegration() { }

  /**
   * Gets the categoryId.
   *
   * IBM Knowledge Catalog(IKC) category UUID.
   *
   * @return the categoryId
   */
  public String getCategoryId() {
    return categoryId;
  }

  /**
   * Gets the createdAtEpoch.
   *
   * SAL integration creation timestamp.
   *
   * @return the createdAtEpoch
   */
  public String getCreatedAtEpoch() {
    return createdAtEpoch;
  }

  /**
   * Gets the engineId.
   *
   * registered engine id of the SAL integration.
   *
   * @return the engineId
   */
  public String getEngineId() {
    return engineId;
  }

  /**
   * Gets the errors.
   *
   * exceptions happens when creating integration with IKC on remote side.
   *
   * @return the errors
   */
  public List<ErrorObj> getErrors() {
    return errors;
  }

  /**
   * Gets the instanceId.
   *
   * SAL integration instance id.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * Gets the status.
   *
   * status of the SAL integration.
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
   * Gets the trialPlan.
   *
   * whether the integration is based on IKC trial plan, which is available on watsonx.data Saas only.
   *
   * @return the trialPlan
   */
  public Boolean isTrialPlan() {
    return trialPlan;
  }

  /**
   * Gets the username.
   *
   * ID of the user who enabled the SAL integration.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

