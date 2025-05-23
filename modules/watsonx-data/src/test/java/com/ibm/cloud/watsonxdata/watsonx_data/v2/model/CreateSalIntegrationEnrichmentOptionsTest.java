/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationEnrichmentOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnrichmentObj;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSalIntegrationEnrichmentOptions model.
 */
public class CreateSalIntegrationEnrichmentOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSalIntegrationEnrichmentOptions() throws Throwable {
    EnrichmentObj enrichmentObjModel = new EnrichmentObj.Builder()
      .catalog("iceberg_data")
      .operation("create")
      .schema("testString")
      .tables(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(enrichmentObjModel.catalog(), "iceberg_data");
    assertEquals(enrichmentObjModel.operation(), "create");
    assertEquals(enrichmentObjModel.schema(), "testString");
    assertEquals(enrichmentObjModel.tables(), java.util.Arrays.asList("testString"));

    CreateSalIntegrationEnrichmentOptions createSalIntegrationEnrichmentOptionsModel = new CreateSalIntegrationEnrichmentOptions.Builder()
      .enrichmentPrototype(enrichmentObjModel)
      .authInstanceId("testString")
      .build();
    assertEquals(createSalIntegrationEnrichmentOptionsModel.enrichmentPrototype(), enrichmentObjModel);
    assertEquals(createSalIntegrationEnrichmentOptionsModel.authInstanceId(), "testString");
  }
}