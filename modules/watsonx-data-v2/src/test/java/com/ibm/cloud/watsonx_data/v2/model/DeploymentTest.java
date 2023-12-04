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
import com.ibm.cloud.watsonx_data.v2.model.Deployment;
import com.ibm.cloud.watsonx_data.v2.model.DeploymentPlatformOptions;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Deployment model.
 */
public class DeploymentTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeployment() throws Throwable {
    Deployment deploymentModel = new Deployment();
    assertNull(deploymentModel.getCloudType());
    assertNull(deploymentModel.isEnablePrivateEndpoints());
    assertNull(deploymentModel.isEnablePublicEndpoints());
    assertNull(deploymentModel.isFirstTimeUse());
    assertNull(deploymentModel.getFormationId());
    assertNull(deploymentModel.getId());
    assertNull(deploymentModel.getPlanId());
    assertNull(deploymentModel.getPlatformOptions());
    assertNull(deploymentModel.getRegion());
    assertNull(deploymentModel.getResourceGroupCrn());
    assertNull(deploymentModel.getType());
    assertNull(deploymentModel.getVersion());
  }
}