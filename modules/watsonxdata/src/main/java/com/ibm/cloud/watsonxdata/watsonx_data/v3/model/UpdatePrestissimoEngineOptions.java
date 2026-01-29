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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updatePrestissimoEngine options.
 */
public class UpdatePrestissimoEngineOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdatePrestissimoEngineOptions instance.
     *
     * @param updatePrestissimoEngineOptions the instance to initialize the Builder with
     */
    private Builder(UpdatePrestissimoEngineOptions updatePrestissimoEngineOptions) {
      this.id = updatePrestissimoEngineOptions.id;
      this.body = updatePrestissimoEngineOptions.body;
      this.authInstanceId = updatePrestissimoEngineOptions.authInstanceId;
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
     * @param body the body
     */
    public Builder(String id, Map<String, Object> body) {
      this.id = id;
      this.body = body;
    }

    /**
     * Builds a UpdatePrestissimoEngineOptions.
     *
     * @return the new UpdatePrestissimoEngineOptions instance
     */
    public UpdatePrestissimoEngineOptions build() {
      return new UpdatePrestissimoEngineOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder body(Map<String, Object> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdatePrestissimoEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdatePrestissimoEngineOptions() { }

  protected UpdatePrestissimoEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    id = builder.id;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdatePrestissimoEngineOptions builder
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
   * Gets the body.
   *
   * Update prestissimo engine body.
   *
   * @return the body
   */
  public Map<String, Object> body() {
    return body;
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

