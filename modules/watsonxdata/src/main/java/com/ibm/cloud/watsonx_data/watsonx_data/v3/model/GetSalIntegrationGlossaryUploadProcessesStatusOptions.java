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
 * The getSalIntegrationGlossaryUploadProcessesStatus options.
 */
public class GetSalIntegrationGlossaryUploadProcessesStatusOptions extends GenericModel {

  protected String id;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationGlossaryUploadProcessesStatusOptions instance.
     *
     * @param getSalIntegrationGlossaryUploadProcessesStatusOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationGlossaryUploadProcessesStatusOptions getSalIntegrationGlossaryUploadProcessesStatusOptions) {
      this.id = getSalIntegrationGlossaryUploadProcessesStatusOptions.id;
      this.authInstanceId = getSalIntegrationGlossaryUploadProcessesStatusOptions.authInstanceId;
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
     * Builds a GetSalIntegrationGlossaryUploadProcessesStatusOptions.
     *
     * @return the new GetSalIntegrationGlossaryUploadProcessesStatusOptions instance
     */
    public GetSalIntegrationGlossaryUploadProcessesStatusOptions build() {
      return new GetSalIntegrationGlossaryUploadProcessesStatusOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetSalIntegrationGlossaryUploadProcessesStatusOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationGlossaryUploadProcessesStatusOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationGlossaryUploadProcessesStatusOptions() { }

  protected GetSalIntegrationGlossaryUploadProcessesStatusOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationGlossaryUploadProcessesStatusOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * upload process id.
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
}

