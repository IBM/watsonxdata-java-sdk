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
 * JVM configuration properties for coordinator and worker nodes.
 */
public class JvmProperties extends GenericModel {

  protected Map<String, String> coordinator;
  protected Map<String, String> worker;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, String> coordinator;
    private Map<String, String> worker;

    /**
     * Instantiates a new Builder from an existing JvmProperties instance.
     *
     * @param jvmProperties the instance to initialize the Builder with
     */
    private Builder(JvmProperties jvmProperties) {
      this.coordinator = jvmProperties.coordinator;
      this.worker = jvmProperties.worker;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a JvmProperties.
     *
     * @return the new JvmProperties instance
     */
    public JvmProperties build() {
      return new JvmProperties(this);
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the JvmProperties builder
     */
    public Builder coordinator(Map<String, String> coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the JvmProperties builder
     */
    public Builder worker(Map<String, String> worker) {
      this.worker = worker;
      return this;
    }
  }

  protected JvmProperties() { }

  protected JvmProperties(Builder builder) {
    coordinator = builder.coordinator;
    worker = builder.worker;
  }

  /**
   * New builder.
   *
   * @return a JvmProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the coordinator.
   *
   * JVM properties for coordinator node.
   *
   * @return the coordinator
   */
  public Map<String, String> coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * JVM properties for worker nodes.
   *
   * @return the worker
   */
  public Map<String, String> worker() {
    return worker;
  }
}

