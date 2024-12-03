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
 * Native spark history server.
 */
public class SparkHistoryServer extends GenericModel {

  @SerializedName("auto_termination_time")
  protected String autoTerminationTime;
  protected String cores;
  protected String memory;
  @SerializedName("start_time")
  protected String startTime;
  protected String state;

  protected SparkHistoryServer() { }

  /**
   * Gets the autoTerminationTime.
   *
   * History server start time.
   *
   * @return the autoTerminationTime
   */
  public String getAutoTerminationTime() {
    return autoTerminationTime;
  }

  /**
   * Gets the cores.
   *
   * History server cores.
   *
   * @return the cores
   */
  public String getCores() {
    return cores;
  }

  /**
   * Gets the memory.
   *
   * History server memory.
   *
   * @return the memory
   */
  public String getMemory() {
    return memory;
  }

  /**
   * Gets the startTime.
   *
   * History server start time.
   *
   * @return the startTime
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Gets the state.
   *
   * History server state.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }
}

