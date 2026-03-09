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
 * Spark vscode configuration.
 */
public class SparkVscodeConfig extends GenericModel {

  protected String crn;
  @SerializedName("environment_type")
  protected String environmentType;
  protected String host;
  @SerializedName("user_name")
  protected String userName;

  protected SparkVscodeConfig() { }

  /**
   * Gets the crn.
   *
   * WxD crn.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the environmentType.
   *
   * WxD environment type.
   *
   * @return the environmentType
   */
  public String getEnvironmentType() {
    return environmentType;
  }

  /**
   * Gets the host.
   *
   * WxD hostname.
   *
   * @return the host
   */
  public String getHost() {
    return host;
  }

  /**
   * Gets the userName.
   *
   * WxD user name.
   *
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }
}

