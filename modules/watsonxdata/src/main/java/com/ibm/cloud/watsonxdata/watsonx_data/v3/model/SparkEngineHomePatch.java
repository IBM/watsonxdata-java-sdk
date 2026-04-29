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
 * Engine home properties for Spark engine configuration for Patch.
 */
public class SparkEngineHomePatch extends GenericModel {

  @SerializedName("storage_name")
  protected String storageName;

  /**
   * Builder.
   */
  public static class Builder {
    private String storageName;

    /**
     * Instantiates a new Builder from an existing SparkEngineHomePatch instance.
     *
     * @param sparkEngineHomePatch the instance to initialize the Builder with
     */
    private Builder(SparkEngineHomePatch sparkEngineHomePatch) {
      this.storageName = sparkEngineHomePatch.storageName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkEngineHomePatch.
     *
     * @return the new SparkEngineHomePatch instance
     */
    public SparkEngineHomePatch build() {
      return new SparkEngineHomePatch(this);
    }

    /**
     * Set the storageName.
     *
     * @param storageName the storageName
     * @return the SparkEngineHomePatch builder
     */
    public Builder storageName(String storageName) {
      this.storageName = storageName;
      return this;
    }
  }

  protected SparkEngineHomePatch() { }

  protected SparkEngineHomePatch(Builder builder) {
    storageName = builder.storageName;
  }

  /**
   * New builder.
   *
   * @return a SparkEngineHomePatch builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the storageName.
   *
   * Name of the registered object storage instance to be used as Spark engine home. This is available only in SAAS.
   *
   * @return the storageName
   */
  public String storageName() {
    return storageName;
  }
}

