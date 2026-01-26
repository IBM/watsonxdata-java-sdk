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
 * Engine configuration properties.
 */
public class EnginePropertiesConfiguration extends GenericModel {

  protected Map<String, String> coordinator;
  protected Map<String, String> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> coordinator;
    private Map<String, String> worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesConfiguration instance.
     *
     * @param enginePropertiesConfiguration the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesConfiguration enginePropertiesConfiguration) {
      this.coordinator = enginePropertiesConfiguration.coordinator;
      this.worker = enginePropertiesConfiguration.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesConfiguration.
     *
     * @return the new EnginePropertiesConfiguration instance
     */
    public EnginePropertiesConfiguration build() {
      return new EnginePropertiesConfiguration(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesConfiguration builder
     */
    public Builder coordinator(Map<String, String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesConfiguration builder
     */
    public Builder worker(Map<String, String> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesConfiguration() { }

  protected EnginePropertiesConfiguration(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * Engine configuration coordinator properties.
   *
   * @return the coordinator
   */
  public Map<String, String> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Engine configuration worker properties.
   *
   * @return the worker
   */
  public Map<String, String> worker() {
    return worker;
  }
}

