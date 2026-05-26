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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * subject can be user or group who can access on the provided resource.
 */
public class Subject extends GenericModel {

  /**
   * Subject type can be user or group.
   */
  public interface Type {
    /** user. */
    String USER = "user";
    /** group. */
    String GROUP = "group";
  }

  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String value;

    /**
     * Instantiates a new Builder from an existing Subject instance.
     *
     * @param subject the instance to initialize the Builder with
     */
    private Builder(Subject subject) {
      this.type = subject.type;
      this.value = subject.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param value the value
     */
    public Builder(String type, String value) {
      this.type = type;
      this.value = value;
    }

    /**
     * Builds a Subject.
     *
     * @return the new Subject instance
     */
    public Subject build() {
      return new Subject(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the Subject builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the Subject builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected Subject() { }

  protected Subject(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a Subject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * Subject type can be user or group.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * value can be user name or group id.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

