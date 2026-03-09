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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * data asset entity.
 */
public class SalEnrichmentDataAssetDetailEntity extends GenericModel {

  @SerializedName("asset_terms")
  protected SalEnrichmentDataAssetDetailEntityAssetTerms assetTerms;
  @SerializedName("column_info")
  protected Map<String, ColumnInfoAdditionalProperties> columnInfo;
  @SerializedName("data_asset")
  protected SalEnrichmentDataAssetDetailEntityDataAsset dataAsset;
  @SerializedName("metadata_enrichment_publish_info")
  protected SalEnrichmentDataAssetDetailEntityMetadataEnrichmentPublishInfo metadataEnrichmentPublishInfo;

  protected SalEnrichmentDataAssetDetailEntity() { }

  /**
   * Gets the assetTerms.
   *
   * glossary terms properties.
   *
   * @return the assetTerms
   */
  public SalEnrichmentDataAssetDetailEntityAssetTerms getAssetTerms() {
    return assetTerms;
  }

  /**
   * Gets the columnInfo.
   *
   * Mapping of column names to their semantic and description metadata.
   *
   * @return the columnInfo
   */
  public Map<String, ColumnInfoAdditionalProperties> getColumnInfo() {
    return columnInfo;
  }

  /**
   * Gets the dataAsset.
   *
   * data asset properties detail.
   *
   * @return the dataAsset
   */
  public SalEnrichmentDataAssetDetailEntityDataAsset getDataAsset() {
    return dataAsset;
  }

  /**
   * Gets the metadataEnrichmentPublishInfo.
   *
   * publish statement of the enrichment Content.
   *
   * @return the metadataEnrichmentPublishInfo
   */
  public SalEnrichmentDataAssetDetailEntityMetadataEnrichmentPublishInfo getMetadataEnrichmentPublishInfo() {
    return metadataEnrichmentPublishInfo;
  }
}

