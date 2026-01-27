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
 * MDS Thrift server connection details.
 */
public class MdsConnectionInfo extends GenericModel {

  @SerializedName("external_metastore_rest_uri")
  protected String externalMetastoreRestUri;
  @SerializedName("external_metastore_thrift_uri")
  protected String externalMetastoreThriftUri;
  protected String hostname;
  protected String port;
  @SerializedName("rest_uri")
  protected String restUri;
  @SerializedName("thrift_uri")
  protected String thriftUri;

  protected MdsConnectionInfo() { }

  /**
   * Gets the externalMetastoreRestUri.
   *
   * External MDS rest uri.
   *
   * @return the externalMetastoreRestUri
   */
  public String getExternalMetastoreRestUri() {
    return externalMetastoreRestUri;
  }

  /**
   * Gets the externalMetastoreThriftUri.
   *
   * External MDS thrift uri.
   *
   * @return the externalMetastoreThriftUri
   */
  public String getExternalMetastoreThriftUri() {
    return externalMetastoreThriftUri;
  }

  /**
   * Gets the hostname.
   *
   * MDS thrift server hostname.
   *
   * @return the hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Gets the port.
   *
   * MDS thrift server port.
   *
   * @return the port
   */
  public String getPort() {
    return port;
  }

  /**
   * Gets the restUri.
   *
   * Internal MDS REST uri.
   *
   * @return the restUri
   */
  public String getRestUri() {
    return restUri;
  }

  /**
   * Gets the thriftUri.
   *
   * Internal MDS thrift uri.
   *
   * @return the thriftUri
   */
  public String getThriftUri() {
    return thriftUri;
  }
}

