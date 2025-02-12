/*
 * (C) Copyright IBM Corp. 2025.
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
 * Integration.
 */
public class Integration extends GenericModel {

  @SerializedName("access_token")
  protected String accessToken;
  protected String apikey;
  @SerializedName("auth_url")
  protected String authUrl;
  @SerializedName("config_properties")
  protected String configProperties;
  @SerializedName("cross_account_integration")
  protected Boolean crossAccountIntegration;
  @SerializedName("enable_data_policy_within_wxd")
  protected Boolean enableDataPolicyWithinWxd;
  @SerializedName("governance_properties")
  protected String governanceProperties;
  @SerializedName("ikc_user_account_id")
  protected String ikcUserAccountId;
  @SerializedName("integration_id")
  protected String integrationId;
  @SerializedName("manta_url")
  protected String mantaUrl;
  @SerializedName("modified_at")
  protected Long modifiedAt;
  @SerializedName("modified_by")
  protected String modifiedBy;
  protected String password;
  protected String resource;
  @SerializedName("service_type")
  protected String serviceType;
  protected String state;
  @SerializedName("storage_catalogs")
  protected List<String> storageCatalogs;
  protected String url;
  protected String username;

  protected Integration() { }

  /**
   * Gets the accessToken.
   *
   * Token for databand.
   *
   * @return the accessToken
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * Gets the apikey.
   *
   * Integration apikey for IKC and Manta.
   *
   * @return the apikey
   */
  public String getApikey() {
    return apikey;
  }

  /**
   * Gets the authUrl.
   *
   * Authentication url for manta, specific to saas.
   *
   * @return the authUrl
   */
  public String getAuthUrl() {
    return authUrl;
  }

  /**
   * Gets the configProperties.
   *
   * Properties.
   *
   * @return the configProperties
   */
  public String getConfigProperties() {
    return configProperties;
  }

  /**
   * Gets the crossAccountIntegration.
   *
   * Cross account integration enabler/disabler for ikc, specfic to saas.
   *
   * @return the crossAccountIntegration
   */
  public Boolean isCrossAccountIntegration() {
    return crossAccountIntegration;
  }

  /**
   * Gets the enableDataPolicyWithinWxd.
   *
   * Data policy enabler with wxd for ranger.
   *
   * @return the enableDataPolicyWithinWxd
   */
  public Boolean isEnableDataPolicyWithinWxd() {
    return enableDataPolicyWithinWxd;
  }

  /**
   * Gets the governanceProperties.
   *
   * Properties of ikc.
   *
   * @return the governanceProperties
   */
  public String getGovernanceProperties() {
    return governanceProperties;
  }

  /**
   * Gets the ikcUserAccountId.
   *
   * Account id of the cross account user for ikc, specfic to Saas.
   *
   * @return the ikcUserAccountId
   */
  public String getIkcUserAccountId() {
    return ikcUserAccountId;
  }

  /**
   * Gets the integrationId.
   *
   * resouce for ranger.
   *
   * @return the integrationId
   */
  public String getIntegrationId() {
    return integrationId;
  }

  /**
   * Gets the mantaUrl.
   *
   * For manta, specific to saas.
   *
   * @return the mantaUrl
   */
  public String getMantaUrl() {
    return mantaUrl;
  }

  /**
   * Gets the modifiedAt.
   *
   * modified time in epoch format.
   *
   * @return the modifiedAt
   */
  public Long getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Gets the modifiedBy.
   *
   * modified user name.
   *
   * @return the modifiedBy
   */
  public String getModifiedBy() {
    return modifiedBy;
  }

  /**
   * Gets the password.
   *
   * Ranger password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the resource.
   *
   * Resouce for ranger.
   *
   * @return the resource
   */
  public String getResource() {
    return resource;
  }

  /**
   * Gets the serviceType.
   *
   * Integration type.
   *
   * @return the serviceType
   */
  public String getServiceType() {
    return serviceType;
  }

  /**
   * Gets the state.
   *
   * Current status of the integration.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the storageCatalogs.
   *
   * Comma separated list of storage catalogs for which ikc needs to be enabled.
   *
   * @return the storageCatalogs
   */
  public List<String> getStorageCatalogs() {
    return storageCatalogs;
  }

  /**
   * Gets the url.
   *
   * Integration Connection URL for IKC, Ranger, Databand and Manta.
   *
   * @return the url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Gets the username.
   *
   * Username for Ranger.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }
}

