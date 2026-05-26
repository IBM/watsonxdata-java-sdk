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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSparkEngineApplications options.
 */
public class ListSparkEngineApplicationsOptions extends GenericModel {

  protected String id;
  protected String authInstanceId;
  protected List<String> state;
  protected String submissionTimeInterval;
  protected String startTimeInterval;
  protected String endTimeInterval;
  protected Long limit;
  protected String start;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String authInstanceId;
    private List<String> state;
    private String submissionTimeInterval;
    private String startTimeInterval;
    private String endTimeInterval;
    private Long limit;
    private String start;

    /**
     * Instantiates a new Builder from an existing ListSparkEngineApplicationsOptions instance.
     *
     * @param listSparkEngineApplicationsOptions the instance to initialize the Builder with
     */
    private Builder(ListSparkEngineApplicationsOptions listSparkEngineApplicationsOptions) {
      this.id = listSparkEngineApplicationsOptions.id;
      this.authInstanceId = listSparkEngineApplicationsOptions.authInstanceId;
      this.state = listSparkEngineApplicationsOptions.state;
      this.submissionTimeInterval = listSparkEngineApplicationsOptions.submissionTimeInterval;
      this.startTimeInterval = listSparkEngineApplicationsOptions.startTimeInterval;
      this.endTimeInterval = listSparkEngineApplicationsOptions.endTimeInterval;
      this.limit = listSparkEngineApplicationsOptions.limit;
      this.start = listSparkEngineApplicationsOptions.start;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
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
     * Set the id.
     *
     * @param id the id
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
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

    /**
     * Set the submissionTimeInterval.
     *
     * @param submissionTimeInterval the submissionTimeInterval
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder submissionTimeInterval(String submissionTimeInterval) {
      this.submissionTimeInterval = submissionTimeInterval;
      return this;
    }

    /**
     * Set the startTimeInterval.
     *
     * @param startTimeInterval the startTimeInterval
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder startTimeInterval(String startTimeInterval) {
      this.startTimeInterval = startTimeInterval;
      return this;
    }

    /**
     * Set the endTimeInterval.
     *
     * @param endTimeInterval the endTimeInterval
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder endTimeInterval(String endTimeInterval) {
      this.endTimeInterval = endTimeInterval;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSparkEngineApplicationsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }
  }

  protected ListSparkEngineApplicationsOptions() { }

  protected ListSparkEngineApplicationsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    authInstanceId = builder.authInstanceId;
    state = builder.state;
    submissionTimeInterval = builder.submissionTimeInterval;
    startTimeInterval = builder.startTimeInterval;
    endTimeInterval = builder.endTimeInterval;
    limit = builder.limit;
    start = builder.start;
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
   * Gets the id.
   *
   * engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
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

  /**
   * Gets the submissionTimeInterval.
   *
   * Submission time interval in &lt;lower timestamp limit&gt;,&lt;upper timestamp limit&gt; format.
   *
   * @return the submissionTimeInterval
   */
  public String submissionTimeInterval() {
    return submissionTimeInterval;
  }

  /**
   * Gets the startTimeInterval.
   *
   * Start time interval in &lt;lower timestamp limit&gt;,&lt;upper timestamp limit&gt; format.
   *
   * @return the startTimeInterval
   */
  public String startTimeInterval() {
    return startTimeInterval;
  }

  /**
   * Gets the endTimeInterval.
   *
   * End time interval in &lt;lower timestamp limit&gt;,&lt;upper timestamp limit&gt; format.
   *
   * @return the endTimeInterval
   */
  public String endTimeInterval() {
    return endTimeInterval;
  }

  /**
   * Gets the limit.
   *
   * limit to specify the rows.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * Token used to fetch the next or the previous page of the applications list.
   *
   * @return the start
   */
  public String start() {
    return start;
  }
}

