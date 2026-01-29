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
public class EngineProperties extends GenericModel {

  protected Map<String, EnginePropertiesCatalogAdditionalProperties> catalog;
  protected EnginePropertiesConfiguration configuration;
  @SerializedName("event_listener")
  protected Map<String, String> eventListener;
  protected Map<String, String> global;
  @SerializedName("jmx_exporter_config")
  protected Map<String, String> jmxExporterConfig;
  protected EnginePropertiesJvm jvm;
  @SerializedName("log_config")
  protected EnginePropertiesLogConfig logConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, EnginePropertiesCatalogAdditionalProperties> catalog;
    private EnginePropertiesConfiguration configuration;
    private Map<String, String> eventListener;
    private Map<String, String> global;
    private Map<String, String> jmxExporterConfig;
    private EnginePropertiesJvm jvm;
    private EnginePropertiesLogConfig logConfig;

    /**
     * Instantiates a new Builder from an existing EngineProperties instance.
     *
     * @param engineProperties the instance to initialize the Builder with
     */
    private Builder(EngineProperties engineProperties) {
      this.catalog = engineProperties.catalog;
      this.configuration = engineProperties.configuration;
      this.eventListener = engineProperties.eventListener;
      this.global = engineProperties.global;
      this.jmxExporterConfig = engineProperties.jmxExporterConfig;
      this.jvm = engineProperties.jvm;
      this.logConfig = engineProperties.logConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EngineProperties.
     *
     * @return the new EngineProperties instance
     */
    public EngineProperties build() {
      return new EngineProperties(this);
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the EngineProperties builder
     */
    public Builder catalog(Map<String, EnginePropertiesCatalogAdditionalProperties> catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the EngineProperties builder
     */
    public Builder configuration(EnginePropertiesConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the EngineProperties builder
     */
    public Builder eventListener(Map<String, String> eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the EngineProperties builder
     */
    public Builder global(Map<String, String> global) {
      this.global = global;
      return this;
    }

    /**
     * Set the jmxExporterConfig.
     *
     * @param jmxExporterConfig the jmxExporterConfig
     * @return the EngineProperties builder
     */
    public Builder jmxExporterConfig(Map<String, String> jmxExporterConfig) {
      this.jmxExporterConfig = jmxExporterConfig;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the EngineProperties builder
     */
    public Builder jvm(EnginePropertiesJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the logConfig.
     *
     * @param logConfig the logConfig
     * @return the EngineProperties builder
     */
    public Builder logConfig(EnginePropertiesLogConfig logConfig) {
      this.logConfig = logConfig;
      return this;
    }
  }

  protected EngineProperties() { }

  protected EngineProperties(Builder builder) {
    catalog = builder.catalog;
    configuration = builder.configuration;
    eventListener = builder.eventListener;
    global = builder.global;
    jmxExporterConfig = builder.jmxExporterConfig;
    jvm = builder.jvm;
    logConfig = builder.logConfig;
  }

  /**
   * New builder.
   *
   * @return a EngineProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * Engine Catalog properties.
   *
   * @return the catalog
   */
  public Map<String, EnginePropertiesCatalogAdditionalProperties> catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * Engine configuration properties.
   *
   * @return the configuration
   */
  public EnginePropertiesConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the eventListener.
   *
   * Event listener engine properties.
   *
   * @return the eventListener
   */
  public Map<String, String> eventListener() {
    return eventListener;
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
   * Gets the jmxExporterConfig.
   *
   * JMX engine properties.
   *
   * @return the jmxExporterConfig
   */
  public Map<String, String> jmxExporterConfig() {
    return jmxExporterConfig;
  }

  /**
   * Gets the jvm.
   *
   * Engine JVM properties.
   *
   * @return the jvm
   */
  public EnginePropertiesJvm jvm() {
    return jvm;
  }

  /**
   * Gets the logConfig.
   *
   * Engine Logconfig properties.
   *
   * @return the logConfig
   */
  public EnginePropertiesLogConfig logConfig() {
    return logConfig;
  }
}

