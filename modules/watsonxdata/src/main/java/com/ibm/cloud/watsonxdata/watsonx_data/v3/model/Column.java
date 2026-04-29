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

  /**
   * Builder.
   */
  public static class Builder {
    private String comment;
    private String extra;
    private String length;
    private String name;
    private String precision;
    private String scale;
    private String type;

    /**
     * Instantiates a new Builder from an existing Column instance.
     *
     * @param column the instance to initialize the Builder with
     */
    private Builder(Column column) {
      this.comment = column.comment;
      this.extra = column.extra;
      this.length = column.length;
      this.name = column.name;
      this.precision = column.precision;
      this.scale = column.scale;
      this.type = column.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Column.
     *
     * @return the new Column instance
     */
    public Column build() {
      return new Column(this);
    }

    /**
     * Set the comment.
     *
     * @param comment the comment
     * @return the Column builder
     */
    public Builder comment(String comment) {
      this.comment = comment;
      return this;
    }

    /**
     * Set the extra.
     *
     * @param extra the extra
     * @return the Column builder
     */
    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }

    /**
     * Set the length.
     *
     * @param length the length
     * @return the Column builder
     */
    public Builder length(String length) {
      this.length = length;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the Column builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the precision.
     *
     * @param precision the precision
     * @return the Column builder
     */
    public Builder precision(String precision) {
      this.precision = precision;
      return this;
    }

    /**
     * Set the scale.
     *
     * @param scale the scale
     * @return the Column builder
     */
    public Builder scale(String scale) {
      this.scale = scale;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Column builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected Column() { }

  protected Column(Builder builder) {
    comment = builder.comment;
    extra = builder.extra;
    length = builder.length;
    name = builder.name;
    precision = builder.precision;
    scale = builder.scale;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a Column builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the comment.
   *
   * Optional comment or description of the column.
   *
   * @return the comment
   */
  public String comment() {
    return comment;
  }

  /**
   * Gets the extra.
   *
   * Extra column attributes, e.g., AUTO_INCREMENT, DEFAULT, etc.
   *
   * @return the extra
   */
  public String extra() {
    return extra;
  }

  /**
   * Gets the length.
   *
   * Length for types like VARCHAR or CHAR. Should be a numeric string.
   *
   * @return the length
   */
  public String length() {
    return length;
  }

  /**
   * Gets the name.
   *
   * Valid SQL column name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the precision.
   *
   * Precision (total number of digits) for numeric types like DECIMAL.
   *
   * @return the precision
   */
  public String precision() {
    return precision;
  }

  /**
   * Gets the scale.
   *
   * Scale (number of digits after the decimal point) for numeric types like DECIMAL.
   *
   * @return the scale
   */
  public String scale() {
    return scale;
  }

  /**
   * Gets the type.
   *
   * SQL data type, e.g., varchar, int, decimal(10,2), etc.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

