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
 * The getIngestionJob options.
 */
public class GetIngestionJobOptions extends GenericModel {

  protected String authInstanceId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String authInstanceId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetIngestionJobOptions instance.
     *
     * @param getIngestionJobOptions the instance to initialize the Builder with
     */
    private Builder(GetIngestionJobOptions getIngestionJobOptions) {
      this.authInstanceId = getIngestionJobOptions.authInstanceId;
      this.id = getIngestionJobOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param authInstanceId the authInstanceId
     * @param id the id
     */
    public Builder(String authInstanceId, String id) {
      this.authInstanceId = authInstanceId;
      this.id = id;
    }

    /**
     * Builds a GetIngestionJobOptions.
     *
     * @return the new GetIngestionJobOptions instance
     */
    public GetIngestionJobOptions build() {
      return new GetIngestionJobOptions(this);
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetIngestionJobOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetIngestionJobOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetIngestionJobOptions() { }

  protected GetIngestionJobOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    authInstanceId = builder.authInstanceId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetIngestionJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the authInstanceId.
   *
   * Lakehouse Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the id.
   *
   * Ingestion Job ID.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

