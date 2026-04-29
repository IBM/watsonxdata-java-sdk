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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Item of SAL metadata Mappings details for watsonx.data schema in IKC metadata.
 */
public class SalIntegrationMappingObj extends GenericModel {

  @SerializedName("wkc_catalog_id")
  protected String wkcCatalogId;
  @SerializedName("wkc_project_id")
  protected String wkcProjectId;
  @SerializedName("wxd_catalog_name")
  protected String wxdCatalogName;
  @SerializedName("wxd_schema_name")
  protected String wxdSchemaName;

  protected SalIntegrationMappingObj() { }

  /**
   * Gets the wkcCatalogId.
   *
   * corresponding catalog id in IKC.
   *
   * @return the wkcCatalogId
   */
  public String getWkcCatalogId() {
    return wkcCatalogId;
  }

  /**
   * Gets the wkcProjectId.
   *
   * corresponding project id in IKC.
   *
   * @return the wkcProjectId
   */
  public String getWkcProjectId() {
    return wkcProjectId;
  }

  /**
   * Gets the wxdCatalogName.
   *
   * catalog name in Watsonx.data.
   *
   * @return the wxdCatalogName
   */
  public String getWxdCatalogName() {
    return wxdCatalogName;
  }

  /**
   * Gets the wxdSchemaName.
   *
   * schema name in Watsonx.data.
   *
   * @return the wxdSchemaName
   */
  public String getWxdSchemaName() {
    return wxdSchemaName;
  }
}

