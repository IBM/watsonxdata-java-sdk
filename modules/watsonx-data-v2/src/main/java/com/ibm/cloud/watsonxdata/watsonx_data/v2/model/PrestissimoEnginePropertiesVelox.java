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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * velox settings.
 */
public class PrestissimoEnginePropertiesVelox extends GenericModel {

  @SerializedName("velox_property")
  protected List<String> veloxProperty;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> veloxProperty;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePropertiesVelox instance.
     *
     * @param prestissimoEnginePropertiesVelox the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePropertiesVelox prestissimoEnginePropertiesVelox) {
      this.veloxProperty = prestissimoEnginePropertiesVelox.veloxProperty;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEnginePropertiesVelox.
     *
     * @return the new PrestissimoEnginePropertiesVelox instance
     */
    public PrestissimoEnginePropertiesVelox build() {
      return new PrestissimoEnginePropertiesVelox(this);
    }

    /**
     * Adds a new element to veloxProperty.
     *
     * @param veloxProperty the new element to be added
     * @return the PrestissimoEnginePropertiesVelox builder
     */
    public Builder addVeloxProperty(String veloxProperty) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(veloxProperty,
        "veloxProperty cannot be null");
      if (this.veloxProperty == null) {
        this.veloxProperty = new ArrayList<String>();
      }
      this.veloxProperty.add(veloxProperty);
      return this;
    }

    /**
     * Set the veloxProperty.
     * Existing veloxProperty will be replaced.
     *
     * @param veloxProperty the veloxProperty
     * @return the PrestissimoEnginePropertiesVelox builder
     */
    public Builder veloxProperty(List<String> veloxProperty) {
      this.veloxProperty = veloxProperty;
      return this;
    }
  }

  protected PrestissimoEnginePropertiesVelox() { }

  protected PrestissimoEnginePropertiesVelox(Builder builder) {
    veloxProperty = builder.veloxProperty;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEnginePropertiesVelox builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the veloxProperty.
   *
   * velox property.
   *
   * @return the veloxProperty
   */
  public List<String> veloxProperty() {
    return veloxProperty;
  }
}

