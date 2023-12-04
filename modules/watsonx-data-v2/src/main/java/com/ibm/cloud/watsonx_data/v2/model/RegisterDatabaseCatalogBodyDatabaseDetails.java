/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * database details.
 */
public class RegisterDatabaseCatalogBodyDatabaseDetails extends GenericModel {

  protected String certificate;
  @SerializedName("certificate_extension")
  protected String certificateExtension;
  @SerializedName("database_name")
  protected String databaseName;
  protected String hostname;
  protected String hosts;
  protected String password;
  protected Long port;
  protected Boolean sasl;
  protected Boolean ssl;
  protected String tables;
  protected String username;

  /**
   * Builder.
   */
  public static class Builder {
    private String certificate;
    private String certificateExtension;
    private String databaseName;
    private String hostname;
    private String hosts;
    private String password;
    private Long port;
    private Boolean sasl;
    private Boolean ssl;
    private String tables;
    private String username;

    /**
     * Instantiates a new Builder from an existing RegisterDatabaseCatalogBodyDatabaseDetails instance.
     *
     * @param registerDatabaseCatalogBodyDatabaseDetails the instance to initialize the Builder with
     */
    private Builder(RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetails) {
      this.certificate = registerDatabaseCatalogBodyDatabaseDetails.certificate;
      this.certificateExtension = registerDatabaseCatalogBodyDatabaseDetails.certificateExtension;
      this.databaseName = registerDatabaseCatalogBodyDatabaseDetails.databaseName;
      this.hostname = registerDatabaseCatalogBodyDatabaseDetails.hostname;
      this.hosts = registerDatabaseCatalogBodyDatabaseDetails.hosts;
      this.password = registerDatabaseCatalogBodyDatabaseDetails.password;
      this.port = registerDatabaseCatalogBodyDatabaseDetails.port;
      this.sasl = registerDatabaseCatalogBodyDatabaseDetails.sasl;
      this.ssl = registerDatabaseCatalogBodyDatabaseDetails.ssl;
      this.tables = registerDatabaseCatalogBodyDatabaseDetails.tables;
      this.username = registerDatabaseCatalogBodyDatabaseDetails.username;
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
     * Builds a RegisterDatabaseCatalogBodyDatabaseDetails.
     *
     * @return the new RegisterDatabaseCatalogBodyDatabaseDetails instance
     */
    public RegisterDatabaseCatalogBodyDatabaseDetails build() {
      return new RegisterDatabaseCatalogBodyDatabaseDetails(this);
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the certificateExtension.
     *
     * @param certificateExtension the certificateExtension
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder certificateExtension(String certificateExtension) {
      this.certificateExtension = certificateExtension;
      return this;
    }

    /**
     * Set the databaseName.
     *
     * @param databaseName the databaseName
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder databaseName(String databaseName) {
      this.databaseName = databaseName;
      return this;
    }

    /**
     * Set the hostname.
     *
     * @param hostname the hostname
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder hostname(String hostname) {
      this.hostname = hostname;
      return this;
    }

    /**
     * Set the hosts.
     *
     * @param hosts the hosts
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder hosts(String hosts) {
      this.hosts = hosts;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder port(long port) {
      this.port = port;
      return this;
    }

    /**
     * Set the sasl.
     *
     * @param sasl the sasl
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder sasl(Boolean sasl) {
      this.sasl = sasl;
      return this;
    }

    /**
     * Set the ssl.
     *
     * @param ssl the ssl
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder ssl(Boolean ssl) {
      this.ssl = ssl;
      return this;
    }

    /**
     * Set the tables.
     *
     * @param tables the tables
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder tables(String tables) {
      this.tables = tables;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the RegisterDatabaseCatalogBodyDatabaseDetails builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }
  }

  protected RegisterDatabaseCatalogBodyDatabaseDetails() { }

  protected RegisterDatabaseCatalogBodyDatabaseDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hostname,
      "hostname cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    certificate = builder.certificate;
    certificateExtension = builder.certificateExtension;
    databaseName = builder.databaseName;
    hostname = builder.hostname;
    hosts = builder.hosts;
    password = builder.password;
    port = builder.port;
    sasl = builder.sasl;
    ssl = builder.ssl;
    tables = builder.tables;
    username = builder.username;
  }

  /**
   * New builder.
   *
   * @return a RegisterDatabaseCatalogBodyDatabaseDetails builder
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
}

