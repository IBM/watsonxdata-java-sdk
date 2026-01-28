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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SchemaPrototype;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SchemaPrototype model.
 */
public class SchemaPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSchemaPrototype() throws Throwable {
    SchemaPrototype schemaPrototypeModel = new SchemaPrototype.Builder()
      .customPath("sample-path")
      .hostname("db2@hostname.com")
      .name("SampleSchema1")
      .port(Long.valueOf("4553"))
      .storageName("sample-bucket")
      .build();
    assertEquals(schemaPrototypeModel.customPath(), "sample-path");
    assertEquals(schemaPrototypeModel.hostname(), "db2@hostname.com");
    assertEquals(schemaPrototypeModel.name(), "SampleSchema1");
    assertEquals(schemaPrototypeModel.port(), Long.valueOf("4553"));
    assertEquals(schemaPrototypeModel.storageName(), "sample-bucket");

    String json = TestUtilities.serialize(schemaPrototypeModel);

    SchemaPrototype schemaPrototypeModelNew = TestUtilities.deserialize(json, SchemaPrototype.class);
    assertTrue(schemaPrototypeModelNew instanceof SchemaPrototype);
    assertEquals(schemaPrototypeModelNew.customPath(), "sample-path");
    assertEquals(schemaPrototypeModelNew.hostname(), "db2@hostname.com");
    assertEquals(schemaPrototypeModelNew.name(), "SampleSchema1");
    assertEquals(schemaPrototypeModelNew.port(), Long.valueOf("4553"));
    assertEquals(schemaPrototypeModelNew.storageName(), "sample-bucket");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSchemaPrototypeError() throws Throwable {
    new SchemaPrototype.Builder().build();
  }

}