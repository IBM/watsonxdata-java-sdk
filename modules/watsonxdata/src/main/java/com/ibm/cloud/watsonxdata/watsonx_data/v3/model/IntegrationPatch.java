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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Request body of the PATCH Request for modifying an integration in watsonx.Data.
 */
public class IntegrationPatch extends GenericModel {

  /**
   * current state.
   */
  public interface State {
    /** active. */
    String ACTIVE = "active";
    /** inactive. */
    String INACTIVE = "inactive";
    /** failed. */
    String FAILED = "failed";
  }

  @SerializedName("access_token")
  protected String accessToken;
  protected String apikey;
  protected Catalogs catalogs;
  protected String certificate;
  @SerializedName("certificate_extension")
  protected String certificateExtension;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("cross_account_integration")
  protected Boolean crossAccountIntegration;
  @SerializedName("enable_data_policy_within_wxd")
  protected Boolean enableDataPolicyWithinWxd;
  @SerializedName("ikc_user_account_id")
  protected String ikcUserAccountId;
  protected String password;
  @SerializedName("policy_cache_time_configuration")
  protected String policyCacheTimeConfiguration;
  protected String resource;
  protected Boolean ssl;
  protected String state;
  protected String url;
  protected String username;

  /**
   * Builder.
   */
  public static class Builder {
    private String accessToken;
    private String apikey;
    private Catalogs catalogs;
    private String certificate;
    private String certificateExtension;
    private String connectionMode;
    private Boolean crossAccountIntegration;
    private Boolean enableDataPolicyWithinWxd;
    private String ikcUserAccountId;
    private String password;
    private String policyCacheTimeConfiguration;
    private String resource;
    private Boolean ssl;
    private String state;
    private String url;
    private String username;

