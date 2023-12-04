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
 * Deployment.
 */
public class Deployment extends GenericModel {

  @SerializedName("cloud_type")
  protected String cloudType;
  @SerializedName("enable_private_endpoints")
  protected Boolean enablePrivateEndpoints;
  @SerializedName("enable_public_endpoints")
  protected Boolean enablePublicEndpoints;
  @SerializedName("first_time_use")
  protected Boolean firstTimeUse;
  @SerializedName("formation_id")
  protected String formationId;
  protected String id;
  @SerializedName("plan_id")
  protected String planId;
  @SerializedName("platform_options")
  protected DeploymentPlatformOptions platformOptions;
  protected String region;
  @SerializedName("resource_group_crn")
  protected String resourceGroupCrn;
  protected String type;
  protected String version;

  protected Deployment() { }

  /**
   * Gets the cloudType.
   *
   * Cloud type.
   *
   * @return the cloudType
   */
  public String getCloudType() {
    return cloudType;
  }

  /**
   * Gets the enablePrivateEndpoints.
   *
   * Enable private endpoints.
   *
   * @return the enablePrivateEndpoints
   */
  public Boolean isEnablePrivateEndpoints() {
    return enablePrivateEndpoints;
  }

  /**
   * Gets the enablePublicEndpoints.
   *
   * Enable public endpoints.
   *
   * @return the enablePublicEndpoints
   */
  public Boolean isEnablePublicEndpoints() {
    return enablePublicEndpoints;
  }

  /**
   * Gets the firstTimeUse.
   *
   * Parameter for UI to validate if console is used for the first time.
   *
   * @return the firstTimeUse
   */
  public Boolean isFirstTimeUse() {
    return firstTimeUse;
  }

  /**
   * Gets the formationId.
   *
   * Formation id.
   *
   * @return the formationId
   */
  public String getFormationId() {
    return formationId;
  }

  /**
   * Gets the id.
   *
   * Id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the planId.
   *
   * Plan id.
   *
   * @return the planId
   */
  public String getPlanId() {
    return planId;
  }

  /**
   * Gets the platformOptions.
   *
   * Platform options.
   *
   * @return the platformOptions
   */
  public DeploymentPlatformOptions getPlatformOptions() {
    return platformOptions;
  }

  /**
   * Gets the region.
   *
   * Region.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the resourceGroupCrn.
   *
   * Resource group crn for the formation.
   *
   * @return the resourceGroupCrn
   */
  public String getResourceGroupCrn() {
    return resourceGroupCrn;
  }

  /**
   * Gets the type.
   *
   * Type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the version.
   *
   * Version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

