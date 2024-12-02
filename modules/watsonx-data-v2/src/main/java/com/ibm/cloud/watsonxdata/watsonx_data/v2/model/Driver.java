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
 * Driver.
 */
public class Driver extends GenericModel {

  @SerializedName("connection_type")
  protected String connectionType;
  @SerializedName("driver_id")
  protected String driverId;
  @SerializedName("driver_name")
  protected String driverName;
  @SerializedName("driver_version")
  protected String driverVersion;

  protected Driver() { }

  /**
   * Gets the connectionType.
   *
   * Connection type.
   *
   * @return the connectionType
   */
  public String getConnectionType() {
    return connectionType;
  }

  /**
   * Gets the driverId.
   *
   * Driver name.
   *
   * @return the driverId
   */
  public String getDriverId() {
    return driverId;
  }

  /**
   * Gets the driverName.
   *
   * Driver name.
   *
   * @return the driverName
   */
  public String getDriverName() {
    return driverName;
  }

  /**
   * Gets the driverVersion.
   *
   * Driver version.
   *
   * @return the driverVersion
   */
  public String getDriverVersion() {
    return driverVersion;
  }
}

