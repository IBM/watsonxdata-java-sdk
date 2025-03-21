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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetailsProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ConnectionPropertiesDetailsPropertiesConnectionItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.Details;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ExternalDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.InternalDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.JdbcThriftUrls;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.ServicesDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ServicesDetails model.
 */
public class ServicesDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testServicesDetails() throws Throwable {
    ServicesDetails servicesDetailsModel = new ServicesDetails();
    assertNull(servicesDetailsModel.getEnginesServices());
  }
}