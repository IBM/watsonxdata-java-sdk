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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePatchRemoveEngineProperties;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.PrestoEnginePropertiesCatalog;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesOaiGenConfiguration;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.RemoveEnginePropertiesOaiGenJvm;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PrestoEnginePatchRemoveEngineProperties model.
 */
public class PrestoEnginePatchRemoveEnginePropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPrestoEnginePatchRemoveEngineProperties() throws Throwable {
    PrestoEnginePropertiesCatalog prestoEnginePropertiesCatalogModel = new PrestoEnginePropertiesCatalog.Builder()
      .catalogName("testString")
      .build();
    assertEquals(prestoEnginePropertiesCatalogModel.catalogName(), "testString");

    RemoveEnginePropertiesOaiGenConfiguration removeEnginePropertiesOaiGenConfigurationModel = new RemoveEnginePropertiesOaiGenConfiguration.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesOaiGenConfigurationModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesOaiGenConfigurationModel.worker(), java.util.Arrays.asList("testString"));

    RemoveEnginePropertiesOaiGenJvm removeEnginePropertiesOaiGenJvmModel = new RemoveEnginePropertiesOaiGenJvm.Builder()
      .coordinator(java.util.Arrays.asList("testString"))
      .worker(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(removeEnginePropertiesOaiGenJvmModel.coordinator(), java.util.Arrays.asList("testString"));
    assertEquals(removeEnginePropertiesOaiGenJvmModel.worker(), java.util.Arrays.asList("testString"));

    PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEnginePropertiesModel = new PrestoEnginePatchRemoveEngineProperties.Builder()
      .catalog(prestoEnginePropertiesCatalogModel)
      .configuration(removeEnginePropertiesOaiGenConfigurationModel)
      .jvm(removeEnginePropertiesOaiGenJvmModel)
      .eventListener(java.util.Arrays.asList())
      .build();
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.catalog(), prestoEnginePropertiesCatalogModel);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.configuration(), removeEnginePropertiesOaiGenConfigurationModel);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.jvm(), removeEnginePropertiesOaiGenJvmModel);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModel.eventListener(), java.util.Arrays.asList());

    String json = TestUtilities.serialize(prestoEnginePatchRemoveEnginePropertiesModel);

    PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEnginePropertiesModelNew = TestUtilities.deserialize(json, PrestoEnginePatchRemoveEngineProperties.class);
    assertTrue(prestoEnginePatchRemoveEnginePropertiesModelNew instanceof PrestoEnginePatchRemoveEngineProperties);
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModelNew.catalog().toString(), prestoEnginePropertiesCatalogModel.toString());
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModelNew.configuration().toString(), removeEnginePropertiesOaiGenConfigurationModel.toString());
    assertEquals(prestoEnginePatchRemoveEnginePropertiesModelNew.jvm().toString(), removeEnginePropertiesOaiGenJvmModel.toString());
  }
}