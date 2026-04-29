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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response body for the POST/GET/PATCH Request for an integration in watsonx.Data.
 */
public class Integration extends GenericModel {

  /**
   * Current state of the integration.
   */
  public interface State {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
  }

  @SerializedName("access_token")
  protected String accessToken;
  protected String apikey;
  @SerializedName("auth_url")
  protected String authUrl;
  protected Catalogs catalogs;
  protected String certificate;
  @SerializedName("certificate_extension")
  protected String certificateExtension;
  @SerializedName("config_properties")
  protected String configProperties;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("cross_account_integration")
  protected Boolean crossAccountIntegration;
  @SerializedName("enable_data_policy_within_wxd")
  protected Boolean enableDataPolicyWithinWxd;
  @SerializedName("governance_properties")
  protected String governanceProperties;
  protected String id;
  @SerializedName("ikc_user_account_id")
  protected String ikcUserAccountId;
  @SerializedName("manta_url")
  protected String mantaUrl;
  @SerializedName("modified_at")
  protected Long modifiedAt;
  @SerializedName("modified_by")
  protected String modifiedBy;
  protected String password;
  @SerializedName("policy_cache_time_configuration")
  protected String policyCacheTimeConfiguration;
  protected String resource;
  protected Boolean ssl;
  protected String state;
  protected String type;
  protected String url;
  protected String username;
  @SerializedName("zen_apikey")
  protected String zenApikey;

  protected Integration() { }

  /**
   * Gets the accessToken.
   *
   * Access Token for the integration of type `databand`. The value will be encrypted.
   *
   * @return the accessToken
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * Gets the apikey.
   *
   * ApiKey for the integration of type `manta` and `ikc`. The value will be encrypted.
   *
   * @return the apikey
   */
  public String getApikey() {
    return apikey;
  }

  /**
   * Gets the authUrl.
   *
   * Authentication url for the corresponding `manta` integration in saas (Internal use only).
   *
   * @return the authUrl
   */
  public String getAuthUrl() {
    return authUrl;
  }

  /**
   * Gets the catalogs.
   *
   * Details of catalogs associated with `ikc`.
   *
   * @return the catalogs
   */
  public Catalogs getCatalogs() {
    return catalogs;
  }

  /**
   * Gets the certificate.
   *
   * Certificate if ssl is enabled for integration type `ikc` (ikc hosted in Cloud Pack for Data) and `ranger`.
   *
   * @return the certificate
   */
  public String getCertificate() {
    return certificate;
  }

  /**
   * Gets the certificateExtension.
   *
   * Certificate extension of the certificate provided if ssl is enabled for integration type `ikc` (ikc hosted in Cloud
   * Pack for Data) and `ranger`.
   *
   * @return the certificateExtension
   */
  public String getCertificateExtension() {
    return certificateExtension;
  }

  /**
   * Gets the configProperties.
   *
   * Properties for `ikc`.
   *
   * @return the configProperties
   */
  public String getConfigProperties() {
    return configProperties;
  }

  /**
   * Gets the connectionMode.
   *
   * Connection mode for manta.
   *
   * @return the connectionMode
   */
  public String getConnectionMode() {
    return connectionMode;
  }

  /**
   * Gets the crossAccountIntegration.
   *
   * To enable/disable cross account integration for `ikc` in IBM Cloud / MCSP.
   *
   * @return the crossAccountIntegration
   */
  public Boolean isCrossAccountIntegration() {
    return crossAccountIntegration;
  }

  /**
   * Gets the enableDataPolicyWithinWxd.
   *
   * To check if WatsonX.data policies are enabled along with `ranger`.
   *
   * @return the enableDataPolicyWithinWxd
   */
  public Boolean isEnableDataPolicyWithinWxd() {
    return enableDataPolicyWithinWxd;
  }

  /**
   * Gets the governanceProperties.
   *
   * Properties for `ikc`.
   *
   * @return the governanceProperties
   */
  public String getGovernanceProperties() {
    return governanceProperties;
  }

  /**
   * Gets the id.
   *
   * Unique id to identify the integration.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the ikcUserAccountId.
   *
   * The Account ID where the `ikc` is existing with which cross account integration needs to be enabled, to be used
   * compulsorily with `cross_account_integration`.
   *
   * @return the ikcUserAccountId
   */
  public String getIkcUserAccountId() {
    return ikcUserAccountId;
  }

  /**
   * Gets the mantaUrl.
   *
   * Manta specific Url derived from the url provided for `manta` integration in Saas.
   *
   * @return the mantaUrl
   */
  public String getMantaUrl() {
    return mantaUrl;
  }

  /**
   * Gets the modifiedAt.
   *
   * Last Modified time for the corresponding integration in epoch format.
   *
   * @return the modifiedAt
   */
  public Long getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Gets the modifiedBy.
   *
   * Last Modified user name for the corresponding integration.
   *
   * @return the modifiedBy
   */
  public String getModifiedBy() {
    return modifiedBy;
  }

  /**
   * Gets the password.
   *
   * Password for the integration of type `ranger`. The value will be encrypted.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the policyCacheTimeConfiguration.
   *
   * Displays the policy cache type configuration for integration type `ranger`.
   *
   * @return the policyCacheTimeConfiguration
   */
  public String getPolicyCacheTimeConfiguration() {
    return policyCacheTimeConfiguration;
  }

  /**
   * Gets the resource.
   *
   * Currently selected resource for `ranger`.
   *
   * @return the resource
   */
  public String getResource() {
    return resource;
  }

  /**
   * Gets the ssl.
   *
   * SSL enabled/disabled for `ikc` (ikc hosted in Cloud Pack for Data) and `ranger`.
   *
   * @return the ssl
   */
  public Boolean isSsl() {
    return ssl;
  }

  /**
   * Gets the state.
   *
   * Current state of the integration.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the type.
   *
   * Type of the integration integrated. It  will only have the following values: `ranger`, `ikc`, `databand` and
   * `manta`.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the url.
   *
   * URL of the integration. Applicable for all the 4 types:  `ranger`, `ikc`, `databand` and `manta`.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the username.
   *
   * Username of the `ikc`/`manta`/`ranger` integration.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the zenApikey.
   *
   * Zen API key for the integration of type `manta` (Internal use only).
   *
   * @return the zenApikey
   */
  public String getZenApikey() {
    return zenApikey;
  }
}

