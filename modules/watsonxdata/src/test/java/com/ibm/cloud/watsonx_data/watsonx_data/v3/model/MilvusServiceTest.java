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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.model.MilvusService;
import com.ibm.cloud.watsonx_data.watsonx_data.v3.utils.TestUtilities;
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
    assertNull(milvusServiceModel.getCreatedAt());
    assertNull(milvusServiceModel.getCreatedBy());
    assertNull(milvusServiceModel.getDcCpu());
    assertNull(milvusServiceModel.getDcMemory());
    assertNull(milvusServiceModel.getDcReplicas());
    assertNull(milvusServiceModel.getDescription());
    assertNull(milvusServiceModel.getDisplayName());
    assertNull(milvusServiceModel.getDwCpu());
    assertNull(milvusServiceModel.getDwMemory());
    assertNull(milvusServiceModel.getDwReplicas());
    assertNull(milvusServiceModel.getEndpoint());
    assertNull(milvusServiceModel.getEtcdCpu());
    assertNull(milvusServiceModel.getEtcdMemory());
    assertNull(milvusServiceModel.getFailureMessage());
    assertNull(milvusServiceModel.getGrpcHost());
    assertNull(milvusServiceModel.getGrpcPort());
    assertNull(milvusServiceModel.getHostName());
    assertNull(milvusServiceModel.getHttpsHost());
    assertNull(milvusServiceModel.getHttpsPort());
    assertNull(milvusServiceModel.getId());
    assertNull(milvusServiceModel.getIndexType());
    assertNull(milvusServiceModel.getIwCpu());
    assertNull(milvusServiceModel.getIwMemory());
    assertNull(milvusServiceModel.getIwReplicas());
    assertNull(milvusServiceModel.getKafkaCpu());
    assertNull(milvusServiceModel.getKafkaMemory());
    assertNull(milvusServiceModel.getManagedBy());
    assertNull(milvusServiceModel.getMilvusPauseReason());
    assertNull(milvusServiceModel.getOrigin());
    assertNull(milvusServiceModel.getProxyCpu());
    assertNull(milvusServiceModel.getProxyHost());
    assertNull(milvusServiceModel.getProxyMemory());
    assertNull(milvusServiceModel.getProxyPort());
    assertNull(milvusServiceModel.getProxyReplicas());
    assertNull(milvusServiceModel.getQcCpu());
    assertNull(milvusServiceModel.getQcMemory());
    assertNull(milvusServiceModel.getQcReplicas());
    assertNull(milvusServiceModel.getQwCpu());
    assertNull(milvusServiceModel.getQwMemory());
    assertNull(milvusServiceModel.getQwReplicas());
    assertNull(milvusServiceModel.getRcCpu());
    assertNull(milvusServiceModel.getRcMemory());
    assertNull(milvusServiceModel.getRcReplicas());
    assertNull(milvusServiceModel.getRootPath());
    assertNull(milvusServiceModel.getSecretKey());
    assertNull(milvusServiceModel.getStatus());
    assertNull(milvusServiceModel.getStatusCode());
    assertNull(milvusServiceModel.getStorageName());
    assertNull(milvusServiceModel.getTags());
    assertNull(milvusServiceModel.getTshirtSize());
    assertNull(milvusServiceModel.getType());
    assertNull(milvusServiceModel.getVector());
    assertNull(milvusServiceModel.getVectorDimension());
    assertNull(milvusServiceModel.getVersion());
  }
}