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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * list of columns to be added to a table.
 */
public class ColumnPatch extends GenericModel {

  @SerializedName("column_name")
  protected String columnName;

  /**
   * Builder.
   */
  public static class Builder {
    private String columnName;

    /**
     * Instantiates a new Builder from an existing ColumnPatch instance.
     *
     * @param columnPatch the instance to initialize the Builder with
     */
    private Builder(ColumnPatch columnPatch) {
      this.columnName = columnPatch.columnName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ColumnPatch.
     *
     * @return the new ColumnPatch instance
     */
    public ColumnPatch build() {
      return new ColumnPatch(this);
    }

    /**
     * Set the columnName.
     *
     * @param columnName the columnName
     * @return the ColumnPatch builder
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
    }
  }

  protected ColumnPatch() { }

  protected ColumnPatch(Builder builder) {
    columnName = builder.columnName;
  }

  /**
   * New builder.
   *
   * @return a ColumnPatch builder
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
   * Construct a JSON merge-patch from the ColumnPatch.
   *
   * Note that properties of the ColumnPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the ColumnPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

