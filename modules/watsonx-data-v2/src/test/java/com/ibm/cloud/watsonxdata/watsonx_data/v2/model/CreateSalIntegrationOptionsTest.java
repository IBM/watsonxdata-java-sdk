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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.CreateSalIntegrationOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSalIntegrationOptions model.
 */
public class CreateSalIntegrationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSalIntegrationOptions() throws Throwable {
    CreateSalIntegrationOptions createSalIntegrationOptionsModel = new CreateSalIntegrationOptions.Builder()
      .apikey("12efd3raq")
      .engineId("presto-01")
      .storageResourceCrn("crn:v1:staging:public:cloud-object-storage:global:a/a7026b374f39f570d20984c1ac6ecf63:5778e94f-c8c7-46a8-9878-d5eeadb51161")
      .storageType("bmcos_object_storage")
      .trialPlan(true)
      .authInstanceId("testString")
      .build();
    assertEquals(createSalIntegrationOptionsModel.apikey(), "12efd3raq");
    assertEquals(createSalIntegrationOptionsModel.engineId(), "presto-01");
    assertEquals(createSalIntegrationOptionsModel.storageResourceCrn(), "crn:v1:staging:public:cloud-object-storage:global:a/a7026b374f39f570d20984c1ac6ecf63:5778e94f-c8c7-46a8-9878-d5eeadb51161");
    assertEquals(createSalIntegrationOptionsModel.storageType(), "bmcos_object_storage");
    assertEquals(createSalIntegrationOptionsModel.trialPlan(), Boolean.valueOf(true));
    assertEquals(createSalIntegrationOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSalIntegrationOptionsError() throws Throwable {
    new CreateSalIntegrationOptions.Builder().build();
  }

}