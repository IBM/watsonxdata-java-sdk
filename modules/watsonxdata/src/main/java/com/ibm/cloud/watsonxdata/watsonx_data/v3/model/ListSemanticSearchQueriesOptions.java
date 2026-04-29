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
 * The listSemanticSearchQueries options.
 */
public class ListSemanticSearchQueriesOptions extends GenericModel {

  protected String engineId;
  protected Boolean schemaSearchEnabled;
  protected Boolean columnSearchEnabled;
  protected Long maxResultNumber;
  protected Boolean runSearch;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private Boolean schemaSearchEnabled;
    private Boolean columnSearchEnabled;
    private Long maxResultNumber;
    private Boolean runSearch;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ListSemanticSearchQueriesOptions instance.
     *
     * @param listSemanticSearchQueriesOptions the instance to initialize the Builder with
     */
    private Builder(ListSemanticSearchQueriesOptions listSemanticSearchQueriesOptions) {
      this.engineId = listSemanticSearchQueriesOptions.engineId;
      this.schemaSearchEnabled = listSemanticSearchQueriesOptions.schemaSearchEnabled;
      this.columnSearchEnabled = listSemanticSearchQueriesOptions.columnSearchEnabled;
      this.maxResultNumber = listSemanticSearchQueriesOptions.maxResultNumber;
      this.runSearch = listSemanticSearchQueriesOptions.runSearch;
      this.authInstanceId = listSemanticSearchQueriesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListSemanticSearchQueriesOptions.
     *
     * @return the new ListSemanticSearchQueriesOptions instance
     */
    public ListSemanticSearchQueriesOptions build() {
      return new ListSemanticSearchQueriesOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ListSemanticSearchQueriesOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the schemaSearchEnabled.
     *
     * @param schemaSearchEnabled the schemaSearchEnabled
     * @return the ListSemanticSearchQueriesOptions builder
     */
    public Builder schemaSearchEnabled(Boolean schemaSearchEnabled) {
      this.schemaSearchEnabled = schemaSearchEnabled;
      return this;
    }

    /**
     * Set the columnSearchEnabled.
     *
     * @param columnSearchEnabled the columnSearchEnabled
     * @return the ListSemanticSearchQueriesOptions builder
     */
    public Builder columnSearchEnabled(Boolean columnSearchEnabled) {
      this.columnSearchEnabled = columnSearchEnabled;
      return this;
    }

    /**
     * Set the maxResultNumber.
     *
     * @param maxResultNumber the maxResultNumber
     * @return the ListSemanticSearchQueriesOptions builder
     */
    public Builder maxResultNumber(long maxResultNumber) {
      this.maxResultNumber = maxResultNumber;
      return this;
    }

    /**
     * Set the runSearch.
     *
     * @param runSearch the runSearch
     * @return the ListSemanticSearchQueriesOptions builder
     */
    public Builder runSearch(Boolean runSearch) {
      this.runSearch = runSearch;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListSemanticSearchQueriesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ListSemanticSearchQueriesOptions() { }

  protected ListSemanticSearchQueriesOptions(Builder builder) {
    engineId = builder.engineId;
    schemaSearchEnabled = builder.schemaSearchEnabled;
    columnSearchEnabled = builder.columnSearchEnabled;
    maxResultNumber = builder.maxResultNumber;
    runSearch = builder.runSearch;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ListSemanticSearchQueriesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
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
   * Gets the maxResultNumber.
   *
   * max history records limitation.
   *
   * @return the maxResultNumber
   */
  public Long maxResultNumber() {
    return maxResultNumber;
  }

  /**
   * Gets the runSearch.
   *
   * if the response include actual search result.
   *
   * @return the runSearch
   */
  public Boolean runSearch() {
    return runSearch;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

