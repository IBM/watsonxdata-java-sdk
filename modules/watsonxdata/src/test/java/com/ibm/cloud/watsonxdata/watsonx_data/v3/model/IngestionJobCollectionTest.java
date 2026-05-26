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
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJob;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.IngestionJobCollection;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.PagedResultsLink;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IngestionJobCollection model.
 */
public class IngestionJobCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIngestionJobCollection() throws Throwable {
    IngestionJobCollection ingestionJobCollectionModel = new IngestionJobCollection();
    assertNull(ingestionJobCollectionModel.getLimit());
    assertNull(ingestionJobCollectionModel.getOffset());
    assertNull(ingestionJobCollectionModel.getTotalCount());
    assertNull(ingestionJobCollectionModel.getJobs());
    assertNull(ingestionJobCollectionModel.getFirst());
    assertNull(ingestionJobCollectionModel.getLast());
    assertNull(ingestionJobCollectionModel.getNext());
  }
}