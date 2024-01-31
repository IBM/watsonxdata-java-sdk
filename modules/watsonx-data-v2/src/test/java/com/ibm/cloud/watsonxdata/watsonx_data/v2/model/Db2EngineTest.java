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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Db2Engine model.
 */
public class Db2EngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDb2Engine() throws Throwable {
    Db2Engine db2EngineModel = new Db2Engine();
    assertNull(db2EngineModel.getActions());
    assertNull(db2EngineModel.getBuildVersion());
    assertNull(db2EngineModel.getCreatedBy());
    assertNull(db2EngineModel.getCreatedOn());
    assertNull(db2EngineModel.getDescription());
    assertNull(db2EngineModel.getEngineDetails());
    assertNull(db2EngineModel.getEngineDisplayName());
    assertNull(db2EngineModel.getEngineId());
    assertNull(db2EngineModel.getHostName());
    assertNull(db2EngineModel.getOrigin());
    assertNull(db2EngineModel.getPort());
    assertNull(db2EngineModel.getStatus());
    assertNull(db2EngineModel.getTags());
    assertNull(db2EngineModel.getType());
  }
}