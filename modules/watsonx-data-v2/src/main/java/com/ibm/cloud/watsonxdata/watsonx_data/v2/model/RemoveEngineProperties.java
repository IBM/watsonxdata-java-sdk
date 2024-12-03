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
 * RemoveEngine properties.
 */
public class RemoveEngineProperties extends GenericModel {

  protected PrestissimoEnginePropertiesCatalog catalog;
  protected RemoveEnginePropertiesConfiguration configuration;
  protected RemoveEnginePropertiesPrestissimoOaiGenJvm jvm;
  protected List<String> velox;

  /**
   * Builder.
   */
  public static class Builder {
    private PrestissimoEnginePropertiesCatalog catalog;
    private RemoveEnginePropertiesConfiguration configuration;
    private RemoveEnginePropertiesPrestissimoOaiGenJvm jvm;
    private List<String> velox;

    /**
     * Instantiates a new Builder from an existing RemoveEngineProperties instance.
     *
     * @param removeEngineProperties the instance to initialize the Builder with
     */
    private Builder(RemoveEngineProperties removeEngineProperties) {
      this.catalog = removeEngineProperties.catalog;
      this.configuration = removeEngineProperties.configuration;
      this.jvm = removeEngineProperties.jvm;
      this.velox = removeEngineProperties.velox;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RemoveEngineProperties.
     *
     * @return the new RemoveEngineProperties instance
     */
    public RemoveEngineProperties build() {
      return new RemoveEngineProperties(this);
    }

    /**
     * Adds a new element to velox.
     *
     * @param velox the new element to be added
     * @return the RemoveEngineProperties builder
     */
    public Builder addVelox(String velox) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(velox,
        "velox cannot be null");
      if (this.velox == null) {
        this.velox = new ArrayList<String>();
      }
      this.velox.add(velox);
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the RemoveEngineProperties builder
     */
    public Builder catalog(PrestissimoEnginePropertiesCatalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the RemoveEngineProperties builder
     */
    public Builder configuration(RemoveEnginePropertiesConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the RemoveEngineProperties builder
     */
    public Builder jvm(RemoveEnginePropertiesPrestissimoOaiGenJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the velox.
     * Existing velox will be replaced.
     *
     * @param velox the velox
     * @return the RemoveEngineProperties builder
     */
    public Builder velox(List<String> velox) {
      this.velox = velox;
      return this;
    }
  }

  protected RemoveEngineProperties() { }

  protected RemoveEngineProperties(Builder builder) {
    catalog = builder.catalog;
    configuration = builder.configuration;
    jvm = builder.jvm;
    velox = builder.velox;
  }

  /**
   * New builder.
   *
   * @return a RemoveEngineProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * Catalog settings.
   *
   * @return the catalog
   */
  public PrestissimoEnginePropertiesCatalog catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * remove engine properties configuration.
   *
   * @return the configuration
   */
  public RemoveEnginePropertiesConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the jvm.
   *
   * JVM properties.
   *
   * @return the jvm
   */
  public RemoveEnginePropertiesPrestissimoOaiGenJvm jvm() {
    return jvm;
  }

  /**
   * Gets the velox.
   *
   * velox description.
   *
   * @return the velox
   */
  public List<String> velox() {
    return velox;
  }
}

