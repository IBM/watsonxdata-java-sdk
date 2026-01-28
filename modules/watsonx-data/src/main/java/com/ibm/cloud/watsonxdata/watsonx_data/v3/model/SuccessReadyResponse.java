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
 * Response of success for Ready API.
 */
public class SuccessReadyResponse extends GenericModel {

  protected String buildstring;
  @SerializedName("console_version")
  protected String consoleVersion;
  protected String message;
  @SerializedName("message_code")
  protected String messageCode;
  @SerializedName("schema_version")
  protected String schemaVersion;

  protected SuccessReadyResponse() { }

  /**
   * Gets the buildstring.
   *
   * Build String.
   *
   * @return the buildstring
   */
  public String getBuildstring() {
    return buildstring;
  }

  /**
   * Gets the consoleVersion.
   *
   * Console Version.
   *
   * @return the consoleVersion
   */
  public String getConsoleVersion() {
    return consoleVersion;
  }

  /**
   * Gets the message.
   *
   * Message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the messageCode.
   *
   * Message code.
   *
   * @return the messageCode
   */
  public String getMessageCode() {
    return messageCode;
  }

  /**
   * Gets the schemaVersion.
   *
   * Schema Version.
   *
   * @return the schemaVersion
   */
  public String getSchemaVersion() {
    return schemaVersion;
  }
}

