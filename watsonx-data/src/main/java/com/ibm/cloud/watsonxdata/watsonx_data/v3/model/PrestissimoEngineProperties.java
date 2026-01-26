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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine properties.
 */
public class PrestissimoEngineProperties extends GenericModel {

  protected Map<String, PrestissimoEnginePropertiesCatalogAdditionalProperties> catalog;
  protected PrestissimoEnginePropertiesConfiguration configuration;
  protected Map<String, String> global;
  protected PrestissimoEnginePropertiesJvm jvm;
  @SerializedName("log_config")
  protected PrestissimoEnginePropertiesLogConfig logConfig;
  @SerializedName("optimizer_properties")
  protected Map<String, String> optimizerProperties;
  protected Map<String, String> velox;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, PrestissimoEnginePropertiesCatalogAdditionalProperties> catalog;
    private PrestissimoEnginePropertiesConfiguration configuration;
    private Map<String, String> global;
    private PrestissimoEnginePropertiesJvm jvm;
    private PrestissimoEnginePropertiesLogConfig logConfig;
    private Map<String, String> optimizerProperties;
    private Map<String, String> velox;

    /**
     * Instantiates a new Builder from an existing PrestissimoEngineProperties instance.
     *
     * @param prestissimoEngineProperties the instance to initialize the Builder with
     */
    private Builder(PrestissimoEngineProperties prestissimoEngineProperties) {
      this.catalog = prestissimoEngineProperties.catalog;
      this.configuration = prestissimoEngineProperties.configuration;
      this.global = prestissimoEngineProperties.global;
      this.jvm = prestissimoEngineProperties.jvm;
      this.logConfig = prestissimoEngineProperties.logConfig;
      this.optimizerProperties = prestissimoEngineProperties.optimizerProperties;
      this.velox = prestissimoEngineProperties.velox;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEngineProperties.
     *
     * @return the new PrestissimoEngineProperties instance
     */
    public PrestissimoEngineProperties build() {
      return new PrestissimoEngineProperties(this);
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PrestissimoEngineProperties builder
     */
    public Builder catalog(Map<String, PrestissimoEnginePropertiesCatalogAdditionalProperties> catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the PrestissimoEngineProperties builder
     */
    public Builder configuration(PrestissimoEnginePropertiesConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the PrestissimoEngineProperties builder
     */
    public Builder global(Map<String, String> global) {
      this.global = global;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the PrestissimoEngineProperties builder
     */
    public Builder jvm(PrestissimoEnginePropertiesJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the logConfig.
     *
     * @param logConfig the logConfig
     * @return the PrestissimoEngineProperties builder
     */
    public Builder logConfig(PrestissimoEnginePropertiesLogConfig logConfig) {
      this.logConfig = logConfig;
      return this;
    }

    /**
     * Set the optimizerProperties.
     *
     * @param optimizerProperties the optimizerProperties
     * @return the PrestissimoEngineProperties builder
     */
    public Builder optimizerProperties(Map<String, String> optimizerProperties) {
      this.optimizerProperties = optimizerProperties;
      return this;
    }

    /**
     * Set the velox.
     *
     * @param velox the velox
     * @return the PrestissimoEngineProperties builder
     */
    public Builder velox(Map<String, String> velox) {
      this.velox = velox;
      return this;
    }
  }

  protected PrestissimoEngineProperties() { }

  protected PrestissimoEngineProperties(Builder builder) {
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
   * @return a PrestissimoEngineProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * Catalog Properties for Prestissimo.
   *
   * @return the catalog
   */
  public Map<String, PrestissimoEnginePropertiesCatalogAdditionalProperties> catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * Engine Properties for Prestissimo.
   *
   * @return the configuration
   */
  public PrestissimoEnginePropertiesConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the global.
   *
   * Global engine properties.
   *
   * @return the global
   */
  public Map<String, String> global() {
    return global;
  }

  /**
   * Gets the jvm.
   *
   * JVM Properties for Prestissimo.
   *
   * @return the jvm
   */
  public PrestissimoEnginePropertiesJvm jvm() {
    return jvm;
  }

  /**
   * Gets the logConfig.
   *
   * LogConfig Properties for Prestissimo.
   *
   * @return the logConfig
   */
  public PrestissimoEnginePropertiesLogConfig logConfig() {
    return logConfig;
  }

  /**
   * Gets the optimizerProperties.
   *
   * Optimizer engine properties.
   *
   * @return the optimizerProperties
   */
  public Map<String, String> optimizerProperties() {
    return optimizerProperties;
  }

  /**
   * Gets the velox.
   *
   * Velox Properties.
   *
   * @return the velox
   */
  public Map<String, String> velox() {
    return velox;
  }
}

