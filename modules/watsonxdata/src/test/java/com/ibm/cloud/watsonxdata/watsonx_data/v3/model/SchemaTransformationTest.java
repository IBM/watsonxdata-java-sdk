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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaTransformation;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SchemaTransformation model.
 */
public class SchemaTransformationTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSchemaTransformation() throws Throwable {
    SchemaTransformation schemaTransformationModel = new SchemaTransformation.Builder()
      .oldColumn("old_column_name")
      .newColumn("new_column_name")
      .newType("string")
      .build();
    assertEquals(schemaTransformationModel.oldColumn(), "old_column_name");
    assertEquals(schemaTransformationModel.newColumn(), "new_column_name");
    assertEquals(schemaTransformationModel.newType(), "string");

    String json = TestUtilities.serialize(schemaTransformationModel);

    SchemaTransformation schemaTransformationModelNew = TestUtilities.deserialize(json, SchemaTransformation.class);
    assertTrue(schemaTransformationModelNew instanceof SchemaTransformation);
    assertEquals(schemaTransformationModelNew.oldColumn(), "old_column_name");
    assertEquals(schemaTransformationModelNew.newColumn(), "new_column_name");
    assertEquals(schemaTransformationModelNew.newType(), "string");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSchemaTransformationError() throws Throwable {
    new SchemaTransformation.Builder().build();
  }

}