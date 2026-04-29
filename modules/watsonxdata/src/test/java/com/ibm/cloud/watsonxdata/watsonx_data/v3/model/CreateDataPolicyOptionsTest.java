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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.CreateDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RowFilterProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RuleV2;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.TransformColumnProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataPolicyOptions model.
 */
public class CreateDataPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataPolicyOptions() throws Throwable {
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .key("user_name")
      .type("user_identity")
      .value("user1")
      .build();
    assertEquals(ruleGranteeModel.key(), "user_name");
    assertEquals(ruleGranteeModel.type(), "user_identity");
    assertEquals(ruleGranteeModel.value(), "user1");

    TransformColumnProperties transformColumnPropertiesModel = new TransformColumnProperties.Builder()
      .maskCondition("NIL")
      .maskType("mask_show_last_4")
      .maskValue("NIL")
      .build();
    assertEquals(transformColumnPropertiesModel.maskCondition(), "NIL");
    assertEquals(transformColumnPropertiesModel.maskType(), "mask_show_last_4");
    assertEquals(transformColumnPropertiesModel.maskValue(), "NIL");

    RowFilterProperties rowFilterPropertiesModel = new RowFilterProperties.Builder()
      .filterCondition("NIL")
      .rowFilter("addr_country='US'")
      .build();
    assertEquals(rowFilterPropertiesModel.filterCondition(), "NIL");
    assertEquals(rowFilterPropertiesModel.rowFilter(), "addr_country='US'");

    RuleV2 ruleV2Model = new RuleV2.Builder()
      .actions(java.util.Arrays.asList("alter", "create"))
      .effect("allow")
      .grantees(java.util.Arrays.asList(ruleGranteeModel))
      .transformColumns(transformColumnPropertiesModel)
      .transformRows(rowFilterPropertiesModel)
      .build();
    assertEquals(ruleV2Model.actions(), java.util.Arrays.asList("alter", "create"));
    assertEquals(ruleV2Model.effect(), "allow");
    assertEquals(ruleV2Model.grantees(), java.util.Arrays.asList(ruleGranteeModel));
    assertEquals(ruleV2Model.transformColumns(), transformColumnPropertiesModel);
    assertEquals(ruleV2Model.transformRows(), rowFilterPropertiesModel);

    CreateDataPolicyOptions createDataPolicyOptionsModel = new CreateDataPolicyOptions.Builder()
      .dataArtifact("schema1/table1/(column1|column2)")
      .rules(java.util.Arrays.asList(ruleV2Model))
      .catalogName("catalog1")
      .catalogType("catalog1")
      .description("policy description")
      .policyName("policy1")
      .resourceId("catalog1")
      .status("active")
      .authInstanceId("testString")
      .build();
    assertEquals(createDataPolicyOptionsModel.dataArtifact(), "schema1/table1/(column1|column2)");
    assertEquals(createDataPolicyOptionsModel.rules(), java.util.Arrays.asList(ruleV2Model));
    assertEquals(createDataPolicyOptionsModel.catalogName(), "catalog1");
    assertEquals(createDataPolicyOptionsModel.catalogType(), "catalog1");
    assertEquals(createDataPolicyOptionsModel.description(), "policy description");
    assertEquals(createDataPolicyOptionsModel.policyName(), "policy1");
    assertEquals(createDataPolicyOptionsModel.resourceId(), "catalog1");
    assertEquals(createDataPolicyOptionsModel.status(), "active");
    assertEquals(createDataPolicyOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataPolicyOptionsError() throws Throwable {
    new CreateDataPolicyOptions.Builder().build();
  }

}