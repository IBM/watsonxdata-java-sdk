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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * SemanticSearchResultsItemMatchedColumnsItems.
 */
public class SemanticSearchResultsItemMatchedColumnsItems extends GenericModel {

  @SerializedName("asset_id")
  protected String assetId;
  protected String description;
  protected Map<String, List<String>> highlight;
  protected String name;
  @SerializedName("semantic_description")
  protected String semanticDescription;
  @SerializedName("semantic_name")
  protected String semanticName;

  protected SemanticSearchResultsItemMatchedColumnsItems() { }

  /**
   * Gets the assetId.
   *
   * Watsonx.data Intelligence asset id.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the description.
   *
   * column description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the highlight.
   *
   * matching fields details from elasticsearch highlight.
   *
   * @return the highlight
   */
  public Map<String, List<String>> getHighlight() {
    return highlight;
  }

  /**
   * Gets the name.
   *
   * column name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the semanticDescription.
   *
   * semantic description.
   *
   * @return the semanticDescription
   */
  public String getSemanticDescription() {
    return semanticDescription;
  }

  /**
   * Gets the semanticName.
   *
   * semantic name.
   *
   * @return the semanticName
   */
  public String getSemanticName() {
    return semanticName;
  }
}

