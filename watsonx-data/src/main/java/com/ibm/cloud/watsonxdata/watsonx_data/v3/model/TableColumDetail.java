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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TableColumDetail.
 */
public class TableColumDetail extends GenericModel {

  protected String catalog;
  protected List<TableColumDetailColumnsItems> columns;
  protected String owner;
  protected String schema;
  protected String storage;
  protected String table;

  protected TableColumDetail() { }

  /**
   * Gets the catalog.
   *
   * Catalog that this table belongs to.
   *
   * @return the catalog
   */
  public String getCatalog() {
    return catalog;
  }

  /**
   * Gets the columns.
   *
   * List of all column information about the table.
   *
   * @return the columns
   */
  public List<TableColumDetailColumnsItems> getColumns() {
    return columns;
  }

  /**
   * Gets the owner.
   *
   * Name of the user who created the table.
   *
   * @return the owner
   */
  public String getOwner() {
    return owner;
  }

  /**
   * Gets the schema.
   *
   * Schema that this table belongs to.
   *
   * @return the schema
   */
  public String getSchema() {
    return schema;
  }

  /**
   * Gets the storage.
   *
   * Bucket linked to the catalog.
   *
   * @return the storage
   */
  public String getStorage() {
    return storage;
  }

  /**
   * Gets the table.
   *
   * Name of the table.
   *
   * @return the table
   */
  public String getTable() {
    return table;
  }
}

