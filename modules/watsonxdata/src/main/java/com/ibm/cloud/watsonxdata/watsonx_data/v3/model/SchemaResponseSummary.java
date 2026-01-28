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
 * Summary of the schema response.
 */
public class SchemaResponseSummary extends GenericModel {

  protected String catalog;
  @SerializedName("catalog_type")
  protected String catalogType;
  protected String owner;
  @SerializedName("schema_name")
  protected String schemaName;
  protected String storage;

  protected SchemaResponseSummary() { }

  /**
   * Gets the catalog.
   *
   * The catalog that this schema is associated to.
   *
   * @return the catalog
   */
  public String getCatalog() {
    return catalog;
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

  /**
   * Gets the owner.
   *
   * Owner of the storage.
   *
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * Gets the schemaName.
   *
   * Name of the schema.
   *
   * @return the schemaName
   */
  public String getSchemaName() {
    return schemaName;
  }

  /**
   * Gets the storage.
   *
   * The storage linked to the catalog.
   *
   * @return the storage
   */
  public String getStorage() {
    return storage;
  }
}

