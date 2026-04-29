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
 * Complete Presto engine configuration properties.
 */
public class PrestoEngineProperties extends GenericModel {

  protected Map<String, CatalogProperties> catalog;
  protected ConfigurationProperties configuration;
  @SerializedName("event_listener")
  protected Map<String, String> eventListener;
  protected Map<String, String> global;
  @SerializedName("jmx_exporter_config")
  protected Map<String, String> jmxExporterConfig;
  protected JvmProperties jvm;
  @SerializedName("log_config")
  protected LogConfigProperties logConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, CatalogProperties> catalog;
    private ConfigurationProperties configuration;
    private Map<String, String> eventListener;
    private Map<String, String> global;
    private Map<String, String> jmxExporterConfig;
    private JvmProperties jvm;
    private LogConfigProperties logConfig;

    /**
     * Instantiates a new Builder from an existing PrestoEngineProperties instance.
     *
     * @param prestoEngineProperties the instance to initialize the Builder with
     */
    private Builder(PrestoEngineProperties prestoEngineProperties) {
      this.catalog = prestoEngineProperties.catalog;
      this.configuration = prestoEngineProperties.configuration;
      this.eventListener = prestoEngineProperties.eventListener;
      this.global = prestoEngineProperties.global;
      this.jmxExporterConfig = prestoEngineProperties.jmxExporterConfig;
      this.jvm = prestoEngineProperties.jvm;
      this.logConfig = prestoEngineProperties.logConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEngineProperties.
     *
     * @return the new PrestoEngineProperties instance
     */
    public PrestoEngineProperties build() {
      return new PrestoEngineProperties(this);
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PrestoEngineProperties builder
     */
    public Builder catalog(Map<String, CatalogProperties> catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the PrestoEngineProperties builder
     */
    public Builder configuration(ConfigurationProperties configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the PrestoEngineProperties builder
     */
    public Builder eventListener(Map<String, String> eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the PrestoEngineProperties builder
     */
    public Builder global(Map<String, String> global) {
      this.global = global;
      return this;
    }

    /**
     * Set the jmxExporterConfig.
     *
     * @param jmxExporterConfig the jmxExporterConfig
     * @return the PrestoEngineProperties builder
     */
    public Builder jmxExporterConfig(Map<String, String> jmxExporterConfig) {
      this.jmxExporterConfig = jmxExporterConfig;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the PrestoEngineProperties builder
     */
    public Builder jvm(JvmProperties jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the logConfig.
     *
     * @param logConfig the logConfig
     * @return the PrestoEngineProperties builder
     */
    public Builder logConfig(LogConfigProperties logConfig) {
      this.logConfig = logConfig;
      return this;
    }
  }

  protected PrestoEngineProperties() { }

  protected PrestoEngineProperties(Builder builder) {
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
   * @return a PrestoEngineProperties builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalog.
   *
   * Catalog configurations mapped by catalog name.
   *
   * @return the catalog
   */
  public Map<String, CatalogProperties> catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * General configuration properties.
   *
   * @return the configuration
   */
  public ConfigurationProperties configuration() {
    return configuration;
  }

  /**
   * Gets the eventListener.
   *
   * Event listener configuration properties.
   *
   * @return the eventListener
   */
  public Map<String, String> eventListener() {
    return eventListener;
  }

  /**
   * Gets the global.
   *
   * Global configuration properties.
   *
   * @return the global
   */
  public Map<String, String> global() {
    return global;
  }

  /**
   * Gets the jmxExporterConfig.
   *
   * JMX exporter configuration properties.
   *
   * @return the jmxExporterConfig
   */
  public Map<String, String> jmxExporterConfig() {
    return jmxExporterConfig;
  }

  /**
   * Gets the jvm.
   *
   * JVM configuration properties.
   *
   * @return the jvm
   */
  public JvmProperties jvm() {
    return jvm;
  }

  /**
   * Gets the logConfig.
   *
   * Logging configuration properties.
   *
   * @return the logConfig
   */
  public LogConfigProperties logConfig() {
    return logConfig;
  }
}

