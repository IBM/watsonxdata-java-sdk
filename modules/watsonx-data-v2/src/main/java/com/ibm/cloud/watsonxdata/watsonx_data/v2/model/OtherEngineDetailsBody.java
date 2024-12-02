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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * External engine details.
 */
public class OtherEngineDetailsBody extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("engine_type")
  protected String engineType;

  /**
   * Builder.
   */
  public static class Builder {
    private String connectionString;
    private String engineType;

    /**
     * Instantiates a new Builder from an existing OtherEngineDetailsBody instance.
     *
     * @param otherEngineDetailsBody the instance to initialize the Builder with
     */
    private Builder(OtherEngineDetailsBody otherEngineDetailsBody) {
      this.connectionString = otherEngineDetailsBody.connectionString;
      this.engineType = otherEngineDetailsBody.engineType;
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
     * @param engineType the engineType
     */
    public Builder(String connectionString, String engineType) {
      this.connectionString = connectionString;
      this.engineType = engineType;
    }

    /**
     * Builds a OtherEngineDetailsBody.
     *
     * @return the new OtherEngineDetailsBody instance
     */
    public OtherEngineDetailsBody build() {
      return new OtherEngineDetailsBody(this);
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the OtherEngineDetailsBody builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the engineType.
     *
     * @param engineType the engineType
     * @return the OtherEngineDetailsBody builder
     */
    public Builder engineType(String engineType) {
      this.engineType = engineType;
      return this;
    }
  }

  protected OtherEngineDetailsBody() { }

  protected OtherEngineDetailsBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connectionString,
      "connectionString cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineType,
      "engineType cannot be null");
    connectionString = builder.connectionString;
    engineType = builder.engineType;
  }

  /**
   * New builder.
   *
   * @return a OtherEngineDetailsBody builder
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
   * Gets the engineType.
   *
   * Actual engine type.
   *
   * @return the engineType
   */
  public String engineType() {
    return engineType;
  }
}

