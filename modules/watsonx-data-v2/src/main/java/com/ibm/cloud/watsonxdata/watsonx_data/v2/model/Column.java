/*
 * (C) Copyright IBM Corp. 2024.
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
  protected String length;
  protected String scale;
  protected String precision;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String columnName;
    private String comment;
    private String extra;
    private String length;
    private String scale;
    private String precision;
    private String type;

    /**
     * Instantiates a new Builder from an existing Column instance.
     *
     * @param column the instance to initialize the Builder with
     */
    private Builder(Column column) {
      this.columnName = column.columnName;
      this.comment = column.comment;
      this.extra = column.extra;
      this.length = column.length;
      this.scale = column.scale;
      this.precision = column.precision;
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
     * Set the columnName.
     *
     * @param columnName the columnName
     * @return the Column builder
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
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
    columnName = builder.columnName;
    comment = builder.comment;
    extra = builder.extra;
    length = builder.length;
    scale = builder.scale;
    precision = builder.precision;
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
   * Gets the columnName.
   *
   * Column name.
   *
   * @return the columnName
   */
  public String columnName() {
    return columnName;
  }

  /**
   * Gets the comment.
   *
   * Comment.
   *
   * @return the comment
   */
  public String comment() {
    return comment;
  }

  /**
   * Gets the extra.
   *
   * Extra.
   *
   * @return the extra
   */
  public String extra() {
    return extra;
  }

  /**
   * Gets the length.
   *
   * length.
   *
   * @return the length
   */
  public String length() {
    return length;
  }

  /**
   * Gets the scale.
   *
   * scale.
   *
   * @return the scale
   */
  public String scale() {
    return scale;
  }

  /**
   * Gets the precision.
   *
   * precision.
   *
   * @return the precision
   */
  public String precision() {
    return precision;
  }

  /**
   * Gets the type.
   *
   * Data type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

