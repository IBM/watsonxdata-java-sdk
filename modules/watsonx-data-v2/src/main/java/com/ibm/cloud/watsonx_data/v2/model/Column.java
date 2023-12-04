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
 * Column.
 */
public class Column extends GenericModel {

  @SerializedName("column_name")
  protected String columnName;
  protected String comment;
  protected String extra;
  protected String type;

  protected Column() { }

  /**
   * Gets the columnName.
   *
   * Column name.
   *
   * @return the columnName
   */
  public String getColumnName() {
    return columnName;
  }

  /**
   * Gets the comment.
   *
   * Comment.
   *
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * Gets the extra.
   *
   * Extra.
   *
   * @return the extra
   */
  public String getExtra() {
    return extra;
  }

  /**
   * Gets the type.
   *
   * Data type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

