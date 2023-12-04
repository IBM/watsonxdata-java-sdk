/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEngine model.
 */
public class PrestissimoEngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEngine() throws Throwable {
    PrestissimoEngine prestissimoEngineModel = new PrestissimoEngine();
    assertNull(prestissimoEngineModel.getActions());
    assertNull(prestissimoEngineModel.getAssociatedCatalogs());
    assertNull(prestissimoEngineModel.getBuildVersion());
    assertNull(prestissimoEngineModel.getCoordinator());
    assertNull(prestissimoEngineModel.getCreatedBy());
    assertNull(prestissimoEngineModel.getCreatedOn());
    assertNull(prestissimoEngineModel.getDescription());
    assertNull(prestissimoEngineModel.getEngineDetails());
    assertNull(prestissimoEngineModel.getEngineDisplayName());
    assertNull(prestissimoEngineModel.getEngineId());
    assertNull(prestissimoEngineModel.getExternalHostName());
    assertNull(prestissimoEngineModel.getGroupId());
    assertNull(prestissimoEngineModel.getHostName());
    assertNull(prestissimoEngineModel.getOrigin());
    assertNull(prestissimoEngineModel.getPort());
    assertNull(prestissimoEngineModel.getRegion());
    assertNull(prestissimoEngineModel.getSizeConfig());
    assertNull(prestissimoEngineModel.getStatus());
    assertNull(prestissimoEngineModel.getStatusCode());
    assertNull(prestissimoEngineModel.getTags());
    assertNull(prestissimoEngineModel.getType());
    assertNull(prestissimoEngineModel.getVersion());
    assertNull(prestissimoEngineModel.getWorker());
  }
}