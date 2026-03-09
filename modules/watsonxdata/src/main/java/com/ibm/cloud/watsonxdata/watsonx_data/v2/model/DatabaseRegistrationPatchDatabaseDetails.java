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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Database details update. Only credentials can be updated.
 */
public class DatabaseRegistrationPatchDatabaseDetails extends GenericModel {

  @SerializedName("authentication_value")
  protected String authenticationValue;
  @SerializedName("broker_authentication_password")
  protected String brokerAuthenticationPassword;
  @SerializedName("broker_authentication_type")
  protected String brokerAuthenticationType;
  @SerializedName("broker_authentication_user")
  protected String brokerAuthenticationUser;
  @SerializedName("controller_authentication_password")
  protected String controllerAuthenticationPassword;
  @SerializedName("controller_authentication_type")
  protected String controllerAuthenticationType;
  @SerializedName("controller_authentication_user")
  protected String controllerAuthenticationUser;
  @SerializedName("credentials_key")
  protected String credentialsKey;
  protected String password;
  @SerializedName("properties")
  protected List<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems> xProperties;
  protected String username;

  /**
   * Builder.
   */
  public static class Builder {
    private String authenticationValue;
    private String brokerAuthenticationPassword;
    private String brokerAuthenticationType;
    private String brokerAuthenticationUser;
    private String controllerAuthenticationPassword;
    private String controllerAuthenticationType;
    private String controllerAuthenticationUser;
    private String credentialsKey;
    private String password;
    private List<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems> xProperties;
    private String username;

