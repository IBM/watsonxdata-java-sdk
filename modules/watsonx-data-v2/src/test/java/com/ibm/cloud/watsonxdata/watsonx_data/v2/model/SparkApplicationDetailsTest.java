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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetailsConf;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkApplicationDetails model.
 */
public class SparkApplicationDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkApplicationDetails() throws Throwable {
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

    SparkApplicationDetails sparkApplicationDetailsModel = new SparkApplicationDetails.Builder()
      .application("s3://mybucket/wordcount.py")
      .arguments(java.util.Arrays.asList("people.txt"))
      .conf(sparkApplicationDetailsConfModel)
      .env(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .name("SparkApplicaton1")
      .build();
    assertEquals(sparkApplicationDetailsModel.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModel.arguments(), java.util.Arrays.asList("people.txt"));
    assertEquals(sparkApplicationDetailsModel.conf(), sparkApplicationDetailsConfModel);
    assertEquals(sparkApplicationDetailsModel.env(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(sparkApplicationDetailsModel.name(), "SparkApplicaton1");

    String json = TestUtilities.serialize(sparkApplicationDetailsModel);

    SparkApplicationDetails sparkApplicationDetailsModelNew = TestUtilities.deserialize(json, SparkApplicationDetails.class);
    assertTrue(sparkApplicationDetailsModelNew instanceof SparkApplicationDetails);
    assertEquals(sparkApplicationDetailsModelNew.application(), "s3://mybucket/wordcount.py");
    assertEquals(sparkApplicationDetailsModelNew.conf().toString(), sparkApplicationDetailsConfModel.toString());
    assertEquals(sparkApplicationDetailsModelNew.env().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(sparkApplicationDetailsModelNew.name(), "SparkApplicaton1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSparkApplicationDetailsError() throws Throwable {
    new SparkApplicationDetails.Builder().build();
  }

}