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
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchResultsItem;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.model.SemanticSearchResultsItemMatchedColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v3.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SemanticSearchResultsItem model.
 */
public class SemanticSearchResultsItemTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSemanticSearchResultsItem() throws Throwable {
    SemanticSearchResultsItem semanticSearchResultsItemModel = new SemanticSearchResultsItem();
    assertNull(semanticSearchResultsItemModel.getArtifactType());
    assertNull(semanticSearchResultsItemModel.getAssetId());
    assertNull(semanticSearchResultsItemModel.getCatalogName());
    assertNull(semanticSearchResultsItemModel.getDescription());
    assertNull(semanticSearchResultsItemModel.getHighlight());
    assertNull(semanticSearchResultsItemModel.getMatchedColumns());
    assertNull(semanticSearchResultsItemModel.getName());
    assertNull(semanticSearchResultsItemModel.getPath());
    assertNull(semanticSearchResultsItemModel.getProjectId());
    assertNull(semanticSearchResultsItemModel.getProviderType());
    assertNull(semanticSearchResultsItemModel.getSchemaName());
    assertNull(semanticSearchResultsItemModel.getSearchScore());
    assertNull(semanticSearchResultsItemModel.getSemanticDescription());
    assertNull(semanticSearchResultsItemModel.getSemanticName());
    assertNull(semanticSearchResultsItemModel.getState());
    assertNull(semanticSearchResultsItemModel.getTableName());
    assertNull(semanticSearchResultsItemModel.getTags());
    assertNull(semanticSearchResultsItemModel.getTerms());
  }
}