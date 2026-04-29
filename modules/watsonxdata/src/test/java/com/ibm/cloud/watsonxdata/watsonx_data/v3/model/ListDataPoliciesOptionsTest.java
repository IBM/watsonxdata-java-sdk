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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListDataPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataPoliciesOptions model.
 */
public class ListDataPoliciesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataPoliciesOptions() throws Throwable {
    ListDataPoliciesOptions listDataPoliciesOptionsModel = new ListDataPoliciesOptions.Builder()
      .authInstanceId("testString")
      .catalogName("testString")
      .resourceId("testString")
      .status("testString")
      .includeMetadata(true)
      .includeRules(true)
      .bucketName("testString")
      .serviceName("testString")
      .dataArtifact("testString")
      .build();
    assertEquals(listDataPoliciesOptionsModel.authInstanceId(), "testString");
    assertEquals(listDataPoliciesOptionsModel.catalogName(), "testString");
    assertEquals(listDataPoliciesOptionsModel.resourceId(), "testString");
    assertEquals(listDataPoliciesOptionsModel.status(), "testString");
    assertEquals(listDataPoliciesOptionsModel.includeMetadata(), Boolean.valueOf(true));
    assertEquals(listDataPoliciesOptionsModel.includeRules(), Boolean.valueOf(true));
    assertEquals(listDataPoliciesOptionsModel.bucketName(), "testString");
    assertEquals(listDataPoliciesOptionsModel.serviceName(), "testString");
    assertEquals(listDataPoliciesOptionsModel.dataArtifact(), "testString");
  }
}