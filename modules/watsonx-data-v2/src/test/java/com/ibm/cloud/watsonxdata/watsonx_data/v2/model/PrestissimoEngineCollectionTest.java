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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.EnginePropertiesOaiGenConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEndpoints;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEngineEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesGlobal;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesOaiGen1Jvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoEnginePropertiesVelox;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestissimoNodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesPrestissimoOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEngineCollection model.
 */
public class PrestissimoEngineCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEngineCollection() throws Throwable {
    PrestissimoEngineCollection prestissimoEngineCollectionModel = new PrestissimoEngineCollection();
    assertNull(prestissimoEngineCollectionModel.getPrestissimoEngines());
  }
}