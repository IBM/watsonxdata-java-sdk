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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * semantic name properties.
 */
public class SalEnrichmentDataAssetDetailEntityDataAssetSemanticName extends GenericModel {

  @SerializedName("expanded_name")
  protected String expandedName;

  protected SalEnrichmentDataAssetDetailEntityDataAssetSemanticName() { }

  /**
   * Gets the expandedName.
   *
   * enriched result as semantic table name.
   *
   * @return the expandedName
   */
  public String getExpandedName() {
    return expandedName;
  }
}

