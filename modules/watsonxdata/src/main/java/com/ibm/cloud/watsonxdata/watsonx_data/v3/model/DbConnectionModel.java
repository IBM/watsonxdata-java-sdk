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
 * Database credentials model.
 */
public class DbConnectionModel extends GenericModel {

  @SerializedName("database_id")
  protected String databaseId;
  @SerializedName("db_type")
  protected String dbType;
  protected String host;
  protected String port;
  @SerializedName("db_name")
  protected String dbName;
  @SerializedName("db_username")
  protected String dbUsername;
  protected String password;
  @SerializedName("authentication_value")
  protected String authenticationValue;
  @SerializedName("is_ssl")
  protected Boolean isSsl;
  @SerializedName("cert_extension")
  protected String certExtension;
  @SerializedName("cert_content")
  protected String certContent;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("connection_mode_value")
  protected String connectionModeValue;
  @SerializedName("jdbc_url")
  protected String jdbcUrl;

  /**
   * Builder.
   */
  public static class Builder {
    private String databaseId;
    private String dbType;
    private String host;
    private String port;
    private String dbName;
    private String dbUsername;
    private String password;
    private String authenticationValue;
    private Boolean isSsl;
    private String certExtension;
    private String certContent;
    private String connectionMode;
    private String connectionModeValue;
    private String jdbcUrl;

