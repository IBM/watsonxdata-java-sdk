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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.PrestissimoEnginePropertiesEventListner;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEnginePropertiesEventListner model.
 */
public class PrestissimoEnginePropertiesEventListnerTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEnginePropertiesEventListner() throws Throwable {
    PrestissimoEnginePropertiesEventListner prestissimoEnginePropertiesEventListnerModel = new PrestissimoEnginePropertiesEventListner.Builder()
      .coordinator(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesEventListnerModel.coordinator(), java.util.Collections.singletonMap("key1", "testString"));

    String json = TestUtilities.serialize(prestissimoEnginePropertiesEventListnerModel);

    PrestissimoEnginePropertiesEventListner prestissimoEnginePropertiesEventListnerModelNew = TestUtilities.deserialize(json, PrestissimoEnginePropertiesEventListner.class);
    assertTrue(prestissimoEnginePropertiesEventListnerModelNew instanceof PrestissimoEnginePropertiesEventListner);
  }
}