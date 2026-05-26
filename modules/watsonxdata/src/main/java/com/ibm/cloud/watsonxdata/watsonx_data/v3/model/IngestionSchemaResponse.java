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
 * Schema information derived from file.
 */
public class IngestionSchemaResponse extends GenericModel {

  @SerializedName("field_id")
  protected Long fieldId;
  @SerializedName("header_name")
  protected String headerName;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private Long fieldId;
    private String headerName;
    private String type;

    /**
     * Instantiates a new Builder from an existing IngestionSchemaResponse instance.
     *
     * @param ingestionSchemaResponse the instance to initialize the Builder with
     */
    private Builder(IngestionSchemaResponse ingestionSchemaResponse) {
      this.fieldId = ingestionSchemaResponse.fieldId;
      this.headerName = ingestionSchemaResponse.headerName;
      this.type = ingestionSchemaResponse.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IngestionSchemaResponse.
     *
     * @return the new IngestionSchemaResponse instance
     */
    public IngestionSchemaResponse build() {
      return new IngestionSchemaResponse(this);
    }

    /**
     * Set the fieldId.
     *
     * @param fieldId the fieldId
     * @return the IngestionSchemaResponse builder
     */
    public Builder fieldId(long fieldId) {
      this.fieldId = fieldId;
      return this;
    }

    /**
     * Set the headerName.
     *
     * @param headerName the headerName
     * @return the IngestionSchemaResponse builder
     */
    public Builder headerName(String headerName) {
      this.headerName = headerName;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the IngestionSchemaResponse builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected IngestionSchemaResponse() { }

  protected IngestionSchemaResponse(Builder builder) {
    fieldId = builder.fieldId;
    headerName = builder.headerName;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a IngestionSchemaResponse builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the fieldId.
   *
   * Schema column field ID.
   *
   * @return the fieldId
   */
  public Long fieldId() {
    return fieldId;
  }

  /**
   * Gets the headerName.
   *
   * Schema column header name.
   *
   * @return the headerName
   */
  public String headerName() {
    return headerName;
  }

  /**
   * Gets the type.
   *
   * Schema column data type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

