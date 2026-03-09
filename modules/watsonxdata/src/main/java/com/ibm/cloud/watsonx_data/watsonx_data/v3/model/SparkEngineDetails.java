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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * Spark engine configuration details.
 *
 * This type supports additional properties of type Object.
 */
public class SparkEngineDetails extends DynamicModel<Object> {

  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("default_config")
  protected Map<String, String> defaultConfig;
  @SerializedName("default_version")
  protected String defaultVersion;
  @SerializedName("endpoints")
  protected SparkEndpoints endpoints;
  @SerializedName("engine_home")
  protected SparkEngineHome engineHome;
  @SerializedName("engine_sub_type")
  protected String engineSubType;
  @SerializedName("instance_id")
  protected String instanceId;
  @SerializedName("managed_by")
  protected String managedBy;
  @SerializedName("resource_limit_enabled")
  protected Boolean resourceLimitEnabled;
  @SerializedName("resource_limits")
  protected SparkEngineResourceLimit resourceLimits;
  @SerializedName("resource_utilisation")
  protected SparkEngineResourceUtilisation resourceUtilisation;
  @SerializedName("scale_config")
  protected SparkScaleConfig scaleConfig;
  @SerializedName("vscode_config")
  protected SparkVscodeConfig vscodeConfig;

  public SparkEngineDetails() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the apiKey.
   *
   * Api key to be used for connecting with external Analytics engine instance. Applicable only for external engine.
   *
   * @return the apiKey
   */
  public String getApiKey() {
    return this.apiKey;
  }

  /**
   * Gets the connectionString.
   *
   * External engine connection string. Applicable only for  external engine.
   *
   * @return the connectionString
   */
  public String getConnectionString() {
    return this.connectionString;
  }

  /**
   * Gets the defaultConfig.
   *
   * Default Spark configuration properties to be applied for all applications running on this Spark engine.
   *
   * @return the defaultConfig
   */
  public Map<String, String> getDefaultConfig() {
    return this.defaultConfig;
  }

  /**
   * Gets the defaultVersion.
   *
   * Default spark version for applications run on this Spark engine.
   *
   * @return the defaultVersion
   */
  public String getDefaultVersion() {
    return this.defaultVersion;
  }

  /**
   * Gets the endpoints.
   *
   * Spark engine endpoints.
   *
   * @return the endpoints
   */
  public SparkEndpoints getEndpoints() {
    return this.endpoints;
  }

  /**
   * Gets the engineHome.
   *
   * Engine home properties for Spark engine configuration.
   *
   * @return the engineHome
   */
  public SparkEngineHome getEngineHome() {
    return this.engineHome;
  }

  /**
   * Gets the engineSubType.
   *
   * spark engine sub type.
   *
   * @return the engineSubType
   */
  public String getEngineSubType() {
    return this.engineSubType;
  }

  /**
   * Gets the instanceId.
   *
   * Id of Analytics engine instance used as external engine.
   *
   * @return the instanceId
   */
  public String getInstanceId() {
    return this.instanceId;
  }

  /**
   * Gets the managedBy.
   *
   * How is the spark instance managed.
   *
   * @return the managedBy
   */
  public String getManagedBy() {
    return this.managedBy;
  }

  /**
   * Gets the resourceLimitEnabled.
   *
   * Resource limit enabled flag.
   *
   * @return the resourceLimitEnabled
   */
  public Boolean isResourceLimitEnabled() {
    return this.resourceLimitEnabled;
  }

  /**
   * Gets the resourceLimits.
   *
   * Native spark engine resource quota.
   *
   * @return the resourceLimits
   */
  public SparkEngineResourceLimit getResourceLimits() {
    return this.resourceLimits;
  }

  /**
   * Gets the resourceUtilisation.
   *
   * Native spark engine resource utilisation.
   *
   * @return the resourceUtilisation
   */
  public SparkEngineResourceUtilisation getResourceUtilisation() {
    return this.resourceUtilisation;
  }

  /**
   * Gets the scaleConfig.
   *
   * Spark instance scale configuration.
   *
   * @return the scaleConfig
   */
  public SparkScaleConfig getScaleConfig() {
    return this.scaleConfig;
  }

  /**
   * Gets the vscodeConfig.
   *
   * Spark vscode configuration.
   *
   * @return the vscodeConfig
   */
  public SparkVscodeConfig getVscodeConfig() {
    return this.vscodeConfig;
  }
}
