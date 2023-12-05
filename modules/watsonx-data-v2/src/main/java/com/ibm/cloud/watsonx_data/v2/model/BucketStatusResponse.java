/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.watsonx_data.v2.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * object defining the response of checking if the credentials of a bucket are valid.
 */
public class BucketStatusResponse extends GenericModel {

  protected Boolean state;
  @SerializedName("state_message")
  protected String stateMessage;

  protected BucketStatusResponse() { }

  /**
   * Gets the state.
   *
   * bucket credentials are valid or not.
   *
   * @return the state
   */
  public Boolean isState() {
    return state;
  }

  /**
   * Gets the stateMessage.
   *
   * message response as per the credentials validated.
   *
   * @return the stateMessage
   */
  public String getStateMessage() {
    return stateMessage;
  }
}

