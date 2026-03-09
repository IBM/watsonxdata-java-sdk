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
 * database details.
 */
public class ValidateDatabaseBodyDatabaseDetails extends GenericModel {

  /**
   * Connection mode.
   */
  public interface ConnectionMode {
    /** service_name. */
    String SERVICE_NAME = "service_name";
    /** sid. */
    String SID = "sid";
  }

  /**
   * sasl mechanism for kafka.
   */
  public interface SaslMechanism {
    /** plain. */
    String PLAIN = "plain";
    /** scram_sha_256. */
    String SCRAM_SHA_256 = "scram_sha_256";
    /** scram_sha_512. */
    String SCRAM_SHA_512 = "scram_sha_512";
  }

  @SerializedName("authentication_type")
  protected String authenticationType;
  @SerializedName("authentication_value")
  protected String authenticationValue;
  @SerializedName("authentication_value_key_vault")
  protected SecretDetails authenticationValueKeyVault;
  @SerializedName("broker_authentication_password")
  protected String brokerAuthenticationPassword;
  @SerializedName("broker_authentication_type")
  protected String brokerAuthenticationType;
  @SerializedName("broker_authentication_user")
  protected String brokerAuthenticationUser;
  @SerializedName("broker_host")
  protected String brokerHost;
  @SerializedName("broker_port")
  protected Long brokerPort;
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
  @SerializedName("coordinator_host")
  protected String coordinatorHost;
  @SerializedName("coordinator_port")
  protected Long coordinatorPort;
  @SerializedName("credentials_key")
  protected String credentialsKey;
  @SerializedName("domain_name")
  protected String domainName;
  @SerializedName("driver_uris")
  protected String driverUris;
  protected String hostname;
  @SerializedName("hostname_in_certificate")
  protected String hostnameInCertificate;
  protected String hosts;
  @SerializedName("informix_server")
  protected String informixServer;
  @SerializedName("location_name")
  protected String locationName;
  protected String name;
  protected String password;
  @SerializedName("password_key_vault")
  protected SecretDetails passwordKeyVault;
  protected Long port;
  @SerializedName("private_key")
  protected String privateKey;
  @SerializedName("private_key_passphrase")
  protected String privateKeyPassphrase;
  @SerializedName("project_id")
  protected String projectId;
  protected Boolean sasl;
  @SerializedName("sasl_mechanism")
  protected String saslMechanism;
  @SerializedName("service_api_key")
  protected String serviceApiKey;
  @SerializedName("service_hostname")
  protected String serviceHostname;
  @SerializedName("service_port")
  protected Long servicePort;
  @SerializedName("service_ssl")
  protected Boolean serviceSsl;
  @SerializedName("service_token_url")
  protected String serviceTokenUrl;
  protected Boolean ssl;
  @SerializedName("sslcertificate_key_vault")
  protected SecretDetails sslcertificateKeyVault;
  protected String tables;
  protected String username;
  @SerializedName("username_key_vault")
  protected SecretDetails usernameKeyVault;
  @SerializedName("validate_server_certificate")
  protected Boolean validateServerCertificate;
  @SerializedName("vault_enabled")
  protected Boolean vaultEnabled;
  @SerializedName("verify_host_name")
  protected Boolean verifyHostName;
  @SerializedName("warehouse_name")
  protected String warehouseName;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationType;
    private String authenticationValue;
    private SecretDetails authenticationValueKeyVault;
    private String brokerAuthenticationPassword;
    private String brokerAuthenticationType;
    private String brokerAuthenticationUser;
    private String brokerHost;
    private Long brokerPort;
    private String connectionMode;
    private String connectionModeValue;
    private String connectionType;
    private String controllerAuthenticationPassword;
    private String controllerAuthenticationType;
    private String controllerAuthenticationUser;
    private String coordinatorHost;
    private Long coordinatorPort;
    private String credentialsKey;
    private String domainName;
    private String driverUris;
    private String hostname;
    private String hostnameInCertificate;
    private String hosts;
    private String informixServer;
    private String locationName;
    private String name;
    private String password;
    private SecretDetails passwordKeyVault;
    private Long port;
    private String privateKey;
    private String privateKeyPassphrase;
    private String projectId;
    private Boolean sasl;
    private String saslMechanism;
    private String serviceApiKey;
    private String serviceHostname;
    private Long servicePort;
    private Boolean serviceSsl;
    private String serviceTokenUrl;
    private Boolean ssl;
    private SecretDetails sslcertificateKeyVault;
    private String tables;
    private String username;
    private SecretDetails usernameKeyVault;
    private Boolean validateServerCertificate;
    private Boolean vaultEnabled;
    private Boolean verifyHostName;
    private String warehouseName;

