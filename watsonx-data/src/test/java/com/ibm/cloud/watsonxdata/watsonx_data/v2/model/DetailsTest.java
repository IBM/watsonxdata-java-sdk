/*
 * (C) Copyright IBM Corp. 2025.
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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Details;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ExternalDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.InternalDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.JdbcThriftUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Details model.
 */
public class DetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDetails() throws Throwable {
    Details detailsModel = new Details();
    assertNull(detailsModel.getCaCertificate());
    assertNull(detailsModel.getDefaultConfigs());
    assertNull(detailsModel.getExternal());
    assertNull(detailsModel.getGrpcApiEndpoint());
    assertNull(detailsModel.getHostname());
    assertNull(detailsModel.getId());
    assertNull(detailsModel.getInstanceCrn());
    assertNull(detailsModel.getInstanceId());
    assertNull(detailsModel.getInternal());
    assertNull(detailsModel.getJdbcClass());
    assertNull(detailsModel.getJdbcUrls());
    assertNull(detailsModel.getName());
    assertNull(detailsModel.getPort());
    assertNull(detailsModel.getRestApiEndpoint());
    assertNull(detailsModel.getSparkEngineEndpoint());
    assertNull(detailsModel.getSslCertificate());
    assertNull(detailsModel.getThriftUrls());
    assertNull(detailsModel.getVersion());
    assertNull(detailsModel.getWatsonxDataApplicationEndpoint());
  }
}