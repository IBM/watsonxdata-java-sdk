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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * JVM properties.
 */
public class RemoveEnginePropertiesPrestissimoOaiGenJvm extends GenericModel {

  protected List<String> coordinator;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> coordinator;

    /**
     * Instantiates a new Builder from an existing RemoveEnginePropertiesPrestissimoOaiGenJvm instance.
     *
     * @param removeEnginePropertiesPrestissimoOaiGenJvm the instance to initialize the Builder with
     */
    private Builder(RemoveEnginePropertiesPrestissimoOaiGenJvm removeEnginePropertiesPrestissimoOaiGenJvm) {
      this.coordinator = removeEnginePropertiesPrestissimoOaiGenJvm.coordinator;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RemoveEnginePropertiesPrestissimoOaiGenJvm.
     *
     * @return the new RemoveEnginePropertiesPrestissimoOaiGenJvm instance
     */
    public RemoveEnginePropertiesPrestissimoOaiGenJvm build() {
      return new RemoveEnginePropertiesPrestissimoOaiGenJvm(this);
    }

    /**
     * Adds a new element to coordinator.
     *
     * @param coordinator the new element to be added
     * @return the RemoveEnginePropertiesPrestissimoOaiGenJvm builder
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
     * Set the coordinator.
     * Existing coordinator will be replaced.
     *
     * @param coordinator the coordinator
     * @return the RemoveEnginePropertiesPrestissimoOaiGenJvm builder
     */
    public Builder coordinator(List<String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }
  }

  protected RemoveEnginePropertiesPrestissimoOaiGenJvm() { }

  protected RemoveEnginePropertiesPrestissimoOaiGenJvm(Builder builder) {
    coordinator = builder.coordinator;
  }

  /**
   * New builder.
   *
   * @return a RemoveEnginePropertiesPrestissimoOaiGenJvm builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * List of coordinator properties.
   *
   * @return the coordinator
   */
  public List<String> coordinator() {
    return coordinator;
  }
}

