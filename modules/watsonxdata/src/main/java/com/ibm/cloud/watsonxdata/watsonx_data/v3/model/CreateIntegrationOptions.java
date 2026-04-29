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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createIntegration options.
 */
public class CreateIntegrationOptions extends GenericModel {

  protected String accessToken;
  protected String apikey;
  protected Catalogs catalogs;
  protected String certificate;
  protected String certificateExtension;
  protected String connectionMode;
  protected Boolean crossAccountIntegration;
  protected Boolean enableDataPolicyWithinWxd;
  protected String ikcUserAccountId;
  protected String password;
  protected String policyCacheTimeConfiguration;
  protected String resource;
  protected Boolean ssl;
  protected String type;
  protected String url;
  protected String username;
  protected String authInstanceId;

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
    private String type;
    private String url;
    private String username;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateIntegrationOptions instance.
     *
     * @param createIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateIntegrationOptions createIntegrationOptions) {
      this.accessToken = createIntegrationOptions.accessToken;
      this.apikey = createIntegrationOptions.apikey;
      this.catalogs = createIntegrationOptions.catalogs;
      this.certificate = createIntegrationOptions.certificate;
      this.certificateExtension = createIntegrationOptions.certificateExtension;
      this.connectionMode = createIntegrationOptions.connectionMode;
      this.crossAccountIntegration = createIntegrationOptions.crossAccountIntegration;
      this.enableDataPolicyWithinWxd = createIntegrationOptions.enableDataPolicyWithinWxd;
      this.ikcUserAccountId = createIntegrationOptions.ikcUserAccountId;
      this.password = createIntegrationOptions.password;
      this.policyCacheTimeConfiguration = createIntegrationOptions.policyCacheTimeConfiguration;
      this.resource = createIntegrationOptions.resource;
      this.ssl = createIntegrationOptions.ssl;
      this.type = createIntegrationOptions.type;
      this.url = createIntegrationOptions.url;
      this.username = createIntegrationOptions.username;
      this.authInstanceId = createIntegrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateIntegrationOptions.
     *
     * @return the new CreateIntegrationOptions instance
     */
    public CreateIntegrationOptions build() {
      return new CreateIntegrationOptions(this);
    }

    /**
     * Set the accessToken.
     *
     * @param accessToken the accessToken
     * @return the CreateIntegrationOptions builder
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the CreateIntegrationOptions builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the catalogs.
     *
     * @param catalogs the catalogs
     * @return the CreateIntegrationOptions builder
     */
    public Builder catalogs(Catalogs catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the CreateIntegrationOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateExtension.
     *
     * @param certificateExtension the certificateExtension
     * @return the CreateIntegrationOptions builder
     */
    public Builder certificateExtension(String certificateExtension) {
      this.certificateExtension = certificateExtension;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the CreateIntegrationOptions builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the crossAccountIntegration.
     *
     * @param crossAccountIntegration the crossAccountIntegration
     * @return the CreateIntegrationOptions builder
     */
    public Builder crossAccountIntegration(Boolean crossAccountIntegration) {
      this.crossAccountIntegration = crossAccountIntegration;
      return this;
    }

    /**
     * Set the enableDataPolicyWithinWxd.
     *
     * @param enableDataPolicyWithinWxd the enableDataPolicyWithinWxd
     * @return the CreateIntegrationOptions builder
     */
    public Builder enableDataPolicyWithinWxd(Boolean enableDataPolicyWithinWxd) {
      this.enableDataPolicyWithinWxd = enableDataPolicyWithinWxd;
      return this;
    }

    /**
     * Set the ikcUserAccountId.
     *
     * @param ikcUserAccountId the ikcUserAccountId
     * @return the CreateIntegrationOptions builder
     */
    public Builder ikcUserAccountId(String ikcUserAccountId) {
      this.ikcUserAccountId = ikcUserAccountId;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the CreateIntegrationOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the policyCacheTimeConfiguration.
     *
     * @param policyCacheTimeConfiguration the policyCacheTimeConfiguration
     * @return the CreateIntegrationOptions builder
     */
    public Builder policyCacheTimeConfiguration(String policyCacheTimeConfiguration) {
      this.policyCacheTimeConfiguration = policyCacheTimeConfiguration;
      return this;
    }

    /**
     * Set the resource.
     *
     * @param resource the resource
     * @return the CreateIntegrationOptions builder
     */
    public Builder resource(String resource) {
      this.resource = resource;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the CreateIntegrationOptions builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateIntegrationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the CreateIntegrationOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the CreateIntegrationOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateIntegrationOptions() { }

  protected CreateIntegrationOptions(Builder builder) {
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
    type = builder.type;
    url = builder.url;
    username = builder.username;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateIntegrationOptions builder
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
   * Gets the type.
   *
   * Type of the integration to be integrated. It can only have the following values: `ranger`, `ikc`, `databand` and
   * `manta`.
   *
   * @return the type
   */
  public String type() {
    return type;
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
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

