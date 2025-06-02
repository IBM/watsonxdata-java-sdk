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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Engine properties.
 */
public class PrestissimoEngineEngineProperties extends GenericModel {

  protected PrestissimoPropertiesCatalog catalog;
  protected EnginePropertiesOaiGenConfiguration configuration;
  protected PrestissimoEnginePropertiesVelox velox;
  protected PrestissimoEnginePropertiesOaiGen1Jvm jvm;

  /**
   * Builder.
   */
  public static class Builder {
    private PrestissimoPropertiesCatalog catalog;
    private EnginePropertiesOaiGenConfiguration configuration;
    private PrestissimoEnginePropertiesVelox velox;
    private PrestissimoEnginePropertiesOaiGen1Jvm jvm;

    /**
     * Instantiates a new Builder from an existing PrestissimoEngineEngineProperties instance.
     *
     * @param prestissimoEngineEngineProperties the instance to initialize the Builder with
     */
    private Builder(PrestissimoEngineEngineProperties prestissimoEngineEngineProperties) {
      this.catalog = prestissimoEngineEngineProperties.catalog;
      this.configuration = prestissimoEngineEngineProperties.configuration;
      this.velox = prestissimoEngineEngineProperties.velox;
      this.jvm = prestissimoEngineEngineProperties.jvm;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestissimoEngineEngineProperties.
     *
     * @return the new PrestissimoEngineEngineProperties instance
     */
    public PrestissimoEngineEngineProperties build() {
      return new PrestissimoEngineEngineProperties(this);
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PrestissimoEngineEngineProperties builder
     */
    public Builder catalog(PrestissimoPropertiesCatalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the PrestissimoEngineEngineProperties builder
     */
    public Builder configuration(EnginePropertiesOaiGenConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the velox.
     *
     * @param velox the velox
     * @return the PrestissimoEngineEngineProperties builder
     */
    public Builder velox(PrestissimoEnginePropertiesVelox velox) {
      this.velox = velox;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the PrestissimoEngineEngineProperties builder
     */
    public Builder jvm(PrestissimoEnginePropertiesOaiGen1Jvm jvm) {
      this.jvm = jvm;
      return this;
    }
  }

  protected PrestissimoEngineEngineProperties() { }

  protected PrestissimoEngineEngineProperties(Builder builder) {
    catalog = builder.catalog;
    configuration = builder.configuration;
    velox = builder.velox;
    jvm = builder.jvm;
  }

  /**
   * New builder.
   *
   * @return a PrestissimoEngineEngineProperties builder
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
  public PrestissimoPropertiesCatalog catalog() {
    return catalog;
  }

  /**
   * Gets the configuration.
   *
   * Configuration settings for the engine properties.
   *
   * @return the configuration
   */
  public EnginePropertiesOaiGenConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the velox.
   *
   * velox settings.
   *
   * @return the velox
   */
  public PrestissimoEnginePropertiesVelox velox() {
    return velox;
  }

  /**
   * Gets the jvm.
   *
   * JVM settings.
   *
   * @return the jvm
   */
  public PrestissimoEnginePropertiesOaiGen1Jvm jvm() {
    return jvm;
  }
}

