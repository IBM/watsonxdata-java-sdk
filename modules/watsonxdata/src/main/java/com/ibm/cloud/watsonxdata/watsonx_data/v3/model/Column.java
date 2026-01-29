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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Column details.
 */
public class Column extends GenericModel {

  protected String comment;
  protected String extra;
  protected String length;
  protected String name;
  protected String precision;
  protected String scale;
  protected String type;

  protected Column() { }

  /**
   * Gets the comment.
   *
   * Optional comment or description of the column.
   *
   * @return the comment
   */
  public String getComment() {
    return comment;
  }

  /**
   * Gets the extra.
   *
   * Extra column attributes, e.g., AUTO_INCREMENT, DEFAULT, etc.
   *
   * @return the extra
   */
  public String getExtra() {
    return extra;
  }

  /**
   * Gets the length.
   *
   * Length for types like VARCHAR or CHAR. Should be a numeric string.
   *
   * @return the length
   */
  public String getLength() {
    return length;
  }

  /**
   * Gets the name.
   *
   * Valid SQL column name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the precision.
   *
   * Precision (total number of digits) for numeric types like DECIMAL.
   *
   * @return the precision
   */
  public String getPrecision() {
    return precision;
  }

  /**
   * Gets the scale.
   *
   * Scale (number of digits after the decimal point) for numeric types like DECIMAL.
   *
   * @return the scale
   */
  public String getScale() {
    return scale;
  }

  /**
   * Gets the type.
   *
   * SQL data type, e.g., varchar, int, decimal(10,2), etc.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

