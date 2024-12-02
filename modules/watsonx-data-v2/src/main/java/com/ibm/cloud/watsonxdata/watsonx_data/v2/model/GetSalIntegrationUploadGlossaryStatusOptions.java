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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getSalIntegrationUploadGlossaryStatus options.
 */
public class GetSalIntegrationUploadGlossaryStatusOptions extends GenericModel {

  protected String processId;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String processId;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing GetSalIntegrationUploadGlossaryStatusOptions instance.
     *
     * @param getSalIntegrationUploadGlossaryStatusOptions the instance to initialize the Builder with
     */
    private Builder(GetSalIntegrationUploadGlossaryStatusOptions getSalIntegrationUploadGlossaryStatusOptions) {
      this.processId = getSalIntegrationUploadGlossaryStatusOptions.processId;
      this.authInstanceId = getSalIntegrationUploadGlossaryStatusOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetSalIntegrationUploadGlossaryStatusOptions.
     *
     * @return the new GetSalIntegrationUploadGlossaryStatusOptions instance
     */
    public GetSalIntegrationUploadGlossaryStatusOptions build() {
      return new GetSalIntegrationUploadGlossaryStatusOptions(this);
    }

    /**
     * Set the processId.
     *
     * @param processId the processId
     * @return the GetSalIntegrationUploadGlossaryStatusOptions builder
     */
    public Builder processId(String processId) {
      this.processId = processId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetSalIntegrationUploadGlossaryStatusOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected GetSalIntegrationUploadGlossaryStatusOptions() { }

  protected GetSalIntegrationUploadGlossaryStatusOptions(Builder builder) {
    processId = builder.processId;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a GetSalIntegrationUploadGlossaryStatusOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the processId.
   *
   * upload process id.
   *
   * @return the processId
   */
  public String processId() {
    return processId;
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

