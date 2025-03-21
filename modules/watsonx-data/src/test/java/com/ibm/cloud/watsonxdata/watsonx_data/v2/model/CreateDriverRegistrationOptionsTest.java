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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateDriverRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDriverRegistrationOptions model.
 */
public class CreateDriverRegistrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDriverRegistrationOptions() throws Throwable {
    CreateDriverRegistrationOptions createDriverRegistrationOptionsModel = new CreateDriverRegistrationOptions.Builder()
      .driver(TestUtilities.createMockStream("This is a mock file."))
      .driverName("testString")
      .connectionType("testString")
      .driverContentType("testString")
      .version("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(IOUtils.toString(createDriverRegistrationOptionsModel.driver()), IOUtils.toString(TestUtilities.createMockStream("This is a mock file.")));
    assertEquals(createDriverRegistrationOptionsModel.driverName(), "testString");
    assertEquals(createDriverRegistrationOptionsModel.connectionType(), "testString");
    assertEquals(createDriverRegistrationOptionsModel.driverContentType(), "testString");
    assertEquals(createDriverRegistrationOptionsModel.version(), "testString");
    assertEquals(createDriverRegistrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDriverRegistrationOptionsError() throws Throwable {
    new CreateDriverRegistrationOptions.Builder().build();
  }

}