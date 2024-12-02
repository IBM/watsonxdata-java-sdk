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
 * Global session is to accomodate all the custom properties that can be applicable for both coordinator and worker.
 */
public class PrestoEnginePropertiesGlobal extends GenericModel {

  @SerializedName("global_property")
  protected String globalProperty;

  /**
   * Builder.
   */
  public static class Builder {
    private String globalProperty;

    /**
     * Instantiates a new Builder from an existing PrestoEnginePropertiesGlobal instance.
     *
     * @param prestoEnginePropertiesGlobal the instance to initialize the Builder with
     */
    private Builder(PrestoEnginePropertiesGlobal prestoEnginePropertiesGlobal) {
      this.globalProperty = prestoEnginePropertiesGlobal.globalProperty;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEnginePropertiesGlobal.
     *
     * @return the new PrestoEnginePropertiesGlobal instance
     */
    public PrestoEnginePropertiesGlobal build() {
      return new PrestoEnginePropertiesGlobal(this);
    }

    /**
     * Set the globalProperty.
     *
     * @param globalProperty the globalProperty
     * @return the PrestoEnginePropertiesGlobal builder
     */
    public Builder globalProperty(String globalProperty) {
      this.globalProperty = globalProperty;
      return this;
    }
  }

  protected PrestoEnginePropertiesGlobal() { }

  protected PrestoEnginePropertiesGlobal(Builder builder) {
    globalProperty = builder.globalProperty;
  }

  /**
   * New builder.
   *
   * @return a PrestoEnginePropertiesGlobal builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the globalProperty.
   *
   * Global property settings.
   *
   * @return the globalProperty
   */
  public String globalProperty() {
    return globalProperty;
  }
}

