/*
 * (C) Copyright IBM Corp. 2024.
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

  protected String certificate;
  @SerializedName("certificate_extension")
  protected String certificateExtension;
  @SerializedName("database_name")
  protected String databaseName;
  protected String hostname;
  @SerializedName("hostname_in_certificate")
  protected String hostnameInCertificate;
  protected String hosts;
  protected String password;
  protected Long port;
  protected Boolean sasl;
  protected Boolean ssl;
  protected String tables;
  protected String username;
  @SerializedName("validate_server_certificate")
  protected Boolean validateServerCertificate;

  /**
   * Builder.
   */
  public static class Builder {
    private String certificate;
    private String certificateExtension;
    private String databaseName;
    private String hostname;
    private String hostnameInCertificate;
    private String hosts;
    private String password;
    private Long port;
    private Boolean sasl;
    private Boolean ssl;
    private String tables;
    private String username;
    private Boolean validateServerCertificate;

    /**
     * Instantiates a new Builder from an existing DatabaseDetails instance.
     *
     * @param databaseDetails the instance to initialize the Builder with
     */
    private Builder(DatabaseDetails databaseDetails) {
      this.certificate = databaseDetails.certificate;
      this.certificateExtension = databaseDetails.certificateExtension;
      this.databaseName = databaseDetails.databaseName;
      this.hostname = databaseDetails.hostname;
      this.hostnameInCertificate = databaseDetails.hostnameInCertificate;
      this.hosts = databaseDetails.hosts;
      this.password = databaseDetails.password;
      this.port = databaseDetails.port;
      this.sasl = databaseDetails.sasl;
      this.ssl = databaseDetails.ssl;
      this.tables = databaseDetails.tables;
      this.username = databaseDetails.username;
      this.validateServerCertificate = databaseDetails.validateServerCertificate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param hostname the hostname
     * @param port the port
     */
    public Builder(String hostname, Long port) {
      this.hostname = hostname;
      this.port = port;
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
  }

  protected DatabaseDetails() { }

  protected DatabaseDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hostname,
      "hostname cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    certificate = builder.certificate;
    certificateExtension = builder.certificateExtension;
    databaseName = builder.databaseName;
    hostname = builder.hostname;
    hostnameInCertificate = builder.hostnameInCertificate;
    hosts = builder.hosts;
    password = builder.password;
    port = builder.port;
    sasl = builder.sasl;
    ssl = builder.ssl;
    tables = builder.tables;
    username = builder.username;
    validateServerCertificate = builder.validateServerCertificate;
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
}

