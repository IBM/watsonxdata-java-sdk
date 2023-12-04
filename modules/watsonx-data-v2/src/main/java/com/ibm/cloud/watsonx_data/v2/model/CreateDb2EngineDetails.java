/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * External engine details.
 */
public class CreateDb2EngineDetails extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;

  /**
   * Builder.
   */
  public static class Builder {
    private String connectionString;

    /**
     * Instantiates a new Builder from an existing CreateDb2EngineDetails instance.
     *
     * @param createDb2EngineDetails the instance to initialize the Builder with
     */
    private Builder(CreateDb2EngineDetails createDb2EngineDetails) {
      this.connectionString = createDb2EngineDetails.connectionString;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateDb2EngineDetails.
     *
     * @return the new CreateDb2EngineDetails instance
     */
    public CreateDb2EngineDetails build() {
      return new CreateDb2EngineDetails(this);
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the CreateDb2EngineDetails builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }
  }

  protected CreateDb2EngineDetails() { }

  protected CreateDb2EngineDetails(Builder builder) {
    connectionString = builder.connectionString;
  }

  /**
   * New builder.
   *
   * @return a CreateDb2EngineDetails builder
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

