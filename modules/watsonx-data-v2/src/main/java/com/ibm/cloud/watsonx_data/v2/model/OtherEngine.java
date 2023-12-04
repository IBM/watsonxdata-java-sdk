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
 * external engine details.
 */
public class OtherEngine extends GenericModel {

  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected Long createdOn;
  protected String description;
  @SerializedName("engine_details")
  protected OtherEngineDetails engineDetails;
  @SerializedName("engine_display_name")
  protected String engineDisplayName;
  @SerializedName("engine_id")
  protected String engineId;
  protected String origin;
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  protected List<String> tags;
  protected String type;

  protected OtherEngine() { }

  /**
   * Gets the createdBy.
   *
   * created user name.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * Gets the createdOn.
   *
   * created time in epoch format.
   *
   * @return the createdOn
   */
  public Long getCreatedOn() {
    return createdOn;
  }

  /**
   * Gets the description.
   *
   * engine description.
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
  public OtherEngineDetails getEngineDetails() {
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
   * engine programmatic name.
   *
   * @return the engineId
   */
  public String getEngineId() {
    return engineId;
  }

  /**
   * Gets the origin.
   *
   * origin.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the status.
   *
   * engine status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusCode.
   *
   * engine status code.
   *
   * @return the statusCode
   */
  public Long getStatusCode() {
    return statusCode;
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
   * Type like presto, netezza, external,..
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

