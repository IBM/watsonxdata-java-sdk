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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesVelox;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEnginePropertiesVelox model.
 */
public class PrestissimoEnginePropertiesVeloxTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEnginePropertiesVelox() throws Throwable {
    PrestissimoEnginePropertiesVelox prestissimoEnginePropertiesVeloxModel = new PrestissimoEnginePropertiesVelox.Builder()
      .veloxProperty(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(prestissimoEnginePropertiesVeloxModel.veloxProperty(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(prestissimoEnginePropertiesVeloxModel);

    PrestissimoEnginePropertiesVelox prestissimoEnginePropertiesVeloxModelNew = TestUtilities.deserialize(json, PrestissimoEnginePropertiesVelox.class);
    assertTrue(prestissimoEnginePropertiesVeloxModelNew instanceof PrestissimoEnginePropertiesVelox);
  }
}