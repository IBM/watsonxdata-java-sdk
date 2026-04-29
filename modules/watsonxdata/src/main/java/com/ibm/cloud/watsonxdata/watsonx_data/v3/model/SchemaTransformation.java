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
 * SchemaTransformation.
 */
public class SchemaTransformation extends GenericModel {

  @SerializedName("old_column")
  protected String oldColumn;
  @SerializedName("new_column")
  protected String newColumn;
  @SerializedName("new_type")
  protected String newType;

  /**
   * Builder.
   */
  public static class Builder {
    private String oldColumn;
    private String newColumn;
    private String newType;

    /**
     * Instantiates a new Builder from an existing SchemaTransformation instance.
     *
     * @param schemaTransformation the instance to initialize the Builder with
     */
    private Builder(SchemaTransformation schemaTransformation) {
      this.oldColumn = schemaTransformation.oldColumn;
      this.newColumn = schemaTransformation.newColumn;
      this.newType = schemaTransformation.newType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param oldColumn the oldColumn
     */
    public Builder(String oldColumn) {
      this.oldColumn = oldColumn;
    }

    /**
     * Builds a SchemaTransformation.
     *
     * @return the new SchemaTransformation instance
     */
    public SchemaTransformation build() {
      return new SchemaTransformation(this);
    }

    /**
     * Set the oldColumn.
     *
     * @param oldColumn the oldColumn
     * @return the SchemaTransformation builder
     */
    public Builder oldColumn(String oldColumn) {
      this.oldColumn = oldColumn;
      return this;
    }

    /**
     * Set the newColumn.
     *
     * @param newColumn the newColumn
     * @return the SchemaTransformation builder
     */
    public Builder newColumn(String newColumn) {
      this.newColumn = newColumn;
      return this;
    }

    /**
     * Set the newType.
     *
     * @param newType the newType
     * @return the SchemaTransformation builder
     */
    public Builder newType(String newType) {
      this.newType = newType;
      return this;
    }
  }

  protected SchemaTransformation() { }

  protected SchemaTransformation(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.oldColumn,
      "oldColumn cannot be null");
    oldColumn = builder.oldColumn;
    newColumn = builder.newColumn;
    newType = builder.newType;
  }

  /**
   * New builder.
   *
   * @return a SchemaTransformation builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the oldColumn.
   *
   * The original column name.
   *
   * @return the oldColumn
   */
  public String oldColumn() {
    return oldColumn;
  }

  /**
   * Gets the newColumn.
   *
   * The new column name.
   *
   * @return the newColumn
   */
  public String newColumn() {
    return newColumn;
  }

  /**
   * Gets the newType.
   *
   * The new column type.
   *
   * @return the newType
   */
  public String newType() {
    return newType;
  }
}

