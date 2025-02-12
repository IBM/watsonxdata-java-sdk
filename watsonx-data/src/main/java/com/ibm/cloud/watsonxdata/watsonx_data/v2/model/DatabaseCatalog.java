/*
 * (C) Copyright IBM Corp. 2025.
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
 * database catalog.
 */
public class DatabaseCatalog extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("catalog_tags")
  protected List<String> catalogTags;
  @SerializedName("catalog_type")
  protected String catalogType;

  protected DatabaseCatalog() { }

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
   * Gets the catalogTags.
   *
   * catalog tags.
   *
   * @return the catalogTags
   */
  public List<String> getCatalogTags() {
    return catalogTags;
  }

  /**
   * Gets the catalogType.
   *
   * catalog type.
   *
   * @return the catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }
}

