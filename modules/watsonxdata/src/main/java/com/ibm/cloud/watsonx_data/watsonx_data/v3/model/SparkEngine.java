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
 * Information on the Spark engine.
 *
 * This type supports additional properties of type Object.
 */
public class SparkEngine extends DynamicModel<Object> {

  /**
   * Origin - created or registered.
   */
  public interface Origin {
    /** external. */
    String EXTERNAL = "external";
    /** discover. */
    String DISCOVER = "discover";
    /** native. */
    String X_NATIVE = "native";
  }

  @SerializedName("actions")
  protected List<String> actions;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;
  @SerializedName("build_version")
  protected String buildVersion;
  @SerializedName("configuration")
  protected SparkEngineDetails configuration;
  @SerializedName("created_at")
  protected Long createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  @SerializedName("description")
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("id")
  protected String id;
  @SerializedName("is_capacity_supported")
  protected Boolean isCapacitySupported;
  @SerializedName("mode")
  protected String mode;
  @SerializedName("origin")
  protected String origin;
  @SerializedName("status")
  protected String status;
  @SerializedName("tags")
  protected List<String> tags;
  @SerializedName("type")
  protected String type;

  public SparkEngine() {
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
   * List of catalogs associated with the the engine.
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
   * Spark engine configuration details.
   *
   * @return the configuration
   */
  public SparkEngineDetails getConfiguration() {
    return this.configuration;
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
   * Information on the Spark engine.
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
   * Gets the id.
   *
   * Unique identifier to distinguish spark engines.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the isCapacitySupported.
   *
   * Boolean value to indicate whether the spark is new arch or not.
   *
   * @return the isCapacitySupported
   */
  public Boolean isIsCapacitySupported() {
    return this.isCapacitySupported;
  }

  /**
   * Gets the mode.
   *
   * Mode of spark engine.
   *
   * @return the mode
   */
  public String getMode() {
    return this.mode;
  }

  /**
   * Gets the origin.
   *
   * Origin - created or registered.
   *
   * @return the origin
   */
  public String getOrigin() {
    return this.origin;
  }

  /**
   * Gets the status.
   *
   * Status of the engine.
   *
   * @return the status
   */
  public String getStatus() {
    return this.status;
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
   * Type of spark engine.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }
}
