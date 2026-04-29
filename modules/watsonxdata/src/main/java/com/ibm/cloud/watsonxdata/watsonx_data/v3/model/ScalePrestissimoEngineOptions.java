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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The scalePrestissimoEngine options.
 */
public class ScalePrestissimoEngineOptions extends GenericModel {

  protected String id;
  protected NodeDescription coordinator;
  protected NodeDescription worker;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private NodeDescription coordinator;
    private NodeDescription worker;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ScalePrestissimoEngineOptions instance.
     *
     * @param scalePrestissimoEngineOptions the instance to initialize the Builder with
     */
    private Builder(ScalePrestissimoEngineOptions scalePrestissimoEngineOptions) {
      this.id = scalePrestissimoEngineOptions.id;
      this.coordinator = scalePrestissimoEngineOptions.coordinator;
      this.worker = scalePrestissimoEngineOptions.worker;
      this.authInstanceId = scalePrestissimoEngineOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ScalePrestissimoEngineOptions.
     *
     * @return the new ScalePrestissimoEngineOptions instance
     */
    public ScalePrestissimoEngineOptions build() {
      return new ScalePrestissimoEngineOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ScalePrestissimoEngineOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the coordinator.
     *
     * @param coordinator the coordinator
     * @return the ScalePrestissimoEngineOptions builder
     */
    public Builder coordinator(NodeDescription coordinator) {
      this.coordinator = coordinator;
      return this;
    }

    /**
     * Set the worker.
     *
     * @param worker the worker
     * @return the ScalePrestissimoEngineOptions builder
     */
    public Builder worker(NodeDescription worker) {
      this.worker = worker;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ScalePrestissimoEngineOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ScalePrestissimoEngineOptions() { }

  protected ScalePrestissimoEngineOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    coordinator = builder.coordinator;
    worker = builder.worker;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ScalePrestissimoEngineOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * engine id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the coordinator.
   *
   * Presto engine configurations.
   *
   * @return the coordinator
   */
  public NodeDescription coordinator() {
    return coordinator;
  }

  /**
   * Gets the worker.
   *
   * Presto engine configurations.
   *
   * @return the worker
   */
  public NodeDescription worker() {
    return worker;
  }

  /**
   * Gets the authInstanceId.
   *
   * watsonx.data instance ID for software , CRN for SAAS.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

