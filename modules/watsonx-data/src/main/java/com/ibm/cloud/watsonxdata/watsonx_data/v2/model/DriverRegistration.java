/*
 * (C) Copyright IBM Corp. 2025.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Driver registration.
 */
public class DriverRegistration extends GenericModel {

  @SerializedName("associated_engines")
  protected List<String> associatedEngines;
  @SerializedName("connection_type")
  protected String connectionType;
  @SerializedName("driver_id")
  protected String driverId;
  @SerializedName("driver_name")
  protected String driverName;
  @SerializedName("modified_at")
  protected String modifiedAt;
  @SerializedName("modified_by")
  protected String modifiedBy;
  protected String status;
  protected String version;

  protected DriverRegistration() { }

  /**
   * Gets the associatedEngines.
   *
   * Associated engines.
   *
   * @return the associatedEngines
   */
  public List<String> getAssociatedEngines() {
    return associatedEngines;
  }

  /**
   * Gets the connectionType.
   *
   * Driver connection type.
   *
   * @return the connectionType
   */
  public String getConnectionType() {
    return connectionType;
  }

  /**
   * Gets the driverId.
   *
   * Driver ID auto generated during driver registration.
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
   * Gets the modifiedAt.
   *
   * Created on.
   *
   * @return the modifiedAt
   */
  public String getModifiedAt() {
    return modifiedAt;
  }

  /**
   * Gets the modifiedBy.
   *
   * Created by.
   *
   * @return the modifiedBy
   */
  public String getModifiedBy() {
    return modifiedBy;
  }

  /**
   * Gets the status.
   *
   * Driver status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the version.
   *
   * Driver version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

