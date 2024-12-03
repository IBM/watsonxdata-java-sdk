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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.IngestionJobPrototypeCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IngestionJobPrototypeCsvProperty model.
 */
public class IngestionJobPrototypeCsvPropertyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIngestionJobPrototypeCsvProperty() throws Throwable {
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

    String json = TestUtilities.serialize(ingestionJobPrototypeCsvPropertyModel);

    IngestionJobPrototypeCsvProperty ingestionJobPrototypeCsvPropertyModelNew = TestUtilities.deserialize(json, IngestionJobPrototypeCsvProperty.class);
    assertTrue(ingestionJobPrototypeCsvPropertyModelNew instanceof IngestionJobPrototypeCsvProperty);
    assertEquals(ingestionJobPrototypeCsvPropertyModelNew.encoding(), "utf-8");
    assertEquals(ingestionJobPrototypeCsvPropertyModelNew.escapeCharacter(), "\\\\");
    assertEquals(ingestionJobPrototypeCsvPropertyModelNew.fieldDelimiter(), ",");
    assertEquals(ingestionJobPrototypeCsvPropertyModelNew.header(), Boolean.valueOf(true));
    assertEquals(ingestionJobPrototypeCsvPropertyModelNew.lineDelimiter(), "\\n");
  }
}