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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Encrichment asset.
 */
public class EnrichmentAsset extends GenericModel {

  @SerializedName("asset_attributes")
  protected List<String> assetAttributes;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("asset_name")
  protected String assetName;
  @SerializedName("resource_key")
  protected String resourceKey;
  @SerializedName("schema_name")
  protected String schemaName;

  protected EnrichmentAsset() { }

  /**
   * Gets the assetAttributes.
   *
   * schema name.
   *
   * @return the assetAttributes
   */
  public List<String> getAssetAttributes() {
    return assetAttributes;
  }

  /**
   * Gets the assetId.
   *
   * data asset id.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the assetName.
   *
   * asset name.
   *
   * @return the assetName
   */
  public String getAssetName() {
    return assetName;
  }

  /**
   * Gets the resourceKey.
   *
   * resource name.
   *
   * @return the resourceKey
   */
  public String getResourceKey() {
    return resourceKey;
  }

  /**
   * Gets the schemaName.
   *
   * schema.
   *
   * @return the schemaName
   */
  public String getSchemaName() {
    return schemaName;
  }
}

