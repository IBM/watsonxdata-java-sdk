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

package com.ibm.cloud.watsonx_data.watsonx_data.v3.model;

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EventListner Properties for Prestissimo.
 */
public class PrestissimoEnginePropertiesEventListner extends GenericModel {

  protected Map<String, String> coordinator;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> coordinator;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePropertiesEventListner instance.
     *
     * @param prestissimoEnginePropertiesEventListner the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePropertiesEventListner prestissimoEnginePropertiesEventListner) {
      this.coordinator = prestissimoEnginePropertiesEventListner.coordinator;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEnginePropertiesEventListner.
     *
     * @return the new PrestissimoEnginePropertiesEventListner instance
     */
    public PrestissimoEnginePropertiesEventListner build() {
      return new PrestissimoEnginePropertiesEventListner(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the PrestissimoEnginePropertiesEventListner builder
     */
    public Builder coordinator(Map<String, String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }
  }

  protected PrestissimoEnginePropertiesEventListner() { }

  protected PrestissimoEnginePropertiesEventListner(Builder builder) {
    coordinator = builder.coordinator;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEnginePropertiesEventListner builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * EventListner coordinator Properties of Prestissimo.
   *
   * @return the coordinator
   */
  public Map<String, String> coordinator() {
    return coordinator;
  }
}

