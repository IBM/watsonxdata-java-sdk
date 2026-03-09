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
 * Get Milvus Service Detail for target type = cpd.
 */
public class ResourceDetails extends GenericModel {

  @SerializedName("connection_name")
  protected String connectionName;
  protected Resource details;
  @SerializedName("properties")
  protected ResourceDetailsProperties xProperties;
  protected String type;

  protected ResourceDetails() { }

  /**
   * Gets the connectionName.
   *
   * The name of the connection, typically engine_id or service_id.
   *
   * @return the connectionName
   */
  public String getConnectionName() {
    return connectionName;
  }

  /**
   * Gets the details.
   *
   * Watsonx Instance Details.
   *
   * @return the details
   */
  public Resource getDetails() {
    return details;
  }

  /**
   * Gets the xProperties.
   *
   * Service connection properties.
   *
   * @return the xProperties
   */
  public ResourceDetailsProperties getXProperties() {
    return xProperties;
  }

  /**
   * Gets the type.
   *
   * Type of engine/service.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

