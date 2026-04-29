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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Wrapper object containing Presto engine properties.
 */
public class PrestoEnginePropertiesDetails extends GenericModel {

  @SerializedName("engine_properties")
  protected PrestoEngineProperties engineProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private PrestoEngineProperties engineProperties;

    /**
     * Instantiates a new Builder from an existing PrestoEnginePropertiesDetails instance.
     *
     * @param prestoEnginePropertiesDetails the instance to initialize the Builder with
     */
    private Builder(PrestoEnginePropertiesDetails prestoEnginePropertiesDetails) {
      this.engineProperties = prestoEnginePropertiesDetails.engineProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEnginePropertiesDetails.
     *
     * @return the new PrestoEnginePropertiesDetails instance
     */
    public PrestoEnginePropertiesDetails build() {
      return new PrestoEnginePropertiesDetails(this);
    }

    /**
     * Set the engineProperties.
     *
     * @param engineProperties the engineProperties
     * @return the PrestoEnginePropertiesDetails builder
     */
    public Builder engineProperties(PrestoEngineProperties engineProperties) {
      this.engineProperties = engineProperties;
      return this;
    }
  }

  protected PrestoEnginePropertiesDetails() { }

  protected PrestoEnginePropertiesDetails(Builder builder) {
    engineProperties = builder.engineProperties;
  }

  /**
   * New builder.
   *
   * @return a PrestoEnginePropertiesDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineProperties.
   *
   * Presto engine configuration properties.
   *
   * @return the engineProperties
   */
  public PrestoEngineProperties engineProperties() {
    return engineProperties;
  }

  /**
   * Construct a JSON merge-patch from the PrestoEnginePropertiesDetails.
   *
   * Note that properties of the PrestoEnginePropertiesDetails with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the PrestoEnginePropertiesDetails
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

