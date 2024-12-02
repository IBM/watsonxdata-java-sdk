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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Configuration settings for the engine properties.
 */
public class EnginePropertiesOaiGenConfiguration extends GenericModel {

  protected PrestissimoNodeDescriptionBody coordinator;
  protected PrestissimoNodeDescriptionBody worker;

  /**
   * Builder.
   */
  public static class Builder {
    private PrestissimoNodeDescriptionBody coordinator;
    private PrestissimoNodeDescriptionBody worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesOaiGenConfiguration instance.
     *
     * @param enginePropertiesOaiGenConfiguration the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesOaiGenConfiguration enginePropertiesOaiGenConfiguration) {
      this.coordinator = enginePropertiesOaiGenConfiguration.coordinator;
      this.worker = enginePropertiesOaiGenConfiguration.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesOaiGenConfiguration.
     *
     * @return the new EnginePropertiesOaiGenConfiguration instance
     */
    public EnginePropertiesOaiGenConfiguration build() {
      return new EnginePropertiesOaiGenConfiguration(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesOaiGenConfiguration builder
     */
    public Builder coordinator(PrestissimoNodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesOaiGenConfiguration builder
     */
    public Builder worker(PrestissimoNodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesOaiGenConfiguration() { }

  protected EnginePropertiesOaiGenConfiguration(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesOaiGenConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * coordinator/worker property settings.
   *
   * @return the coordinator
   */
  public PrestissimoNodeDescriptionBody coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * coordinator/worker property settings.
   *
   * @return the worker
   */
  public PrestissimoNodeDescriptionBody worker() {
    return worker;
  }
}

