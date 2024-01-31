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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RunExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RunExplainStatementOptions model.
 */
public class RunExplainStatementOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRunExplainStatementOptions() throws Throwable {
    RunExplainStatementOptions runExplainStatementOptionsModel = new RunExplainStatementOptions.Builder()
      .engineId("testString")
      .statement("show schemas in catalog_name")
      .format("json")
      .type("io")
      .authInstanceId("testString")
      .build();
    assertEquals(runExplainStatementOptionsModel.engineId(), "testString");
    assertEquals(runExplainStatementOptionsModel.statement(), "show schemas in catalog_name");
    assertEquals(runExplainStatementOptionsModel.format(), "json");
    assertEquals(runExplainStatementOptionsModel.type(), "io");
    assertEquals(runExplainStatementOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunExplainStatementOptionsError() throws Throwable {
    new RunExplainStatementOptions.Builder().build();
  }

}