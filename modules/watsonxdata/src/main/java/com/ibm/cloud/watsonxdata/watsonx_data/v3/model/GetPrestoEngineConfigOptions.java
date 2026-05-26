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
 * The getPrestoEngineConfig options.
 */
public class GetPrestoEngineConfigOptions extends GenericModel {

  protected String engineId;
  protected String authInstanceId;
  protected String sections;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String authInstanceId;
    private String sections;

    /**
     * Instantiates a new Builder from an existing GetPrestoEngineConfigOptions instance.
     *
     * @param getPrestoEngineConfigOptions the instance to initialize the Builder with
     */
    private Builder(GetPrestoEngineConfigOptions getPrestoEngineConfigOptions) {
      this.engineId = getPrestoEngineConfigOptions.engineId;
      this.authInstanceId = getPrestoEngineConfigOptions.authInstanceId;
      this.sections = getPrestoEngineConfigOptions.sections;
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
     * @param authInstanceId the authInstanceId
     */
    public Builder(String engineId, String authInstanceId) {
      this.engineId = engineId;
      this.authInstanceId = authInstanceId;
    }

    /**
     * Builds a GetPrestoEngineConfigOptions.
     *
     * @return the new GetPrestoEngineConfigOptions instance
     */
    public GetPrestoEngineConfigOptions build() {
      return new GetPrestoEngineConfigOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the GetPrestoEngineConfigOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the GetPrestoEngineConfigOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }

    /**
     * Set the sections.
     *
     * @param sections the sections
     * @return the GetPrestoEngineConfigOptions builder
     */
    public Builder sections(String sections) {
      this.sections = sections;
      return this;
    }
  }

  protected GetPrestoEngineConfigOptions() { }

  protected GetPrestoEngineConfigOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.engineId,
      "engineId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.authInstanceId,
      "authInstanceId cannot be null");
    engineId = builder.engineId;
    authInstanceId = builder.authInstanceId;
    sections = builder.sections;
  }

  /**
   * New builder.
   *
   * @return a GetPrestoEngineConfigOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine ID.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the authInstanceId.
   *
   * Authentication Instance ID (CRN).
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }

  /**
   * Gets the sections.
   *
   * Comma-separated list of sections to retrieve
   * (catalog,configuration,event_listener,global,jmx_exporter_config,jvm,log_config).
   *
   * @return the sections
   */
  public String sections() {
    return sections;
  }
}

