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
 * Ingestion CSV properties.
 */
public class IngestionJobCsvProperty extends GenericModel {

  protected String encoding;
  @SerializedName("escape_character")
  protected String escapeCharacter;
  @SerializedName("field_delimiter")
  protected String fieldDelimiter;
  protected Boolean header;
  @SerializedName("line_delimiter")
  protected String lineDelimiter;

  protected IngestionJobCsvProperty() { }

  /**
   * Gets the encoding.
   *
   * Encoding used in CSV file.
   *
   * @return the encoding
   */
  public String getEncoding() {
    return encoding;
  }

  /**
   * Gets the escapeCharacter.
   *
   * Escape character of CSV file.
   *
   * @return the escapeCharacter
   */
  public String getEscapeCharacter() {
    return escapeCharacter;
  }

  /**
   * Gets the fieldDelimiter.
   *
   * Field delimiter of CSV file.
   *
   * @return the fieldDelimiter
   */
  public String getFieldDelimiter() {
    return fieldDelimiter;
  }

  /**
   * Gets the header.
   *
   * Identify if header exists in CSV file.
   *
   * @return the header
   */
  public Boolean isHeader() {
    return header;
  }

  /**
   * Gets the lineDelimiter.
   *
   * Line delimiter of CSV file.
   *
   * @return the lineDelimiter
   */
  public String getLineDelimiter() {
    return lineDelimiter;
  }
}

