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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PreviewIngestionFilePrototypeCsvProperty;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PreviewIngestionFilePrototypeCsvProperty model.
 */
public class PreviewIngestionFilePrototypeCsvPropertyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPreviewIngestionFilePrototypeCsvProperty() throws Throwable {
    PreviewIngestionFilePrototypeCsvProperty previewIngestionFilePrototypeCsvPropertyModel = new PreviewIngestionFilePrototypeCsvProperty.Builder()
      .encoding("utf-8")
      .escapeCharacter("\\\\")
      .fieldDelimiter(",")
      .header(true)
      .lineDelimiter("\\n")
      .build();
    assertEquals(previewIngestionFilePrototypeCsvPropertyModel.encoding(), "utf-8");
    assertEquals(previewIngestionFilePrototypeCsvPropertyModel.escapeCharacter(), "\\\\");
    assertEquals(previewIngestionFilePrototypeCsvPropertyModel.fieldDelimiter(), ",");
    assertEquals(previewIngestionFilePrototypeCsvPropertyModel.header(), Boolean.valueOf(true));
    assertEquals(previewIngestionFilePrototypeCsvPropertyModel.lineDelimiter(), "\\n");

    String json = TestUtilities.serialize(previewIngestionFilePrototypeCsvPropertyModel);

    PreviewIngestionFilePrototypeCsvProperty previewIngestionFilePrototypeCsvPropertyModelNew = TestUtilities.deserialize(json, PreviewIngestionFilePrototypeCsvProperty.class);
    assertTrue(previewIngestionFilePrototypeCsvPropertyModelNew instanceof PreviewIngestionFilePrototypeCsvProperty);
    assertEquals(previewIngestionFilePrototypeCsvPropertyModelNew.encoding(), "utf-8");
    assertEquals(previewIngestionFilePrototypeCsvPropertyModelNew.escapeCharacter(), "\\\\");
    assertEquals(previewIngestionFilePrototypeCsvPropertyModelNew.fieldDelimiter(), ",");
    assertEquals(previewIngestionFilePrototypeCsvPropertyModelNew.header(), Boolean.valueOf(true));
    assertEquals(previewIngestionFilePrototypeCsvPropertyModelNew.lineDelimiter(), "\\n");
  }
}