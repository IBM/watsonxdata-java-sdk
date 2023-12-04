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
 * Application.
 */
public class SparkEngineApplicationStatusApplicationDetailsConf extends GenericModel {

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

  protected SparkEngineApplicationStatusApplicationDetailsConf() { }

  /**
   * Gets the sparkAppName.
   *
   * Spark application name.
   *
   * @return the sparkAppName
   */
  public String getSparkAppName() {
    return sparkAppName;
  }

  /**
   * Gets the sparkHiveMetastoreClientAuthMode.
   *
   * Hive Metastore authentication mode.
   *
   * @return the sparkHiveMetastoreClientAuthMode
   */
  public String getSparkHiveMetastoreClientAuthMode() {
    return sparkHiveMetastoreClientAuthMode;
  }

  /**
   * Gets the sparkHiveMetastoreClientPlainPassword.
   *
   * Hive Metastore plain password.
   *
   * @return the sparkHiveMetastoreClientPlainPassword
   */
  public String getSparkHiveMetastoreClientPlainPassword() {
    return sparkHiveMetastoreClientPlainPassword;
  }

  /**
   * Gets the sparkHiveMetastoreClientPlainUsername.
   *
   * Hive Metastore plain username.
   *
   * @return the sparkHiveMetastoreClientPlainUsername
   */
  public String getSparkHiveMetastoreClientPlainUsername() {
    return sparkHiveMetastoreClientPlainUsername;
  }

  /**
   * Gets the sparkHiveMetastoreTruststorePassword.
   *
   * Truststore password.
   *
   * @return the sparkHiveMetastoreTruststorePassword
   */
  public String getSparkHiveMetastoreTruststorePassword() {
    return sparkHiveMetastoreTruststorePassword;
  }

  /**
   * Gets the sparkHiveMetastoreTruststorePath.
   *
   * Truststore path.
   *
   * @return the sparkHiveMetastoreTruststorePath
   */
  public String getSparkHiveMetastoreTruststorePath() {
    return sparkHiveMetastoreTruststorePath;
  }

  /**
   * Gets the sparkHiveMetastoreTruststoreType.
   *
   * Truststore type.
   *
   * @return the sparkHiveMetastoreTruststoreType
   */
  public String getSparkHiveMetastoreTruststoreType() {
    return sparkHiveMetastoreTruststoreType;
  }

  /**
   * Gets the sparkHiveMetastoreUseSsl.
   *
   * Enable or disable SSL for Hive Metastore.
   *
   * @return the sparkHiveMetastoreUseSsl
   */
  public String getSparkHiveMetastoreUseSsl() {
    return sparkHiveMetastoreUseSsl;
  }

  /**
   * Gets the sparkSqlCatalogImplementation.
   *
   * SQL catalog implementation.
   *
   * @return the sparkSqlCatalogImplementation
   */
  public String getSparkSqlCatalogImplementation() {
    return sparkSqlCatalogImplementation;
  }

  /**
   * Gets the sparkSqlCatalogLakehouse.
   *
   * Lakehouse catalog name.
   *
   * @return the sparkSqlCatalogLakehouse
   */
  public String getSparkSqlCatalogLakehouse() {
    return sparkSqlCatalogLakehouse;
  }

  /**
   * Gets the sparkSqlCatalogLakehouseType.
   *
   * Lakehouse catalog type.
   *
   * @return the sparkSqlCatalogLakehouseType
   */
  public String getSparkSqlCatalogLakehouseType() {
    return sparkSqlCatalogLakehouseType;
  }

  /**
   * Gets the sparkSqlCatalogLakehouseUri.
   *
   * Lakehouse catalog URI.
   *
   * @return the sparkSqlCatalogLakehouseUri
   */
  public String getSparkSqlCatalogLakehouseUri() {
    return sparkSqlCatalogLakehouseUri;
  }

  /**
   * Gets the sparkSqlExtensions.
   *
   * SQL extensions.
   *
   * @return the sparkSqlExtensions
   */
  public String getSparkSqlExtensions() {
    return sparkSqlExtensions;
  }

  /**
   * Gets the sparkSqlIcebergVectorizationEnabled.
   *
   * Enable or disable Iceberg vectorization.
   *
   * @return the sparkSqlIcebergVectorizationEnabled
   */
  public String getSparkSqlIcebergVectorizationEnabled() {
    return sparkSqlIcebergVectorizationEnabled;
  }
}

