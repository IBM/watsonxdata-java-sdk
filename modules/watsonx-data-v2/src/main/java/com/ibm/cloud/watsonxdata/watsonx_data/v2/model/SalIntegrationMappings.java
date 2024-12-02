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
 * Sal Integration Mappings object.
 */
public class SalIntegrationMappings extends GenericModel {

  @SerializedName("wkc_catalog_id")
  protected String wkcCatalogId;
  @SerializedName("wkc_project_id")
  protected String wkcProjectId;

  protected SalIntegrationMappings() { }

  /**
   * Gets the wkcCatalogId.
   *
   * catalog name.
   *
   * @return the wkcCatalogId
   */
  public String getWkcCatalogId() {
    return wkcCatalogId;
  }

  /**
   * Gets the wkcProjectId.
   *
   * operation type.
   *
   * @return the wkcProjectId
   */
  public String getWkcProjectId() {
    return wkcProjectId;
  }
}