    /**
     * Instantiates a new Builder from an existing IntegrationPatch instance.
     *
     * @param integrationPatch the instance to initialize the Builder with
     */
    private Builder(IntegrationPatch integrationPatch) {
      this.accessToken = integrationPatch.accessToken;
      this.apikey = integrationPatch.apikey;
      this.catalogs = integrationPatch.catalogs;
      this.certificate = integrationPatch.certificate;
      this.certificateExtension = integrationPatch.certificateExtension;
      this.connectionMode = integrationPatch.connectionMode;
      this.crossAccountIntegration = integrationPatch.crossAccountIntegration;
      this.enableDataPolicyWithinWxd = integrationPatch.enableDataPolicyWithinWxd;
      this.ikcUserAccountId = integrationPatch.ikcUserAccountId;
      this.password = integrationPatch.password;
      this.policyCacheTimeConfiguration = integrationPatch.policyCacheTimeConfiguration;
      this.resource = integrationPatch.resource;
      this.ssl = integrationPatch.ssl;
      this.state = integrationPatch.state;
      this.url = integrationPatch.url;
      this.username = integrationPatch.username;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IntegrationPatch.
     *
     * @return the new IntegrationPatch instance
     */
    public IntegrationPatch build() {
      return new IntegrationPatch(this);
    }

    /**
     * Set the accessToken.
     *
     * @param accessToken the accessToken
     * @return the IntegrationPatch builder
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the IntegrationPatch builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the catalogs.
     *
     * @param catalogs the catalogs
     * @return the IntegrationPatch builder
     */
    public Builder catalogs(Catalogs catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the IntegrationPatch builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateExtension.
     *
     * @param certificateExtension the certificateExtension
     * @return the IntegrationPatch builder
     */
    public Builder certificateExtension(String certificateExtension) {
      this.certificateExtension = certificateExtension;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the IntegrationPatch builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the crossAccountIntegration.
     *
     * @param crossAccountIntegration the crossAccountIntegration
     * @return the IntegrationPatch builder
     */
    public Builder crossAccountIntegration(Boolean crossAccountIntegration) {
      this.crossAccountIntegration = crossAccountIntegration;
      return this;
    }

    /**
     * Set the enableDataPolicyWithinWxd.
     *
     * @param enableDataPolicyWithinWxd the enableDataPolicyWithinWxd
     * @return the IntegrationPatch builder
     */
    public Builder enableDataPolicyWithinWxd(Boolean enableDataPolicyWithinWxd) {
      this.enableDataPolicyWithinWxd = enableDataPolicyWithinWxd;
      return this;
    }

    /**
     * Set the ikcUserAccountId.
     *
     * @param ikcUserAccountId the ikcUserAccountId
     * @return the IntegrationPatch builder
     */
    public Builder ikcUserAccountId(String ikcUserAccountId) {
      this.ikcUserAccountId = ikcUserAccountId;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the IntegrationPatch builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the policyCacheTimeConfiguration.
     *
     * @param policyCacheTimeConfiguration the policyCacheTimeConfiguration
     * @return the IntegrationPatch builder
     */
    public Builder policyCacheTimeConfiguration(String policyCacheTimeConfiguration) {
      this.policyCacheTimeConfiguration = policyCacheTimeConfiguration;
      return this;
    }

    /**
     * Set the resource.
     *
     * @param resource the resource
     * @return the IntegrationPatch builder
     */
    public Builder resource(String resource) {
      this.resource = resource;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the IntegrationPatch builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the IntegrationPatch builder
     */
    public Builder state(String state) {
      this.state = state;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the IntegrationPatch builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the IntegrationPatch builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }
  }

  protected IntegrationPatch() { }

  protected IntegrationPatch(Builder builder) {
    accessToken = builder.accessToken;
    apikey = builder.apikey;
    catalogs = builder.catalogs;
    certificate = builder.certificate;
    certificateExtension = builder.certificateExtension;
    connectionMode = builder.connectionMode;
    crossAccountIntegration = builder.crossAccountIntegration;
    enableDataPolicyWithinWxd = builder.enableDataPolicyWithinWxd;
    ikcUserAccountId = builder.ikcUserAccountId;
    password = builder.password;
    policyCacheTimeConfiguration = builder.policyCacheTimeConfiguration;
    resource = builder.resource;
    ssl = builder.ssl;
    state = builder.state;
    url = builder.url;
    username = builder.username;
  }

  /**
   * New builder.
   *
   * @return a IntegrationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accessToken.
   *
   * Access Token for the integration of type `databand`.
   *
   * @return the accessToken
   */
  public String accessToken() {
    return accessToken;
  }

  /**
   * Gets the apikey.
   *
   * ApiKey for the integration of type `manta` and `ikc`.
   *
   * @return the apikey
   */
  public String apikey() {
    return apikey;
  }

  /**
   * Gets the catalogs.
   *
   * Details of catalogs associated with `ikc`.
   *
   * @return the catalogs
   */
  public Catalogs catalogs() {
    return catalogs;
  }

  /**
   * Gets the certificate.
   *
   * Certificate if ssl is enabled for integration type `ikc` (ikc hosted in Cloud Pack for Data) and `ranger`.
   *
   * @return the certificate
   */
  public String certificate() {
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
  public String certificateExtension() {
    return certificateExtension;
  }

  /**
   * Gets the connectionMode.
   *
   * Connection mode for manta.
   *
   * @return the connectionMode
   */
  public String connectionMode() {
    return connectionMode;
  }

  /**
   * Gets the crossAccountIntegration.
   *
   * To enable/disable cross account integration for `ikc` in IBM Cloud / MCSP.
   *
   * @return the crossAccountIntegration
   */
  public Boolean crossAccountIntegration() {
    return crossAccountIntegration;
  }

  /**
   * Gets the enableDataPolicyWithinWxd.
   *
   * To check if WatsonX.data policies are enabled along with `ranger`.
   *
   * @return the enableDataPolicyWithinWxd
   */
  public Boolean enableDataPolicyWithinWxd() {
    return enableDataPolicyWithinWxd;
  }

  /**
   * Gets the ikcUserAccountId.
   *
   * The Account ID where the `ikc` is existing with which cross account integration needs to be enabled, to be used
   * compulsorily with `cross_account_integration`.
   *
   * @return the ikcUserAccountId
   */
  public String ikcUserAccountId() {
    return ikcUserAccountId;
  }

  /**
   * Gets the password.
   *
   * Password for the integration of type `ranger`.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the policyCacheTimeConfiguration.
   *
   * Displays the policy cache type configuration for integration type `ranger`.
   *
   * @return the policyCacheTimeConfiguration
   */
  public String policyCacheTimeConfiguration() {
    return policyCacheTimeConfiguration;
  }

  /**
   * Gets the resource.
   *
   * Currently selected resource for `ranger`.
   *
   * @return the resource
   */
  public String resource() {
    return resource;
  }

  /**
   * Gets the ssl.
   *
   * SSL enabled/disabled for `ikc` (ikc hosted in Cloud Pack for Data) and `ranger`.
   *
   * @return the ssl
   */
  public Boolean ssl() {
    return ssl;
  }

  /**
   * Gets the state.
   *
   * current state.
   *
   * @return the state
   */
  public String state() {
    return state;
  }

  /**
   * Gets the url.
   *
   * URL of the integration to be integrated. Applicable for all the 4 types:  `ranger`, `ikc`, `databand` and `manta`.
   *
   * @return the url
   */
  public String url() {
    return url;
  }

  /**
   * Gets the username.
   *
   * Username of the `ikc`/`manta`/`ranger` integration to be integrated.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Construct a JSON merge-patch from the IntegrationPatch.
   *
   * Note that properties of the IntegrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the IntegrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

