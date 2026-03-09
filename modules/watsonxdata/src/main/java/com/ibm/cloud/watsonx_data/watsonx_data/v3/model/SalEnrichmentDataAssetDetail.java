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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of Sal enriched data assets in Watsonx.data Intelligence.
 */
public class SalEnrichmentDataAssetDetail extends GenericModel {

  protected SalEnrichmentDataAssetDetailEntity entity;
  protected SalEnrichmentDataAssetDetailMetadata metadata;

  protected SalEnrichmentDataAssetDetail() { }

  /**
   * Gets the entity.
   *
   * data asset entity.
   *
   * @return the entity
   */
  public SalEnrichmentDataAssetDetailEntity getEntity() {
    return entity;
  }

  /**
   * Gets the metadata.
   *
   * data asset(table) metadata properties.
   *
   * @return the metadata
   */
  public SalEnrichmentDataAssetDetailMetadata getMetadata() {
    return metadata;
  }
}

