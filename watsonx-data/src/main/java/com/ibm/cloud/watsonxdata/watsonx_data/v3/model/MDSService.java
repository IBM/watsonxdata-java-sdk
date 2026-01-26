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
 * mds service details responses.
 */
public class MDSService extends GenericModel {

  @SerializedName("host_name")
  protected String hostName;
  @SerializedName("https_port")
  protected Long httpsPort;
  @SerializedName("pg_available")
  protected Boolean pgAvailable;
  protected Long port;
  protected String status;
  @SerializedName("status_code")
  protected Long statusCode;
  protected String version;

  protected MDSService() { }

  /**
   * Gets the hostName.
   *
   * MDS Thrift URI Hostname.
   *
   * @return the hostName
   */
  public String getHostName() {
    return hostName;
  }

  /**
   * Gets the httpsPort.
   *
   * MDS REST URI Port.
   *
   * @return the httpsPort
   */
  public Long getHttpsPort() {
    return httpsPort;
  }

  /**
   * Gets the pgAvailable.
   *
   * PostgreSQL status.
   *
   * @return the pgAvailable
   */
  public Boolean isPgAvailable() {
    return pgAvailable;
  }

  /**
   * Gets the port.
   *
   * MDS Thrift URI Port.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the status.
   *
   * MDS status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusCode.
   *
   * MDS status code.
   *
   * @return the statusCode
   */
  public Long getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the version.
   *
   * watsonx.data build version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

