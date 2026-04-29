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
 * database details.
 */
public class DatabaseDetails extends GenericModel {

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
  @SerializedName("password_key_vault")
  protected SecretDetails passwordKeyVault;
  @SerializedName("controller_authentication_user")
  protected String controllerAuthenticationUser;
  @SerializedName("coordinator_host")
  protected String coordinatorHost;
  @SerializedName("coordinator_port")
  protected Long coordinatorPort;
  @SerializedName("cpd_hostname")
  protected String cpdHostname;
  @SerializedName("credentials_key")
  protected String credentialsKey;
  @SerializedName("domain_name")
  protected String domainName;
  protected String hostname;
  @SerializedName("hostname_in_certificate")
  protected String hostnameInCertificate;
  protected String hosts;
  @SerializedName("informix_server")
  protected String informixServer;
  protected String name;
  protected String password;
  protected Long port;
  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("properties")
  protected List<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems> xProperties;
  protected Boolean sasl;
  @SerializedName("sasl_mechanism")
  protected String saslMechanism;
  @SerializedName("schema_name")
  protected String schemaName;
  protected String schemas;
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
  @SerializedName("sslcertificate_key_vault")
  protected SecretDetails sslcertificateKeyVault;
  @SerializedName("vault_enabled")
  protected Boolean vaultEnabled;
  @SerializedName("username_key_vault")
  protected SecretDetails usernameKeyVault;
  @SerializedName("warehouse_name")
  protected String warehouseName;

  protected DatabaseDetails() { }

  /**
   * Gets the authenticationType.
   *
   * Authentication method.
   *
   * @return the authenticationType
   */
  public String getAuthenticationType() {
    return authenticationType;
  }

  /**
   * Gets the authenticationValue.
   *
   * Authentication method.
   *
   * @return the authenticationValue
   */
  public String getAuthenticationValue() {
    return authenticationValue;
  }

  /**
   * Gets the authenticationValueKeyVault.
   *
   * secret details.
   *
   * @return the authenticationValueKeyVault
   */
  public SecretDetails getAuthenticationValueKeyVault() {
    return authenticationValueKeyVault;
  }

  /**
   * Gets the brokerAuthenticationPassword.
   *
   * Broker authentication password.
   *
   * @return the brokerAuthenticationPassword
   */
  public String getBrokerAuthenticationPassword() {
    return brokerAuthenticationPassword;
  }

  /**
   * Gets the brokerAuthenticationType.
   *
   * Broker authentication type.
   *
   * @return the brokerAuthenticationType
   */
  public String getBrokerAuthenticationType() {
    return brokerAuthenticationType;
  }

  /**
   * Gets the brokerAuthenticationUser.
   *
   * Broker authentication user.
   *
   * @return the brokerAuthenticationUser
   */
  public String getBrokerAuthenticationUser() {
    return brokerAuthenticationUser;
  }

  /**
   * Gets the brokerHost.
   *
   * Broker host.
   *
   * @return the brokerHost
   */
  public String getBrokerHost() {
    return brokerHost;
  }

  /**
   * Gets the brokerPort.
   *
   * Broker port.
   *
   * @return the brokerPort
   */
  public Long getBrokerPort() {
    return brokerPort;
  }

  /**
   * Gets the certificate.
   *
   * contents of a pem/crt file.
   *
   * @return the certificate
   */
  public String getCertificate() {
    return certificate;
  }

  /**
   * Gets the certificateExtension.
   *
   * extension of the certificate file.
   *
   * @return the certificateExtension
   */
  public String getCertificateExtension() {
    return certificateExtension;
  }

  /**
   * Gets the connectionMethod.
   *
   * connection mode.
   *
   * @return the connectionMethod
   */
  public String getConnectionMethod() {
    return connectionMethod;
  }

  /**
   * Gets the connectionMode.
   *
   * connection mode.
   *
   * @return the connectionMode
   */
  public String getConnectionMode() {
    return connectionMode;
  }

  /**
   * Gets the connectionModeValue.
   *
   * connection mode value.
   *
   * @return the connectionModeValue
   */
  public String getConnectionModeValue() {
    return connectionModeValue;
  }

  /**
   * Gets the connectionType.
   *
   * Connection type.
   *
   * @return the connectionType
   */
  public String getConnectionType() {
    return connectionType;
  }

  /**
   * Gets the controllerAuthenticationPassword.
   *
   * Controller authentication password.
   *
   * @return the controllerAuthenticationPassword
   */
  public String getControllerAuthenticationPassword() {
    return controllerAuthenticationPassword;
  }

  /**
   * Gets the controllerAuthenticationType.
   *
   * Controller authentication type.
   *
   * @return the controllerAuthenticationType
   */
  public String getControllerAuthenticationType() {
    return controllerAuthenticationType;
  }

  /**
   * Gets the passwordKeyVault.
   *
   * secret details.
   *
   * @return the passwordKeyVault
   */
  public SecretDetails getPasswordKeyVault() {
    return passwordKeyVault;
  }

  /**
   * Gets the controllerAuthenticationUser.
   *
   * Controller authentication user.
   *
   * @return the controllerAuthenticationUser
   */
  public String getControllerAuthenticationUser() {
    return controllerAuthenticationUser;
  }

