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
 * Application.
 */
public class SparkApplicationDetailsConf extends GenericModel {

  @SerializedName("spark_app_name")
  protected String sparkAppName;
  @SerializedName("spark_hive_metastore_client_auth_mode")
  protected String sparkHiveMetastoreClientAuthMode;
  @SerializedName("spark_hive_metastore_client_plain_password")
  protected String sparkHiveMetastoreClientPlainPassword;
  @SerializedName("spark_hive_metastore_client_plain_username")
  protected String sparkHiveMetastoreClientPlainUsername;
  @SerializedName("spark_hive_metastore_truststore_password")
  protected String sparkHiveMetastoreTruststorePassword;
  @SerializedName("spark_hive_metastore_truststore_path")
  protected String sparkHiveMetastoreTruststorePath;
  @SerializedName("spark_hive_metastore_truststore_type")
  protected String sparkHiveMetastoreTruststoreType;
  @SerializedName("spark_hive_metastore_use_ssl")
  protected String sparkHiveMetastoreUseSsl;
  @SerializedName("spark_sql_catalog_implementation")
  protected String sparkSqlCatalogImplementation;
  @SerializedName("spark_sql_catalog_lakehouse")
  protected String sparkSqlCatalogLakehouse;
  @SerializedName("spark_sql_catalog_lakehouse_type")
  protected String sparkSqlCatalogLakehouseType;
  @SerializedName("spark_sql_catalog_lakehouse_uri")
  protected String sparkSqlCatalogLakehouseUri;
  @SerializedName("spark_sql_extensions")
  protected String sparkSqlExtensions;
  @SerializedName("spark_sql_iceberg_vectorization_enabled")
  protected String sparkSqlIcebergVectorizationEnabled;

  /**
   * Builder.
   */
  public static class Builder {
    private String sparkAppName;
    private String sparkHiveMetastoreClientAuthMode;
    private String sparkHiveMetastoreClientPlainPassword;
    private String sparkHiveMetastoreClientPlainUsername;
    private String sparkHiveMetastoreTruststorePassword;
    private String sparkHiveMetastoreTruststorePath;
    private String sparkHiveMetastoreTruststoreType;
    private String sparkHiveMetastoreUseSsl;
    private String sparkSqlCatalogImplementation;
    private String sparkSqlCatalogLakehouse;
    private String sparkSqlCatalogLakehouseType;
    private String sparkSqlCatalogLakehouseUri;
    private String sparkSqlExtensions;
    private String sparkSqlIcebergVectorizationEnabled;

