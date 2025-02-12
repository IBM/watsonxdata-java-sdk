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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.GetServiceDetailOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetServiceDetailOptions model.
 */
public class GetServiceDetailOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetServiceDetailOptions() throws Throwable {
    GetServiceDetailOptions getServiceDetailOptionsModel = new GetServiceDetailOptions.Builder()
      .target("testString")
      .engineOrServiceType("testString")
      .id("testString")
      .database("testString")
      .internalHost(false)
      .authInstanceId("testString")
      .build();
    assertEquals(getServiceDetailOptionsModel.target(), "testString");
    assertEquals(getServiceDetailOptionsModel.engineOrServiceType(), "testString");
    assertEquals(getServiceDetailOptionsModel.id(), "testString");
    assertEquals(getServiceDetailOptionsModel.database(), "testString");
    assertEquals(getServiceDetailOptionsModel.internalHost(), Boolean.valueOf(false));
    assertEquals(getServiceDetailOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetServiceDetailOptionsError() throws Throwable {
    new GetServiceDetailOptions.Builder().build();
  }

}