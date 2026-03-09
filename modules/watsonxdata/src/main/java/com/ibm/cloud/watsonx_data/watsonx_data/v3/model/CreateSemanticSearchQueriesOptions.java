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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createSemanticSearchQueries options.
 */
public class CreateSemanticSearchQueriesOptions extends GenericModel {

  protected String engineId;
  protected String queryInput;
  protected SemanticSearchBodySearchConfig searchConfig;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String queryInput;
    private SemanticSearchBodySearchConfig searchConfig;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSemanticSearchQueriesOptions instance.
     *
     * @param createSemanticSearchQueriesOptions the instance to initialize the Builder with
     */
    private Builder(CreateSemanticSearchQueriesOptions createSemanticSearchQueriesOptions) {
      this.engineId = createSemanticSearchQueriesOptions.engineId;
      this.queryInput = createSemanticSearchQueriesOptions.queryInput;
      this.searchConfig = createSemanticSearchQueriesOptions.searchConfig;
      this.authInstanceId = createSemanticSearchQueriesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     * @param queryInput the queryInput
     */
    public Builder(String engineId, String queryInput) {
      this.engineId = engineId;
      this.queryInput = queryInput;
    }

    /**
     * Builds a CreateSemanticSearchQueriesOptions.
     *
     * @return the new CreateSemanticSearchQueriesOptions instance
     */
    public CreateSemanticSearchQueriesOptions build() {
      return new CreateSemanticSearchQueriesOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateSemanticSearchQueriesOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the queryInput.
     *
     * @param queryInput the queryInput
     * @return the CreateSemanticSearchQueriesOptions builder
     */
    public Builder queryInput(String queryInput) {
      this.queryInput = queryInput;
      return this;
    }

    /**
     * Set the searchConfig.
     *
     * @param searchConfig the searchConfig
     * @return the CreateSemanticSearchQueriesOptions builder
     */
    public Builder searchConfig(SemanticSearchBodySearchConfig searchConfig) {
      this.searchConfig = searchConfig;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSemanticSearchQueriesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSemanticSearchQueriesOptions() { }

  protected CreateSemanticSearchQueriesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.queryInput,
      "queryInput cannot be null");
    engineId = builder.engineId;
    queryInput = builder.queryInput;
    searchConfig = builder.searchConfig;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSemanticSearchQueriesOptions builder
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
   * Gets the queryInput.
   *
   * search string.
   *
   * @return the queryInput
   */
  public String queryInput() {
    return queryInput;
  }

  /**
   * Gets the searchConfig.
   *
   * request payload for semantic search configurations.
   *
   * @return the searchConfig
   */
  public SemanticSearchBodySearchConfig searchConfig() {
    return searchConfig;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

