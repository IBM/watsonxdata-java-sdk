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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Db2EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Db2EngineDetailsBody model.
 */
public class Db2EngineDetailsBodyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDb2EngineDetailsBody() throws Throwable {
    Db2EngineDetailsBody db2EngineDetailsBodyModel = new Db2EngineDetailsBody.Builder()
      .connectionString("1.2.3.4")
      .build();
    assertEquals(db2EngineDetailsBodyModel.connectionString(), "1.2.3.4");

    String json = TestUtilities.serialize(db2EngineDetailsBodyModel);

    Db2EngineDetailsBody db2EngineDetailsBodyModelNew = TestUtilities.deserialize(json, Db2EngineDetailsBody.class);
    assertTrue(db2EngineDetailsBodyModelNew instanceof Db2EngineDetailsBody);
    assertEquals(db2EngineDetailsBodyModelNew.connectionString(), "1.2.3.4");
  }
}