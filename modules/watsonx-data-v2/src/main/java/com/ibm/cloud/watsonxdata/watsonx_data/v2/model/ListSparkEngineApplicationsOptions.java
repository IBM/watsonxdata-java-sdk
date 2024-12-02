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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSparkEngineApplications options.
 */
public class ListSparkEngineApplicationsOptions extends GenericModel {

  protected String engineId;
  protected String authInstanceId;
  protected List<String> state;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String authInstanceId;
    private List<String> state;

    /**
     * Instantiates a new Builder from an existing ListSparkEngineApplicationsOptions instance.
     *
     * @param listSparkEngineApplicationsOptions the instance to initialize the Builder with
     */
    private Builder(ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions) {
      this.engineId = listSparkEngineApplicationsOptions.engineId;
      this.authInstanceId = listSparkEngineApplicationsOptions.authInstanceId;
      this.state = listSparkEngineApplicationsOptions.state;
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
     */
    public Builder(String engineId) {
      this.engineId = engineId;
    }

    /**
     * Builds a ListSparkEngineApplicationsOptions.
     *
     * @return the new ListSparkEngineApplicationsOptions instance
     */
    public ListSparkEngineApplicationsOptions build() {
      return new ListSparkEngineApplicationsOptions(this);
    }

    /**
     * Adds a new element to state.
     *
     * @param state the new element to be added
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder addState(String state) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(state,
        "state cannot be null");
      if (this.state == null) {
        this.state = new ArrayList<String>();
      }
      this.state.add(state);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the state.
     * Existing state will be replaced.
     *
     * @param state the state
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder state(List<String> state) {
      this.state = state;
      return this;
    }
  }

  protected ListSparkEngineApplicationsOptions() { }

  protected ListSparkEngineApplicationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a ListSparkEngineApplicationsOptions builder
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
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the state.
   *
   * state.
   *
   * @return the state
   */
  public List<String> state() {
    return state;
  }
}

