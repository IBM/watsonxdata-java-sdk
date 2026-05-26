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
 * Information on the Spark engine.
 */
public class SparkEngine extends GenericModel {

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

  /**
   * Type of spark engine.
   */
  public interface Type {
    /** spark. */
    String SPARK = "spark";
    /** gluten. */
    String GLUTEN = "gluten";
  }

  protected List<String> actions;
  @SerializedName("associated_catalogs")
  protected List<String> associatedCatalogs;
  @SerializedName("build_version")
  protected String buildVersion;
  protected SparkEngineDetails configuration;
  @SerializedName("created_at")
  protected Long createdAt;
  @SerializedName("created_by")
  protected String createdBy;
  protected String description;
  @SerializedName("display_name")
  protected String displayName;
  protected String id;
  protected String mode;
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
   * Gets the associatedCatalogs.
   *
   * Catalogs to be Associated to the engine.
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
   * Spark engine configuration details.
   *
   * @return the configuration
   */
  public SparkEngineDetails getConfiguration() {
    return configuration;
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
   * Information on the Spark engine.
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
   * Gets the id.
   *
   * Engine id.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the mode.
   *
   * Mode of spark engine.
   *
   * @return the mode
   */
  public String getMode() {
    return mode;
  }

  /**
   * Gets the origin.
   *
   * Origin - created or registered.
   *
   * @return the origin
   */
  public String getOrigin() {
    return origin;
  }

  /**
   * Gets the status.
   *
   * Status of engine.
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
   * Type of spark engine.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

