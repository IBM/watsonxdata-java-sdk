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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetailsConf;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkApplicationDetailsConf model.
 */
public class SparkApplicationDetailsConfTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkApplicationDetailsConf() throws Throwable {
    SparkApplicationDetailsConf sparkApplicationDetailsConfModel = new SparkApplicationDetailsConf.Builder()
      .sparkAppName("MyJob")
      .sparkHiveMetastoreClientAuthMode("PLAIN")
      .sparkHiveMetastoreClientPlainPassword("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9...")
      .sparkHiveMetastoreClientPlainUsername("ibm_lh_token_admin")
      .sparkHiveMetastoreTruststorePassword("changeit")
      .sparkHiveMetastoreTruststorePath("file:///opt/ibm/jdk/lib/security/cacerts")
      .sparkHiveMetastoreTruststoreType("JKS")
      .sparkHiveMetastoreUseSsl("true")
      .sparkSqlCatalogImplementation("Spark Catalog Implementation")
      .sparkSqlCatalogLakehouse("org.apache.iceberg.spark.SparkCatalog")
      .sparkSqlCatalogLakehouseType("Spark Catalog Type")
      .sparkSqlCatalogLakehouseUri("Spark Catalog URI")
      .sparkSqlExtensions("org.apache.iceberg.spark.extensions.IcebergSparkSessionExtensions")
      .sparkSqlIcebergVectorizationEnabled("false")
      .build();
    assertEquals(sparkApplicationDetailsConfModel.sparkAppName(), "MyJob");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreClientAuthMode(), "PLAIN");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreClientPlainPassword(), "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9...");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreClientPlainUsername(), "ibm_lh_token_admin");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreTruststorePassword(), "changeit");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreTruststorePath(), "file:///opt/ibm/jdk/lib/security/cacerts");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreTruststoreType(), "JKS");
    assertEquals(sparkApplicationDetailsConfModel.sparkHiveMetastoreUseSsl(), "true");
    assertEquals(sparkApplicationDetailsConfModel.sparkSqlCatalogImplementation(), "Spark Catalog Implementation");
    assertEquals(sparkApplicationDetailsConfModel.sparkSqlCatalogLakehouse(), "org.apache.iceberg.spark.SparkCatalog");
    assertEquals(sparkApplicationDetailsConfModel.sparkSqlCatalogLakehouseType(), "Spark Catalog Type");
    assertEquals(sparkApplicationDetailsConfModel.sparkSqlCatalogLakehouseUri(), "Spark Catalog URI");
    assertEquals(sparkApplicationDetailsConfModel.sparkSqlExtensions(), "org.apache.iceberg.spark.extensions.IcebergSparkSessionExtensions");
    assertEquals(sparkApplicationDetailsConfModel.sparkSqlIcebergVectorizationEnabled(), "false");

    String json = TestUtilities.serialize(sparkApplicationDetailsConfModel);

    SparkApplicationDetailsConf sparkApplicationDetailsConfModelNew = TestUtilities.deserialize(json, SparkApplicationDetailsConf.class);
    assertTrue(sparkApplicationDetailsConfModelNew instanceof SparkApplicationDetailsConf);
    assertEquals(sparkApplicationDetailsConfModelNew.sparkAppName(), "MyJob");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreClientAuthMode(), "PLAIN");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreClientPlainPassword(), "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9...");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreClientPlainUsername(), "ibm_lh_token_admin");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreTruststorePassword(), "changeit");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreTruststorePath(), "file:///opt/ibm/jdk/lib/security/cacerts");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreTruststoreType(), "JKS");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkHiveMetastoreUseSsl(), "true");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkSqlCatalogImplementation(), "Spark Catalog Implementation");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkSqlCatalogLakehouse(), "org.apache.iceberg.spark.SparkCatalog");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkSqlCatalogLakehouseType(), "Spark Catalog Type");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkSqlCatalogLakehouseUri(), "Spark Catalog URI");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkSqlExtensions(), "org.apache.iceberg.spark.extensions.IcebergSparkSessionExtensions");
    assertEquals(sparkApplicationDetailsConfModelNew.sparkSqlIcebergVectorizationEnabled(), "false");
  }
}