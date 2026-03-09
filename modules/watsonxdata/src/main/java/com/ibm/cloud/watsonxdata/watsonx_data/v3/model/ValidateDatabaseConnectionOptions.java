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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The validateDatabaseConnection options.
 */
public class ValidateDatabaseConnectionOptions extends GenericModel {

  /**
   * Type of db connection.
   */
  public interface Type {
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
    /** singlestore. */
    String SINGLESTORE = "singlestore";
    /** oracle. */
    String ORACLE = "oracle";
    /** redshift. */
    String REDSHIFT = "redshift";
    /** elasticsearch. */
    String ELASTICSEARCH = "elasticsearch";
    /** derby. */
    String DERBY = "derby";
    /** salesforce. */
    String SALESFORCE = "salesforce";
    /** greenplum. */
    String GREENPLUM = "greenplum";
    /** mariadb. */
    String MARIADB = "mariadb";
    /** snowflake. */
    String SNOWFLAKE = "snowflake";
    /** informix. */
    String INFORMIX = "informix";
    /** teradata. */
    String TERADATA = "teradata";
    /** clickhouse. */
    String CLICKHOUSE = "clickhouse";
    /** druid. */
    String DRUID = "druid";
    /** redis. */
    String REDIS = "redis";
    /** pinot. */
    String PINOT = "pinot";
    /** cassandra. */
    String CASSANDRA = "cassandra";
    /** prometheus. */
    String PROMETHEUS = "prometheus";
    /** dvm. */
    String DVM = "dvm";
    /** bigquery. */
    String BIGQUERY = "bigquery";
    /** hana. */
    String HANA = "hana";
    /** phoenix. */
    String PHOENIX = "phoenix";
    /** db2fori. */
    String DB2FORI = "db2fori";
    /** db2zos. */
    String DB2ZOS = "db2zos";
  }

  protected String type;
  protected String certificate;
  protected String certificateExtension;
  protected ValidateDatabaseBodyDatabaseDetails connection;
  protected String id;
  protected String sourceAssetId;
  protected String sourceCatalogId;
  protected String sourceProjectId;
  protected String targetCatalogId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String certificate;
    private String certificateExtension;
    private ValidateDatabaseBodyDatabaseDetails connection;
    private String id;
    private String sourceAssetId;
    private String sourceCatalogId;
    private String sourceProjectId;
    private String targetCatalogId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ValidateDatabaseConnectionOptions instance.
     *
     * @param validateDatabaseConnectionOptions the instance to initialize the Builder with
     */
    private Builder(ValidateDatabaseConnectionOptions validateDatabaseConnectionOptions) {
      this.type = validateDatabaseConnectionOptions.type;
      this.certificate = validateDatabaseConnectionOptions.certificate;
      this.certificateExtension = validateDatabaseConnectionOptions.certificateExtension;
      this.connection = validateDatabaseConnectionOptions.connection;
      this.id = validateDatabaseConnectionOptions.id;
      this.sourceAssetId = validateDatabaseConnectionOptions.sourceAssetId;
      this.sourceCatalogId = validateDatabaseConnectionOptions.sourceCatalogId;
      this.sourceProjectId = validateDatabaseConnectionOptions.sourceProjectId;
      this.targetCatalogId = validateDatabaseConnectionOptions.targetCatalogId;
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
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
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
     * Set the type.
     *
     * @param type the type
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder type(String type) {
      this.type = type;
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
     * Set the certificateExtension.
     *
     * @param certificateExtension the certificateExtension
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder certificateExtension(String certificateExtension) {
      this.certificateExtension = certificateExtension;
      return this;
    }

    /**
     * Set the connection.
     *
     * @param connection the connection
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder connection(ValidateDatabaseBodyDatabaseDetails connection) {
      this.connection = connection;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the sourceAssetId.
     *
     * @param sourceAssetId the sourceAssetId
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder sourceAssetId(String sourceAssetId) {
      this.sourceAssetId = sourceAssetId;
      return this;
    }

    /**
     * Set the sourceCatalogId.
     *
     * @param sourceCatalogId the sourceCatalogId
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder sourceCatalogId(String sourceCatalogId) {
      this.sourceCatalogId = sourceCatalogId;
      return this;
    }

    /**
     * Set the sourceProjectId.
     *
     * @param sourceProjectId the sourceProjectId
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder sourceProjectId(String sourceProjectId) {
      this.sourceProjectId = sourceProjectId;
      return this;
    }

    /**
     * Set the targetCatalogId.
     *
     * @param targetCatalogId the targetCatalogId
     * @return the ValidateDatabaseConnectionOptions builder
     */
    public Builder targetCatalogId(String targetCatalogId) {
      this.targetCatalogId = targetCatalogId;
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
    certificate = builder.certificate;
    certificateExtension = builder.certificateExtension;
    connection = builder.connection;
    id = builder.id;
    sourceAssetId = builder.sourceAssetId;
    sourceCatalogId = builder.sourceCatalogId;
    sourceProjectId = builder.sourceProjectId;
    targetCatalogId = builder.targetCatalogId;
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
   * Gets the type.
   *
   * Type of db connection.
   *
   * @return the type
   */
  public String type() {
    return type;
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
   * Gets the connection.
   *
   * database details.
   *
   * @return the connection
   */
  public ValidateDatabaseBodyDatabaseDetails connection() {
    return connection;
  }

  /**
   * Gets the id.
   *
   * db ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the sourceAssetId.
   *
   * Source connection assset Id from platform.
   *
   * @return the sourceAssetId
   */
  public String sourceAssetId() {
    return sourceAssetId;
  }

  /**
   * Gets the sourceCatalogId.
   *
   * Source catalog Id from platform.
   *
   * @return the sourceCatalogId
   */
  public String sourceCatalogId() {
    return sourceCatalogId;
  }

  /**
   * Gets the sourceProjectId.
   *
   * Source project Id from platform.
   *
   * @return the sourceProjectId
   */
  public String sourceProjectId() {
    return sourceProjectId;
  }

  /**
   * Gets the targetCatalogId.
   *
   * Target catalog id in the platform to save the database connection.
   *
   * @return the targetCatalogId
   */
  public String targetCatalogId() {
    return targetCatalogId;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

