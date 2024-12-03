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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Table response.
 */
public class TableResponse extends GenericModel {

  protected String message;
  @SerializedName("message_code")
  protected String messageCode;
  protected List<TableColumDetail> tables;

  protected TableResponse() { }

  /**
   * Gets the message.
   *
   * Response message string.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the messageCode.
   *
   * Message code string.
   *
   * @return the messageCode
   */
  public String getMessageCode() {
    return messageCode;
  }

  /**
   * Gets the tables.
   *
   * A list of all tables.
   *
   * @return the tables
   */
  public List<TableColumDetail> getTables() {
    return tables;
  }
}

