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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EngineDetail.
 */
public class SparkEngine extends GenericModel {

  protected List<String> actions;
  @SerializedName("build_version")
  protected String buildVersion;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected Long createdOn;
  protected String description;
  @SerializedName("engine_details")
  protected SparkEngineDetails engineDetails;
  @SerializedName("engine_display_name")
  protected String engineDisplayName;
  @SerializedName("engine_id")
  protected String engineId;
  protected String origin;
  protected String status;
  protected List<String> tags;
  protected String type;

  protected SparkEngine() { }

  /**
   * Gets the actions.
   *
   * Actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }

  /**
   * Gets the buildVersion.
   *
   * watsonx.data build version.
   *
   * @return the buildVersion
   */
  public String getBuildVersion() {
    return buildVersion;
  }

  /**
   * Gets the createdBy.
   *
   * Created user name.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdOn.
   *
   * Created time in epoch format.
   *
   * @return the createdOn
   */
  public Long getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the description.
   *
   * Engine description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the engineDetails.
   *
   * External engine details.
   *
   * @return the engineDetails
   */
  public SparkEngineDetails getEngineDetails() {
    return engineDetails;
  }

  /**
   * Gets the engineDisplayName.
   *
   * Engine display name.
   *
   * @return the engineDisplayName
   */
  public String getEngineDisplayName() {
    return engineDisplayName;
  }

  /**
   * Gets the engineId.
   *
   * Engine programmatic name.
   *
   * @return the engineId
   */
  public String getEngineId() {
    return engineId;
  }

  /**
   * Gets the origin.
   *
   * Origin - place holder.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the status.
   *
   * Engine status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the type.
   *
   * Type like spark, netezza,..
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

