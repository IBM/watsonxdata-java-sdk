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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.AccessPolicyBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.BulkUpdateResourceAccessPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceDetailsBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Subject;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SubjectBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkUpdateResourceAccessPoliciesOptions model.
 */
public class BulkUpdateResourceAccessPoliciesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkUpdateResourceAccessPoliciesOptions() throws Throwable {
    ResourceDetailsBulkUpdate resourceDetailsBulkUpdateModel = new ResourceDetailsBulkUpdate.Builder()
      .id("presto01")
      .name("hive_data")
      .type("presto")
      .build();
    assertEquals(resourceDetailsBulkUpdateModel.id(), "presto01");
    assertEquals(resourceDetailsBulkUpdateModel.name(), "hive_data");
    assertEquals(resourceDetailsBulkUpdateModel.type(), "presto");

    Subject subjectModel = new Subject.Builder()
      .type("user")
      .value("user1")
      .build();
    assertEquals(subjectModel.type(), "user");
    assertEquals(subjectModel.value(), "user1");

    SubjectBulkUpdate subjectBulkUpdateModel = new SubjectBulkUpdate.Builder()
      .permissions(java.util.Arrays.asList("testString"))
      .subject(subjectModel)
      .build();
    assertEquals(subjectBulkUpdateModel.permissions(), java.util.Arrays.asList("testString"));
    assertEquals(subjectBulkUpdateModel.subject(), subjectModel);

    AccessPolicyBulkUpdate accessPolicyBulkUpdateModel = new AccessPolicyBulkUpdate.Builder()
      .resources(java.util.Arrays.asList(resourceDetailsBulkUpdateModel))
      .subjects(java.util.Arrays.asList(subjectBulkUpdateModel))
      .build();
    assertEquals(accessPolicyBulkUpdateModel.resources(), java.util.Arrays.asList(resourceDetailsBulkUpdateModel));
    assertEquals(accessPolicyBulkUpdateModel.subjects(), java.util.Arrays.asList(subjectBulkUpdateModel));

    BulkUpdateResourceAccessPoliciesOptions bulkUpdateResourceAccessPoliciesOptionsModel = new BulkUpdateResourceAccessPoliciesOptions.Builder()
      .accessPolicies(java.util.Arrays.asList(accessPolicyBulkUpdateModel))
      .authInstanceId("testString")
      .build();
    assertEquals(bulkUpdateResourceAccessPoliciesOptionsModel.accessPolicies(), java.util.Arrays.asList(accessPolicyBulkUpdateModel));
    assertEquals(bulkUpdateResourceAccessPoliciesOptionsModel.authInstanceId(), "testString");
  }
}