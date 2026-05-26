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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ResourceDetailsBulkUpdate;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourceDetailsBulkUpdate model.
 */
public class ResourceDetailsBulkUpdateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourceDetailsBulkUpdate() throws Throwable {
    ResourceDetailsBulkUpdate resourceDetailsBulkUpdateModel = new ResourceDetailsBulkUpdate.Builder()
      .id("presto01")
      .name("hive_data")
      .type("presto")
      .build();
    assertEquals(resourceDetailsBulkUpdateModel.id(), "presto01");
    assertEquals(resourceDetailsBulkUpdateModel.name(), "hive_data");
    assertEquals(resourceDetailsBulkUpdateModel.type(), "presto");

    String json = TestUtilities.serialize(resourceDetailsBulkUpdateModel);

    ResourceDetailsBulkUpdate resourceDetailsBulkUpdateModelNew = TestUtilities.deserialize(json, ResourceDetailsBulkUpdate.class);
    assertTrue(resourceDetailsBulkUpdateModelNew instanceof ResourceDetailsBulkUpdate);
    assertEquals(resourceDetailsBulkUpdateModelNew.id(), "presto01");
    assertEquals(resourceDetailsBulkUpdateModelNew.name(), "hive_data");
    assertEquals(resourceDetailsBulkUpdateModelNew.type(), "presto");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourceDetailsBulkUpdateError() throws Throwable {
    new ResourceDetailsBulkUpdate.Builder().build();
  }

}