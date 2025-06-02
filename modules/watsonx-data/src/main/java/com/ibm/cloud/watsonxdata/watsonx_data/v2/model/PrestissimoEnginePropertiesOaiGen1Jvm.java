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
 * JVM settings.
 */
public class PrestissimoEnginePropertiesOaiGen1Jvm extends GenericModel {

  protected Map<String, String> coordinator;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> coordinator;

    /**
     * Instantiates a new Builder from an existing PrestissimoEnginePropertiesOaiGen1Jvm instance.
     *
     * @param prestissimoEnginePropertiesOaiGen1Jvm the instance to initialize the Builder with
     */
    private Builder(PrestissimoEnginePropertiesOaiGen1Jvm prestissimoEnginePropertiesOaiGen1Jvm) {
      this.coordinator = prestissimoEnginePropertiesOaiGen1Jvm.coordinator;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEnginePropertiesOaiGen1Jvm.
     *
     * @return the new PrestissimoEnginePropertiesOaiGen1Jvm instance
     */
    public PrestissimoEnginePropertiesOaiGen1Jvm build() {
      return new PrestissimoEnginePropertiesOaiGen1Jvm(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the PrestissimoEnginePropertiesOaiGen1Jvm builder
     */
    public Builder coordinator(Map<String, String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }
  }

  protected PrestissimoEnginePropertiesOaiGen1Jvm() { }

  protected PrestissimoEnginePropertiesOaiGen1Jvm(Builder builder) {
    coordinator = builder.coordinator;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEnginePropertiesOaiGen1Jvm builder
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
}