    /**
     * Instantiates a new Builder from an existing SparkApplicationDetailsConf instance.
     *
     * @param sparkApplicationDetailsConf the instance to initialize the Builder with
     */
    private Builder(SparkApplicationDetailsConf sparkApplicationDetailsConf) {
      this.sparkAppName = sparkApplicationDetailsConf.sparkAppName;
      this.sparkHiveMetastoreClientAuthMode = sparkApplicationDetailsConf.sparkHiveMetastoreClientAuthMode;
      this.sparkHiveMetastoreClientPlainPassword = sparkApplicationDetailsConf.sparkHiveMetastoreClientPlainPassword;
      this.sparkHiveMetastoreClientPlainUsername = sparkApplicationDetailsConf.sparkHiveMetastoreClientPlainUsername;
      this.sparkHiveMetastoreTruststorePassword = sparkApplicationDetailsConf.sparkHiveMetastoreTruststorePassword;
      this.sparkHiveMetastoreTruststorePath = sparkApplicationDetailsConf.sparkHiveMetastoreTruststorePath;
      this.sparkHiveMetastoreTruststoreType = sparkApplicationDetailsConf.sparkHiveMetastoreTruststoreType;
      this.sparkHiveMetastoreUseSsl = sparkApplicationDetailsConf.sparkHiveMetastoreUseSsl;
      this.sparkSqlCatalogImplementation = sparkApplicationDetailsConf.sparkSqlCatalogImplementation;
      this.sparkSqlCatalogLakehouse = sparkApplicationDetailsConf.sparkSqlCatalogLakehouse;
      this.sparkSqlCatalogLakehouseType = sparkApplicationDetailsConf.sparkSqlCatalogLakehouseType;
      this.sparkSqlCatalogLakehouseUri = sparkApplicationDetailsConf.sparkSqlCatalogLakehouseUri;
      this.sparkSqlExtensions = sparkApplicationDetailsConf.sparkSqlExtensions;
      this.sparkSqlIcebergVectorizationEnabled = sparkApplicationDetailsConf.sparkSqlIcebergVectorizationEnabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkApplicationDetailsConf.
     *
     * @return the new SparkApplicationDetailsConf instance
     */
    public SparkApplicationDetailsConf build() {
      return new SparkApplicationDetailsConf(this);
    }

    /**
     * Set the sparkAppName.
     *
     * @param sparkAppName the sparkAppName
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkAppName(String sparkAppName) {
      this.sparkAppName = sparkAppName;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreClientAuthMode.
     *
     * @param sparkHiveMetastoreClientAuthMode the sparkHiveMetastoreClientAuthMode
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreClientAuthMode(String sparkHiveMetastoreClientAuthMode) {
      this.sparkHiveMetastoreClientAuthMode = sparkHiveMetastoreClientAuthMode;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreClientPlainPassword.
     *
     * @param sparkHiveMetastoreClientPlainPassword the sparkHiveMetastoreClientPlainPassword
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreClientPlainPassword(String sparkHiveMetastoreClientPlainPassword) {
      this.sparkHiveMetastoreClientPlainPassword = sparkHiveMetastoreClientPlainPassword;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreClientPlainUsername.
     *
     * @param sparkHiveMetastoreClientPlainUsername the sparkHiveMetastoreClientPlainUsername
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreClientPlainUsername(String sparkHiveMetastoreClientPlainUsername) {
      this.sparkHiveMetastoreClientPlainUsername = sparkHiveMetastoreClientPlainUsername;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreTruststorePassword.
     *
     * @param sparkHiveMetastoreTruststorePassword the sparkHiveMetastoreTruststorePassword
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreTruststorePassword(String sparkHiveMetastoreTruststorePassword) {
      this.sparkHiveMetastoreTruststorePassword = sparkHiveMetastoreTruststorePassword;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreTruststorePath.
     *
     * @param sparkHiveMetastoreTruststorePath the sparkHiveMetastoreTruststorePath
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreTruststorePath(String sparkHiveMetastoreTruststorePath) {
      this.sparkHiveMetastoreTruststorePath = sparkHiveMetastoreTruststorePath;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreTruststoreType.
     *
     * @param sparkHiveMetastoreTruststoreType the sparkHiveMetastoreTruststoreType
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreTruststoreType(String sparkHiveMetastoreTruststoreType) {
      this.sparkHiveMetastoreTruststoreType = sparkHiveMetastoreTruststoreType;
      return this;
    }

    /**
     * Set the sparkHiveMetastoreUseSsl.
     *
     * @param sparkHiveMetastoreUseSsl the sparkHiveMetastoreUseSsl
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkHiveMetastoreUseSsl(String sparkHiveMetastoreUseSsl) {
      this.sparkHiveMetastoreUseSsl = sparkHiveMetastoreUseSsl;
      return this;
    }

    /**
     * Set the sparkSqlCatalogImplementation.
     *
     * @param sparkSqlCatalogImplementation the sparkSqlCatalogImplementation
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkSqlCatalogImplementation(String sparkSqlCatalogImplementation) {
      this.sparkSqlCatalogImplementation = sparkSqlCatalogImplementation;
      return this;
    }

    /**
     * Set the sparkSqlCatalogLakehouse.
     *
     * @param sparkSqlCatalogLakehouse the sparkSqlCatalogLakehouse
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkSqlCatalogLakehouse(String sparkSqlCatalogLakehouse) {
      this.sparkSqlCatalogLakehouse = sparkSqlCatalogLakehouse;
      return this;
    }

    /**
     * Set the sparkSqlCatalogLakehouseType.
     *
     * @param sparkSqlCatalogLakehouseType the sparkSqlCatalogLakehouseType
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkSqlCatalogLakehouseType(String sparkSqlCatalogLakehouseType) {
      this.sparkSqlCatalogLakehouseType = sparkSqlCatalogLakehouseType;
      return this;
    }

    /**
     * Set the sparkSqlCatalogLakehouseUri.
     *
     * @param sparkSqlCatalogLakehouseUri the sparkSqlCatalogLakehouseUri
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkSqlCatalogLakehouseUri(String sparkSqlCatalogLakehouseUri) {
      this.sparkSqlCatalogLakehouseUri = sparkSqlCatalogLakehouseUri;
      return this;
    }

    /**
     * Set the sparkSqlExtensions.
     *
     * @param sparkSqlExtensions the sparkSqlExtensions
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkSqlExtensions(String sparkSqlExtensions) {
      this.sparkSqlExtensions = sparkSqlExtensions;
      return this;
    }

    /**
     * Set the sparkSqlIcebergVectorizationEnabled.
     *
     * @param sparkSqlIcebergVectorizationEnabled the sparkSqlIcebergVectorizationEnabled
     * @return the SparkApplicationDetailsConf builder
     */
    public Builder sparkSqlIcebergVectorizationEnabled(String sparkSqlIcebergVectorizationEnabled) {
      this.sparkSqlIcebergVectorizationEnabled = sparkSqlIcebergVectorizationEnabled;
      return this;
    }
  }

  protected SparkApplicationDetailsConf() { }

