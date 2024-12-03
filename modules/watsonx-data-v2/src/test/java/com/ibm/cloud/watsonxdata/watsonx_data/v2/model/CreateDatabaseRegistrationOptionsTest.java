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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDatabaseRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DatabaseRegistrationPrototypeDatabasePropertiesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDatabaseRegistrationOptions model.
 */
public class CreateDatabaseRegistrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDatabaseRegistrationOptions() throws Throwable {
    DatabaseCatalog databaseCatalogModel = new DatabaseCatalog.Builder()
      .catalogName("sampleCatalog")
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .catalogType("iceberg")
      .build();
    assertEquals(databaseCatalogModel.catalogName(), "sampleCatalog");
    assertEquals(databaseCatalogModel.catalogTags(), java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"));
    assertEquals(databaseCatalogModel.catalogType(), "iceberg");

    DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel = new DatabaseRegistrationPatchDatabaseDetailsDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.encrypt(), Boolean.valueOf(true));
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.key(), "abc");
    assertEquals(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel.value(), "xyz");

    DatabaseDetails databaseDetailsModel = new DatabaseDetails.Builder()
      .authenticationType("LDAP")
      .authenticationValue("LDAP")
      .brokerAuthenticationPassword("samplepassword")
      .brokerAuthenticationType("PASSWORD")
      .brokerAuthenticationUser("sampleuser")
      .brokerHost("samplehost")
      .brokerPort(Long.valueOf("4553"))
      .certificate("contents of a pem/crt file")
      .certificateExtension("pem/crt")
      .connectionMethod("basic, apikey")
      .connectionMode("service_name")
      .connectionModeValue("orclpdb")
      .connectionType("JDBC, Arrow flight")
      .controllerAuthenticationPassword("samplepassword")
      .controllerAuthenticationType("PASSWORD")
      .controllerAuthenticationUser("sampleuser")
      .coordinatorHost("samplehost")
      .coordinatorPort(Long.valueOf("4553"))
      .cpdHostname("samplecpdhostname")
      .credentialsKey("eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......")
      .databaseName("new_database")
      .databaseProperties(java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel))
      .hostname("db2@<hostname>.com")
      .hostnameInCertificate("samplehostname")
      .hosts("abc.com:1234,xyz.com:4321")
      .informixServer("ol_informix1410")
      .password("samplepassword")
      .port(Long.valueOf("4553"))
      .projectId("conops-bigquery")
      .sasl(true)
      .saslMechanism("plain")
      .schemaName("sampleSchema")
      .schemas("redis__name")
      .serviceApiKey("sampleapikey")
      .serviceHostname("api.dataplatform.dev.cloud.ibm.com")
      .servicePassword("samplepassword")
      .servicePort(Long.valueOf("443"))
      .serviceSsl(true)
      .serviceTokenUrl("sampletoakenurl")
      .serviceUsername("sampleusername")
      .ssl(true)
      .tables("kafka_table_name, redis_table_name")
      .username("sampleuser")
      .validateServerCertificate(true)
      .verifyHostName(true)
      .warehouseName("samplewrehouse")
      .build();
    assertEquals(databaseDetailsModel.authenticationType(), "LDAP");
    assertEquals(databaseDetailsModel.authenticationValue(), "LDAP");
    assertEquals(databaseDetailsModel.brokerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsModel.brokerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsModel.brokerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsModel.brokerHost(), "samplehost");
    assertEquals(databaseDetailsModel.brokerPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.certificate(), "contents of a pem/crt file");
    assertEquals(databaseDetailsModel.certificateExtension(), "pem/crt");
    assertEquals(databaseDetailsModel.connectionMethod(), "basic, apikey");
    assertEquals(databaseDetailsModel.connectionMode(), "service_name");
    assertEquals(databaseDetailsModel.connectionModeValue(), "orclpdb");
    assertEquals(databaseDetailsModel.connectionType(), "JDBC, Arrow flight");
    assertEquals(databaseDetailsModel.controllerAuthenticationPassword(), "samplepassword");
    assertEquals(databaseDetailsModel.controllerAuthenticationType(), "PASSWORD");
    assertEquals(databaseDetailsModel.controllerAuthenticationUser(), "sampleuser");
    assertEquals(databaseDetailsModel.coordinatorHost(), "samplehost");
    assertEquals(databaseDetailsModel.coordinatorPort(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.cpdHostname(), "samplecpdhostname");
    assertEquals(databaseDetailsModel.credentialsKey(), "eyJ0eXBlIjoic2VydmljZV9hY2NvdW50IiwicHJvamVjdF9pZCI6ImNvbm9wcy1iaWdxdWVyeSIsInByaXZhdGVfa2V5X2lkIjoiMGY3......");
    assertEquals(databaseDetailsModel.databaseName(), "new_database");
    assertEquals(databaseDetailsModel.databaseProperties(), java.util.Arrays.asList(databaseRegistrationPatchDatabaseDetailsDatabasePropertiesItemsModel));
    assertEquals(databaseDetailsModel.hostname(), "db2@<hostname>.com");
    assertEquals(databaseDetailsModel.hostnameInCertificate(), "samplehostname");
    assertEquals(databaseDetailsModel.hosts(), "abc.com:1234,xyz.com:4321");
    assertEquals(databaseDetailsModel.informixServer(), "ol_informix1410");
    assertEquals(databaseDetailsModel.password(), "samplepassword");
    assertEquals(databaseDetailsModel.port(), Long.valueOf("4553"));
    assertEquals(databaseDetailsModel.projectId(), "conops-bigquery");
    assertEquals(databaseDetailsModel.sasl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.saslMechanism(), "plain");
    assertEquals(databaseDetailsModel.schemaName(), "sampleSchema");
    assertEquals(databaseDetailsModel.schemas(), "redis__name");
    assertEquals(databaseDetailsModel.serviceApiKey(), "sampleapikey");
    assertEquals(databaseDetailsModel.serviceHostname(), "api.dataplatform.dev.cloud.ibm.com");
    assertEquals(databaseDetailsModel.servicePassword(), "samplepassword");
    assertEquals(databaseDetailsModel.servicePort(), Long.valueOf("443"));
    assertEquals(databaseDetailsModel.serviceSsl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.serviceTokenUrl(), "sampletoakenurl");
    assertEquals(databaseDetailsModel.serviceUsername(), "sampleusername");
    assertEquals(databaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.tables(), "kafka_table_name, redis_table_name");
    assertEquals(databaseDetailsModel.username(), "sampleuser");
    assertEquals(databaseDetailsModel.validateServerCertificate(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.verifyHostName(), Boolean.valueOf(true));
    assertEquals(databaseDetailsModel.warehouseName(), "samplewrehouse");

    DatabaseRegistrationPrototypeDatabasePropertiesItems databaseRegistrationPrototypeDatabasePropertiesItemsModel = new DatabaseRegistrationPrototypeDatabasePropertiesItems.Builder()
      .encrypt(true)
      .key("abc")
      .value("xyz")
      .build();
    assertEquals(databaseRegistrationPrototypeDatabasePropertiesItemsModel.encrypt(), Boolean.valueOf(true));
    assertEquals(databaseRegistrationPrototypeDatabasePropertiesItemsModel.key(), "abc");
    assertEquals(databaseRegistrationPrototypeDatabasePropertiesItemsModel.value(), "xyz");

    CreateDatabaseRegistrationOptions createDatabaseRegistrationOptionsModel = new CreateDatabaseRegistrationOptions.Builder()
      .databaseDisplayName("new_database")
      .databaseType("db2")
      .associatedCatalog(databaseCatalogModel)
      .createdOn("1686792721")
      .databaseDetails(databaseDetailsModel)
      .databaseProperties(java.util.Arrays.asList(databaseRegistrationPrototypeDatabasePropertiesItemsModel))
      .description("db2 extenal database description")
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .authInstanceId("testString")
      .build();
    assertEquals(createDatabaseRegistrationOptionsModel.databaseDisplayName(), "new_database");
    assertEquals(createDatabaseRegistrationOptionsModel.databaseType(), "db2");
    assertEquals(createDatabaseRegistrationOptionsModel.associatedCatalog(), databaseCatalogModel);
    assertEquals(createDatabaseRegistrationOptionsModel.createdOn(), "1686792721");
    assertEquals(createDatabaseRegistrationOptionsModel.databaseDetails(), databaseDetailsModel);
    assertEquals(createDatabaseRegistrationOptionsModel.databaseProperties(), java.util.Arrays.asList(databaseRegistrationPrototypeDatabasePropertiesItemsModel));
    assertEquals(createDatabaseRegistrationOptionsModel.description(), "db2 extenal database description");
    assertEquals(createDatabaseRegistrationOptionsModel.tags(), java.util.Arrays.asList("testdatabase", "userdatabase"));
    assertEquals(createDatabaseRegistrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatabaseRegistrationOptionsError() throws Throwable {
    new CreateDatabaseRegistrationOptions.Builder().build();
  }

}