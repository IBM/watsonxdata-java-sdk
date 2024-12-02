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
 * Event Listener settings.
 */
public class PrestoEnginePropertiesEventListener extends GenericModel {

  @SerializedName("event_listener_property")
  protected String eventListenerProperty;

  /**
   * Builder.
   */
  public static class Builder {
    private String eventListenerProperty;

    /**
     * Instantiates a new Builder from an existing PrestoEnginePropertiesEventListener instance.
     *
     * @param prestoEnginePropertiesEventListener the instance to initialize the Builder with
     */
    private Builder(PrestoEnginePropertiesEventListener prestoEnginePropertiesEventListener) {
      this.eventListenerProperty = prestoEnginePropertiesEventListener.eventListenerProperty;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PrestoEnginePropertiesEventListener.
     *
     * @return the new PrestoEnginePropertiesEventListener instance
     */
    public PrestoEnginePropertiesEventListener build() {
      return new PrestoEnginePropertiesEventListener(this);
    }

    /**
     * Set the eventListenerProperty.
     *
     * @param eventListenerProperty the eventListenerProperty
     * @return the PrestoEnginePropertiesEventListener builder
     */
    public Builder eventListenerProperty(String eventListenerProperty) {
      this.eventListenerProperty = eventListenerProperty;
      return this;
    }
  }

  protected PrestoEnginePropertiesEventListener() { }

  protected PrestoEnginePropertiesEventListener(Builder builder) {
    eventListenerProperty = builder.eventListenerProperty;
  }

  /**
   * New builder.
   *
   * @return a PrestoEnginePropertiesEventListener builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the eventListenerProperty.
   *
   * Event listener properties.
   *
   * @return the eventListenerProperty
   */
  public String eventListenerProperty() {
    return eventListenerProperty;
  }
}

