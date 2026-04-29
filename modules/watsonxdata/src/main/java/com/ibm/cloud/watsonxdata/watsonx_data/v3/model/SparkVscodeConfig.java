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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Spark vscode configuration.
 */
public class SparkVscodeConfig extends GenericModel {

  protected String crn;
  @SerializedName("environment_type")
  protected String environmentType;
  protected String host;
  @SerializedName("user_name")
  protected String userName;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String environmentType;
    private String host;
    private String userName;

    /**
     * Instantiates a new Builder from an existing SparkVscodeConfig instance.
     *
     * @param sparkVscodeConfig the instance to initialize the Builder with
     */
    private Builder(SparkVscodeConfig sparkVscodeConfig) {
      this.crn = sparkVscodeConfig.crn;
      this.environmentType = sparkVscodeConfig.environmentType;
      this.host = sparkVscodeConfig.host;
      this.userName = sparkVscodeConfig.userName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkVscodeConfig.
     *
     * @return the new SparkVscodeConfig instance
     */
    public SparkVscodeConfig build() {
      return new SparkVscodeConfig(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the SparkVscodeConfig builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the environmentType.
     *
     * @param environmentType the environmentType
     * @return the SparkVscodeConfig builder
     */
    public Builder environmentType(String environmentType) {
      this.environmentType = environmentType;
      return this;
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the SparkVscodeConfig builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set the userName.
     *
     * @param userName the userName
     * @return the SparkVscodeConfig builder
     */
    public Builder userName(String userName) {
      this.userName = userName;
      return this;
    }
  }

  protected SparkVscodeConfig() { }

  protected SparkVscodeConfig(Builder builder) {
    crn = builder.crn;
    environmentType = builder.environmentType;
    host = builder.host;
    userName = builder.userName;
  }

  /**
   * New builder.
   *
   * @return a SparkVscodeConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * WxD crn.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the environmentType.
   *
   * WxD environment type.
   *
   * @return the environmentType
   */
  public String environmentType() {
    return environmentType;
  }

  /**
   * Gets the host.
   *
   * WxD hostname.
   *
   * @return the host
   */
  public String host() {
    return host;
  }

  /**
   * Gets the userName.
   *
   * WxD user name.
   *
   * @return the userName
   */
  public String userName() {
    return userName;
  }
}

