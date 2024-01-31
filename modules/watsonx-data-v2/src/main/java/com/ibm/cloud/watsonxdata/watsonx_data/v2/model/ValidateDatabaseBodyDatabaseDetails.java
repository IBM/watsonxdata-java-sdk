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
public class ValidateDatabaseBodyDatabaseDetails extends GenericModel {

  @SerializedName("database_name")
  protected String databaseName;
  protected String hostname;
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
    private String databaseName;
    private String hostname;
    private String password;
    private Long port;
    private Boolean sasl;
    private Boolean ssl;
    private String tables;
    private String username;
    private Boolean validateServerCertificate;

    /**
     * Instantiates a new Builder from an existing ValidateDatabaseBodyDatabaseDetails instance.
     *
     * @param validateDatabaseBodyDatabaseDetails the instance to initialize the Builder with
     */
    private Builder(ValidateDatabaseBodyDatabaseDetails validateDatabaseBodyDatabaseDetails) {
      this.databaseName = validateDatabaseBodyDatabaseDetails.databaseName;
      this.hostname = validateDatabaseBodyDatabaseDetails.hostname;
      this.password = validateDatabaseBodyDatabaseDetails.password;
      this.port = validateDatabaseBodyDatabaseDetails.port;
      this.sasl = validateDatabaseBodyDatabaseDetails.sasl;
      this.ssl = validateDatabaseBodyDatabaseDetails.ssl;
      this.tables = validateDatabaseBodyDatabaseDetails.tables;
      this.username = validateDatabaseBodyDatabaseDetails.username;
      this.validateServerCertificate = validateDatabaseBodyDatabaseDetails.validateServerCertificate;
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
     * Builds a ValidateDatabaseBodyDatabaseDetails.
     *
     * @return the new ValidateDatabaseBodyDatabaseDetails instance
     */
    public ValidateDatabaseBodyDatabaseDetails build() {
      return new ValidateDatabaseBodyDatabaseDetails(this);
    }

    /**
     * Set the databaseName.
     *
     * @param databaseName the databaseName
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder databaseName(String databaseName) {
      this.databaseName = databaseName;
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
     * Set the validateServerCertificate.
     *
     * @param validateServerCertificate the validateServerCertificate
     * @return the ValidateDatabaseBodyDatabaseDetails builder
     */
    public Builder validateServerCertificate(Boolean validateServerCertificate) {
      this.validateServerCertificate = validateServerCertificate;
      return this;
    }
  }

  protected ValidateDatabaseBodyDatabaseDetails() { }

  protected ValidateDatabaseBodyDatabaseDetails(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.hostname,
      "hostname cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.port,
      "port cannot be null");
    databaseName = builder.databaseName;
    hostname = builder.hostname;
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
   * @return a ValidateDatabaseBodyDatabaseDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseName.
   *
   * db name.
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

