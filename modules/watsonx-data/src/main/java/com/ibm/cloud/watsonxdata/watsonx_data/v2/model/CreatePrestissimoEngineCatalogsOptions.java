/*
 * (C) Copyright IBM Corp. 2025.
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
 * The createPrestissimoEngineCatalogs options.
 */
public class CreatePrestissimoEngineCatalogsOptions extends GenericModel {

  protected String engineId;
  protected String catalogName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing CreatePrestissimoEngineCatalogsOptions instance.
     *
     * @param createPrestissimoEngineCatalogsOptions the instance to initialize the Builder with
     */
    private Builder(CreatePrestissimoEngineCatalogsOptions createPrestissimoEngineCatalogsOptions) {
      this.engineId = createPrestissimoEngineCatalogsOptions.engineId;
      this.catalogName = createPrestissimoEngineCatalogsOptions.catalogName;
      this.authInstanceId = createPrestissimoEngineCatalogsOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     */
    public Builder(String engineId) {
      this.engineId = engineId;
    }

    /**
     * Builds a CreatePrestissimoEngineCatalogsOptions.
     *
     * @return the new CreatePrestissimoEngineCatalogsOptions instance
     */
    public CreatePrestissimoEngineCatalogsOptions build() {
      return new CreatePrestissimoEngineCatalogsOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the CreatePrestissimoEngineCatalogsOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the CreatePrestissimoEngineCatalogsOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the CreatePrestissimoEngineCatalogsOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected CreatePrestissimoEngineCatalogsOptions() { }

  protected CreatePrestissimoEngineCatalogsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    engineId = builder.engineId;
    catalogName = builder.catalogName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a CreatePrestissimoEngineCatalogsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * engine id.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the catalogName.
   *
   * catalog names.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
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

