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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Metadata information about the job.
 */
public class SalIntegrationEnrichmentJobsResultItemMetadata extends GenericModel {

  @SerializedName("asset_id")
  protected String assetId;
  protected String name;
  @SerializedName("owner_id")
  protected String ownerId;
  protected Long version;

  protected SalIntegrationEnrichmentJobsResultItemMetadata() { }

  /**
   * Gets the assetId.
   *
   * The ID of the asset.
   *
   * @return the assetId
   */
  public String getAssetId() {
    return assetId;
  }

  /**
   * Gets the name.
   *
   * Name of the job.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the ownerId.
   *
   * ID of the owner of the job.
   *
   * @return the ownerId
   */
  public String getOwnerId() {
    return ownerId;
  }

  /**
   * Gets the version.
   *
   * Version of the job.
   *
   * @return the version
   */
  public Long getVersion() {
    return version;
  }
}

