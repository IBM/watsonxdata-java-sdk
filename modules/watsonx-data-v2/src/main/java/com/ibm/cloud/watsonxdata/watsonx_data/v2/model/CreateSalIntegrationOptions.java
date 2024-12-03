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
 * The createSalIntegration options.
 */
public class CreateSalIntegrationOptions extends GenericModel {

  protected String apikey;
  protected String engineId;
  protected String storageResourceCrn;
  protected String storageType;
  protected Boolean trialPlan;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String apikey;
    private String engineId;
    private String storageResourceCrn;
    private String storageType;
    private Boolean trialPlan;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreateSalIntegrationOptions instance.
     *
     * @param createSalIntegrationOptions the instance to initialize the Builder with
     */
    private Builder(CreateSalIntegrationOptions createSalIntegrationOptions) {
      this.apikey = createSalIntegrationOptions.apikey;
      this.engineId = createSalIntegrationOptions.engineId;
      this.storageResourceCrn = createSalIntegrationOptions.storageResourceCrn;
      this.storageType = createSalIntegrationOptions.storageType;
      this.trialPlan = createSalIntegrationOptions.trialPlan;
      this.authInstanceId = createSalIntegrationOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param apikey the apikey
     * @param engineId the engineId
     */
    public Builder(String apikey, String engineId) {
      this.apikey = apikey;
      this.engineId = engineId;
    }

    /**
     * Builds a CreateSalIntegrationOptions.
     *
     * @return the new CreateSalIntegrationOptions instance
     */
    public CreateSalIntegrationOptions build() {
      return new CreateSalIntegrationOptions(this);
    }

    /**
     * Set the apikey.
     *
     * @param apikey the apikey
     * @return the CreateSalIntegrationOptions builder
     */
    public Builder apikey(String apikey) {
      this.apikey = apikey;
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreateSalIntegrationOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the storageResourceCrn.
     *
     * @param storageResourceCrn the storageResourceCrn
     * @return the CreateSalIntegrationOptions builder
     */
    public Builder storageResourceCrn(String storageResourceCrn) {
      this.storageResourceCrn = storageResourceCrn;
      return this;
    }

    /**
     * Set the storageType.
     *
     * @param storageType the storageType
     * @return the CreateSalIntegrationOptions builder
     */
    public Builder storageType(String storageType) {
      this.storageType = storageType;
      return this;
    }

    /**
     * Set the trialPlan.
     *
     * @param trialPlan the trialPlan
     * @return the CreateSalIntegrationOptions builder
     */
    public Builder trialPlan(Boolean trialPlan) {
      this.trialPlan = trialPlan;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreateSalIntegrationOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreateSalIntegrationOptions() { }

  protected CreateSalIntegrationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.apikey,
      "apikey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    apikey = builder.apikey;
    engineId = builder.engineId;
    storageResourceCrn = builder.storageResourceCrn;
    storageType = builder.storageType;
    trialPlan = builder.trialPlan;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreateSalIntegrationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the apikey.
   *
   * IAM apikey.
   *
   * @return the apikey
   */
  public String apikey() {
    return apikey;
  }

  /**
   * Gets the engineId.
   *
   * engine ID.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the storageResourceCrn.
   *
   * COS storage resource crn.
   *
   * @return the storageResourceCrn
   */
  public String storageResourceCrn() {
    return storageResourceCrn;
  }

  /**
   * Gets the storageType.
   *
   * COS storage type.
   *
   * @return the storageType
   */
  public String storageType() {
    return storageType;
  }

  /**
   * Gets the trialPlan.
   *
   * COS storage type.
   *
   * @return the trialPlan
   */
  public Boolean trialPlan() {
    return trialPlan;
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

