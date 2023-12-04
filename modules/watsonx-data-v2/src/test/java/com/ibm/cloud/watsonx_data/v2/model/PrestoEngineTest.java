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
import com.ibm.cloud.watsonx_data.v2.model.Endpoints;
import com.ibm.cloud.watsonx_data.v2.model.EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.NodeDescription;
import com.ibm.cloud.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestoEngine model.
 */
public class PrestoEngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestoEngine() throws Throwable {
    PrestoEngine prestoEngineModel = new PrestoEngine();
    assertNull(prestoEngineModel.getActions());
    assertNull(prestoEngineModel.getAssociatedCatalogs());
    assertNull(prestoEngineModel.getBuildVersion());
    assertNull(prestoEngineModel.getCoordinator());
    assertNull(prestoEngineModel.getCreatedBy());
    assertNull(prestoEngineModel.getCreatedOn());
    assertNull(prestoEngineModel.getDescription());
    assertNull(prestoEngineModel.getEngineDetails());
    assertNull(prestoEngineModel.getEngineDisplayName());
    assertNull(prestoEngineModel.getEngineId());
    assertNull(prestoEngineModel.getExternalHostName());
    assertNull(prestoEngineModel.getGroupId());
    assertNull(prestoEngineModel.getHostName());
    assertNull(prestoEngineModel.getOrigin());
    assertNull(prestoEngineModel.getPort());
    assertNull(prestoEngineModel.getRegion());
    assertNull(prestoEngineModel.getSizeConfig());
    assertNull(prestoEngineModel.getStatus());
    assertNull(prestoEngineModel.getStatusCode());
    assertNull(prestoEngineModel.getTags());
    assertNull(prestoEngineModel.getType());
    assertNull(prestoEngineModel.getVersion());
    assertNull(prestoEngineModel.getWorker());
  }
}