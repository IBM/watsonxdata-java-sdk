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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.GetDataPolicyMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyRuleV2;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PolicyV2;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RowFilterProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TransformColumnResponseProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PolicyV2 model.
 */
public class PolicyV2Test {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPolicyV2() throws Throwable {
    PolicyV2 policyV2Model = new PolicyV2();
    assertNull(policyV2Model.getCatalogName());
    assertNull(policyV2Model.getDataArtifact());
    assertNull(policyV2Model.getDescription());
    assertNull(policyV2Model.getMetadata());
    assertNull(policyV2Model.getPolicyName());
    assertNull(policyV2Model.getResourceId());
    assertNull(policyV2Model.getRuleCount());
    assertNull(policyV2Model.getRules());
    assertNull(policyV2Model.getStatus());
  }
}