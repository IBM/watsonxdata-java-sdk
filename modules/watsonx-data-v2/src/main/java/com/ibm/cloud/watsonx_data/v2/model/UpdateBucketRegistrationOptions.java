/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateBucketRegistration options.
 */
public class UpdateBucketRegistrationOptions extends GenericModel {

  protected String bucketId;
  protected List<JsonPatchOperation> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String bucketId;
    private List<JsonPatchOperation> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateBucketRegistrationOptions instance.
     *
     * @param updateBucketRegistrationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateBucketRegistrationOptions updateBucketRegistrationOptions) {
      this.bucketId = updateBucketRegistrationOptions.bucketId;
      this.body = updateBucketRegistrationOptions.body;
      this.authInstanceId = updateBucketRegistrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bucketId the bucketId
     * @param body the body
     */
    public Builder(String bucketId, List<JsonPatchOperation> body) {
      this.bucketId = bucketId;
      this.body = body;
    }

    /**
     * Builds a UpdateBucketRegistrationOptions.
     *
     * @return the new UpdateBucketRegistrationOptions instance
     */
    public UpdateBucketRegistrationOptions build() {
      return new UpdateBucketRegistrationOptions(this);
    }

    /**
     * Adds an body to body.
     *
     * @param body the new body
     * @return the UpdateBucketRegistrationOptions builder
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
     * Set the bucketId.
     *
     * @param bucketId the bucketId
     * @return the UpdateBucketRegistrationOptions builder
     */
    public Builder bucketId(String bucketId) {
      this.bucketId = bucketId;
      return this;
    }

    /**
     * Set the body.
     * Existing body will be replaced.
     *
     * @param body the body
     * @return the UpdateBucketRegistrationOptions builder
     */
    public Builder body(List<JsonPatchOperation> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateBucketRegistrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateBucketRegistrationOptions() { }

  protected UpdateBucketRegistrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.bucketId,
      "bucketId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    bucketId = builder.bucketId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateBucketRegistrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the bucketId.
   *
   * bucket id.
   *
   * @return the bucketId
   */
  public String bucketId() {
    return bucketId;
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
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

