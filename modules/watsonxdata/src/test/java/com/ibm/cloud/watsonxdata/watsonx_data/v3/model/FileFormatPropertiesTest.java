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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.FileFormatProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FileFormatProperties model.
 */
public class FileFormatPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFileFormatProperties() throws Throwable {
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

    String json = TestUtilities.serialize(fileFormatPropertiesModel);

    FileFormatProperties fileFormatPropertiesModelNew = TestUtilities.deserialize(json, FileFormatProperties.class);
    assertTrue(fileFormatPropertiesModelNew instanceof FileFormatProperties);
    assertEquals(fileFormatPropertiesModelNew.encoding(), "testString");
    assertEquals(fileFormatPropertiesModelNew.escapeCharacter(), "testString");
    assertEquals(fileFormatPropertiesModelNew.fieldDelimiter(), "testString");
    assertEquals(fileFormatPropertiesModelNew.header(), Boolean.valueOf(true));
    assertEquals(fileFormatPropertiesModelNew.lineDelimiter(), "testString");
  }
}