    /**
     * Instantiates a new Builder from an existing DbConnectionModel instance.
     *
     * @param dbConnectionModel the instance to initialize the Builder with
     */
    private Builder(DbConnectionModel dbConnectionModel) {
      this.databaseId = dbConnectionModel.databaseId;
      this.dbType = dbConnectionModel.dbType;
      this.host = dbConnectionModel.host;
      this.port = dbConnectionModel.port;
      this.dbName = dbConnectionModel.dbName;
      this.dbUsername = dbConnectionModel.dbUsername;
      this.password = dbConnectionModel.password;
      this.authenticationValue = dbConnectionModel.authenticationValue;
      this.isSsl = dbConnectionModel.isSsl;
      this.certExtension = dbConnectionModel.certExtension;
      this.certContent = dbConnectionModel.certContent;
      this.connectionMode = dbConnectionModel.connectionMode;
      this.connectionModeValue = dbConnectionModel.connectionModeValue;
      this.jdbcUrl = dbConnectionModel.jdbcUrl;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DbConnectionModel.
     *
     * @return the new DbConnectionModel instance
     */
    public DbConnectionModel build() {
      return new DbConnectionModel(this);
    }

    /**
     * Set the databaseId.
     *
     * @param databaseId the databaseId
     * @return the DbConnectionModel builder
     */
    public Builder databaseId(String databaseId) {
      this.databaseId = databaseId;
      return this;
    }

    /**
     * Set the dbType.
     *
     * @param dbType the dbType
     * @return the DbConnectionModel builder
     */
    public Builder dbType(String dbType) {
      this.dbType = dbType;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the DbConnectionModel builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the DbConnectionModel builder
     */
    public Builder port(String port) {
      this.port = port;
      return this;
    }

    /**
     * Set the dbName.
     *
     * @param dbName the dbName
     * @return the DbConnectionModel builder
     */
    public Builder dbName(String dbName) {
      this.dbName = dbName;
      return this;
    }

    /**
     * Set the dbUsername.
     *
     * @param dbUsername the dbUsername
     * @return the DbConnectionModel builder
     */
    public Builder dbUsername(String dbUsername) {
      this.dbUsername = dbUsername;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DbConnectionModel builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the authenticationValue.
     *
     * @param authenticationValue the authenticationValue
     * @return the DbConnectionModel builder
     */
    public Builder authenticationValue(String authenticationValue) {
      this.authenticationValue = authenticationValue;
      return this;
    }

    /**
     * Set the isSsl.
     *
     * @param isSsl the isSsl
     * @return the DbConnectionModel builder
     */
    public Builder isSsl(Boolean isSsl) {
      this.isSsl = isSsl;
      return this;
    }

    /**
     * Set the certExtension.
     *
     * @param certExtension the certExtension
     * @return the DbConnectionModel builder
     */
    public Builder certExtension(String certExtension) {
      this.certExtension = certExtension;
      return this;
    }

    /**
     * Set the certContent.
     *
     * @param certContent the certContent
     * @return the DbConnectionModel builder
     */
    public Builder certContent(String certContent) {
      this.certContent = certContent;
      return this;
    }

    /**
     * Set the connectionMode.
     *
     * @param connectionMode the connectionMode
     * @return the DbConnectionModel builder
     */
    public Builder connectionMode(String connectionMode) {
      this.connectionMode = connectionMode;
      return this;
    }

    /**
     * Set the connectionModeValue.
     *
     * @param connectionModeValue the connectionModeValue
     * @return the DbConnectionModel builder
     */
    public Builder connectionModeValue(String connectionModeValue) {
      this.connectionModeValue = connectionModeValue;
      return this;
    }

    /**
     * Set the jdbcUrl.
     *
     * @param jdbcUrl the jdbcUrl
     * @return the DbConnectionModel builder
     */
    public Builder jdbcUrl(String jdbcUrl) {
      this.jdbcUrl = jdbcUrl;
      return this;
    }
  }

  protected DbConnectionModel() { }

  protected DbConnectionModel(Builder builder) {
    databaseId = builder.databaseId;
    dbType = builder.dbType;
    host = builder.host;
    port = builder.port;
    dbName = builder.dbName;
    dbUsername = builder.dbUsername;
    password = builder.password;
    authenticationValue = builder.authenticationValue;
    isSsl = builder.isSsl;
    certExtension = builder.certExtension;
    certContent = builder.certContent;
    connectionMode = builder.connectionMode;
    connectionModeValue = builder.connectionModeValue;
    jdbcUrl = builder.jdbcUrl;
  }

  /**
   * New builder.
   *
   * @return a DbConnectionModel builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseId.
   *
   * ID of database.
   *
   * @return the databaseId
   */
  public String databaseId() {
    return databaseId;
  }

  /**
   * Gets the dbType.
   *
   * Type of DB.
   *
   * @return the dbType
   */
  public String dbType() {
    return dbType;
  }

  /**
   * Gets the host.
   *
   * DB host.
   *
   * @return the host
   */
  public String host() {
    return host;
  }

  /**
   * Gets the port.
   *
   * DB connection port.
   *
   * @return the port
   */
  public String port() {
    return port;
  }

  /**
   * Gets the dbName.
   *
   * Name of DB.
   *
   * @return the dbName
   */
  public String dbName() {
    return dbName;
  }

  /**
   * Gets the dbUsername.
   *
   * DB username.
   *
   * @return the dbUsername
   */
  public String dbUsername() {
    return dbUsername;
  }

  /**
   * Gets the password.
   *
   * DB user password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the authenticationValue.
   *
   * Authentication value.
   *
   * @return the authenticationValue
   */
  public String authenticationValue() {
    return authenticationValue;
  }

  /**
   * Gets the isSsl.
   *
   * Indication whether connection is SSL.
   *
   * @return the isSsl
   */
  public Boolean isSsl() {
    return isSsl;
  }

  /**
   * Gets the certExtension.
   *
   * Location of certificate.
   *
   * @return the certExtension
   */
  public String certExtension() {
    return certExtension;
  }

  /**
   * Gets the certContent.
   *
   * Content of certificate.
   *
   * @return the certContent
   */
  public String certContent() {
    return certContent;
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
   * Value of connection mode.
   *
   * @return the connectionModeValue
   */
  public String connectionModeValue() {
    return connectionModeValue;
  }

  /**
   * Gets the jdbcUrl.
   *
   * JDBC URL.
   *
   * @return the jdbcUrl
   */
  public String jdbcUrl() {
    return jdbcUrl;
  }
}

