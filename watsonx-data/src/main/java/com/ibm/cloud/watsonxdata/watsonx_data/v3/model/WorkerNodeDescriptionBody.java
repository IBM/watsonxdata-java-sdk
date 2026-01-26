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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Presto engine configurations.
 */
public class WorkerNodeDescriptionBody extends GenericModel {

  @SerializedName("node_type")
  protected String nodeType;
  protected Long quantity;

  /**
   * Builder.
   */
  public static class Builder {
    private String nodeType;
    private Long quantity;

    /**
     * Instantiates a new Builder from an existing WorkerNodeDescriptionBody instance.
     *
     * @param workerNodeDescriptionBody the instance to initialize the Builder with
     */
    private Builder(WorkerNodeDescriptionBody workerNodeDescriptionBody) {
      this.nodeType = workerNodeDescriptionBody.nodeType;
      this.quantity = workerNodeDescriptionBody.quantity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param nodeType the nodeType
     * @param quantity the quantity
     */
    public Builder(String nodeType, Long quantity) {
      this.nodeType = nodeType;
      this.quantity = quantity;
    }

    /**
     * Builds a WorkerNodeDescriptionBody.
     *
     * @return the new WorkerNodeDescriptionBody instance
     */
    public WorkerNodeDescriptionBody build() {
      return new WorkerNodeDescriptionBody(this);
    }

    /**
     * Set the nodeType.
     *
     * @param nodeType the nodeType
     * @return the WorkerNodeDescriptionBody builder
     */
    public Builder nodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    /**
     * Set the quantity.
     *
     * @param quantity the quantity
     * @return the WorkerNodeDescriptionBody builder
     */
    public Builder quantity(long quantity) {
      this.quantity = quantity;
      return this;
    }
  }

  protected WorkerNodeDescriptionBody() { }

  protected WorkerNodeDescriptionBody(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nodeType,
      "nodeType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.quantity,
      "quantity cannot be null");
    nodeType = builder.nodeType;
    quantity = builder.quantity;
  }

  /**
   * New builder.
   *
   * @return a WorkerNodeDescriptionBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the nodeType.
   *
   * Presto engine worker node type.
   *
   * @return the nodeType
   */
  public String nodeType() {
    return nodeType;
  }

  /**
   * Gets the quantity.
   *
   * Quantity of presto engine nodes.
   *
   * @return the quantity
   */
  public Long quantity() {
    return quantity;
  }
}

