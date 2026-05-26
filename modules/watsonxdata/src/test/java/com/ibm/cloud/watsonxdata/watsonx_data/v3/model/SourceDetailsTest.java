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

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.DbConnectionModel;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.FileFormatProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IcebergSourceTable;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaTransformation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SourceDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SourceDetails model.
 */
public class SourceDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSourceDetails() throws Throwable {
    SchemaTransformation schemaTransformationModel = new SchemaTransformation.Builder()
      .oldColumn("old_column_name")
      .newColumn("new_column_name")
      .newType("string")
      .build();
    assertEquals(schemaTransformationModel.oldColumn(), "old_column_name");
    assertEquals(schemaTransformationModel.newColumn(), "new_column_name");
    assertEquals(schemaTransformationModel.newType(), "string");

    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("testString")
      .accountName("testString")
      .applicationId("testString")
      .containerName("testString")
      .directoryId("testString")
      .endpoint("testString")
      .region("testString")
      .secretKey("testString")
      .authMode("aws_assume_role")
      .roleArn("testString")
      .managedBy("testString")
      .name("testString")
      .type("adls_gen1")
      .build();
    assertEquals(bucketDetailsModel.accessKey(), "testString");
    assertEquals(bucketDetailsModel.accountName(), "testString");
    assertEquals(bucketDetailsModel.applicationId(), "testString");
    assertEquals(bucketDetailsModel.containerName(), "testString");
    assertEquals(bucketDetailsModel.directoryId(), "testString");
    assertEquals(bucketDetailsModel.endpoint(), "testString");
    assertEquals(bucketDetailsModel.region(), "testString");
    assertEquals(bucketDetailsModel.secretKey(), "testString");
    assertEquals(bucketDetailsModel.authMode(), "aws_assume_role");
    assertEquals(bucketDetailsModel.roleArn(), "testString");
    assertEquals(bucketDetailsModel.managedBy(), "testString");
    assertEquals(bucketDetailsModel.name(), "testString");
    assertEquals(bucketDetailsModel.type(), "adls_gen1");

    IcebergSourceTable icebergSourceTableModel = new IcebergSourceTable.Builder()
      .schemaName("testString")
      .tableName("testString")
      .catalogName("testString")
      .warehouseName("testString")
      .snapshotId(Long.valueOf("0"))
      .build();
    assertEquals(icebergSourceTableModel.schemaName(), "testString");
    assertEquals(icebergSourceTableModel.tableName(), "testString");
    assertEquals(icebergSourceTableModel.catalogName(), "testString");
    assertEquals(icebergSourceTableModel.warehouseName(), "testString");
    assertEquals(icebergSourceTableModel.snapshotId(), Long.valueOf("0"));

    DbConnectionModel dbConnectionModelModel = new DbConnectionModel.Builder()
      .databaseId("testString")
      .dbType("testString")
      .host("testString")
      .port("testString")
      .dbName("testString")
      .dbUsername("testString")
      .password("testString")
      .authenticationValue("testString")
      .isSsl(false)
      .certExtension("testString")
      .certContent("testString")
      .connectionMode("testString")
      .connectionModeValue("testString")
      .jdbcUrl("testString")
      .build();
    assertEquals(dbConnectionModelModel.databaseId(), "testString");
    assertEquals(dbConnectionModelModel.dbType(), "testString");
    assertEquals(dbConnectionModelModel.host(), "testString");
    assertEquals(dbConnectionModelModel.port(), "testString");
    assertEquals(dbConnectionModelModel.dbName(), "testString");
    assertEquals(dbConnectionModelModel.dbUsername(), "testString");
    assertEquals(dbConnectionModelModel.password(), "testString");
    assertEquals(dbConnectionModelModel.authenticationValue(), "testString");
    assertEquals(dbConnectionModelModel.isSsl(), Boolean.valueOf(false));
    assertEquals(dbConnectionModelModel.certExtension(), "testString");
    assertEquals(dbConnectionModelModel.certContent(), "testString");
    assertEquals(dbConnectionModelModel.connectionMode(), "testString");
    assertEquals(dbConnectionModelModel.connectionModeValue(), "testString");
    assertEquals(dbConnectionModelModel.jdbcUrl(), "testString");

    FileFormatProperties fileFormatPropertiesModel = new FileFormatProperties.Builder()
      .encoding("testString")
      .escapeCharacter("testString")
      .fieldDelimiter("testString")
      .header(true)
      .lineDelimiter("testString")
      .build();
    assertEquals(fileFormatPropertiesModel.encoding(), "testString");
    assertEquals(fileFormatPropertiesModel.escapeCharacter(), "testString");
    assertEquals(fileFormatPropertiesModel.fieldDelimiter(), "testString");
    assertEquals(fileFormatPropertiesModel.header(), Boolean.valueOf(true));
    assertEquals(fileFormatPropertiesModel.lineDelimiter(), "testString");

    SourceDetails sourceDetailsModel = new SourceDetails.Builder()
      .filePaths("testString")
      .fileType("csv")
      .sourceType("STORAGE")
      .schemaTransformations(java.util.Arrays.asList(schemaTransformationModel))
      .schemaName("testString")
      .tableName("testString")
      .bucketDetails(bucketDetailsModel)
      .icebergSourceTable(icebergSourceTableModel)
      .sourceDatabase(dbConnectionModelModel)
      .fileFormatProperties(fileFormatPropertiesModel)
      .isLocalIngestion(false)
      .build();
    assertEquals(sourceDetailsModel.filePaths(), "testString");
    assertEquals(sourceDetailsModel.fileType(), "csv");
    assertEquals(sourceDetailsModel.sourceType(), "STORAGE");
    assertEquals(sourceDetailsModel.schemaTransformations(), java.util.Arrays.asList(schemaTransformationModel));
    assertEquals(sourceDetailsModel.schemaName(), "testString");
    assertEquals(sourceDetailsModel.tableName(), "testString");
    assertEquals(sourceDetailsModel.bucketDetails(), bucketDetailsModel);
    assertEquals(sourceDetailsModel.icebergSourceTable(), icebergSourceTableModel);
    assertEquals(sourceDetailsModel.sourceDatabase(), dbConnectionModelModel);
    assertEquals(sourceDetailsModel.fileFormatProperties(), fileFormatPropertiesModel);
    assertEquals(sourceDetailsModel.isLocalIngestion(), Boolean.valueOf(false));

    String json = TestUtilities.serialize(sourceDetailsModel);

    SourceDetails sourceDetailsModelNew = TestUtilities.deserialize(json, SourceDetails.class);
    assertTrue(sourceDetailsModelNew instanceof SourceDetails);
    assertEquals(sourceDetailsModelNew.filePaths(), "testString");
    assertEquals(sourceDetailsModelNew.fileType(), "csv");
    assertEquals(sourceDetailsModelNew.sourceType(), "STORAGE");
    assertEquals(sourceDetailsModelNew.schemaName(), "testString");
    assertEquals(sourceDetailsModelNew.tableName(), "testString");
    assertEquals(sourceDetailsModelNew.bucketDetails().toString(), bucketDetailsModel.toString());
    assertEquals(sourceDetailsModelNew.icebergSourceTable().toString(), icebergSourceTableModel.toString());
    assertEquals(sourceDetailsModelNew.sourceDatabase().toString(), dbConnectionModelModel.toString());
    assertEquals(sourceDetailsModelNew.fileFormatProperties().toString(), fileFormatPropertiesModel.toString());
    assertEquals(sourceDetailsModelNew.isLocalIngestion(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSourceDetailsError() throws Throwable {
    new SourceDetails.Builder().build();
  }

}