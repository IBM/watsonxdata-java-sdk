/*
 * (C) Copyright IBM Corp. 2025.
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

/**
 * Configuration settings.
 */
public class EnginePropertiesOaiGen1Configuration extends GenericModel {

  protected Map<String, String> coordinator;
  protected Map<String, String> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> coordinator;
    private Map<String, String> worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesOaiGen1Configuration instance.
     *
     * @param enginePropertiesOaiGen1Configuration the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesOaiGen1Configuration enginePropertiesOaiGen1Configuration) {
      this.coordinator = enginePropertiesOaiGen1Configuration.coordinator;
      this.worker = enginePropertiesOaiGen1Configuration.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesOaiGen1Configuration.
     *
     * @return the new EnginePropertiesOaiGen1Configuration instance
     */
    public EnginePropertiesOaiGen1Configuration build() {
      return new EnginePropertiesOaiGen1Configuration(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesOaiGen1Configuration builder
     */
    public Builder coordinator(Map<String, String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesOaiGen1Configuration builder
     */
    public Builder worker(Map<String, String> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesOaiGen1Configuration() { }

  protected EnginePropertiesOaiGen1Configuration(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesOaiGen1Configuration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * Coordinator/ worker properties.
   *
   * @return the coordinator
   */
  public Map<String, String> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Coordinator/ worker properties.
   *
   * @return the worker
   */
  public Map<String, String> worker() {
    return worker;
  }
}

