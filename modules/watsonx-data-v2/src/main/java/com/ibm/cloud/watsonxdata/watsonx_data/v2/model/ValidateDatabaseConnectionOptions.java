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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The validateDatabaseConnection options.
 */
public class ValidateDatabaseConnectionOptions extends GenericModel {

  /**
   * Type of db connection.
   */
  public interface DatabaseType {
    /** mysql. */
    String MYSQL = "mysql";
    /** postgresql. */
    String POSTGRESQL = "postgresql";
    /** netezza. */
    String NETEZZA = "netezza";
    /** db2. */
    String DB2 = "db2";
    /** mongodb. */
    String MONGODB = "mongodb";
    /** kafka. */
    String KAFKA = "kafka";
    /** sqlserver. */
    String SQLSERVER = "sqlserver";
    /** mycustomdb. */
    String MYCUSTOMDB = "mycustomdb";
  }

  protected ValidateDatabaseBodyDatabaseDetails databaseDetails;
  protected String databaseType;
  protected String certificate;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private ValidateDatabaseBodyDatabaseDetails databaseDetails;
    private String databaseType;
    private String certificate;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ValidateDatabaseConnectionOptions instance.
     *
     * @param validateDatabaseConnectionOptions the instance to initialize the Builder with
     */
    private Builder(ValidateDatabaseConnectionOptions validateDatabaseConnectionOptions) {
      this.databaseDetails = validateDatabaseConnectionOptions.databaseDetails;
      this.databaseType = validateDatabaseConnectionOptions.databaseType;
      this.certificate = validateDatabaseConnectionOptions.certificate;
      this.authInstanceId = validateDatabaseConnectionOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param databaseDetails the databaseDetails
     * @param databaseType the databaseType
     */
    public Builder(ValidateDatabaseBodyDatabaseDetails databaseDetails, String databaseType) {
      this.databaseDetails = databaseDetails;
      this.databaseType = databaseType;
    }

    /**
     * Builds a ValidateDatabaseConnectionOptions.
     *
     * @return the new ValidateDatabaseConnectionOptions instance
     */
    public ValidateDatabaseConnectionOptions build() {
      return new ValidateDatabaseConnectionOptions(this);
    }

    /**
     * Set the databaseDetails.
     *
     * @param databaseDetails the databaseDetails
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder databaseDetails(ValidateDatabaseBodyDatabaseDetails databaseDetails) {
      this.databaseDetails = databaseDetails;
      return this;
    }

    /**
     * Set the databaseType.
     *
     * @param databaseType the databaseType
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder databaseType(String databaseType) {
      this.databaseType = databaseType;
      return this;
    }

    /**
     * Set the certificate.
     *
     * @param certificate the certificate
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder certificate(String certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ValidateDatabaseConnectionOptions() { }

  protected ValidateDatabaseConnectionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseDetails,
      "databaseDetails cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.databaseType,
      "databaseType cannot be null");
    databaseDetails = builder.databaseDetails;
    databaseType = builder.databaseType;
    certificate = builder.certificate;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ValidateDatabaseConnectionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the databaseDetails.
   *
   * database details.
   *
   * @return the databaseDetails
   */
  public ValidateDatabaseBodyDatabaseDetails databaseDetails() {
    return databaseDetails;
  }

  /**
   * Gets the databaseType.
   *
   * Type of db connection.
   *
   * @return the databaseType
   */
  public String databaseType() {
    return databaseType;
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
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

