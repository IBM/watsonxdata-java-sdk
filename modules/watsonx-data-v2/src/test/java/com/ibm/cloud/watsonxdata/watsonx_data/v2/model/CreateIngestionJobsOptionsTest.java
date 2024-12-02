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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateIngestionJobsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobPrototypeCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobPrototypeExecuteConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateIngestionJobsOptions model.
 */
public class CreateIngestionJobsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateIngestionJobsOptions() throws Throwable {
    IngestionJobPrototypeCsvProperty ingestionJobPrototypeCsvPropertyModel = new IngestionJobPrototypeCsvProperty.Builder()
      .encoding("utf-8")
      .escapeCharacter("\\\\")
      .fieldDelimiter(",")
      .header(true)
      .lineDelimiter("\\n")
      .build();
    assertEquals(ingestionJobPrototypeCsvPropertyModel.encoding(), "utf-8");
    assertEquals(ingestionJobPrototypeCsvPropertyModel.escapeCharacter(), "\\\\");
    assertEquals(ingestionJobPrototypeCsvPropertyModel.fieldDelimiter(), ",");
    assertEquals(ingestionJobPrototypeCsvPropertyModel.header(), Boolean.valueOf(true));
    assertEquals(ingestionJobPrototypeCsvPropertyModel.lineDelimiter(), "\\n");

    IngestionJobPrototypeExecuteConfig ingestionJobPrototypeExecuteConfigModel = new IngestionJobPrototypeExecuteConfig.Builder()
      .driverCores(Long.valueOf("1"))
      .driverMemory("2G")
      .executorCores(Long.valueOf("1"))
      .executorMemory("2G")
      .numExecutors(Long.valueOf("1"))
      .build();
    assertEquals(ingestionJobPrototypeExecuteConfigModel.driverCores(), Long.valueOf("1"));
    assertEquals(ingestionJobPrototypeExecuteConfigModel.driverMemory(), "2G");
    assertEquals(ingestionJobPrototypeExecuteConfigModel.executorCores(), Long.valueOf("1"));
    assertEquals(ingestionJobPrototypeExecuteConfigModel.executorMemory(), "2G");
    assertEquals(ingestionJobPrototypeExecuteConfigModel.numExecutors(), Long.valueOf("1"));

    CreateIngestionJobsOptions createIngestionJobsOptionsModel = new CreateIngestionJobsOptions.Builder()
      .authInstanceId("testString")
      .jobId("ingestion-1699459946935")
      .sourceDataFiles("s3://demobucket/data/yellow_tripdata_2022-01.parquet")
      .targetTable("demodb.test.targettable")
      .username("user1")
      .createIfNotExist(false)
      .csvProperty(ingestionJobPrototypeCsvPropertyModel)
      .engineId("spark123")
      .executeConfig(ingestionJobPrototypeExecuteConfigModel)
      .partitionBy("col1, col2")
      .schema("{\"type\":\"struct\",\"schema-id\":0,\"fields\":[{\"id\":1,\"name\":\"ID\",\"required\":true,\"type\":\"int\"},{\"id\":2,\"name\":\"Name\",\"required\":true,\"type\":\"string\"}]}")
      .sourceFileType("csv")
      .validateCsvHeader(false)
      .build();
    assertEquals(createIngestionJobsOptionsModel.authInstanceId(), "testString");
    assertEquals(createIngestionJobsOptionsModel.jobId(), "ingestion-1699459946935");
    assertEquals(createIngestionJobsOptionsModel.sourceDataFiles(), "s3://demobucket/data/yellow_tripdata_2022-01.parquet");
    assertEquals(createIngestionJobsOptionsModel.targetTable(), "demodb.test.targettable");
    assertEquals(createIngestionJobsOptionsModel.username(), "user1");
    assertEquals(createIngestionJobsOptionsModel.createIfNotExist(), Boolean.valueOf(false));
    assertEquals(createIngestionJobsOptionsModel.csvProperty(), ingestionJobPrototypeCsvPropertyModel);
    assertEquals(createIngestionJobsOptionsModel.engineId(), "spark123");
    assertEquals(createIngestionJobsOptionsModel.executeConfig(), ingestionJobPrototypeExecuteConfigModel);
    assertEquals(createIngestionJobsOptionsModel.partitionBy(), "col1, col2");
    assertEquals(createIngestionJobsOptionsModel.schema(), "{\"type\":\"struct\",\"schema-id\":0,\"fields\":[{\"id\":1,\"name\":\"ID\",\"required\":true,\"type\":\"int\"},{\"id\":2,\"name\":\"Name\",\"required\":true,\"type\":\"string\"}]}");
    assertEquals(createIngestionJobsOptionsModel.sourceFileType(), "csv");
    assertEquals(createIngestionJobsOptionsModel.validateCsvHeader(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateIngestionJobsOptionsError() throws Throwable {
    new CreateIngestionJobsOptions.Builder().build();
  }

}