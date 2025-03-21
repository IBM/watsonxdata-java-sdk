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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * database details.
 */
public class DatabaseDetails extends GenericModel {

  @SerializedName("authentication_type")
  protected String authenticationType;
  @SerializedName("broker_authentication_password")
  protected String brokerAuthenticationPassword;
  @SerializedName("broker_authentication_type")
  protected String brokerAuthenticationType;
  @SerializedName("broker_authentication_user")
  protected String brokerAuthenticationUser;
  protected String certificate;
  @SerializedName("certificate_extension")
  protected String certificateExtension;
  @SerializedName("connection_method")
  protected String connectionMethod;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("connection_mode_value")
  protected String connectionModeValue;
  @SerializedName("connection_type")
  protected String connectionType;
  @SerializedName("controller_authentication_password")
  protected String controllerAuthenticationPassword;
  @SerializedName("controller_authentication_type")
  protected String controllerAuthenticationType;
  @SerializedName("controller_authentication_user")
  protected String controllerAuthenticationUser;
  @SerializedName("cpd_hostname")
  protected String cpdHostname;
  @SerializedName("credentials_key")
  protected String credentialsKey;
  @SerializedName("database_name")
  protected String databaseName;
  protected String hostname;
  @SerializedName("hostname_in_certificate")
  protected String hostnameInCertificate;
  protected String hosts;
  @SerializedName("informix_server")
  protected String informixServer;
  protected String password;
  protected Long port;
  @SerializedName("project_id")
  protected String projectId;
  protected Boolean sasl;
  @SerializedName("service_api_key")
  protected String serviceApiKey;
  @SerializedName("service_hostname")
  protected String serviceHostname;
  @SerializedName("service_password")
  protected String servicePassword;
  @SerializedName("service_port")
  protected Long servicePort;
  @SerializedName("service_ssl")
  protected Boolean serviceSsl;
  @SerializedName("service_token_url")
  protected String serviceTokenUrl;
  @SerializedName("service_username")
  protected String serviceUsername;
  protected Boolean ssl;
  protected String tables;
  protected String username;
  @SerializedName("validate_server_certificate")
  protected Boolean validateServerCertificate;
  @SerializedName("verify_host_name")
  protected Boolean verifyHostName;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationType;
    private String brokerAuthenticationPassword;
    private String brokerAuthenticationType;
    private String brokerAuthenticationUser;
    private String certificate;
    private String certificateExtension;
    private String connectionMethod;
    private String connectionMode;
    private String connectionModeValue;
    private String connectionType;
    private String controllerAuthenticationPassword;
    private String controllerAuthenticationType;
    private String controllerAuthenticationUser;
    private String cpdHostname;
    private String credentialsKey;
    private String databaseName;
    private String hostname;
    private String hostnameInCertificate;
    private String hosts;
    private String informixServer;
    private String password;
    private Long port;
    private String projectId;
    private Boolean sasl;
    private String serviceApiKey;
    private String serviceHostname;
    private String servicePassword;
    private Long servicePort;
    private Boolean serviceSsl;
    private String serviceTokenUrl;
    private String serviceUsername;
    private Boolean ssl;
    private String tables;
    private String username;
    private Boolean validateServerCertificate;
    private Boolean verifyHostName;

