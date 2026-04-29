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
 * Spark Engine Application Callback.
 */
public class SparkEngineApplicationCallback extends GenericModel {

  protected String url;

  /**
   * Builder.
   */
  public static class Builder {
    private String url;

    /**
     * Instantiates a new Builder from an existing SparkEngineApplicationCallback instance.
     *
     * @param sparkEngineApplicationCallback the instance to initialize the Builder with
     */
    private Builder(SparkEngineApplicationCallback sparkEngineApplicationCallback) {
      this.url = sparkEngineApplicationCallback.url;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineApplicationCallback.
     *
     * @return the new SparkEngineApplicationCallback instance
     */
    public SparkEngineApplicationCallback build() {
      return new SparkEngineApplicationCallback(this);
    }

    /**
     * Set the url.
     *
     * @param url the url
     * @return the SparkEngineApplicationCallback builder
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }

  protected SparkEngineApplicationCallback() { }

  protected SparkEngineApplicationCallback(Builder builder) {
    url = builder.url;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineApplicationCallback builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the url.
   *
   * callback url.
   *
   * @return the url
   */
  public String url() {
    return url;
  }
}

