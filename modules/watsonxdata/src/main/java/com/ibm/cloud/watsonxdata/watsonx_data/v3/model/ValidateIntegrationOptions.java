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
 * The validateIntegration options.
 */
public class ValidateIntegrationOptions extends GenericModel {

  protected String type;
  protected String accessToken;
  protected String apikey;
  protected Catalogs catalogs;
  protected String certificate;
  protected String password;
  protected Boolean ssl;
  protected String url;
  protected String username;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String accessToken;
    private String apikey;
    private Catalogs catalogs;
    private String certificate;
    private String password;
    private Boolean ssl;
    private String url;
    private String username;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ValidateIntegrationOptions instance.
     *
     * @param validateIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(ValidateIntegrationOptions validateIntegrationOptions) {
      this.type = validateIntegrationOptions.type;
      this.accessToken = validateIntegrationOptions.accessToken;
      this.apikey = validateIntegrationOptions.apikey;
      this.catalogs = validateIntegrationOptions.catalogs;
      this.certificate = validateIntegrationOptions.certificate;
      this.password = validateIntegrationOptions.password;
      this.ssl = validateIntegrationOptions.ssl;
      this.url = validateIntegrationOptions.url;
      this.username = validateIntegrationOptions.username;
      this.authInstanceId = validateIntegrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a ValidateIntegrationOptions.
     *
     * @return the new ValidateIntegrationOptions instance
     */
    public ValidateIntegrationOptions build() {
      return new ValidateIntegrationOptions(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ValidateIntegrationOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the accessToken.
     *
     * @param accessToken the accessToken
     * @return the ValidateIntegrationOptions builder
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the ValidateIntegrationOptions builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the catalogs.
     *
     * @param catalogs the catalogs
     * @return the ValidateIntegrationOptions builder
     */
    public Builder catalogs(Catalogs catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the ValidateIntegrationOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the ValidateIntegrationOptions builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the ValidateIntegrationOptions builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the ValidateIntegrationOptions builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the ValidateIntegrationOptions builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ValidateIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ValidateIntegrationOptions() { }

  protected ValidateIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
    accessToken = builder.accessToken;
    apikey = builder.apikey;
    catalogs = builder.catalogs;
    certificate = builder.certificate;
    password = builder.password;
    ssl = builder.ssl;
    url = builder.url;
    username = builder.username;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ValidateIntegrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Certificate to be provided if ssl is enabled for integration type `ikc` in Cloud Pack for Data.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
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
   * Gets the ssl.
   *
   * SSL enabler/disabler for `ikc` in Cloud Pack for Data.
   *
   * @return the ssl
   */
  public Boolean ssl() {
    return ssl;
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

