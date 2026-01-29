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
 * The engine properties to be removed which was added through api customisation.
 */
public class RemoveEngineProperties extends GenericModel {

  protected Map<String, RemoveEnginePropertiesCatalogAdditionalProperties> catalog;
  protected RemoveEnginePropertiesConfiguration configuration;
  @SerializedName("event_listener")
  protected List<String> eventListener;
  protected List<String> global;
  @SerializedName("jmx_exporter_config")
  protected List<String> jmxExporterConfig;
  protected RemoveEnginePropertiesJvm jvm;
  @SerializedName("log_config")
  protected RemoveEnginePropertiesLogConfig logConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, RemoveEnginePropertiesCatalogAdditionalProperties> catalog;
    private RemoveEnginePropertiesConfiguration configuration;
    private List<String> eventListener;
    private List<String> global;
    private List<String> jmxExporterConfig;
    private RemoveEnginePropertiesJvm jvm;
    private RemoveEnginePropertiesLogConfig logConfig;

    /**
     * Instantiates a new Builder from an existing RemoveEngineProperties instance.
     *
     * @param removeEngineProperties the instance to initialize the Builder with
     */
    private Builder(RemoveEngineProperties removeEngineProperties) {
      this.catalog = removeEngineProperties.catalog;
      this.configuration = removeEngineProperties.configuration;
      this.eventListener = removeEngineProperties.eventListener;
      this.global = removeEngineProperties.global;
      this.jmxExporterConfig = removeEngineProperties.jmxExporterConfig;
      this.jvm = removeEngineProperties.jvm;
      this.logConfig = removeEngineProperties.logConfig;
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
     * Adds a new element to eventListener.
     *
     * @param eventListener the new element to be added
     * @return the RemoveEngineProperties builder
     */
    public Builder addEventListener(String eventListener) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(eventListener,
        "eventListener cannot be null");
      if (this.eventListener == null) {
        this.eventListener = new ArrayList<String>();
      }
      this.eventListener.add(eventListener);
      return this;
    }

    /**
     * Adds a new element to global.
     *
     * @param global the new element to be added
     * @return the RemoveEngineProperties builder
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
     * Adds a new element to jmxExporterConfig.
     *
     * @param jmxExporterConfig the new element to be added
     * @return the RemoveEngineProperties builder
     */
    public Builder addJmxExporterConfig(String jmxExporterConfig) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(jmxExporterConfig,
        "jmxExporterConfig cannot be null");
      if (this.jmxExporterConfig == null) {
        this.jmxExporterConfig = new ArrayList<String>();
      }
      this.jmxExporterConfig.add(jmxExporterConfig);
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the RemoveEngineProperties builder
     */
    public Builder catalog(Map<String, RemoveEnginePropertiesCatalogAdditionalProperties> catalog) {
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
     * Set the eventListener.
     * Existing eventListener will be replaced.
     *
     * @param eventListener the eventListener
     * @return the RemoveEngineProperties builder
     */
    public Builder eventListener(List<String> eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the global.
     * Existing global will be replaced.
     *
     * @param global the global
     * @return the RemoveEngineProperties builder
     */
    public Builder global(List<String> global) {
      this.global = global;
      return this;
    }

    /**
     * Set the jmxExporterConfig.
     * Existing jmxExporterConfig will be replaced.
     *
     * @param jmxExporterConfig the jmxExporterConfig
     * @return the RemoveEngineProperties builder
     */
    public Builder jmxExporterConfig(List<String> jmxExporterConfig) {
      this.jmxExporterConfig = jmxExporterConfig;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the RemoveEngineProperties builder
     */
    public Builder jvm(RemoveEnginePropertiesJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the logConfig.
     *
     * @param logConfig the logConfig
     * @return the RemoveEngineProperties builder
     */
    public Builder logConfig(RemoveEnginePropertiesLogConfig logConfig) {
      this.logConfig = logConfig;
      return this;
    }
  }

  protected RemoveEngineProperties() { }

  protected RemoveEngineProperties(Builder builder) {
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
   * @return a RemoveEngineProperties builder
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
  public Map<String, RemoveEnginePropertiesCatalogAdditionalProperties> catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * RemoveEngine configuration properties.
   *
   * @return the configuration
   */
  public RemoveEnginePropertiesConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the eventListener.
   *
   * The event listener engine properties to be removed which was added through api customisation.
   *
   * @return the eventListener
   */
  public List<String> eventListener() {
    return eventListener;
  }

  /**
   * Gets the global.
   *
   * The global properties to be removed which was added through api customisation.
   *
   * @return the global
   */
  public List<String> global() {
    return global;
  }

  /**
   * Gets the jmxExporterConfig.
   *
   * The jm properties to be removed which was added through api customisation.
   *
   * @return the jmxExporterConfig
   */
  public List<String> jmxExporterConfig() {
    return jmxExporterConfig;
  }

  /**
   * Gets the jvm.
   *
   * JVM properties.
   *
   * @return the jvm
   */
  public RemoveEnginePropertiesJvm jvm() {
    return jvm;
  }

  /**
   * Gets the logConfig.
   *
   * Remove engine log configuration properties.
   *
   * @return the logConfig
   */
  public RemoveEnginePropertiesLogConfig logConfig() {
    return logConfig;
  }
}

