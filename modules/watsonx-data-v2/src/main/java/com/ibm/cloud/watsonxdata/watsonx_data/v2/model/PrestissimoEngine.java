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
 * EngineDetail.
 */
public class PrestissimoEngine extends GenericModel {

  /**
   * Triggers engine restart if value is force.
   */
  public interface EngineRestart {
    /** force. */
    String FORCE = "force";
    /** false. */
    String X_FALSE = "false";
  }

  /**
   * Origin - place holder.
   */
  public interface Origin {
    /** native. */
    String X_NATIVE = "native";
    /** external. */
    String EXTERNAL = "external";
    /** discover. */
    String DISCOVER = "discover";
  }

  /**
   * Engine status.
   */
  public interface Status {
    /** running. */
    String RUNNING = "running";
    /** pending. */
    String PENDING = "pending";
    /** stopped. */
    String STOPPED = "stopped";
  }

  protected List<String> actions;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;
  @SerializedName("build_version")
  protected String buildVersion;
  protected PrestissimoNodeDescriptionBody coordinator;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("created_on")
  protected Long createdOn;
  protected String description;
  @SerializedName("engine_details")
  protected PrestissimoEngineDetails engineDetails;
  @SerializedName("engine_display_name")
  protected String engineDisplayName;
  @SerializedName("engine_id")
  protected String engineId;
  @SerializedName("engine_properties")
  protected PrestissimoEngineEngineProperties engineProperties;
  @SerializedName("engine_restart")
  protected String engineRestart;
  @SerializedName("external_host_name")
  protected String externalHostName;
  @SerializedName("group_id")
  protected String groupId;
  @SerializedName("host_name")
  protected String hostName;
  protected String origin;
  protected Long port;
  protected String region;
  @SerializedName("remove_engine_properties")
  protected RemoveEngineProperties removeEngineProperties;
  @SerializedName("size_config")
  protected String sizeConfig;
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  protected List<String> tags;
  protected String type;
  protected String version;
  protected PrestissimoNodeDescriptionBody worker;

  protected PrestissimoEngine() { }

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
   * Gets the associatedCatalogs.
   *
   * Associated catalog.
   *
   * @return the associatedCatalogs
   */
  public List<String> getAssociatedCatalogs() {
    return associatedCatalogs;
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
   * Gets the coordinator.
   *
   * coordinator/worker property settings.
   *
   * @return the coordinator
   */
  public PrestissimoNodeDescriptionBody getCoordinator() {
    return coordinator;
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
  public PrestissimoEngineDetails getEngineDetails() {
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
   * Gets the engineProperties.
   *
   * Engine properties.
   *
   * @return the engineProperties
   */
  public PrestissimoEngineEngineProperties getEngineProperties() {
    return engineProperties;
  }

  /**
   * Gets the engineRestart.
   *
   * Triggers engine restart if value is force.
   *
   * @return the engineRestart
   */
  public String getEngineRestart() {
    return engineRestart;
  }

  /**
   * Gets the externalHostName.
   *
   * Applicable only for OCP based clusters.  This is typically  servicename+route.
   *
   * @return the externalHostName
   */
  public String getExternalHostName() {
    return externalHostName;
  }

  /**
   * Gets the groupId.
   *
   * Group ID.
   *
   * @return the groupId
   */
  public String getGroupId() {
    return groupId;
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
   * Gets the region.
   *
   * Region - place holder.
   *
   * @return the region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Gets the removeEngineProperties.
   *
   * RemoveEngine properties.
   *
   * @return the removeEngineProperties
   */
  public RemoveEngineProperties getRemoveEngineProperties() {
    return removeEngineProperties;
  }

  /**
   * Gets the sizeConfig.
   *
   * Size config.
   *
   * @return the sizeConfig
   */
  public String getSizeConfig() {
    return sizeConfig;
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
   * Gets the statusCode.
   *
   * Engine status code.
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
   * Engine type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the version.
   *
   * Version of the engine.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the worker.
   *
   * coordinator/worker property settings.
   *
   * @return the worker
   */
  public PrestissimoNodeDescriptionBody getWorker() {
    return worker;
  }
}

