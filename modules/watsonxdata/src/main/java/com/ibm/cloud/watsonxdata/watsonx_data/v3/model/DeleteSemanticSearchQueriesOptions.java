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
 * The deleteSemanticSearchQueries options.
 */
public class DeleteSemanticSearchQueriesOptions extends GenericModel {

  protected Long batchSize;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private Long batchSize;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing DeleteSemanticSearchQueriesOptions instance.
     *
     * @param deleteSemanticSearchQueriesOptions the instance to initialize the Builder with
     */
    private Builder(DeleteSemanticSearchQueriesOptions deleteSemanticSearchQueriesOptions) {
      this.batchSize = deleteSemanticSearchQueriesOptions.batchSize;
      this.authInstanceId = deleteSemanticSearchQueriesOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteSemanticSearchQueriesOptions.
     *
     * @return the new DeleteSemanticSearchQueriesOptions instance
     */
    public DeleteSemanticSearchQueriesOptions build() {
      return new DeleteSemanticSearchQueriesOptions(this);
    }

    /**
     * Set the batchSize.
     *
     * @param batchSize the batchSize
     * @return the DeleteSemanticSearchQueriesOptions builder
     */
    public Builder batchSize(long batchSize) {
      this.batchSize = batchSize;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the DeleteSemanticSearchQueriesOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected DeleteSemanticSearchQueriesOptions() { }

  protected DeleteSemanticSearchQueriesOptions(Builder builder) {
    batchSize = builder.batchSize;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a DeleteSemanticSearchQueriesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the batchSize.
   *
   * max number to queries to be deleted (most recent to least), if no number provided all queries history will be
   * clear.
   *
   * @return the batchSize
   */
  public Long batchSize() {
    return batchSize;
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

