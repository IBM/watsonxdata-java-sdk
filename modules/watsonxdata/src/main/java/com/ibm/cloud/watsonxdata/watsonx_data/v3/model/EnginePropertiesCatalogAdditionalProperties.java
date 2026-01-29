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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine Catalog properties.
 */
public class EnginePropertiesCatalogAdditionalProperties extends GenericModel {

  protected Map<String, Object> coordinator;
  protected Map<String, Object> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> coordinator;
    private Map<String, Object> worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesCatalogAdditionalProperties instance.
     *
     * @param enginePropertiesCatalogAdditionalProperties the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesCatalogAdditionalProperties enginePropertiesCatalogAdditionalProperties) {
      this.coordinator = enginePropertiesCatalogAdditionalProperties.coordinator;
      this.worker = enginePropertiesCatalogAdditionalProperties.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesCatalogAdditionalProperties.
     *
     * @return the new EnginePropertiesCatalogAdditionalProperties instance
     */
    public EnginePropertiesCatalogAdditionalProperties build() {
      return new EnginePropertiesCatalogAdditionalProperties(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder coordinator(Map<String, Object> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder worker(Map<String, Object> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesCatalogAdditionalProperties() { }

  protected EnginePropertiesCatalogAdditionalProperties(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesCatalogAdditionalProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * Engine Catalog coordinator properties.
   *
   * @return the coordinator
   */
  public Map<String, Object> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Engine Catalog worker properties.
   *
   * @return the worker
   */
  public Map<String, Object> worker() {
    return worker;
  }
}

