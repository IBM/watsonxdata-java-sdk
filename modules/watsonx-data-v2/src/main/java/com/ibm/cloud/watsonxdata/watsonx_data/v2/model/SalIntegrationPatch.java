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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * update sal integration.
 */
public class SalIntegrationPatch extends GenericModel {

  protected String op;
  protected String path;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String op;
    private String path;
    private String value;

    /**
     * Instantiates a new Builder from an existing SalIntegrationPatch instance.
     *
     * @param salIntegrationPatch the instance to initialize the Builder with
     */
    private Builder(SalIntegrationPatch salIntegrationPatch) {
      this.op = salIntegrationPatch.op;
      this.path = salIntegrationPatch.path;
      this.value = salIntegrationPatch.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SalIntegrationPatch.
     *
     * @return the new SalIntegrationPatch instance
     */
    public SalIntegrationPatch build() {
      return new SalIntegrationPatch(this);
    }

    /**
     * Set the op.
     *
     * @param op the op
     * @return the SalIntegrationPatch builder
     */
    public Builder op(String op) {
      this.op = op;
      return this;
    }

    /**
     * Set the path.
     *
     * @param path the path
     * @return the SalIntegrationPatch builder
     */
    public Builder path(String path) {
      this.path = path;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the SalIntegrationPatch builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected SalIntegrationPatch() { }

  protected SalIntegrationPatch(Builder builder) {
    op = builder.op;
    path = builder.path;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a SalIntegrationPatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the op.
   *
   * op.
   *
   * @return the op
   */
  public String op() {
    return op;
  }

  /**
   * Gets the path.
   *
   * path.
   *
   * @return the path
   */
  public String path() {
    return path;
  }

  /**
   * Gets the value.
   *
   * path.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Construct a JSON merge-patch from the SalIntegrationPatch.
   *
   * Note that properties of the SalIntegrationPatch with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the SalIntegrationPatch
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

