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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Log Configuration settings.
 */
public class EnginePropertiesLogConfiguration extends GenericModel {

  protected NodeDescriptionBody coordinator;
  protected NodeDescriptionBody worker;

  /**
   * Builder.
   */
  public static class Builder {
    private NodeDescriptionBody coordinator;
    private NodeDescriptionBody worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesLogConfiguration instance.
     *
     * @param enginePropertiesLogConfiguration the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesLogConfiguration enginePropertiesLogConfiguration) {
      this.coordinator = enginePropertiesLogConfiguration.coordinator;
      this.worker = enginePropertiesLogConfiguration.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesLogConfiguration.
     *
     * @return the new EnginePropertiesLogConfiguration instance
     */
    public EnginePropertiesLogConfiguration build() {
      return new EnginePropertiesLogConfiguration(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesLogConfiguration builder
     */
    public Builder coordinator(NodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesLogConfiguration builder
     */
    public Builder worker(NodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesLogConfiguration() { }

  protected EnginePropertiesLogConfiguration(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesLogConfiguration builder
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
  public NodeDescriptionBody coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Coordinator/ worker properties.
   *
   * @return the worker
   */
  public NodeDescriptionBody worker() {
    return worker;
  }
}

