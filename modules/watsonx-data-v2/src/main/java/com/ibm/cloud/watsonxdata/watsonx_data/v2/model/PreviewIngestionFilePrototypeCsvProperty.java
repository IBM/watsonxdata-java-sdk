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
 * CSV properties of source file(s).
 */
public class PreviewIngestionFilePrototypeCsvProperty extends GenericModel {

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
     * Instantiates a new Builder from an existing PreviewIngestionFilePrototypeCsvProperty instance.
     *
     * @param previewIngestionFilePrototypeCsvProperty the instance to initialize the Builder with
     */
    private Builder(PreviewIngestionFilePrototypeCsvProperty previewIngestionFilePrototypeCsvProperty) {
      this.encoding = previewIngestionFilePrototypeCsvProperty.encoding;
      this.escapeCharacter = previewIngestionFilePrototypeCsvProperty.escapeCharacter;
      this.fieldDelimiter = previewIngestionFilePrototypeCsvProperty.fieldDelimiter;
      this.header = previewIngestionFilePrototypeCsvProperty.header;
      this.lineDelimiter = previewIngestionFilePrototypeCsvProperty.lineDelimiter;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PreviewIngestionFilePrototypeCsvProperty.
     *
     * @return the new PreviewIngestionFilePrototypeCsvProperty instance
     */
    public PreviewIngestionFilePrototypeCsvProperty build() {
      return new PreviewIngestionFilePrototypeCsvProperty(this);
    }

    /**
     * Set the encoding.
     *
     * @param encoding the encoding
     * @return the PreviewIngestionFilePrototypeCsvProperty builder
     */
    public Builder encoding(String encoding) {
      this.encoding = encoding;
      return this;
    }

    /**
     * Set the escapeCharacter.
     *
     * @param escapeCharacter the escapeCharacter
     * @return the PreviewIngestionFilePrototypeCsvProperty builder
     */
    public Builder escapeCharacter(String escapeCharacter) {
      this.escapeCharacter = escapeCharacter;
      return this;
    }

    /**
     * Set the fieldDelimiter.
     *
     * @param fieldDelimiter the fieldDelimiter
     * @return the PreviewIngestionFilePrototypeCsvProperty builder
     */
    public Builder fieldDelimiter(String fieldDelimiter) {
      this.fieldDelimiter = fieldDelimiter;
      return this;
    }

    /**
     * Set the header.
     *
     * @param header the header
     * @return the PreviewIngestionFilePrototypeCsvProperty builder
     */
    public Builder header(Boolean header) {
      this.header = header;
      return this;
    }

    /**
     * Set the lineDelimiter.
     *
     * @param lineDelimiter the lineDelimiter
     * @return the PreviewIngestionFilePrototypeCsvProperty builder
     */
    public Builder lineDelimiter(String lineDelimiter) {
      this.lineDelimiter = lineDelimiter;
      return this;
    }
  }

  protected PreviewIngestionFilePrototypeCsvProperty() { }

  protected PreviewIngestionFilePrototypeCsvProperty(Builder builder) {
    encoding = builder.encoding;
    escapeCharacter = builder.escapeCharacter;
    fieldDelimiter = builder.fieldDelimiter;
    header = builder.header;
    lineDelimiter = builder.lineDelimiter;
  }

  /**
   * New builder.
   *
   * @return a PreviewIngestionFilePrototypeCsvProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the encoding.
   *
   * Encoding used in CSV file.
   *
   * @return the encoding
   */
  public String encoding() {
    return encoding;
  }

  /**
   * Gets the escapeCharacter.
   *
   * Escape character of CSV file.
   *
   * @return the escapeCharacter
   */
  public String escapeCharacter() {
    return escapeCharacter;
  }

  /**
   * Gets the fieldDelimiter.
   *
   * Field delimiter of CSV file.
   *
   * @return the fieldDelimiter
   */
  public String fieldDelimiter() {
    return fieldDelimiter;
  }

  /**
   * Gets the header.
   *
   * Identify if header exists in CSV file.
   *
   * @return the header
   */
  public Boolean header() {
    return header;
  }

  /**
   * Gets the lineDelimiter.
   *
   * Line delimiter of CSV file.
   *
   * @return the lineDelimiter
   */
  public String lineDelimiter() {
    return lineDelimiter;
  }
}

