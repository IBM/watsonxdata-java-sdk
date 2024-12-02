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
 * Engine properties.
 */
public class PrestoEngineEngineProperties extends GenericModel {

  protected PrestoEnginePropertiesCatalog catalog;
  protected EnginePropertiesOaiGen1Configuration configuration;
  @SerializedName("event_listener")
  protected PrestoEnginePropertiesEventListener eventListener;
  protected PrestoEnginePropertiesGlobal global;
  protected EnginePropertiesOaiGen1Jvm jvm;
  @SerializedName("log_config")
  protected EnginePropertiesLogConfiguration logConfig;

  /**
   * Builder.
   */
  public static class Builder {
    private PrestoEnginePropertiesCatalog catalog;
    private EnginePropertiesOaiGen1Configuration configuration;
    private PrestoEnginePropertiesEventListener eventListener;
    private PrestoEnginePropertiesGlobal global;
    private EnginePropertiesOaiGen1Jvm jvm;
    private EnginePropertiesLogConfiguration logConfig;

    /**
     * Instantiates a new Builder from an existing PrestoEngineEngineProperties instance.
     *
     * @param prestoEngineEngineProperties the instance to initialize the Builder with
     */
    private Builder(PrestoEngineEngineProperties prestoEngineEngineProperties) {
      this.catalog = prestoEngineEngineProperties.catalog;
      this.configuration = prestoEngineEngineProperties.configuration;
      this.eventListener = prestoEngineEngineProperties.eventListener;
      this.global = prestoEngineEngineProperties.global;
      this.jvm = prestoEngineEngineProperties.jvm;
      this.logConfig = prestoEngineEngineProperties.logConfig;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEngineEngineProperties.
     *
     * @return the new PrestoEngineEngineProperties instance
     */
    public PrestoEngineEngineProperties build() {
      return new PrestoEngineEngineProperties(this);
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PrestoEngineEngineProperties builder
     */
    public Builder catalog(PrestoEnginePropertiesCatalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the PrestoEngineEngineProperties builder
     */
    public Builder configuration(EnginePropertiesOaiGen1Configuration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the eventListener.
     *
     * @param eventListener the eventListener
     * @return the PrestoEngineEngineProperties builder
     */
    public Builder eventListener(PrestoEnginePropertiesEventListener eventListener) {
      this.eventListener = eventListener;
      return this;
    }

    /**
     * Set the global.
     *
     * @param global the global
     * @return the PrestoEngineEngineProperties builder
     */
    public Builder global(PrestoEnginePropertiesGlobal global) {
      this.global = global;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the PrestoEngineEngineProperties builder
     */
    public Builder jvm(EnginePropertiesOaiGen1Jvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the logConfig.
     *
     * @param logConfig the logConfig
     * @return the PrestoEngineEngineProperties builder
     */
    public Builder logConfig(EnginePropertiesLogConfiguration logConfig) {
      this.logConfig = logConfig;
      return this;
    }
  }

  protected PrestoEngineEngineProperties() { }

  protected PrestoEngineEngineProperties(Builder builder) {
    catalog = builder.catalog;
    configuration = builder.configuration;
    eventListener = builder.eventListener;
    global = builder.global;
    jvm = builder.jvm;
    logConfig = builder.logConfig;
  }

  /**
   * New builder.
   *
   * @return a PrestoEngineEngineProperties builder
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
  public PrestoEnginePropertiesCatalog catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * Configuration settings.
   *
   * @return the configuration
   */
  public EnginePropertiesOaiGen1Configuration configuration() {
    return configuration;
  }

  /**
   * Gets the eventListener.
   *
   * Event Listener settings.
   *
   * @return the eventListener
   */
  public PrestoEnginePropertiesEventListener eventListener() {
    return eventListener;
  }

  /**
   * Gets the global.
   *
   * Global session is to accomodate all the custom properties that can be applicable for both coordinator and worker.
   *
   * @return the global
   */
  public PrestoEnginePropertiesGlobal global() {
    return global;
  }

  /**
   * Gets the jvm.
   *
   * JVM settings.
   *
   * @return the jvm
   */
  public EnginePropertiesOaiGen1Jvm jvm() {
    return jvm;
  }

  /**
   * Gets the logConfig.
   *
   * Log Configuration settings.
   *
   * @return the logConfig
   */
  public EnginePropertiesLogConfiguration logConfig() {
    return logConfig;
  }
}

