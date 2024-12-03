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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * State details.
 */
public class SparkEngineApplicationStatusStateDetailsItems extends GenericModel {

  protected String code;
  protected String message;
  protected String type;

  protected SparkEngineApplicationStatusStateDetailsItems() { }

  /**
   * Gets the code.
   *
   * State details code.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * State details message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the type.
   *
   * State details type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }
}

