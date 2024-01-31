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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NetezzaEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NetezzaEngine model.
 */
public class NetezzaEngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNetezzaEngine() throws Throwable {
    NetezzaEngine netezzaEngineModel = new NetezzaEngine();
    assertNull(netezzaEngineModel.getActions());
    assertNull(netezzaEngineModel.getBuildVersion());
    assertNull(netezzaEngineModel.getCreatedBy());
    assertNull(netezzaEngineModel.getCreatedOn());
    assertNull(netezzaEngineModel.getDescription());
    assertNull(netezzaEngineModel.getEngineDetails());
    assertNull(netezzaEngineModel.getEngineDisplayName());
    assertNull(netezzaEngineModel.getEngineId());
    assertNull(netezzaEngineModel.getHostName());
    assertNull(netezzaEngineModel.getOrigin());
    assertNull(netezzaEngineModel.getPort());
    assertNull(netezzaEngineModel.getStatus());
    assertNull(netezzaEngineModel.getTags());
    assertNull(netezzaEngineModel.getType());
  }
}