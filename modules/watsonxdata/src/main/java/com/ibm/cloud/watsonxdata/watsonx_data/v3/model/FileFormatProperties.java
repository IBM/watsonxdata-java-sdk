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
 * Options used to read CSV or Text file.
 */
public class FileFormatProperties extends GenericModel {

  protected String encoding;
  @SerializedName("escape_character")
  protected String escapeCharacter;
  @SerializedName("field_delimiter")
  protected String fieldDelimiter;
  protected Boolean header;
  @SerializedName("line_delimiter")
  protected String lineDelimiter;

  /**
   * Builder.
   */
  public static class Builder {
    private String encoding;
    private String escapeCharacter;
    private String fieldDelimiter;
    private Boolean header;
    private String lineDelimiter;

    /**
     * Instantiates a new Builder from an existing FileFormatProperties instance.
     *
     * @param fileFormatProperties the instance to initialize the Builder with
     */
    private Builder(FileFormatProperties fileFormatProperties) {
      this.encoding = fileFormatProperties.encoding;
      this.escapeCharacter = fileFormatProperties.escapeCharacter;
      this.fieldDelimiter = fileFormatProperties.fieldDelimiter;
      this.header = fileFormatProperties.header;
      this.lineDelimiter = fileFormatProperties.lineDelimiter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a FileFormatProperties.
     *
     * @return the new FileFormatProperties instance
     */
    public FileFormatProperties build() {
      return new FileFormatProperties(this);
    }

    /**
     * Set the encoding.
     *
     * @param encoding the encoding
     * @return the FileFormatProperties builder
     */
    public Builder encoding(String encoding) {
      this.encoding = encoding;
      return this;
    }

    /**
     * Set the escapeCharacter.
     *
     * @param escapeCharacter the escapeCharacter
     * @return the FileFormatProperties builder
     */
    public Builder escapeCharacter(String escapeCharacter) {
      this.escapeCharacter = escapeCharacter;
      return this;
    }

    /**
     * Set the fieldDelimiter.
     *
     * @param fieldDelimiter the fieldDelimiter
     * @return the FileFormatProperties builder
     */
    public Builder fieldDelimiter(String fieldDelimiter) {
      this.fieldDelimiter = fieldDelimiter;
      return this;
    }

    /**
     * Set the header.
     *
     * @param header the header
     * @return the FileFormatProperties builder
     */
    public Builder header(Boolean header) {
      this.header = header;
      return this;
    }

    /**
     * Set the lineDelimiter.
     *
     * @param lineDelimiter the lineDelimiter
     * @return the FileFormatProperties builder
     */
    public Builder lineDelimiter(String lineDelimiter) {
      this.lineDelimiter = lineDelimiter;
      return this;
    }
  }

  protected FileFormatProperties() { }

  protected FileFormatProperties(Builder builder) {
    encoding = builder.encoding;
    escapeCharacter = builder.escapeCharacter;
    fieldDelimiter = builder.fieldDelimiter;
    header = builder.header;
    lineDelimiter = builder.lineDelimiter;
  }

  /**
   * New builder.
   *
   * @return a FileFormatProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the encoding.
   *
   * Encoding format of the CSV or Text file (e.g., UTF-8).
   *
   * @return the encoding
   */
  public String encoding() {
    return encoding;
  }

  /**
   * Gets the escapeCharacter.
   *
   * Character used to escape special characters in the CSV or Text file.
   *
   * @return the escapeCharacter
   */
  public String escapeCharacter() {
    return escapeCharacter;
  }

  /**
   * Gets the fieldDelimiter.
   *
   * Character used to delimit fields in the CSV or Text file.
   *
   * @return the fieldDelimiter
   */
  public String fieldDelimiter() {
    return fieldDelimiter;
  }

  /**
   * Gets the header.
   *
   * Indicates if the CSV or Text file has a header row.
   *
   * @return the header
   */
  public Boolean header() {
    return header;
  }

  /**
   * Gets the lineDelimiter.
   *
   * Characters used to delimit lines in the CSV or Text file.
   *
   * @return the lineDelimiter
   */
  public String lineDelimiter() {
    return lineDelimiter;
  }
}

