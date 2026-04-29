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
 * Capacity Details.
 */
public class CapacityDetails extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing CapacityDetails instance.
     *
     * @param capacityDetails the instance to initialize the Builder with
     */
    private Builder(CapacityDetails capacityDetails) {
      this.id = capacityDetails.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CapacityDetails.
     *
     * @return the new CapacityDetails instance
     */
    public CapacityDetails build() {
      return new CapacityDetails(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CapacityDetails builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected CapacityDetails() { }

  protected CapacityDetails(Builder builder) {
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a CapacityDetails builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * Capacity ID for given spark engine.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

