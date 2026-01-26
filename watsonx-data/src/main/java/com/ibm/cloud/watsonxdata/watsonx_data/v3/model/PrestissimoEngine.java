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
 * EngineDetail.
 */
public class PrestissimoEngine extends GenericModel {

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
   * CPD supported sizes are: custom, starter, small, medium, large, xlarge, and xxlarge. IBM cloud supported sizes are:
   * custom, starter, small, medium, large, cache_optimized, compute_optimized and lite.
   */
  public interface SizeConfig {
    /** starter. */
    String STARTER = "starter";
    /** cache_optimized. */
    String CACHE_OPTIMIZED = "cache_optimized";
    /** compute_optimized. */
    String COMPUTE_OPTIMIZED = "compute_optimized";
    /** small. */
    String SMALL = "small";
    /** medium. */
    String MEDIUM = "medium";
    /** large. */
    String LARGE = "large";
    /** custom. */
    String CUSTOM = "custom";
    /** lite. */
    String LITE = "lite";
    /** xlarge. */
    String XLARGE = "xlarge";
    /** xxlarge. */
    String XXLARGE = "xxlarge";
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
  @SerializedName("analyze_status")
  protected String analyzeStatus;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;
  @SerializedName("build_version")
  protected String buildVersion;
  protected PrestissimoEngineDetails configuration;
  protected PrestissimoCoordinatorNodeDetails coordinator;
  @SerializedName("created_at")
  protected Long createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("external_host_name")
  protected String externalHostName;
  @SerializedName("failure_message")
  protected String failureMessage;
  @SerializedName("group_id")
  protected String groupId;
  @SerializedName("host_name")
  protected String hostName;
  protected String id;
  @SerializedName("is_qhmm_engine")
  protected Boolean isQhmmEngine;
  @SerializedName("last_time_analyzed")
  protected String lastTimeAnalyzed;
  @SerializedName("optimizer_enabled")
  protected String optimizerEnabled;
  protected String origin;
  protected Long port;
  @SerializedName("properties")
  protected PrestissimoEngineProperties xProperties;
  @SerializedName("query_status")
  protected String queryStatus;
  protected String region;
  @SerializedName("size_config")
  protected String sizeConfig;
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  protected List<String> tags;
  protected String type;
  protected String version;
  protected PrestissimoWorkerNodeDetails worker;

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
   * Gets the analyzeStatus.
   *
   * status of optimizer sync.
   *
   * @return the analyzeStatus
   */
  public String getAnalyzeStatus() {
    return analyzeStatus;
  }

  /**
   * Gets the associatedCatalogs.
   *
   * List of catalogs associated with the the engine.
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
   * Gets the configuration.
   *
   * External engine details.
   *
   * @return the configuration
   */
  public PrestissimoEngineDetails getConfiguration() {
    return configuration;
  }

  /**
   * Gets the coordinator.
   *
   * Presto engine configurations.
   *
   * @return the coordinator
   */
  public PrestissimoCoordinatorNodeDetails getCoordinator() {
    return coordinator;
  }

  /**
   * Gets the createdAt.
   *
   * Created time in epoch format.
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
   * Engine description.
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
   * Gets the failureMessage.
   *
   * Failure message.
   *
   * @return the failureMessage
   */
  public String getFailureMessage() {
    return failureMessage;
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
   * Gets the id.
   *
   * Engine programmatic name.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the isQhmmEngine.
   *
   * Is QHMM engine.
   *
   * @return the isQhmmEngine
   */
  public Boolean isIsQhmmEngine() {
    return isQhmmEngine;
  }

  /**
   * Gets the lastTimeAnalyzed.
   *
   * last optimizer sync call.
   *
   * @return the lastTimeAnalyzed
   */
  public String getLastTimeAnalyzed() {
    return lastTimeAnalyzed;
  }

  /**
   * Gets the optimizerEnabled.
   *
   * optimizer enabled status.
   *
   * @return the optimizerEnabled
   */
  public String getOptimizerEnabled() {
    return optimizerEnabled;
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
   * Gets the xProperties.
   *
   * Engine properties.
   *
   * @return the xProperties
   */
  public PrestissimoEngineProperties getXProperties() {
    return xProperties;
  }

  /**
   * Gets the queryStatus.
   *
   * Query status.
   *
   * @return the queryStatus
   */
  public String getQueryStatus() {
    return queryStatus;
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
   * Gets the sizeConfig.
   *
   * CPD supported sizes are: custom, starter, small, medium, large, xlarge, and xxlarge. IBM cloud supported sizes are:
   * custom, starter, small, medium, large, cache_optimized, compute_optimized and lite.
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
   * Presto engine configurations.
   *
   * @return the worker
   */
  public PrestissimoWorkerNodeDetails getWorker() {
    return worker;
  }
}