    /**
     * Instantiates a new Builder from an existing DatabaseRegistrationPatchDatabaseDetails instance.
     *
     * @param databaseRegistrationPatchDatabaseDetails the instance to initialize the Builder with
     */
    private Builder(DatabaseRegistrationPatchDatabaseDetails databaseRegistrationPatchDatabaseDetails) {
      this.authenticationValue = databaseRegistrationPatchDatabaseDetails.authenticationValue;
      this.brokerAuthenticationPassword = databaseRegistrationPatchDatabaseDetails.brokerAuthenticationPassword;
      this.brokerAuthenticationType = databaseRegistrationPatchDatabaseDetails.brokerAuthenticationType;
      this.brokerAuthenticationUser = databaseRegistrationPatchDatabaseDetails.brokerAuthenticationUser;
      this.controllerAuthenticationPassword = databaseRegistrationPatchDatabaseDetails.controllerAuthenticationPassword;
      this.controllerAuthenticationType = databaseRegistrationPatchDatabaseDetails.controllerAuthenticationType;
      this.controllerAuthenticationUser = databaseRegistrationPatchDatabaseDetails.controllerAuthenticationUser;
      this.credentialsKey = databaseRegistrationPatchDatabaseDetails.credentialsKey;
      this.password = databaseRegistrationPatchDatabaseDetails.password;
      this.xProperties = databaseRegistrationPatchDatabaseDetails.xProperties;
      this.username = databaseRegistrationPatchDatabaseDetails.username;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DatabaseRegistrationPatchDatabaseDetails.
     *
     * @return the new DatabaseRegistrationPatchDatabaseDetails instance
     */
    public DatabaseRegistrationPatchDatabaseDetails build() {
      return new DatabaseRegistrationPatchDatabaseDetails(this);
    }

    /**
     * Adds a new element to xProperties.
     *
     * @param xProperties the new element to be added
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder addXProperties(DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems xProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xProperties,
        "xProperties cannot be null");
      if (this.xProperties == null) {
        this.xProperties = new ArrayList<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems>();
      }
      this.xProperties.add(xProperties);
      return this;
    }

    /**
     * Set the authenticationValue.
     *
     * @param authenticationValue the authenticationValue
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder authenticationValue(String authenticationValue) {
      this.authenticationValue = authenticationValue;
      return this;
    }

    /**
     * Set the brokerAuthenticationPassword.
     *
     * @param brokerAuthenticationPassword the brokerAuthenticationPassword
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder brokerAuthenticationPassword(String brokerAuthenticationPassword) {
      this.brokerAuthenticationPassword = brokerAuthenticationPassword;
      return this;
    }

    /**
     * Set the brokerAuthenticationType.
     *
     * @param brokerAuthenticationType the brokerAuthenticationType
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder brokerAuthenticationType(String brokerAuthenticationType) {
      this.brokerAuthenticationType = brokerAuthenticationType;
      return this;
    }

    /**
     * Set the brokerAuthenticationUser.
     *
     * @param brokerAuthenticationUser the brokerAuthenticationUser
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder brokerAuthenticationUser(String brokerAuthenticationUser) {
      this.brokerAuthenticationUser = brokerAuthenticationUser;
      return this;
    }

    /**
     * Set the controllerAuthenticationPassword.
     *
     * @param controllerAuthenticationPassword the controllerAuthenticationPassword
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder controllerAuthenticationPassword(String controllerAuthenticationPassword) {
      this.controllerAuthenticationPassword = controllerAuthenticationPassword;
      return this;
    }

    /**
     * Set the controllerAuthenticationType.
     *
     * @param controllerAuthenticationType the controllerAuthenticationType
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder controllerAuthenticationType(String controllerAuthenticationType) {
      this.controllerAuthenticationType = controllerAuthenticationType;
      return this;
    }

    /**
     * Set the controllerAuthenticationUser.
     *
     * @param controllerAuthenticationUser the controllerAuthenticationUser
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder controllerAuthenticationUser(String controllerAuthenticationUser) {
      this.controllerAuthenticationUser = controllerAuthenticationUser;
      return this;
    }

    /**
     * Set the credentialsKey.
     *
     * @param credentialsKey the credentialsKey
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder credentialsKey(String credentialsKey) {
      this.credentialsKey = credentialsKey;
      return this;
    }

    /**
     * Set the password.
     *
     * @param password the password
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Set the xProperties.
     * Existing xProperties will be replaced.
     *
     * @param xProperties the xProperties
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder xProperties(List<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems> xProperties) {
      this.xProperties = xProperties;
      return this;
    }

    /**
     * Set the username.
     *
     * @param username the username
     * @return the DatabaseRegistrationPatchDatabaseDetails builder
     */
    public Builder username(String username) {
      this.username = username;
      return this;
    }
  }

  protected DatabaseRegistrationPatchDatabaseDetails() { }

  protected DatabaseRegistrationPatchDatabaseDetails(Builder builder) {
    authenticationValue = builder.authenticationValue;
    brokerAuthenticationPassword = builder.brokerAuthenticationPassword;
    brokerAuthenticationType = builder.brokerAuthenticationType;
    brokerAuthenticationUser = builder.brokerAuthenticationUser;
    controllerAuthenticationPassword = builder.controllerAuthenticationPassword;
    controllerAuthenticationType = builder.controllerAuthenticationType;
    controllerAuthenticationUser = builder.controllerAuthenticationUser;
    credentialsKey = builder.credentialsKey;
    password = builder.password;
    xProperties = builder.xProperties;
    username = builder.username;
  }

  /**
   * New builder.
   *
   * @return a DatabaseRegistrationPatchDatabaseDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authenticationValue.
   *
   * Authentication method.
   *
   * @return the authenticationValue
   */
  public String authenticationValue() {
    return authenticationValue;
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
   * Gets the password.
   *
   * New password.
   *
   * @return the password
   */
  public String password() {
    return password;
  }

  /**
   * Gets the xProperties.
   *
   * This will hold all the properties for a custom database.
   *
   * @return the xProperties
   */
  public List<DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems> xProperties() {
    return xProperties;
  }

  /**
   * Gets the username.
   *
   * New username.
   *
   * @return the username
   */
  public String username() {
    return username;
  }
}