  protected SparkApplicationDetailsConf(Builder builder) {
    sparkAppName = builder.sparkAppName;
    sparkHiveMetastoreClientAuthMode = builder.sparkHiveMetastoreClientAuthMode;
    sparkHiveMetastoreClientPlainPassword = builder.sparkHiveMetastoreClientPlainPassword;
    sparkHiveMetastoreClientPlainUsername = builder.sparkHiveMetastoreClientPlainUsername;
    sparkHiveMetastoreTruststorePassword = builder.sparkHiveMetastoreTruststorePassword;
    sparkHiveMetastoreTruststorePath = builder.sparkHiveMetastoreTruststorePath;
    sparkHiveMetastoreTruststoreType = builder.sparkHiveMetastoreTruststoreType;
    sparkHiveMetastoreUseSsl = builder.sparkHiveMetastoreUseSsl;
    sparkSqlCatalogImplementation = builder.sparkSqlCatalogImplementation;
    sparkSqlCatalogLakehouse = builder.sparkSqlCatalogLakehouse;
    sparkSqlCatalogLakehouseType = builder.sparkSqlCatalogLakehouseType;
    sparkSqlCatalogLakehouseUri = builder.sparkSqlCatalogLakehouseUri;
    sparkSqlExtensions = builder.sparkSqlExtensions;
    sparkSqlIcebergVectorizationEnabled = builder.sparkSqlIcebergVectorizationEnabled;
  }

  /**
   * New builder.
   *
   * @return a SparkApplicationDetailsConf builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the sparkAppName.
   *
   * Spark application name.
   *
   * @return the sparkAppName
   */
  public String sparkAppName() {
    return sparkAppName;
  }

  /**
   * Gets the sparkHiveMetastoreClientAuthMode.
   *
   * Hive Metastore authentication mode.
   *
   * @return the sparkHiveMetastoreClientAuthMode
   */
  public String sparkHiveMetastoreClientAuthMode() {
    return sparkHiveMetastoreClientAuthMode;
  }

  /**
   * Gets the sparkHiveMetastoreClientPlainPassword.
   *
   * Hive Metastore plain password.
   *
   * @return the sparkHiveMetastoreClientPlainPassword
   */
  public String sparkHiveMetastoreClientPlainPassword() {
    return sparkHiveMetastoreClientPlainPassword;
  }

  /**
   * Gets the sparkHiveMetastoreClientPlainUsername.
   *
   * Hive Metastore plain username.
   *
   * @return the sparkHiveMetastoreClientPlainUsername
   */
  public String sparkHiveMetastoreClientPlainUsername() {
    return sparkHiveMetastoreClientPlainUsername;
  }

  /**
   * Gets the sparkHiveMetastoreTruststorePassword.
   *
   * Truststore password.
   *
   * @return the sparkHiveMetastoreTruststorePassword
   */
  public String sparkHiveMetastoreTruststorePassword() {
    return sparkHiveMetastoreTruststorePassword;
  }

  /**
   * Gets the sparkHiveMetastoreTruststorePath.
   *
   * Truststore path.
   *
   * @return the sparkHiveMetastoreTruststorePath
   */
  public String sparkHiveMetastoreTruststorePath() {
    return sparkHiveMetastoreTruststorePath;
  }

  /**
   * Gets the sparkHiveMetastoreTruststoreType.
   *
   * Truststore type.
   *
   * @return the sparkHiveMetastoreTruststoreType
   */
  public String sparkHiveMetastoreTruststoreType() {
    return sparkHiveMetastoreTruststoreType;
  }

  /**
   * Gets the sparkHiveMetastoreUseSsl.
   *
   * Enable or disable SSL for Hive Metastore.
   *
   * @return the sparkHiveMetastoreUseSsl
   */
  public String sparkHiveMetastoreUseSsl() {
    return sparkHiveMetastoreUseSsl;
  }

  /**
   * Gets the sparkSqlCatalogImplementation.
   *
   * SQL catalog implementation.
   *
   * @return the sparkSqlCatalogImplementation
   */
  public String sparkSqlCatalogImplementation() {
    return sparkSqlCatalogImplementation;
  }

  /**
   * Gets the sparkSqlCatalogLakehouse.
   *
   * Lakehouse catalog name.
   *
   * @return the sparkSqlCatalogLakehouse
   */
  public String sparkSqlCatalogLakehouse() {
    return sparkSqlCatalogLakehouse;
  }

  /**
   * Gets the sparkSqlCatalogLakehouseType.
   *
   * Lakehouse catalog type.
   *
   * @return the sparkSqlCatalogLakehouseType
   */
  public String sparkSqlCatalogLakehouseType() {
    return sparkSqlCatalogLakehouseType;
  }

  /**
   * Gets the sparkSqlCatalogLakehouseUri.
   *
   * Lakehouse catalog URI.
   *
   * @return the sparkSqlCatalogLakehouseUri
   */
  public String sparkSqlCatalogLakehouseUri() {
    return sparkSqlCatalogLakehouseUri;
  }

  /**
   * Gets the sparkSqlExtensions.
   *
   * SQL extensions.
   *
   * @return the sparkSqlExtensions
   */
  public String sparkSqlExtensions() {
    return sparkSqlExtensions;
  }

  /**
   * Gets the sparkSqlIcebergVectorizationEnabled.
   *
   * Enable or disable Iceberg vectorization.
   *
   * @return the sparkSqlIcebergVectorizationEnabled
   */
  public String sparkSqlIcebergVectorizationEnabled() {
    return sparkSqlIcebergVectorizationEnabled;
  }
}

