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
public class OtherEngineDetails extends GenericModel {

  @SerializedName("connection_string")
  protected String connectionString;
  @SerializedName("engine_type")
  protected String engineType;
  @SerializedName("metastore_host")
  protected String metastoreHost;

  protected OtherEngineDetails() { }

  /**
   * Gets the connectionString.
   *
   * external engine connection string.
   *
   * @return the connectionString
   */
  public String getConnectionString() {
    return connectionString;
  }

  /**
   * Gets the engineType.
   *
   * Actual engine type.
   *
   * @return the engineType
   */
  public String getEngineType() {
    return engineType;
  }

  /**
   * Gets the metastoreHost.
   *
   * metastore host - not required while registering an engine.
   *
   * @return the metastoreHost
   */
  public String getMetastoreHost() {
    return metastoreHost;
  }
}