  /**
   * Gets the coordinatorHost.
   *
   * Coordinator host.
   *
   * @return the coordinatorHost
   */
  public String getCoordinatorHost() {
    return coordinatorHost;
  }

  /**
   * Gets the coordinatorPort.
   *
   * Coordinator port.
   *
   * @return the coordinatorPort
   */
  public Long getCoordinatorPort() {
    return coordinatorPort;
  }

  /**
   * Gets the cpdHostname.
   *
   * CPD Hostname.
   *
   * @return the cpdHostname
   */
  public String getCpdHostname() {
    return cpdHostname;
  }

  /**
   * Gets the credentialsKey.
   *
   * Base 64 encoded json file.
   *
   * @return the credentialsKey
   */
  public String getCredentialsKey() {
    return credentialsKey;
  }

  /**
   * Gets the domainName.
   *
   * Domain name.
   *
   * @return the domainName
   */
  public String getDomainName() {
    return domainName;
  }

  /**
   * Gets the hostname.
   *
   * Host name.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the hostnameInCertificate.
   *
   * Hostname in certificate.
   *
   * @return the hostnameInCertificate
   */
  public String getHostnameInCertificate() {
    return hostnameInCertificate;
  }

  /**
   * Gets the hosts.
   *
   * String of hostname:port.
   *
   * @return the hosts
   */
  public String getHosts() {
    return hosts;
  }

  /**
   * Gets the informixServer.
   *
   * informix server value.
   *
   * @return the informixServer
   */
  public String getInformixServer() {
    return informixServer;
  }

  /**
   * Gets the name.
   *
   * Database name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the password.
   *
   * Psssword.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Gets the port.
   *
   * Port.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the projectId.
   *
   * Project ID.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the xProperties.
   *
   * This will hold all the properties for a custom database.
   *
   * @return the xProperties
   */
  public List<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems> getXProperties() {
    return xProperties;
  }

  /**
   * Gets the sasl.
   *
   * SASL Mode.
   *
   * @return the sasl
   */
  public Boolean isSasl() {
    return sasl;
  }

  /**
   * Gets the saslMechanism.
   *
   * sasl mechanism for kafka. Allowed values are plain, scram_sha_256, scram_sha_512.
   *
   * @return the saslMechanism
   */
  public String getSaslMechanism() {
    return saslMechanism;
  }

  /**
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * Gets the schemas.
   *
   * Add tables.
   *
   * @return the schemas
   */
  public String getSchemas() {
    return schemas;
  }

  /**
   * Gets the serviceApiKey.
   *
   * service api key.
   *
   * @return the serviceApiKey
   */
  public String getServiceApiKey() {
    return serviceApiKey;
  }

  /**
   * Gets the serviceHostname.
   *
   * service hostname.
   *
   * @return the serviceHostname
   */
  public String getServiceHostname() {
    return serviceHostname;
  }

  /**
   * Gets the servicePassword.
   *
   * service password.
   *
   * @return the servicePassword
   */
  public String getServicePassword() {
    return servicePassword;
  }

  /**
   * Gets the servicePort.
   *
   * Service Port.
   *
   * @return the servicePort
   */
  public Long getServicePort() {
    return servicePort;
  }

  /**
   * Gets the serviceSsl.
   *
   * Service SSL Mode.
   *
   * @return the serviceSsl
   */
  public Boolean isServiceSsl() {
    return serviceSsl;
  }

  /**
   * Gets the serviceTokenUrl.
   *
   * service token url.
   *
   * @return the serviceTokenUrl
   */
  public String getServiceTokenUrl() {
    return serviceTokenUrl;
  }

  /**
   * Gets the serviceUsername.
   *
   * service username.
   *
   * @return the serviceUsername
   */
  public String getServiceUsername() {
    return serviceUsername;
  }

  /**
   * Gets the ssl.
   *
   * SSL Mode.
   *
   * @return the ssl
   */
  public Boolean isSsl() {
    return ssl;
  }

  /**
   * Gets the tables.
   *
   * Add tables.
   *
   * @return the tables
   */
  public String getTables() {
    return tables;
  }

  /**
   * Gets the username.
   *
   * Username.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Gets the validateServerCertificate.
   *
   * Verify certificate.
   *
   * @return the validateServerCertificate
   */
  public Boolean isValidateServerCertificate() {
    return validateServerCertificate;
  }

  /**
   * Gets the verifyHostName.
   *
   * Verify host name.
   *
   * @return the verifyHostName
   */
  public Boolean isVerifyHostName() {
    return verifyHostName;
  }

  /**
   * Gets the sslcertificateKeyVault.
   *
   * secret details.
   *
   * @return the sslcertificateKeyVault
   */
  public SecretDetails getSslcertificateKeyVault() {
    return sslcertificateKeyVault;
  }

  /**
   * Gets the vaultEnabled.
   *
   * vault enabled or not.
   *
   * @return the vaultEnabled
   */
  public Boolean isVaultEnabled() {
    return vaultEnabled;
  }

  /**
   * Gets the usernameKeyVault.
   *
   * secret details.
   *
   * @return the usernameKeyVault
   */
  public SecretDetails getUsernameKeyVault() {
    return usernameKeyVault;
  }

  /**
   * Gets the warehouseName.
   *
   * Warehouse name.
   *
   * @return the warehouseName
   */
  public String getWarehouseName() {
    return warehouseName;
  }
}