    /**
     * Instantiates a new Builder from an existing ValidateDatabaseBodyDatabaseDetails instance.
     *
     * @param validateDatabaseBodyDatabaseDetails the instance to initialize the Builder with
     */
    private Builder(ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetails) {
      this.authenticationType = validateDatabaseBodyDatabaseDetails.authenticationType;
      this.authenticationValue = validateDatabaseBodyDatabaseDetails.authenticationValue;
      this.authenticationValueKeyVault = validateDatabaseBodyDatabaseDetails.authenticationValueKeyVault;
      this.brokerAuthenticationPassword = validateDatabaseBodyDatabaseDetails.brokerAuthenticationPassword;
      this.brokerAuthenticationType = validateDatabaseBodyDatabaseDetails.brokerAuthenticationType;
      this.brokerAuthenticationUser = validateDatabaseBodyDatabaseDetails.brokerAuthenticationUser;
      this.brokerHost = validateDatabaseBodyDatabaseDetails.brokerHost;
      this.brokerPort = validateDatabaseBodyDatabaseDetails.brokerPort;
      this.connectionMode = validateDatabaseBodyDatabaseDetails.connectionMode;
      this.connectionModeValue = validateDatabaseBodyDatabaseDetails.connectionModeValue;
      this.connectionType = validateDatabaseBodyDatabaseDetails.connectionType;
      this.controllerAuthenticationPassword = validateDatabaseBodyDatabaseDetails.controllerAuthenticationPassword;
      this.controllerAuthenticationType = validateDatabaseBodyDatabaseDetails.controllerAuthenticationType;
      this.controllerAuthenticationUser = validateDatabaseBodyDatabaseDetails.controllerAuthenticationUser;
      this.coordinatorHost = validateDatabaseBodyDatabaseDetails.coordinatorHost;
      this.coordinatorPort = validateDatabaseBodyDatabaseDetails.coordinatorPort;
      this.credentialsKey = validateDatabaseBodyDatabaseDetails.credentialsKey;
      this.domainName = validateDatabaseBodyDatabaseDetails.domainName;
      this.driverUris = validateDatabaseBodyDatabaseDetails.driverUris;
      this.hostname = validateDatabaseBodyDatabaseDetails.hostname;
      this.hostnameInCertificate = validateDatabaseBodyDatabaseDetails.hostnameInCertificate;
      this.hosts = validateDatabaseBodyDatabaseDetails.hosts;
      this.informixServer = validateDatabaseBodyDatabaseDetails.informixServer;
      this.locationName = validateDatabaseBodyDatabaseDetails.locationName;
      this.name = validateDatabaseBodyDatabaseDetails.name;
      this.password = validateDatabaseBodyDatabaseDetails.password;
      this.passwordKeyVault = validateDatabaseBodyDatabaseDetails.passwordKeyVault;
      this.port = validateDatabaseBodyDatabaseDetails.port;
      this.privateKey = validateDatabaseBodyDatabaseDetails.privateKey;
      this.privateKeyPassphrase = validateDatabaseBodyDatabaseDetails.privateKeyPassphrase;
      this.projectId = validateDatabaseBodyDatabaseDetails.projectId;
      this.sasl = validateDatabaseBodyDatabaseDetails.sasl;
      this.saslMechanism = validateDatabaseBodyDatabaseDetails.saslMechanism;
      this.serviceApiKey = validateDatabaseBodyDatabaseDetails.serviceApiKey;
      this.serviceHostname = validateDatabaseBodyDatabaseDetails.serviceHostname;
      this.servicePort = validateDatabaseBodyDatabaseDetails.servicePort;
      this.serviceSsl = validateDatabaseBodyDatabaseDetails.serviceSsl;
      this.serviceTokenUrl = validateDatabaseBodyDatabaseDetails.serviceTokenUrl;
      this.ssl = validateDatabaseBodyDatabaseDetails.ssl;
      this.sslcertificateKeyVault = validateDatabaseBodyDatabaseDetails.sslcertificateKeyVault;
      this.tables = validateDatabaseBodyDatabaseDetails.tables;
      this.username = validateDatabaseBodyDatabaseDetails.username;
      this.usernameKeyVault = validateDatabaseBodyDatabaseDetails.usernameKeyVault;
      this.validateServerCertificate = validateDatabaseBodyDatabaseDetails.validateServerCertificate;
      this.vaultEnabled = validateDatabaseBodyDatabaseDetails.vaultEnabled;
      this.verifyHostName = validateDatabaseBodyDatabaseDetails.verifyHostName;
      this.warehouseName = validateDatabaseBodyDatabaseDetails.warehouseName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ValidateDatabaseBodyDatabaseDetails.
     *
     * @return the new ValidateDatabaseBodyDatabaseDetails instance
     */
    public ValidateDatabaseBodyDatabaseDetails build() {
      return new ValidateDatabaseBodyDatabaseDetails(this);
    }

    /**
     * Set the authenticationType.
     *
     * @param authenticationType the authenticationType
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder authenticationType(String authenticationType) {
      this.authenticationType = authenticationType;
      return this;
    }

    /**
     * Set the authenticationValue.
     *
     * @param authenticationValue the authenticationValue
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder authenticationValue(String authenticationValue) {
      this.authenticationValue = authenticationValue;
      return this;
    }

    /**
     * Set the authenticationValueKeyVault.
     *
     * @param authenticationValueKeyVault the authenticationValueKeyVault
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder authenticationValueKeyVault(SecretDetails authenticationValueKeyVault) {
      this.authenticationValueKeyVault = authenticationValueKeyVault;
      return this;
    }

    /**
     * Set the brokerAuthenticationPassword.
     *
     * @param brokerAuthenticationPassword the brokerAuthenticationPassword
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder brokerAuthenticationPassword(String brokerAuthenticationPassword) {
      this.brokerAuthenticationPassword = brokerAuthenticationPassword;
      return this;
    }

    /**
     * Set the brokerAuthenticationType.
     *
     * @param brokerAuthenticationType the brokerAuthenticationType
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder brokerAuthenticationType(String brokerAuthenticationType) {
      this.brokerAuthenticationType = brokerAuthenticationType;
      return this;
    }

    /**
     * Set the brokerAuthenticationUser.
     *
     * @param brokerAuthenticationUser the brokerAuthenticationUser
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder brokerAuthenticationUser(String brokerAuthenticationUser) {
      this.brokerAuthenticationUser = brokerAuthenticationUser;
      return this;
    }

    /**
     * Set the brokerHost.
     *
     * @param brokerHost the brokerHost
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder brokerHost(String brokerHost) {
      this.brokerHost = brokerHost;
      return this;
    }

    /**
     * Set the brokerPort.
     *
     * @param brokerPort the brokerPort
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder brokerPort(long brokerPort) {
      this.brokerPort = brokerPort;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the connectionModeValue.
     *
     * @param connectionModeValue the connectionModeValue
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder connectionModeValue(String connectionModeValue) {
      this.connectionModeValue = connectionModeValue;
      return this;
    }

    /**
     * Set the connectionType.
     *
     * @param connectionType the connectionType
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder connectionType(String connectionType) {
      this.connectionType = connectionType;
      return this;
    }

    /**
     * Set the controllerAuthenticationPassword.
     *
     * @param controllerAuthenticationPassword the controllerAuthenticationPassword
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder controllerAuthenticationPassword(String controllerAuthenticationPassword) {
      this.controllerAuthenticationPassword = controllerAuthenticationPassword;
      return this;
    }

    /**
     * Set the controllerAuthenticationType.
     *
     * @param controllerAuthenticationType the controllerAuthenticationType
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder controllerAuthenticationType(String controllerAuthenticationType) {
      this.controllerAuthenticationType = controllerAuthenticationType;
      return this;
    }

    /**
     * Set the controllerAuthenticationUser.
     *
     * @param controllerAuthenticationUser the controllerAuthenticationUser
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder controllerAuthenticationUser(String controllerAuthenticationUser) {
      this.controllerAuthenticationUser = controllerAuthenticationUser;
      return this;
    }

    /**
     * Set the coordinatorHost.
     *
     * @param coordinatorHost the coordinatorHost
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder coordinatorHost(String coordinatorHost) {
      this.coordinatorHost = coordinatorHost;
      return this;
    }

    /**
     * Set the coordinatorPort.
     *
     * @param coordinatorPort the coordinatorPort
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder coordinatorPort(long coordinatorPort) {
      this.coordinatorPort = coordinatorPort;
      return this;
    }

    /**
     * Set the credentialsKey.
     *
     * @param credentialsKey the credentialsKey
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder credentialsKey(String credentialsKey) {
      this.credentialsKey = credentialsKey;
      return this;
    }

    /**
     * Set the domainName.
     *
     * @param domainName the domainName
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder domainName(String domainName) {
      this.domainName = domainName;
      return this;
    }

    /**
     * Set the driverUris.
     *
     * @param driverUris the driverUris
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder driverUris(String driverUris) {
      this.driverUris = driverUris;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the hostnameInCertificate.
     *
     * @param hostnameInCertificate the hostnameInCertificate
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder hostnameInCertificate(String hostnameInCertificate) {
      this.hostnameInCertificate = hostnameInCertificate;
      return this;
    }

    /**
     * Set the hosts.
     *
     * @param hosts the hosts
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder hosts(String hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the informixServer.
     *
     * @param informixServer the informixServer
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder informixServer(String informixServer) {
      this.informixServer = informixServer;
      return this;
    }

    /**
     * Set the locationName.
     *
     * @param locationName the locationName
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder locationName(String locationName) {
      this.locationName = locationName;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the passwordKeyVault.
     *
     * @param passwordKeyVault the passwordKeyVault
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder passwordKeyVault(SecretDetails passwordKeyVault) {
      this.passwordKeyVault = passwordKeyVault;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the privateKey.
     *
     * @param privateKey the privateKey
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder privateKey(String privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * Set the privateKeyPassphrase.
     *
     * @param privateKeyPassphrase the privateKeyPassphrase
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder privateKeyPassphrase(String privateKeyPassphrase) {
      this.privateKeyPassphrase = privateKeyPassphrase;
      return this;
    }

    /**
     * Set the projectId.
     *
     * @param projectId the projectId
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder projectId(String projectId) {
      this.projectId = projectId;
      return this;
    }

    /**
     * Set the sasl.
     *
     * @param sasl the sasl
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder sasl(Boolean sasl) {
      this.sasl = sasl;
      return this;
    }

    /**
     * Set the saslMechanism.
     *
     * @param saslMechanism the saslMechanism
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder saslMechanism(String saslMechanism) {
      this.saslMechanism = saslMechanism;
      return this;
    }

    /**
     * Set the serviceApiKey.
     *
     * @param serviceApiKey the serviceApiKey
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder serviceApiKey(String serviceApiKey) {
      this.serviceApiKey = serviceApiKey;
      return this;
    }

    /**
     * Set the serviceHostname.
     *
     * @param serviceHostname the serviceHostname
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder serviceHostname(String serviceHostname) {
      this.serviceHostname = serviceHostname;
      return this;
    }

    /**
     * Set the servicePort.
     *
     * @param servicePort the servicePort
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder servicePort(long servicePort) {
      this.servicePort = servicePort;
      return this;
    }

    /**
     * Set the serviceSsl.
     *
     * @param serviceSsl the serviceSsl
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder serviceSsl(Boolean serviceSsl) {
      this.serviceSsl = serviceSsl;
      return this;
    }

    /**
     * Set the serviceTokenUrl.
     *
     * @param serviceTokenUrl the serviceTokenUrl
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder serviceTokenUrl(String serviceTokenUrl) {
      this.serviceTokenUrl = serviceTokenUrl;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the sslcertificateKeyVault.
     *
     * @param sslcertificateKeyVault the sslcertificateKeyVault
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder sslcertificateKeyVault(SecretDetails sslcertificateKeyVault) {
      this.sslcertificateKeyVault = sslcertificateKeyVault;
      return this;
    }

    /**
     * Set the tables.
     *
     * @param tables the tables
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder tables(String tables) {
      this.tables = tables;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }

    /**
     * Set the usernameKeyVault.
     *
     * @param usernameKeyVault the usernameKeyVault
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder usernameKeyVault(SecretDetails usernameKeyVault) {
      this.usernameKeyVault = usernameKeyVault;
      return this;
    }

    /**
     * Set the validateServerCertificate.
     *
     * @param validateServerCertificate the validateServerCertificate
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder validateServerCertificate(Boolean validateServerCertificate) {
      this.validateServerCertificate = validateServerCertificate;
      return this;
    }

    /**
     * Set the vaultEnabled.
     *
     * @param vaultEnabled the vaultEnabled
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder vaultEnabled(Boolean vaultEnabled) {
      this.vaultEnabled = vaultEnabled;
      return this;
    }

    /**
     * Set the verifyHostName.
     *
     * @param verifyHostName the verifyHostName
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder verifyHostName(Boolean verifyHostName) {
      this.verifyHostName = verifyHostName;
      return this;
    }

    /**
     * Set the warehouseName.
     *
     * @param warehouseName the warehouseName
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder warehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
      return this;
    }
  }

  protected ValidateDatabaseBodyDatabaseDetails() { }

  protected ValidateDatabaseBodyDatabaseDetails(Builder builder) {
    authenticationType = builder.authenticationType;
    authenticationValue = builder.authenticationValue;
    authenticationValueKeyVault = builder.authenticationValueKeyVault;
    brokerAuthenticationPassword = builder.brokerAuthenticationPassword;
    brokerAuthenticationType = builder.brokerAuthenticationType;
    brokerAuthenticationUser = builder.brokerAuthenticationUser;
    brokerHost = builder.brokerHost;
    brokerPort = builder.brokerPort;
    connectionMode = builder.connectionMode;
    connectionModeValue = builder.connectionModeValue;
    connectionType = builder.connectionType;
    controllerAuthenticationPassword = builder.controllerAuthenticationPassword;
    controllerAuthenticationType = builder.controllerAuthenticationType;
    controllerAuthenticationUser = builder.controllerAuthenticationUser;
    coordinatorHost = builder.coordinatorHost;
    coordinatorPort = builder.coordinatorPort;
    credentialsKey = builder.credentialsKey;
    domainName = builder.domainName;
    driverUris = builder.driverUris;
    hostname = builder.hostname;
    hostnameInCertificate = builder.hostnameInCertificate;
    hosts = builder.hosts;
    informixServer = builder.informixServer;
    locationName = builder.locationName;
    name = builder.name;
    password = builder.password;
    passwordKeyVault = builder.passwordKeyVault;
    port = builder.port;
    privateKey = builder.privateKey;
    privateKeyPassphrase = builder.privateKeyPassphrase;
    projectId = builder.projectId;
    sasl = builder.sasl;
    saslMechanism = builder.saslMechanism;
    serviceApiKey = builder.serviceApiKey;
    serviceHostname = builder.serviceHostname;
    servicePort = builder.servicePort;
    serviceSsl = builder.serviceSsl;
    serviceTokenUrl = builder.serviceTokenUrl;
    ssl = builder.ssl;
    sslcertificateKeyVault = builder.sslcertificateKeyVault;
    tables = builder.tables;
    username = builder.username;
    usernameKeyVault = builder.usernameKeyVault;
    validateServerCertificate = builder.validateServerCertificate;
    vaultEnabled = builder.vaultEnabled;
    verifyHostName = builder.verifyHostName;
    warehouseName = builder.warehouseName;
  }

  /**
   * New builder.
   *
   * @return a ValidateDatabaseBodyDatabaseDetails builder
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
   * Gets the authenticationValue.
   *
   * To send DB2 api key for test connection.
   *
   * @return the authenticationValue
   */
  public String authenticationValue() {
    return authenticationValue;
  }

  /**
   * Gets the authenticationValueKeyVault.
   *
   * secret details.
   *
   * @return the authenticationValueKeyVault
   */
  public SecretDetails authenticationValueKeyVault() {
    return authenticationValueKeyVault;
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
   * Gets the brokerHost.
   *
   * broker host name for druid.
   *
   * @return the brokerHost
   */
  public String brokerHost() {
    return brokerHost;
  }

  /**
   * Gets the brokerPort.
   *
   * Broker port for druid.
   *
   * @return the brokerPort
   */
  public Long brokerPort() {
    return brokerPort;
  }

  /**
   * Gets the connectionMode.
   *
   * Connection mode.
   *
   * @return the connectionMode
   */
  public String connectionMode() {
    return connectionMode;
  }

  /**
   * Gets the connectionModeValue.
   *
   * Connection mode value.
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
   * Gets the coordinatorHost.
   *
   * Coordinator host for druid.
   *
   * @return the coordinatorHost
   */
  public String coordinatorHost() {
    return coordinatorHost;
  }

  /**
   * Gets the coordinatorPort.
   *
   * Coordinator port for druid.
   *
   * @return the coordinatorPort
   */
  public Long coordinatorPort() {
    return coordinatorPort;
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
   * Gets the domainName.
   *
   * Domain name.
   *
   * @return the domainName
   */
  public String domainName() {
    return domainName;
  }

  /**
   * Gets the driverUris.
   *
   * Driver uris for db2 for z/os.
   *
   * @return the driverUris
   */
  public String driverUris() {
    return driverUris;
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
   * Gets the locationName.
   *
   * Location name for db2 for z/os.
   *
   * @return the locationName
   */
  public String locationName() {
    return locationName;
  }

  /**
   * Gets the name.
   *
   * db name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the password.
   *
   * Password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the passwordKeyVault.
   *
   * secret details.
   *
   * @return the passwordKeyVault
   */
  public SecretDetails passwordKeyVault() {
    return passwordKeyVault;
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
   * Gets the privateKey.
   *
   * Private key file path used for private key authentication in snowflake connector.
   *
   * @return the privateKey
   */
  public String privateKey() {
    return privateKey;
  }

  /**
   * Gets the privateKeyPassphrase.
   *
   * Passphrase used for private key authentication in snowflake connector.
   *
   * @return the privateKeyPassphrase
   */
  public String privateKeyPassphrase() {
    return privateKeyPassphrase;
  }

  /**
   * Gets the projectId.
   *
   * project_id.
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
   * Gets the saslMechanism.
   *
   * sasl mechanism for kafka.
   *
   * @return the saslMechanism
   */
  public String saslMechanism() {
    return saslMechanism;
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
   * Gets the sslcertificateKeyVault.
   *
   * secret details.
   *
   * @return the sslcertificateKeyVault
   */
  public SecretDetails sslcertificateKeyVault() {
    return sslcertificateKeyVault;
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
   * Gets the usernameKeyVault.
   *
   * secret details.
   *
   * @return the usernameKeyVault
   */
  public SecretDetails usernameKeyVault() {
    return usernameKeyVault;
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
   * Gets the vaultEnabled.
   *
   * vault enabled or not.
   *
   * @return the vaultEnabled
   */
  public Boolean vaultEnabled() {
    return vaultEnabled;
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

  /**
   * Gets the warehouseName.
   *
   * Warehouse name.
   *
   * @return the warehouseName
   */
  public String warehouseName() {
    return warehouseName;
  }
}

