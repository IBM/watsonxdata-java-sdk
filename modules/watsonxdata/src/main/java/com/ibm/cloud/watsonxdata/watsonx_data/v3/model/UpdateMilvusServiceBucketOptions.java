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
 * The updateMilvusServiceBucket options.
 */
public class UpdateMilvusServiceBucketOptions extends GenericModel {

  protected String serviceId;
  protected List<JsonPatchOperation> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private List<JsonPatchOperation> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateMilvusServiceBucketOptions instance.
     *
     * @param updateMilvusServiceBucketOptions the instance to initialize the Builder with
     */
    private Builder(UpdateMilvusServiceBucketOptions updateMilvusServiceBucketOptions) {
      this.serviceId = updateMilvusServiceBucketOptions.serviceId;
      this.body = updateMilvusServiceBucketOptions.body;
      this.authInstanceId = updateMilvusServiceBucketOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param serviceId the serviceId
     * @param body the body
     */
    public Builder(String serviceId, List<JsonPatchOperation> body) {
      this.serviceId = serviceId;
      this.body = body;
    }

    /**
     * Builds a UpdateMilvusServiceBucketOptions.
     *
     * @return the new UpdateMilvusServiceBucketOptions instance
     */
    public UpdateMilvusServiceBucketOptions build() {
      return new UpdateMilvusServiceBucketOptions(this);
    }

    /**
     * Adds a new element to body.
     *
     * @param body the new element to be added
     * @return the UpdateMilvusServiceBucketOptions builder
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
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the UpdateMilvusServiceBucketOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the body.
     * Existing body will be replaced.
     *
     * @param body the body
     * @return the UpdateMilvusServiceBucketOptions builder
     */
    public Builder body(List<JsonPatchOperation> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateMilvusServiceBucketOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateMilvusServiceBucketOptions() { }

  protected UpdateMilvusServiceBucketOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.serviceId,
      "serviceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    serviceId = builder.serviceId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateMilvusServiceBucketOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the serviceId.
   *
   * service id.
   *
   * @return the serviceId
   */
  public String serviceId() {
    return serviceId;
  }

  /**
   * Gets the body.
   *
   * Update milvus service bucket.
   *
   * @return the body
   */
  public List<JsonPatchOperation> body() {
    return body;
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

