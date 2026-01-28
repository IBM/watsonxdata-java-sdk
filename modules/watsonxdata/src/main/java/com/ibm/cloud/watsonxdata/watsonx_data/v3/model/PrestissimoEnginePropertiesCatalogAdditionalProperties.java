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
 * PrestissimoEnginePropertiesCatalogAdditionalProperties.
 */
public class PrestissimoEnginePropertiesCatalogAdditionalProperties extends GenericModel {

  protected Map<String, Object> coordinator;
  protected Map<String, Object> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> coordinator;
    private Map<String, Object> worker;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePropertiesCatalogAdditionalProperties instance.
     *
     * @param prestissimoEnginePropertiesCatalogAdditionalProperties the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePropertiesCatalogAdditionalProperties prestissimoEnginePropertiesCatalogAdditionalProperties) {
      this.coordinator = prestissimoEnginePropertiesCatalogAdditionalProperties.coordinator;
      this.worker = prestissimoEnginePropertiesCatalogAdditionalProperties.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEnginePropertiesCatalogAdditionalProperties.
     *
     * @return the new PrestissimoEnginePropertiesCatalogAdditionalProperties instance
     */
    public PrestissimoEnginePropertiesCatalogAdditionalProperties build() {
      return new PrestissimoEnginePropertiesCatalogAdditionalProperties(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the PrestissimoEnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder coordinator(Map<String, Object> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the PrestissimoEnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder worker(Map<String, Object> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected PrestissimoEnginePropertiesCatalogAdditionalProperties() { }

  protected PrestissimoEnginePropertiesCatalogAdditionalProperties(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEnginePropertiesCatalogAdditionalProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * Coordinator Properties for Prestissimo.
   *
   * @return the coordinator
   */
  public Map<String, Object> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Worker Properties for Prestissimo.
   *
   * @return the worker
   */
  public Map<String, Object> worker() {
    return worker;
  }
}

