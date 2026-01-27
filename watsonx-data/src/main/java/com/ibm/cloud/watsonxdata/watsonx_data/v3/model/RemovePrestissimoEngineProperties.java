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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RemoveEngine properties.
 */
public class RemovePrestissimoEngineProperties extends GenericModel {

  protected Map<String, RemovePrestissimoEnginePropertiesCatalogAdditionalProperties> catalog;
  protected RemovePrestissimoEnginePropertiesConfiguration configuration;
  protected List<String> global;
  protected RemovePrestissimoEnginePropertiesJvm jvm;
  @SerializedName("log_config")
  protected RemovePrestissimoEnginePropertiesLogConfig logConfig;
  @SerializedName("optimizer_properties")
  protected List<String> optimizerProperties;
  protected List<String> velox;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, RemovePrestissimoEnginePropertiesCatalogAdditionalProperties> catalog;
    private RemovePrestissimoEnginePropertiesConfiguration configuration;
    private List<String> global;
    private RemovePrestissimoEnginePropertiesJvm jvm;
    private RemovePrestissimoEnginePropertiesLogConfig logConfig;
    private List<String> optimizerProperties;
    private List<String> velox;

    /**
     * Instantiates a new Builder from an existing RemovePrestissimoEngineProperties instance.
     *
     * @param removePrestissimoEngineProperties the instance to initialize the Builder with
     */
    private Builder(RemovePrestissimoEngineProperties removePrestissimoEngineProperties) {
      this.catalog = removePrestissimoEngineProperties.catalog;
      this.configuration = removePrestissimoEngineProperties.configuration;
      this.global = removePrestissimoEngineProperties.global;
      this.jvm = removePrestissimoEngineProperties.jvm;
      this.logConfig = removePrestissimoEngineProperties.logConfig;
      this.optimizerProperties = removePrestissimoEngineProperties.optimizerProperties;
      this.velox = removePrestissimoEngineProperties.velox;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RemovePrestissimoEngineProperties.
     *
     * @return the new RemovePrestissimoEngineProperties instance
     */
    public RemovePrestissimoEngineProperties build() {
      return new RemovePrestissimoEngineProperties(this);
    }

    /**
     * Adds a new element to global.
     *
     * @param global the new element to be added
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder addGlobal(String global) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(global,
        "global cannot be null");
      if (this.global == null) {
        this.global = new ArrayList<String>();
      }
      this.global.add(global);
      return this;
    }

    /**
     * Adds a new element to optimizerProperties.
     *
     * @param optimizerProperties the new element to be added
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder addOptimizerProperties(String optimizerProperties) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(optimizerProperties,
        "optimizerProperties cannot be null");
      if (this.optimizerProperties == null) {
        this.optimizerProperties = new ArrayList<String>();
      }
      this.optimizerProperties.add(optimizerProperties);
      return this;
    }

    /**
     * Adds a new element to velox.
     *
     * @param velox the new element to be added
     * @return the RemovePrestissimoEngineProperties builder
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
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder catalog(Map<String, RemovePrestissimoEnginePropertiesCatalogAdditionalProperties> catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder configuration(RemovePrestissimoEnginePropertiesConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the global.
     * Existing global will be replaced.
     *
     * @param global the global
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder global(List<String> global) {
      this.global = global;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder jvm(RemovePrestissimoEnginePropertiesJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the logConfig.
     *
     * @param logConfig the logConfig
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder logConfig(RemovePrestissimoEnginePropertiesLogConfig logConfig) {
      this.logConfig = logConfig;
      return this;
    }

    /**
     * Set the optimizerProperties.
     * Existing optimizerProperties will be replaced.
     *
     * @param optimizerProperties the optimizerProperties
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder optimizerProperties(List<String> optimizerProperties) {
      this.optimizerProperties = optimizerProperties;
      return this;
    }

    /**
     * Set the velox.
     * Existing velox will be replaced.
     *
     * @param velox the velox
     * @return the RemovePrestissimoEngineProperties builder
     */
    public Builder velox(List<String> velox) {
      this.velox = velox;
      return this;
    }
  }

  protected RemovePrestissimoEngineProperties() { }

  protected RemovePrestissimoEngineProperties(Builder builder) {
    catalog = builder.catalog;
    configuration = builder.configuration;
    global = builder.global;
    jvm = builder.jvm;
    logConfig = builder.logConfig;
    optimizerProperties = builder.optimizerProperties;
    velox = builder.velox;
  }

  /**
   * New builder.
   *
   * @return a RemovePrestissimoEngineProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * Catalog properties with dynamic catalog names.
   *
   * @return the catalog
   */
  public Map<String, RemovePrestissimoEnginePropertiesCatalogAdditionalProperties> catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * Configuration properties of prestissimo that should be removed.
   *
   * @return the configuration
   */
  public RemovePrestissimoEnginePropertiesConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the global.
   *
   * Global properties of prestissimo that should be removed.
   *
   * @return the global
   */
  public List<String> global() {
    return global;
  }

  /**
   * Gets the jvm.
   *
   * JVM properties of prestissimo that should be removed.
   *
   * @return the jvm
   */
  public RemovePrestissimoEnginePropertiesJvm jvm() {
    return jvm;
  }

  /**
   * Gets the logConfig.
   *
   * LogConfig properties of prestissimo that should be removed.
   *
   * @return the logConfig
   */
  public RemovePrestissimoEnginePropertiesLogConfig logConfig() {
    return logConfig;
  }

  /**
   * Gets the optimizerProperties.
   *
   * Optimizer properties of prestissimo that should be removed.
   *
   * @return the optimizerProperties
   */
  public List<String> optimizerProperties() {
    return optimizerProperties;
  }

  /**
   * Gets the velox.
   *
   * Velox properties of prestissimo that should be removed.
   *
   * @return the velox
   */
  public List<String> velox() {
    return velox;
  }
}

