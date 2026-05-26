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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.ListStorageRegistrationsObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListStorageRegistrationsObjectsOptions model.
 */
public class ListStorageRegistrationsObjectsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListStorageRegistrationsObjectsOptions() throws Throwable {
    ListStorageRegistrationsObjectsOptions listStorageRegistrationsObjectsOptionsModel = new ListStorageRegistrationsObjectsOptions.Builder()
      .storageId("testString")
      .authInstanceId("testString")
      .path("testString")
      .paginated(true)
      .pageSize(Long.valueOf("1"))
      .prefix("testString")
      .startAfter("testString")
      .build();
    assertEquals(listStorageRegistrationsObjectsOptionsModel.storageId(), "testString");
    assertEquals(listStorageRegistrationsObjectsOptionsModel.authInstanceId(), "testString");
    assertEquals(listStorageRegistrationsObjectsOptionsModel.path(), "testString");
    assertEquals(listStorageRegistrationsObjectsOptionsModel.paginated(), Boolean.valueOf(true));
    assertEquals(listStorageRegistrationsObjectsOptionsModel.pageSize(), Long.valueOf("1"));
    assertEquals(listStorageRegistrationsObjectsOptionsModel.prefix(), "testString");
    assertEquals(listStorageRegistrationsObjectsOptionsModel.startAfter(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListStorageRegistrationsObjectsOptionsError() throws Throwable {
    new ListStorageRegistrationsObjectsOptions.Builder().build();
  }

}