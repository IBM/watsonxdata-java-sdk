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
import com.ibm.cloud.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonx_data.v2.model.Db2EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.Endpoints;
import com.ibm.cloud.watsonx_data.v2.model.Engine;
import com.ibm.cloud.watsonx_data.v2.model.EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.MilvusService;
import com.ibm.cloud.watsonx_data.v2.model.NetezzaEngine;
import com.ibm.cloud.watsonx_data.v2.model.NetezzaEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.NodeDescription;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonx_data.v2.model.PrestoEngine;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngine;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.SparkEngineDetailsEndpoints;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Engine model.
 */
public class EngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngine() throws Throwable {
    Engine engineModel = new Engine();
    assertNull(engineModel.getDb2Engines());
    assertNull(engineModel.getMilvusServices());
    assertNull(engineModel.getNetezzaEngines());
    assertNull(engineModel.getPrestissimoEngines());
    assertNull(engineModel.getPrestoEngines());
    assertNull(engineModel.getSparkEngines());
  }
}