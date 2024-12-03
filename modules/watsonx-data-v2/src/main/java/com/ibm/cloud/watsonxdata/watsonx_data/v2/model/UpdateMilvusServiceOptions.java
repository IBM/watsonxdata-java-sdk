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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateMilvusService options.
 */
public class UpdateMilvusServiceOptions extends GenericModel {

  protected String serviceId;
  protected Map<String, Object> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String serviceId;
    private Map<String, Object> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateMilvusServiceOptions instance.
     *
     * @param updateMilvusServiceOptions the instance to initialize the Builder with
     */
    private Builder(UpdateMilvusServiceOptions updateMilvusServiceOptions) {
      this.serviceId = updateMilvusServiceOptions.serviceId;
      this.body = updateMilvusServiceOptions.body;
      this.authInstanceId = updateMilvusServiceOptions.authInstanceId;
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
    public Builder(String serviceId, Map<String, Object> body) {
      this.serviceId = serviceId;
      this.body = body;
    }

    /**
     * Builds a UpdateMilvusServiceOptions.
     *
     * @return the new UpdateMilvusServiceOptions instance
     */
    public UpdateMilvusServiceOptions build() {
      return new UpdateMilvusServiceOptions(this);
    }

    /**
     * Set the serviceId.
     *
     * @param serviceId the serviceId
     * @return the UpdateMilvusServiceOptions builder
     */
    public Builder serviceId(String serviceId) {
      this.serviceId = serviceId;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the UpdateMilvusServiceOptions builder
     */
    public Builder body(Map<String, Object> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateMilvusServiceOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateMilvusServiceOptions() { }

  protected UpdateMilvusServiceOptions(Builder builder) {
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
   * @return a UpdateMilvusServiceOptions builder
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
   * Update milvus service.
   *
   * @return the body
   */
  public Map<String, Object> body() {
    return body;
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
}

