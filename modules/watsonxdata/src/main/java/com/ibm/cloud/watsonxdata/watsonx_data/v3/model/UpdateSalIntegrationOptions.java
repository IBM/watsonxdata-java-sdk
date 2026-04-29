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
 * The updateSalIntegration options.
 */
public class UpdateSalIntegrationOptions extends GenericModel {

  protected Map<String, Object> salIntegrationPatch;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> salIntegrationPatch;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateSalIntegrationOptions instance.
     *
     * @param updateSalIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSalIntegrationOptions updateSalIntegrationOptions) {
      this.salIntegrationPatch = updateSalIntegrationOptions.salIntegrationPatch;
      this.authInstanceId = updateSalIntegrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param salIntegrationPatch the salIntegrationPatch
     */
    public Builder(Map<String, Object> salIntegrationPatch) {
      this.salIntegrationPatch = salIntegrationPatch;
    }

    /**
     * Builds a UpdateSalIntegrationOptions.
     *
     * @return the new UpdateSalIntegrationOptions instance
     */
    public UpdateSalIntegrationOptions build() {
      return new UpdateSalIntegrationOptions(this);
    }

    /**
     * Set the salIntegrationPatch.
     *
     * @param salIntegrationPatch the salIntegrationPatch
     * @return the UpdateSalIntegrationOptions builder
     */
    public Builder salIntegrationPatch(Map<String, Object> salIntegrationPatch) {
      this.salIntegrationPatch = salIntegrationPatch;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateSalIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateSalIntegrationOptions() { }

  protected UpdateSalIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.salIntegrationPatch,
      "salIntegrationPatch cannot be null");
    salIntegrationPatch = builder.salIntegrationPatch;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateSalIntegrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the salIntegrationPatch.
   *
   * Request body.
   *
   * @return the salIntegrationPatch
   */
  public Map<String, Object> salIntegrationPatch() {
    return salIntegrationPatch;
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

