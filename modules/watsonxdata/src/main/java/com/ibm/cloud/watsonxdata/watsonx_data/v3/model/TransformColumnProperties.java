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
 * Defines column-level data masking transformation properties. This schema specifies the type of masking to apply to
 * sensitive data columns, optional masking conditions, and the list of users or groups (grantees) who are authorized to
 * view the masked data. Column masking helps protect sensitive information while maintaining data utility for
 * authorized users.
 */
public class TransformColumnProperties extends GenericModel {

  /**
   * The masking algorithm to apply to the column data. Specifies how sensitive data should be obfuscated or
   * transformed. Common types include showing only the last N characters, replacing with fixed characters, hashing, or
   * nullifying the data.
   */
  public interface MaskType {
    /** redact. */
    String REDACT = "redact";
    /** mask_show_last_4. */
    String MASK_SHOW_LAST_4 = "mask_show_last_4";
    /** mask_show_first_4. */
    String MASK_SHOW_FIRST_4 = "mask_show_first_4";
    /** hash. */
    String HASH = "hash";
    /** null. */
    String NULL = "null";
    /** none. */
    String NONE = "none";
    /** mask_date_show_year. */
    String MASK_DATE_SHOW_YEAR = "mask_date_show_year";
    /** custom. */
    String CUSTOM = "custom";
  }

  @SerializedName("mask_condition")
  protected String maskCondition;
  @SerializedName("mask_type")
  protected String maskType;
  @SerializedName("mask_value")
  protected String maskValue;

  /**
   * Builder.
   */
  public static class Builder {
    private String maskCondition;
    private String maskType;
    private String maskValue;

    /**
     * Instantiates a new Builder from an existing TransformColumnProperties instance.
     *
     * @param transformColumnProperties the instance to initialize the Builder with
     */
    private Builder(TransformColumnProperties transformColumnProperties) {
      this.maskCondition = transformColumnProperties.maskCondition;
      this.maskType = transformColumnProperties.maskType;
      this.maskValue = transformColumnProperties.maskValue;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TransformColumnProperties.
     *
     * @return the new TransformColumnProperties instance
     */
    public TransformColumnProperties build() {
      return new TransformColumnProperties(this);
    }

    /**
     * Set the maskCondition.
     *
     * @param maskCondition the maskCondition
     * @return the TransformColumnProperties builder
     */
    public Builder maskCondition(String maskCondition) {
      this.maskCondition = maskCondition;
      return this;
    }

    /**
     * Set the maskType.
     *
     * @param maskType the maskType
     * @return the TransformColumnProperties builder
     */
    public Builder maskType(String maskType) {
      this.maskType = maskType;
      return this;
    }

    /**
     * Set the maskValue.
     *
     * @param maskValue the maskValue
     * @return the TransformColumnProperties builder
     */
    public Builder maskValue(String maskValue) {
      this.maskValue = maskValue;
      return this;
    }
  }

  protected TransformColumnProperties() { }

  protected TransformColumnProperties(Builder builder) {
    maskCondition = builder.maskCondition;
    maskType = builder.maskType;
    maskValue = builder.maskValue;
  }

  /**
   * New builder.
   *
   * @return a TransformColumnProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the maskCondition.
   *
   * List of users and/or user groups who are granted permission to access the data with the specified masking
   * transformation applied. Each grantee will see the column data masked according to the mask_type specified.
   *
   * @return the maskCondition
   */
  public String maskCondition() {
    return maskCondition;
  }

  /**
   * Gets the maskType.
   *
   * The masking algorithm to apply to the column data. Specifies how sensitive data should be obfuscated or
   * transformed. Common types include showing only the last N characters, replacing with fixed characters, hashing, or
   * nullifying the data.
   *
   * @return the maskType
   */
  public String maskType() {
    return maskType;
  }

  /**
   * Gets the maskValue.
   *
   * Defines column-level masking configuration for specific users or groups (grantees). Supports predefined masking
   * types and allows specifying a custom masking expression when the mask type is set to CUSTOM.
   *
   * @return the maskValue
   */
  public String maskValue() {
    return maskValue;
  }
}

