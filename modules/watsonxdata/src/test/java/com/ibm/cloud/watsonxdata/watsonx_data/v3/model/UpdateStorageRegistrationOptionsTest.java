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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.UpdateStorageRegistrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateStorageRegistrationOptions model.
 */
public class UpdateStorageRegistrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateStorageRegistrationOptions() throws Throwable {
    UpdateStorageRegistrationOptions updateStorageRegistrationOptionsModel = new UpdateStorageRegistrationOptions.Builder()
      .id("testString")
      .body(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .skipMdsCall(false)
      .authInstanceId("testString")
      .build();
    assertEquals(updateStorageRegistrationOptionsModel.id(), "testString");
    assertEquals(updateStorageRegistrationOptionsModel.body(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateStorageRegistrationOptionsModel.skipMdsCall(), Boolean.valueOf(false));
    assertEquals(updateStorageRegistrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateStorageRegistrationOptionsError() throws Throwable {
    new UpdateStorageRegistrationOptions.Builder().build();
  }

}