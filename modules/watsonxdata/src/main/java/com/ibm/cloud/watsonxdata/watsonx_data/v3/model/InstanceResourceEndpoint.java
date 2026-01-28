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
 * host and portname.
 */
public class InstanceResourceEndpoint extends GenericModel {

  protected String hostname;
  protected Long port;
  @SerializedName("rest_hostname")
  protected String restHostname;
  @SerializedName("rest_port")
  protected Long restPort;

  protected InstanceResourceEndpoint() { }

  /**
   * Gets the hostname.
   *
   * Instance Host name.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the port.
   *
   * Port.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the restHostname.
   *
   * Rest Host name.
   *
   * @return the restHostname
   */
  public String getRestHostname() {
    return restHostname;
  }

  /**
   * Gets the restPort.
   *
   * Rest Port.
   *
   * @return the restPort
   */
  public Long getRestPort() {
    return restPort;
  }
}

