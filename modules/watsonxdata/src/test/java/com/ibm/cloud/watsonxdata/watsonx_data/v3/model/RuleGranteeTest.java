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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RuleGrantee model.
 */
public class RuleGranteeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRuleGrantee() throws Throwable {
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .key("user_name")
      .type("user_identity")
      .value("user1")
      .build();
    assertEquals(ruleGranteeModel.key(), "user_name");
    assertEquals(ruleGranteeModel.type(), "user_identity");
    assertEquals(ruleGranteeModel.value(), "user1");

    String json = TestUtilities.serialize(ruleGranteeModel);

    RuleGrantee ruleGranteeModelNew = TestUtilities.deserialize(json, RuleGrantee.class);
    assertTrue(ruleGranteeModelNew instanceof RuleGrantee);
    assertEquals(ruleGranteeModelNew.key(), "user_name");
    assertEquals(ruleGranteeModelNew.type(), "user_identity");
    assertEquals(ruleGranteeModelNew.value(), "user1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRuleGranteeError() throws Throwable {
    new RuleGrantee.Builder().build();
  }

}