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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.MilvusService;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MilvusService model.
 */
public class MilvusServiceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMilvusService() throws Throwable {
    MilvusService milvusServiceModel = new MilvusService();
    assertNull(milvusServiceModel.getAccessKey());
    assertNull(milvusServiceModel.getActions());
    assertNull(milvusServiceModel.getBucketName());
    assertNull(milvusServiceModel.getBucketType());
    assertNull(milvusServiceModel.getCreatedBy());
    assertNull(milvusServiceModel.getCreatedOn());
    assertNull(milvusServiceModel.getDescription());
    assertNull(milvusServiceModel.getEndpoint());
    assertNull(milvusServiceModel.getGrpcHost());
    assertNull(milvusServiceModel.getGrpcPort());
    assertNull(milvusServiceModel.getHostName());
    assertNull(milvusServiceModel.getHttpsHost());
    assertNull(milvusServiceModel.getHttpsPort());
    assertNull(milvusServiceModel.getOrigin());
    assertNull(milvusServiceModel.getRootPath());
    assertNull(milvusServiceModel.getSecretKey());
    assertNull(milvusServiceModel.getServiceDisplayName());
    assertNull(milvusServiceModel.getServiceId());
    assertNull(milvusServiceModel.getStatus());
    assertNull(milvusServiceModel.getStatusCode());
    assertNull(milvusServiceModel.getTags());
    assertNull(milvusServiceModel.getTshirtSize());
    assertNull(milvusServiceModel.getType());
  }
}