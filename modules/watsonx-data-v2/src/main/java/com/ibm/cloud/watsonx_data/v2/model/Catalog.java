/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EngineCatalog.
 */
public class Catalog extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("creation_date")
  protected String creationDate;

  protected Catalog() { }

  /**
   * Gets the catalogName.
   *
   * Name for the catalog.
   *
   * @return the catalogName
   */
  public String getCatalogName() {
    return catalogName;
  }

  /**
   * Gets the creationDate.
   *
   * Creation date.
   *
   * @return the creationDate
   */
  public String getCreationDate() {
    return creationDate;
  }
}

