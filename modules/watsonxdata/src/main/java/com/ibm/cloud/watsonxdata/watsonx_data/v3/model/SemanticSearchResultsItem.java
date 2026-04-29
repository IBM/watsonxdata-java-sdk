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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * collection of semantic search query results.
 */
public class SemanticSearchResultsItem extends GenericModel {

  @SerializedName("artifact_type")
  protected String artifactType;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("catalog_name")
  protected String catalogName;
  protected String description;
  protected Map<String, List<String>> highlight;
  @SerializedName("matched_columns")
  protected List<SemanticSearchResultsItemMatchedColumnsItems> matchedColumns;
  protected String name;
  protected String path;
  @SerializedName("project_id")
  protected String projectId;
  @SerializedName("provider_type")
  protected String providerType;
  @SerializedName("schema_name")
  protected String schemaName;
  @SerializedName("search_score")
  protected Float searchScore;
  @SerializedName("semantic_description")
  protected String semanticDescription;
  @SerializedName("semantic_name")
  protected String semanticName;
  protected String state;
  @SerializedName("table_name")
  protected String tableName;
  protected List<String> tags;
  protected List<String> terms;

  protected SemanticSearchResultsItem() { }

  /**
   * Gets the artifactType.
   *
   * artifact type.
   *
   * @return the artifactType
   */
  public String getArtifactType() {
    return artifactType;
  }

  /**
   * Gets the assetId.
   *
   * IKC asset id.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the catalogName.
   *
   * catalog name.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the description.
   *
   * semantic description.
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
   * Gets the matchedColumns.
   *
   * collection of columns hit by search.
   *
   * @return the matchedColumns
   */
  public List<SemanticSearchResultsItemMatchedColumnsItems> getMatchedColumns() {
    return matchedColumns;
  }

  /**
   * Gets the name.
   *
   * asset name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the path.
   *
   * asset path.
   *
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Gets the projectId.
   *
   * IKC project id.
   *
   * @return the projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * Gets the providerType.
   *
   * asset provider type.
   *
   * @return the providerType
   */
  public String getProviderType() {
    return providerType;
  }

  /**
   * Gets the schemaName.
   *
   * schema name.
   *
   * @return the schemaName
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * Gets the searchScore.
   *
   * global search score.
   *
   * @return the searchScore
   */
  public Float getSearchScore() {
    return searchScore;
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

  /**
   * Gets the state.
   *
   * status of the asset.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the tableName.
   *
   * table name.
   *
   * @return the tableName
   */
  public String getTableName() {
    return tableName;
  }

  /**
   * Gets the tags.
   *
   * asset tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the terms.
   *
   * bussiness terms.
   *
   * @return the terms
   */
  public List<String> getTerms() {
    return terms;
  }
}

