/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DriverRegistrationEnginePrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DriverRegistrationEnginePrototype model.
 */
public class DriverRegistrationEnginePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDriverRegistrationEnginePrototype() throws Throwable {
    DriverRegistrationEnginePrototype driverRegistrationEnginePrototypeModel = new DriverRegistrationEnginePrototype.Builder()
      .engines(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(driverRegistrationEnginePrototypeModel.engines(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(driverRegistrationEnginePrototypeModel);

    DriverRegistrationEnginePrototype driverRegistrationEnginePrototypeModelNew = TestUtilities.deserialize(json, DriverRegistrationEnginePrototype.class);
    assertTrue(driverRegistrationEnginePrototypeModelNew instanceof DriverRegistrationEnginePrototype);
  }
  @Test
  public void testDriverRegistrationEnginePrototypeAsPatch() throws Throwable {
    DriverRegistrationEnginePrototype driverRegistrationEnginePrototypeModel = new DriverRegistrationEnginePrototype.Builder()
      .engines(java.util.Arrays.asList("testString"))
      .build();

    Map<String, Object> mergePatch = driverRegistrationEnginePrototypeModel.asPatch();

    assertTrue(mergePatch.containsKey("engines"));
  }

}