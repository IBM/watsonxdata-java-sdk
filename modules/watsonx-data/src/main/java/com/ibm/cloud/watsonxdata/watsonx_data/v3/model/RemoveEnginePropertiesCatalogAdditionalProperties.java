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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RemoveEnginePropertiesCatalogAdditionalProperties.
 */
public class RemoveEnginePropertiesCatalogAdditionalProperties extends GenericModel {

  protected List<String> coordinator;
  protected List<String> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> coordinator;
    private List<String> worker;

    /**
     * Instantiates a new Builder from an existing RemoveEnginePropertiesCatalogAdditionalProperties instance.
     *
     * @param removeEnginePropertiesCatalogAdditionalProperties the instance to initialize the Builder with
     */
    private Builder(RemoveEnginePropertiesCatalogAdditionalProperties removeEnginePropertiesCatalogAdditionalProperties) {
      this.coordinator = removeEnginePropertiesCatalogAdditionalProperties.coordinator;
      this.worker = removeEnginePropertiesCatalogAdditionalProperties.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RemoveEnginePropertiesCatalogAdditionalProperties.
     *
     * @return the new RemoveEnginePropertiesCatalogAdditionalProperties instance
     */
    public RemoveEnginePropertiesCatalogAdditionalProperties build() {
      return new RemoveEnginePropertiesCatalogAdditionalProperties(this);
    }

    /**
     * Adds a new element to coordinator.
     *
     * @param coordinator the new element to be added
     * @return the RemoveEnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder addCoordinator(String coordinator) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(coordinator,
        "coordinator cannot be null");
      if (this.coordinator == null) {
        this.coordinator = new ArrayList<String>();
      }
      this.coordinator.add(coordinator);
      return this;
    }

    /**
     * Adds a new element to worker.
     *
     * @param worker the new element to be added
     * @return the RemoveEnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder addWorker(String worker) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(worker,
        "worker cannot be null");
      if (this.worker == null) {
        this.worker = new ArrayList<String>();
      }
      this.worker.add(worker);
      return this;
    }

    /**
     * Set the coordinator.
     * Existing coordinator will be replaced.
     *
     * @param coordinator the coordinator
     * @return the RemoveEnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder coordinator(List<String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     * Existing worker will be replaced.
     *
     * @param worker the worker
     * @return the RemoveEnginePropertiesCatalogAdditionalProperties builder
     */
    public Builder worker(List<String> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected RemoveEnginePropertiesCatalogAdditionalProperties() { }

  protected RemoveEnginePropertiesCatalogAdditionalProperties(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a RemoveEnginePropertiesCatalogAdditionalProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * The catalog properties to be removed.
   *
   * @return the coordinator
   */
  public List<String> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * The catalog properties to be removed.
   *
   * @return the worker
   */
  public List<String> worker() {
    return worker;
  }
}

