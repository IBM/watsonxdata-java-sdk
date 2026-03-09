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
public class NetezzaEngineConfigurationBody extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;

  /**
   * Builder.
   */
  public static class Builder {
    private String connectionString;

    /**
     * Instantiates a new Builder from an existing NetezzaEngineConfigurationBody instance.
     *
     * @param netezzaEngineConfigurationBody the instance to initialize the Builder with
     */
    private Builder(NetezzaEngineConfigurationBody netezzaEngineConfigurationBody) {
      this.connectionString = netezzaEngineConfigurationBody.connectionString;
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
     */
    public Builder(String connectionString) {
      this.connectionString = connectionString;
    }

    /**
     * Builds a NetezzaEngineConfigurationBody.
     *
     * @return the new NetezzaEngineConfigurationBody instance
     */
    public NetezzaEngineConfigurationBody build() {
      return new NetezzaEngineConfigurationBody(this);
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the NetezzaEngineConfigurationBody builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }
  }

  protected NetezzaEngineConfigurationBody() { }

  protected NetezzaEngineConfigurationBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connectionString,
      "connectionString cannot be null");
    connectionString = builder.connectionString;
  }

  /**
   * New builder.
   *
   * @return a NetezzaEngineConfigurationBody builder
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
}

