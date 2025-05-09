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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * TableColumDetailColumnsItems.
 */
public class TableColumDetailColumnsItems extends GenericModel {

  protected String column;
  protected Long index;
  protected String type;

  protected TableColumDetailColumnsItems() { }

  /**
   * Gets the column.
   *
   * Name of the column.
   *
   * @return the column
   */
  public String getColumn() {
    return column;
  }

  /**
   * Gets the index.
   *
   * column idx_integer.
   *
   * @return the index
   */
  public Long getIndex() {
    return index;
  }

  /**
   * Gets the type.
   *
   * data type for the column.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

