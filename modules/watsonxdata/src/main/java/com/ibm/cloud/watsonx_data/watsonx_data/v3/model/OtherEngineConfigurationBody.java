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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * External engine details.
 */
public class OtherEngineConfigurationBody extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String connectionString;
    private String type;

    /**
     * Instantiates a new Builder from an existing OtherEngineConfigurationBody instance.
     *
     * @param otherEngineConfigurationBody the instance to initialize the Builder with
     */
    private Builder(OtherEngineConfigurationBody otherEngineConfigurationBody) {
      this.connectionString = otherEngineConfigurationBody.connectionString;
      this.type = otherEngineConfigurationBody.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param connectionString the connectionString
     * @param type the type
     */
    public Builder(String connectionString, String type) {
      this.connectionString = connectionString;
      this.type = type;
    }

    /**
     * Builds a OtherEngineConfigurationBody.
     *
     * @return the new OtherEngineConfigurationBody instance
     */
    public OtherEngineConfigurationBody build() {
      return new OtherEngineConfigurationBody(this);
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the OtherEngineConfigurationBody builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the OtherEngineConfigurationBody builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected OtherEngineConfigurationBody() { }

  protected OtherEngineConfigurationBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connectionString,
      "connectionString cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    connectionString = builder.connectionString;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a OtherEngineConfigurationBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the connectionString.
   *
   * External engine connection string.
   *
   * @return the connectionString
   */
  public String connectionString() {
    return connectionString;
  }

  /**
   * Gets the type.
   *
   * Actual engine type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

