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
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * TableColumDetailColumnsItems.
 *
 * This type supports additional properties of type Object.
 */
public class TableColumDetailColumnsItems extends DynamicModel<Object> {

  @SerializedName("column")
  protected String column;
  @SerializedName("index")
  protected Long index;
  @SerializedName("nullable")
  protected Boolean nullable;
  @SerializedName("precision")
  protected Long precision;
  @SerializedName("scale")
  protected Long scale;
  @SerializedName("signed")
  protected Boolean signed;
  @SerializedName("type")
  protected String type;

  public TableColumDetailColumnsItems() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the column.
   *
   * Name of the column.
   *
   * @return the column
   */
  public String getColumn() {
    return this.column;
  }

  /**
   * Gets the index.
   *
   * column idx_integer.
   *
   * @return the index
   */
  public Long getIndex() {
    return this.index;
  }

  /**
   * Gets the nullable.
   *
   * nullable.
   *
   * @return the nullable
   */
  public Boolean isNullable() {
    return this.nullable;
  }

  /**
   * Gets the precision.
   *
   * precision.
   *
   * @return the precision
   */
  public Long getPrecision() {
    return this.precision;
  }

  /**
   * Gets the scale.
   *
   * scale.
   *
   * @return the scale
   */
  public Long getScale() {
    return this.scale;
  }

  /**
   * Gets the signed.
   *
   * signed.
   *
   * @return the signed
   */
  public Boolean isSigned() {
    return this.signed;
  }

  /**
   * Gets the type.
   *
   * data type for the column.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }
}
