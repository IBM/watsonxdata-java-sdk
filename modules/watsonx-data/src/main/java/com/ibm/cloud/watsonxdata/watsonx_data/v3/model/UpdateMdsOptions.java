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
 * The updateMds options.
 */
public class UpdateMdsOptions extends GenericModel {

  protected List<JsonPatchOperation> body;
  protected String lhInstanceId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private List<JsonPatchOperation> body;
    private String lhInstanceId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateMdsOptions instance.
     *
     * @param updateMdsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateMdsOptions updateMdsOptions) {
      this.body = updateMdsOptions.body;
      this.lhInstanceId = updateMdsOptions.lhInstanceId;
      this.authInstanceId = updateMdsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param body the body
     */
    public Builder(List<JsonPatchOperation> body) {
      this.body = body;
    }

    /**
     * Builds a UpdateMdsOptions.
     *
     * @return the new UpdateMdsOptions instance
     */
    public UpdateMdsOptions build() {
      return new UpdateMdsOptions(this);
    }

    /**
     * Adds a new element to body.
     *
     * @param body the new element to be added
     * @return the UpdateMdsOptions builder
     */
    public Builder addBody(JsonPatchOperation body) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(body,
        "body cannot be null");
      if (this.body == null) {
        this.body = new ArrayList<JsonPatchOperation>();
      }
      this.body.add(body);
      return this;
    }

    /**
     * Set the body.
     * Existing body will be replaced.
     *
     * @param body the body
     * @return the UpdateMdsOptions builder
     */
    public Builder body(List<JsonPatchOperation> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the lhInstanceId.
     *
     * @param lhInstanceId the lhInstanceId
     * @return the UpdateMdsOptions builder
     */
    public Builder lhInstanceId(String lhInstanceId) {
      this.lhInstanceId = lhInstanceId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateMdsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateMdsOptions() { }

  protected UpdateMdsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    body = builder.body;
    lhInstanceId = builder.lhInstanceId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateMdsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the body.
   *
   * Request body.
   *
   * @return the body
   */
  public List<JsonPatchOperation> body() {
    return body;
  }

  /**
   * Gets the lhInstanceId.
   *
   * Unique identifier assigned to a specific watsonx.data instance.
   *
   * @return the lhInstanceId
   */
  public String lhInstanceId() {
    return lhInstanceId;
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

