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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RemoveEngine properties.
 */
public class PrestoEnginePatchRemoveEngineProperties extends GenericModel {

  protected PrestoEnginePropertiesCatalog catalog;
  protected RemoveEnginePropertiesOaiGenConfiguration configuration;
  protected RemoveEnginePropertiesOaiGenJvm jvm;
  @SerializedName("event_listener")
  protected List<String> eventListener;

  /**
   * Builder.
   */
  public static class Builder {
    private PrestoEnginePropertiesCatalog catalog;
    private RemoveEnginePropertiesOaiGenConfiguration configuration;
    private RemoveEnginePropertiesOaiGenJvm jvm;
    private List<String> eventListener;

    /**
     * Instantiates a new Builder from an existing PrestoEnginePatchRemoveEngineProperties instance.
     *
     * @param prestoEnginePatchRemoveEngineProperties the instance to initialize the Builder with
     */
    private Builder(PrestoEnginePatchRemoveEngineProperties prestoEnginePatchRemoveEngineProperties) {
      this.catalog = prestoEnginePatchRemoveEngineProperties.catalog;
      this.configuration = prestoEnginePatchRemoveEngineProperties.configuration;
      this.jvm = prestoEnginePatchRemoveEngineProperties.jvm;
      this.eventListener = prestoEnginePatchRemoveEngineProperties.eventListener;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEnginePatchRemoveEngineProperties.
     *
     * @return the new PrestoEnginePatchRemoveEngineProperties instance
     */
    public PrestoEnginePatchRemoveEngineProperties build() {
      return new PrestoEnginePatchRemoveEngineProperties(this);
    }

    /**
     * Adds a new element to eventListener.
     *
     * @param eventListener the new element to be added
     * @return the PrestoEnginePatchRemoveEngineProperties builder
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
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder catalog(PrestoEnginePropertiesCatalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the configuration.
     *
     * @param configuration the configuration
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder configuration(RemoveEnginePropertiesOaiGenConfiguration configuration) {
      this.configuration = configuration;
      return this;
    }

    /**
     * Set the jvm.
     *
     * @param jvm the jvm
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder jvm(RemoveEnginePropertiesOaiGenJvm jvm) {
      this.jvm = jvm;
      return this;
    }

    /**
     * Set the eventListener.
     * Existing eventListener will be replaced.
     *
     * @param eventListener the eventListener
     * @return the PrestoEnginePatchRemoveEngineProperties builder
     */
    public Builder eventListener(List<String> eventListener) {
      this.eventListener = eventListener;
      return this;
    }
  }

  protected PrestoEnginePatchRemoveEngineProperties() { }

  protected PrestoEnginePatchRemoveEngineProperties(Builder builder) {
    catalog = builder.catalog;
    configuration = builder.configuration;
    jvm = builder.jvm;
    eventListener = builder.eventListener;
  }

  /**
   * New builder.
   *
   * @return a PrestoEnginePatchRemoveEngineProperties builder
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
   * Configuration settings for removing engine properties.
   *
   * @return the configuration
   */
  public RemoveEnginePropertiesOaiGenConfiguration configuration() {
    return configuration;
  }

  /**
   * Gets the jvm.
   *
   * JVM properties.
   *
   * @return the jvm
   */
  public RemoveEnginePropertiesOaiGenJvm jvm() {
    return jvm;
  }

  /**
   * Gets the eventListener.
   *
   * Event Listener properties.
   *
   * @return the eventListener
   */
  public List<String> eventListener() {
    return eventListener;
  }
}

