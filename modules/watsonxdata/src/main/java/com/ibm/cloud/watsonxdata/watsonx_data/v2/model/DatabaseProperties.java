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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * database properties object.
 */
public class DatabaseProperties extends GenericModel {

  @SerializedName("authentication_value")
  protected String authenticationValue;
  protected String certificate;
  @SerializedName("certificate_extension")
  protected String certificateExtension;
  @SerializedName("connection_mode")
  protected String connectionMode;
  @SerializedName("connection_mode_value")
  protected String connectionModeValue;
  @SerializedName("database_id")
  protected String databaseId;
  @SerializedName("database_type")
  protected String databaseType;
  protected String hostname;
  @SerializedName("is_ssl")
  protected Boolean isSsl;
  protected String name;
  protected String password;
  protected Long port;
  @SerializedName("schema_name")
  protected String schemaName;
  protected String username;
  @SerializedName("warehouse_name")
  protected String warehouseName;

  protected DatabaseProperties() { }

  /**
   * Gets the authenticationValue.
   *
   * To send DB2 api key for test connection.
   *
   * @return the authenticationValue
   */
  public String getAuthenticationValue() {
    return authenticationValue;
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
   * Gets the databaseId.
   *
   * Database id.
   *
   * @return the databaseId
   */
  public String getDatabaseId() {
    return databaseId;
  }

  /**
   * Gets the databaseType.
   *
   * Type of db connection.
   *
   * @return the databaseType
   */
  public String getDatabaseType() {
    return databaseType;
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
   * Gets the isSsl.
   *
   * is ssl enabled for the database or not.
   *
   * @return the isSsl
   */
  public Boolean isIsSsl() {
    return isSsl;
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
   * Password.
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

