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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.GsonSingleton;

/**
 * Engines associated to the driver.
 */
public class DriverRegistrationEnginePrototype extends GenericModel {

  protected List<String> engines;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> engines;

    /**
     * Instantiates a new Builder from an existing DriverRegistrationEnginePrototype instance.
     *
     * @param driverRegistrationEnginePrototype the instance to initialize the Builder with
     */
    private Builder(DriverRegistrationEnginePrototype driverRegistrationEnginePrototype) {
      this.engines = driverRegistrationEnginePrototype.engines;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DriverRegistrationEnginePrototype.
     *
     * @return the new DriverRegistrationEnginePrototype instance
     */
    public DriverRegistrationEnginePrototype build() {
      return new DriverRegistrationEnginePrototype(this);
    }

    /**
     * Adds a new element to engines.
     *
     * @param engines the new element to be added
     * @return the DriverRegistrationEnginePrototype builder
     */
    public Builder addEngines(String engines) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(engines,
        "engines cannot be null");
      if (this.engines == null) {
        this.engines = new ArrayList<String>();
      }
      this.engines.add(engines);
      return this;
    }

    /**
     * Set the engines.
     * Existing engines will be replaced.
     *
     * @param engines the engines
     * @return the DriverRegistrationEnginePrototype builder
     */
    public Builder engines(List<String> engines) {
      this.engines = engines;
      return this;
    }
  }

  protected DriverRegistrationEnginePrototype() { }

  protected DriverRegistrationEnginePrototype(Builder builder) {
    engines = builder.engines;
  }

  /**
   * New builder.
   *
   * @return a DriverRegistrationEnginePrototype builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engines.
   *
   * List of engine IDs.
   *
   * @return the engines
   */
  public List<String> engines() {
    return engines;
  }

  /**
   * Construct a JSON merge-patch from the DriverRegistrationEnginePrototype.
   *
   * Note that properties of the DriverRegistrationEnginePrototype with null values are not represented in the constructed
   * JSON merge-patch object, but can be explicitly set afterward to signify a property delete.
   *
   * @return a JSON merge-patch for the DriverRegistrationEnginePrototype
   */
  public Map<String, Object> asPatch() {
    return GsonSingleton.getGson().fromJson(this.toString(), Map.class);
  }
}

