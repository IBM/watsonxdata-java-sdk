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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * external engine details.
 */
public class OtherEngine extends GenericModel {

  protected List<String> actions;
  protected OtherEngineConfiguration configuration;
  @SerializedName("created_at")
  protected Long createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("host_name")
  protected String hostName;
  protected String id;
  protected String origin;
  protected Long port;
  protected String status;
  protected List<String> tags;
  protected String type;

  protected OtherEngine() { }

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
   * Gets the configuration.
   *
   * External engine details.
   *
   * @return the configuration
   */
  public OtherEngineConfiguration getConfiguration() {
    return configuration;
  }

  /**
   * Gets the createdAt.
   *
   * created time in epoch format.
   *
   * @return the createdAt
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Username of the user who created the watsonx.data instance.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return createdBy;
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
   * Gets the displayName.
   *
   * Engine display name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the hostName.
   *
   * Engine host name. In case of OCP based clusters, this is internal hostname.
   *
   * @return the hostName
   */
  public String getHostName() {
    return hostName;
  }

  /**
   * Gets the id.
   *
   * engine programmatic name.
   *
   * @return the id
   */
  public String getId() {
    return id;
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
   * Gets the port.
   *
   * Engine port.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
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

