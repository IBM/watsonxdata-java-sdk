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
 * Engine Logconfig properties.
 */
public class EnginePropertiesLogConfig extends GenericModel {

  protected Map<String, String> coordinator;
  protected Map<String, String> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> coordinator;
    private Map<String, String> worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesLogConfig instance.
     *
     * @param enginePropertiesLogConfig the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesLogConfig enginePropertiesLogConfig) {
      this.coordinator = enginePropertiesLogConfig.coordinator;
      this.worker = enginePropertiesLogConfig.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesLogConfig.
     *
     * @return the new EnginePropertiesLogConfig instance
     */
    public EnginePropertiesLogConfig build() {
      return new EnginePropertiesLogConfig(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesLogConfig builder
     */
    public Builder coordinator(Map<String, String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesLogConfig builder
     */
    public Builder worker(Map<String, String> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesLogConfig() { }

  protected EnginePropertiesLogConfig(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesLogConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * Engine Logconfig coordinator properties.
   *
   * @return the coordinator
   */
  public Map<String, String> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Engine Logconfig worker properties.
   *
   * @return the worker
   */
  public Map<String, String> worker() {
    return worker;
  }
}

