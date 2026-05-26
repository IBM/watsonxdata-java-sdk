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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPoliciesSearch;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Subject;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AccessPoliciesSearch model.
 */
public class AccessPoliciesSearchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAccessPoliciesSearch() throws Throwable {
    ResourceDetails resourceDetailsModel = new ResourceDetails.Builder()
      .id("presto01")
      .name("hive_data")
      .type("presto")
      .build();
    assertEquals(resourceDetailsModel.id(), "presto01");
    assertEquals(resourceDetailsModel.name(), "hive_data");
    assertEquals(resourceDetailsModel.type(), "presto");

    Subject subjectModel = new Subject.Builder()
      .type("user")
      .value("user1")
      .build();
    assertEquals(subjectModel.type(), "user");
    assertEquals(subjectModel.value(), "user1");

    AccessPoliciesSearch accessPoliciesSearchModel = new AccessPoliciesSearch.Builder()
      .resources(java.util.Arrays.asList(resourceDetailsModel))
      .subjectsToSearch(java.util.Arrays.asList(subjectModel))
      .build();
    assertEquals(accessPoliciesSearchModel.resources(), java.util.Arrays.asList(resourceDetailsModel));
    assertEquals(accessPoliciesSearchModel.subjectsToSearch(), java.util.Arrays.asList(subjectModel));

    String json = TestUtilities.serialize(accessPoliciesSearchModel);

    AccessPoliciesSearch accessPoliciesSearchModelNew = TestUtilities.deserialize(json, AccessPoliciesSearch.class);
    assertTrue(accessPoliciesSearchModelNew instanceof AccessPoliciesSearch);
  }
}