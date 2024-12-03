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
 * Spark instance scale configuration.
 */
public class SparkScaleConfig extends GenericModel {

  @SerializedName("auto_scale_enabled")
  protected Boolean autoScaleEnabled;
  @SerializedName("current_number_of_nodes")
  protected Long currentNumberOfNodes;
  @SerializedName("maximum_number_of_nodes")
  protected Long maximumNumberOfNodes;
  @SerializedName("minimum_number_of_nodes")
  protected Long minimumNumberOfNodes;
  @SerializedName("node_type")
  protected String nodeType;
  @SerializedName("number_of_nodes")
  protected Long numberOfNodes;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean autoScaleEnabled;
    private Long currentNumberOfNodes;
    private Long maximumNumberOfNodes;
    private Long minimumNumberOfNodes;
    private String nodeType;
    private Long numberOfNodes;

    /**
     * Instantiates a new Builder from an existing SparkScaleConfig instance.
     *
     * @param sparkScaleConfig the instance to initialize the Builder with
     */
    private Builder(SparkScaleConfig sparkScaleConfig) {
      this.autoScaleEnabled = sparkScaleConfig.autoScaleEnabled;
      this.currentNumberOfNodes = sparkScaleConfig.currentNumberOfNodes;
      this.maximumNumberOfNodes = sparkScaleConfig.maximumNumberOfNodes;
      this.minimumNumberOfNodes = sparkScaleConfig.minimumNumberOfNodes;
      this.nodeType = sparkScaleConfig.nodeType;
      this.numberOfNodes = sparkScaleConfig.numberOfNodes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SparkScaleConfig.
     *
     * @return the new SparkScaleConfig instance
     */
    public SparkScaleConfig build() {
      return new SparkScaleConfig(this);
    }

    /**
     * Set the autoScaleEnabled.
     *
     * @param autoScaleEnabled the autoScaleEnabled
     * @return the SparkScaleConfig builder
     */
    public Builder autoScaleEnabled(Boolean autoScaleEnabled) {
      this.autoScaleEnabled = autoScaleEnabled;
      return this;
    }

    /**
     * Set the currentNumberOfNodes.
     *
     * @param currentNumberOfNodes the currentNumberOfNodes
     * @return the SparkScaleConfig builder
     */
    public Builder currentNumberOfNodes(long currentNumberOfNodes) {
      this.currentNumberOfNodes = currentNumberOfNodes;
      return this;
    }

    /**
     * Set the maximumNumberOfNodes.
     *
     * @param maximumNumberOfNodes the maximumNumberOfNodes
     * @return the SparkScaleConfig builder
     */
    public Builder maximumNumberOfNodes(long maximumNumberOfNodes) {
      this.maximumNumberOfNodes = maximumNumberOfNodes;
      return this;
    }

    /**
     * Set the minimumNumberOfNodes.
     *
     * @param minimumNumberOfNodes the minimumNumberOfNodes
     * @return the SparkScaleConfig builder
     */
    public Builder minimumNumberOfNodes(long minimumNumberOfNodes) {
      this.minimumNumberOfNodes = minimumNumberOfNodes;
      return this;
    }

    /**
     * Set the nodeType.
     *
     * @param nodeType the nodeType
     * @return the SparkScaleConfig builder
     */
    public Builder nodeType(String nodeType) {
      this.nodeType = nodeType;
      return this;
    }

    /**
     * Set the numberOfNodes.
     *
     * @param numberOfNodes the numberOfNodes
     * @return the SparkScaleConfig builder
     */
    public Builder numberOfNodes(long numberOfNodes) {
      this.numberOfNodes = numberOfNodes;
      return this;
    }
  }

  protected SparkScaleConfig() { }

  protected SparkScaleConfig(Builder builder) {
    autoScaleEnabled = builder.autoScaleEnabled;
    currentNumberOfNodes = builder.currentNumberOfNodes;
    maximumNumberOfNodes = builder.maximumNumberOfNodes;
    minimumNumberOfNodes = builder.minimumNumberOfNodes;
    nodeType = builder.nodeType;
    numberOfNodes = builder.numberOfNodes;
  }

  /**
   * New builder.
   *
   * @return a SparkScaleConfig builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the autoScaleEnabled.
   *
   * Enable/disable autoscaling.
   *
   * @return the autoScaleEnabled
   */
  public Boolean autoScaleEnabled() {
    return autoScaleEnabled;
  }

  /**
   * Gets the currentNumberOfNodes.
   *
   * Current node count.
   *
   * @return the currentNumberOfNodes
   */
  public Long currentNumberOfNodes() {
    return currentNumberOfNodes;
  }

  /**
   * Gets the maximumNumberOfNodes.
   *
   * Maximum node count.
   *
   * @return the maximumNumberOfNodes
   */
  public Long maximumNumberOfNodes() {
    return maximumNumberOfNodes;
  }

  /**
   * Gets the minimumNumberOfNodes.
   *
   * Minimum node count.
   *
   * @return the minimumNumberOfNodes
   */
  public Long minimumNumberOfNodes() {
    return minimumNumberOfNodes;
  }

  /**
   * Gets the nodeType.
   *
   * Spark instance node type.
   *
   * @return the nodeType
   */
  public String nodeType() {
    return nodeType;
  }

  /**
   * Gets the numberOfNodes.
   *
   * Node count.
   *
   * @return the numberOfNodes
   */
  public Long numberOfNodes() {
    return numberOfNodes;
  }
}

