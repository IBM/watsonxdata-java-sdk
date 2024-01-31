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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Node details.
 */
public class PrestissimoNodeDescriptionBody extends GenericModel {

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
     * Instantiates a new Builder from an existing PrestissimoNodeDescriptionBody instance.
     *
     * @param prestissimoNodeDescriptionBody the instance to initialize the Builder with
     */
    private Builder(PrestissimoNodeDescriptionBody prestissimoNodeDescriptionBody) {
      this.nodeType = prestissimoNodeDescriptionBody.nodeType;
      this.quantity = prestissimoNodeDescriptionBody.quantity;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoNodeDescriptionBody.
     *
     * @return the new PrestissimoNodeDescriptionBody instance
     */
    public PrestissimoNodeDescriptionBody build() {
      return new PrestissimoNodeDescriptionBody(this);
    }

    /**
     * Set the nodeType.
     *
     * @param nodeType the nodeType
     * @return the PrestissimoNodeDescriptionBody builder
     */
    public Builder nodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    /**
     * Set the quantity.
     *
     * @param quantity the quantity
     * @return the PrestissimoNodeDescriptionBody builder
     */
    public Builder quantity(long quantity) {
      this.quantity = quantity;
      return this;
    }
  }

  protected PrestissimoNodeDescriptionBody() { }

  protected PrestissimoNodeDescriptionBody(Builder builder) {
    nodeType = builder.nodeType;
    quantity = builder.quantity;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoNodeDescriptionBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the nodeType.
   *
   * Node Type, r5, m, i..
   *
   * @return the nodeType
   */
  public String nodeType() {
    return nodeType;
  }

  /**
   * Gets the quantity.
   *
   * Number of nodes.
   *
   * @return the quantity
   */
  public Long quantity() {
    return quantity;
  }
}

