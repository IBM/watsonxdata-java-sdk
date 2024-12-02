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
 * JVM settings.
 */
public class EnginePropertiesOaiGen1Jvm extends GenericModel {

  protected NodeDescriptionBody coordinator;
  protected NodeDescriptionBody worker;

  /**
   * Builder.
   */
  public static class Builder {
    private NodeDescriptionBody coordinator;
    private NodeDescriptionBody worker;

    /**
     * Instantiates a new Builder from an existing EnginePropertiesOaiGen1Jvm instance.
     *
     * @param enginePropertiesOaiGen1Jvm the instance to initialize the Builder with
     */
    private Builder(EnginePropertiesOaiGen1Jvm enginePropertiesOaiGen1Jvm) {
      this.coordinator = enginePropertiesOaiGen1Jvm.coordinator;
      this.worker = enginePropertiesOaiGen1Jvm.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnginePropertiesOaiGen1Jvm.
     *
     * @return the new EnginePropertiesOaiGen1Jvm instance
     */
    public EnginePropertiesOaiGen1Jvm build() {
      return new EnginePropertiesOaiGen1Jvm(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the EnginePropertiesOaiGen1Jvm builder
     */
    public Builder coordinator(NodeDescriptionBody coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the EnginePropertiesOaiGen1Jvm builder
     */
    public Builder worker(NodeDescriptionBody worker) {
      this.worker = worker;
      return this;
    }
  }

  protected EnginePropertiesOaiGen1Jvm() { }

  protected EnginePropertiesOaiGen1Jvm(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a EnginePropertiesOaiGen1Jvm builder
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

