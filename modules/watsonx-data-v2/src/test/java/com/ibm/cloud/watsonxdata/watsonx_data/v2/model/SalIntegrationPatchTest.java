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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SalIntegrationPatch;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SalIntegrationPatch model.
 */
public class SalIntegrationPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSalIntegrationPatch() throws Throwable {
    SalIntegrationPatch salIntegrationPatchModel = new SalIntegrationPatch.Builder()
      .op("add")
      .path("storage")
      .value("new-apikey")
      .build();
    assertEquals(salIntegrationPatchModel.op(), "add");
    assertEquals(salIntegrationPatchModel.path(), "storage");
    assertEquals(salIntegrationPatchModel.value(), "new-apikey");

    String json = TestUtilities.serialize(salIntegrationPatchModel);

    SalIntegrationPatch salIntegrationPatchModelNew = TestUtilities.deserialize(json, SalIntegrationPatch.class);
    assertTrue(salIntegrationPatchModelNew instanceof SalIntegrationPatch);
    assertEquals(salIntegrationPatchModelNew.op(), "add");
    assertEquals(salIntegrationPatchModelNew.path(), "storage");
    assertEquals(salIntegrationPatchModelNew.value(), "new-apikey");
  }
  @Test
  public void testSalIntegrationPatchAsPatch() throws Throwable {
    SalIntegrationPatch salIntegrationPatchModel = new SalIntegrationPatch.Builder()
      .op("add")
      .path("storage")
      .value("new-apikey")
      .build();

    Map<String, Object> mergePatch = salIntegrationPatchModel.asPatch();

    assertEquals(mergePatch.get("op"), "add");
    assertEquals(mergePatch.get("path"), "storage");
    assertEquals(mergePatch.get("value"), "new-apikey");
  }

}