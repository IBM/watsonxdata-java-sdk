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
public class Db2EngineDetailsBody extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;

  /**
   * Builder.
   */
  public static class Builder {
    private String connectionString;

    /**
     * Instantiates a new Builder from an existing Db2EngineDetailsBody instance.
     *
     * @param db2EngineDetailsBody the instance to initialize the Builder with
     */
    private Builder(Db2EngineDetailsBody db2EngineDetailsBody) {
      this.connectionString = db2EngineDetailsBody.connectionString;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Db2EngineDetailsBody.
     *
     * @return the new Db2EngineDetailsBody instance
     */
    public Db2EngineDetailsBody build() {
      return new Db2EngineDetailsBody(this);
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the Db2EngineDetailsBody builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }
  }

  protected Db2EngineDetailsBody() { }

  protected Db2EngineDetailsBody(Builder builder) {
    connectionString = builder.connectionString;
  }

  /**
   * New builder.
   *
   * @return a Db2EngineDetailsBody builder
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

