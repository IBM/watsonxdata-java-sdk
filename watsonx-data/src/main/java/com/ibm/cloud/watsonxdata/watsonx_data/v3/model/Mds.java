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
 * Mds.
 */
public class Mds extends GenericModel {

  @SerializedName("mds_enabled")
  protected Boolean mdsEnabled;
  @SerializedName("mds_service")
  protected MDSService mdsService;
  protected String status;

  protected Mds() { }

  /**
   * Gets the mdsEnabled.
   *
   * mds is enabled or not.
   *
   * @return the mdsEnabled
   */
  public Boolean isMdsEnabled() {
    return mdsEnabled;
  }

  /**
   * Gets the mdsService.
   *
   * mds service details responses.
   *
   * @return the mdsService
   */
  public MDSService getMdsService() {
    return mdsService;
  }

  /**
   * Gets the status.
   *
   * mds enabled status.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

