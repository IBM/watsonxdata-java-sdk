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
public class DatabaseRegistrationDatabaseDetails extends GenericModel {

  @SerializedName("database_name")
  protected String databaseName;
  protected String hostname;
  protected String password;
  protected Long port;
  protected Boolean sasl;
  protected Boolean ssl;
  protected String tables;
  protected String username;

  protected DatabaseRegistrationDatabaseDetails() { }

  /**
   * Gets the databaseName.
   *
   * Database name.
   *
   * @return the databaseName
   */
  public String getDatabaseName() {
    return databaseName;
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
   * Only for Kafka - Add kafka tables.
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
}

