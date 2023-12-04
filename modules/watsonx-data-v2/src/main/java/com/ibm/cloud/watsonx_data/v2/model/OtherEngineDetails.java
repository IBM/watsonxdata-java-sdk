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
public class OtherEngineDetails extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("engine_type")
  protected String engineType;
  @SerializedName("metastore_host")
  protected String metastoreHost;

  /**
   * Builder.
   */
  public static class Builder {
    private String connectionString;
    private String engineType;
    private String metastoreHost;

    /**
     * Instantiates a new Builder from an existing OtherEngineDetails instance.
     *
     * @param otherEngineDetails the instance to initialize the Builder with
     */
    private Builder(OtherEngineDetails otherEngineDetails) {
      this.connectionString = otherEngineDetails.connectionString;
      this.engineType = otherEngineDetails.engineType;
      this.metastoreHost = otherEngineDetails.metastoreHost;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a OtherEngineDetails.
     *
     * @return the new OtherEngineDetails instance
     */
    public OtherEngineDetails build() {
      return new OtherEngineDetails(this);
    }

    /**
     * Set the connectionString.
     *
     * @param connectionString the connectionString
     * @return the OtherEngineDetails builder
     */
    public Builder connectionString(String connectionString) {
      this.connectionString = connectionString;
      return this;
    }

    /**
     * Set the engineType.
     *
     * @param engineType the engineType
     * @return the OtherEngineDetails builder
     */
    public Builder engineType(String engineType) {
      this.engineType = engineType;
      return this;
    }

    /**
     * Set the metastoreHost.
     *
     * @param metastoreHost the metastoreHost
     * @return the OtherEngineDetails builder
     */
    public Builder metastoreHost(String metastoreHost) {
      this.metastoreHost = metastoreHost;
      return this;
    }
  }

  protected OtherEngineDetails() { }

  protected OtherEngineDetails(Builder builder) {
    connectionString = builder.connectionString;
    engineType = builder.engineType;
    metastoreHost = builder.metastoreHost;
  }

  /**
   * New builder.
   *
   * @return a OtherEngineDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the connectionString.
   *
   * external engine connection string.
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

  /**
   * Gets the metastoreHost.
   *
   * metastore host.
   *
   * @return the metastoreHost
   */
  public String metastoreHost() {
    return metastoreHost;
  }
}