    /**
     * Instantiates a new Builder from an existing DatabaseDetails instance.
     *
     * @param databaseDetails the instance to initialize the Builder with
     */
    private Builder(DatabaseDetails databaseDetails) {
      this.authenticationType = databaseDetails.authenticationType;
      this.brokerAuthenticationPassword = databaseDetails.brokerAuthenticationPassword;
      this.brokerAuthenticationType = databaseDetails.brokerAuthenticationType;
      this.brokerAuthenticationUser = databaseDetails.brokerAuthenticationUser;
      this.certificate = databaseDetails.certificate;
      this.certificateExtension = databaseDetails.certificateExtension;
      this.connectionMethod = databaseDetails.connectionMethod;
      this.connectionMode = databaseDetails.connectionMode;
      this.connectionModeValue = databaseDetails.connectionModeValue;
      this.connectionType = databaseDetails.connectionType;
      this.controllerAuthenticationPassword = databaseDetails.controllerAuthenticationPassword;
      this.controllerAuthenticationType = databaseDetails.controllerAuthenticationType;
      this.controllerAuthenticationUser = databaseDetails.controllerAuthenticationUser;
      this.cpdHostname = databaseDetails.cpdHostname;
      this.credentialsKey = databaseDetails.credentialsKey;
      this.databaseName = databaseDetails.databaseName;
      this.hostname = databaseDetails.hostname;
      this.hostnameInCertificate = databaseDetails.hostnameInCertificate;
      this.hosts = databaseDetails.hosts;
      this.informixServer = databaseDetails.informixServer;
      this.password = databaseDetails.password;
      this.port = databaseDetails.port;
      this.projectId = databaseDetails.projectId;
      this.sasl = databaseDetails.sasl;
      this.serviceApiKey = databaseDetails.serviceApiKey;
      this.serviceHostname = databaseDetails.serviceHostname;
      this.servicePassword = databaseDetails.servicePassword;
      this.servicePort = databaseDetails.servicePort;
      this.serviceSsl = databaseDetails.serviceSsl;
      this.serviceTokenUrl = databaseDetails.serviceTokenUrl;
      this.serviceUsername = databaseDetails.serviceUsername;
      this.ssl = databaseDetails.ssl;
      this.tables = databaseDetails.tables;
      this.username = databaseDetails.username;
      this.validateServerCertificate = databaseDetails.validateServerCertificate;
      this.verifyHostName = databaseDetails.verifyHostName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseDetails.
     *
     * @return the new DatabaseDetails instance
     */
    public DatabaseDetails build() {
      return new DatabaseDetails(this);
    }

    /**
     * Set the authenticationType.
     *
     * @param authenticationType the authenticationType
     * @return the DatabaseDetails builder
     */
    public Builder authenticationType(String authenticationType) {
      this.authenticationType = authenticationType;
      return this;
    }

    /**
     * Set the brokerAuthenticationPassword.
     *
     * @param brokerAuthenticationPassword the brokerAuthenticationPassword
     * @return the DatabaseDetails builder
     */
    public Builder brokerAuthenticationPassword(String brokerAuthenticationPassword) {
      this.brokerAuthenticationPassword = brokerAuthenticationPassword;
      return this;
    }

    /**
     * Set the brokerAuthenticationType.
     *
     * @param brokerAuthenticationType the brokerAuthenticationType
     * @return the DatabaseDetails builder
     */
    public Builder brokerAuthenticationType(String brokerAuthenticationType) {
      this.brokerAuthenticationType = brokerAuthenticationType;
      return this;
    }

    /**
     * Set the brokerAuthenticationUser.
     *
     * @param brokerAuthenticationUser the brokerAuthenticationUser
     * @return the DatabaseDetails builder
     */
    public Builder brokerAuthenticationUser(String brokerAuthenticationUser) {
      this.brokerAuthenticationUser = brokerAuthenticationUser;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the DatabaseDetails builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateExtension.
     *
     * @param certificateExtension the certificateExtension
     * @return the DatabaseDetails builder
     */
    public Builder certificateExtension(String certificateExtension) {
      this.certificateExtension = certificateExtension;
      return this;
    }

    /**
     * Set the connectionMethod.
     *
     * @param connectionMethod the connectionMethod
     * @return the DatabaseDetails builder
     */
    public Builder connectionMethod(String connectionMethod) {
      this.connectionMethod = connectionMethod;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the DatabaseDetails builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the connectionModeValue.
     *
     * @param connectionModeValue the connectionModeValue
     * @return the DatabaseDetails builder
     */
    public Builder connectionModeValue(String connectionModeValue) {
      this.connectionModeValue = connectionModeValue;
      return this;
    }

    /**
     * Set the connectionType.
     *
     * @param connectionType the connectionType
     * @return the DatabaseDetails builder
     */
    public Builder connectionType(String connectionType) {
      this.connectionType = connectionType;
      return this;
    }

    /**
     * Set the controllerAuthenticationPassword.
     *
     * @param controllerAuthenticationPassword the controllerAuthenticationPassword
     * @return the DatabaseDetails builder
     */
    public Builder controllerAuthenticationPassword(String controllerAuthenticationPassword) {
      this.controllerAuthenticationPassword = controllerAuthenticationPassword;
      return this;
    }

    /**
     * Set the controllerAuthenticationType.
     *
     * @param controllerAuthenticationType the controllerAuthenticationType
     * @return the DatabaseDetails builder
     */
    public Builder controllerAuthenticationType(String controllerAuthenticationType) {
      this.controllerAuthenticationType = controllerAuthenticationType;
      return this;
    }

    /**
     * Set the controllerAuthenticationUser.
     *
     * @param controllerAuthenticationUser the controllerAuthenticationUser
     * @return the DatabaseDetails builder
     */
    public Builder controllerAuthenticationUser(String controllerAuthenticationUser) {
      this.controllerAuthenticationUser = controllerAuthenticationUser;
      return this;
    }

    /**
     * Set the cpdHostname.
     *
     * @param cpdHostname the cpdHostname
     * @return the DatabaseDetails builder
     */
    public Builder cpdHostname(String cpdHostname) {
      this.cpdHostname = cpdHostname;
      return this;
    }

    /**
     * Set the credentialsKey.
     *
     * @param credentialsKey the credentialsKey
     * @return the DatabaseDetails builder
     */
    public Builder credentialsKey(String credentialsKey) {
      this.credentialsKey = credentialsKey;
      return this;
    }

    /**
     * Set the databaseName.
     *
     * @param databaseName the databaseName
     * @return the DatabaseDetails builder
     */
    public Builder databaseName(String databaseName) {
      this.databaseName = databaseName;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the DatabaseDetails builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the hostnameInCertificate.
     *
     * @param hostnameInCertificate the hostnameInCertificate
     * @return the DatabaseDetails builder
     */
    public Builder hostnameInCertificate(String hostnameInCertificate) {
      this.hostnameInCertificate = hostnameInCertificate;
      return this;
    }

    /**
     * Set the hosts.
     *
     * @param hosts the hosts
     * @return the DatabaseDetails builder
     */
    public Builder hosts(String hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the informixServer.
     *
     * @param informixServer the informixServer
     * @return the DatabaseDetails builder
     */
    public Builder informixServer(String informixServer) {
      this.informixServer = informixServer;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DatabaseDetails builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the DatabaseDetails builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the DatabaseDetails builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the sasl.
     *
     * @param sasl the sasl
     * @return the DatabaseDetails builder
     */
    public Builder sasl(Boolean sasl) {
      this.sasl = sasl;
      return this;
    }

    /**
     * Set the serviceApiKey.
     *
     * @param serviceApiKey the serviceApiKey
     * @return the DatabaseDetails builder
     */
    public Builder serviceApiKey(String serviceApiKey) {
      this.serviceApiKey = serviceApiKey;
      return this;
    }

    /**
     * Set the serviceHostname.
     *
     * @param serviceHostname the serviceHostname
     * @return the DatabaseDetails builder
     */
    public Builder serviceHostname(String serviceHostname) {
      this.serviceHostname = serviceHostname;
      return this;
    }

    /**
     * Set the servicePassword.
     *
     * @param servicePassword the servicePassword
     * @return the DatabaseDetails builder
     */
    public Builder servicePassword(String servicePassword) {
      this.servicePassword = servicePassword;
      return this;
    }

    /**
     * Set the servicePort.
     *
     * @param servicePort the servicePort
     * @return the DatabaseDetails builder
     */
    public Builder servicePort(long servicePort) {
      this.servicePort = servicePort;
      return this;
    }

    /**
     * Set the serviceSsl.
     *
     * @param serviceSsl the serviceSsl
     * @return the DatabaseDetails builder
     */
    public Builder serviceSsl(Boolean serviceSsl) {
      this.serviceSsl = serviceSsl;
      return this;
    }

    /**
     * Set the serviceTokenUrl.
     *
     * @param serviceTokenUrl the serviceTokenUrl
     * @return the DatabaseDetails builder
     */
    public Builder serviceTokenUrl(String serviceTokenUrl) {
      this.serviceTokenUrl = serviceTokenUrl;
      return this;
    }

    /**
     * Set the serviceUsername.
     *
     * @param serviceUsername the serviceUsername
     * @return the DatabaseDetails builder
     */
    public Builder serviceUsername(String serviceUsername) {
      this.serviceUsername = serviceUsername;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the DatabaseDetails builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the tables.
     *
     * @param tables the tables
     * @return the DatabaseDetails builder
     */
    public Builder tables(String tables) {
      this.tables = tables;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the DatabaseDetails builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the validateServerCertificate.
     *
     * @param validateServerCertificate the validateServerCertificate
     * @return the DatabaseDetails builder
     */
    public Builder validateServerCertificate(Boolean validateServerCertificate) {
      this.validateServerCertificate = validateServerCertificate;
      return this;
    }

    /**
     * Set the verifyHostName.
     *
     * @param verifyHostName the verifyHostName
     * @return the DatabaseDetails builder
     */
    public Builder verifyHostName(Boolean verifyHostName) {
      this.verifyHostName = verifyHostName;
      return this;
    }
  }

  protected DatabaseDetails() { }

  protected DatabaseDetails(Builder builder) {
    authenticationType = builder.authenticationType;
    brokerAuthenticationPassword = builder.brokerAuthenticationPassword;
    brokerAuthenticationType = builder.brokerAuthenticationType;
    brokerAuthenticationUser = builder.brokerAuthenticationUser;
    certificate = builder.certificate;
    certificateExtension = builder.certificateExtension;
    connectionMethod = builder.connectionMethod;
    connectionMode = builder.connectionMode;
    connectionModeValue = builder.connectionModeValue;
    connectionType = builder.connectionType;
    controllerAuthenticationPassword = builder.controllerAuthenticationPassword;
    controllerAuthenticationType = builder.controllerAuthenticationType;
    controllerAuthenticationUser = builder.controllerAuthenticationUser;
    cpdHostname = builder.cpdHostname;
    credentialsKey = builder.credentialsKey;
    databaseName = builder.databaseName;
    hostname = builder.hostname;
    hostnameInCertificate = builder.hostnameInCertificate;
    hosts = builder.hosts;
    informixServer = builder.informixServer;
    password = builder.password;
    port = builder.port;
    projectId = builder.projectId;
    sasl = builder.sasl;
    serviceApiKey = builder.serviceApiKey;
    serviceHostname = builder.serviceHostname;
    servicePassword = builder.servicePassword;
    servicePort = builder.servicePort;
    serviceSsl = builder.serviceSsl;
    serviceTokenUrl = builder.serviceTokenUrl;
    serviceUsername = builder.serviceUsername;
    ssl = builder.ssl;
    tables = builder.tables;
    username = builder.username;
    validateServerCertificate = builder.validateServerCertificate;
    verifyHostName = builder.verifyHostName;
  }

  /**
   * New builder.
   *
   * @return a DatabaseDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationType.
   *
   * Authentication method.
   *
   * @return the authenticationType
   */
  public String authenticationType() {
    return authenticationType;
  }

  /**
   * Gets the brokerAuthenticationPassword.
   *
   * Broker authentication password.
   *
   * @return the brokerAuthenticationPassword
   */
  public String brokerAuthenticationPassword() {
    return brokerAuthenticationPassword;
  }

  /**
   * Gets the brokerAuthenticationType.
   *
   * Broker authentication type.
   *
   * @return the brokerAuthenticationType
   */
  public String brokerAuthenticationType() {
    return brokerAuthenticationType;
  }

  /**
   * Gets the brokerAuthenticationUser.
   *
   * Broker authentication user.
   *
   * @return the brokerAuthenticationUser
   */
  public String brokerAuthenticationUser() {
    return brokerAuthenticationUser;
  }

  /**
   * Gets the certificate.
   *
   * contents of a pem/crt file.
   *
   * @return the certificate
   */
  public String certificate() {
    return certificate;
  }

  /**
   * Gets the certificateExtension.
   *
   * extension of the certificate file.
   *
   * @return the certificateExtension
   */
  public String certificateExtension() {
    return certificateExtension;
  }

  /**
   * Gets the connectionMethod.
   *
   * connection mode.
   *
   * @return the connectionMethod
   */
  public String connectionMethod() {
    return connectionMethod;
  }

  /**
   * Gets the connectionMode.
   *
   * connection mode.
   *
   * @return the connectionMode
   */
  public String connectionMode() {
    return connectionMode;
  }

  /**
   * Gets the connectionModeValue.
   *
   * connection mode value.
   *
   * @return the connectionModeValue
   */
  public String connectionModeValue() {
    return connectionModeValue;
  }

  /**
   * Gets the connectionType.
   *
   * Connection type.
   *
   * @return the connectionType
   */
  public String connectionType() {
    return connectionType;
  }

  /**
   * Gets the controllerAuthenticationPassword.
   *
   * Controller authentication password.
   *
   * @return the controllerAuthenticationPassword
   */
  public String controllerAuthenticationPassword() {
    return controllerAuthenticationPassword;
  }

  /**
   * Gets the controllerAuthenticationType.
   *
   * Controller authentication type.
   *
   * @return the controllerAuthenticationType
   */
  public String controllerAuthenticationType() {
    return controllerAuthenticationType;
  }

  /**
   * Gets the controllerAuthenticationUser.
   *
   * Controller authentication user.
   *
   * @return the controllerAuthenticationUser
   */
  public String controllerAuthenticationUser() {
    return controllerAuthenticationUser;
  }

  /**
   * Gets the cpdHostname.
   *
   * CPD Hostname.
   *
   * @return the cpdHostname
   */
  public String cpdHostname() {
    return cpdHostname;
  }

  /**
   * Gets the credentialsKey.
   *
   * Base 64 encoded json file.
   *
   * @return the credentialsKey
   */
  public String credentialsKey() {
    return credentialsKey;
  }

  /**
   * Gets the databaseName.
   *
   * Database name.
   *
   * @return the databaseName
   */
  public String databaseName() {
    return databaseName;
  }

  /**
   * Gets the hostname.
   *
   * Host name.
   *
   * @return the hostname
   */
  public String hostname() {
    return hostname;
  }

  /**
   * Gets the hostnameInCertificate.
   *
   * Hostname in certificate.
   *
   * @return the hostnameInCertificate
   */
  public String hostnameInCertificate() {
    return hostnameInCertificate;
  }

  /**
   * Gets the hosts.
   *
   * String of hostname:port.
   *
   * @return the hosts
   */
  public String hosts() {
    return hosts;
  }

  /**
   * Gets the informixServer.
   *
   * informix server value.
   *
   * @return the informixServer
   */
  public String informixServer() {
    return informixServer;
  }

  /**
   * Gets the password.
   *
   * Psssword.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the port.
   *
   * Port.
   *
   * @return the port
   */
  public Long port() {
    return port;
  }

  /**
   * Gets the projectId.
   *
   * Project ID.
   *
   * @return the projectId
   */
  public String projectId() {
    return projectId;
  }

  /**
   * Gets the sasl.
   *
   * SASL Mode.
   *
   * @return the sasl
   */
  public Boolean sasl() {
    return sasl;
  }

  /**
   * Gets the serviceApiKey.
   *
   * service api key.
   *
   * @return the serviceApiKey
   */
  public String serviceApiKey() {
    return serviceApiKey;
  }

  /**
   * Gets the serviceHostname.
   *
   * service hostname.
   *
   * @return the serviceHostname
   */
  public String serviceHostname() {
    return serviceHostname;
  }

  /**
   * Gets the servicePassword.
   *
   * service password.
   *
   * @return the servicePassword
   */
  public String servicePassword() {
    return servicePassword;
  }

  /**
   * Gets the servicePort.
   *
   * Service Port.
   *
   * @return the servicePort
   */
  public Long servicePort() {
    return servicePort;
  }

  /**
   * Gets the serviceSsl.
   *
   * Service SSL Mode.
   *
   * @return the serviceSsl
   */
  public Boolean serviceSsl() {
    return serviceSsl;
  }

  /**
   * Gets the serviceTokenUrl.
   *
   * service token url.
   *
   * @return the serviceTokenUrl
   */
  public String serviceTokenUrl() {
    return serviceTokenUrl;
  }

  /**
   * Gets the serviceUsername.
   *
   * service username.
   *
   * @return the serviceUsername
   */
  public String serviceUsername() {
    return serviceUsername;
  }

  /**
   * Gets the ssl.
   *
   * SSL Mode.
   *
   * @return the ssl
   */
  public Boolean ssl() {
    return ssl;
  }

  /**
   * Gets the tables.
   *
   * Only for Kafka - Add kafka tables.
   *
   * @return the tables
   */
  public String tables() {
    return tables;
  }

  /**
   * Gets the username.
   *
   * Username.
   *
   * @return the username
   */
  public String username() {
    return username;
  }

  /**
   * Gets the validateServerCertificate.
   *
   * Verify certificate.
   *
   * @return the validateServerCertificate
   */
  public Boolean validateServerCertificate() {
    return validateServerCertificate;
  }

  /**
   * Gets the verifyHostName.
   *
   * Verify host name.
   *
   * @return the verifyHostName
   */
  public Boolean verifyHostName() {
    return verifyHostName;
  }
}

