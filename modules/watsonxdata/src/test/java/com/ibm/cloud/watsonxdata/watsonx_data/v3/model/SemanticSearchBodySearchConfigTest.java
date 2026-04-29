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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchBodySearchConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SemanticSearchBodySearchConfig model.
 */
public class SemanticSearchBodySearchConfigTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSemanticSearchBodySearchConfig() throws Throwable {
    SemanticSearchBodySearchConfig semanticSearchBodySearchConfigModel = new SemanticSearchBodySearchConfig.Builder()
      .columnSearchEnabled(true)
      .fields(java.util.Arrays.asList("metadata.name", "metadata.description", "metadata.tags"))
      .maxResultNumber(Long.valueOf("1"))
      .schemaSearchEnabled(true)
      .build();
    assertEquals(semanticSearchBodySearchConfigModel.columnSearchEnabled(), Boolean.valueOf(true));
    assertEquals(semanticSearchBodySearchConfigModel.fields(), java.util.Arrays.asList("metadata.name", "metadata.description", "metadata.tags"));
    assertEquals(semanticSearchBodySearchConfigModel.maxResultNumber(), Long.valueOf("1"));
    assertEquals(semanticSearchBodySearchConfigModel.schemaSearchEnabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(semanticSearchBodySearchConfigModel);

    SemanticSearchBodySearchConfig semanticSearchBodySearchConfigModelNew = TestUtilities.deserialize(json, SemanticSearchBodySearchConfig.class);
    assertTrue(semanticSearchBodySearchConfigModelNew instanceof SemanticSearchBodySearchConfig);
    assertEquals(semanticSearchBodySearchConfigModelNew.columnSearchEnabled(), Boolean.valueOf(true));
    assertEquals(semanticSearchBodySearchConfigModelNew.maxResultNumber(), Long.valueOf("1"));
    assertEquals(semanticSearchBodySearchConfigModelNew.schemaSearchEnabled(), Boolean.valueOf(true));
  }
}