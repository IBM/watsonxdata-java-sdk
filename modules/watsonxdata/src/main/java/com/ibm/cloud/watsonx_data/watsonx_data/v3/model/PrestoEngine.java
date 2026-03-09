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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Presto engine details.
 *
 * This type supports additional properties of type Object.
 */
public class PrestoEngine extends DynamicModel<Object> {

  /**
   * Origin.
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

  @SerializedName("actions")
  protected List<String> actions;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;
  @SerializedName("build_version")
  protected String buildVersion;
  @SerializedName("configuration")
  protected EngineDetails configuration;
  @SerializedName("coordinator")
  protected NodeDescription coordinator;
  @SerializedName("created_at")
  protected Long createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("description")
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("drivers")
  protected List<Driver> drivers;
  @SerializedName("engine_properties")
  protected EngineProperties engineProperties;
  @SerializedName("external_host_name")
  protected String externalHostName;
  @SerializedName("failure_message")
  protected String failureMessage;
  @SerializedName("group_id")
  protected String groupId;
  @SerializedName("host_name")
  protected String hostName;
  @SerializedName("id")
  protected String id;
  @SerializedName("is_qhmm_engine")
  protected Boolean isQhmmEngine;
  @SerializedName("new_arch")
  protected Boolean newArch;
  @SerializedName("origin")
  protected String origin;
  @SerializedName("port")
  protected Long port;
  @SerializedName("query_status")
  protected String queryStatus;
  @SerializedName("resource_groups")
  protected List<ResourceGroupForEngine> resourceGroups;
  @SerializedName("size_config")
  protected String sizeConfig;
  @SerializedName("status")
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("type")
  protected String type;
  @SerializedName("version")
  protected String version;
  @SerializedName("worker")
  protected NodeDescription worker;

  public PrestoEngine() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the actions.
   *
   * Actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return this.actions;
  }

  /**
   * Gets the associatedCatalogs.
   *
   * Catalogs associated to the presto engine.
   *
   * @return the associatedCatalogs
   */
  public List<String> getAssociatedCatalogs() {
    return this.associatedCatalogs;
  }

  /**
   * Gets the buildVersion.
   *
   * watsonx.data build version.
   *
   * @return the buildVersion
   */
  public String getBuildVersion() {
    return this.buildVersion;
  }

  /**
   * Gets the configuration.
   *
   * Engine configuration details.
   *
   * @return the configuration
   */
  public EngineDetails getConfiguration() {
    return this.configuration;
  }

  /**
   * Gets the coordinator.
   *
   * Presto engine configurations.
   *
   * @return the coordinator
   */
  public NodeDescription getCoordinator() {
    return this.coordinator;
  }

  /**
   * Gets the createdAt.
   *
   * Created time in epoch format.
   *
   * @return the createdAt
   */
  public Long getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Gets the createdBy.
   *
   * Username of the user who created the watsonx.data instance.
   *
   * @return the createdBy
   */
  public String getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the description.
   *
   * Engine description.
   *
   * @return the description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Gets the displayName.
   *
   * Engine display name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return this.displayName;
  }

  /**
   * Gets the drivers.
   *
   * Driver details.
   *
   * @return the drivers
   */
  public List<Driver> getDrivers() {
    return this.drivers;
  }

  /**
   * Gets the engineProperties.
   *
   * Engine properties.
   *
   * @return the engineProperties
   */
  public EngineProperties getEngineProperties() {
    return this.engineProperties;
  }

  /**
   * Gets the externalHostName.
   *
   * Applicable only for OCP based clusters.  This is typically  servicename+route.
   *
   * @return the externalHostName
   */
  public String getExternalHostName() {
    return this.externalHostName;
  }

  /**
   * Gets the failureMessage.
   *
   * Failure message.
   *
   * @return the failureMessage
   */
  public String getFailureMessage() {
    return this.failureMessage;
  }

  /**
   * Gets the groupId.
   *
   * Group ID.
   *
   * @return the groupId
   */
  public String getGroupId() {
    return this.groupId;
  }

  /**
   * Gets the hostName.
   *
   * Engine host name. In case of OCP based clusters, this is internal hostname.
   *
   * @return the hostName
   */
  public String getHostName() {
    return this.hostName;
  }

  /**
   * Gets the id.
   *
   * The unigue identifier for the engine.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the isQhmmEngine.
   *
   * Is QHMM engine.
   *
   * @return the isQhmmEngine
   */
  public Boolean isIsQhmmEngine() {
    return this.isQhmmEngine;
  }

  /**
   * Gets the newArch.
   *
   * bool value to indicate whether the engine is in newarch or not.
   *
   * @return the newArch
   */
  public Boolean isNewArch() {
    return this.newArch;
  }

  /**
   * Gets the origin.
   *
   * Origin.
   *
   * @return the origin
   */
  public String getOrigin() {
    return this.origin;
  }

  /**
   * Gets the port.
   *
   * Engine port.
   *
   * @return the port
   */
  public Long getPort() {
    return this.port;
  }

  /**
   * Gets the queryStatus.
   *
   * Query status.
   *
   * @return the queryStatus
   */
  public String getQueryStatus() {
    return this.queryStatus;
  }

  /**
   * Gets the resourceGroups.
   *
   * Resource group details.
   *
   * @return the resourceGroups
   */
  public List<ResourceGroupForEngine> getResourceGroups() {
    return this.resourceGroups;
  }

  /**
   * Gets the sizeConfig.
   *
   * CPD supported sizes are: custom, starter, small, medium, large, xlarge, and xxlarge. IBM cloud supported sizes are:
   * custom, starter, small, medium, large, cache_optimized, compute_optimized and lite.
   *
   * @return the sizeConfig
   */
  public String getSizeConfig() {
    return this.sizeConfig;
  }

  /**
   * Gets the status.
   *
   * Engine status.
   *
   * @return the status
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * Gets the statusCode.
   *
   * Engine status code.
   *
   * @return the statusCode
   */
  public Long getStatusCode() {
    return this.statusCode;
  }

  /**
   * Gets the tags.
   *
   * Tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return this.tags;
  }

  /**
   * Gets the type.
   *
   * Engine type presto.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Gets the version.
   *
   * Version of the engine.
   *
   * @return the version
   */
  public String getVersion() {
    return this.version;
  }

  /**
   * Gets the worker.
   *
   * Presto engine configurations.
   *
   * @return the worker
   */
  public NodeDescription getWorker() {
    return this.worker;
  }
}
