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
 * Defines row-level filtering properties for data access control. This schema specifies filter conditions that
 * determine which rows of data are visible to specific users or groups (grantees). Row filtering enables fine-grained
 * access control by restricting data visibility based on row attribute values, ensuring users only see data they are
 * authorized to access.
 */
public class RowFilterProperties extends GenericModel {

  @SerializedName("filter_condition")
  protected String filterCondition;
  @SerializedName("row_filter")
  protected String rowFilter;

  /**
   * Builder.
   */
  public static class Builder {
    private String filterCondition;
    private String rowFilter;

    /**
     * Instantiates a new Builder from an existing RowFilterProperties instance.
     *
     * @param rowFilterProperties the instance to initialize the Builder with
     */
    private Builder(RowFilterProperties rowFilterProperties) {
      this.filterCondition = rowFilterProperties.filterCondition;
      this.rowFilter = rowFilterProperties.rowFilter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RowFilterProperties.
     *
     * @return the new RowFilterProperties instance
     */
    public RowFilterProperties build() {
      return new RowFilterProperties(this);
    }

    /**
     * Set the filterCondition.
     *
     * @param filterCondition the filterCondition
     * @return the RowFilterProperties builder
     */
    public Builder filterCondition(String filterCondition) {
      this.filterCondition = filterCondition;
      return this;
    }

    /**
     * Set the rowFilter.
     *
     * @param rowFilter the rowFilter
     * @return the RowFilterProperties builder
     */
    public Builder rowFilter(String rowFilter) {
      this.rowFilter = rowFilter;
      return this;
    }
  }

  protected RowFilterProperties() { }

  protected RowFilterProperties(Builder builder) {
    filterCondition = builder.filterCondition;
    rowFilter = builder.rowFilter;
  }

  /**
   * New builder.
   *
   * @return a RowFilterProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the filterCondition.
   *
   * Additional filter condition for row filtering.
   *
   * @return the filterCondition
   */
  public String filterCondition() {
    return filterCondition;
  }

  /**
   * Gets the rowFilter.
   *
   * Row filter expression that determines which rows are visible.
   *
   * @return the rowFilter
   */
  public String rowFilter() {
    return rowFilter;
  }
}

