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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * request payload for semantic search configurations.
 */
public class SemanticSearchBodySearchConfig extends GenericModel {

  @SerializedName("column_search_enabled")
  protected Boolean columnSearchEnabled;
  protected List<String> fields;
  @SerializedName("max_result_number")
  protected Long maxResultNumber;
  @SerializedName("schema_search_enabled")
  protected Boolean schemaSearchEnabled;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean columnSearchEnabled;
    private List<String> fields;
    private Long maxResultNumber;
    private Boolean schemaSearchEnabled;

    /**
     * Instantiates a new Builder from an existing SemanticSearchBodySearchConfig instance.
     *
     * @param semanticSearchBodySearchConfig the instance to initialize the Builder with
     */
    private Builder(SemanticSearchBodySearchConfig semanticSearchBodySearchConfig) {
      this.columnSearchEnabled = semanticSearchBodySearchConfig.columnSearchEnabled;
      this.fields = semanticSearchBodySearchConfig.fields;
      this.maxResultNumber = semanticSearchBodySearchConfig.maxResultNumber;
      this.schemaSearchEnabled = semanticSearchBodySearchConfig.schemaSearchEnabled;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SemanticSearchBodySearchConfig.
     *
     * @return the new SemanticSearchBodySearchConfig instance
     */
    public SemanticSearchBodySearchConfig build() {
      return new SemanticSearchBodySearchConfig(this);
    }

    /**
     * Adds a new element to fields.
     *
     * @param fields the new element to be added
     * @return the SemanticSearchBodySearchConfig builder
     */
    public Builder addFields(String fields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fields,
        "fields cannot be null");
      if (this.fields == null) {
        this.fields = new ArrayList<String>();
      }
      this.fields.add(fields);
      return this;
    }

    /**
     * Set the columnSearchEnabled.
     *
     * @param columnSearchEnabled the columnSearchEnabled
     * @return the SemanticSearchBodySearchConfig builder
     */
    public Builder columnSearchEnabled(Boolean columnSearchEnabled) {
      this.columnSearchEnabled = columnSearchEnabled;
      return this;
    }

    /**
     * Set the fields.
     * Existing fields will be replaced.
     *
     * @param fields the fields
     * @return the SemanticSearchBodySearchConfig builder
     */
    public Builder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set the maxResultNumber.
     *
     * @param maxResultNumber the maxResultNumber
     * @return the SemanticSearchBodySearchConfig builder
     */
    public Builder maxResultNumber(long maxResultNumber) {
      this.maxResultNumber = maxResultNumber;
      return this;
    }

    /**
     * Set the schemaSearchEnabled.
     *
     * @param schemaSearchEnabled the schemaSearchEnabled
     * @return the SemanticSearchBodySearchConfig builder
     */
    public Builder schemaSearchEnabled(Boolean schemaSearchEnabled) {
      this.schemaSearchEnabled = schemaSearchEnabled;
      return this;
    }
  }

  protected SemanticSearchBodySearchConfig() { }

  protected SemanticSearchBodySearchConfig(Builder builder) {
    columnSearchEnabled = builder.columnSearchEnabled;
    fields = builder.fields;
    maxResultNumber = builder.maxResultNumber;
    schemaSearchEnabled = builder.schemaSearchEnabled;
  }

  /**
   * New builder.
   *
   * @return a SemanticSearchBodySearchConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the columnSearchEnabled.
   *
   * enable columns search.
   *
   * @return the columnSearchEnabled
   */
  public Boolean columnSearchEnabled() {
    return columnSearchEnabled;
  }

  /**
   * Gets the fields.
   *
   * search fields.
   *
   * @return the fields
   */
  public List<String> fields() {
    return fields;
  }

  /**
   * Gets the maxResultNumber.
   *
   * max result number limitation.
   *
   * @return the maxResultNumber
   */
  public Long maxResultNumber() {
    return maxResultNumber;
  }

  /**
   * Gets the schemaSearchEnabled.
   *
   * enable schemas search.
   *
   * @return the schemaSearchEnabled
   */
  public Boolean schemaSearchEnabled() {
    return schemaSearchEnabled;
  }
}

