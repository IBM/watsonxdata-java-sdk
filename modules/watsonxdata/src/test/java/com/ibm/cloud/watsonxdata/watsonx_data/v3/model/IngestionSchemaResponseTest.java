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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionSchemaResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IngestionSchemaResponse model.
 */
public class IngestionSchemaResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIngestionSchemaResponse() throws Throwable {
    IngestionSchemaResponse ingestionSchemaResponseModel = new IngestionSchemaResponse.Builder()
      .fieldId(Long.valueOf("0"))
      .headerName("testString")
      .type("testString")
      .build();
    assertEquals(ingestionSchemaResponseModel.fieldId(), Long.valueOf("0"));
    assertEquals(ingestionSchemaResponseModel.headerName(), "testString");
    assertEquals(ingestionSchemaResponseModel.type(), "testString");

    String json = TestUtilities.serialize(ingestionSchemaResponseModel);

    IngestionSchemaResponse ingestionSchemaResponseModelNew = TestUtilities.deserialize(json, IngestionSchemaResponse.class);
    assertTrue(ingestionSchemaResponseModelNew instanceof IngestionSchemaResponse);
    assertEquals(ingestionSchemaResponseModelNew.fieldId(), Long.valueOf("0"));
    assertEquals(ingestionSchemaResponseModelNew.headerName(), "testString");
    assertEquals(ingestionSchemaResponseModelNew.type(), "testString");
  }
}