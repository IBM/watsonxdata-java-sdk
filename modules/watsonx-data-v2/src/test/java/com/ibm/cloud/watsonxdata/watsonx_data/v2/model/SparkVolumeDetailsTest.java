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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkVolumeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkVolumeDetails model.
 */
public class SparkVolumeDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkVolumeDetails() throws Throwable {
    SparkVolumeDetails sparkVolumeDetailsModel = new SparkVolumeDetails.Builder()
      .mountPath("/mount/path")
      .name("my-volume")
      .readOnly(true)
      .sourceSubPath("/source/path")
      .build();
    assertEquals(sparkVolumeDetailsModel.mountPath(), "/mount/path");
    assertEquals(sparkVolumeDetailsModel.name(), "my-volume");
    assertEquals(sparkVolumeDetailsModel.readOnly(), Boolean.valueOf(true));
    assertEquals(sparkVolumeDetailsModel.sourceSubPath(), "/source/path");

    String json = TestUtilities.serialize(sparkVolumeDetailsModel);

    SparkVolumeDetails sparkVolumeDetailsModelNew = TestUtilities.deserialize(json, SparkVolumeDetails.class);
    assertTrue(sparkVolumeDetailsModelNew instanceof SparkVolumeDetails);
    assertEquals(sparkVolumeDetailsModelNew.mountPath(), "/mount/path");
    assertEquals(sparkVolumeDetailsModelNew.name(), "my-volume");
    assertEquals(sparkVolumeDetailsModelNew.readOnly(), Boolean.valueOf(true));
    assertEquals(sparkVolumeDetailsModelNew.sourceSubPath(), "/source/path");
  }
}