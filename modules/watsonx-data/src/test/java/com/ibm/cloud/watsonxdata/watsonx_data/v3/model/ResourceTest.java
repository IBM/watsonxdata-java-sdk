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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.InstanceResourceEndpoint;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.JdbcThriftUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.MDSRestUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.Resource;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Resource model.
 */
public class ResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResource() throws Throwable {
    Resource resourceModel = new Resource();
    assertNull(resourceModel.getCaCertificate());
    assertNull(resourceModel.getDefaultConfigs());
    assertNull(resourceModel.getExternal());
    assertNull(resourceModel.getGrpcApiEndpoint());
    assertNull(resourceModel.getHostname());
    assertNull(resourceModel.getId());
    assertNull(resourceModel.getInstanceCrn());
    assertNull(resourceModel.getInstanceId());
    assertNull(resourceModel.getInternal());
    assertNull(resourceModel.getJdbcClass());
    assertNull(resourceModel.getJdbcUrls());
    assertNull(resourceModel.getMdsRestUrls());
    assertNull(resourceModel.getName());
    assertNull(resourceModel.getPort());
    assertNull(resourceModel.getProxyApiEndpoint());
    assertNull(resourceModel.getRestApiEndpoint());
    assertNull(resourceModel.getRestHostname());
    assertNull(resourceModel.getRestPort());
    assertNull(resourceModel.getSparkEngineEndpoint());
    assertNull(resourceModel.getSslCertificate());
    assertNull(resourceModel.getThriftUrls());
    assertNull(resourceModel.getType());
    assertNull(resourceModel.getVersion());
    assertNull(resourceModel.getWatsonxDataApplicationEndpoint());
  }
}