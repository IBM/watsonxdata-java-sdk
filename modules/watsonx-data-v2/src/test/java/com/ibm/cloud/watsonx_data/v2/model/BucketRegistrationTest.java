/*
 * (C) Copyright IBM Corp. 2023.
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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.BucketRegistration;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BucketRegistration model.
 */
public class BucketRegistrationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBucketRegistration() throws Throwable {
    BucketRegistration bucketRegistrationModel = new BucketRegistration();
    assertNull(bucketRegistrationModel.getAccessKey());
    assertNull(bucketRegistrationModel.getActions());
    assertNull(bucketRegistrationModel.getAssociatedCatalogs());
    assertNull(bucketRegistrationModel.getBucketDisplayName());
    assertNull(bucketRegistrationModel.getBucketId());
    assertNull(bucketRegistrationModel.getBucketName());
    assertNull(bucketRegistrationModel.getBucketType());
    assertNull(bucketRegistrationModel.getCreatedBy());
    assertNull(bucketRegistrationModel.getCreatedOn());
    assertNull(bucketRegistrationModel.getDescription());
    assertNull(bucketRegistrationModel.getEndpoint());
    assertNull(bucketRegistrationModel.getManagedBy());
    assertNull(bucketRegistrationModel.getRegion());
    assertNull(bucketRegistrationModel.getSecretKey());
    assertNull(bucketRegistrationModel.getState());
    assertNull(bucketRegistrationModel.getTags());
  }
}