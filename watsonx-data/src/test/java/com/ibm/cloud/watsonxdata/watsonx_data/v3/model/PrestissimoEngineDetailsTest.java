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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoCoordinatorNodeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PrestissimoWorkerNodeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestissimoEngineDetails model.
 */
public class PrestissimoEngineDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestissimoEngineDetails() throws Throwable {
    PrestissimoCoordinatorNodeDetails prestissimoCoordinatorNodeDetailsModel = new PrestissimoCoordinatorNodeDetails.Builder()
      .nodeType("starter")
      .quantity(Long.valueOf("1"))
      .build();
    assertEquals(prestissimoCoordinatorNodeDetailsModel.nodeType(), "starter");
    assertEquals(prestissimoCoordinatorNodeDetailsModel.quantity(), Long.valueOf("1"));

    PrestissimoWorkerNodeDetails prestissimoWorkerNodeDetailsModel = new PrestissimoWorkerNodeDetails.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("1"))
      .build();
    assertEquals(prestissimoWorkerNodeDetailsModel.nodeType(), "worker");
    assertEquals(prestissimoWorkerNodeDetailsModel.quantity(), Long.valueOf("1"));

    PrestissimoEngineDetails prestissimoEngineDetailsModel = new PrestissimoEngineDetails.Builder()
      .coordinator(prestissimoCoordinatorNodeDetailsModel)
      .sizeConfig("starter")
      .worker(prestissimoWorkerNodeDetailsModel)
      .build();
    assertEquals(prestissimoEngineDetailsModel.coordinator(), prestissimoCoordinatorNodeDetailsModel);
    assertEquals(prestissimoEngineDetailsModel.sizeConfig(), "starter");
    assertEquals(prestissimoEngineDetailsModel.worker(), prestissimoWorkerNodeDetailsModel);

    String json = TestUtilities.serialize(prestissimoEngineDetailsModel);

    PrestissimoEngineDetails prestissimoEngineDetailsModelNew = TestUtilities.deserialize(json, PrestissimoEngineDetails.class);
    assertTrue(prestissimoEngineDetailsModelNew instanceof PrestissimoEngineDetails);
    assertEquals(prestissimoEngineDetailsModelNew.coordinator().toString(), prestissimoCoordinatorNodeDetailsModel.toString());
    assertEquals(prestissimoEngineDetailsModelNew.sizeConfig(), "starter");
    assertEquals(prestissimoEngineDetailsModelNew.worker().toString(), prestissimoWorkerNodeDetailsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPrestissimoEngineDetailsError() throws Throwable {
    new PrestissimoEngineDetails.Builder().build();
  }

}